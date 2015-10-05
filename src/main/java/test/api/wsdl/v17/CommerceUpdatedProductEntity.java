/**
 * CommerceUpdatedProductEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.api.wsdl.v17;

public class CommerceUpdatedProductEntity  implements java.io.Serializable {
    private java.lang.String product_id;

    private java.lang.String updated_id;

    private java.lang.String action;

    public CommerceUpdatedProductEntity() {
    }

    public CommerceUpdatedProductEntity(
           java.lang.String product_id,
           java.lang.String updated_id,
           java.lang.String action) {
           this.product_id = product_id;
           this.updated_id = updated_id;
           this.action = action;
    }


    /**
     * Gets the product_id value for this CommerceUpdatedProductEntity.
     * 
     * @return product_id
     */
    public java.lang.String getProduct_id() {
        return product_id;
    }


    /**
     * Sets the product_id value for this CommerceUpdatedProductEntity.
     * 
     * @param product_id
     */
    public void setProduct_id(java.lang.String product_id) {
        this.product_id = product_id;
    }


    /**
     * Gets the updated_id value for this CommerceUpdatedProductEntity.
     * 
     * @return updated_id
     */
    public java.lang.String getUpdated_id() {
        return updated_id;
    }


    /**
     * Sets the updated_id value for this CommerceUpdatedProductEntity.
     * 
     * @param updated_id
     */
    public void setUpdated_id(java.lang.String updated_id) {
        this.updated_id = updated_id;
    }


    /**
     * Gets the action value for this CommerceUpdatedProductEntity.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CommerceUpdatedProductEntity.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommerceUpdatedProductEntity)) return false;
        CommerceUpdatedProductEntity other = (CommerceUpdatedProductEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product_id==null && other.getProduct_id()==null) || 
             (this.product_id!=null &&
              this.product_id.equals(other.getProduct_id()))) &&
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
        if (getProduct_id() != null) {
            _hashCode += getProduct_id().hashCode();
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
        new org.apache.axis.description.TypeDesc(CommerceUpdatedProductEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "commerceUpdatedProductEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_id"));
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
