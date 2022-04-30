
package it.dipendentepubico.CCIS.domain.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation_number_enum_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operation_number_enum_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lg"/&gt;
 *     &lt;enumeration value="gt"/&gt;
 *     &lt;enumeration value="eq"/&gt;
 *     &lt;enumeration value="ne"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "operation_number_enum_type")
@XmlEnum
public enum OperationNumberEnumType {

    @XmlEnumValue("lg")
    LG("lg"),
    @XmlEnumValue("gt")
    GT("gt"),
    @XmlEnumValue("eq")
    EQ("eq"),
    @XmlEnumValue("ne")
    NE("ne");
    private final String value;

    OperationNumberEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationNumberEnumType fromValue(String v) {
        for (OperationNumberEnumType c: OperationNumberEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
