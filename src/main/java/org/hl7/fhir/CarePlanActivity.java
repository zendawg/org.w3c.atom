/*
 * XML Type:  CarePlan.Activity
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanActivity
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML CarePlan.Activity(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface CarePlanActivity extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CarePlanActivity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D9F78AAB1B4B6A167F5DDBDBEC741DF").resolveHandle("careplanactivity08bdtype");
    
    /**
     * Gets array of all "goal" elements
     */
    java.lang.String[] getGoalArray();
    
    /**
     * Gets ith "goal" element
     */
    java.lang.String getGoalArray(int i);
    
    /**
     * Gets (as xml) array of all "goal" elements
     */
    org.hl7.fhir.XmlIdRef[] xgetGoalArray();
    
    /**
     * Gets (as xml) ith "goal" element
     */
    org.hl7.fhir.XmlIdRef xgetGoalArray(int i);
    
    /**
     * Returns number of "goal" element
     */
    int sizeOfGoalArray();
    
    /**
     * Sets array of all "goal" element
     */
    void setGoalArray(java.lang.String[] goalArray);
    
    /**
     * Sets ith "goal" element
     */
    void setGoalArray(int i, java.lang.String goal);
    
    /**
     * Sets (as xml) array of all "goal" element
     */
    void xsetGoalArray(org.hl7.fhir.XmlIdRef[] goalArray);
    
    /**
     * Sets (as xml) ith "goal" element
     */
    void xsetGoalArray(int i, org.hl7.fhir.XmlIdRef goal);
    
    /**
     * Inserts the value as the ith "goal" element
     */
    void insertGoal(int i, java.lang.String goal);
    
    /**
     * Appends the value as the last "goal" element
     */
    void addGoal(java.lang.String goal);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "goal" element
     */
    org.hl7.fhir.XmlIdRef insertNewGoal(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "goal" element
     */
    org.hl7.fhir.XmlIdRef addNewGoal();
    
    /**
     * Removes the ith "goal" element
     */
    void removeGoal(int i);
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.CarePlanActivityStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.CarePlanActivityStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.CarePlanActivityStatus addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "prohibited" element
     */
    org.hl7.fhir.Boolean getProhibited();
    
    /**
     * Sets the "prohibited" element
     */
    void setProhibited(org.hl7.fhir.Boolean prohibited);
    
    /**
     * Appends and returns a new empty "prohibited" element
     */
    org.hl7.fhir.Boolean addNewProhibited();
    
    /**
     * Gets array of all "actionResulting" elements
     */
    org.hl7.fhir.ResourceReference[] getActionResultingArray();
    
    /**
     * Gets ith "actionResulting" element
     */
    org.hl7.fhir.ResourceReference getActionResultingArray(int i);
    
    /**
     * Returns number of "actionResulting" element
     */
    int sizeOfActionResultingArray();
    
    /**
     * Sets array of all "actionResulting" element
     */
    void setActionResultingArray(org.hl7.fhir.ResourceReference[] actionResultingArray);
    
    /**
     * Sets ith "actionResulting" element
     */
    void setActionResultingArray(int i, org.hl7.fhir.ResourceReference actionResulting);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actionResulting" element
     */
    org.hl7.fhir.ResourceReference insertNewActionResulting(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actionResulting" element
     */
    org.hl7.fhir.ResourceReference addNewActionResulting();
    
    /**
     * Removes the ith "actionResulting" element
     */
    void removeActionResulting(int i);
    
    /**
     * Gets the "notes" element
     */
    org.hl7.fhir.String getNotes();
    
    /**
     * True if has "notes" element
     */
    boolean isSetNotes();
    
    /**
     * Sets the "notes" element
     */
    void setNotes(org.hl7.fhir.String notes);
    
    /**
     * Appends and returns a new empty "notes" element
     */
    org.hl7.fhir.String addNewNotes();
    
    /**
     * Unsets the "notes" element
     */
    void unsetNotes();
    
    /**
     * Gets the "detail" element
     */
    org.hl7.fhir.ResourceReference getDetail();
    
    /**
     * True if has "detail" element
     */
    boolean isSetDetail();
    
    /**
     * Sets the "detail" element
     */
    void setDetail(org.hl7.fhir.ResourceReference detail);
    
    /**
     * Appends and returns a new empty "detail" element
     */
    org.hl7.fhir.ResourceReference addNewDetail();
    
    /**
     * Unsets the "detail" element
     */
    void unsetDetail();
    
    /**
     * Gets the "simple" element
     */
    org.hl7.fhir.CarePlanSimple getSimple();
    
    /**
     * True if has "simple" element
     */
    boolean isSetSimple();
    
    /**
     * Sets the "simple" element
     */
    void setSimple(org.hl7.fhir.CarePlanSimple simple);
    
    /**
     * Appends and returns a new empty "simple" element
     */
    org.hl7.fhir.CarePlanSimple addNewSimple();
    
    /**
     * Unsets the "simple" element
     */
    void unsetSimple();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.CarePlanActivity newInstance() {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.CarePlanActivity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.CarePlanActivity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.CarePlanActivity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlanActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlanActivity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlanActivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
