
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoProcuracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoProcuracao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoProcuracao", propOrder = {
    "cdtipoprocuracao",
    "nmtipoprocuracao"
})
public class TipoProcuracao {

    protected Long cdtipoprocuracao;
    protected String nmtipoprocuracao;

    /**
     * Obtém o valor da propriedade cdtipoprocuracao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoprocuracao() {
        return cdtipoprocuracao;
    }

    /**
     * Define o valor da propriedade cdtipoprocuracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoprocuracao(Long value) {
        this.cdtipoprocuracao = value;
    }

    /**
     * Obtém o valor da propriedade nmtipoprocuracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoprocuracao() {
        return nmtipoprocuracao;
    }

    /**
     * Define o valor da propriedade nmtipoprocuracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoprocuracao(String value) {
        this.nmtipoprocuracao = value;
    }

}
