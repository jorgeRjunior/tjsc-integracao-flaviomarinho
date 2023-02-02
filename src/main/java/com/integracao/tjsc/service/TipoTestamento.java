
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoTestamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoTestamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipotestamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmtipotestamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTestamento", propOrder = {
    "cdtipotestamento",
    "nmtipotestamento"
})
public class TipoTestamento {

    protected Long cdtipotestamento;
    protected String nmtipotestamento;

    /**
     * Obtém o valor da propriedade cdtipotestamento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipotestamento() {
        return cdtipotestamento;
    }

    /**
     * Define o valor da propriedade cdtipotestamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipotestamento(Long value) {
        this.cdtipotestamento = value;
    }

    /**
     * Obtém o valor da propriedade nmtipotestamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipotestamento() {
        return nmtipotestamento;
    }

    /**
     * Define o valor da propriedade nmtipotestamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipotestamento(String value) {
        this.nmtipotestamento = value;
    }

}
