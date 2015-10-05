/**
 * CommerceTaxRateInfoEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package test.api.wsdl.v17;

public class CommerceTaxRateInfoEntity  implements java.io.Serializable {
    private java.lang.String tax_rate_code;

    private java.lang.String tax_rate_percent;

    public CommerceTaxRateInfoEntity() {
    }

    public CommerceTaxRateInfoEntity(
           java.lang.String tax_rate_code,
           java.lang.String tax_rate_percent) {
           this.tax_rate_code = tax_rate_code;
           this.tax_rate_percent = tax_rate_percent;
    }


    /**
     * Gets the tax_rate_code value for this CommerceTaxRateInfoEntity.
     * 
     * @return tax_rate_code
     */
    public java.lang.String getTax_rate_code() {
        return tax_rate_code;
    }


    /**
     * Sets the tax_rate_code value for this CommerceTaxRateInfoEntity.
     * 
     * @param tax_rate_code
     */
    public void setTax_rate_code(java.lang.String tax_rate_code) {
        this.tax_rate_code = tax_rate_code;
    }


    /**
     * Gets the tax_rate_percent value for this CommerceTaxRateInfoEntity.
     * 
     * @return tax_rate_percent
     */
    public java.lang.String getTax_rate_percent() {
        return tax_rate_percent;
    }


    /**
     * Sets the tax_rate_percent value for this CommerceTaxRateInfoEntity.
     * 
     * @param tax_rate_percent
     */
    public void setTax_rate_percent(java.lang.String tax_rate_percent) {
        this.tax_rate_percent = tax_rate_percent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommerceTaxRateInfoEntity)) return false;
        CommerceTaxRateInfoEntity other = (CommerceTaxRateInfoEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tax_rate_code==null && other.getTax_rate_code()==null) || 
             (this.tax_rate_code!=null &&
              this.tax_rate_code.equals(other.getTax_rate_code()))) &&
            ((this.tax_rate_percent==null && other.getTax_rate_percent()==null) || 
             (this.tax_rate_percent!=null &&
              this.tax_rate_percent.equals(other.getTax_rate_percent())));
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
        if (getTax_rate_code() != null) {
            _hashCode += getTax_rate_code().hashCode();
        }
        if (getTax_rate_percent() != null) {
            _hashCode += getTax_rate_percent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommerceTaxRateInfoEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "commerceTaxRateInfoEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_rate_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_rate_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_rate_percent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_rate_percent"));
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
