
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoAto20 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoAto20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="flativo" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="modeloscompativeis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmtipoato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAto20", propOrder = {
    "cdtipoato",
    "flativo",
    "modeloscompativeis",
    "nmtipoato"
})
public class TipoAto20 {

    protected Long cdtipoato;
    protected short flativo;
    protected String modeloscompativeis;
    protected String nmtipoato;

    /**
     * Obtém o valor da propriedade cdtipoato.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoato() {
        return cdtipoato;
    }

    /**
     * Define o valor da propriedade cdtipoato.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoato(Long value) {
        this.cdtipoato = value;
    }

    /**
     * Obtém o valor da propriedade flativo.
     * 
     */
    public short getFlativo() {
        return flativo;
    }

    /**
     * Define o valor da propriedade flativo.
     * 
     */
    public void setFlativo(short value) {
        this.flativo = value;
    }

    /**
     * Obtém o valor da propriedade modeloscompativeis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloscompativeis() {
        return modeloscompativeis;
    }

    /**
     * Define o valor da propriedade modeloscompativeis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloscompativeis(String value) {
        this.modeloscompativeis = value;
    }

    /**
     * Obtém o valor da propriedade nmtipoato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoato() {
        return nmtipoato;
    }

    /**
     * Define o valor da propriedade nmtipoato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoato(String value) {
        this.nmtipoato = value;
    }

}
