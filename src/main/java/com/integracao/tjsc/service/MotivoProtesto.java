
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de motivoProtesto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="motivoProtesto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdmotivoprotesto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmmotivoprotesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoProtesto", propOrder = {
    "cdmotivoprotesto",
    "nmmotivoprotesto"
})
public class MotivoProtesto {

    protected Long cdmotivoprotesto;
    protected String nmmotivoprotesto;

    /**
     * Obtém o valor da propriedade cdmotivoprotesto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdmotivoprotesto() {
        return cdmotivoprotesto;
    }

    /**
     * Define o valor da propriedade cdmotivoprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdmotivoprotesto(Long value) {
        this.cdmotivoprotesto = value;
    }

    /**
     * Obtém o valor da propriedade nmmotivoprotesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmotivoprotesto() {
        return nmmotivoprotesto;
    }

    /**
     * Define o valor da propriedade nmmotivoprotesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmotivoprotesto(String value) {
        this.nmmotivoprotesto = value;
    }

}
