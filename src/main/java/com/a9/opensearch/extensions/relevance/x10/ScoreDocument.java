/*
 * An XML document type.
 * Localname: score
 * Namespace: http://a9.com/-/opensearch/extensions/relevance/1.0/
 * Java type: com.a9.opensearch.extensions.relevance.x10.ScoreDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.opensearch.extensions.relevance.x10;


/**
 * A document containing one score(@http://a9.com/-/opensearch/extensions/relevance/1.0/) element.
 *
 * This is a complex type.
 */
public interface ScoreDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScoreDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("score9dcbdoctype");
    
    /**
     * Gets the "score" element
     */
    java.math.BigDecimal getScore();
    
    /**
     * Gets (as xml) the "score" element
     */
    org.apache.xmlbeans.XmlDecimal xgetScore();
    
    /**
     * Sets the "score" element
     */
    void setScore(java.math.BigDecimal score);
    
    /**
     * Sets (as xml) the "score" element
     */
    void xsetScore(org.apache.xmlbeans.XmlDecimal score);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument newInstance() {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.a9.opensearch.extensions.relevance.x10.ScoreDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.a9.opensearch.extensions.relevance.x10.ScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
