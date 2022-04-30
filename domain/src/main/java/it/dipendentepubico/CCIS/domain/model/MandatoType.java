
package it.dipendentepubico.CCIS.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mandato_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mandato_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;https://dipendentepubico.it/ccis&gt;integer_with_operation_type"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="data" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;https://dipendentepubico.it/ccis&gt;date_with_operation_type"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="anno" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;restriction base="&lt;https://dipendentepubico.it/ccis&gt;integer_with_operation_type"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="beneficiario" type="{https://dipendentepubico.it/ccis}beneficiario_type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mandato_type", propOrder = {
    "codice",
    "data",
    "anno",
    "beneficiario"
})
public class MandatoType {

    protected MandatoType.Codice codice;
    protected MandatoType.Data data;
    protected MandatoType.Anno anno;
    protected BeneficiarioType beneficiario;

    /**
     * Gets the value of the codice property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoType.Codice }
     *     
     */
    public MandatoType.Codice getCodice() {
        return codice;
    }

    /**
     * Sets the value of the codice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoType.Codice }
     *     
     */
    public void setCodice(MandatoType.Codice value) {
        this.codice = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoType.Data }
     *     
     */
    public MandatoType.Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoType.Data }
     *     
     */
    public void setData(MandatoType.Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoType.Anno }
     *     
     */
    public MandatoType.Anno getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoType.Anno }
     *     
     */
    public void setAnno(MandatoType.Anno value) {
        this.anno = value;
    }

    /**
     * Gets the value of the beneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiarioType }
     *     
     */
    public BeneficiarioType getBeneficiario() {
        return beneficiario;
    }

    /**
     * Sets the value of the beneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiarioType }
     *     
     */
    public void setBeneficiario(BeneficiarioType value) {
        this.beneficiario = value;
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
    public static class Anno
        extends IntegerWithOperationType
    {


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
    public static class Codice
        extends IntegerWithOperationType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;restriction base="&lt;https://dipendentepubico.it/ccis&gt;date_with_operation_type"&gt;
     *     &lt;/restriction&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Data
        extends DateWithOperationType
    {


    }

}
