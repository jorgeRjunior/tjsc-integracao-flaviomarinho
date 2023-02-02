
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de formaPagamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="formaPagamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdformapagamento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nmformapagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formaPagamento", propOrder = {
    "cdformapagamento",
    "nmformapagamento"
})
public class FormaPagamento {

    protected Short cdformapagamento;
    protected String nmformapagamento;

    /**
     * Obtém o valor da propriedade cdformapagamento.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdformapagamento() {
        return cdformapagamento;
    }

    /**
     * Define o valor da propriedade cdformapagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdformapagamento(Short value) {
        this.cdformapagamento = value;
    }

    /**
     * Obtém o valor da propriedade nmformapagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmformapagamento() {
        return nmformapagamento;
    }

    /**
     * Define o valor da propriedade nmformapagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmformapagamento(String value) {
        this.nmformapagamento = value;
    }

}
