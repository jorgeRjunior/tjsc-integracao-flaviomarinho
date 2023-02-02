
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoServentuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoServentuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nmtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoServentuario", propOrder = {
    "cdtiposerventuario",
    "nmtiposerventuario"
})
public class TipoServentuario {

    protected Short cdtiposerventuario;
    protected String nmtiposerventuario;

    /**
     * Obtém o valor da propriedade cdtiposerventuario.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtiposerventuario() {
        return cdtiposerventuario;
    }

    /**
     * Define o valor da propriedade cdtiposerventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtiposerventuario(Short value) {
        this.cdtiposerventuario = value;
    }

    /**
     * Obtém o valor da propriedade nmtiposerventuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposerventuario() {
        return nmtiposerventuario;
    }

    /**
     * Define o valor da propriedade nmtiposerventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposerventuario(String value) {
        this.nmtiposerventuario = value;
    }

}
