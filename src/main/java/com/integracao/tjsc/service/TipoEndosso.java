
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoEndosso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoEndosso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoendosso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmtipoendosso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEndosso", propOrder = {
    "cdtipoendosso",
    "nmtipoendosso"
})
public class TipoEndosso {

    protected Long cdtipoendosso;
    protected String nmtipoendosso;

    /**
     * Obtém o valor da propriedade cdtipoendosso.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoendosso() {
        return cdtipoendosso;
    }

    /**
     * Define o valor da propriedade cdtipoendosso.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoendosso(Long value) {
        this.cdtipoendosso = value;
    }

    /**
     * Obtém o valor da propriedade nmtipoendosso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoendosso() {
        return nmtipoendosso;
    }

    /**
     * Define o valor da propriedade nmtipoendosso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoendosso(String value) {
        this.nmtipoendosso = value;
    }

}
