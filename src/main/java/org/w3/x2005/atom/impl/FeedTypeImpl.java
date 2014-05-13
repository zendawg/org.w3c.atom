/*
 * XML Type:  FeedType
 * Namespace: http://www.w3.org/2005/Atom
 * Java type: org.w3.x2005.atom.FeedType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.atom.impl;
/**
 * An XML FeedType(@http://www.w3.org/2005/Atom).
 *
 * This is a complex type.
 */
public class FeedTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2005.atom.FeedType
{
    private static final long serialVersionUID = 1L;
    
    public FeedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "title");
    private static final javax.xml.namespace.QName UPDATED$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "updated");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "id");
    private static final javax.xml.namespace.QName LINK$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "link");
    private static final javax.xml.namespace.QName AUTHOR$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "author");
    private static final javax.xml.namespace.QName CATEGORY$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "category");
    private static final javax.xml.namespace.QName ENTRY$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/Atom", "entry");
    private static final javax.xml.namespace.QName DELETEDENTRY$14 = 
        new javax.xml.namespace.QName("http://purl.org/atompub/tombstones/1.0", "deleted-entry");
    private static final javax.xml.namespace.QName TOTALRESULTS$16 = 
        new javax.xml.namespace.QName("http://a9.com/-/spec/opensearch/1.1/", "totalResults");
    private static final javax.xml.namespace.QName SCORE$18 = 
        new javax.xml.namespace.QName("http://a9.com/-/opensearch/extensions/relevance/1.0/", "score");
    private static final javax.xml.namespace.QName SIGNATURE$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private static final javax.xml.namespace.QName BASE$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "base");
    private static final javax.xml.namespace.QName LANG$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    
    
    /**
     * Gets array of all "title" elements
     */
    public org.w3.x2005.atom.TextType[] getTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TITLE$0, targetList);
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
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(TITLE$0, i);
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
            return get_store().count_elements(TITLE$0);
        }
    }
    
    /**
     * Sets array of all "title" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTitleArray(org.w3.x2005.atom.TextType[] titleArray)
    {
        check_orphaned();
        arraySetterHelper(titleArray, TITLE$0);
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
            target = (org.w3.x2005.atom.TextType)get_store().find_element_user(TITLE$0, i);
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
            target = (org.w3.x2005.atom.TextType)get_store().insert_element_user(TITLE$0, i);
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
            target = (org.w3.x2005.atom.TextType)get_store().add_element_user(TITLE$0);
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
            get_store().remove_element(TITLE$0, i);
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
            get_store().find_all_element_users(UPDATED$2, targetList);
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
            target = (org.w3.x2005.atom.DateTimeType)get_store().find_element_user(UPDATED$2, i);
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
            return get_store().count_elements(UPDATED$2);
        }
    }
    
    /**
     * Sets array of all "updated" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUpdatedArray(org.w3.x2005.atom.DateTimeType[] updatedArray)
    {
        check_orphaned();
        arraySetterHelper(updatedArray, UPDATED$2);
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
            target = (org.w3.x2005.atom.DateTimeType)get_store().find_element_user(UPDATED$2, i);
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
            target = (org.w3.x2005.atom.DateTimeType)get_store().insert_element_user(UPDATED$2, i);
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
            target = (org.w3.x2005.atom.DateTimeType)get_store().add_element_user(UPDATED$2);
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
            get_store().remove_element(UPDATED$2, i);
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
            get_store().find_all_element_users(ID$4, targetList);
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
            target = (org.w3.x2005.atom.IdType)get_store().find_element_user(ID$4, i);
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
            return get_store().count_elements(ID$4);
        }
    }
    
    /**
     * Sets array of all "id" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdArray(org.w3.x2005.atom.IdType[] idArray)
    {
        check_orphaned();
        arraySetterHelper(idArray, ID$4);
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
            target = (org.w3.x2005.atom.IdType)get_store().find_element_user(ID$4, i);
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
            target = (org.w3.x2005.atom.IdType)get_store().insert_element_user(ID$4, i);
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
            target = (org.w3.x2005.atom.IdType)get_store().add_element_user(ID$4);
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
            get_store().remove_element(ID$4, i);
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
            get_store().find_all_element_users(LINK$6, targetList);
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
            target = (org.w3.x2005.atom.LinkType)get_store().find_element_user(LINK$6, i);
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
            return get_store().count_elements(LINK$6);
        }
    }
    
    /**
     * Sets array of all "link" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkArray(org.w3.x2005.atom.LinkType[] linkArray)
    {
        check_orphaned();
        arraySetterHelper(linkArray, LINK$6);
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
            target = (org.w3.x2005.atom.LinkType)get_store().find_element_user(LINK$6, i);
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
            target = (org.w3.x2005.atom.LinkType)get_store().insert_element_user(LINK$6, i);
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
            target = (org.w3.x2005.atom.LinkType)get_store().add_element_user(LINK$6);
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
            get_store().remove_element(LINK$6, i);
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public org.w3.x2005.atom.PersonType[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$8, targetList);
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
            target = (org.w3.x2005.atom.PersonType)get_store().find_element_user(AUTHOR$8, i);
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
            return get_store().count_elements(AUTHOR$8);
        }
    }
    
    /**
     * Sets array of all "author" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorArray(org.w3.x2005.atom.PersonType[] authorArray)
    {
        check_orphaned();
        arraySetterHelper(authorArray, AUTHOR$8);
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
            target = (org.w3.x2005.atom.PersonType)get_store().find_element_user(AUTHOR$8, i);
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
            target = (org.w3.x2005.atom.PersonType)get_store().insert_element_user(AUTHOR$8, i);
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
            target = (org.w3.x2005.atom.PersonType)get_store().add_element_user(AUTHOR$8);
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
            get_store().remove_element(AUTHOR$8, i);
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
            get_store().find_all_element_users(CATEGORY$10, targetList);
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
            target = (org.w3.x2005.atom.CategoryType)get_store().find_element_user(CATEGORY$10, i);
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
            return get_store().count_elements(CATEGORY$10);
        }
    }
    
    /**
     * Sets array of all "category" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCategoryArray(org.w3.x2005.atom.CategoryType[] categoryArray)
    {
        check_orphaned();
        arraySetterHelper(categoryArray, CATEGORY$10);
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
            target = (org.w3.x2005.atom.CategoryType)get_store().find_element_user(CATEGORY$10, i);
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
            target = (org.w3.x2005.atom.CategoryType)get_store().insert_element_user(CATEGORY$10, i);
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
            target = (org.w3.x2005.atom.CategoryType)get_store().add_element_user(CATEGORY$10);
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
            get_store().remove_element(CATEGORY$10, i);
        }
    }
    
    /**
     * Gets array of all "entry" elements
     */
    public org.w3.x2005.atom.EntryType[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRY$12, targetList);
            org.w3.x2005.atom.EntryType[] result = new org.w3.x2005.atom.EntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public org.w3.x2005.atom.EntryType getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.EntryType target = null;
            target = (org.w3.x2005.atom.EntryType)get_store().find_element_user(ENTRY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$12);
        }
    }
    
    /**
     * Sets array of all "entry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntryArray(org.w3.x2005.atom.EntryType[] entryArray)
    {
        check_orphaned();
        arraySetterHelper(entryArray, ENTRY$12);
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, org.w3.x2005.atom.EntryType entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.EntryType target = null;
            target = (org.w3.x2005.atom.EntryType)get_store().find_element_user(ENTRY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public org.w3.x2005.atom.EntryType insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.EntryType target = null;
            target = (org.w3.x2005.atom.EntryType)get_store().insert_element_user(ENTRY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public org.w3.x2005.atom.EntryType addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.atom.EntryType target = null;
            target = (org.w3.x2005.atom.EntryType)get_store().add_element_user(ENTRY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$12, i);
        }
    }
    
    /**
     * Gets array of all "deleted-entry" elements
     */
    public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry[] getDeletedEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELETEDENTRY$14, targetList);
            org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry[] result = new org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deleted-entry" element
     */
    public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry getDeletedEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry target = null;
            target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry)get_store().find_element_user(DELETEDENTRY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deleted-entry" element
     */
    public int sizeOfDeletedEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEDENTRY$14);
        }
    }
    
    /**
     * Sets array of all "deleted-entry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeletedEntryArray(org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry[] deletedEntryArray)
    {
        check_orphaned();
        arraySetterHelper(deletedEntryArray, DELETEDENTRY$14);
    }
    
    /**
     * Sets ith "deleted-entry" element
     */
    public void setDeletedEntryArray(int i, org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry deletedEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry target = null;
            target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry)get_store().find_element_user(DELETEDENTRY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deletedEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deleted-entry" element
     */
    public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry insertNewDeletedEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry target = null;
            target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry)get_store().insert_element_user(DELETEDENTRY$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deleted-entry" element
     */
    public org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry addNewDeletedEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry target = null;
            target = (org.purl.atompub.tombstones.x10.DeletedEntryDocument.DeletedEntry)get_store().add_element_user(DELETEDENTRY$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "deleted-entry" element
     */
    public void removeDeletedEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEDENTRY$14, i);
        }
    }
    
    /**
     * Gets array of all "totalResults" elements
     */
    public java.math.BigInteger[] getTotalResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOTALRESULTS$16, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "totalResults" element
     */
    public java.math.BigInteger getTotalResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRESULTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "totalResults" elements
     */
    public org.apache.xmlbeans.XmlInteger[] xgetTotalResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOTALRESULTS$16, targetList);
            org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "totalResults" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALRESULTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "totalResults" element
     */
    public int sizeOfTotalResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALRESULTS$16);
        }
    }
    
    /**
     * Sets array of all "totalResults" element
     */
    public void setTotalResultsArray(java.math.BigInteger[] totalResultsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(totalResultsArray, TOTALRESULTS$16);
        }
    }
    
    /**
     * Sets ith "totalResults" element
     */
    public void setTotalResultsArray(int i, java.math.BigInteger totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALRESULTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(totalResults);
        }
    }
    
    /**
     * Sets (as xml) array of all "totalResults" element
     */
    public void xsetTotalResultsArray(org.apache.xmlbeans.XmlInteger[]totalResultsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(totalResultsArray, TOTALRESULTS$16);
        }
    }
    
    /**
     * Sets (as xml) ith "totalResults" element
     */
    public void xsetTotalResultsArray(int i, org.apache.xmlbeans.XmlInteger totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALRESULTS$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(totalResults);
        }
    }
    
    /**
     * Inserts the value as the ith "totalResults" element
     */
    public void insertTotalResults(int i, java.math.BigInteger totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TOTALRESULTS$16, i);
            target.setBigIntegerValue(totalResults);
        }
    }
    
    /**
     * Appends the value as the last "totalResults" element
     */
    public void addTotalResults(java.math.BigInteger totalResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALRESULTS$16);
            target.setBigIntegerValue(totalResults);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "totalResults" element
     */
    public org.apache.xmlbeans.XmlInteger insertNewTotalResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(TOTALRESULTS$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "totalResults" element
     */
    public org.apache.xmlbeans.XmlInteger addNewTotalResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALRESULTS$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "totalResults" element
     */
    public void removeTotalResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALRESULTS$16, i);
        }
    }
    
    /**
     * Gets array of all "score" elements
     */
    public java.math.BigDecimal[] getScoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCORE$18, targetList);
            java.math.BigDecimal[] result = new java.math.BigDecimal[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigDecimalValue();
            return result;
        }
    }
    
    /**
     * Gets ith "score" element
     */
    public java.math.BigDecimal getScoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "score" elements
     */
    public org.apache.xmlbeans.XmlDecimal[] xgetScoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCORE$18, targetList);
            org.apache.xmlbeans.XmlDecimal[] result = new org.apache.xmlbeans.XmlDecimal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "score" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetScoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCORE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "score" element
     */
    public int sizeOfScoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORE$18);
        }
    }
    
    /**
     * Sets array of all "score" element
     */
    public void setScoreArray(java.math.BigDecimal[] scoreArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scoreArray, SCORE$18);
        }
    }
    
    /**
     * Sets ith "score" element
     */
    public void setScoreArray(int i, java.math.BigDecimal score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigDecimalValue(score);
        }
    }
    
    /**
     * Sets (as xml) array of all "score" element
     */
    public void xsetScoreArray(org.apache.xmlbeans.XmlDecimal[]scoreArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scoreArray, SCORE$18);
        }
    }
    
    /**
     * Sets (as xml) ith "score" element
     */
    public void xsetScoreArray(int i, org.apache.xmlbeans.XmlDecimal score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCORE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(score);
        }
    }
    
    /**
     * Inserts the value as the ith "score" element
     */
    public void insertScore(int i, java.math.BigDecimal score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SCORE$18, i);
            target.setBigDecimalValue(score);
        }
    }
    
    /**
     * Appends the value as the last "score" element
     */
    public void addScore(java.math.BigDecimal score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORE$18);
            target.setBigDecimalValue(score);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "score" element
     */
    public org.apache.xmlbeans.XmlDecimal insertNewScore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().insert_element_user(SCORE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "score" element
     */
    public org.apache.xmlbeans.XmlDecimal addNewScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SCORE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "score" element
     */
    public void removeScore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORE$18, i);
        }
    }
    
    /**
     * Gets the "Signature" element
     */
    public org.w3.x2000.x09.xmldsig.SignatureType getSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2000.x09.xmldsig.SignatureType target = null;
            target = (org.w3.x2000.x09.xmldsig.SignatureType)get_store().find_element_user(SIGNATURE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Signature" element
     */
    public boolean isSetSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATURE$20) != 0;
        }
    }
    
    /**
     * Sets the "Signature" element
     */
    public void setSignature(org.w3.x2000.x09.xmldsig.SignatureType signature)
    {
        generatedSetterHelperImpl(signature, SIGNATURE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Signature" element
     */
    public org.w3.x2000.x09.xmldsig.SignatureType addNewSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2000.x09.xmldsig.SignatureType target = null;
            target = (org.w3.x2000.x09.xmldsig.SignatureType)get_store().add_element_user(SIGNATURE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Signature" element
     */
    public void unsetSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATURE$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$22);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(BASE$22);
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
            return get_store().find_attribute_user(BASE$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$22);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(BASE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(BASE$22);
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
            get_store().remove_attribute(BASE$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$24);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$24);
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
            return get_store().find_attribute_user(LANG$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$24);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$24);
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
            get_store().remove_attribute(LANG$24);
        }
    }
}
