
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getSelosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSelosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosAssinados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosResponse", propOrder = {
    "selosAssinados"
})
public class GetSelosResponse {

    protected byte[] selosAssinados;

    /**
     * Obtém o valor da propriedade selosAssinados.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosAssinados() {
        return selosAssinados;
    }

    /**
     * Define o valor da propriedade selosAssinados.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosAssinados(byte[] value) {
        this.selosAssinados = value;
    }

}
