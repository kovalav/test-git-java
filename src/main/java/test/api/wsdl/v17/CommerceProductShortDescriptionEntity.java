/**
 * CommerceProductShortDescriptionEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.api.wsdl.v17;

public class CommerceProductShortDescriptionEntity  implements java.io.Serializable {
    private java.lang.String product_id;

    private java.lang.String short_description;

    public CommerceProductShortDescriptionEntity() {
    }

    public CommerceProductShortDescriptionEntity(
           java.lang.String product_id,
           java.lang.String short_description) {
           this.product_id = product_id;
           this.short_description = short_description;
    }


    /**
     * Gets the product_id value for this CommerceProductShortDescriptionEntity.
     * 
     * @return product_id
     */
    public java.lang.String getProduct_id() {
        return product_id;
    }


    /**
     * Sets the product_id value for this CommerceProductShortDescriptionEntity.
     * 
     * @param product_id
     */
    public void setProduct_id(java.lang.String product_id) {
        this.product_id = product_id;
    }


    /**
     * Gets the short_description value for this CommerceProductShortDescriptionEntity.
     * 
     * @return short_description
     */
    public java.lang.String getShort_description() {
        return short_description;
    }


    /**
     * Sets the short_description value for this CommerceProductShortDescriptionEntity.
     * 
     * @param short_description
     */
    public void setShort_description(java.lang.String short_description) {
        this.short_description = short_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommerceProductShortDescriptionEntity)) return false;
        CommerceProductShortDescriptionEntity other = (CommerceProductShortDescriptionEntity) obj;
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
            ((this.short_description==null && other.getShort_description()==null) || 
             (this.short_description!=null &&
              this.short_description.equals(other.getShort_description())));
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
        if (getShort_description() != null) {
            _hashCode += getShort_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommerceProductShortDescriptionEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "commerceProductShortDescriptionEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "short_description"));
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
