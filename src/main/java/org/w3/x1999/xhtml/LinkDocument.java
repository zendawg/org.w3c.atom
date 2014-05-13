/*
 * An XML document type.
 * Localname: link
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.LinkDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml;


/**
 * A document containing one link(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public interface LinkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("link29fddoctype");
    
    /**
     * Gets the "link" element
     */
    org.w3.x1999.xhtml.LinkDocument.Link getLink();
    
    /**
     * Sets the "link" element
     */
    void setLink(org.w3.x1999.xhtml.LinkDocument.Link link);
    
    /**
     * Appends and returns a new empty "link" element
     */
    org.w3.x1999.xhtml.LinkDocument.Link addNewLink();
    
    /**
     * An XML link(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public interface Link extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("linkc393elemtype");
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "class" attribute
         */
        java.util.List getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.apache.xmlbeans.XmlNMTOKENS xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.util.List class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.apache.xmlbeans.XmlNMTOKENS class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "style" attribute
         */
        java.lang.String getStyle();
        
        /**
         * Gets (as xml) the "style" attribute
         */
        org.w3.x1999.xhtml.StyleSheet xgetStyle();
        
        /**
         * True if has "style" attribute
         */
        boolean isSetStyle();
        
        /**
         * Sets the "style" attribute
         */
        void setStyle(java.lang.String style);
        
        /**
         * Sets (as xml) the "style" attribute
         */
        void xsetStyle(org.w3.x1999.xhtml.StyleSheet style);
        
        /**
         * Unsets the "style" attribute
         */
        void unsetStyle();
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.w3.x1999.xhtml.Text xgetTitle();
        
        /**
         * True if has "title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.w3.x1999.xhtml.Text title);
        
        /**
         * Unsets the "title" attribute
         */
        void unsetTitle();
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.w3.x1999.xhtml.LanguageCode xgetLang();
        
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
        void xsetLang(org.w3.x1999.xhtml.LanguageCode lang);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang2();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.XmlLanguage xgetLang2();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang2();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang2(java.lang.String lang2);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang2(org.apache.xmlbeans.XmlLanguage lang2);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang2();
        
        /**
         * Gets the "dir" attribute
         */
        org.w3.x1999.xhtml.LinkDocument.Link.Dir.Enum getDir();
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        org.w3.x1999.xhtml.LinkDocument.Link.Dir xgetDir();
        
        /**
         * True if has "dir" attribute
         */
        boolean isSetDir();
        
        /**
         * Sets the "dir" attribute
         */
        void setDir(org.w3.x1999.xhtml.LinkDocument.Link.Dir.Enum dir);
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        void xsetDir(org.w3.x1999.xhtml.LinkDocument.Link.Dir dir);
        
        /**
         * Unsets the "dir" attribute
         */
        void unsetDir();
        
        /**
         * Gets the "onclick" attribute
         */
        java.lang.String getOnclick();
        
        /**
         * Gets (as xml) the "onclick" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnclick();
        
        /**
         * True if has "onclick" attribute
         */
        boolean isSetOnclick();
        
        /**
         * Sets the "onclick" attribute
         */
        void setOnclick(java.lang.String onclick);
        
        /**
         * Sets (as xml) the "onclick" attribute
         */
        void xsetOnclick(org.w3.x1999.xhtml.Script onclick);
        
        /**
         * Unsets the "onclick" attribute
         */
        void unsetOnclick();
        
        /**
         * Gets the "ondblclick" attribute
         */
        java.lang.String getOndblclick();
        
        /**
         * Gets (as xml) the "ondblclick" attribute
         */
        org.w3.x1999.xhtml.Script xgetOndblclick();
        
        /**
         * True if has "ondblclick" attribute
         */
        boolean isSetOndblclick();
        
        /**
         * Sets the "ondblclick" attribute
         */
        void setOndblclick(java.lang.String ondblclick);
        
        /**
         * Sets (as xml) the "ondblclick" attribute
         */
        void xsetOndblclick(org.w3.x1999.xhtml.Script ondblclick);
        
        /**
         * Unsets the "ondblclick" attribute
         */
        void unsetOndblclick();
        
        /**
         * Gets the "onmousedown" attribute
         */
        java.lang.String getOnmousedown();
        
        /**
         * Gets (as xml) the "onmousedown" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmousedown();
        
        /**
         * True if has "onmousedown" attribute
         */
        boolean isSetOnmousedown();
        
        /**
         * Sets the "onmousedown" attribute
         */
        void setOnmousedown(java.lang.String onmousedown);
        
        /**
         * Sets (as xml) the "onmousedown" attribute
         */
        void xsetOnmousedown(org.w3.x1999.xhtml.Script onmousedown);
        
        /**
         * Unsets the "onmousedown" attribute
         */
        void unsetOnmousedown();
        
        /**
         * Gets the "onmouseup" attribute
         */
        java.lang.String getOnmouseup();
        
        /**
         * Gets (as xml) the "onmouseup" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseup();
        
        /**
         * True if has "onmouseup" attribute
         */
        boolean isSetOnmouseup();
        
        /**
         * Sets the "onmouseup" attribute
         */
        void setOnmouseup(java.lang.String onmouseup);
        
        /**
         * Sets (as xml) the "onmouseup" attribute
         */
        void xsetOnmouseup(org.w3.x1999.xhtml.Script onmouseup);
        
        /**
         * Unsets the "onmouseup" attribute
         */
        void unsetOnmouseup();
        
        /**
         * Gets the "onmouseover" attribute
         */
        java.lang.String getOnmouseover();
        
        /**
         * Gets (as xml) the "onmouseover" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseover();
        
        /**
         * True if has "onmouseover" attribute
         */
        boolean isSetOnmouseover();
        
        /**
         * Sets the "onmouseover" attribute
         */
        void setOnmouseover(java.lang.String onmouseover);
        
        /**
         * Sets (as xml) the "onmouseover" attribute
         */
        void xsetOnmouseover(org.w3.x1999.xhtml.Script onmouseover);
        
        /**
         * Unsets the "onmouseover" attribute
         */
        void unsetOnmouseover();
        
        /**
         * Gets the "onmousemove" attribute
         */
        java.lang.String getOnmousemove();
        
        /**
         * Gets (as xml) the "onmousemove" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmousemove();
        
        /**
         * True if has "onmousemove" attribute
         */
        boolean isSetOnmousemove();
        
        /**
         * Sets the "onmousemove" attribute
         */
        void setOnmousemove(java.lang.String onmousemove);
        
        /**
         * Sets (as xml) the "onmousemove" attribute
         */
        void xsetOnmousemove(org.w3.x1999.xhtml.Script onmousemove);
        
        /**
         * Unsets the "onmousemove" attribute
         */
        void unsetOnmousemove();
        
        /**
         * Gets the "onmouseout" attribute
         */
        java.lang.String getOnmouseout();
        
        /**
         * Gets (as xml) the "onmouseout" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseout();
        
        /**
         * True if has "onmouseout" attribute
         */
        boolean isSetOnmouseout();
        
        /**
         * Sets the "onmouseout" attribute
         */
        void setOnmouseout(java.lang.String onmouseout);
        
        /**
         * Sets (as xml) the "onmouseout" attribute
         */
        void xsetOnmouseout(org.w3.x1999.xhtml.Script onmouseout);
        
        /**
         * Unsets the "onmouseout" attribute
         */
        void unsetOnmouseout();
        
        /**
         * Gets the "onkeypress" attribute
         */
        java.lang.String getOnkeypress();
        
        /**
         * Gets (as xml) the "onkeypress" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeypress();
        
        /**
         * True if has "onkeypress" attribute
         */
        boolean isSetOnkeypress();
        
        /**
         * Sets the "onkeypress" attribute
         */
        void setOnkeypress(java.lang.String onkeypress);
        
        /**
         * Sets (as xml) the "onkeypress" attribute
         */
        void xsetOnkeypress(org.w3.x1999.xhtml.Script onkeypress);
        
        /**
         * Unsets the "onkeypress" attribute
         */
        void unsetOnkeypress();
        
        /**
         * Gets the "onkeydown" attribute
         */
        java.lang.String getOnkeydown();
        
        /**
         * Gets (as xml) the "onkeydown" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeydown();
        
        /**
         * True if has "onkeydown" attribute
         */
        boolean isSetOnkeydown();
        
        /**
         * Sets the "onkeydown" attribute
         */
        void setOnkeydown(java.lang.String onkeydown);
        
        /**
         * Sets (as xml) the "onkeydown" attribute
         */
        void xsetOnkeydown(org.w3.x1999.xhtml.Script onkeydown);
        
        /**
         * Unsets the "onkeydown" attribute
         */
        void unsetOnkeydown();
        
        /**
         * Gets the "onkeyup" attribute
         */
        java.lang.String getOnkeyup();
        
        /**
         * Gets (as xml) the "onkeyup" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeyup();
        
        /**
         * True if has "onkeyup" attribute
         */
        boolean isSetOnkeyup();
        
        /**
         * Sets the "onkeyup" attribute
         */
        void setOnkeyup(java.lang.String onkeyup);
        
        /**
         * Sets (as xml) the "onkeyup" attribute
         */
        void xsetOnkeyup(org.w3.x1999.xhtml.Script onkeyup);
        
        /**
         * Unsets the "onkeyup" attribute
         */
        void unsetOnkeyup();
        
        /**
         * Gets the "charset" attribute
         */
        java.lang.String getCharset();
        
        /**
         * Gets (as xml) the "charset" attribute
         */
        org.w3.x1999.xhtml.Charset xgetCharset();
        
        /**
         * True if has "charset" attribute
         */
        boolean isSetCharset();
        
        /**
         * Sets the "charset" attribute
         */
        void setCharset(java.lang.String charset);
        
        /**
         * Sets (as xml) the "charset" attribute
         */
        void xsetCharset(org.w3.x1999.xhtml.Charset charset);
        
        /**
         * Unsets the "charset" attribute
         */
        void unsetCharset();
        
        /**
         * Gets the "href" attribute
         */
        java.lang.String getHref();
        
        /**
         * Gets (as xml) the "href" attribute
         */
        org.w3.x1999.xhtml.URI xgetHref();
        
        /**
         * True if has "href" attribute
         */
        boolean isSetHref();
        
        /**
         * Sets the "href" attribute
         */
        void setHref(java.lang.String href);
        
        /**
         * Sets (as xml) the "href" attribute
         */
        void xsetHref(org.w3.x1999.xhtml.URI href);
        
        /**
         * Unsets the "href" attribute
         */
        void unsetHref();
        
        /**
         * Gets the "hreflang" attribute
         */
        java.lang.String getHreflang();
        
        /**
         * Gets (as xml) the "hreflang" attribute
         */
        org.w3.x1999.xhtml.LanguageCode xgetHreflang();
        
        /**
         * True if has "hreflang" attribute
         */
        boolean isSetHreflang();
        
        /**
         * Sets the "hreflang" attribute
         */
        void setHreflang(java.lang.String hreflang);
        
        /**
         * Sets (as xml) the "hreflang" attribute
         */
        void xsetHreflang(org.w3.x1999.xhtml.LanguageCode hreflang);
        
        /**
         * Unsets the "hreflang" attribute
         */
        void unsetHreflang();
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.w3.x1999.xhtml.ContentType xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.w3.x1999.xhtml.ContentType type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "rel" attribute
         */
        java.util.List getRel();
        
        /**
         * Gets (as xml) the "rel" attribute
         */
        org.w3.x1999.xhtml.LinkTypes xgetRel();
        
        /**
         * True if has "rel" attribute
         */
        boolean isSetRel();
        
        /**
         * Sets the "rel" attribute
         */
        void setRel(java.util.List rel);
        
        /**
         * Sets (as xml) the "rel" attribute
         */
        void xsetRel(org.w3.x1999.xhtml.LinkTypes rel);
        
        /**
         * Unsets the "rel" attribute
         */
        void unsetRel();
        
        /**
         * Gets the "rev" attribute
         */
        java.util.List getRev();
        
        /**
         * Gets (as xml) the "rev" attribute
         */
        org.w3.x1999.xhtml.LinkTypes xgetRev();
        
        /**
         * True if has "rev" attribute
         */
        boolean isSetRev();
        
        /**
         * Sets the "rev" attribute
         */
        void setRev(java.util.List rev);
        
        /**
         * Sets (as xml) the "rev" attribute
         */
        void xsetRev(org.w3.x1999.xhtml.LinkTypes rev);
        
        /**
         * Unsets the "rev" attribute
         */
        void unsetRev();
        
        /**
         * Gets the "media" attribute
         */
        java.lang.String getMedia();
        
        /**
         * Gets (as xml) the "media" attribute
         */
        org.w3.x1999.xhtml.MediaDesc xgetMedia();
        
        /**
         * True if has "media" attribute
         */
        boolean isSetMedia();
        
        /**
         * Sets the "media" attribute
         */
        void setMedia(java.lang.String media);
        
        /**
         * Sets (as xml) the "media" attribute
         */
        void xsetMedia(org.w3.x1999.xhtml.MediaDesc media);
        
        /**
         * Unsets the "media" attribute
         */
        void unsetMedia();
        
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.LinkDocument$Link$Dir.
         */
        public interface Dir extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("dira57eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LTR = Enum.forString("ltr");
            static final Enum RTL = Enum.forString("rtl");
            
            static final int INT_LTR = Enum.INT_LTR;
            static final int INT_RTL = Enum.INT_RTL;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.LinkDocument$Link$Dir.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LTR
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_LTR = 1;
                static final int INT_RTL = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("ltr", INT_LTR),
                      new Enum("rtl", INT_RTL),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x1999.xhtml.LinkDocument.Link.Dir newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.LinkDocument.Link.Dir) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.LinkDocument.Link.Dir newInstance() {
                  return (org.w3.x1999.xhtml.LinkDocument.Link.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.LinkDocument.Link.Dir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.LinkDocument.Link.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x1999.xhtml.LinkDocument.Link newInstance() {
              return (org.w3.x1999.xhtml.LinkDocument.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x1999.xhtml.LinkDocument.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x1999.xhtml.LinkDocument.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xhtml.LinkDocument newInstance() {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xhtml.LinkDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xhtml.LinkDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xhtml.LinkDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.LinkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.LinkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
