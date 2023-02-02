
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de especieTitulo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="especieTitulo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdespecietitulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nmespecietitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sgespecietitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "especieTitulo", propOrder = {
    "cdespecietitulo",
    "nmespecietitulo",
    "sgespecietitulo"
})
public class EspecieTitulo {

    protected Short cdespecietitulo;
    protected String nmespecietitulo;
    protected String sgespecietitulo;

    /**
     * Obtém o valor da propriedade cdespecietitulo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdespecietitulo() {
        return cdespecietitulo;
    }

    /**
     * Define o valor da propriedade cdespecietitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdespecietitulo(Short value) {
        this.cdespecietitulo = value;
    }

    /**
     * Obtém o valor da propriedade nmespecietitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmespecietitulo() {
        return nmespecietitulo;
    }

    /**
     * Define o valor da propriedade nmespecietitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmespecietitulo(String value) {
        this.nmespecietitulo = value;
    }

    /**
     * Obtém o valor da propriedade sgespecietitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgespecietitulo() {
        return sgespecietitulo;
    }

    /**
     * Define o valor da propriedade sgespecietitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgespecietitulo(String value) {
        this.sgespecietitulo = value;
    }

}
