
package it.dipendentepubico.CCIS.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.ABIType;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.CABType;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.CAPType;


/**
 * <p>Java class for string_with_operation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="string_with_operation_type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="op" type="{https://dipendentepubico.it/ccis}operation_string_enum_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "string_with_operation_type", propOrder = {
    "value"
})
@XmlSeeAlso({
    CAPType.class,
    ABIType.class,
    CABType.class
})
public class StringWithOperationType {

    @XmlValue
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
