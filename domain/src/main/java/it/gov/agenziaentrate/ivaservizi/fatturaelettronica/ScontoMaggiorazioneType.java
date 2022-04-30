
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScontoMaggiorazioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScontoMaggiorazioneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tipo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TipoScontoMaggiorazioneType"/&gt;
 *         &lt;element name="Percentuale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RateType" minOccurs="0"/&gt;
 *         &lt;element name="Importo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount8DecimalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScontoMaggiorazioneType", propOrder = {
    "tipo",
    "percentuale",
    "importo"
})
public class ScontoMaggiorazioneType {

    @XmlElement(name = "Tipo", required = true)
    @XmlSchemaType(name = "string")
    protected TipoScontoMaggiorazioneType tipo;
    @XmlElement(name = "Percentuale")
    protected RateType percentuale;
    @XmlElement(name = "Importo")
    protected Amount8DecimalType importo;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoScontoMaggiorazioneType }
     *     
     */
    public TipoScontoMaggiorazioneType getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoScontoMaggiorazioneType }
     *     
     */
    public void setTipo(TipoScontoMaggiorazioneType value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the percentuale property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getPercentuale() {
        return percentuale;
    }

    /**
     * Sets the value of the percentuale property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setPercentuale(RateType value) {
        this.percentuale = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     * @return
     *     possible object is
     *     {@link Amount8DecimalType }
     *     
     */
    public Amount8DecimalType getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount8DecimalType }
     *     
     */
    public void setImporto(Amount8DecimalType value) {
        this.importo = value;
    }

}
