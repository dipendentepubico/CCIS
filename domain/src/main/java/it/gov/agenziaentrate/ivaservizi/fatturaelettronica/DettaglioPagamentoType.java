
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DettaglioPagamentoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DettaglioPagamentoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Beneficiario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String200LatinType" minOccurs="0"/&gt;
 *         &lt;element name="ModalitaPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ModalitaPagamentoType"/&gt;
 *         &lt;element name="DataRiferimentoTerminiPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GiorniTerminiPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}GiorniTerminePagamentoType" minOccurs="0"/&gt;
 *         &lt;element name="DataScadenzaPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ImportoPagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType"/&gt;
 *         &lt;element name="CodUfficioPostale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type" minOccurs="0"/&gt;
 *         &lt;element name="CognomeQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType" minOccurs="0"/&gt;
 *         &lt;element name="NomeQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType" minOccurs="0"/&gt;
 *         &lt;element name="CFQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodiceFiscalePFType" minOccurs="0"/&gt;
 *         &lt;element name="TitoloQuietanzante" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TitoloType" minOccurs="0"/&gt;
 *         &lt;element name="IstitutoFinanziario" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String80LatinType" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}IBANType" minOccurs="0"/&gt;
 *         &lt;element name="ABI" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ABIType" minOccurs="0"/&gt;
 *         &lt;element name="CAB" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CABType" minOccurs="0"/&gt;
 *         &lt;element name="BIC" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}BICType" minOccurs="0"/&gt;
 *         &lt;element name="ScontoPagamentoAnticipato" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="DataLimitePagamentoAnticipato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PenalitaPagamentiRitardati" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/&gt;
 *         &lt;element name="DataDecorrenzaPenale" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CodicePagamento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DettaglioPagamentoType", propOrder = {
    "beneficiario",
    "modalitaPagamento",
    "dataRiferimentoTerminiPagamento",
    "giorniTerminiPagamento",
    "dataScadenzaPagamento",
    "importoPagamento",
    "codUfficioPostale",
    "cognomeQuietanzante",
    "nomeQuietanzante",
    "cfQuietanzante",
    "titoloQuietanzante",
    "istitutoFinanziario",
    "iban",
    "abi",
    "cab",
    "bic",
    "scontoPagamentoAnticipato",
    "dataLimitePagamentoAnticipato",
    "penalitaPagamentiRitardati",
    "dataDecorrenzaPenale",
    "codicePagamento"
})
public class DettaglioPagamentoType {

