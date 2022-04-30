
package it.dipendentepubico.CCIS.domain.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operation_string_enum_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operation_string_enum_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="eq"/&gt;
 *     &lt;enumeration value="ne"/&gt;
 *     &lt;enumeration value="like"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "operation_string_enum_type")
@XmlEnum
public enum OperationStringEnumType {

    @XmlEnumValue("eq")
    EQ("eq"),
    @XmlEnumValue("ne")
    NE("ne"),
    @XmlEnumValue("like")
    LIKE("like");
    private final String value;

    OperationStringEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationStringEnumType fromValue(String v) {
        for (OperationStringEnumType c: OperationStringEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
