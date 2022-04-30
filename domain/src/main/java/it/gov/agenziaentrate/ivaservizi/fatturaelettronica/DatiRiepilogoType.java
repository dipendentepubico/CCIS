
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatiRiepilogoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiRiepilogoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AliquotaIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RateType"/&gt;
 *         &lt;element name="Natura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NaturaType" minOccurs="0"/&gt;
 *         &lt;element name="SpeseAccessorie" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="Arrotondamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount8DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="ImponibileImporto" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType"/&gt;
 *         &lt;element name="Imposta" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType"/&gt;
 *         &lt;element name="EsigibilitaIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}EsigibilitaIVAType" minOccurs="0"/&gt;
 *         &lt;element name="RiferimentoNormativo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String100LatinType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiRiepilogoType", propOrder = {
    "aliquotaIVA",
    "natura",
    "speseAccessorie",
    "arrotondamento",
    "imponibileImporto",
    "imposta",
    "esigibilitaIVA",
    "riferimentoNormativo"
})
public class DatiRiepilogoType {

    @XmlElement(name = "AliquotaIVA", required = true)
    protected RateType aliquotaIVA;
    @XmlElement(name = "Natura")
    @XmlSchemaType(name = "string")
    protected NaturaType natura;
    @XmlElement(name = "SpeseAccessorie")
    protected Amount2DecimalType speseAccessorie;
    @XmlElement(name = "Arrotondamento")
    protected Amount8DecimalType arrotondamento;
    @XmlElement(name = "ImponibileImporto", required = true)
    protected Amount2DecimalType imponibileImporto;
    @XmlElement(name = "Imposta", required = true)
    protected Amount2DecimalType imposta;
    @XmlElement(name = "EsigibilitaIVA")
    @XmlSchemaType(name = "string")
    protected EsigibilitaIVAType esigibilitaIVA;
    @XmlElement(name = "RiferimentoNormativo")
    protected String100LatinType riferimentoNormativo;

    /**
     * Gets the value of the aliquotaIVA property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getAliquotaIVA() {
        return aliquotaIVA;
    }

    /**
     * Sets the value of the aliquotaIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setAliquotaIVA(RateType value) {
        this.aliquotaIVA = value;
    }

    /**
     * Gets the value of the natura property.
     * 
     * @return
     *     possible object is
     *     {@link NaturaType }
     *     
     */
    public NaturaType getNatura() {
        return natura;
    }

    /**
     * Sets the value of the natura property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturaType }
     *     
     */
    public void setNatura(NaturaType value) {
        this.natura = value;
    }

    /**
     * Gets the value of the speseAccessorie property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getSpeseAccessorie() {
        return speseAccessorie;
    }

    /**
     * Sets the value of the speseAccessorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setSpeseAccessorie(Amount2DecimalType value) {
        this.speseAccessorie = value;
    }

    /**
     * Gets the value of the arrotondamento property.
     * 
     * @return
     *     possible object is
     *     {@link Amount8DecimalType }
     *     
     */
    public Amount8DecimalType getArrotondamento() {
        return arrotondamento;
    }

    /**
     * Sets the value of the arrotondamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount8DecimalType }
     *     
     */
    public void setArrotondamento(Amount8DecimalType value) {
        this.arrotondamento = value;
    }

    /**
     * Gets the value of the imponibileImporto property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getImponibileImporto() {
        return imponibileImporto;
    }

    /**
     * Sets the value of the imponibileImporto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setImponibileImporto(Amount2DecimalType value) {
        this.imponibileImporto = value;
    }

    /**
     * Gets the value of the imposta property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getImposta() {
        return imposta;
    }

    /**
     * Sets the value of the imposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setImposta(Amount2DecimalType value) {
        this.imposta = value;
    }

    /**
     * Gets the value of the esigibilitaIVA property.
     * 
     * @return
     *     possible object is
     *     {@link EsigibilitaIVAType }
     *     
     */
    public EsigibilitaIVAType getEsigibilitaIVA() {
        return esigibilitaIVA;
    }

    /**
     * Sets the value of the esigibilitaIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsigibilitaIVAType }
     *     
     */
    public void setEsigibilitaIVA(EsigibilitaIVAType value) {
        this.esigibilitaIVA = value;
    }

    /**
     * Gets the value of the riferimentoNormativo property.
     * 
     * @return
     *     possible object is
     *     {@link String100LatinType }
     *     
     */
    public String100LatinType getRiferimentoNormativo() {
        return riferimentoNormativo;
    }

    /**
     * Sets the value of the riferimentoNormativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String100LatinType }
     *     
     */
    public void setRiferimentoNormativo(String100LatinType value) {
        this.riferimentoNormativo = value;
    }

}
