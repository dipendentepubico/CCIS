### CCIS (Ciccio Cappuccio Interexchange Service)

#### Scenario
Enti pubblici omologhi svolgono stesse procedure ma con software di diversi fornitori non integrati tra loro.  
Dato che i fornitori sono concorrenti ma gli Enti no, sono possibili due soluzioni:
- Software di Stato
- Interfacce di Stato tra software di vendor differenti

Lo Stato non si occupa di realizzare il primo o di definire le seconde a meno di rare eccezioni (anpr, opi, sdi).  
Gli Enti si limitano ad acquistare pacchetti software senza imporre nel capitolato di gara l'integrazione con i software esistenti e futuri.  

#### Obiettivo
Questo progetto si pone l'obiettivo di mitigare il vendor locking favorendo l'interoperabilità tra i software in modo che ogni ente possa scegliere il migliore per lo specifico ambito.
Si tratta di endpoint SOAP che effettuano solo ed esclusivamente select sui database proprietari ma non implementano altre istruzioni DML e nemmeno DDL o DCL.  
E' importante in primo luogo rendere disponibili la più grande quantità possibile di informazioni _corrette_. Successivamente si proseguirà con le ottimizzazioni. 

#### Architettura
I progetti sono i seguenti:
- BOM [Bill Of Materials](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#bill-of-materials-bom-poms)
- Parent. Semplice progetto per compilare tutti i moduli sottostanti.
- Domain. Classi che modellano il dominio generate da xjc con jaxb2-maven-plugin a partire dagli xsd. Alcuni domini sono già modellati (es. fattura elettronica/sdi) quindi agli schema ufficiali è stata inserita l'operazione sql da effettuare come attributo **op**.
- UseCase. La business logic che 
  1) genera la query HQL a partire dalle classi model usando il mapping di Adapter-Vendor; 
  2) richiama il repository inviando la query; 
  3) restituisce il risultato.  
  Qui sono definite le interfacce verso i repository implementati dai Vendor-${adapter}
- Converter. Progetto con le classi che si occupano delle conversioni tra livelli dei progetti. Ogni progetto ha il proprio mapping definito nei file.
```
classpath*:it/dipendentepubico/CCIS/converter/dozer/*mappings.xml
```
- Service. Servizio Spring Boot che espone gli endpoint e demanda la business logic a UseCase.
- Adapter-${Vendor}. Implementazione specifica del database del vendor. Effettua le query HQL ed il mapping tra le entity Hibernate e le classi model (utilizzando Converter). Il file Xml2HQLMapping.yaml mappa gli xpath della request con gli oggetti Hibernate.

Endpoint servizi http://localhost:8080/ws
WSDL
- http://localhost:8080/ws/fattureElettroniche.wsdl
- http://localhost:8080/ws/mandati.wsdl


#### ESEMPI
data la request che ricerca la fattura con sdi=544
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ccis="https://dipendentepubico.it/ccis" xmlns:xd="http://www.w3.org/2000/09/xmldsig#">
    <soapenv:Header/>
    <soapenv:Body>
        <ccis:fatturaElettronicaRequest>
            <ccis:or>
                <ccis:fattura>
                    <ccis:identificativo_sdi op="eq">544</ccis:identificativo_sdi>
                </ccis:fattura>
            </ccis:or>
            <ccis:paging>
                <ccis:offset>0</ccis:offset>
                <ccis:page_size>10</ccis:page_size>
            </ccis:paging>
        </ccis:fatturaElettronicaRequest>
    </soapenv:Body>
</soapenv:Envelope>
```

ed il mapping
configurando il file resources/
```yaml
requestMap:
  fatturaElettronicaRequest:
    fromMap: FelDACImportFattureEntity
    pathToInfo:
      fattura.identificativo_sdi:
        hname: theEntity.flusso.identificativoSdi
        htype: integer
      fattura.fattura_elettronica.FatturaElettronicaBody.DatiGenerali.DatiGeneraliDocumento.Numero:
        hname: theEntity.numero
        htype: string

```

ottengo la query HQL
```
FROM FelDACImportFattureEntity as theEntity  WHERE 1=1  OR (  theEntity.flusso.identificativoSdi  =  544 OR 1=1 )
```

e la response
```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP-ENV:Header/>
   <SOAP-ENV:Body>
      <ns2:fatturaElettronicaResponse xmlns:ns2="https://dipendentepubico.it/ccis" xmlns:ns4="http://www.w3.org/2000/09/xmldsig#">
         <ns2:fattura>
            <ns2:identificativo_sdi>544</ns2:identificativo_sdi>
         </ns2:fattura>
      </ns2:fatturaElettronicaResponse>
   </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

#### Compilazione
In fase di compilazione indicare il profilo Maven del vendor. In questo modo viene definita la dipendenza da Adapter-${vendor} e vengono eseguiti i test con il mapping relativo.  
Compilare Domain con il profilo generate_classes per rigenerare le classi model dagli schema xsd.

#### TODO
- verificare il mapping della proiezione visto il livello in più es. MandatiNomi -> Mandato -> Codice
- gestione errori
- liquibase per test vendor-adapter-database
- aggiungere attributo op ad altri tipi della fattura elettronica es. String10Type sia per elemento che per attriuto
- maven archetype per i vendor plugin
- swagger for soap

#### Contribuisci
Puoi contribuire scrivendo codice o esponendo soluzioni, fornendo indicazioni sulle implementazioni dei vari vendor.
Le pull request sono benvenute. Assicurati di creare i test relativi alle nuove implementazioni.

#### Licenza
GNU Affero General Public License v3.0	agpl-3.0