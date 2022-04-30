
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatiSALType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiSALType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RiferimentoFase" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RiferimentoFaseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiSALType", propOrder = {
    "riferimentoFase"
})
public class DatiSALType {

    @XmlElement(name = "RiferimentoFase", required = true)
    protected RiferimentoFaseType riferimentoFase;

    /**
     * Gets the value of the riferimentoFase property.
     * 
     * @return
     *     possible object is
     *     {@link RiferimentoFaseType }
     *     
     */
    public RiferimentoFaseType getRiferimentoFase() {
        return riferimentoFase;
    }

    /**
     * Sets the value of the riferimentoFase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiferimentoFaseType }
     *     
     */
    public void setRiferimentoFase(RiferimentoFaseType value) {
        this.riferimentoFase = value;
    }

}
