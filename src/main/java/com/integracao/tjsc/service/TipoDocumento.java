
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoDocumento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtpdocumento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detpdocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detpdocumentoabrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumento", propOrder = {
    "cdtpdocumento",
    "detpdocumento",
    "detpdocumentoabrev"
})
public class TipoDocumento {

    protected Short cdtpdocumento;
    protected String detpdocumento;
    protected String detpdocumentoabrev;

    /**
     * Obtém o valor da propriedade cdtpdocumento.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtpdocumento() {
        return cdtpdocumento;
    }

    /**
     * Define o valor da propriedade cdtpdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtpdocumento(Short value) {
        this.cdtpdocumento = value;
    }

    /**
     * Obtém o valor da propriedade detpdocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpdocumento() {
        return detpdocumento;
    }

    /**
     * Define o valor da propriedade detpdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpdocumento(String value) {
        this.detpdocumento = value;
    }

    /**
     * Obtém o valor da propriedade detpdocumentoabrev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpdocumentoabrev() {
        return detpdocumentoabrev;
    }

    /**
     * Define o valor da propriedade detpdocumentoabrev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpdocumentoabrev(String value) {
        this.detpdocumentoabrev = value;
    }

}
