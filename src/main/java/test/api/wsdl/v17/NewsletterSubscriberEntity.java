/**
 * NewsletterSubscriberEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.api.wsdl.v17;

public class NewsletterSubscriberEntity  implements java.io.Serializable {
    private java.lang.Integer subscriber_id;

    private java.lang.Integer subscriber_status;

    private java.lang.Integer store_id;

    private java.lang.String change_status_at;

    private java.lang.String subscriber_email;

    private java.lang.Float total_sales;

    private java.lang.Float avg_sales;

    private java.lang.Integer total_orders;

    private test.api.wsdl.v17.CustomerCustomerEntityExtended customer_info;

    public NewsletterSubscriberEntity() {
    }

    public NewsletterSubscriberEntity(
           java.lang.Integer subscriber_id,
           java.lang.Integer subscriber_status,
           java.lang.Integer store_id,
           java.lang.String change_status_at,
           java.lang.String subscriber_email,
           java.lang.Float total_sales,
           java.lang.Float avg_sales,
           java.lang.Integer total_orders,
           test.api.wsdl.v17.CustomerCustomerEntityExtended customer_info) {
           this.subscriber_id = subscriber_id;
           this.subscriber_status = subscriber_status;
           this.store_id = store_id;
           this.change_status_at = change_status_at;
           this.subscriber_email = subscriber_email;
           this.total_sales = total_sales;
           this.avg_sales = avg_sales;
           this.total_orders = total_orders;
           this.customer_info = customer_info;
    }


    /**
     * Gets the subscriber_id value for this NewsletterSubscriberEntity.
     * 
     * @return subscriber_id
     */
    public java.lang.Integer getSubscriber_id() {
        return subscriber_id;
    }


    /**
     * Sets the subscriber_id value for this NewsletterSubscriberEntity.
     * 
     * @param subscriber_id
     */
    public void setSubscriber_id(java.lang.Integer subscriber_id) {
        this.subscriber_id = subscriber_id;
    }


    /**
     * Gets the subscriber_status value for this NewsletterSubscriberEntity.
     * 
     * @return subscriber_status
     */
    public java.lang.Integer getSubscriber_status() {
        return subscriber_status;
    }


    /**
     * Sets the subscriber_status value for this NewsletterSubscriberEntity.
     * 
     * @param subscriber_status
     */
    public void setSubscriber_status(java.lang.Integer subscriber_status) {
        this.subscriber_status = subscriber_status;
    }


    /**
     * Gets the store_id value for this NewsletterSubscriberEntity.
     * 
     * @return store_id
     */
    public java.lang.Integer getStore_id() {
        return store_id;
    }


    /**
     * Sets the store_id value for this NewsletterSubscriberEntity.
     * 
     * @param store_id
     */
    public void setStore_id(java.lang.Integer store_id) {
        this.store_id = store_id;
    }


    /**
     * Gets the change_status_at value for this NewsletterSubscriberEntity.
     * 
     * @return change_status_at
     */
    public java.lang.String getChange_status_at() {
        return change_status_at;
    }


    /**
     * Sets the change_status_at value for this NewsletterSubscriberEntity.
     * 
     * @param change_status_at
     */
    public void setChange_status_at(java.lang.String change_status_at) {
        this.change_status_at = change_status_at;
    }


    /**
     * Gets the subscriber_email value for this NewsletterSubscriberEntity.
     * 
     * @return subscriber_email
     */
    public java.lang.String getSubscriber_email() {
        return subscriber_email;
    }


    /**
     * Sets the subscriber_email value for this NewsletterSubscriberEntity.
     * 
     * @param subscriber_email
     */
    public void setSubscriber_email(java.lang.String subscriber_email) {
        this.subscriber_email = subscriber_email;
    }


    /**
     * Gets the total_sales value for this NewsletterSubscriberEntity.
     * 
     * @return total_sales
     */
    public java.lang.Float getTotal_sales() {
        return total_sales;
    }


    /**
     * Sets the total_sales value for this NewsletterSubscriberEntity.
     * 
     * @param total_sales
     */
    public void setTotal_sales(java.lang.Float total_sales) {
        this.total_sales = total_sales;
    }


    /**
     * Gets the avg_sales value for this NewsletterSubscriberEntity.
     * 
     * @return avg_sales
     */
    public java.lang.Float getAvg_sales() {
        return avg_sales;
    }


    /**
     * Sets the avg_sales value for this NewsletterSubscriberEntity.
     * 
     * @param avg_sales
     */
    public void setAvg_sales(java.lang.Float avg_sales) {
        this.avg_sales = avg_sales;
    }


    /**
     * Gets the total_orders value for this NewsletterSubscriberEntity.
     * 
     * @return total_orders
     */
    public java.lang.Integer getTotal_orders() {
        return total_orders;
    }


    /**
     * Sets the total_orders value for this NewsletterSubscriberEntity.
     * 
     * @param total_orders
     */
    public void setTotal_orders(java.lang.Integer total_orders) {
        this.total_orders = total_orders;
    }


    /**
     * Gets the customer_info value for this NewsletterSubscriberEntity.
     * 
     * @return customer_info
     */
    public test.api.wsdl.v17.CustomerCustomerEntityExtended getCustomer_info() {
        return customer_info;
    }


    /**
     * Sets the customer_info value for this NewsletterSubscriberEntity.
     * 
     * @param customer_info
     */
    public void setCustomer_info(test.api.wsdl.v17.CustomerCustomerEntityExtended customer_info) {
        this.customer_info = customer_info;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewsletterSubscriberEntity)) return false;
        NewsletterSubscriberEntity other = (NewsletterSubscriberEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriber_id==null && other.getSubscriber_id()==null) || 
             (this.subscriber_id!=null &&
              this.subscriber_id.equals(other.getSubscriber_id()))) &&
            ((this.subscriber_status==null && other.getSubscriber_status()==null) || 
             (this.subscriber_status!=null &&
              this.subscriber_status.equals(other.getSubscriber_status()))) &&
            ((this.store_id==null && other.getStore_id()==null) || 
             (this.store_id!=null &&
              this.store_id.equals(other.getStore_id()))) &&
            ((this.change_status_at==null && other.getChange_status_at()==null) || 
             (this.change_status_at!=null &&
              this.change_status_at.equals(other.getChange_status_at()))) &&
            ((this.subscriber_email==null && other.getSubscriber_email()==null) || 
             (this.subscriber_email!=null &&
              this.subscriber_email.equals(other.getSubscriber_email()))) &&
            ((this.total_sales==null && other.getTotal_sales()==null) || 
             (this.total_sales!=null &&
              this.total_sales.equals(other.getTotal_sales()))) &&
            ((this.avg_sales==null && other.getAvg_sales()==null) || 
             (this.avg_sales!=null &&
              this.avg_sales.equals(other.getAvg_sales()))) &&
            ((this.total_orders==null && other.getTotal_orders()==null) || 
             (this.total_orders!=null &&
              this.total_orders.equals(other.getTotal_orders()))) &&
            ((this.customer_info==null && other.getCustomer_info()==null) || 
             (this.customer_info!=null &&
              this.customer_info.equals(other.getCustomer_info())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSubscriber_id() != null) {
            _hashCode += getSubscriber_id().hashCode();
        }
        if (getSubscriber_status() != null) {
            _hashCode += getSubscriber_status().hashCode();
        }
        if (getStore_id() != null) {
            _hashCode += getStore_id().hashCode();
        }
        if (getChange_status_at() != null) {
            _hashCode += getChange_status_at().hashCode();
        }
        if (getSubscriber_email() != null) {
            _hashCode += getSubscriber_email().hashCode();
        }
        if (getTotal_sales() != null) {
            _hashCode += getTotal_sales().hashCode();
        }
        if (getAvg_sales() != null) {
            _hashCode += getAvg_sales().hashCode();
        }
        if (getTotal_orders() != null) {
            _hashCode += getTotal_orders().hashCode();
        }
        if (getCustomer_info() != null) {
            _hashCode += getCustomer_info().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewsletterSubscriberEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "newsletterSubscriberEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriber_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriber_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("store_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "store_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_status_at");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change_status_at"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriber_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_sales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avg_sales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avg_sales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_orders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_orders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "customerCustomerEntityExtended"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
