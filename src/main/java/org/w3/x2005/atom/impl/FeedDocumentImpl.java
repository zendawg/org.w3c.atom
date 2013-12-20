/*
 * An XML document type.
 * Localname: feed
 * Namespace: http://www.w3.org/2005/Atom
 * Java type: org.w3.x2005.atom.FeedDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.atom.impl;
/**
 * A document containing one feed(@http://www.w3.org/2005/Atom) element.
 *
 * This is a complex type.
 */
public class FeedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2005.atom.FeedDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEED$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "feed");
    
    
    /**
     * Gets the "feed" element
     */
    public org.w3.x2005.atom.FeedType getFeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.FeedType target = null;
            target = (org.w3.x2005.atom.FeedType)get_store().find_element_user(FEED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "feed" element
     */
    public void setFeed(org.w3.x2005.atom.FeedType feed)
    {
        generatedSetterHelperImpl(feed, FEED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "feed" element
     */
    public org.w3.x2005.atom.FeedType addNewFeed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.FeedType target = null;
            target = (org.w3.x2005.atom.FeedType)get_store().add_element_user(FEED$0);
            return target;
        }
    }
}
