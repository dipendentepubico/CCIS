
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IscrizioneREAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IscrizioneREAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ufficio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ProvinciaType"/&gt;
 *         &lt;element name="NumeroREA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/&gt;
 *         &lt;element name="CapitaleSociale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="SocioUnico" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}SocioUnicoType" minOccurs="0"/&gt;
 *         &lt;element name="StatoLiquidazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}StatoLiquidazioneType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscrizioneREAType", propOrder = {
    "ufficio",
    "numeroREA",
    "capitaleSociale",
    "socioUnico",
    "statoLiquidazione"
})
public class IscrizioneREAType {

    @XmlElement(name = "Ufficio", required = true)
    protected String ufficio;
    @XmlElement(name = "NumeroREA", required = true)
    protected String20Type numeroREA;
    @XmlElement(name = "CapitaleSociale")
    protected Amount2DecimalType capitaleSociale;
    @XmlElement(name = "SocioUnico")
    @XmlSchemaType(name = "string")
    protected SocioUnicoType socioUnico;
    @XmlElement(name = "StatoLiquidazione", required = true)
    @XmlSchemaType(name = "string")
    protected StatoLiquidazioneType statoLiquidazione;

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfficio() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfficio(String value) {
        this.ufficio = value;
    }

    /**
     * Gets the value of the numeroREA property.
     * 
     * @return
     *     possible object is
     *     {@link String20Type }
     *     
     */
    public String20Type getNumeroREA() {
        return numeroREA;
    }

    /**
     * Sets the value of the numeroREA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Type }
     *     
     */
    public void setNumeroREA(String20Type value) {
        this.numeroREA = value;
    }

    /**
     * Gets the value of the capitaleSociale property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getCapitaleSociale() {
        return capitaleSociale;
    }

    /**
     * Sets the value of the capitaleSociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setCapitaleSociale(Amount2DecimalType value) {
        this.capitaleSociale = value;
    }

    /**
     * Gets the value of the socioUnico property.
     * 
     * @return
     *     possible object is
     *     {@link SocioUnicoType }
     *     
     */
    public SocioUnicoType getSocioUnico() {
        return socioUnico;
    }

    /**
     * Sets the value of the socioUnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocioUnicoType }
     *     
     */
    public void setSocioUnico(SocioUnicoType value) {
        this.socioUnico = value;
    }

    /**
     * Gets the value of the statoLiquidazione property.
     * 
     * @return
     *     possible object is
     *     {@link StatoLiquidazioneType }
     *     
     */
    public StatoLiquidazioneType getStatoLiquidazione() {
        return statoLiquidazione;
    }

    /**
     * Sets the value of the statoLiquidazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoLiquidazioneType }
     *     
     */
    public void setStatoLiquidazione(StatoLiquidazioneType value) {
        this.statoLiquidazione = value;
    }

}
