
package com.sforce.soap.enterprise;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeLayoutButton complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeLayoutButton">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="behavior" type="{urn:enterprise.soap.sforce.com}WebLinkWindowType" minOccurs="0"/>
 *         &lt;element name="colors" type="{urn:enterprise.soap.sforce.com}DescribeColor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentSource" type="{urn:enterprise.soap.sforce.com}WebLinkType" minOccurs="0"/>
 *         &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="icons" type="{urn:enterprise.soap.sforce.com}DescribeIcon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="menubar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overridden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resizeable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scrollbars" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showsLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showsStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="toolbar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="windowPosition" type="{urn:enterprise.soap.sforce.com}WebLinkPosition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeLayoutButton", namespace = "urn:enterprise.soap.sforce.com", propOrder = {
    "behavior",
    "colors",
    "content",
    "contentSource",
    "custom",
    "encoding",
    "height",
    "icons",
    "label",
    "menubar",
    "name",
    "overridden",
    "resizeable",
    "scrollbars",
    "showsLocation",
    "showsStatus",
    "toolbar",
    "url",
    "width",
    "windowPosition"
})
public class DescribeLayoutButtonType {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected WebLinkWindowTypeType behavior;
    protected List<DescribeColorType> colors;
    @XmlElement(nillable = true)
    protected String content;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected WebLinkTypeType contentSource;
    protected boolean custom;
    @XmlElement(nillable = true)
    protected String encoding;
    @XmlElement(nillable = true)
    protected Integer height;
    protected List<DescribeIconType> icons;
    @XmlElement(required = true, nillable = true)
    protected String label;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean menubar;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean overridden;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean resizeable;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean scrollbars;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean showsLocation;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean showsStatus;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean toolbar;
    @XmlElement(nillable = true)
    protected String url;
    @XmlElement(nillable = true)
    protected Integer width;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected WebLinkPositionType windowPosition;

    /**
     * Gets the value of the behavior property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkWindowTypeType }
     *     
     */
    public WebLinkWindowTypeType getBehavior() {
        return behavior;
    }

    /**
     * Sets the value of the behavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkWindowTypeType }
     *     
     */
    public void setBehavior(WebLinkWindowTypeType value) {
        this.behavior = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeColorType }
     * 
     * 
     */
    public List<DescribeColorType> getColors() {
        if (colors == null) {
            colors = new ArrayList<DescribeColorType>();
        }
        return this.colors;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentSource property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkTypeType }
     *     
     */
    public WebLinkTypeType getContentSource() {
        return contentSource;
    }

    /**
     * Sets the value of the contentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkTypeType }
     *     
     */
    public void setContentSource(WebLinkTypeType value) {
        this.contentSource = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     */
    public boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     */
    public void setCustom(boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the icons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeIconType }
     * 
     * 
     */
    public List<DescribeIconType> getIcons() {
        if (icons == null) {
            icons = new ArrayList<DescribeIconType>();
        }
        return this.icons;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the menubar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMenubar() {
        return menubar;
    }

    /**
     * Sets the value of the menubar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMenubar(Boolean value) {
        this.menubar = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the overridden property.
     * 
     */
    public boolean isOverridden() {
        return overridden;
    }

    /**
     * Sets the value of the overridden property.
     * 
     */
    public void setOverridden(boolean value) {
        this.overridden = value;
    }

    /**
     * Gets the value of the resizeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResizeable() {
        return resizeable;
    }

    /**
     * Sets the value of the resizeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResizeable(Boolean value) {
        this.resizeable = value;
    }

    /**
     * Gets the value of the scrollbars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScrollbars() {
        return scrollbars;
    }

    /**
     * Sets the value of the scrollbars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScrollbars(Boolean value) {
        this.scrollbars = value;
    }

    /**
     * Gets the value of the showsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowsLocation() {
        return showsLocation;
    }

    /**
     * Sets the value of the showsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowsLocation(Boolean value) {
        this.showsLocation = value;
    }

    /**
     * Gets the value of the showsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowsStatus() {
        return showsStatus;
    }

    /**
     * Sets the value of the showsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowsStatus(Boolean value) {
        this.showsStatus = value;
    }

    /**
     * Gets the value of the toolbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToolbar() {
        return toolbar;
    }

    /**
     * Sets the value of the toolbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToolbar(Boolean value) {
        this.toolbar = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Gets the value of the windowPosition property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkPositionType }
     *     
     */
    public WebLinkPositionType getWindowPosition() {
        return windowPosition;
    }

    /**
     * Sets the value of the windowPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkPositionType }
     *     
     */
    public void setWindowPosition(WebLinkPositionType value) {
        this.windowPosition = value;
    }

}
