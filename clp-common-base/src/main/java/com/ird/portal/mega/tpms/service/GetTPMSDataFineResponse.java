
package com.ird.portal.mega.tpms.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTPMSDataFineResponse complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="getTPMSDataFineResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://service.tpms.dsat.mega.com/}TPMSData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTPMSDataFineResponse", propOrder = {
    "_return"
})
public class GetTPMSDataFineResponse {

    @XmlElement(name = "return")
    protected TPMSData _return;

    /**
     * \u83b7\u53d6return\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link TPMSData }
     *     
     */
    public TPMSData getReturn() {
        return _return;
    }

    /**
     * \u8bbe\u7f6ereturn\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link TPMSData }
     *     
     */
    public void setReturn(TPMSData value) {
        this._return = value;
    }

}