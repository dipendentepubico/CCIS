
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatiCassaPrevidenzialeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiCassaPrevidenzialeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TipoCassaType"/&gt;
 *         &lt;element name="AlCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RateType"/&gt;
 *         &lt;element name="ImportoContributoCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType"/&gt;
 *         &lt;element name="ImponibileCassa" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="AliquotaIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RateType"/&gt;
 *         &lt;element name="Ritenuta" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RitenutaType" minOccurs="0"/&gt;
 *         &lt;element name="Natura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NaturaType" minOccurs="0"/&gt;
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
@XmlType(name = "DatiCassaPrevidenzialeType", propOrder = {
    "tipoCassa",
    "alCassa",
    "importoContributoCassa",
    "imponibileCassa",
    "aliquotaIVA",
    "ritenuta",
    "natura",
    "riferimentoAmministrazione"
})
public class DatiCassaPrevidenzialeType {

    @XmlElement(name = "TipoCassa", required = true)
    @XmlSchemaType(name = "string")
    protected TipoCassaType tipoCassa;
    @XmlElement(name = "AlCassa", required = true)
    protected RateType alCassa;
    @XmlElement(name = "ImportoContributoCassa", required = true)
    protected Amount2DecimalType importoContributoCassa;
    @XmlElement(name = "ImponibileCassa")
    protected Amount2DecimalType imponibileCassa;
    @XmlElement(name = "AliquotaIVA", required = true)
    protected RateType aliquotaIVA;
    @XmlElement(name = "Ritenuta")
    @XmlSchemaType(name = "string")
    protected RitenutaType ritenuta;
    @XmlElement(name = "Natura")
    @XmlSchemaType(name = "string")
    protected NaturaType natura;
    @XmlElement(name = "RiferimentoAmministrazione")
    protected String20Type riferimentoAmministrazione;

    /**
     * Gets the value of the tipoCassa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCassaType }
     *     
     */
    public TipoCassaType getTipoCassa() {
        return tipoCassa;
    }

    /**
     * Sets the value of the tipoCassa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCassaType }
     *     
     */
    public void setTipoCassa(TipoCassaType value) {
        this.tipoCassa = value;
    }

    /**
     * Gets the value of the alCassa property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getAlCassa() {
        return alCassa;
    }

    /**
     * Sets the value of the alCassa property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setAlCassa(RateType value) {
        this.alCassa = value;
    }

    /**
     * Gets the value of the importoContributoCassa property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getImportoContributoCassa() {
        return importoContributoCassa;
    }

    /**
     * Sets the value of the importoContributoCassa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setImportoContributoCassa(Amount2DecimalType value) {
        this.importoContributoCassa = value;
    }

    /**
     * Gets the value of the imponibileCassa property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getImponibileCassa() {
        return imponibileCassa;
    }

    /**
     * Sets the value of the imponibileCassa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setImponibileCassa(Amount2DecimalType value) {
        this.imponibileCassa = value;
    }

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
     * Gets the value of the ritenuta property.
     * 
     * @return
     *     possible object is
     *     {@link RitenutaType }
     *     
     */
    public RitenutaType getRitenuta() {
        return ritenuta;
    }

    /**
     * Sets the value of the ritenuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link RitenutaType }
     *     
     */
    public void setRitenuta(RitenutaType value) {
        this.ritenuta = value;
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
