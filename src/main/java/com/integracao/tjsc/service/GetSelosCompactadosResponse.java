
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getSelosCompactadosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSelosCompactadosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosCompactados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosCompactadosResponse", propOrder = {
    "selosCompactados"
})
public class GetSelosCompactadosResponse {

    protected byte[] selosCompactados;

    /**
     * Obtém o valor da propriedade selosCompactados.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosCompactados() {
        return selosCompactados;
    }

    /**
     * Define o valor da propriedade selosCompactados.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosCompactados(byte[] value) {
        this.selosCompactados = value;
    }

}
