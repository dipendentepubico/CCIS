
package it.dipendentepubico.CCIS.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paged_search_request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paged_search_request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paging" type="{https://dipendentepubico.it/ccis}paging_type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paged_search_request", propOrder = {
    "paging"
})
@XmlSeeAlso({
    MandatoRequest.class,
    FatturaElettronicaRequest.class
})
public class PagedSearchRequest {

    protected PagingType paging;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link PagingType }
     *     
     */
    public PagingType getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingType }
     *     
     */
    public void setPaging(PagingType value) {
        this.paging = value;
    }

}
