
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de escolaridade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="escolaridade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdescolaridade" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="deescolaridade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escolaridade", propOrder = {
    "cdescolaridade",
    "deescolaridade"
})
public class Escolaridade {

    protected Short cdescolaridade;
    protected String deescolaridade;

    /**
     * Obtém o valor da propriedade cdescolaridade.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdescolaridade() {
        return cdescolaridade;
    }

    /**
     * Define o valor da propriedade cdescolaridade.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdescolaridade(Short value) {
        this.cdescolaridade = value;
    }

    /**
     * Obtém o valor da propriedade deescolaridade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeescolaridade() {
        return deescolaridade;
    }

    /**
     * Define o valor da propriedade deescolaridade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeescolaridade(String value) {
        this.deescolaridade = value;
    }

}
