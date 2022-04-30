
package it.dipendentepubico.CCIS.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for codiceFiscale_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codiceFiscale_type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;https://dipendentepubico.it/ccis&gt;codiceFiscale_pattern_type"&gt;
 *       &lt;attribute name="op" type="{https://dipendentepubico.it/ccis}operation_string_enum_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codiceFiscale_type", propOrder = {
    "value"
})
public class CodiceFiscaleType {

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
