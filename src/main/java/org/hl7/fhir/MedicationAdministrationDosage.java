/*
 * XML Type:  MedicationAdministration.Dosage
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationAdministrationDosage
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML MedicationAdministration.Dosage(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface MedicationAdministrationDosage extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MedicationAdministrationDosage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("medicationadministrationdosage0a12type");
    
    /**
     * Gets the "timingDateTime" element
     */
    org.hl7.fhir.DateTime getTimingDateTime();
    
    /**
     * True if has "timingDateTime" element
     */
    boolean isSetTimingDateTime();
    
    /**
     * Sets the "timingDateTime" element
     */
    void setTimingDateTime(org.hl7.fhir.DateTime timingDateTime);
    
    /**
     * Appends and returns a new empty "timingDateTime" element
     */
    org.hl7.fhir.DateTime addNewTimingDateTime();
    
    /**
     * Unsets the "timingDateTime" element
     */
    void unsetTimingDateTime();
    
    /**
     * Gets the "timingPeriod" element
     */
    org.hl7.fhir.Period getTimingPeriod();
    
    /**
     * True if has "timingPeriod" element
     */
    boolean isSetTimingPeriod();
    
    /**
     * Sets the "timingPeriod" element
     */
    void setTimingPeriod(org.hl7.fhir.Period timingPeriod);
    
    /**
     * Appends and returns a new empty "timingPeriod" element
     */
    org.hl7.fhir.Period addNewTimingPeriod();
    
    /**
     * Unsets the "timingPeriod" element
     */
    void unsetTimingPeriod();
    
    /**
     * Gets the "asNeededBoolean" element
     */
    org.hl7.fhir.Boolean getAsNeededBoolean();
    
    /**
     * True if has "asNeededBoolean" element
     */
    boolean isSetAsNeededBoolean();
    
    /**
     * Sets the "asNeededBoolean" element
     */
    void setAsNeededBoolean(org.hl7.fhir.Boolean asNeededBoolean);
    
    /**
     * Appends and returns a new empty "asNeededBoolean" element
     */
    org.hl7.fhir.Boolean addNewAsNeededBoolean();
    
    /**
     * Unsets the "asNeededBoolean" element
     */
    void unsetAsNeededBoolean();
    
    /**
     * Gets the "asNeededCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept getAsNeededCodeableConcept();
    
    /**
     * True if has "asNeededCodeableConcept" element
     */
    boolean isSetAsNeededCodeableConcept();
    
    /**
     * Sets the "asNeededCodeableConcept" element
     */
    void setAsNeededCodeableConcept(org.hl7.fhir.CodeableConcept asNeededCodeableConcept);
    
    /**
     * Appends and returns a new empty "asNeededCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept addNewAsNeededCodeableConcept();
    
    /**
     * Unsets the "asNeededCodeableConcept" element
     */
    void unsetAsNeededCodeableConcept();
    
    /**
     * Gets the "site" element
     */
    org.hl7.fhir.CodeableConcept getSite();
    
    /**
     * True if has "site" element
     */
    boolean isSetSite();
    
    /**
     * Sets the "site" element
     */
    void setSite(org.hl7.fhir.CodeableConcept site);
    
    /**
     * Appends and returns a new empty "site" element
     */
    org.hl7.fhir.CodeableConcept addNewSite();
    
    /**
     * Unsets the "site" element
     */
    void unsetSite();
    
    /**
     * Gets the "route" element
     */
    org.hl7.fhir.CodeableConcept getRoute();
    
    /**
     * True if has "route" element
     */
    boolean isSetRoute();
    
    /**
     * Sets the "route" element
     */
    void setRoute(org.hl7.fhir.CodeableConcept route);
    
    /**
     * Appends and returns a new empty "route" element
     */
    org.hl7.fhir.CodeableConcept addNewRoute();
    
    /**
     * Unsets the "route" element
     */
    void unsetRoute();
    
    /**
     * Gets the "method" element
     */
    org.hl7.fhir.CodeableConcept getMethod();
    
    /**
     * True if has "method" element
     */
    boolean isSetMethod();
    
    /**
     * Sets the "method" element
     */
    void setMethod(org.hl7.fhir.CodeableConcept method);
    
    /**
     * Appends and returns a new empty "method" element
     */
    org.hl7.fhir.CodeableConcept addNewMethod();
    
    /**
     * Unsets the "method" element
     */
    void unsetMethod();
    
    /**
     * Gets the "quantity" element
     */
    org.hl7.fhir.Quantity getQuantity();
    
    /**
     * True if has "quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "quantity" element
     */
    void setQuantity(org.hl7.fhir.Quantity quantity);
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    org.hl7.fhir.Quantity addNewQuantity();
    
    /**
     * Unsets the "quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "rate" element
     */
    org.hl7.fhir.Ratio getRate();
    
    /**
     * True if has "rate" element
     */
    boolean isSetRate();
    
    /**
     * Sets the "rate" element
     */
    void setRate(org.hl7.fhir.Ratio rate);
    
    /**
     * Appends and returns a new empty "rate" element
     */
    org.hl7.fhir.Ratio addNewRate();
    
    /**
     * Unsets the "rate" element
     */
    void unsetRate();
    
    /**
     * Gets the "maxDosePerPeriod" element
     */
    org.hl7.fhir.Ratio getMaxDosePerPeriod();
    
    /**
     * True if has "maxDosePerPeriod" element
     */
    boolean isSetMaxDosePerPeriod();
    
    /**
     * Sets the "maxDosePerPeriod" element
     */
    void setMaxDosePerPeriod(org.hl7.fhir.Ratio maxDosePerPeriod);
    
    /**
     * Appends and returns a new empty "maxDosePerPeriod" element
     */
    org.hl7.fhir.Ratio addNewMaxDosePerPeriod();
    
    /**
     * Unsets the "maxDosePerPeriod" element
     */
    void unsetMaxDosePerPeriod();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.MedicationAdministrationDosage newInstance() {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.MedicationAdministrationDosage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationAdministrationDosage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.MedicationAdministrationDosage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.MedicationAdministrationDosage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
