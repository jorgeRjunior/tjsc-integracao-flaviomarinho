
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getSelosPedidoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSelosPedidoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosPedido" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosPedidoResponse", propOrder = {
    "selosPedido"
})
public class GetSelosPedidoResponse {

    protected byte[] selosPedido;

    /**
     * Obtém o valor da propriedade selosPedido.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosPedido() {
        return selosPedido;
    }

    /**
     * Define o valor da propriedade selosPedido.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosPedido(byte[] value) {
        this.selosPedido = value;
    }

}
