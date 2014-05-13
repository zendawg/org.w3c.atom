/*
 * An XML document type.
 * Localname: deleted-entry
 * Namespace: http://purl.org/atompub/tombstones/1.0
 * Java type: org.purl.atompub.tombstones.x10.DeletedEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.atompub.tombstones.x10;


/**
 * A document containing one deleted-entry(@http://purl.org/atompub/tombstones/1.0) element.
 *
 * This is a complex type.
 */
public interface DeletedEntryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeletedEntryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("deletedentryccc8doctype");
    
    /**
     * Gets the "deleted-entry" element
     */
    org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry getDeletedEntry();
    
    /**
     * Sets the "deleted-entry" element
     */
    void setDeletedEntry(org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry deletedEntry);
    
    /**
     * Appends and returns a new empty "deleted-entry" element
     */
    org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry addNewDeletedEntry();
    
    /**
     * An XML deleted-entry(@http://purl.org/atompub/tombstones/1.0).
     *
     * This is a complex type.
     */
    public interface DeletedEntry extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeletedEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("deletedentry215eelemtype");
        
        /**
         * Gets the "link" element
         */
        org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link getLink();
        
        /**
         * Sets the "link" element
         */
        void setLink(org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link link);
        
        /**
         * Appends and returns a new empty "link" element
         */
        org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link addNewLink();
        
        /**
         * Gets the "ref" attribute
         */
        java.lang.String getRef();
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetRef();
        
        /**
         * Sets the "ref" attribute
         */
        void setRef(java.lang.String ref);
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        void xsetRef(org.apache.xmlbeans.XmlAnyURI ref);
        
        /**
         * Gets the "when" attribute
         */
        java.util.Calendar getWhen();
        
        /**
         * Gets (as xml) the "when" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetWhen();
        
        /**
         * Sets the "when" attribute
         */
        void setWhen(java.util.Calendar when);
        
        /**
         * Sets (as xml) the "when" attribute
         */
        void xsetWhen(org.apache.xmlbeans.XmlDateTime when);
        
        /**
         * An XML link(@http://purl.org/atompub/tombstones/1.0).
         *
         * This is a complex type.
         */
        public interface Link extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("linkf008elemtype");
            
            /**
             * Gets the "rel" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType getRel();
            
            /**
             * True if has "rel" attribute
             */
            boolean isSetRel();
            
            /**
             * Sets the "rel" attribute
             */
            void setRel(org.apache.xmlbeans.XmlAnySimpleType rel);
            
            /**
             * Appends and returns a new empty "rel" attribute
             */
            org.apache.xmlbeans.XmlAnySimpleType addNewRel();
            
            /**
             * Unsets the "rel" attribute
             */
            void unsetRel();
            
            /**
             * Gets the "href" attribute
             */
            java.lang.String getHref();
            
            /**
             * Gets (as xml) the "href" attribute
             */
            org.apache.xmlbeans.XmlAnyURI xgetHref();
            
            /**
             * Sets the "href" attribute
             */
            void setHref(java.lang.String href);
            
            /**
             * Sets (as xml) the "href" attribute
             */
            void xsetHref(org.apache.xmlbeans.XmlAnyURI href);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link newInstance() {
                  return (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry newInstance() {
              return (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument newInstance() {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.atompub.tombstones.x10.DeletedEntryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.atompub.tombstones.x10.DeletedEntryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
