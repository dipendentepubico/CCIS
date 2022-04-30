
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodiceArticoloType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodiceArticoloType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodiceTipo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String35Type"/&gt;
 *         &lt;element name="CodiceValore" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String35LatinExtType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodiceArticoloType", propOrder = {
    "codiceTipo",
    "codiceValore"
})
public class CodiceArticoloType {

    @XmlElement(name = "CodiceTipo", required = true)
    protected String35Type codiceTipo;
    @XmlElement(name = "CodiceValore", required = true)
    protected String35LatinExtType codiceValore;

    /**
     * Gets the value of the codiceTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String35Type }
     *     
     */
    public String35Type getCodiceTipo() {
        return codiceTipo;
    }

    /**
     * Sets the value of the codiceTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String35Type }
     *     
     */
    public void setCodiceTipo(String35Type value) {
        this.codiceTipo = value;
    }

    /**
     * Gets the value of the codiceValore property.
     * 
     * @return
     *     possible object is
     *     {@link String35LatinExtType }
     *     
     */
    public String35LatinExtType getCodiceValore() {
        return codiceValore;
    }

    /**
     * Sets the value of the codiceValore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String35LatinExtType }
     *     
     */
    public void setCodiceValore(String35LatinExtType value) {
        this.codiceValore = value;
    }

}
