// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/storage.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * An entity in a dataset is a field or set of fields that correspond to a
 * single person. For example, in medical records the `EntityId` might be
 * a patient identifier, or for financial records it might be an account
 * identifier. This message is used when generalizations or analysis must be
 * consistent across multiple rows pertaining to the same entity.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.EntityId}
 */
public  final class EntityId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.EntityId)
    EntityIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityId.newBuilder() to construct.
  private EntityId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityId() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityId(
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
            com.google.privacy.dlp.v2beta1.FieldId.Builder subBuilder = null;
            if (field_ != null) {
              subBuilder = field_.toBuilder();
            }
            field_ = input.readMessage(com.google.privacy.dlp.v2beta1.FieldId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(field_);
              field_ = subBuilder.buildPartial();
            }

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
    return com.google.privacy.dlp.v2beta1.DlpStorage.internal_static_google_privacy_dlp_v2beta1_EntityId_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpStorage.internal_static_google_privacy_dlp_v2beta1_EntityId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.EntityId.class, com.google.privacy.dlp.v2beta1.EntityId.Builder.class);
  }

  public static final int FIELD_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta1.FieldId field_;
  /**
   * <pre>
   * Composite key indicating which field contains the entity identifier.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
   */
  public boolean hasField() {
    return field_ != null;
  }
  /**
   * <pre>
   * Composite key indicating which field contains the entity identifier.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.FieldId getField() {
    return field_ == null ? com.google.privacy.dlp.v2beta1.FieldId.getDefaultInstance() : field_;
  }
  /**
   * <pre>
   * Composite key indicating which field contains the entity identifier.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.FieldIdOrBuilder getFieldOrBuilder() {
    return getField();
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
    if (field_ != null) {
      output.writeMessage(1, getField());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (field_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getField());
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.EntityId)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.EntityId other = (com.google.privacy.dlp.v2beta1.EntityId) obj;

    boolean result = true;
    result = result && (hasField() == other.hasField());
    if (hasField()) {
      result = result && getField()
          .equals(other.getField());
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
    if (hasField()) {
      hash = (37 * hash) + FIELD_FIELD_NUMBER;
      hash = (53 * hash) + getField().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.EntityId parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.EntityId prototype) {
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
   * An entity in a dataset is a field or set of fields that correspond to a
   * single person. For example, in medical records the `EntityId` might be
   * a patient identifier, or for financial records it might be an account
   * identifier. This message is used when generalizations or analysis must be
   * consistent across multiple rows pertaining to the same entity.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.EntityId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.EntityId)
      com.google.privacy.dlp.v2beta1.EntityIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpStorage.internal_static_google_privacy_dlp_v2beta1_EntityId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpStorage.internal_static_google_privacy_dlp_v2beta1_EntityId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.EntityId.class, com.google.privacy.dlp.v2beta1.EntityId.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.EntityId.newBuilder()
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
      if (fieldBuilder_ == null) {
        field_ = null;
      } else {
        field_ = null;
        fieldBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpStorage.internal_static_google_privacy_dlp_v2beta1_EntityId_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.EntityId getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.EntityId.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.EntityId build() {
      com.google.privacy.dlp.v2beta1.EntityId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.EntityId buildPartial() {
      com.google.privacy.dlp.v2beta1.EntityId result = new com.google.privacy.dlp.v2beta1.EntityId(this);
      if (fieldBuilder_ == null) {
        result.field_ = field_;
      } else {
        result.field_ = fieldBuilder_.build();
      }
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
      if (other instanceof com.google.privacy.dlp.v2beta1.EntityId) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.EntityId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.EntityId other) {
      if (other == com.google.privacy.dlp.v2beta1.EntityId.getDefaultInstance()) return this;
      if (other.hasField()) {
        mergeField(other.getField());
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
      com.google.privacy.dlp.v2beta1.EntityId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.EntityId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2beta1.FieldId field_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.FieldId, com.google.privacy.dlp.v2beta1.FieldId.Builder, com.google.privacy.dlp.v2beta1.FieldIdOrBuilder> fieldBuilder_;
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public boolean hasField() {
      return fieldBuilder_ != null || field_ != null;
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.FieldId getField() {
      if (fieldBuilder_ == null) {
        return field_ == null ? com.google.privacy.dlp.v2beta1.FieldId.getDefaultInstance() : field_;
      } else {
        return fieldBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public Builder setField(com.google.privacy.dlp.v2beta1.FieldId value) {
      if (fieldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        field_ = value;
        onChanged();
      } else {
        fieldBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public Builder setField(
        com.google.privacy.dlp.v2beta1.FieldId.Builder builderForValue) {
      if (fieldBuilder_ == null) {
        field_ = builderForValue.build();
        onChanged();
      } else {
        fieldBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public Builder mergeField(com.google.privacy.dlp.v2beta1.FieldId value) {
      if (fieldBuilder_ == null) {
        if (field_ != null) {
          field_ =
            com.google.privacy.dlp.v2beta1.FieldId.newBuilder(field_).mergeFrom(value).buildPartial();
        } else {
          field_ = value;
        }
        onChanged();
      } else {
        fieldBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public Builder clearField() {
      if (fieldBuilder_ == null) {
        field_ = null;
        onChanged();
      } else {
        field_ = null;
        fieldBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.FieldId.Builder getFieldBuilder() {
      
      onChanged();
      return getFieldFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.FieldIdOrBuilder getFieldOrBuilder() {
      if (fieldBuilder_ != null) {
        return fieldBuilder_.getMessageOrBuilder();
      } else {
        return field_ == null ?
            com.google.privacy.dlp.v2beta1.FieldId.getDefaultInstance() : field_;
      }
    }
    /**
     * <pre>
     * Composite key indicating which field contains the entity identifier.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta1.FieldId field = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.FieldId, com.google.privacy.dlp.v2beta1.FieldId.Builder, com.google.privacy.dlp.v2beta1.FieldIdOrBuilder> 
        getFieldFieldBuilder() {
      if (fieldBuilder_ == null) {
        fieldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.FieldId, com.google.privacy.dlp.v2beta1.FieldId.Builder, com.google.privacy.dlp.v2beta1.FieldIdOrBuilder>(
                getField(),
                getParentForChildren(),
                isClean());
        field_ = null;
      }
      return fieldBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.EntityId)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.EntityId)
  private static final com.google.privacy.dlp.v2beta1.EntityId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.EntityId();
  }

  public static com.google.privacy.dlp.v2beta1.EntityId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityId>
      PARSER = new com.google.protobuf.AbstractParser<EntityId>() {
    public EntityId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EntityId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityId> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.EntityId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

