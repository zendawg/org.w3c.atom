/*
 * XML Type:  entryType
 * Namespace: http://www.w3.org/2005/Atom
 * Java type: org.w3.x2005.atom.EntryType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.atom.impl;
/**
 * An XML entryType(@http://www.w3.org/2005/Atom).
 *
 * This is a complex type.
 */
public class EntryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2005.atom.EntryType
{
    private static final long serialVersionUID = 1L;
    
    public EntryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHOR$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "author");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "category");
    private static final javax.xml.namespace.QName CONTENT$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "content");
    private static final javax.xml.namespace.QName CONTRIBUTOR$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "contributor");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "id");
    private static final javax.xml.namespace.QName LINK$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "link");
    private static final javax.xml.namespace.QName PUBLISHED$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "published");
    private static final javax.xml.namespace.QName RIGHTS$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "rights");
    private static final javax.xml.namespace.QName SOURCE$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "source");
    private static final javax.xml.namespace.QName SUMMARY$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "summary");
    private static final javax.xml.namespace.QName TITLE$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "title");
    private static final javax.xml.namespace.QName UPDATED$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "updated");
    private static final javax.xml.namespace.QName BASE$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "base");
    private static final javax.xml.namespace.QName LANG$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    
    
    /**
     * Gets array of all "author" elements
     */
    public org.w3.x2005.atom.PersonType[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$0, targetList);
            org.w3.x2005.atom.PersonType[] result = new org.w3.x2005.atom.PersonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public org.w3.x2005.atom.PersonType getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().find_element_user(AUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$0);
        }
    }
    
    /**
     * Sets array of all "author" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorArray(org.w3.x2005.atom.PersonType[] authorArray)
    {
        check_orphaned();
        arraySetterHelper(authorArray, AUTHOR$0);
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, org.w3.x2005.atom.PersonType author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().find_element_user(AUTHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public org.w3.x2005.atom.PersonType insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().insert_element_user(AUTHOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public org.w3.x2005.atom.PersonType addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().add_element_user(AUTHOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$0, i);
        }
    }
    
    /**
     * Gets array of all "category" elements
     */
    public org.w3.x2005.atom.CategoryType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$2, targetList);
            org.w3.x2005.atom.CategoryType[] result = new org.w3.x2005.atom.CategoryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "category" element
     */
    public org.w3.x2005.atom.CategoryType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.CategoryType target = null;
            target = (org.w3.x2005.atom.CategoryType)get_store().find_element_user(CATEGORY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$2);
        }
    }
    
    /**
     * Sets array of all "category" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCategoryArray(org.w3.x2005.atom.CategoryType[] categoryArray)
    {
        check_orphaned();
        arraySetterHelper(categoryArray, CATEGORY$2);
    }
    
    /**
     * Sets ith "category" element
     */
    public void setCategoryArray(int i, org.w3.x2005.atom.CategoryType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.CategoryType target = null;
            target = (org.w3.x2005.atom.CategoryType)get_store().find_element_user(CATEGORY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    public org.w3.x2005.atom.CategoryType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.CategoryType target = null;
            target = (org.w3.x2005.atom.CategoryType)get_store().insert_element_user(CATEGORY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    public org.w3.x2005.atom.CategoryType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.CategoryType target = null;
            target = (org.w3.x2005.atom.CategoryType)get_store().add_element_user(CATEGORY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$2, i);
        }
    }
    
    /**
     * Gets array of all "content" elements
     */
    public org.w3.x2005.atom.ContentType[] getContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENT$4, targetList);
            org.w3.x2005.atom.ContentType[] result = new org.w3.x2005.atom.ContentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "content" element
     */
    public org.w3.x2005.atom.ContentType getContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.ContentType target = null;
            target = (org.w3.x2005.atom.ContentType)get_store().find_element_user(CONTENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "content" element
     */
    public int sizeOfContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$4);
        }
    }
    
    /**
     * Sets array of all "content" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContentArray(org.w3.x2005.atom.ContentType[] contentArray)
    {
        check_orphaned();
        arraySetterHelper(contentArray, CONTENT$4);
    }
    
    /**
     * Sets ith "content" element
     */
    public void setContentArray(int i, org.w3.x2005.atom.ContentType content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.ContentType target = null;
            target = (org.w3.x2005.atom.ContentType)get_store().find_element_user(CONTENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(content);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    public org.w3.x2005.atom.ContentType insertNewContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.ContentType target = null;
            target = (org.w3.x2005.atom.ContentType)get_store().insert_element_user(CONTENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    public org.w3.x2005.atom.ContentType addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.ContentType target = null;
            target = (org.w3.x2005.atom.ContentType)get_store().add_element_user(CONTENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "content" element
     */
    public void removeContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$4, i);
        }
    }
    
    /**
     * Gets array of all "contributor" elements
     */
    public org.w3.x2005.atom.PersonType[] getContributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTRIBUTOR$6, targetList);
            org.w3.x2005.atom.PersonType[] result = new org.w3.x2005.atom.PersonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contributor" element
     */
    public org.w3.x2005.atom.PersonType getContributorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().find_element_user(CONTRIBUTOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contributor" element
     */
    public int sizeOfContributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRIBUTOR$6);
        }
    }
    
    /**
     * Sets array of all "contributor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContributorArray(org.w3.x2005.atom.PersonType[] contributorArray)
    {
        check_orphaned();
        arraySetterHelper(contributorArray, CONTRIBUTOR$6);
    }
    
    /**
     * Sets ith "contributor" element
     */
    public void setContributorArray(int i, org.w3.x2005.atom.PersonType contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().find_element_user(CONTRIBUTOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contributor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contributor" element
     */
    public org.w3.x2005.atom.PersonType insertNewContributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().insert_element_user(CONTRIBUTOR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contributor" element
     */
    public org.w3.x2005.atom.PersonType addNewContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.PersonType target = null;
            target = (org.w3.x2005.atom.PersonType)get_store().add_element_user(CONTRIBUTOR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "contributor" element
     */
    public void removeContributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRIBUTOR$6, i);
        }
    }
    
    /**
     * Gets array of all "id" elements
     */
    public org.w3.x2005.atom.IdType[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$8, targetList);
            org.w3.x2005.atom.IdType[] result = new org.w3.x2005.atom.IdType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public org.w3.x2005.atom.IdType getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.IdType target = null;
            target = (org.w3.x2005.atom.IdType)get_store().find_element_user(ID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "id" element
     */
    public int sizeOfIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$8);
        }
    }
    
    /**
     * Sets array of all "id" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdArray(org.w3.x2005.atom.IdType[] idArray)
    {
        check_orphaned();
        arraySetterHelper(idArray, ID$8);
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, org.w3.x2005.atom.IdType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.IdType target = null;
            target = (org.w3.x2005.atom.IdType)get_store().find_element_user(ID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public org.w3.x2005.atom.IdType insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.IdType target = null;
            target = (org.w3.x2005.atom.IdType)get_store().insert_element_user(ID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    public org.w3.x2005.atom.IdType addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.IdType target = null;
            target = (org.w3.x2005.atom.IdType)get_store().add_element_user(ID$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$8, i);
        }
    }
    
    /**
     * Gets array of all "link" elements
     */
    public org.w3.x2005.atom.LinkType[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$10, targetList);
            org.w3.x2005.atom.LinkType[] result = new org.w3.x2005.atom.LinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "link" element
     */
    public org.w3.x2005.atom.LinkType getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.LinkType target = null;
            target = (org.w3.x2005.atom.LinkType)get_store().find_element_user(LINK$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$10);
        }
    }
    
    /**
     * Sets array of all "link" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkArray(org.w3.x2005.atom.LinkType[] linkArray)
    {
        check_orphaned();
        arraySetterHelper(linkArray, LINK$10);
    }
    
    /**
     * Sets ith "link" element
     */
    public void setLinkArray(int i, org.w3.x2005.atom.LinkType link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.LinkType target = null;
            target = (org.w3.x2005.atom.LinkType)get_store().find_element_user(LINK$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(link);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    public org.w3.x2005.atom.LinkType insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.LinkType target = null;
            target = (org.w3.x2005.atom.LinkType)get_store().insert_element_user(LINK$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    public org.w3.x2005.atom.LinkType addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.LinkType target = null;
            target = (org.w3.x2005.atom.LinkType)get_store().add_element_user(LINK$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$10, i);
        }
    }
    
    /**
     * Gets array of all "published" elements
     */
    public org.w3.x2005.atom.DateTimeType[] getPublishedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PUBLISHED$12, targetList);
            org.w3.x2005.atom.DateTimeType[] result = new org.w3.x2005.atom.DateTimeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "published" element
     */
    public org.w3.x2005.atom.DateTimeType getPublishedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().find_element_user(PUBLISHED$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "published" element
     */
    public int sizeOfPublishedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLISHED$12);
        }
    }
    
    /**
     * Sets array of all "published" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPublishedArray(org.w3.x2005.atom.DateTimeType[] publishedArray)
    {
        check_orphaned();
        arraySetterHelper(publishedArray, PUBLISHED$12);
    }
    
    /**
     * Sets ith "published" element
     */
    public void setPublishedArray(int i, org.w3.x2005.atom.DateTimeType published)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().find_element_user(PUBLISHED$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(published);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "published" element
     */
    public org.w3.x2005.atom.DateTimeType insertNewPublished(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().insert_element_user(PUBLISHED$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "published" element
     */
    public org.w3.x2005.atom.DateTimeType addNewPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().add_element_user(PUBLISHED$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "published" element
     */
    public void removePublished(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLISHED$12, i);
        }
    }
    
    /**
     * Gets array of all "rights" elements
     */
    public org.w3.x2005.atom.TextType[] getRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RIGHTS$14, targetList);
            org.w3.x2005.atom.TextType[] result = new org.w3.x2005.atom.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rights" element
     */
    public org.w3.x2005.atom.TextType getRightsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(RIGHTS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rights" element
     */
    public int sizeOfRightsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTS$14);
        }
    }
    
    /**
     * Sets array of all "rights" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRightsArray(org.w3.x2005.atom.TextType[] rightsArray)
    {
        check_orphaned();
        arraySetterHelper(rightsArray, RIGHTS$14);
    }
    
    /**
     * Sets ith "rights" element
     */
    public void setRightsArray(int i, org.w3.x2005.atom.TextType rights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(RIGHTS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rights);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rights" element
     */
    public org.w3.x2005.atom.TextType insertNewRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().insert_element_user(RIGHTS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rights" element
     */
    public org.w3.x2005.atom.TextType addNewRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().add_element_user(RIGHTS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "rights" element
     */
    public void removeRights(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTS$14, i);
        }
    }
    
    /**
     * Gets array of all "source" elements
     */
    public org.w3.x2005.atom.TextType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$16, targetList);
            org.w3.x2005.atom.TextType[] result = new org.w3.x2005.atom.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "source" element
     */
    public org.w3.x2005.atom.TextType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(SOURCE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$16);
        }
    }
    
    /**
     * Sets array of all "source" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSourceArray(org.w3.x2005.atom.TextType[] sourceArray)
    {
        check_orphaned();
        arraySetterHelper(sourceArray, SOURCE$16);
    }
    
    /**
     * Sets ith "source" element
     */
    public void setSourceArray(int i, org.w3.x2005.atom.TextType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(SOURCE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    public org.w3.x2005.atom.TextType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().insert_element_user(SOURCE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    public org.w3.x2005.atom.TextType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().add_element_user(SOURCE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$16, i);
        }
    }
    
    /**
     * Gets array of all "summary" elements
     */
    public org.w3.x2005.atom.TextType[] getSummaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUMMARY$18, targetList);
            org.w3.x2005.atom.TextType[] result = new org.w3.x2005.atom.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "summary" element
     */
    public org.w3.x2005.atom.TextType getSummaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(SUMMARY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "summary" element
     */
    public int sizeOfSummaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUMMARY$18);
        }
    }
    
    /**
     * Sets array of all "summary" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSummaryArray(org.w3.x2005.atom.TextType[] summaryArray)
    {
        check_orphaned();
        arraySetterHelper(summaryArray, SUMMARY$18);
    }
    
    /**
     * Sets ith "summary" element
     */
    public void setSummaryArray(int i, org.w3.x2005.atom.TextType summary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(SUMMARY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(summary);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "summary" element
     */
    public org.w3.x2005.atom.TextType insertNewSummary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().insert_element_user(SUMMARY$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "summary" element
     */
    public org.w3.x2005.atom.TextType addNewSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().add_element_user(SUMMARY$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "summary" element
     */
    public void removeSummary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUMMARY$18, i);
        }
    }
    
    /**
     * Gets array of all "title" elements
     */
    public org.w3.x2005.atom.TextType[] getTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TITLE$20, targetList);
            org.w3.x2005.atom.TextType[] result = new org.w3.x2005.atom.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "title" element
     */
    public org.w3.x2005.atom.TextType getTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(TITLE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "title" element
     */
    public int sizeOfTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$20);
        }
    }
    
    /**
     * Sets array of all "title" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTitleArray(org.w3.x2005.atom.TextType[] titleArray)
    {
        check_orphaned();
        arraySetterHelper(titleArray, TITLE$20);
    }
    
    /**
     * Sets ith "title" element
     */
    public void setTitleArray(int i, org.w3.x2005.atom.TextType title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(TITLE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(title);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    public org.w3.x2005.atom.TextType insertNewTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().insert_element_user(TITLE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    public org.w3.x2005.atom.TextType addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.TextType target = null;
            target = (org.w3.x2005.atom.TextType)get_store().add_element_user(TITLE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "title" element
     */
    public void removeTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$20, i);
        }
    }
    
    /**
     * Gets array of all "updated" elements
     */
    public org.w3.x2005.atom.DateTimeType[] getUpdatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPDATED$22, targetList);
            org.w3.x2005.atom.DateTimeType[] result = new org.w3.x2005.atom.DateTimeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "updated" element
     */
    public org.w3.x2005.atom.DateTimeType getUpdatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().find_element_user(UPDATED$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "updated" element
     */
    public int sizeOfUpdatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATED$22);
        }
    }
    
    /**
     * Sets array of all "updated" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUpdatedArray(org.w3.x2005.atom.DateTimeType[] updatedArray)
    {
        check_orphaned();
        arraySetterHelper(updatedArray, UPDATED$22);
    }
    
    /**
     * Sets ith "updated" element
     */
    public void setUpdatedArray(int i, org.w3.x2005.atom.DateTimeType updated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().find_element_user(UPDATED$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(updated);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "updated" element
     */
    public org.w3.x2005.atom.DateTimeType insertNewUpdated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().insert_element_user(UPDATED$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "updated" element
     */
    public org.w3.x2005.atom.DateTimeType addNewUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.DateTimeType target = null;
            target = (org.w3.x2005.atom.DateTimeType)get_store().add_element_user(UPDATED$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "updated" element
     */
    public void removeUpdated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATED$22, i);
        }
    }
    
    /**
     * Gets the "base" attribute
     */
    public java.lang.String getBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "base" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(BASE$24);
            return target;
        }
    }
    
    /**
     * True if has "base" attribute
     */
    public boolean isSetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASE$24) != null;
        }
    }
    
    /**
     * Sets the "base" attribute
     */
    public void setBase(java.lang.String base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$24);
            }
            target.setStringValue(base);
        }
    }
    
    /**
     * Sets (as xml) the "base" attribute
     */
    public void xsetBase(org.apache.xmlbeans.XmlAnyURI base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(BASE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(BASE$24);
            }
            target.set(base);
        }
    }
    
    /**
     * Unsets the "base" attribute
     */
    public void unsetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASE$24);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$26);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$26) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$26);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$26);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$26);
        }
    }
}
