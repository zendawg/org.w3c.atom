/*
 * XML Type:  feedType
 * Namespace: http://www.w3.org/2005/Atom
 * Java type: org.w3.x2005.atom.FeedType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.atom;


/**
 * An XML feedType(@http://www.w3.org/2005/Atom).
 *
 * This is a complex type.
 */
public interface FeedType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeedType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s79A9418CF5B0958528C080BB802D412D").resolveHandle("feedtypec62atype");
    
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
     * Gets array of all "contributor" elements
     */
    org.w3.x2005.atom.PersonType[] getContributorArray();
    
    /**
     * Gets ith "contributor" element
     */
    org.w3.x2005.atom.PersonType getContributorArray(int i);
    
    /**
     * Returns number of "contributor" element
     */
    int sizeOfContributorArray();
    
    /**
     * Sets array of all "contributor" element
     */
    void setContributorArray(org.w3.x2005.atom.PersonType[] contributorArray);
    
    /**
     * Sets ith "contributor" element
     */
    void setContributorArray(int i, org.w3.x2005.atom.PersonType contributor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contributor" element
     */
    org.w3.x2005.atom.PersonType insertNewContributor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contributor" element
     */
    org.w3.x2005.atom.PersonType addNewContributor();
    
    /**
     * Removes the ith "contributor" element
     */
    void removeContributor(int i);
    
    /**
     * Gets array of all "generator" elements
     */
    org.w3.x2005.atom.GeneratorType[] getGeneratorArray();
    
    /**
     * Gets ith "generator" element
     */
    org.w3.x2005.atom.GeneratorType getGeneratorArray(int i);
    
    /**
     * Returns number of "generator" element
     */
    int sizeOfGeneratorArray();
    
    /**
     * Sets array of all "generator" element
     */
    void setGeneratorArray(org.w3.x2005.atom.GeneratorType[] generatorArray);
    
    /**
     * Sets ith "generator" element
     */
    void setGeneratorArray(int i, org.w3.x2005.atom.GeneratorType generator);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "generator" element
     */
    org.w3.x2005.atom.GeneratorType insertNewGenerator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "generator" element
     */
    org.w3.x2005.atom.GeneratorType addNewGenerator();
    
    /**
     * Removes the ith "generator" element
     */
    void removeGenerator(int i);
    
    /**
     * Gets array of all "icon" elements
     */
    org.w3.x2005.atom.IconType[] getIconArray();
    
    /**
     * Gets ith "icon" element
     */
    org.w3.x2005.atom.IconType getIconArray(int i);
    
    /**
     * Returns number of "icon" element
     */
    int sizeOfIconArray();
    
    /**
     * Sets array of all "icon" element
     */
    void setIconArray(org.w3.x2005.atom.IconType[] iconArray);
    
    /**
     * Sets ith "icon" element
     */
    void setIconArray(int i, org.w3.x2005.atom.IconType icon);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    org.w3.x2005.atom.IconType insertNewIcon(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    org.w3.x2005.atom.IconType addNewIcon();
    
    /**
     * Removes the ith "icon" element
     */
    void removeIcon(int i);
    
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
     * Gets array of all "logo" elements
     */
    org.w3.x2005.atom.LogoType[] getLogoArray();
    
    /**
     * Gets ith "logo" element
     */
    org.w3.x2005.atom.LogoType getLogoArray(int i);
    
    /**
     * Returns number of "logo" element
     */
    int sizeOfLogoArray();
    
    /**
     * Sets array of all "logo" element
     */
    void setLogoArray(org.w3.x2005.atom.LogoType[] logoArray);
    
    /**
     * Sets ith "logo" element
     */
    void setLogoArray(int i, org.w3.x2005.atom.LogoType logo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "logo" element
     */
    org.w3.x2005.atom.LogoType insertNewLogo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "logo" element
     */
    org.w3.x2005.atom.LogoType addNewLogo();
    
    /**
     * Removes the ith "logo" element
     */
    void removeLogo(int i);
    
    /**
     * Gets array of all "rights" elements
     */
    org.w3.x2005.atom.TextType[] getRightsArray();
    
    /**
     * Gets ith "rights" element
     */
    org.w3.x2005.atom.TextType getRightsArray(int i);
    
    /**
     * Returns number of "rights" element
     */
    int sizeOfRightsArray();
    
    /**
     * Sets array of all "rights" element
     */
    void setRightsArray(org.w3.x2005.atom.TextType[] rightsArray);
    
    /**
     * Sets ith "rights" element
     */
    void setRightsArray(int i, org.w3.x2005.atom.TextType rights);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rights" element
     */
    org.w3.x2005.atom.TextType insertNewRights(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rights" element
     */
    org.w3.x2005.atom.TextType addNewRights();
    
    /**
     * Removes the ith "rights" element
     */
    void removeRights(int i);
    
    /**
     * Gets array of all "subtitle" elements
     */
    org.w3.x2005.atom.TextType[] getSubtitleArray();
    
    /**
     * Gets ith "subtitle" element
     */
    org.w3.x2005.atom.TextType getSubtitleArray(int i);
    
    /**
     * Returns number of "subtitle" element
     */
    int sizeOfSubtitleArray();
    
    /**
     * Sets array of all "subtitle" element
     */
    void setSubtitleArray(org.w3.x2005.atom.TextType[] subtitleArray);
    
    /**
     * Sets ith "subtitle" element
     */
    void setSubtitleArray(int i, org.w3.x2005.atom.TextType subtitle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subtitle" element
     */
    org.w3.x2005.atom.TextType insertNewSubtitle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subtitle" element
     */
    org.w3.x2005.atom.TextType addNewSubtitle();
    
    /**
     * Removes the ith "subtitle" element
     */
    void removeSubtitle(int i);
    
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
     * Gets array of all "entry" elements
     */
    org.w3.x2005.atom.EntryType[] getEntryArray();
    
    /**
     * Gets ith "entry" element
     */
    org.w3.x2005.atom.EntryType getEntryArray(int i);
    
    /**
     * Returns number of "entry" element
     */
    int sizeOfEntryArray();
    
    /**
     * Sets array of all "entry" element
     */
    void setEntryArray(org.w3.x2005.atom.EntryType[] entryArray);
    
    /**
     * Sets ith "entry" element
     */
    void setEntryArray(int i, org.w3.x2005.atom.EntryType entry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    org.w3.x2005.atom.EntryType insertNewEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    org.w3.x2005.atom.EntryType addNewEntry();
    
    /**
     * Removes the ith "entry" element
     */
    void removeEntry(int i);
    
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
        public static org.w3.x2005.atom.FeedType newInstance() {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2005.atom.FeedType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2005.atom.FeedType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2005.atom.FeedType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2005.atom.FeedType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2005.atom.FeedType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2005.atom.FeedType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2005.atom.FeedType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2005.atom.FeedType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.atom.FeedType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.atom.FeedType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.atom.FeedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
