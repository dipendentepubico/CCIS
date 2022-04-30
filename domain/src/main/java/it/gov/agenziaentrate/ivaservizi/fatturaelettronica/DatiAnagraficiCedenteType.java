
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiAnagraficiCedenteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiAnagraficiCedenteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdFiscaleIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IdFiscaleType"/&gt;
 *         &lt;element name="CodiceFiscale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodiceFiscaleType" minOccurs="0"/&gt;
 *         &lt;element name="Anagrafica" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}AnagraficaType"/&gt;
 *         &lt;element name="AlboProfessionale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaAlbo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ProvinciaType" minOccurs="0"/&gt;
 *         &lt;element name="NumeroIscrizioneAlbo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60Type" minOccurs="0"/&gt;
 *         &lt;element name="DataIscrizioneAlbo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RegimeFiscale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RegimeFiscaleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiAnagraficiCedenteType", propOrder = {
    "idFiscaleIVA",
    "codiceFiscale",
    "anagrafica",
    "alboProfessionale",
    "provinciaAlbo",
    "numeroIscrizioneAlbo",
    "dataIscrizioneAlbo",
    "regimeFiscale"
})
public class DatiAnagraficiCedenteType {

    @XmlElement(name = "IdFiscaleIVA", required = true)
    protected IdFiscaleType idFiscaleIVA;
    @XmlElement(name = "CodiceFiscale")
    protected String codiceFiscale;
    @XmlElement(name = "Anagrafica", required = true)
    protected AnagraficaType anagrafica;
    @XmlElement(name = "AlboProfessionale")
    protected String60LatinType alboProfessionale;
    @XmlElement(name = "ProvinciaAlbo")
    protected String provinciaAlbo;
    @XmlElement(name = "NumeroIscrizioneAlbo")
    protected String60Type numeroIscrizioneAlbo;
    @XmlElement(name = "DataIscrizioneAlbo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataIscrizioneAlbo;
    @XmlElement(name = "RegimeFiscale", required = true)
    @XmlSchemaType(name = "string")
    protected RegimeFiscaleType regimeFiscale;

    /**
     * Gets the value of the idFiscaleIVA property.
     * 
     * @return
     *     possible object is
     *     {@link IdFiscaleType }
     *     
     */
    public IdFiscaleType getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * Sets the value of the idFiscaleIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFiscaleType }
     *     
     */
    public void setIdFiscaleIVA(IdFiscaleType value) {
        this.idFiscaleIVA = value;
    }

    /**
     * Gets the value of the codiceFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Sets the value of the codiceFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Gets the value of the anagrafica property.
     * 
     * @return
     *     possible object is
     *     {@link AnagraficaType }
     *     
     */
    public AnagraficaType getAnagrafica() {
        return anagrafica;
    }

    /**
     * Sets the value of the anagrafica property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnagraficaType }
     *     
     */
    public void setAnagrafica(AnagraficaType value) {
        this.anagrafica = value;
    }

    /**
     * Gets the value of the alboProfessionale property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getAlboProfessionale() {
        return alboProfessionale;
    }

    /**
     * Sets the value of the alboProfessionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setAlboProfessionale(String60LatinType value) {
        this.alboProfessionale = value;
    }

    /**
     * Gets the value of the provinciaAlbo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaAlbo() {
        return provinciaAlbo;
    }

    /**
     * Sets the value of the provinciaAlbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaAlbo(String value) {
        this.provinciaAlbo = value;
    }

    /**
     * Gets the value of the numeroIscrizioneAlbo property.
     * 
     * @return
     *     possible object is
     *     {@link String60Type }
     *     
     */
    public String60Type getNumeroIscrizioneAlbo() {
        return numeroIscrizioneAlbo;
    }

    /**
     * Sets the value of the numeroIscrizioneAlbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60Type }
     *     
     */
    public void setNumeroIscrizioneAlbo(String60Type value) {
        this.numeroIscrizioneAlbo = value;
    }

    /**
     * Gets the value of the dataIscrizioneAlbo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataIscrizioneAlbo() {
        return dataIscrizioneAlbo;
    }

    /**
     * Sets the value of the dataIscrizioneAlbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataIscrizioneAlbo(XMLGregorianCalendar value) {
        this.dataIscrizioneAlbo = value;
    }

    /**
     * Gets the value of the regimeFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link RegimeFiscaleType }
     *     
     */
    public RegimeFiscaleType getRegimeFiscale() {
        return regimeFiscale;
    }

    /**
     * Sets the value of the regimeFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimeFiscaleType }
     *     
     */
    public void setRegimeFiscale(RegimeFiscaleType value) {
        this.regimeFiscale = value;
    }

}
