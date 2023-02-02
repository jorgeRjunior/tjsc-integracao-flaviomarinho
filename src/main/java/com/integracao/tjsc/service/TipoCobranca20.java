
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoCobranca20 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoCobranca20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipocobranca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dispositivolegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmtipocobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCobranca20", propOrder = {
    "cdtipocobranca",
    "dispositivolegal",
    "nmtipocobranca"
})
public class TipoCobranca20 {

    protected Long cdtipocobranca;
    protected String dispositivolegal;
    protected String nmtipocobranca;

    /**
     * Obtém o valor da propriedade cdtipocobranca.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipocobranca() {
        return cdtipocobranca;
    }

    /**
     * Define o valor da propriedade cdtipocobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipocobranca(Long value) {
        this.cdtipocobranca = value;
    }

    /**
     * Obtém o valor da propriedade dispositivolegal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositivolegal() {
        return dispositivolegal;
    }

    /**
     * Define o valor da propriedade dispositivolegal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositivolegal(String value) {
        this.dispositivolegal = value;
    }

    /**
     * Obtém o valor da propriedade nmtipocobranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipocobranca() {
        return nmtipocobranca;
    }

    /**
     * Define o valor da propriedade nmtipocobranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipocobranca(String value) {
        this.nmtipocobranca = value;
    }

}
