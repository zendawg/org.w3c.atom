/*
 * XML Type:  ImmunizationRecommendation.Protocol
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendationProtocol
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ImmunizationRecommendation.Protocol(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ImmunizationRecommendationProtocol extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImmunizationRecommendationProtocol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("immunizationrecommendationprotocol5125type");
    
    /**
     * Gets the "doseSequence" element
     */
    org.hl7.fhir.Integer getDoseSequence();
    
    /**
     * True if has "doseSequence" element
     */
    boolean isSetDoseSequence();
    
    /**
     * Sets the "doseSequence" element
     */
    void setDoseSequence(org.hl7.fhir.Integer doseSequence);
    
    /**
     * Appends and returns a new empty "doseSequence" element
     */
    org.hl7.fhir.Integer addNewDoseSequence();
    
    /**
     * Unsets the "doseSequence" element
     */
    void unsetDoseSequence();
    
    /**
     * Gets the "description" element
     */
    org.hl7.fhir.String getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.hl7.fhir.String description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.hl7.fhir.String addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "authority" element
     */
    org.hl7.fhir.ResourceReference getAuthority();
    
    /**
     * True if has "authority" element
     */
    boolean isSetAuthority();
    
    /**
     * Sets the "authority" element
     */
    void setAuthority(org.hl7.fhir.ResourceReference authority);
    
    /**
     * Appends and returns a new empty "authority" element
     */
    org.hl7.fhir.ResourceReference addNewAuthority();
    
    /**
     * Unsets the "authority" element
     */
    void unsetAuthority();
    
    /**
     * Gets the "series" element
     */
    org.hl7.fhir.String getSeries();
    
    /**
     * True if has "series" element
     */
    boolean isSetSeries();
    
    /**
     * Sets the "series" element
     */
    void setSeries(org.hl7.fhir.String series);
    
    /**
     * Appends and returns a new empty "series" element
     */
    org.hl7.fhir.String addNewSeries();
    
    /**
     * Unsets the "series" element
     */
    void unsetSeries();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ImmunizationRecommendationProtocol newInstance() {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImmunizationRecommendationProtocol parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImmunizationRecommendationProtocol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
