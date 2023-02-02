
package com.integracao.tjsc.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enteDeclaradoUtilidadePublicaEstadual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="enteDeclaradoUtilidadePublicaEstadual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cdentepub" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dtLei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtLeiExtenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeComarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeComarcaEntidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeEntidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enteDeclaradoUtilidadePublicaEstadual", propOrder = {
    "cdcomarca",
    "cdentepub",
    "dtLei",
    "dtLeiExtenso",
    "lei",
    "nomeComarca",
    "nomeComarcaEntidade",
    "nomeEntidade"
})
public class EnteDeclaradoUtilidadePublicaEstadual {

    protected Integer cdcomarca;
    protected Long cdentepub;
    protected String dtLei;
    protected String dtLeiExtenso;
    protected String lei;
    protected String nomeComarca;
    protected String nomeComarcaEntidade;
    protected String nomeEntidade;

    /**
     * Obtém o valor da propriedade cdcomarca.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdcomarca() {
        return cdcomarca;
    }

    /**
     * Define o valor da propriedade cdcomarca.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdcomarca(Integer value) {
        this.cdcomarca = value;
    }

    /**
     * Obtém o valor da propriedade cdentepub.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdentepub() {
        return cdentepub;
    }

    /**
     * Define o valor da propriedade cdentepub.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdentepub(Long value) {
        this.cdentepub = value;
    }

    /**
     * Obtém o valor da propriedade dtLei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtLei() {
        return dtLei;
    }

    /**
     * Define o valor da propriedade dtLei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtLei(String value) {
        this.dtLei = value;
    }

    /**
     * Obtém o valor da propriedade dtLeiExtenso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtLeiExtenso() {
        return dtLeiExtenso;
    }

    /**
     * Define o valor da propriedade dtLeiExtenso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtLeiExtenso(String value) {
        this.dtLeiExtenso = value;
    }

    /**
     * Obtém o valor da propriedade lei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLei() {
        return lei;
    }

    /**
     * Define o valor da propriedade lei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLei(String value) {
        this.lei = value;
    }

    /**
     * Obtém o valor da propriedade nomeComarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeComarca() {
        return nomeComarca;
    }

    /**
     * Define o valor da propriedade nomeComarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeComarca(String value) {
        this.nomeComarca = value;
    }

    /**
     * Obtém o valor da propriedade nomeComarcaEntidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeComarcaEntidade() {
        return nomeComarcaEntidade;
    }

    /**
     * Define o valor da propriedade nomeComarcaEntidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeComarcaEntidade(String value) {
        this.nomeComarcaEntidade = value;
    }

    /**
     * Obtém o valor da propriedade nomeEntidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEntidade() {
        return nomeEntidade;
    }

    /**
     * Define o valor da propriedade nomeEntidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEntidade(String value) {
        this.nomeEntidade = value;
    }

}
