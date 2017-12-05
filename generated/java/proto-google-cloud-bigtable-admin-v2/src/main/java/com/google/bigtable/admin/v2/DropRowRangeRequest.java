// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

/**
 * <pre>
 * Request message for
 * [google.bigtable.admin.v2.BigtableTableAdmin.DropRowRange][google.bigtable.admin.v2.BigtableTableAdmin.DropRowRange]
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.DropRowRangeRequest}
 */
public  final class DropRowRangeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.DropRowRangeRequest)
    DropRowRangeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DropRowRangeRequest.newBuilder() to construct.
  private DropRowRangeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DropRowRangeRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DropRowRangeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            targetCase_ = 2;
            target_ = input.readBytes();
            break;
          }
          case 24: {
            targetCase_ = 3;
            target_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_DropRowRangeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_DropRowRangeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.DropRowRangeRequest.class, com.google.bigtable.admin.v2.DropRowRangeRequest.Builder.class);
  }

  private int targetCase_ = 0;
  private java.lang.Object target_;
  public enum TargetCase
      implements com.google.protobuf.Internal.EnumLite {
    ROW_KEY_PREFIX(2),
    DELETE_ALL_DATA_FROM_TABLE(3),
    TARGET_NOT_SET(0);
    private final int value;
    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 2: return ROW_KEY_PREFIX;
        case 3: return DELETE_ALL_DATA_FROM_TABLE;
        case 0: return TARGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase
  getTargetCase() {
    return TargetCase.forNumber(
        targetCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The unique name of the table on which to drop a range of rows.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique name of the table on which to drop a range of rows.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROW_KEY_PREFIX_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Delete all rows that start with this row key prefix. Prefix cannot be
   * zero length.
   * </pre>
   *
   * <code>bytes row_key_prefix = 2;</code>
   */
  public com.google.protobuf.ByteString getRowKeyPrefix() {
    if (targetCase_ == 2) {
      return (com.google.protobuf.ByteString) target_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int DELETE_ALL_DATA_FROM_TABLE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Delete all rows in the table. Setting this to false is a no-op.
   * </pre>
   *
   * <code>bool delete_all_data_from_table = 3;</code>
   */
  public boolean getDeleteAllDataFromTable() {
    if (targetCase_ == 3) {
      return (java.lang.Boolean) target_;
    }
    return false;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (targetCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) target_);
    }
    if (targetCase_ == 3) {
      output.writeBool(
          3, (boolean)((java.lang.Boolean) target_));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (targetCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) target_);
    }
    if (targetCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            3, (boolean)((java.lang.Boolean) target_));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.bigtable.admin.v2.DropRowRangeRequest)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.DropRowRangeRequest other = (com.google.bigtable.admin.v2.DropRowRangeRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getTargetCase().equals(
        other.getTargetCase());
    if (!result) return false;
    switch (targetCase_) {
      case 2:
        result = result && getRowKeyPrefix()
            .equals(other.getRowKeyPrefix());
        break;
      case 3:
        result = result && (getDeleteAllDataFromTable()
            == other.getDeleteAllDataFromTable());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    switch (targetCase_) {
      case 2:
        hash = (37 * hash) + ROW_KEY_PREFIX_FIELD_NUMBER;
        hash = (53 * hash) + getRowKeyPrefix().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DELETE_ALL_DATA_FROM_TABLE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getDeleteAllDataFromTable());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.DropRowRangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.v2.DropRowRangeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for
   * [google.bigtable.admin.v2.BigtableTableAdmin.DropRowRange][google.bigtable.admin.v2.BigtableTableAdmin.DropRowRange]
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.DropRowRangeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.DropRowRangeRequest)
      com.google.bigtable.admin.v2.DropRowRangeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_DropRowRangeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_DropRowRangeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.DropRowRangeRequest.class, com.google.bigtable.admin.v2.DropRowRangeRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.DropRowRangeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      targetCase_ = 0;
      target_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableTableAdminProto.internal_static_google_bigtable_admin_v2_DropRowRangeRequest_descriptor;
    }

    public com.google.bigtable.admin.v2.DropRowRangeRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.DropRowRangeRequest.getDefaultInstance();
    }

    public com.google.bigtable.admin.v2.DropRowRangeRequest build() {
      com.google.bigtable.admin.v2.DropRowRangeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.v2.DropRowRangeRequest buildPartial() {
      com.google.bigtable.admin.v2.DropRowRangeRequest result = new com.google.bigtable.admin.v2.DropRowRangeRequest(this);
      result.name_ = name_;
      if (targetCase_ == 2) {
        result.target_ = target_;
      }
      if (targetCase_ == 3) {
        result.target_ = target_;
      }
      result.targetCase_ = targetCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.DropRowRangeRequest) {
        return mergeFrom((com.google.bigtable.admin.v2.DropRowRangeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.DropRowRangeRequest other) {
      if (other == com.google.bigtable.admin.v2.DropRowRangeRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      switch (other.getTargetCase()) {
        case ROW_KEY_PREFIX: {
          setRowKeyPrefix(other.getRowKeyPrefix());
          break;
        }
        case DELETE_ALL_DATA_FROM_TABLE: {
          setDeleteAllDataFromTable(other.getDeleteAllDataFromTable());
          break;
        }
        case TARGET_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.DropRowRangeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.DropRowRangeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int targetCase_ = 0;
    private java.lang.Object target_;
    public TargetCase
        getTargetCase() {
      return TargetCase.forNumber(
          targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The unique name of the table on which to drop a range of rows.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the table on which to drop a range of rows.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the table on which to drop a range of rows.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the table on which to drop a range of rows.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the table on which to drop a range of rows.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Delete all rows that start with this row key prefix. Prefix cannot be
     * zero length.
     * </pre>
     *
     * <code>bytes row_key_prefix = 2;</code>
     */
    public com.google.protobuf.ByteString getRowKeyPrefix() {
      if (targetCase_ == 2) {
        return (com.google.protobuf.ByteString) target_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Delete all rows that start with this row key prefix. Prefix cannot be
     * zero length.
     * </pre>
     *
     * <code>bytes row_key_prefix = 2;</code>
     */
    public Builder setRowKeyPrefix(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  targetCase_ = 2;
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Delete all rows that start with this row key prefix. Prefix cannot be
     * zero length.
     * </pre>
     *
     * <code>bytes row_key_prefix = 2;</code>
     */
    public Builder clearRowKeyPrefix() {
      if (targetCase_ == 2) {
        targetCase_ = 0;
        target_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Delete all rows in the table. Setting this to false is a no-op.
     * </pre>
     *
     * <code>bool delete_all_data_from_table = 3;</code>
     */
    public boolean getDeleteAllDataFromTable() {
      if (targetCase_ == 3) {
        return (java.lang.Boolean) target_;
      }
      return false;
    }
    /**
     * <pre>
     * Delete all rows in the table. Setting this to false is a no-op.
     * </pre>
     *
     * <code>bool delete_all_data_from_table = 3;</code>
     */
    public Builder setDeleteAllDataFromTable(boolean value) {
      targetCase_ = 3;
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Delete all rows in the table. Setting this to false is a no-op.
     * </pre>
     *
     * <code>bool delete_all_data_from_table = 3;</code>
     */
    public Builder clearDeleteAllDataFromTable() {
      if (targetCase_ == 3) {
        targetCase_ = 0;
        target_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    public final Builder setNameWithTableName(com.google.bigtable.admin.v2.TableName value) {
      if (value == null) {
        return setName("");
      }
      return setName(value.toString());
    }
    
    public final com.google.bigtable.admin.v2.TableName getNameAsTableName() {
      java.lang.String str = getName();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.bigtable.admin.v2.TableName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.DropRowRangeRequest)
  }

  public final com.google.bigtable.admin.v2.TableName getNameAsTableName() {
    java.lang.String str = getName();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.bigtable.admin.v2.TableName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.DropRowRangeRequest)
  private static final com.google.bigtable.admin.v2.DropRowRangeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.DropRowRangeRequest();
  }

  public static com.google.bigtable.admin.v2.DropRowRangeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DropRowRangeRequest>
      PARSER = new com.google.protobuf.AbstractParser<DropRowRangeRequest>() {
    public DropRowRangeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DropRowRangeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DropRowRangeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DropRowRangeRequest> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.v2.DropRowRangeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

