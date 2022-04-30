
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FatturaPrincipaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FatturaPrincipaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroFatturaPrincipale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/&gt;
 *         &lt;element name="DataFatturaPrincipale" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FatturaPrincipaleType", propOrder = {
    "numeroFatturaPrincipale",
    "dataFatturaPrincipale"
})
public class FatturaPrincipaleType {

    @XmlElement(name = "NumeroFatturaPrincipale", required = true)
    protected String20Type numeroFatturaPrincipale;
    @XmlElement(name = "DataFatturaPrincipale", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFatturaPrincipale;

    /**
     * Gets the value of the numeroFatturaPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link String20Type }
     *     
     */
    public String20Type getNumeroFatturaPrincipale() {
        return numeroFatturaPrincipale;
    }

    /**
     * Sets the value of the numeroFatturaPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Type }
     *     
     */
    public void setNumeroFatturaPrincipale(String20Type value) {
        this.numeroFatturaPrincipale = value;
    }

    /**
     * Gets the value of the dataFatturaPrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFatturaPrincipale() {
        return dataFatturaPrincipale;
    }

    /**
     * Sets the value of the dataFatturaPrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFatturaPrincipale(XMLGregorianCalendar value) {
        this.dataFatturaPrincipale = value;
    }

}
