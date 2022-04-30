
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndirizzoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndirizzoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Indirizzo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/&gt;
 *         &lt;element name="NumeroCivico" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NumeroCivicoType" minOccurs="0"/&gt;
 *         &lt;element name="CAP" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CAPType"/&gt;
 *         &lt;element name="Comune" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/&gt;
 *         &lt;element name="Provincia" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ProvinciaType" minOccurs="0"/&gt;
 *         &lt;element name="Nazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NazioneType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirizzoType", propOrder = {
    "indirizzo",
    "numeroCivico",
    "cap",
    "comune",
    "provincia",
    "nazione"
})
public class IndirizzoType {

    @XmlElement(name = "Indirizzo", required = true)
    protected String60LatinType indirizzo;
    @XmlElement(name = "NumeroCivico")
    protected String numeroCivico;
    @XmlElement(name = "CAP", required = true)
    protected CAPType cap;
    @XmlElement(name = "Comune", required = true)
    protected String60LatinType comune;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "Nazione", required = true, defaultValue = "IT")
    protected String nazione;

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getIndirizzo() {
        return indirizzo;
    }

    /**
     * Sets the value of the indirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setIndirizzo(String60LatinType value) {
        this.indirizzo = value;
    }

    /**
     * Gets the value of the numeroCivico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCivico() {
        return numeroCivico;
    }

    /**
     * Sets the value of the numeroCivico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCivico(String value) {
        this.numeroCivico = value;
    }

    /**
     * Gets the value of the cap property.
     * 
     * @return
     *     possible object is
     *     {@link CAPType }
     *     
     */
    public CAPType getCAP() {
        return cap;
    }

    /**
     * Sets the value of the cap property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPType }
     *     
     */
    public void setCAP(CAPType value) {
        this.cap = value;
    }

    /**
     * Gets the value of the comune property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getComune() {
        return comune;
    }

    /**
     * Sets the value of the comune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setComune(String60LatinType value) {
        this.comune = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the nazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazione() {
        return nazione;
    }

    /**
     * Sets the value of the nazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazione(String value) {
        this.nazione = value;
    }

}
