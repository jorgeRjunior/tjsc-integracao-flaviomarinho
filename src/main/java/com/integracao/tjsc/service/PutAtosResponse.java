
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de putAtosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="putAtosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reciboTSR" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putAtosResponse", propOrder = {
    "reciboTSR"
})
public class PutAtosResponse {

    protected byte[] reciboTSR;

    /**
     * Obtém o valor da propriedade reciboTSR.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReciboTSR() {
        return reciboTSR;
    }

    /**
     * Define o valor da propriedade reciboTSR.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReciboTSR(byte[] value) {
        this.reciboTSR = value;
    }

}
