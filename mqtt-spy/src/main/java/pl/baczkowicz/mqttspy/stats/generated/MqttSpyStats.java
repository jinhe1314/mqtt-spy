//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.03 at 10:05:39 PM BST 
//


package pl.baczkowicz.mqttspy.stats.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for MqttSpyStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MqttSpyStats"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Connections" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Subscriptions" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="MessagesPublished" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="MessagesReceived" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MqttSpyStats", propOrder = {
    "id",
    "startDate",
    "connections",
    "subscriptions",
    "messagesPublished",
    "messagesReceived"
})
public class MqttSpyStats
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Connections")
    protected long connections;
    @XmlElement(name = "Subscriptions")
    protected long subscriptions;
    @XmlElement(name = "MessagesPublished")
    protected long messagesPublished;
    @XmlElement(name = "MessagesReceived")
    protected long messagesReceived;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     */
    public long getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     */
    public void setConnections(long value) {
        this.connections = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     */
    public long getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     */
    public void setSubscriptions(long value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the messagesPublished property.
     * 
     */
    public long getMessagesPublished() {
        return messagesPublished;
    }

    /**
     * Sets the value of the messagesPublished property.
     * 
     */
    public void setMessagesPublished(long value) {
        this.messagesPublished = value;
    }

    /**
     * Gets the value of the messagesReceived property.
     * 
     */
    public long getMessagesReceived() {
        return messagesReceived;
    }

    /**
     * Sets the value of the messagesReceived property.
     * 
     */
    public void setMessagesReceived(long value) {
        this.messagesReceived = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            long theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate);
        }
        {
            long theConnections;
            theConnections = this.getConnections();
            strategy.appendField(locator, this, "connections", buffer, theConnections);
        }
        {
            long theSubscriptions;
            theSubscriptions = this.getSubscriptions();
            strategy.appendField(locator, this, "subscriptions", buffer, theSubscriptions);
        }
        {
            long theMessagesPublished;
            theMessagesPublished = this.getMessagesPublished();
            strategy.appendField(locator, this, "messagesPublished", buffer, theMessagesPublished);
        }
        {
            long theMessagesReceived;
            theMessagesReceived = this.getMessagesReceived();
            strategy.appendField(locator, this, "messagesReceived", buffer, theMessagesReceived);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MqttSpyStats)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MqttSpyStats that = ((MqttSpyStats) object);
        {
            long lhsID;
            lhsID = this.getID();
            long rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsStartDate;
            lhsStartDate = this.getStartDate();
            XMLGregorianCalendar rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate)) {
                return false;
            }
        }
        {
            long lhsConnections;
            lhsConnections = this.getConnections();
            long rhsConnections;
            rhsConnections = that.getConnections();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connections", lhsConnections), LocatorUtils.property(thatLocator, "connections", rhsConnections), lhsConnections, rhsConnections)) {
                return false;
            }
        }
        {
            long lhsSubscriptions;
            lhsSubscriptions = this.getSubscriptions();
            long rhsSubscriptions;
            rhsSubscriptions = that.getSubscriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriptions", lhsSubscriptions), LocatorUtils.property(thatLocator, "subscriptions", rhsSubscriptions), lhsSubscriptions, rhsSubscriptions)) {
                return false;
            }
        }
        {
            long lhsMessagesPublished;
            lhsMessagesPublished = this.getMessagesPublished();
            long rhsMessagesPublished;
            rhsMessagesPublished = that.getMessagesPublished();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messagesPublished", lhsMessagesPublished), LocatorUtils.property(thatLocator, "messagesPublished", rhsMessagesPublished), lhsMessagesPublished, rhsMessagesPublished)) {
                return false;
            }
        }
        {
            long lhsMessagesReceived;
            lhsMessagesReceived = this.getMessagesReceived();
            long rhsMessagesReceived;
            rhsMessagesReceived = that.getMessagesReceived();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messagesReceived", lhsMessagesReceived), LocatorUtils.property(thatLocator, "messagesReceived", rhsMessagesReceived), lhsMessagesReceived, rhsMessagesReceived)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            long theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate);
        }
        {
            long theConnections;
            theConnections = this.getConnections();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connections", theConnections), currentHashCode, theConnections);
        }
        {
            long theSubscriptions;
            theSubscriptions = this.getSubscriptions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriptions", theSubscriptions), currentHashCode, theSubscriptions);
        }
        {
            long theMessagesPublished;
            theMessagesPublished = this.getMessagesPublished();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messagesPublished", theMessagesPublished), currentHashCode, theMessagesPublished);
        }
        {
            long theMessagesReceived;
            theMessagesReceived = this.getMessagesReceived();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messagesReceived", theMessagesReceived), currentHashCode, theMessagesReceived);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof MqttSpyStats) {
            final MqttSpyStats copy = ((MqttSpyStats) draftCopy);
            {
                long sourceID;
                sourceID = this.getID();
                long copyID = strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID);
                copy.setID(copyID);
            }
            if (this.startDate!= null) {
                XMLGregorianCalendar sourceStartDate;
                sourceStartDate = this.getStartDate();
                XMLGregorianCalendar copyStartDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "startDate", sourceStartDate), sourceStartDate));
                copy.setStartDate(copyStartDate);
            } else {
                copy.startDate = null;
            }
            {
                long sourceConnections;
                sourceConnections = this.getConnections();
                long copyConnections = strategy.copy(LocatorUtils.property(locator, "connections", sourceConnections), sourceConnections);
                copy.setConnections(copyConnections);
            }
            {
                long sourceSubscriptions;
                sourceSubscriptions = this.getSubscriptions();
                long copySubscriptions = strategy.copy(LocatorUtils.property(locator, "subscriptions", sourceSubscriptions), sourceSubscriptions);
                copy.setSubscriptions(copySubscriptions);
            }
            {
                long sourceMessagesPublished;
                sourceMessagesPublished = this.getMessagesPublished();
                long copyMessagesPublished = strategy.copy(LocatorUtils.property(locator, "messagesPublished", sourceMessagesPublished), sourceMessagesPublished);
                copy.setMessagesPublished(copyMessagesPublished);
            }
            {
                long sourceMessagesReceived;
                sourceMessagesReceived = this.getMessagesReceived();
                long copyMessagesReceived = strategy.copy(LocatorUtils.property(locator, "messagesReceived", sourceMessagesReceived), sourceMessagesReceived);
                copy.setMessagesReceived(copyMessagesReceived);
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MqttSpyStats();
    }

}
