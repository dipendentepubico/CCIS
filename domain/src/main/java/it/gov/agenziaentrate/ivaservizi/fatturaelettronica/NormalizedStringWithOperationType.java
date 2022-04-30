
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import it.dipendentepubico.CCIS.domain.model.OperationStringEnumType;


/**
 * <p>Java class for normalizedString_with_operation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="normalizedString_with_operation_type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;normalizedString"&gt;
 *       &lt;attribute name="op" type="{https://dipendentepubico.it/ccis}operation_string_enum_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "normalizedString_with_operation_type", propOrder = {
    "value"
})
@XmlSeeAlso({
    TitoloType.class,
    String20Type.class,
    String35Type.class,
    String35LatinExtType.class,
    String60Type.class,
    String80Type.class,
    String100Type.class,
    String60LatinType.class,
    String80LatinType.class,
    String100LatinType.class,
    String200LatinType.class,
    String1000LatinType.class
})
public class NormalizedStringWithOperationType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String value;
    @XmlAttribute(name = "op")
    protected OperationStringEnumType op;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link OperationStringEnumType }
     *     
     */
    public OperationStringEnumType getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationStringEnumType }
     *     
     */
    public void setOp(OperationStringEnumType value) {
        this.op = value;
    }

}
