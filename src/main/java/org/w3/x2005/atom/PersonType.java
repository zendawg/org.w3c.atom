/*
 * XML Type:  personType
 * Namespace: http://www.w3.org/2005/Atom
 * Java type: org.w3.x2005.atom.PersonType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.atom;


/**
 * An XML personType(@http://www.w3.org/2005/Atom).
 *
 * This is a complex type.
 */
public interface PersonType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s79A9418CF5B0958528C080BB802D412D").resolveHandle("persontype09a1type");
    
    /**
     * Gets array of all "name" elements
     */
    java.lang.String[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    java.lang.String getNameArray(int i);
    
    /**
     * Gets (as xml) array of all "name" elements
     */
    org.apache.xmlbeans.XmlString[] xgetNameArray();
    
    /**
     * Gets (as xml) ith "name" element
     */
    org.apache.xmlbeans.XmlString xgetNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(java.lang.String[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, java.lang.String name);
    
    /**
     * Sets (as xml) array of all "name" element
     */
    void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
    
    /**
     * Sets (as xml) ith "name" element
     */
    void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
    
    /**
     * Inserts the value as the ith "name" element
     */
    void insertName(int i, java.lang.String name);
    
    /**
     * Appends the value as the last "name" element
     */
    void addName(java.lang.String name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    org.apache.xmlbeans.XmlString insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    org.apache.xmlbeans.XmlString addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
    /**
     * Gets array of all "uri" elements
     */
    org.w3.x2005.atom.UriType[] getUriArray();
    
    /**
     * Gets ith "uri" element
     */
    org.w3.x2005.atom.UriType getUriArray(int i);
    
    /**
     * Returns number of "uri" element
     */
    int sizeOfUriArray();
    
    /**
     * Sets array of all "uri" element
     */
    void setUriArray(org.w3.x2005.atom.UriType[] uriArray);
    
    /**
     * Sets ith "uri" element
     */
    void setUriArray(int i, org.w3.x2005.atom.UriType uri);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "uri" element
     */
    org.w3.x2005.atom.UriType insertNewUri(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "uri" element
     */
    org.w3.x2005.atom.UriType addNewUri();
    
    /**
     * Removes the ith "uri" element
     */
    void removeUri(int i);
    
    /**
     * Gets array of all "email" elements
     */
    java.lang.String[] getEmailArray();
    
    /**
     * Gets ith "email" element
     */
    java.lang.String getEmailArray(int i);
    
    /**
     * Gets (as xml) array of all "email" elements
     */
    org.w3.x2005.atom.EmailType[] xgetEmailArray();
    
    /**
     * Gets (as xml) ith "email" element
     */
    org.w3.x2005.atom.EmailType xgetEmailArray(int i);
    
    /**
     * Returns number of "email" element
     */
    int sizeOfEmailArray();
    
    /**
     * Sets array of all "email" element
     */
    void setEmailArray(java.lang.String[] emailArray);
    
    /**
     * Sets ith "email" element
     */
    void setEmailArray(int i, java.lang.String email);
    
    /**
     * Sets (as xml) array of all "email" element
     */
    void xsetEmailArray(org.w3.x2005.atom.EmailType[] emailArray);
    
    /**
     * Sets (as xml) ith "email" element
     */
    void xsetEmailArray(int i, org.w3.x2005.atom.EmailType email);
    
    /**
     * Inserts the value as the ith "email" element
     */
    void insertEmail(int i, java.lang.String email);
    
    /**
     * Appends the value as the last "email" element
     */
    void addEmail(java.lang.String email);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "email" element
     */
    org.w3.x2005.atom.EmailType insertNewEmail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "email" element
     */
    org.w3.x2005.atom.EmailType addNewEmail();
    
    /**
     * Removes the ith "email" element
     */
    void removeEmail(int i);
    
    /**
     * Gets the "base" attribute
     */
    java.lang.String getBase();
    
    /**
     * Gets (as xml) the "base" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetBase();
    
    /**
     * True if has "base" attribute
     */
    boolean isSetBase();
    
    /**
     * Sets the "base" attribute
     */
    void setBase(java.lang.String base);
    
    /**
     * Sets (as xml) the "base" attribute
     */
    void xsetBase(org.apache.xmlbeans.XmlAnyURI base);
    
    /**
     * Unsets the "base" attribute
     */
    void unsetBase();
    
    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLang();
    
    /**
     * True if has "lang" attribute
     */
    boolean isSetLang();
    
    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
    
    /**
     * Unsets the "lang" attribute
     */
    void unsetLang();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2005.atom.PersonType newInstance() {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2005.atom.PersonType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2005.atom.PersonType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2005.atom.PersonType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2005.atom.PersonType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2005.atom.PersonType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2005.atom.PersonType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2005.atom.PersonType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2005.atom.PersonType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.atom.PersonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.atom.PersonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.atom.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
