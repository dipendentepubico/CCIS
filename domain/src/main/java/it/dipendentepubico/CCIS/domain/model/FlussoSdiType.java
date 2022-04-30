
package it.dipendentepubico.CCIS.domain.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.FatturaElettronicaType;


/**
 * <p>Java class for flusso_sdi_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flusso_sdi_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificativo_sdi" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;https://dipendentepubico.it/ccis&gt;integer_with_operation_type"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fattura_elettronica" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}FatturaElettronicaType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flusso_sdi_type", propOrder = {
    "identificativoSdi",
    "fatturaElettronica"
})
public class FlussoSdiType {

    @XmlElement(name = "identificativo_sdi")
    protected FlussoSdiType.IdentificativoSdi identificativoSdi;
    @XmlElement(name = "fattura_elettronica", required = true)
    protected List<FatturaElettronicaType> fatturaElettronica;

    /**
     * Gets the value of the identificativoSdi property.
     * 
     * @return
     *     possible object is
     *     {@link FlussoSdiType.IdentificativoSdi }
     *     
     */
    public FlussoSdiType.IdentificativoSdi getIdentificativoSdi() {
        return identificativoSdi;
    }

    /**
     * Sets the value of the identificativoSdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlussoSdiType.IdentificativoSdi }
     *     
     */
    public void setIdentificativoSdi(FlussoSdiType.IdentificativoSdi value) {
        this.identificativoSdi = value;
    }

    /**
     * Gets the value of the fatturaElettronica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fatturaElettronica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFatturaElettronica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FatturaElettronicaType }
     * 
     * 
     */
    public List<FatturaElettronicaType> getFatturaElettronica() {
        if (fatturaElettronica == null) {
            fatturaElettronica = new ArrayList<FatturaElettronicaType>();
        }
        return this.fatturaElettronica;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;restriction base="&lt;https://dipendentepubico.it/ccis&gt;integer_with_operation_type"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IdentificativoSdi
        extends IntegerWithOperationType
    {


    }

}
