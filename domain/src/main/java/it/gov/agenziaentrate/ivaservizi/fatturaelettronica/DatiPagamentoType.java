
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Blocco relativo ai dati di Pagamento della Fattura Elettronica
 * 
 * <p>Java class for DatiPagamentoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiPagamentoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CondizioniPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CondizioniPagamentoType"/&gt;
 *         &lt;element name="DettaglioPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DettaglioPagamentoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiPagamentoType", propOrder = {
    "condizioniPagamento",
    "dettaglioPagamento"
})
public class DatiPagamentoType {

    @XmlElement(name = "CondizioniPagamento", required = true)
    @XmlSchemaType(name = "string")
    protected CondizioniPagamentoType condizioniPagamento;
    @XmlElement(name = "DettaglioPagamento", required = true)
    protected List<DettaglioPagamentoType> dettaglioPagamento;

    /**
     * Gets the value of the condizioniPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link CondizioniPagamentoType }
     *     
     */
    public CondizioniPagamentoType getCondizioniPagamento() {
        return condizioniPagamento;
    }

    /**
     * Sets the value of the condizioniPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondizioniPagamentoType }
     *     
     */
    public void setCondizioniPagamento(CondizioniPagamentoType value) {
        this.condizioniPagamento = value;
    }

    /**
     * Gets the value of the dettaglioPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioPagamentoType }
     * 
     * 
     */
    public List<DettaglioPagamentoType> getDettaglioPagamento() {
        if (dettaglioPagamento == null) {
            dettaglioPagamento = new ArrayList<DettaglioPagamentoType>();
        }
        return this.dettaglioPagamento;
    }

}
