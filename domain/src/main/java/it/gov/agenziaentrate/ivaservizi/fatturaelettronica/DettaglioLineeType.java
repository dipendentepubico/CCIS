
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DettaglioLineeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DettaglioLineeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroLinea" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NumeroLineaType"/&gt;
 *         &lt;element name="TipoCessionePrestazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TipoCessionePrestazioneType" minOccurs="0"/&gt;
 *         &lt;element name="CodiceArticolo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodiceArticoloType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Descrizione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String1000LatinType"/&gt;
 *         &lt;element name="Quantita" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}QuantitaType" minOccurs="0"/&gt;
 *         &lt;element name="UnitaMisura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String10Type" minOccurs="0"/&gt;
 *         &lt;element name="DataInizioPeriodo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DataFinePeriodo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PrezzoUnitario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount8DecimalType"/&gt;
 *         &lt;element name="ScontoMaggiorazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ScontoMaggiorazioneType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrezzoTotale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount8DecimalType"/&gt;
 *         &lt;element name="AliquotaIVA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RateType"/&gt;
 *         &lt;element name="Ritenuta" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RitenutaType" minOccurs="0"/&gt;
 *         &lt;element name="Natura" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}NaturaType" minOccurs="0"/&gt;
 *         &lt;element name="RiferimentoAmministrazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type" minOccurs="0"/&gt;
 *         &lt;element name="AltriDatiGestionali" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}AltriDatiGestionaliType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DettaglioLineeType", propOrder = {
    "numeroLinea",
    "tipoCessionePrestazione",
    "codiceArticolo",
    "descrizione",
    "quantita",
    "unitaMisura",
    "dataInizioPeriodo",
    "dataFinePeriodo",
    "prezzoUnitario",
    "scontoMaggiorazione",
    "prezzoTotale",
    "aliquotaIVA",
    "ritenuta",
    "natura",
    "riferimentoAmministrazione",
    "altriDatiGestionali"
})
public class DettaglioLineeType {

    @XmlElement(name = "NumeroLinea", required = true)
    protected NumeroLineaType numeroLinea;
    @XmlElement(name = "TipoCessionePrestazione")
    @XmlSchemaType(name = "string")
    protected TipoCessionePrestazioneType tipoCessionePrestazione;
    @XmlElement(name = "CodiceArticolo")
    protected List<CodiceArticoloType> codiceArticolo;
    @XmlElement(name = "Descrizione", required = true)
    protected String1000LatinType descrizione;
    @XmlElement(name = "Quantita")
    protected QuantitaType quantita;
    @XmlElement(name = "UnitaMisura")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitaMisura;
    @XmlElement(name = "DataInizioPeriodo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInizioPeriodo;
    @XmlElement(name = "DataFinePeriodo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFinePeriodo;
    @XmlElement(name = "PrezzoUnitario", required = true)
    protected Amount8DecimalType prezzoUnitario;
    @XmlElement(name = "ScontoMaggiorazione")
    protected List<ScontoMaggiorazioneType> scontoMaggiorazione;
    @XmlElement(name = "PrezzoTotale", required = true)
    protected Amount8DecimalType prezzoTotale;
    @XmlElement(name = "AliquotaIVA", required = true)
    protected RateType aliquotaIVA;
    @XmlElement(name = "Ritenuta")
    @XmlSchemaType(name = "string")
    protected RitenutaType ritenuta;
    @XmlElement(name = "Natura")
    @XmlSchemaType(name = "string")
    protected NaturaType natura;
    @XmlElement(name = "RiferimentoAmministrazione")
    protected String20Type riferimentoAmministrazione;
    @XmlElement(name = "AltriDatiGestionali")
    protected List<AltriDatiGestionaliType> altriDatiGestionali;

    /**
     * Gets the value of the numeroLinea property.
     * 
     * @return
     *     possible object is
     *     {@link NumeroLineaType }
     *     
     */
    public NumeroLineaType getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Sets the value of the numeroLinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroLineaType }
     *     
     */
    public void setNumeroLinea(NumeroLineaType value) {
        this.numeroLinea = value;
    }

    /**
     * Gets the value of the tipoCessionePrestazione property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCessionePrestazioneType }
     *     
     */
    public TipoCessionePrestazioneType getTipoCessionePrestazione() {
        return tipoCessionePrestazione;
    }

    /**
     * Sets the value of the tipoCessionePrestazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCessionePrestazioneType }
     *     
     */
    public void setTipoCessionePrestazione(TipoCessionePrestazioneType value) {
        this.tipoCessionePrestazione = value;
    }

    /**
     * Gets the value of the codiceArticolo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codiceArticolo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodiceArticolo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodiceArticoloType }
     * 
     * 
     */
    public List<CodiceArticoloType> getCodiceArticolo() {
        if (codiceArticolo == null) {
            codiceArticolo = new ArrayList<CodiceArticoloType>();
        }
        return this.codiceArticolo;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String1000LatinType }
     *     
     */
    public String1000LatinType getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String1000LatinType }
     *     
     */
    public void setDescrizione(String1000LatinType value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the quantita property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitaType }
     *     
     */
    public QuantitaType getQuantita() {
        return quantita;
    }

