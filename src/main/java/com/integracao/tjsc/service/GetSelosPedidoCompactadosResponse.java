
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getSelosPedidoCompactadosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSelosPedidoCompactadosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosPedidoCompactados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosPedidoCompactadosResponse", propOrder = {
    "selosPedidoCompactados"
})
public class GetSelosPedidoCompactadosResponse {

    protected byte[] selosPedidoCompactados;

    /**
     * Obtém o valor da propriedade selosPedidoCompactados.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosPedidoCompactados() {
        return selosPedidoCompactados;
    }

    /**
     * Define o valor da propriedade selosPedidoCompactados.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosPedidoCompactados(byte[] value) {
        this.selosPedidoCompactados = value;
    }

}
