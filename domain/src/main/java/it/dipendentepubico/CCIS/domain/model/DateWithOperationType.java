
package it.dipendentepubico.CCIS.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for date_with_operation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="date_with_operation_type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *       &lt;attribute name="op" type="{https://dipendentepubico.it/ccis}operation_number_enum_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "date_with_operation_type", propOrder = {
    "value"
})
@XmlSeeAlso({
    it.dipendentepubico.CCIS.domain.model.MandatoType.Data.class
})
public class DateWithOperationType {

    @XmlValue
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "op")
    protected OperationNumberEnumType op;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link OperationNumberEnumType }
     *     
     */
    public OperationNumberEnumType getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationNumberEnumType }
     *     
     */
    public void setOp(OperationNumberEnumType value) {
        this.op = value;
    }

}
