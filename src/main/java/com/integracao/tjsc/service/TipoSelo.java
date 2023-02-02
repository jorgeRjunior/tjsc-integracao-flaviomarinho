
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoSelo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoSelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtpselo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detpselo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSelo", propOrder = {
    "cdtpselo",
    "detpselo"
})
public class TipoSelo {

    protected Short cdtpselo;
    protected String detpselo;

    /**
     * Obtém o valor da propriedade cdtpselo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtpselo() {
        return cdtpselo;
    }

    /**
     * Define o valor da propriedade cdtpselo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtpselo(Short value) {
        this.cdtpselo = value;
    }

    /**
     * Obtém o valor da propriedade detpselo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpselo() {
        return detpselo;
    }

    /**
     * Define o valor da propriedade detpselo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpselo(String value) {
        this.detpselo = value;
    }

}
