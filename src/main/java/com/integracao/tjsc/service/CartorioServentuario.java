
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cartorioServentuario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cartorioServentuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdserventuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cdtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nmserventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nucartorio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartorioServentuario", propOrder = {
    "cdserventuario",
    "cdtiposerventuario",
    "nmserventuario",
    "nmtiposerventuario",
    "nucartorio"
})
public class CartorioServentuario {

    protected Integer cdserventuario;
    protected Integer cdtiposerventuario;
    protected String nmserventuario;
    protected String nmtiposerventuario;
    protected Integer nucartorio;

    /**
     * Obtém o valor da propriedade cdserventuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdserventuario() {
        return cdserventuario;
    }

    /**
     * Define o valor da propriedade cdserventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdserventuario(Integer value) {
        this.cdserventuario = value;
    }

    /**
     * Obtém o valor da propriedade cdtiposerventuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtiposerventuario() {
        return cdtiposerventuario;
    }

    /**
     * Define o valor da propriedade cdtiposerventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtiposerventuario(Integer value) {
        this.cdtiposerventuario = value;
    }

    /**
     * Obtém o valor da propriedade nmserventuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmserventuario() {
        return nmserventuario;
    }

    /**
     * Define o valor da propriedade nmserventuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmserventuario(String value) {
        this.nmserventuario = value;
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

    /**
     * Obtém o valor da propriedade nucartorio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNucartorio() {
        return nucartorio;
    }

    /**
     * Define o valor da propriedade nucartorio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNucartorio(Integer value) {
        this.nucartorio = value;
    }

}
