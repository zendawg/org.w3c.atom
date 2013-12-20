/*
 * An XML document type.
 * Localname: entry
 * Namespace: http://www.w3.org/2005/Atom
 * Java type: org.w3.x2005.atom.EntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.atom.impl;
/**
 * A document containing one entry(@http://www.w3.org/2005/Atom) element.
 *
 * This is a complex type.
 */
public class EntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2005.atom.EntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "entry");
    
    
    /**
     * Gets the "entry" element
     */
    public org.w3.x2005.atom.EntryType getEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.EntryType target = null;
            target = (org.w3.x2005.atom.EntryType)get_store().find_element_user(ENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entry" element
     */
    public void setEntry(org.w3.x2005.atom.EntryType entry)
    {
        generatedSetterHelperImpl(entry, ENTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entry" element
     */
    public org.w3.x2005.atom.EntryType addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.EntryType target = null;
            target = (org.w3.x2005.atom.EntryType)get_store().add_element_user(ENTRY$0);
            return target;
        }
    }
}
