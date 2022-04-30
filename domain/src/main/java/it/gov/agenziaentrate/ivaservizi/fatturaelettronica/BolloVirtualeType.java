
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BolloVirtualeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BolloVirtualeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BolloVirtualeType")
@XmlEnum
public enum BolloVirtualeType {

    SI;

    public String value() {
        return name();
    }

    public static BolloVirtualeType fromValue(String v) {
        return valueOf(v);
    }

}
