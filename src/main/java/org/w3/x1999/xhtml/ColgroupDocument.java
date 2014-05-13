/*
 * An XML document type.
 * Localname: colgroup
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.ColgroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml;


/**
 * A document containing one colgroup(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public interface ColgroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColgroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("colgroup4398doctype");
    
    /**
     * Gets the "colgroup" element
     */
    org.w3.x1999.xhtml.ColgroupDocument.Colgroup getColgroup();
    
    /**
     * Sets the "colgroup" element
     */
    void setColgroup(org.w3.x1999.xhtml.ColgroupDocument.Colgroup colgroup);
    
    /**
     * Appends and returns a new empty "colgroup" element
     */
    org.w3.x1999.xhtml.ColgroupDocument.Colgroup addNewColgroup();
    
    /**
     * An XML colgroup(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public interface Colgroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Colgroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("colgroupa233elemtype");
        
        /**
         * Gets array of all "col" elements
         */
        org.w3.x1999.xhtml.ColDocument.Col[] getColArray();
        
        /**
         * Gets ith "col" element
         */
        org.w3.x1999.xhtml.ColDocument.Col getColArray(int i);
        
        /**
         * Returns number of "col" element
         */
        int sizeOfColArray();
        
        /**
         * Sets array of all "col" element
         */
        void setColArray(org.w3.x1999.xhtml.ColDocument.Col[] colArray);
        
        /**
         * Sets ith "col" element
         */
        void setColArray(int i, org.w3.x1999.xhtml.ColDocument.Col col);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "col" element
         */
        org.w3.x1999.xhtml.ColDocument.Col insertNewCol(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "col" element
         */
        org.w3.x1999.xhtml.ColDocument.Col addNewCol();
        
        /**
         * Removes the ith "col" element
         */
        void removeCol(int i);
        
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
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir.Enum getDir();
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir xgetDir();
        
        /**
         * True if has "dir" attribute
         */
        boolean isSetDir();
        
        /**
         * Sets the "dir" attribute
         */
        void setDir(org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir.Enum dir);
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        void xsetDir(org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir dir);
        
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
         * Gets the "span" attribute
         */
        java.math.BigInteger getSpan();
        
        /**
         * Gets (as xml) the "span" attribute
         */
        org.w3.x1999.xhtml.Number xgetSpan();
        
        /**
         * True if has "span" attribute
         */
        boolean isSetSpan();
        
        /**
         * Sets the "span" attribute
         */
        void setSpan(java.math.BigInteger span);
        
        /**
         * Sets (as xml) the "span" attribute
         */
        void xsetSpan(org.w3.x1999.xhtml.Number span);
        
        /**
         * Unsets the "span" attribute
         */
        void unsetSpan();
        
        /**
         * Gets the "width" attribute
         */
        java.lang.String getWidth();
        
        /**
         * Gets (as xml) the "width" attribute
         */
        org.w3.x1999.xhtml.MultiLength xgetWidth();
        
        /**
         * True if has "width" attribute
         */
        boolean isSetWidth();
        
        /**
         * Sets the "width" attribute
         */
        void setWidth(java.lang.String width);
        
        /**
         * Sets (as xml) the "width" attribute
         */
        void xsetWidth(org.w3.x1999.xhtml.MultiLength width);
        
        /**
         * Unsets the "width" attribute
         */
        void unsetWidth();
        
        /**
         * Gets the "align" attribute
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align.Enum getAlign();
        
        /**
         * Gets (as xml) the "align" attribute
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align xgetAlign();
        
        /**
         * True if has "align" attribute
         */
        boolean isSetAlign();
        
        /**
         * Sets the "align" attribute
         */
        void setAlign(org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align.Enum align);
        
        /**
         * Sets (as xml) the "align" attribute
         */
        void xsetAlign(org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align align);
        
        /**
         * Unsets the "align" attribute
         */
        void unsetAlign();
        
        /**
         * Gets the "char" attribute
         */
        java.lang.String getChar();
        
        /**
         * Gets (as xml) the "char" attribute
         */
        org.w3.x1999.xhtml.Character xgetChar();
        
        /**
         * True if has "char" attribute
         */
        boolean isSetChar();
        
        /**
         * Sets the "char" attribute
         */
        void setChar(java.lang.String xchar);
        
        /**
         * Sets (as xml) the "char" attribute
         */
        void xsetChar(org.w3.x1999.xhtml.Character xchar);
        
        /**
         * Unsets the "char" attribute
         */
        void unsetChar();
        
        /**
         * Gets the "charoff" attribute
         */
        java.lang.String getCharoff();
        
        /**
         * Gets (as xml) the "charoff" attribute
         */
        org.w3.x1999.xhtml.Length xgetCharoff();
        
        /**
         * True if has "charoff" attribute
         */
        boolean isSetCharoff();
        
        /**
         * Sets the "charoff" attribute
         */
        void setCharoff(java.lang.String charoff);
        
        /**
         * Sets (as xml) the "charoff" attribute
         */
        void xsetCharoff(org.w3.x1999.xhtml.Length charoff);
        
        /**
         * Unsets the "charoff" attribute
         */
        void unsetCharoff();
        
        /**
         * Gets the "valign" attribute
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign.Enum getValign();
        
        /**
         * Gets (as xml) the "valign" attribute
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign xgetValign();
        
        /**
         * True if has "valign" attribute
         */
        boolean isSetValign();
        
        /**
         * Sets the "valign" attribute
         */
        void setValign(org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign.Enum valign);
        
        /**
         * Sets (as xml) the "valign" attribute
         */
        void xsetValign(org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign valign);
        
        /**
         * Unsets the "valign" attribute
         */
        void unsetValign();
        
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.ColgroupDocument$Colgroup$Dir.
         */
        public interface Dir extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("dir691eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LTR = Enum.forString("ltr");
            static final Enum RTL = Enum.forString("rtl");
            
            static final int INT_LTR = Enum.INT_LTR;
            static final int INT_RTL = Enum.INT_RTL;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.ColgroupDocument$Colgroup$Dir.
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
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir newInstance() {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML align(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.ColgroupDocument$Colgroup$Align.
         */
        public interface Align extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Align.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("align1ca6attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LEFT = Enum.forString("left");
            static final Enum CENTER = Enum.forString("center");
            static final Enum RIGHT = Enum.forString("right");
            static final Enum JUSTIFY = Enum.forString("justify");
            static final Enum CHAR = Enum.forString("char");
            
            static final int INT_LEFT = Enum.INT_LEFT;
            static final int INT_CENTER = Enum.INT_CENTER;
            static final int INT_RIGHT = Enum.INT_RIGHT;
            static final int INT_JUSTIFY = Enum.INT_JUSTIFY;
            static final int INT_CHAR = Enum.INT_CHAR;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.ColgroupDocument$Colgroup$Align.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LEFT
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
                
                static final int INT_LEFT = 1;
                static final int INT_CENTER = 2;
                static final int INT_RIGHT = 3;
                static final int INT_JUSTIFY = 4;
                static final int INT_CHAR = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("left", INT_LEFT),
                      new Enum("center", INT_CENTER),
                      new Enum("right", INT_RIGHT),
                      new Enum("justify", INT_JUSTIFY),
                      new Enum("char", INT_CHAR),
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
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align newInstance() {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML valign(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.ColgroupDocument$Colgroup$Valign.
         */
        public interface Valign extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Valign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("valignbe64attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TOP = Enum.forString("top");
            static final Enum MIDDLE = Enum.forString("middle");
            static final Enum BOTTOM = Enum.forString("bottom");
            static final Enum BASELINE = Enum.forString("baseline");
            
            static final int INT_TOP = Enum.INT_TOP;
            static final int INT_MIDDLE = Enum.INT_MIDDLE;
            static final int INT_BOTTOM = Enum.INT_BOTTOM;
            static final int INT_BASELINE = Enum.INT_BASELINE;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.ColgroupDocument$Colgroup$Valign.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TOP
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
                
                static final int INT_TOP = 1;
                static final int INT_MIDDLE = 2;
                static final int INT_BOTTOM = 3;
                static final int INT_BASELINE = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("top", INT_TOP),
                      new Enum("middle", INT_MIDDLE),
                      new Enum("bottom", INT_BOTTOM),
                      new Enum("baseline", INT_BASELINE),
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
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign newInstance() {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup.Valign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup newInstance() {
              return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x1999.xhtml.ColgroupDocument.Colgroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x1999.xhtml.ColgroupDocument.Colgroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xhtml.ColgroupDocument newInstance() {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xhtml.ColgroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.ColgroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.ColgroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.ColgroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
