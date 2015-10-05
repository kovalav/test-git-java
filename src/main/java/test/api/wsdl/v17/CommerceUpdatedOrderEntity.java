/**
 * CommerceUpdatedOrderEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.api.wsdl.v17;

public class CommerceUpdatedOrderEntity  implements java.io.Serializable {
    private java.lang.String increment_id;

    private java.lang.String updated_id;

    private java.lang.String action;

    public CommerceUpdatedOrderEntity() {
    }

    public CommerceUpdatedOrderEntity(
           java.lang.String increment_id,
           java.lang.String updated_id,
           java.lang.String action) {
           this.increment_id = increment_id;
           this.updated_id = updated_id;
           this.action = action;
    }


    /**
     * Gets the increment_id value for this CommerceUpdatedOrderEntity.
     * 
     * @return increment_id
     */
    public java.lang.String getIncrement_id() {
        return increment_id;
    }


    /**
     * Sets the increment_id value for this CommerceUpdatedOrderEntity.
     * 
     * @param increment_id
     */
    public void setIncrement_id(java.lang.String increment_id) {
        this.increment_id = increment_id;
    }


    /**
     * Gets the updated_id value for this CommerceUpdatedOrderEntity.
     * 
     * @return updated_id
     */
    public java.lang.String getUpdated_id() {
        return updated_id;
    }


    /**
     * Sets the updated_id value for this CommerceUpdatedOrderEntity.
     * 
     * @param updated_id
     */
    public void setUpdated_id(java.lang.String updated_id) {
        this.updated_id = updated_id;
    }


    /**
     * Gets the action value for this CommerceUpdatedOrderEntity.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CommerceUpdatedOrderEntity.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommerceUpdatedOrderEntity)) return false;
        CommerceUpdatedOrderEntity other = (CommerceUpdatedOrderEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.increment_id==null && other.getIncrement_id()==null) || 
             (this.increment_id!=null &&
              this.increment_id.equals(other.getIncrement_id()))) &&
            ((this.updated_id==null && other.getUpdated_id()==null) || 
             (this.updated_id!=null &&
              this.updated_id.equals(other.getUpdated_id()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction())));
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
        if (getIncrement_id() != null) {
            _hashCode += getIncrement_id().hashCode();
        }
        if (getUpdated_id() != null) {
            _hashCode += getUpdated_id().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommerceUpdatedOrderEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "commerceUpdatedOrderEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("increment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "increment_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
