
package com.integracao.tjsc.service;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de juizPaz complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="juizPaz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cdjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cdtpjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detpjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtfimexercicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dtiniexercicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "juizPaz", propOrder = {
    "cdcomarca",
    "cdjuizdepaz",
    "cdtpjuizdepaz",
    "cpf",
    "detpjuizdepaz",
    "dtfimexercicio",
    "dtiniexercicio",
    "nome"
})
public class JuizPaz {

    protected Integer cdcomarca;
    protected Long cdjuizdepaz;
    protected Integer cdtpjuizdepaz;
    protected String cpf;
    protected String detpjuizdepaz;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtfimexercicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtiniexercicio;
    protected String nome;

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
     * Obtém o valor da propriedade cdjuizdepaz.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdjuizdepaz() {
        return cdjuizdepaz;
    }

    /**
     * Define o valor da propriedade cdjuizdepaz.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdjuizdepaz(Long value) {
        this.cdjuizdepaz = value;
    }

    /**
     * Obtém o valor da propriedade cdtpjuizdepaz.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtpjuizdepaz() {
        return cdtpjuizdepaz;
    }

    /**
     * Define o valor da propriedade cdtpjuizdepaz.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtpjuizdepaz(Integer value) {
        this.cdtpjuizdepaz = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade detpjuizdepaz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpjuizdepaz() {
        return detpjuizdepaz;
    }

    /**
     * Define o valor da propriedade detpjuizdepaz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpjuizdepaz(String value) {
        this.detpjuizdepaz = value;
    }

    /**
     * Obtém o valor da propriedade dtfimexercicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtfimexercicio() {
        return dtfimexercicio;
    }

    /**
     * Define o valor da propriedade dtfimexercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtfimexercicio(XMLGregorianCalendar value) {
        this.dtfimexercicio = value;
    }

    /**
     * Obtém o valor da propriedade dtiniexercicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtiniexercicio() {
        return dtiniexercicio;
    }

    /**
     * Define o valor da propriedade dtiniexercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtiniexercicio(XMLGregorianCalendar value) {
        this.dtiniexercicio = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
