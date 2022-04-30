
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Blocco relativo ai dati del Cedente / Prestatore
 * 
 * <p>Java class for CedentePrestatoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CedentePrestatoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiCedenteType"/&gt;
 *         &lt;element name="Sede" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IndirizzoType"/&gt;
 *         &lt;element name="StabileOrganizzazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IndirizzoType" minOccurs="0"/&gt;
 *         &lt;element name="IscrizioneREA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IscrizioneREAType" minOccurs="0"/&gt;
 *         &lt;element name="Contatti" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ContattiType" minOccurs="0"/&gt;
 *         &lt;element name="RiferimentoAmministrazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CedentePrestatoreType", propOrder = {
    "datiAnagrafici",
    "sede",
    "stabileOrganizzazione",
    "iscrizioneREA",
    "contatti",
    "riferimentoAmministrazione"
})
public class CedentePrestatoreType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiCedenteType datiAnagrafici;
    @XmlElement(name = "Sede", required = true)
    protected IndirizzoType sede;
    @XmlElement(name = "StabileOrganizzazione")
    protected IndirizzoType stabileOrganizzazione;
    @XmlElement(name = "IscrizioneREA")
    protected IscrizioneREAType iscrizioneREA;
    @XmlElement(name = "Contatti")
    protected ContattiType contatti;
    @XmlElement(name = "RiferimentoAmministrazione")
    protected String20Type riferimentoAmministrazione;

    /**
     * Gets the value of the datiAnagrafici property.
     * 
     * @return
     *     possible object is
     *     {@link DatiAnagraficiCedenteType }
     *     
     */
    public DatiAnagraficiCedenteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Sets the value of the datiAnagrafici property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiCedenteType }
     *     
     */
    public void setDatiAnagrafici(DatiAnagraficiCedenteType value) {
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
     * Gets the value of the iscrizioneREA property.
     * 
     * @return
     *     possible object is
     *     {@link IscrizioneREAType }
     *     
     */
    public IscrizioneREAType getIscrizioneREA() {
        return iscrizioneREA;
    }

    /**
     * Sets the value of the iscrizioneREA property.
     * 
     * @param value
     *     allowed object is
     *     {@link IscrizioneREAType }
     *     
     */
    public void setIscrizioneREA(IscrizioneREAType value) {
        this.iscrizioneREA = value;
    }

    /**
     * Gets the value of the contatti property.
     * 
     * @return
     *     possible object is
     *     {@link ContattiType }
     *     
     */
    public ContattiType getContatti() {
        return contatti;
    }

    /**
     * Sets the value of the contatti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContattiType }
     *     
     */
    public void setContatti(ContattiType value) {
        this.contatti = value;
    }

    /**
     * Gets the value of the riferimentoAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String20Type }
     *     
     */
    public String20Type getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    /**
     * Sets the value of the riferimentoAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Type }
     *     
     */
    public void setRiferimentoAmministrazione(String20Type value) {
        this.riferimentoAmministrazione = value;
    }

}
