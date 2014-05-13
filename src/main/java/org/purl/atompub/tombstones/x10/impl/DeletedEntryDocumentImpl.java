/*
 * An XML document type.
 * Localname: deleted-entry
 * Namespace: http://purl.org/atompub/tombstones/1.0
 * Java type: org.purl.atompub.tombstones.x10.DeletedEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.atompub.tombstones.x10.impl;
/**
 * A document containing one deleted-entry(@http://purl.org/atompub/tombstones/1.0) element.
 *
 * This is a complex type.
 */
public class DeletedEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.atompub.tombstones.x10.DeletedEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeletedEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEDENTRY$0 = 
        new javax.xml.namespace.QName("http://purl.org/atompub/tombstones/1.0", "deleted-entry");
    
    
    /**
     * Gets the "deleted-entry" element
     */
    public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry getDeletedEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry target = null;
            target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry)get_store().find_element_user(DELETEDENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deleted-entry" element
     */
    public void setDeletedEntry(org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry deletedEntry)
    {
        generatedSetterHelperImpl(deletedEntry, DELETEDENTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deleted-entry" element
     */
    public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry addNewDeletedEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry target = null;
            target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry)get_store().add_element_user(DELETEDENTRY$0);
            return target;
        }
    }
    /**
     * An XML deleted-entry(@http://purl.org/atompub/tombstones/1.0).
     *
     * This is a complex type.
     */
    public static class DeletedEntryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry
    {
        private static final long serialVersionUID = 1L;
        
        public DeletedEntryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINK$0 = 
            new javax.xml.namespace.QName("http://purl.org/atompub/tombstones/1.0", "link");
        private static final javax.xml.namespace.QName REF$2 = 
            new javax.xml.namespace.QName("", "ref");
        private static final javax.xml.namespace.QName WHEN$4 = 
            new javax.xml.namespace.QName("", "when");
        
        
        /**
         * Gets the "link" element
         */
        public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link getLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link target = null;
                target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link)get_store().find_element_user(LINK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "link" element
         */
        public void setLink(org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link link)
        {
            generatedSetterHelperImpl(link, LINK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "link" element
         */
        public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link target = null;
                target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link)get_store().add_element_user(LINK$0);
                return target;
            }
        }
        
        /**
         * Gets the "ref" attribute
         */
        public java.lang.String getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REF$2);
                return target;
            }
        }
        
        /**
         * Sets the "ref" attribute
         */
        public void setRef(java.lang.String ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$2);
                }
                target.setStringValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        public void xsetRef(org.apache.xmlbeans.XmlAnyURI ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(REF$2);
                }
                target.set(ref);
            }
        }
        
        /**
         * Gets the "when" attribute
         */
        public java.util.Calendar getWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WHEN$4);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "when" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(WHEN$4);
                return target;
            }
        }
        
        /**
         * Sets the "when" attribute
         */
        public void setWhen(java.util.Calendar when)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WHEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WHEN$4);
                }
                target.setCalendarValue(when);
            }
        }
        
        /**
         * Sets (as xml) the "when" attribute
         */
        public void xsetWhen(org.apache.xmlbeans.XmlDateTime when)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(WHEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(WHEN$4);
                }
                target.set(when);
            }
        }
        /**
         * An XML link(@http://purl.org/atompub/tombstones/1.0).
         *
         * This is a complex type.
         */
        public static class LinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry.Link
        {
            private static final long serialVersionUID = 1L;
            
            public LinkImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REL$0 = 
                new javax.xml.namespace.QName("", "rel");
            private static final javax.xml.namespace.QName HREF$2 = 
                new javax.xml.namespace.QName("", "href");
            
            
            /**
             * Gets the "rel" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType getRel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(REL$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnySimpleType)get_default_attribute_value(REL$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "rel" attribute
             */
            public boolean isSetRel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(REL$0) != null;
                }
            }
            
            /**
             * Sets the "rel" attribute
             */
            public void setRel(org.apache.xmlbeans.XmlAnySimpleType rel)
            {
                generatedSetterHelperImpl(rel, REL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "rel" attribute
             */
            public org.apache.xmlbeans.XmlAnySimpleType addNewRel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnySimpleType target = null;
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(REL$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "rel" attribute
             */
            public void unsetRel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(REL$0);
                }
            }
            
            /**
             * Gets the "href" attribute
             */
            public java.lang.String getHref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "href" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetHref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$2);
                    return target;
                }
            }
            
            /**
             * Sets the "href" attribute
             */
            public void setHref(java.lang.String href)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$2);
                    }
                    target.setStringValue(href);
                }
            }
            
            /**
             * Sets (as xml) the "href" attribute
             */
            public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$2);
                    }
                    target.set(href);
                }
            }
        }
    }
}
