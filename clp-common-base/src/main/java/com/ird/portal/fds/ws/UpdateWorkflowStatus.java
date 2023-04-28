
package com.ird.portal.fds.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="txnNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statusKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statusDisplayZh" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statusDisplayPt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "txnNo",
    "statusKey",
    "statusDisplayZh",
    "statusDisplayPt"
})
@XmlRootElement(name = "updateWorkflowStatus")
public class UpdateWorkflowStatus {

    @XmlElement(required = true)
    protected String txnNo;
    @XmlElement(required = true)
    protected String statusKey;
    @XmlElement(required = true)
    protected String statusDisplayZh;
    @XmlElement(required = true)
    protected String statusDisplayPt;

    /**
     * \u83b7\u53d6txnNo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnNo() {
        return txnNo;
    }

    /**
     * \u8bbe\u7f6etxnNo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnNo(String value) {
        this.txnNo = value;
    }

    /**
     * \u83b7\u53d6statusKey\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusKey() {
        return statusKey;
    }

    /**
     * \u8bbe\u7f6estatusKey\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusKey(String value) {
        this.statusKey = value;
    }

    /**
     * \u83b7\u53d6statusDisplayZh\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDisplayZh() {
        return statusDisplayZh;
    }

    /**
     * \u8bbe\u7f6estatusDisplayZh\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDisplayZh(String value) {
        this.statusDisplayZh = value;
    }

    /**
     * \u83b7\u53d6statusDisplayPt\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDisplayPt() {
        return statusDisplayPt;
    }

    /**
     * \u8bbe\u7f6estatusDisplayPt\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDisplayPt(String value) {
        this.statusDisplayPt = value;
    }

}
