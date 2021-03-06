
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FatturaElettronicaHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FatturaElettronicaHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatiTrasmissione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiTrasmissioneType"/&gt;
 *         &lt;element name="CedentePrestatore" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CedentePrestatoreType"/&gt;
 *         &lt;element name="RappresentanteFiscale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RappresentanteFiscaleType" minOccurs="0"/&gt;
 *         &lt;element name="CessionarioCommittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CessionarioCommittenteType"/&gt;
 *         &lt;element name="TerzoIntermediarioOSoggettoEmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TerzoIntermediarioSoggettoEmittenteType" minOccurs="0"/&gt;
 *         &lt;element name="SoggettoEmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}SoggettoEmittenteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FatturaElettronicaHeaderType", propOrder = {
    "datiTrasmissione",
    "cedentePrestatore",
    "rappresentanteFiscale",
    "cessionarioCommittente",
    "terzoIntermediarioOSoggettoEmittente",
    "soggettoEmittente"
})
public class FatturaElettronicaHeaderType {

    @XmlElement(name = "DatiTrasmissione", required = true)
    protected DatiTrasmissioneType datiTrasmissione;
    @XmlElement(name = "CedentePrestatore", required = true)
    protected CedentePrestatoreType cedentePrestatore;
    @XmlElement(name = "RappresentanteFiscale")
    protected RappresentanteFiscaleType rappresentanteFiscale;
    @XmlElement(name = "CessionarioCommittente", required = true)
    protected CessionarioCommittenteType cessionarioCommittente;
    @XmlElement(name = "TerzoIntermediarioOSoggettoEmittente")
    protected TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioOSoggettoEmittente;
    @XmlElement(name = "SoggettoEmittente")
    @XmlSchemaType(name = "string")
    protected SoggettoEmittenteType soggettoEmittente;

    /**
     * Gets the value of the datiTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link DatiTrasmissioneType }
     *     
     */
    public DatiTrasmissioneType getDatiTrasmissione() {
        return datiTrasmissione;
    }

    /**
     * Sets the value of the datiTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiTrasmissioneType }
     *     
     */
    public void setDatiTrasmissione(DatiTrasmissioneType value) {
        this.datiTrasmissione = value;
    }

    /**
     * Gets the value of the cedentePrestatore property.
     * 
     * @return
     *     possible object is
     *     {@link CedentePrestatoreType }
     *     
     */
    public CedentePrestatoreType getCedentePrestatore() {
        return cedentePrestatore;
    }

    /**
     * Sets the value of the cedentePrestatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CedentePrestatoreType }
     *     
     */
    public void setCedentePrestatore(CedentePrestatoreType value) {
        this.cedentePrestatore = value;
    }

    /**
     * Gets the value of the rappresentanteFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link RappresentanteFiscaleType }
     *     
     */
    public RappresentanteFiscaleType getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    /**
     * Sets the value of the rappresentanteFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link RappresentanteFiscaleType }
     *     
     */
    public void setRappresentanteFiscale(RappresentanteFiscaleType value) {
        this.rappresentanteFiscale = value;
    }

    /**
     * Gets the value of the cessionarioCommittente property.
     * 
     * @return
     *     possible object is
     *     {@link CessionarioCommittenteType }
     *     
     */
    public CessionarioCommittenteType getCessionarioCommittente() {
        return cessionarioCommittente;
    }

    /**
     * Sets the value of the cessionarioCommittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link CessionarioCommittenteType }
     *     
     */
    public void setCessionarioCommittente(CessionarioCommittenteType value) {
        this.cessionarioCommittente = value;
    }

    /**
     * Gets the value of the terzoIntermediarioOSoggettoEmittente property.
     * 
     * @return
     *     possible object is
     *     {@link TerzoIntermediarioSoggettoEmittenteType }
     *     
     */
    public TerzoIntermediarioSoggettoEmittenteType getTerzoIntermediarioOSoggettoEmittente() {
        return terzoIntermediarioOSoggettoEmittente;
    }

    /**
     * Sets the value of the terzoIntermediarioOSoggettoEmittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerzoIntermediarioSoggettoEmittenteType }
     *     
     */
    public void setTerzoIntermediarioOSoggettoEmittente(TerzoIntermediarioSoggettoEmittenteType value) {
        this.terzoIntermediarioOSoggettoEmittente = value;
    }

    /**
     * Gets the value of the soggettoEmittente property.
     * 
     * @return
     *     possible object is
     *     {@link SoggettoEmittenteType }
     *     
     */
    public SoggettoEmittenteType getSoggettoEmittente() {
        return soggettoEmittente;
    }

    /**
     * Sets the value of the soggettoEmittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoggettoEmittenteType }
     *     
     */
    public void setSoggettoEmittente(SoggettoEmittenteType value) {
        this.soggettoEmittente = value;
    }

}
