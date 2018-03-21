// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Container structure for the content to inspect.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.ContentItem}
 */
public  final class ContentItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.ContentItem)
    ContentItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContentItem.newBuilder() to construct.
  private ContentItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContentItem() {
    type_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContentItem(
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

            type_ = s;
            break;
          }
          case 18: {
            dataItemCase_ = 2;
            dataItem_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            dataItemCase_ = 3;
            dataItem_ = s;
            break;
          }
          case 34: {
            com.google.privacy.dlp.v2beta2.Table.Builder subBuilder = null;
            if (dataItemCase_ == 4) {
              subBuilder = ((com.google.privacy.dlp.v2beta2.Table) dataItem_).toBuilder();
            }
            dataItem_ =
                input.readMessage(com.google.privacy.dlp.v2beta2.Table.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.privacy.dlp.v2beta2.Table) dataItem_);
              dataItem_ = subBuilder.buildPartial();
            }
            dataItemCase_ = 4;
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
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ContentItem_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ContentItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.ContentItem.class, com.google.privacy.dlp.v2beta2.ContentItem.Builder.class);
  }

  private int dataItemCase_ = 0;
  private java.lang.Object dataItem_;
  public enum DataItemCase
      implements com.google.protobuf.Internal.EnumLite {
    DATA(2),
    VALUE(3),
    TABLE(4),
    DATAITEM_NOT_SET(0);
    private final int value;
    private DataItemCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataItemCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataItemCase forNumber(int value) {
      switch (value) {
        case 2: return DATA;
        case 3: return VALUE;
        case 4: return TABLE;
        case 0: return DATAITEM_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataItemCase
  getDataItemCase() {
    return DataItemCase.forNumber(
        dataItemCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * Type of the content, as defined in Content-Type HTTP header.
   * Supported types are: all "text" types, octet streams, PNG images,
   * JPEG images.
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Type of the content, as defined in Content-Type HTTP header.
   * Supported types are: all "text" types, octet streams, PNG images,
   * JPEG images.
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Content data to inspect or redact.
   * </pre>
   *
   * <code>bytes data = 2;</code>
   */
  public com.google.protobuf.ByteString getData() {
    if (dataItemCase_ == 2) {
      return (com.google.protobuf.ByteString) dataItem_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * String data to inspect or redact.
   * </pre>
   *
   * <code>string value = 3;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = "";
    if (dataItemCase_ == 3) {
      ref = dataItem_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dataItemCase_ == 3) {
        dataItem_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * String data to inspect or redact.
   * </pre>
   *
   * <code>string value = 3;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = "";
    if (dataItemCase_ == 3) {
      ref = dataItem_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dataItemCase_ == 3) {
        dataItem_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Structured content for inspection.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
   */
  public boolean hasTable() {
    return dataItemCase_ == 4;
  }
  /**
   * <pre>
   * Structured content for inspection.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
   */
  public com.google.privacy.dlp.v2beta2.Table getTable() {
    if (dataItemCase_ == 4) {
       return (com.google.privacy.dlp.v2beta2.Table) dataItem_;
    }
    return com.google.privacy.dlp.v2beta2.Table.getDefaultInstance();
  }
  /**
   * <pre>
   * Structured content for inspection.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
   */
  public com.google.privacy.dlp.v2beta2.TableOrBuilder getTableOrBuilder() {
    if (dataItemCase_ == 4) {
       return (com.google.privacy.dlp.v2beta2.Table) dataItem_;
    }
    return com.google.privacy.dlp.v2beta2.Table.getDefaultInstance();
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
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (dataItemCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) dataItem_);
    }
    if (dataItemCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dataItem_);
    }
    if (dataItemCase_ == 4) {
      output.writeMessage(4, (com.google.privacy.dlp.v2beta2.Table) dataItem_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (dataItemCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) dataItem_);
    }
    if (dataItemCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dataItem_);
    }
    if (dataItemCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (com.google.privacy.dlp.v2beta2.Table) dataItem_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.ContentItem)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.ContentItem other = (com.google.privacy.dlp.v2beta2.ContentItem) obj;

    boolean result = true;
    result = result && getType()
        .equals(other.getType());
    result = result && getDataItemCase().equals(
        other.getDataItemCase());
    if (!result) return false;
    switch (dataItemCase_) {
      case 2:
        result = result && getData()
            .equals(other.getData());
        break;
      case 3:
        result = result && getValue()
            .equals(other.getValue());
        break;
      case 4:
        result = result && getTable()
            .equals(other.getTable());
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    switch (dataItemCase_) {
      case 2:
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
        break;
      case 3:
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
        break;
      case 4:
        hash = (37 * hash) + TABLE_FIELD_NUMBER;
        hash = (53 * hash) + getTable().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.ContentItem parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.ContentItem prototype) {
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
   * Container structure for the content to inspect.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.ContentItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.ContentItem)
      com.google.privacy.dlp.v2beta2.ContentItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ContentItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ContentItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.ContentItem.class, com.google.privacy.dlp.v2beta2.ContentItem.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.ContentItem.newBuilder()
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
      type_ = "";

      dataItemCase_ = 0;
      dataItem_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_ContentItem_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.ContentItem getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.ContentItem.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.ContentItem build() {
      com.google.privacy.dlp.v2beta2.ContentItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.ContentItem buildPartial() {
      com.google.privacy.dlp.v2beta2.ContentItem result = new com.google.privacy.dlp.v2beta2.ContentItem(this);
      result.type_ = type_;
      if (dataItemCase_ == 2) {
        result.dataItem_ = dataItem_;
      }
      if (dataItemCase_ == 3) {
        result.dataItem_ = dataItem_;
      }
      if (dataItemCase_ == 4) {
        if (tableBuilder_ == null) {
          result.dataItem_ = dataItem_;
        } else {
          result.dataItem_ = tableBuilder_.build();
        }
      }
      result.dataItemCase_ = dataItemCase_;
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
      if (other instanceof com.google.privacy.dlp.v2beta2.ContentItem) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.ContentItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.ContentItem other) {
      if (other == com.google.privacy.dlp.v2beta2.ContentItem.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      switch (other.getDataItemCase()) {
        case DATA: {
          setData(other.getData());
          break;
        }
        case VALUE: {
          dataItemCase_ = 3;
          dataItem_ = other.dataItem_;
          onChanged();
          break;
        }
        case TABLE: {
          mergeTable(other.getTable());
          break;
        }
        case DATAITEM_NOT_SET: {
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
      com.google.privacy.dlp.v2beta2.ContentItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.ContentItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int dataItemCase_ = 0;
    private java.lang.Object dataItem_;
    public DataItemCase
        getDataItemCase() {
      return DataItemCase.forNumber(
          dataItemCase_);
    }

    public Builder clearDataItem() {
      dataItemCase_ = 0;
      dataItem_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object type_ = "";
    /**
     * <pre>
     * Type of the content, as defined in Content-Type HTTP header.
     * Supported types are: all "text" types, octet streams, PNG images,
     * JPEG images.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Type of the content, as defined in Content-Type HTTP header.
     * Supported types are: all "text" types, octet streams, PNG images,
     * JPEG images.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Type of the content, as defined in Content-Type HTTP header.
     * Supported types are: all "text" types, octet streams, PNG images,
     * JPEG images.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the content, as defined in Content-Type HTTP header.
     * Supported types are: all "text" types, octet streams, PNG images,
     * JPEG images.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the content, as defined in Content-Type HTTP header.
     * Supported types are: all "text" types, octet streams, PNG images,
     * JPEG images.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Content data to inspect or redact.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      if (dataItemCase_ == 2) {
        return (com.google.protobuf.ByteString) dataItem_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Content data to inspect or redact.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataItemCase_ = 2;
      dataItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content data to inspect or redact.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     */
    public Builder clearData() {
      if (dataItemCase_ == 2) {
        dataItemCase_ = 0;
        dataItem_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * String data to inspect or redact.
     * </pre>
     *
     * <code>string value = 3;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = "";
      if (dataItemCase_ == 3) {
        ref = dataItem_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dataItemCase_ == 3) {
          dataItem_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * String data to inspect or redact.
     * </pre>
     *
     * <code>string value = 3;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = "";
      if (dataItemCase_ == 3) {
        ref = dataItem_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dataItemCase_ == 3) {
          dataItem_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * String data to inspect or redact.
     * </pre>
     *
     * <code>string value = 3;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataItemCase_ = 3;
      dataItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String data to inspect or redact.
     * </pre>
     *
     * <code>string value = 3;</code>
     */
    public Builder clearValue() {
      if (dataItemCase_ == 3) {
        dataItemCase_ = 0;
        dataItem_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * String data to inspect or redact.
     * </pre>
     *
     * <code>string value = 3;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      dataItemCase_ = 3;
      dataItem_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.Table, com.google.privacy.dlp.v2beta2.Table.Builder, com.google.privacy.dlp.v2beta2.TableOrBuilder> tableBuilder_;
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public boolean hasTable() {
      return dataItemCase_ == 4;
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public com.google.privacy.dlp.v2beta2.Table getTable() {
      if (tableBuilder_ == null) {
        if (dataItemCase_ == 4) {
          return (com.google.privacy.dlp.v2beta2.Table) dataItem_;
        }
        return com.google.privacy.dlp.v2beta2.Table.getDefaultInstance();
      } else {
        if (dataItemCase_ == 4) {
          return tableBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2beta2.Table.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public Builder setTable(com.google.privacy.dlp.v2beta2.Table value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataItem_ = value;
        onChanged();
      } else {
        tableBuilder_.setMessage(value);
      }
      dataItemCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public Builder setTable(
        com.google.privacy.dlp.v2beta2.Table.Builder builderForValue) {
      if (tableBuilder_ == null) {
        dataItem_ = builderForValue.build();
        onChanged();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }
      dataItemCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public Builder mergeTable(com.google.privacy.dlp.v2beta2.Table value) {
      if (tableBuilder_ == null) {
        if (dataItemCase_ == 4 &&
            dataItem_ != com.google.privacy.dlp.v2beta2.Table.getDefaultInstance()) {
          dataItem_ = com.google.privacy.dlp.v2beta2.Table.newBuilder((com.google.privacy.dlp.v2beta2.Table) dataItem_)
              .mergeFrom(value).buildPartial();
        } else {
          dataItem_ = value;
        }
        onChanged();
      } else {
        if (dataItemCase_ == 4) {
          tableBuilder_.mergeFrom(value);
        }
        tableBuilder_.setMessage(value);
      }
      dataItemCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public Builder clearTable() {
      if (tableBuilder_ == null) {
        if (dataItemCase_ == 4) {
          dataItemCase_ = 0;
          dataItem_ = null;
          onChanged();
        }
      } else {
        if (dataItemCase_ == 4) {
          dataItemCase_ = 0;
          dataItem_ = null;
        }
        tableBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public com.google.privacy.dlp.v2beta2.Table.Builder getTableBuilder() {
      return getTableFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    public com.google.privacy.dlp.v2beta2.TableOrBuilder getTableOrBuilder() {
      if ((dataItemCase_ == 4) && (tableBuilder_ != null)) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        if (dataItemCase_ == 4) {
          return (com.google.privacy.dlp.v2beta2.Table) dataItem_;
        }
        return com.google.privacy.dlp.v2beta2.Table.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Structured content for inspection.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.Table table = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.Table, com.google.privacy.dlp.v2beta2.Table.Builder, com.google.privacy.dlp.v2beta2.TableOrBuilder> 
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        if (!(dataItemCase_ == 4)) {
          dataItem_ = com.google.privacy.dlp.v2beta2.Table.getDefaultInstance();
        }
        tableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.Table, com.google.privacy.dlp.v2beta2.Table.Builder, com.google.privacy.dlp.v2beta2.TableOrBuilder>(
                (com.google.privacy.dlp.v2beta2.Table) dataItem_,
                getParentForChildren(),
                isClean());
        dataItem_ = null;
      }
      dataItemCase_ = 4;
      onChanged();;
      return tableBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.ContentItem)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.ContentItem)
  private static final com.google.privacy.dlp.v2beta2.ContentItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.ContentItem();
  }

  public static com.google.privacy.dlp.v2beta2.ContentItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContentItem>
      PARSER = new com.google.protobuf.AbstractParser<ContentItem>() {
    public ContentItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ContentItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContentItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContentItem> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.ContentItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

