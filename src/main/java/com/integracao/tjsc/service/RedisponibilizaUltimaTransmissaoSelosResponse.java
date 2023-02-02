
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de redisponibilizaUltimaTransmissaoSelosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="redisponibilizaUltimaTransmissaoSelosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroSelosLiberados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redisponibilizaUltimaTransmissaoSelosResponse", propOrder = {
    "numeroSelosLiberados"
})
public class RedisponibilizaUltimaTransmissaoSelosResponse {

    protected int numeroSelosLiberados;

    /**
     * Obtém o valor da propriedade numeroSelosLiberados.
     * 
     */
    public int getNumeroSelosLiberados() {
        return numeroSelosLiberados;
    }

    /**
     * Define o valor da propriedade numeroSelosLiberados.
     * 
     */
    public void setNumeroSelosLiberados(int value) {
        this.numeroSelosLiberados = value;
    }

}
