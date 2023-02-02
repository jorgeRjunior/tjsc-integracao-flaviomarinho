
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoSubestabelecimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoSubestabelecimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSubestabelecimento", propOrder = {
    "cdtiposubestabelecimento",
    "nmtiposubestabelecimento"
})
public class TipoSubestabelecimento {

    protected Long cdtiposubestabelecimento;
    protected String nmtiposubestabelecimento;

    /**
     * Obtém o valor da propriedade cdtiposubestabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtiposubestabelecimento() {
        return cdtiposubestabelecimento;
    }

    /**
     * Define o valor da propriedade cdtiposubestabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtiposubestabelecimento(Long value) {
        this.cdtiposubestabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade nmtiposubestabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposubestabelecimento() {
        return nmtiposubestabelecimento;
    }

    /**
     * Define o valor da propriedade nmtiposubestabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposubestabelecimento(String value) {
        this.nmtiposubestabelecimento = value;
    }

}
