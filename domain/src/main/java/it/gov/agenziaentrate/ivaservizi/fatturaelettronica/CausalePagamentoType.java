
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CausalePagamentoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CausalePagamentoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="L1"/&gt;
 *     &lt;enumeration value="M1"/&gt;
 *     &lt;enumeration value="M2"/&gt;
 *     &lt;enumeration value="O1"/&gt;
 *     &lt;enumeration value="V1"/&gt;
 *     &lt;enumeration value="ZO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CausalePagamentoType")
@XmlEnum
public enum CausalePagamentoType {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    G("G"),
    H("H"),
    I("I"),
    L("L"),
    M("M"),
    N("N"),
    O("O"),
    P("P"),
    Q("Q"),
    R("R"),
    S("S"),
    T("T"),
    U("U"),
    V("V"),
    W("W"),
    X("X"),
    Y("Y"),
    Z("Z"),
    @XmlEnumValue("L1")
    L_1("L1"),
    @XmlEnumValue("M1")
    M_1("M1"),
    @XmlEnumValue("M2")
    M_2("M2"),
    @XmlEnumValue("O1")
    O_1("O1"),
    @XmlEnumValue("V1")
    V_1("V1"),
    ZO("ZO");
    private final String value;

    CausalePagamentoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CausalePagamentoType fromValue(String v) {
        for (CausalePagamentoType c: CausalePagamentoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
