
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de motivoCancelProtesto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="motivoCancelProtesto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoCancelProtesto", propOrder = {
    "cdmotivocancelprotesto",
    "nmmotivocancelprotesto"
})
public class MotivoCancelProtesto {

    protected Long cdmotivocancelprotesto;
    protected String nmmotivocancelprotesto;

    /**
     * Obtém o valor da propriedade cdmotivocancelprotesto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdmotivocancelprotesto() {
        return cdmotivocancelprotesto;
    }

    /**
     * Define o valor da propriedade cdmotivocancelprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdmotivocancelprotesto(Long value) {
        this.cdmotivocancelprotesto = value;
    }

    /**
     * Obtém o valor da propriedade nmmotivocancelprotesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmotivocancelprotesto() {
        return nmmotivocancelprotesto;
    }

    /**
     * Define o valor da propriedade nmmotivocancelprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmotivocancelprotesto(String value) {
        this.nmmotivocancelprotesto = value;
    }

}
