
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de comarca complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="comarca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nmcomarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comarca", propOrder = {
    "cdcomarca",
    "nmcomarca"
})
public class Comarca {

    protected Short cdcomarca;
    protected String nmcomarca;

    /**
     * Obtém o valor da propriedade cdcomarca.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdcomarca() {
        return cdcomarca;
    }

    /**
     * Define o valor da propriedade cdcomarca.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdcomarca(Short value) {
        this.cdcomarca = value;
    }

    /**
     * Obtém o valor da propriedade nmcomarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmcomarca() {
        return nmcomarca;
    }

    /**
     * Define o valor da propriedade nmcomarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmcomarca(String value) {
        this.nmcomarca = value;
    }

}
