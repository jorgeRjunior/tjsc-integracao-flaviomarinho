
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoEmail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoEmail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoemail" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detipoemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEmail", propOrder = {
    "cdtipoemail",
    "detipoemail"
})
public class TipoEmail {

    protected Short cdtipoemail;
    protected String detipoemail;

    /**
     * Obtém o valor da propriedade cdtipoemail.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtipoemail() {
        return cdtipoemail;
    }

    /**
     * Define o valor da propriedade cdtipoemail.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtipoemail(Short value) {
        this.cdtipoemail = value;
    }

    /**
     * Obtém o valor da propriedade detipoemail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetipoemail() {
        return detipoemail;
    }

    /**
     * Define o valor da propriedade detipoemail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetipoemail(String value) {
        this.detipoemail = value;
    }

}
