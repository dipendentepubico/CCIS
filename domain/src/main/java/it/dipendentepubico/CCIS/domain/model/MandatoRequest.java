
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
 *                   &lt;element name="mandato" type="{https://dipendentepubico.it/ccis}mandato_type" maxOccurs="unbounded"/&gt;
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
 *                   &lt;element name="mandato" type="{https://dipendentepubico.it/ccis}mandato_type" maxOccurs="unbounded"/&gt;
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
@XmlRootElement(name = "mandatoRequest")
public class MandatoRequest
    extends PagedSearchRequest
{

    protected MandatoRequest.Or or;
    protected MandatoRequest.And and;

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoRequest.Or }
     *     
     */
    public MandatoRequest.Or getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoRequest.Or }
     *     
     */
    public void setOr(MandatoRequest.Or value) {
        this.or = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoRequest.And }
     *     
     */
    public MandatoRequest.And getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoRequest.And }
     *     
     */
    public void setAnd(MandatoRequest.And value) {
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
     *         &lt;element name="mandato" type="{https://dipendentepubico.it/ccis}mandato_type" maxOccurs="unbounded"/&gt;
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
        "mandato"
    })
    public static class And {

        @XmlElement(required = true)
        protected List<MandatoType> mandato;

        /**
         * Gets the value of the mandato property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mandato property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMandato().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MandatoType }
         * 
         * 
         */
        public List<MandatoType> getMandato() {
            if (mandato == null) {
                mandato = new ArrayList<MandatoType>();
            }
            return this.mandato;
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
     *         &lt;element name="mandato" type="{https://dipendentepubico.it/ccis}mandato_type" maxOccurs="unbounded"/&gt;
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
        "mandato"
    })
    public static class Or {

        @XmlElement(required = true)
        protected List<MandatoType> mandato;

        /**
         * Gets the value of the mandato property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mandato property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMandato().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MandatoType }
         * 
         * 
         */
        public List<MandatoType> getMandato() {
            if (mandato == null) {
                mandato = new ArrayList<MandatoType>();
            }
            return this.mandato;
        }

    }

}
