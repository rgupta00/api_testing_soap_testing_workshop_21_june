
package com.theknowledgeacademy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiplyOpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiplyOpResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mulResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplyOpResponse", propOrder = {
    "mulResult"
})
public class MultiplyOpResponse {

    protected int mulResult;

    /**
     * Gets the value of the mulResult property.
     * 
     */
    public int getMulResult() {
        return mulResult;
    }

    /**
     * Sets the value of the mulResult property.
     * 
     */
    public void setMulResult(int value) {
        this.mulResult = value;
    }

}
