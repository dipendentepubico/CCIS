
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdFiscaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdFiscaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdPaese" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NazioneType"/&gt;
 *         &lt;element name="IdCodice" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodiceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdFiscaleType", propOrder = {
    "idPaese",
    "idCodice"
})
public class IdFiscaleType {

    @XmlElement(name = "IdPaese", required = true)
    protected String idPaese;
    @XmlElement(name = "IdCodice", required = true)
    protected String idCodice;

    /**
     * Gets the value of the idPaese property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaese() {
        return idPaese;
    }

    /**
     * Sets the value of the idPaese property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaese(String value) {
        this.idPaese = value;
    }

    /**
     * Gets the value of the idCodice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCodice() {
        return idCodice;
    }

    /**
     * Sets the value of the idCodice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCodice(String value) {
        this.idCodice = value;
    }

}
