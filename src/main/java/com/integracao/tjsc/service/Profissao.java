
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de profissao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="profissao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdprofissao" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="deprofissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profissao", propOrder = {
    "cdprofissao",
    "deprofissao"
})
public class Profissao {

    protected Short cdprofissao;
    protected String deprofissao;

    /**
     * Obtém o valor da propriedade cdprofissao.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdprofissao() {
        return cdprofissao;
    }

    /**
     * Define o valor da propriedade cdprofissao.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdprofissao(Short value) {
        this.cdprofissao = value;
    }

    /**
     * Obtém o valor da propriedade deprofissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeprofissao() {
        return deprofissao;
    }

    /**
     * Define o valor da propriedade deprofissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeprofissao(String value) {
        this.deprofissao = value;
    }

}
