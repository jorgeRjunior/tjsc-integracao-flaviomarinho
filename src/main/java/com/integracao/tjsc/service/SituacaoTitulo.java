
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de situacaoTitulo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="situacaoTitulo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdsituacaotitulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nmsituacaotitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "situacaoTitulo", propOrder = {
    "cdsituacaotitulo",
    "nmsituacaotitulo"
})
public class SituacaoTitulo {

    protected Short cdsituacaotitulo;
    protected String nmsituacaotitulo;

    /**
     * Obtém o valor da propriedade cdsituacaotitulo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdsituacaotitulo() {
        return cdsituacaotitulo;
    }

    /**
     * Define o valor da propriedade cdsituacaotitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdsituacaotitulo(Short value) {
        this.cdsituacaotitulo = value;
    }

    /**
     * Obtém o valor da propriedade nmsituacaotitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsituacaotitulo() {
        return nmsituacaotitulo;
    }

    /**
     * Define o valor da propriedade nmsituacaotitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsituacaotitulo(String value) {
        this.nmsituacaotitulo = value;
    }

}