    /**
     * Sets the value of the quantita property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitaType }
     *     
     */
    public void setQuantita(QuantitaType value) {
        this.quantita = value;
    }

    /**
     * Gets the value of the unitaMisura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitaMisura() {
        return unitaMisura;
    }

    /**
     * Sets the value of the unitaMisura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitaMisura(String value) {
        this.unitaMisura = value;
    }

    /**
     * Gets the value of the dataInizioPeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInizioPeriodo() {
        return dataInizioPeriodo;
    }

    /**
     * Sets the value of the dataInizioPeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInizioPeriodo(XMLGregorianCalendar value) {
        this.dataInizioPeriodo = value;
    }

    /**
     * Gets the value of the dataFinePeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinePeriodo() {
        return dataFinePeriodo;
    }

    /**
     * Sets the value of the dataFinePeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinePeriodo(XMLGregorianCalendar value) {
        this.dataFinePeriodo = value;
    }

    /**
     * Gets the value of the prezzoUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Amount8DecimalType }
     *     
     */
    public Amount8DecimalType getPrezzoUnitario() {
        return prezzoUnitario;
    }

    /**
     * Sets the value of the prezzoUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount8DecimalType }
     *     
     */
    public void setPrezzoUnitario(Amount8DecimalType value) {
        this.prezzoUnitario = value;
    }

    /**
     * Gets the value of the scontoMaggiorazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scontoMaggiorazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScontoMaggiorazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScontoMaggiorazioneType }
     * 
     * 
     */
    public List<ScontoMaggiorazioneType> getScontoMaggiorazione() {
        if (scontoMaggiorazione == null) {
            scontoMaggiorazione = new ArrayList<ScontoMaggiorazioneType>();
        }
        return this.scontoMaggiorazione;
    }

    /**
     * Gets the value of the prezzoTotale property.
     * 
     * @return
     *     possible object is
     *     {@link Amount8DecimalType }
     *     
     */
    public Amount8DecimalType getPrezzoTotale() {
        return prezzoTotale;
    }

    /**
     * Sets the value of the prezzoTotale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount8DecimalType }
     *     
     */
    public void setPrezzoTotale(Amount8DecimalType value) {
        this.prezzoTotale = value;
    }

    /**
     * Gets the value of the aliquotaIVA property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getAliquotaIVA() {
        return aliquotaIVA;
    }

    /**
     * Sets the value of the aliquotaIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setAliquotaIVA(RateType value) {
        this.aliquotaIVA = value;
    }

    /**
     * Gets the value of the ritenuta property.
     * 
     * @return
     *     possible object is
     *     {@link RitenutaType }
     *     
     */
    public RitenutaType getRitenuta() {
        return ritenuta;
    }

    /**
     * Sets the value of the ritenuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link RitenutaType }
     *     
     */
    public void setRitenuta(RitenutaType value) {
        this.ritenuta = value;
    }

    /**
     * Gets the value of the natura property.
     * 
     * @return
     *     possible object is
     *     {@link NaturaType }
     *     
     */
    public NaturaType getNatura() {
        return natura;
    }

    /**
     * Sets the value of the natura property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturaType }
     *     
     */
    public void setNatura(NaturaType value) {
        this.natura = value;
    }

    /**
     * Gets the value of the riferimentoAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String20Type }
     *     
     */
    public String20Type getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    /**
     * Sets the value of the riferimentoAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Type }
     *     
     */
    public void setRiferimentoAmministrazione(String20Type value) {
        this.riferimentoAmministrazione = value;
    }

    /**
     * Gets the value of the altriDatiGestionali property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altriDatiGestionali property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltriDatiGestionali().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltriDatiGestionaliType }
     * 
     * 
     */
    public List<AltriDatiGestionaliType> getAltriDatiGestionali() {
        if (altriDatiGestionali == null) {
            altriDatiGestionali = new ArrayList<AltriDatiGestionaliType>();
        }
        return this.altriDatiGestionali;
    }

}
