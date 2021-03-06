
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Blocco relativo ai dati del Cessionario / Committente
 * 
 * <p>Java class for CessionarioCommittenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CessionarioCommittenteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiCessionarioType"/&gt;
 *         &lt;element name="Sede" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IndirizzoType"/&gt;
 *         &lt;element name="StabileOrganizzazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IndirizzoType" minOccurs="0"/&gt;
 *         &lt;element name="RappresentanteFiscale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RappresentanteFiscaleCessionarioType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CessionarioCommittenteType", propOrder = {
    "datiAnagrafici",
    "sede",
    "stabileOrganizzazione",
    "rappresentanteFiscale"
})
public class CessionarioCommittenteType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiCessionarioType datiAnagrafici;
    @XmlElement(name = "Sede", required = true)
    protected IndirizzoType sede;
    @XmlElement(name = "StabileOrganizzazione")
    protected IndirizzoType stabileOrganizzazione;
    @XmlElement(name = "RappresentanteFiscale")
    protected RappresentanteFiscaleCessionarioType rappresentanteFiscale;

    /**
     * Gets the value of the datiAnagrafici property.
     * 
     * @return
     *     possible object is
     *     {@link DatiAnagraficiCessionarioType }
     *     
     */
    public DatiAnagraficiCessionarioType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Sets the value of the datiAnagrafici property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiCessionarioType }
     *     
     */
    public void setDatiAnagrafici(DatiAnagraficiCessionarioType value) {
        this.datiAnagrafici = value;
    }

    /**
     * Gets the value of the sede property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoType }
     *     
     */
    public IndirizzoType getSede() {
        return sede;
    }

    /**
     * Sets the value of the sede property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoType }
     *     
     */
    public void setSede(IndirizzoType value) {
        this.sede = value;
    }

    /**
     * Gets the value of the stabileOrganizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link IndirizzoType }
     *     
     */
    public IndirizzoType getStabileOrganizzazione() {
        return stabileOrganizzazione;
    }

    /**
     * Sets the value of the stabileOrganizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirizzoType }
     *     
     */
    public void setStabileOrganizzazione(IndirizzoType value) {
        this.stabileOrganizzazione = value;
    }

    /**
     * Gets the value of the rappresentanteFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link RappresentanteFiscaleCessionarioType }
     *     
     */
    public RappresentanteFiscaleCessionarioType getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * Sets the value of the rappresentanteFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link RappresentanteFiscaleCessionarioType }
     *     
     */
    public void setRappresentanteFiscale(RappresentanteFiscaleCessionarioType value) {
        this.rappresentanteFiscale = value;
    }

}
