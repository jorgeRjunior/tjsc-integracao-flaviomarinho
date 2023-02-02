
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoRegistroAverbacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoRegistroAverbacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRegistroAverbacao", propOrder = {
    "cdtiporegaverbacao",
    "nmtiporegaverbacao"
})
public class TipoRegistroAverbacao {

    protected String cdtiporegaverbacao;
    protected String nmtiporegaverbacao;

    /**
     * Obtém o valor da propriedade cdtiporegaverbacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtiporegaverbacao() {
        return cdtiporegaverbacao;
    }

    /**
     * Define o valor da propriedade cdtiporegaverbacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtiporegaverbacao(String value) {
        this.cdtiporegaverbacao = value;
    }

    /**
     * Obtém o valor da propriedade nmtiporegaverbacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiporegaverbacao() {
        return nmtiporegaverbacao;
    }

    /**
     * Define o valor da propriedade nmtiporegaverbacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiporegaverbacao(String value) {
        this.nmtiporegaverbacao = value;
    }

}
