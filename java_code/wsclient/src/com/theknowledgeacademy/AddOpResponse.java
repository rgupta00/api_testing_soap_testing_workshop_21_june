
package com.theknowledgeacademy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOpResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOpResponse", propOrder = {
    "addResult"
})
public class AddOpResponse {

    protected int addResult;

    /**
     * Gets the value of the addResult property.
     * 
     */
    public int getAddResult() {
        return addResult;
    }

    /**
     * Sets the value of the addResult property.
     * 
     */
    public void setAddResult(int value) {
        this.addResult = value;
    }

}
