
package com.integracao.tjsc.service;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getTiposDeCobranca20Response complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getTiposDeCobranca20Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tiposDeCobranca20" type="{http://www.tjsc.jus.br/selo}tipoCobranca20" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposDeCobranca20Response", propOrder = {
    "tiposDeCobranca20"
})
public class GetTiposDeCobranca20Response {

    protected List<TipoCobranca20> tiposDeCobranca20;

    /**
     * Gets the value of the tiposDeCobranca20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tiposDeCobranca20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposDeCobranca20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoCobranca20 }
     * 
     * 
     */
    public List<TipoCobranca20> getTiposDeCobranca20() {
        if (tiposDeCobranca20 == null) {
            tiposDeCobranca20 = new ArrayList<TipoCobranca20>();
        }
        return this.tiposDeCobranca20;
    }

}
