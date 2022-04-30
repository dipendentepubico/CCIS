
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Art73Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Art73Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="2"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Art73Type")
@XmlEnum
public enum Art73Type {


    /**
     * SI = Documento emesso secondo modalità e termini stabiliti con DM ai sensi dell'art. 73 DPR 633/72
     * 
     */
    SI;

    public String value() {
        return name();
    }

    public static Art73Type fromValue(String v) {
        return valueOf(v);
    }

}
