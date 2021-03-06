
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Blocco relativo ai dati di trasmissione della Fattura Elettronica
 * 
 * <p>Java class for DatiTrasmissioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiTrasmissioneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdTrasmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IdFiscaleType"/&gt;
 *         &lt;element name="ProgressivoInvio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String10Type"/&gt;
 *         &lt;element name="FormatoTrasmissione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}FormatoTrasmissioneType"/&gt;
 *         &lt;element name="CodiceDestinatario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodiceDestinatarioType"/&gt;
 *         &lt;element name="ContattiTrasmittente" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ContattiTrasmittenteType" minOccurs="0"/&gt;
 *         &lt;element name="PECDestinatario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}EmailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiTrasmissioneType", propOrder = {
    "idTrasmittente",
    "progressivoInvio",
    "formatoTrasmissione",
    "codiceDestinatario",
    "contattiTrasmittente",
    "pecDestinatario"
})
public class DatiTrasmissioneType {

    @XmlElement(name = "IdTrasmittente", required = true)
    protected IdFiscaleType idTrasmittente;
    @XmlElement(name = "ProgressivoInvio", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String progressivoInvio;
    @XmlElement(name = "FormatoTrasmissione", required = true)
    @XmlSchemaType(name = "string")
    protected FormatoTrasmissioneType formatoTrasmissione;
    @XmlElement(name = "CodiceDestinatario", required = true)
    protected String codiceDestinatario;
    @XmlElement(name = "ContattiTrasmittente")
    protected ContattiTrasmittenteType contattiTrasmittente;
    @XmlElement(name = "PECDestinatario")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pecDestinatario;

    /**
     * Gets the value of the idTrasmittente property.
     * 
     * @return
     *     possible object is
     *     {@link IdFiscaleType }
     *     
     */
    public IdFiscaleType getIdTrasmittente() {
        return idTrasmittente;
    }

    /**
     * Sets the value of the idTrasmittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFiscaleType }
     *     
     */
    public void setIdTrasmittente(IdFiscaleType value) {
        this.idTrasmittente = value;
    }

    /**
     * Gets the value of the progressivoInvio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressivoInvio() {
        return progressivoInvio;
    }

    /**
     * Sets the value of the progressivoInvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressivoInvio(String value) {
        this.progressivoInvio = value;
    }

    /**
     * Gets the value of the formatoTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public FormatoTrasmissioneType getFormatoTrasmissione() {
        return formatoTrasmissione;
    }

    /**
     * Sets the value of the formatoTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatoTrasmissioneType }
     *     
     */
    public void setFormatoTrasmissione(FormatoTrasmissioneType value) {
        this.formatoTrasmissione = value;
    }

    /**
     * Gets the value of the codiceDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceDestinatario() {
        return codiceDestinatario;
    }

    /**
     * Sets the value of the codiceDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceDestinatario(String value) {
        this.codiceDestinatario = value;
    }

    /**
     * Gets the value of the contattiTrasmittente property.
     * 
     * @return
     *     possible object is
     *     {@link ContattiTrasmittenteType }
     *     
     */
    public ContattiTrasmittenteType getContattiTrasmittente() {
        return contattiTrasmittente;
    }

    /**
     * Sets the value of the contattiTrasmittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContattiTrasmittenteType }
     *     
     */
    public void setContattiTrasmittente(ContattiTrasmittenteType value) {
        this.contattiTrasmittente = value;
    }

    /**
     * Gets the value of the pecDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECDestinatario() {
        return pecDestinatario;
    }

    /**
     * Sets the value of the pecDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECDestinatario(String value) {
        this.pecDestinatario = value;
    }

}
