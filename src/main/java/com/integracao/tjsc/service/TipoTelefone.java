
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoTelefone complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoTelefone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipotelefone" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detipotelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTelefone", propOrder = {
    "cdtipotelefone",
    "detipotelefone"
})
public class TipoTelefone {

    protected Short cdtipotelefone;
    protected String detipotelefone;

    /**
     * Obtém o valor da propriedade cdtipotelefone.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtipotelefone() {
        return cdtipotelefone;
    }

    /**
     * Define o valor da propriedade cdtipotelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtipotelefone(Short value) {
        this.cdtipotelefone = value;
    }

    /**
     * Obtém o valor da propriedade detipotelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetipotelefone() {
        return detipotelefone;
    }

    /**
     * Define o valor da propriedade detipotelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetipotelefone(String value) {
        this.detipotelefone = value;
    }

}
