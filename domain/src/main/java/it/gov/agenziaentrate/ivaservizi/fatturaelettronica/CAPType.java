
package it.gov.agenziaentrate.ivaservizi.fatturaelettronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import it.dipendentepubico.CCIS.domain.model.StringWithOperationType;


/**
 * <p>Java class for CAPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAPType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;https://dipendentepubico.it/ccis&gt;string_with_operation_type"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAPType")
public class CAPType
    extends StringWithOperationType
{


}
