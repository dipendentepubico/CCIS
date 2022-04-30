
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AltriDatiGestionaliType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltriDatiGestionaliType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoDato" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String10Type"/&gt;
 *         &lt;element name="RiferimentoTesto" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType" minOccurs="0"/&gt;
 *         &lt;element name="RiferimentoNumero" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount8DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="RiferimentoData" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltriDatiGestionaliType", propOrder = {
    "tipoDato",
    "riferimentoTesto",
    "riferimentoNumero",
    "riferimentoData"
})
public class AltriDatiGestionaliType {

    @XmlElement(name = "TipoDato", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tipoDato;
    @XmlElement(name = "RiferimentoTesto")
    protected String60LatinType riferimentoTesto;
    @XmlElement(name = "RiferimentoNumero")
    protected Amount8DecimalType riferimentoNumero;
    @XmlElement(name = "RiferimentoData")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar riferimentoData;

    /**
     * Gets the value of the tipoDato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDato() {
        return tipoDato;
    }

    /**
     * Sets the value of the tipoDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDato(String value) {
        this.tipoDato = value;
    }

    /**
     * Gets the value of the riferimentoTesto property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getRiferimentoTesto() {
        return riferimentoTesto;
    }

    /**
     * Sets the value of the riferimentoTesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setRiferimentoTesto(String60LatinType value) {
        this.riferimentoTesto = value;
    }

    /**
     * Gets the value of the riferimentoNumero property.
     * 
     * @return
     *     possible object is
     *     {@link Amount8DecimalType }
     *     
     */
    public Amount8DecimalType getRiferimentoNumero() {
        return riferimentoNumero;
    }

    /**
     * Sets the value of the riferimentoNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount8DecimalType }
     *     
     */
    public void setRiferimentoNumero(Amount8DecimalType value) {
        this.riferimentoNumero = value;
    }

    /**
     * Gets the value of the riferimentoData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRiferimentoData() {
        return riferimentoData;
    }

    /**
     * Sets the value of the riferimentoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRiferimentoData(XMLGregorianCalendar value) {
        this.riferimentoData = value;
    }

}
