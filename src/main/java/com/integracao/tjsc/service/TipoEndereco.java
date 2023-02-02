
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoEndereco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoEndereco"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoendereco" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detipoendereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEndereco", propOrder = {
    "cdtipoendereco",
    "detipoendereco"
})
public class TipoEndereco {

    protected Short cdtipoendereco;
    protected String detipoendereco;

    /**
     * Obtém o valor da propriedade cdtipoendereco.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtipoendereco() {
        return cdtipoendereco;
    }

    /**
     * Define o valor da propriedade cdtipoendereco.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtipoendereco(Short value) {
        this.cdtipoendereco = value;
    }

    /**
     * Obtém o valor da propriedade detipoendereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetipoendereco() {
        return detipoendereco;
    }

    /**
     * Define o valor da propriedade detipoendereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetipoendereco(String value) {
        this.detipoendereco = value;
    }

}
