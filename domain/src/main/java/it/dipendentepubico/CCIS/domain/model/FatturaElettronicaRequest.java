
package it.dipendentepubico.CCIS.domain.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://dipendentepubico.it/ccis}paged_search_request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="or" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fattura" type="{https://dipendentepubico.it/ccis}flusso_sdi_type" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="and" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fattura" type="{https://dipendentepubico.it/ccis}flusso_sdi_type" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "or",
    "and"
})
@XmlRootElement(name = "fatturaElettronicaRequest")
public class FatturaElettronicaRequest
    extends PagedSearchRequest
{

    protected FatturaElettronicaRequest.Or or;
    protected FatturaElettronicaRequest.And and;

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link FatturaElettronicaRequest.Or }
     *     
     */
    public FatturaElettronicaRequest.Or getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link FatturaElettronicaRequest.Or }
     *     
     */
    public void setOr(FatturaElettronicaRequest.Or value) {
        this.or = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link FatturaElettronicaRequest.And }
     *     
     */
    public FatturaElettronicaRequest.And getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link FatturaElettronicaRequest.And }
     *     
     */
    public void setAnd(FatturaElettronicaRequest.And value) {
        this.and = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="fattura" type="{https://dipendentepubico.it/ccis}flusso_sdi_type" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fattura"
    })
    public static class And {

        @XmlElement(required = true)
        protected List<FlussoSdiType> fattura;

        /**
         * Gets the value of the fattura property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fattura property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFattura().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlussoSdiType }
         * 
         * 
         */
        public List<FlussoSdiType> getFattura() {
            if (fattura == null) {
                fattura = new ArrayList<FlussoSdiType>();
            }
            return this.fattura;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="fattura" type="{https://dipendentepubico.it/ccis}flusso_sdi_type" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fattura"
    })
    public static class Or {

        @XmlElement(required = true)
        protected List<FlussoSdiType> fattura;

        /**
         * Gets the value of the fattura property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fattura property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFattura().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlussoSdiType }
         * 
         * 
         */
        public List<FlussoSdiType> getFattura() {
            if (fattura == null) {
                fattura = new ArrayList<FlussoSdiType>();
            }
            return this.fattura;
        }

    }

}
