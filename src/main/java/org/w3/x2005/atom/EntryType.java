/*
 * XML Type:  EntryType
 * Namespace: http://www.w3.org/2005/Atom
 * Java type: org.w3.x2005.atom.EntryType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.atom;


/**
 * An XML EntryType(@http://www.w3.org/2005/Atom).
 *
 * This is a complex type.
 */
public interface EntryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("entrytyped22ctype");
    
    /**
     * Gets array of all "title" elements
     */
    org.w3.x2005.atom.TextType[] getTitleArray();
    
    /**
     * Gets ith "title" element
     */
    org.w3.x2005.atom.TextType getTitleArray(int i);
    
    /**
     * Returns number of "title" element
     */
    int sizeOfTitleArray();
    
    /**
     * Sets array of all "title" element
     */
    void setTitleArray(org.w3.x2005.atom.TextType[] titleArray);
    
    /**
     * Sets ith "title" element
     */
    void setTitleArray(int i, org.w3.x2005.atom.TextType title);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    org.w3.x2005.atom.TextType insertNewTitle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    org.w3.x2005.atom.TextType addNewTitle();
    
    /**
     * Removes the ith "title" element
     */
    void removeTitle(int i);
    
    /**
     * Gets array of all "link" elements
     */
    org.w3.x2005.atom.LinkType[] getLinkArray();
    
    /**
     * Gets ith "link" element
     */
    org.w3.x2005.atom.LinkType getLinkArray(int i);
    
    /**
     * Returns number of "link" element
     */
    int sizeOfLinkArray();
    
    /**
     * Sets array of all "link" element
     */
    void setLinkArray(org.w3.x2005.atom.LinkType[] linkArray);
    
    /**
     * Sets ith "link" element
     */
    void setLinkArray(int i, org.w3.x2005.atom.LinkType link);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    org.w3.x2005.atom.LinkType insertNewLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    org.w3.x2005.atom.LinkType addNewLink();
    
    /**
     * Removes the ith "link" element
     */
    void removeLink(int i);
    
    /**
     * Gets array of all "id" elements
     */
    org.w3.x2005.atom.IdType[] getIdArray();
    
    /**
     * Gets ith "id" element
     */
    org.w3.x2005.atom.IdType getIdArray(int i);
    
    /**
     * Returns number of "id" element
     */
    int sizeOfIdArray();
    
    /**
     * Sets array of all "id" element
     */
    void setIdArray(org.w3.x2005.atom.IdType[] idArray);
    
    /**
     * Sets ith "id" element
     */
    void setIdArray(int i, org.w3.x2005.atom.IdType id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    org.w3.x2005.atom.IdType insertNewId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    org.w3.x2005.atom.IdType addNewId();
    
    /**
     * Removes the ith "id" element
     */
    void removeId(int i);
    
    /**
     * Gets array of all "updated" elements
     */
    org.w3.x2005.atom.DateTimeType[] getUpdatedArray();
    
    /**
     * Gets ith "updated" element
     */
    org.w3.x2005.atom.DateTimeType getUpdatedArray(int i);
    
    /**
     * Returns number of "updated" element
     */
    int sizeOfUpdatedArray();
    
    /**
     * Sets array of all "updated" element
     */
    void setUpdatedArray(org.w3.x2005.atom.DateTimeType[] updatedArray);
    
    /**
     * Sets ith "updated" element
     */
    void setUpdatedArray(int i, org.w3.x2005.atom.DateTimeType updated);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "updated" element
     */
    org.w3.x2005.atom.DateTimeType insertNewUpdated(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "updated" element
     */
    org.w3.x2005.atom.DateTimeType addNewUpdated();
    
    /**
     * Removes the ith "updated" element
     */
    void removeUpdated(int i);
    
    /**
     * Gets array of all "published" elements
     */
    org.w3.x2005.atom.DateTimeType[] getPublishedArray();
    
    /**
     * Gets ith "published" element
     */
    org.w3.x2005.atom.DateTimeType getPublishedArray(int i);
    
    /**
     * Returns number of "published" element
     */
    int sizeOfPublishedArray();
    
    /**
     * Sets array of all "published" element
     */
    void setPublishedArray(org.w3.x2005.atom.DateTimeType[] publishedArray);
    
    /**
     * Sets ith "published" element
     */
    void setPublishedArray(int i, org.w3.x2005.atom.DateTimeType published);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "published" element
     */
    org.w3.x2005.atom.DateTimeType insertNewPublished(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "published" element
     */
    org.w3.x2005.atom.DateTimeType addNewPublished();
    
    /**
     * Removes the ith "published" element
     */
    void removePublished(int i);
    
    /**
     * Gets array of all "author" elements
     */
    org.w3.x2005.atom.PersonType[] getAuthorArray();
    
    /**
     * Gets ith "author" element
     */
    org.w3.x2005.atom.PersonType getAuthorArray(int i);
    
    /**
     * Returns number of "author" element
     */
    int sizeOfAuthorArray();
    
    /**
     * Sets array of all "author" element
     */
    void setAuthorArray(org.w3.x2005.atom.PersonType[] authorArray);
    
    /**
     * Sets ith "author" element
     */
    void setAuthorArray(int i, org.w3.x2005.atom.PersonType author);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    org.w3.x2005.atom.PersonType insertNewAuthor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    org.w3.x2005.atom.PersonType addNewAuthor();
    
    /**
     * Removes the ith "author" element
     */
    void removeAuthor(int i);
    
    /**
     * Gets array of all "category" elements
     */
    org.w3.x2005.atom.CategoryType[] getCategoryArray();
    
    /**
     * Gets ith "category" element
     */
    org.w3.x2005.atom.CategoryType getCategoryArray(int i);
    
    /**
     * Returns number of "category" element
     */
    int sizeOfCategoryArray();
    
    /**
     * Sets array of all "category" element
     */
    void setCategoryArray(org.w3.x2005.atom.CategoryType[] categoryArray);
    
    /**
     * Sets ith "category" element
     */
    void setCategoryArray(int i, org.w3.x2005.atom.CategoryType category);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    org.w3.x2005.atom.CategoryType insertNewCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    org.w3.x2005.atom.CategoryType addNewCategory();
    
    /**
     * Removes the ith "category" element
     */
    void removeCategory(int i);
    
    /**
     * Gets array of all "content" elements
     */
    org.w3.x2005.atom.ContentType[] getContentArray();
    
    /**
     * Gets ith "content" element
     */
    org.w3.x2005.atom.ContentType getContentArray(int i);
    
    /**
     * Returns number of "content" element
     */
    int sizeOfContentArray();
    
    /**
     * Sets array of all "content" element
     */
    void setContentArray(org.w3.x2005.atom.ContentType[] contentArray);
    
    /**
     * Sets ith "content" element
     */
    void setContentArray(int i, org.w3.x2005.atom.ContentType content);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    org.w3.x2005.atom.ContentType insertNewContent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    org.w3.x2005.atom.ContentType addNewContent();
    
    /**
     * Removes the ith "content" element
     */
    void removeContent(int i);
    
    /**
     * Gets array of all "summary" elements
     */
    org.w3.x2005.atom.TextType[] getSummaryArray();
    
    /**
     * Gets ith "summary" element
     */
    org.w3.x2005.atom.TextType getSummaryArray(int i);
    
    /**
     * Returns number of "summary" element
     */
    int sizeOfSummaryArray();
    
    /**
     * Sets array of all "summary" element
     */
    void setSummaryArray(org.w3.x2005.atom.TextType[] summaryArray);
    
    /**
     * Sets ith "summary" element
     */
    void setSummaryArray(int i, org.w3.x2005.atom.TextType summary);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "summary" element
     */
    org.w3.x2005.atom.TextType insertNewSummary(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "summary" element
     */
    org.w3.x2005.atom.TextType addNewSummary();
    
    /**
     * Removes the ith "summary" element
     */
    void removeSummary(int i);
    
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
        public static org.w3.x2005.atom.EntryType newInstance() {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2005.atom.EntryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2005.atom.EntryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2005.atom.EntryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2005.atom.EntryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2005.atom.EntryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2005.atom.EntryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2005.atom.EntryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2005.atom.EntryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.atom.EntryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.atom.EntryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.atom.EntryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
