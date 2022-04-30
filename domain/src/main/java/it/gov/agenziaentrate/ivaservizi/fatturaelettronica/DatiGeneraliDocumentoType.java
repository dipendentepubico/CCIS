
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiGeneraliDocumentoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiGeneraliDocumentoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoDocumento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TipoDocumentoType"/&gt;
 *         &lt;element name="Divisa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DivisaType"/&gt;
 *         &lt;element name="Data" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DataFatturaType"/&gt;
 *         &lt;element name="Numero" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/&gt;
 *         &lt;element name="DatiRitenuta" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiRitenutaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DatiBollo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiBolloType" minOccurs="0"/&gt;
 *         &lt;element name="DatiCassaPrevidenziale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiCassaPrevidenzialeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScontoMaggiorazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ScontoMaggiorazioneType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ImportoTotaleDocumento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="Arrotondamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="Causale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String200LatinType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Art73" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Art73Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiGeneraliDocumentoType", propOrder = {
    "tipoDocumento",
    "divisa",
    "data",
    "numero",
    "datiRitenuta",
    "datiBollo",
    "datiCassaPrevidenziale",
    "scontoMaggiorazione",
    "importoTotaleDocumento",
    "arrotondamento",
    "causale",
    "art73"
})
public class DatiGeneraliDocumentoType {

    @XmlElement(name = "TipoDocumento", required = true)
    @XmlSchemaType(name = "string")
    protected TipoDocumentoType tipoDocumento;
    @XmlElement(name = "Divisa", required = true)
    protected String divisa;
    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "Numero", required = true)
    protected String20Type numero;
    @XmlElement(name = "DatiRitenuta")
    protected List<DatiRitenutaType> datiRitenuta;
    @XmlElement(name = "DatiBollo")
    protected DatiBolloType datiBollo;
    @XmlElement(name = "DatiCassaPrevidenziale")
    protected List<DatiCassaPrevidenzialeType> datiCassaPrevidenziale;
    @XmlElement(name = "ScontoMaggiorazione")
    protected List<ScontoMaggiorazioneType> scontoMaggiorazione;
    @XmlElement(name = "ImportoTotaleDocumento")
    protected Amount2DecimalType importoTotaleDocumento;
    @XmlElement(name = "Arrotondamento")
    protected Amount2DecimalType arrotondamento;
    @XmlElement(name = "Causale")
    protected List<String200LatinType> causale;
    @XmlElement(name = "Art73")
    @XmlSchemaType(name = "string")
    protected Art73Type art73;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoType }
     *     
     */
    public TipoDocumentoType getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoType }
     *     
     */
    public void setTipoDocumento(TipoDocumentoType value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the divisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisa() {
        return divisa;
    }

    /**
     * Sets the value of the divisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisa(String value) {
        this.divisa = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String20Type }
     *     
     */
    public String20Type getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Type }
     *     
     */
    public void setNumero(String20Type value) {
        this.numero = value;
    }

    /**
     * Gets the value of the datiRitenuta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datiRitenuta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatiRitenuta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatiRitenutaType }
     * 
     * 
     */
    public List<DatiRitenutaType> getDatiRitenuta() {
        if (datiRitenuta == null) {
            datiRitenuta = new ArrayList<DatiRitenutaType>();
        }
        return this.datiRitenuta;
    }

    /**
     * Gets the value of the datiBollo property.
     * 
     * @return
     *     possible object is
     *     {@link DatiBolloType }
     *     
     */
    public DatiBolloType getDatiBollo() {
        return datiBollo;
    }

    /**
     * Sets the value of the datiBollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiBolloType }
     *     
     */
    public void setDatiBollo(DatiBolloType value) {
        this.datiBollo = value;
    }

    /**
     * Gets the value of the datiCassaPrevidenziale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datiCassaPrevidenziale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatiCassaPrevidenziale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatiCassaPrevidenzialeType }
     * 
     * 
     */
    public List<DatiCassaPrevidenzialeType> getDatiCassaPrevidenziale() {
        if (datiCassaPrevidenziale == null) {
            datiCassaPrevidenziale = new ArrayList<DatiCassaPrevidenzialeType>();
        }
        return this.datiCassaPrevidenziale;
    }

    /**
     * Gets the value of the scontoMaggiorazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scontoMaggiorazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScontoMaggiorazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScontoMaggiorazioneType }
     * 
     * 
     */
    public List<ScontoMaggiorazioneType> getScontoMaggiorazione() {
        if (scontoMaggiorazione == null) {
            scontoMaggiorazione = new ArrayList<ScontoMaggiorazioneType>();
        }
        return this.scontoMaggiorazione;
    }

    /**
     * Gets the value of the importoTotaleDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    /**
     * Sets the value of the importoTotaleDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setImportoTotaleDocumento(Amount2DecimalType value) {
        this.importoTotaleDocumento = value;
    }

    /**
     * Gets the value of the arrotondamento property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getArrotondamento() {
        return arrotondamento;
    }

    /**
     * Sets the value of the arrotondamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setArrotondamento(Amount2DecimalType value) {
        this.arrotondamento = value;
    }

    /**
     * Gets the value of the causale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCausale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String200LatinType }
     * 
     * 
     */
    public List<String200LatinType> getCausale() {
        if (causale == null) {
            causale = new ArrayList<String200LatinType>();
        }
        return this.causale;
    }

    /**
     * Gets the value of the art73 property.
     * 
     * @return
     *     possible object is
     *     {@link Art73Type }
     *     
     */
    public Art73Type getArt73() {
        return art73;
    }

    /**
     * Sets the value of the art73 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Art73Type }
     *     
     */
    public void setArt73(Art73Type value) {
        this.art73 = value;
    }

}
