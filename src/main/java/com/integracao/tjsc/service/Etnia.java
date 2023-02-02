
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de etnia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="etnia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdetnia" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="deetnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etnia", propOrder = {
    "cdetnia",
    "deetnia"
})
public class Etnia {

    protected Short cdetnia;
    protected String deetnia;

    /**
     * Obtém o valor da propriedade cdetnia.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdetnia() {
        return cdetnia;
    }

    /**
     * Define o valor da propriedade cdetnia.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdetnia(Short value) {
        this.cdetnia = value;
    }

    /**
     * Obtém o valor da propriedade deetnia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeetnia() {
        return deetnia;
    }

    /**
     * Define o valor da propriedade deetnia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeetnia(String value) {
        this.deetnia = value;
    }

}
