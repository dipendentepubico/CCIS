
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiDDTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiDDTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroDDT" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/&gt;
 *         &lt;element name="DataDDT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RiferimentoNumeroLinea" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RiferimentoNumeroLineaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiDDTType", propOrder = {
    "numeroDDT",
    "dataDDT",
    "riferimentoNumeroLinea"
})
public class DatiDDTType {

    @XmlElement(name = "NumeroDDT", required = true)
    protected String20Type numeroDDT;
    @XmlElement(name = "DataDDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDDT;
    @XmlElement(name = "RiferimentoNumeroLinea", type = Integer.class)
    @XmlSchemaType(name = "integer")
    protected List<Integer> riferimentoNumeroLinea;

    /**
     * Gets the value of the numeroDDT property.
     * 
     * @return
     *     possible object is
     *     {@link String20Type }
     *     
     */
    public String20Type getNumeroDDT() {
        return numeroDDT;
    }

    /**
     * Sets the value of the numeroDDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Type }
     *     
     */
    public void setNumeroDDT(String20Type value) {
        this.numeroDDT = value;
    }

    /**
     * Gets the value of the dataDDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDDT() {
        return dataDDT;
    }

    /**
     * Sets the value of the dataDDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDDT(XMLGregorianCalendar value) {
        this.dataDDT = value;
    }

    /**
     * Gets the value of the riferimentoNumeroLinea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riferimentoNumeroLinea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiferimentoNumeroLinea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getRiferimentoNumeroLinea() {
        if (riferimentoNumeroLinea == null) {
            riferimentoNumeroLinea = new ArrayList<Integer>();
        }
        return this.riferimentoNumeroLinea;
    }

}