    @XmlElement(name = "Beneficiario")
    protected String200LatinType beneficiario;
    @XmlElement(name = "ModalitaPagamento", required = true)
    @XmlSchemaType(name = "string")
    protected ModalitaPagamentoType modalitaPagamento;
    @XmlElement(name = "DataRiferimentoTerminiPagamento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRiferimentoTerminiPagamento;
    @XmlElement(name = "GiorniTerminiPagamento")
    protected GiorniTerminePagamentoType giorniTerminiPagamento;
    @XmlElement(name = "DataScadenzaPagamento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataScadenzaPagamento;
    @XmlElement(name = "ImportoPagamento", required = true)
    protected Amount2DecimalType importoPagamento;
    @XmlElement(name = "CodUfficioPostale")
    protected String20Type codUfficioPostale;
    @XmlElement(name = "CognomeQuietanzante")
    protected String60LatinType cognomeQuietanzante;
    @XmlElement(name = "NomeQuietanzante")
    protected String60LatinType nomeQuietanzante;
    @XmlElement(name = "CFQuietanzante")
    protected String cfQuietanzante;
    @XmlElement(name = "TitoloQuietanzante")
    protected TitoloType titoloQuietanzante;
    @XmlElement(name = "IstitutoFinanziario")
    protected String80LatinType istitutoFinanziario;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "ABI")
    protected ABIType abi;
    @XmlElement(name = "CAB")
    protected CABType cab;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "ScontoPagamentoAnticipato")
    protected Amount2DecimalType scontoPagamentoAnticipato;
    @XmlElement(name = "DataLimitePagamentoAnticipato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataLimitePagamentoAnticipato;
    @XmlElement(name = "PenalitaPagamentiRitardati")
    protected Amount2DecimalType penalitaPagamentiRitardati;
    @XmlElement(name = "DataDecorrenzaPenale")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDecorrenzaPenale;
    @XmlElement(name = "CodicePagamento")
    protected String60Type codicePagamento;

    /**
     * Gets the value of the beneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String200LatinType }
     *     
     */
    public String200LatinType getBeneficiario() {
        return beneficiario;
    }

    /**
     * Sets the value of the beneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String200LatinType }
     *     
     */
    public void setBeneficiario(String200LatinType value) {
        this.beneficiario = value;
    }

    /**
     * Gets the value of the modalitaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ModalitaPagamentoType }
     *     
     */
    public ModalitaPagamentoType getModalitaPagamento() {
        return modalitaPagamento;
    }

    /**
     * Sets the value of the modalitaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModalitaPagamentoType }
     *     
     */
    public void setModalitaPagamento(ModalitaPagamentoType value) {
        this.modalitaPagamento = value;
    }

    /**
     * Gets the value of the dataRiferimentoTerminiPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRiferimentoTerminiPagamento() {
        return dataRiferimentoTerminiPagamento;
    }

    /**
     * Sets the value of the dataRiferimentoTerminiPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRiferimentoTerminiPagamento(XMLGregorianCalendar value) {
        this.dataRiferimentoTerminiPagamento = value;
    }

    /**
     * Gets the value of the giorniTerminiPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link GiorniTerminePagamentoType }
     *     
     */
    public GiorniTerminePagamentoType getGiorniTerminiPagamento() {
        return giorniTerminiPagamento;
    }

    /**
     * Sets the value of the giorniTerminiPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiorniTerminePagamentoType }
     *     
     */
    public void setGiorniTerminiPagamento(GiorniTerminePagamentoType value) {
        this.giorniTerminiPagamento = value;
    }

    /**
     * Gets the value of the dataScadenzaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataScadenzaPagamento() {
        return dataScadenzaPagamento;
    }

    /**
     * Sets the value of the dataScadenzaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataScadenzaPagamento(XMLGregorianCalendar value) {
        this.dataScadenzaPagamento = value;
    }

    /**
     * Gets the value of the importoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getImportoPagamento() {
        return importoPagamento;
    }

    /**
     * Sets the value of the importoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setImportoPagamento(Amount2DecimalType value) {
        this.importoPagamento = value;
    }

    /**
     * Gets the value of the codUfficioPostale property.
     * 
     * @return
     *     possible object is
     *     {@link String20Type }
     *     
     */
    public String20Type getCodUfficioPostale() {
        return codUfficioPostale;
    }

    /**
     * Sets the value of the codUfficioPostale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String20Type }
     *     
     */
    public void setCodUfficioPostale(String20Type value) {
        this.codUfficioPostale = value;
    }

    /**
     * Gets the value of the cognomeQuietanzante property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getCognomeQuietanzante() {
        return cognomeQuietanzante;
    }

    /**
     * Sets the value of the cognomeQuietanzante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setCognomeQuietanzante(String60LatinType value) {
        this.cognomeQuietanzante = value;
    }

    /**
     * Gets the value of the nomeQuietanzante property.
     * 
     * @return
     *     possible object is
     *     {@link String60LatinType }
     *     
     */
    public String60LatinType getNomeQuietanzante() {
        return nomeQuietanzante;
    }

    /**
     * Sets the value of the nomeQuietanzante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60LatinType }
     *     
     */
    public void setNomeQuietanzante(String60LatinType value) {
        this.nomeQuietanzante = value;
    }

    /**
     * Gets the value of the cfQuietanzante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFQuietanzante() {
        return cfQuietanzante;
    }

    /**
     * Sets the value of the cfQuietanzante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFQuietanzante(String value) {
        this.cfQuietanzante = value;
    }

    /**
     * Gets the value of the titoloQuietanzante property.
     * 
     * @return
     *     possible object is
     *     {@link TitoloType }
     *     
     */
    public TitoloType getTitoloQuietanzante() {
        return titoloQuietanzante;
    }

    /**
     * Sets the value of the titoloQuietanzante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitoloType }
     *     
     */
    public void setTitoloQuietanzante(TitoloType value) {
        this.titoloQuietanzante = value;
    }

    /**
     * Gets the value of the istitutoFinanziario property.
     * 
     * @return
     *     possible object is
     *     {@link String80LatinType }
     *     
     */
    public String80LatinType getIstitutoFinanziario() {
        return istitutoFinanziario;
    }

    /**
     * Sets the value of the istitutoFinanziario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String80LatinType }
     *     
     */
    public void setIstitutoFinanziario(String80LatinType value) {
        this.istitutoFinanziario = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the abi property.
     * 
     * @return
     *     possible object is
     *     {@link ABIType }
     *     
     */
    public ABIType getABI() {
        return abi;
    }

    /**
     * Sets the value of the abi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABIType }
     *     
     */
    public void setABI(ABIType value) {
        this.abi = value;
    }

    /**
     * Gets the value of the cab property.
     * 
     * @return
     *     possible object is
     *     {@link CABType }
     *     
     */
    public CABType getCAB() {
        return cab;
    }

    /**
     * Sets the value of the cab property.
     * 
     * @param value
     *     allowed object is
     *     {@link CABType }
     *     
     */
    public void setCAB(CABType value) {
        this.cab = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the scontoPagamentoAnticipato property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getScontoPagamentoAnticipato() {
        return scontoPagamentoAnticipato;
    }

    /**
     * Sets the value of the scontoPagamentoAnticipato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setScontoPagamentoAnticipato(Amount2DecimalType value) {
        this.scontoPagamentoAnticipato = value;
    }

    /**
     * Gets the value of the dataLimitePagamentoAnticipato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLimitePagamentoAnticipato() {
        return dataLimitePagamentoAnticipato;
    }

    /**
     * Sets the value of the dataLimitePagamentoAnticipato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLimitePagamentoAnticipato(XMLGregorianCalendar value) {
        this.dataLimitePagamentoAnticipato = value;
    }

    /**
     * Gets the value of the penalitaPagamentiRitardati property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2DecimalType }
     *     
     */
    public Amount2DecimalType getPenalitaPagamentiRitardati() {
        return penalitaPagamentiRitardati;
    }

    /**
     * Sets the value of the penalitaPagamentiRitardati property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2DecimalType }
     *     
     */
    public void setPenalitaPagamentiRitardati(Amount2DecimalType value) {
        this.penalitaPagamentiRitardati = value;
    }

    /**
     * Gets the value of the dataDecorrenzaPenale property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDecorrenzaPenale() {
        return dataDecorrenzaPenale;
    }

    /**
     * Sets the value of the dataDecorrenzaPenale property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDecorrenzaPenale(XMLGregorianCalendar value) {
        this.dataDecorrenzaPenale = value;
    }

    /**
     * Gets the value of the codicePagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String60Type }
     *     
     */
    public String60Type getCodicePagamento() {
        return codicePagamento;
    }

    /**
     * Sets the value of the codicePagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String60Type }
     *     
     */
    public void setCodicePagamento(String60Type value) {
        this.codicePagamento = value;
    }

}
