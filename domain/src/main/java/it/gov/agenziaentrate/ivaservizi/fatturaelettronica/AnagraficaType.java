
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Il campo Denominazione è in alternativa ai campi Nome e Cognome
 * 
 * <p>Java class for AnagraficaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnagraficaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Denominazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String80LatinType"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Nome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/&gt;
 *             &lt;element name="Cognome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Titolo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TitoloType" minOccurs="0"/&gt;
 *         &lt;element name="CodEORI" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodEORIType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnagraficaType", propOrder = {
    "denominazione",
    "nome",
    "cognome",
    "titolo",
    "codEORI"
})
public class AnagraficaType {

    @XmlElement(name = "Denominazione")
    protected String80LatinType denominazione;
    @XmlElement(name = "Nome")
    protected String60LatinType nome;
    @XmlElement(name = "Cognome")
    protected String60LatinType cognome;
    @XmlElement(name = "Titolo")
    protected TitoloType titolo;
    @XmlElement(name = "CodEORI")
    protected String codEORI;

    /**
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String80LatinType }
     *     
     */
    public String80LatinType getDenominazione() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String80LatinType }
     *     
     */
    public void setDenominazione(String80LatinType value) {
        this.denominazione = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setNome(String60LatinType value) {
        this.nome = value;
    }

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setCognome(String60LatinType value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the titolo property.
     * 
     * @return
     *     possible object is
     *     {@link TitoloType }
     *     
     */
    public TitoloType getTitolo() {
        return titolo;
    }

    /**
     * Sets the value of the titolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitoloType }
     *     
     */
    public void setTitolo(TitoloType value) {
        this.titolo = value;
    }

    /**
     * Gets the value of the codEORI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEORI() {
        return codEORI;
    }

    /**
     * Sets the value of the codEORI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEORI(String value) {
        this.codEORI = value;
    }

}
