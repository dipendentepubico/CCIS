
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCessionePrestazioneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCessionePrestazioneType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="2"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="AC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoCessionePrestazioneType")
@XmlEnum
public enum TipoCessionePrestazioneType {


    /**
     * Sconto
     * 
     */
    SC,

    /**
     * Premio
     * 
     */
    PR,

    /**
     * Abbuono
     * 
     */
    AB,

    /**
     * Spesa accessoria
     * 
     */
    AC;

    public String value() {
        return name();
    }

    public static TipoCessionePrestazioneType fromValue(String v) {
        return valueOf(v);
    }

}
