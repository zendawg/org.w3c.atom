/*
 * XML Type:  ValueSet.Concept
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetConcept
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ValueSet.Concept(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ValueSetConcept extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueSetConcept.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("valuesetconceptad77type");
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.Code getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.Code code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.Code addNewCode();
    
    /**
     * Gets the "abstract" element
     */
    org.hl7.fhir.Boolean getAbstract();
    
    /**
     * True if has "abstract" element
     */
    boolean isSetAbstract();
    
    /**
     * Sets the "abstract" element
     */
    void setAbstract(org.hl7.fhir.Boolean xabstract);
    
    /**
     * Appends and returns a new empty "abstract" element
     */
    org.hl7.fhir.Boolean addNewAbstract();
    
    /**
     * Unsets the "abstract" element
     */
    void unsetAbstract();
    
    /**
     * Gets the "display" element
     */
    org.hl7.fhir.String getDisplay();
    
    /**
     * True if has "display" element
     */
    boolean isSetDisplay();
    
    /**
     * Sets the "display" element
     */
    void setDisplay(org.hl7.fhir.String display);
    
    /**
     * Appends and returns a new empty "display" element
     */
    org.hl7.fhir.String addNewDisplay();
    
    /**
     * Unsets the "display" element
     */
    void unsetDisplay();
    
    /**
     * Gets the "definition" element
     */
    org.hl7.fhir.String getDefinition();
    
    /**
     * True if has "definition" element
     */
    boolean isSetDefinition();
    
    /**
     * Sets the "definition" element
     */
    void setDefinition(org.hl7.fhir.String definition);
    
    /**
     * Appends and returns a new empty "definition" element
     */
    org.hl7.fhir.String addNewDefinition();
    
    /**
     * Unsets the "definition" element
     */
    void unsetDefinition();
    
    /**
     * Gets array of all "concept" elements
     */
    org.hl7.fhir.ValueSetConcept[] getConceptArray();
    
    /**
     * Gets ith "concept" element
     */
    org.hl7.fhir.ValueSetConcept getConceptArray(int i);
    
    /**
     * Returns number of "concept" element
     */
    int sizeOfConceptArray();
    
    /**
     * Sets array of all "concept" element
     */
    void setConceptArray(org.hl7.fhir.ValueSetConcept[] conceptArray);
    
    /**
     * Sets ith "concept" element
     */
    void setConceptArray(int i, org.hl7.fhir.ValueSetConcept concept);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    org.hl7.fhir.ValueSetConcept insertNewConcept(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    org.hl7.fhir.ValueSetConcept addNewConcept();
    
    /**
     * Removes the ith "concept" element
     */
    void removeConcept(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ValueSetConcept newInstance() {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ValueSetConcept parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ValueSetConcept parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ValueSetConcept parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ValueSetConcept parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ValueSetConcept parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ValueSetConcept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
