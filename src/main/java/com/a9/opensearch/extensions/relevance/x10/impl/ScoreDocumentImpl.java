/*
 * An XML document type.
 * Localname: score
 * Namespace: http://a9.com/-/opensearch/extensions/relevance/1.0/
 * Java type: com.a9.opensearch.extensions.relevance.x10.ScoreDocument
 *
 * Automatically generated - do not modify.
 */
package com.a9.opensearch.extensions.relevance.x10.impl;
/**
 * A document containing one score(@http://a9.com/-/opensearch/extensions/relevance/1.0/) element.
 *
 * This is a complex type.
 */
public class ScoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.a9.opensearch.extensions.relevance.x10.ScoreDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCORE$0 = 
        new javax.xml.namespace.QName("http://a9.com/-/opensearch/extensions/relevance/1.0/", "score");
    
    
    /**
     * Gets the "score" element
     */
    public java.math.BigDecimal getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "score" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCORE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "score" element
     */
    public void setScore(java.math.BigDecimal score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORE$0);
            }
            target.setBigDecimalValue(score);
        }
    }
    
    /**
     * Sets (as xml) the "score" element
     */
    public void xsetScore(org.apache.xmlbeans.XmlDecimal score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCORE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SCORE$0);
            }
            target.set(score);
        }
    }
}
