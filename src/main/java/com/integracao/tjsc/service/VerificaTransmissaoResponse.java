
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de verificaTransmissaoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="verificaTransmissaoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reciboTSRarmazenado" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaTransmissaoResponse", propOrder = {
    "reciboTSRarmazenado"
})
public class VerificaTransmissaoResponse {

    protected byte[] reciboTSRarmazenado;

    /**
     * Obtém o valor da propriedade reciboTSRarmazenado.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReciboTSRarmazenado() {
        return reciboTSRarmazenado;
    }

    /**
     * Define o valor da propriedade reciboTSRarmazenado.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReciboTSRarmazenado(byte[] value) {
        this.reciboTSRarmazenado = value;
    }

}
