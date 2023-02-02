
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de banco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="banco"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdbanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmbanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "banco", propOrder = {
    "cdbanco",
    "nmbanco"
})
public class Banco {

    protected String cdbanco;
    protected String nmbanco;

    /**
     * Obtém o valor da propriedade cdbanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdbanco() {
        return cdbanco;
    }

    /**
     * Define o valor da propriedade cdbanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdbanco(String value) {
        this.cdbanco = value;
    }

    /**
     * Obtém o valor da propriedade nmbanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbanco() {
        return nmbanco;
    }

    /**
     * Define o valor da propriedade nmbanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbanco(String value) {
        this.nmbanco = value;
    }

}
