
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de decodificaReciboResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="decodificaReciboResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reciboDecodificado" type="{http://www.tjsc.jus.br/selo}reciboProtocolo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decodificaReciboResponse", propOrder = {
    "reciboDecodificado"
})
public class DecodificaReciboResponse {

    protected ReciboProtocolo reciboDecodificado;

    /**
     * Obtém o valor da propriedade reciboDecodificado.
     * 
     * @return
     *     possible object is
     *     {@link ReciboProtocolo }
     *     
     */
    public ReciboProtocolo getReciboDecodificado() {
        return reciboDecodificado;
    }

    /**
     * Define o valor da propriedade reciboDecodificado.
     * 
     * @param value
     *     allowed object is
     *     {@link ReciboProtocolo }
     *     
     */
    public void setReciboDecodificado(ReciboProtocolo value) {
        this.reciboDecodificado = value;
    }

}
