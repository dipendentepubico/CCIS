
package it.dipendentepubico.CCIS.domain.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fattura" type="{https://dipendentepubico.it/ccis}flusso_sdi_type" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement(name = "fatturaElettronicaResponse")
public class FatturaElettronicaResponse {

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
