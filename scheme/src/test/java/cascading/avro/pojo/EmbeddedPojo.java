/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package cascading.avro.pojo;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EmbeddedPojo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmbeddedPojo\",\"namespace\":\"cascading.avro.pojo\",\"fields\":[{\"name\":\"Age\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"City\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"LastName\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence Age;
  @Deprecated public java.lang.CharSequence City;
  @Deprecated public java.lang.CharSequence LastName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public EmbeddedPojo() {}

  /**
   * All-args constructor.
   */
  public EmbeddedPojo(java.lang.CharSequence Age, java.lang.CharSequence City, java.lang.CharSequence LastName) {
    this.Age = Age;
    this.City = City;
    this.LastName = LastName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Age;
    case 1: return City;
    case 2: return LastName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Age = (java.lang.CharSequence)value$; break;
    case 1: City = (java.lang.CharSequence)value$; break;
    case 2: LastName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Age' field.
   */
  public java.lang.CharSequence getAge() {
    return Age;
  }

  /**
   * Sets the value of the 'Age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.CharSequence value) {
    this.Age = value;
  }

  /**
   * Gets the value of the 'City' field.
   */
  public java.lang.CharSequence getCity() {
    return City;
  }

  /**
   * Sets the value of the 'City' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.City = value;
  }

  /**
   * Gets the value of the 'LastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return LastName;
  }

  /**
   * Sets the value of the 'LastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.LastName = value;
  }

  /** Creates a new EmbeddedPojo RecordBuilder */
  public static cascading.avro.pojo.EmbeddedPojo.Builder newBuilder() {
    return new cascading.avro.pojo.EmbeddedPojo.Builder();
  }
  
  /** Creates a new EmbeddedPojo RecordBuilder by copying an existing Builder */
  public static cascading.avro.pojo.EmbeddedPojo.Builder newBuilder(cascading.avro.pojo.EmbeddedPojo.Builder other) {
    return new cascading.avro.pojo.EmbeddedPojo.Builder(other);
  }
  
  /** Creates a new EmbeddedPojo RecordBuilder by copying an existing EmbeddedPojo instance */
  public static cascading.avro.pojo.EmbeddedPojo.Builder newBuilder(cascading.avro.pojo.EmbeddedPojo other) {
    return new cascading.avro.pojo.EmbeddedPojo.Builder(other);
  }
  
  /**
   * RecordBuilder for EmbeddedPojo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmbeddedPojo>
    implements org.apache.avro.data.RecordBuilder<EmbeddedPojo> {

    private java.lang.CharSequence Age;
    private java.lang.CharSequence City;
    private java.lang.CharSequence LastName;

    /** Creates a new Builder */
    private Builder() {
      super(cascading.avro.pojo.EmbeddedPojo.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(cascading.avro.pojo.EmbeddedPojo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Age)) {
        this.Age = data().deepCopy(fields()[0].schema(), other.Age);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.City)) {
        this.City = data().deepCopy(fields()[1].schema(), other.City);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LastName)) {
        this.LastName = data().deepCopy(fields()[2].schema(), other.LastName);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EmbeddedPojo instance */
    private Builder(cascading.avro.pojo.EmbeddedPojo other) {
            super(cascading.avro.pojo.EmbeddedPojo.SCHEMA$);
      if (isValidValue(fields()[0], other.Age)) {
        this.Age = data().deepCopy(fields()[0].schema(), other.Age);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.City)) {
        this.City = data().deepCopy(fields()[1].schema(), other.City);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LastName)) {
        this.LastName = data().deepCopy(fields()[2].schema(), other.LastName);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'Age' field */
    public java.lang.CharSequence getAge() {
      return Age;
    }
    
    /** Sets the value of the 'Age' field */
    public cascading.avro.pojo.EmbeddedPojo.Builder setAge(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Age = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'Age' field has been set */
    public boolean hasAge() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'Age' field */
    public cascading.avro.pojo.EmbeddedPojo.Builder clearAge() {
      Age = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'City' field */
    public java.lang.CharSequence getCity() {
      return City;
    }
    
    /** Sets the value of the 'City' field */
    public cascading.avro.pojo.EmbeddedPojo.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.City = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'City' field has been set */
    public boolean hasCity() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'City' field */
    public cascading.avro.pojo.EmbeddedPojo.Builder clearCity() {
      City = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'LastName' field */
    public java.lang.CharSequence getLastName() {
      return LastName;
    }
    
    /** Sets the value of the 'LastName' field */
    public cascading.avro.pojo.EmbeddedPojo.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.LastName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'LastName' field has been set */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'LastName' field */
    public cascading.avro.pojo.EmbeddedPojo.Builder clearLastName() {
      LastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public EmbeddedPojo build() {
      try {
        EmbeddedPojo record = new EmbeddedPojo();
        record.Age = fieldSetFlags()[0] ? this.Age : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.City = fieldSetFlags()[1] ? this.City : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.LastName = fieldSetFlags()[2] ? this.LastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
