
package it.dipendentepubico.CCIS.domain.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.Amount2DecimalType;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.Amount8DecimalType;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.PesoType;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.QuantitaType;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.RateType;


/**
 * <p>Java class for decimal_with_operation_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decimal_with_operation_type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attribute name="op" type="{https://dipendentepubico.it/ccis}operation_number_enum_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decimal_with_operation_type", propOrder = {
    "value"
})
@XmlSeeAlso({
    PesoType.class,
    Amount8DecimalType.class,
    Amount2DecimalType.class,
    RateType.class,
    QuantitaType.class
})
public class DecimalWithOperationType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "op")
    protected OperationNumberEnumType op;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
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
