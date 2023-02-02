
package com.integracao.tjsc.service;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getTiposDeTestamentoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getTiposDeTestamentoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tiposDeTestamento" type="{http://www.tjsc.jus.br/selo}tipoTestamento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposDeTestamentoResponse", propOrder = {
    "tiposDeTestamento"
})
public class GetTiposDeTestamentoResponse {

    protected List<TipoTestamento> tiposDeTestamento;

    /**
     * Gets the value of the tiposDeTestamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tiposDeTestamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposDeTestamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTestamento }
     * 
     * 
     */
    public List<TipoTestamento> getTiposDeTestamento() {
        if (tiposDeTestamento == null) {
            tiposDeTestamento = new ArrayList<TipoTestamento>();
        }
        return this.tiposDeTestamento;
    }

}
