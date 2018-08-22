// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/backend.proto

package com.google.api;

/**
 * <pre>
 * A backend rule provides configuration for an individual API element.
 * </pre>
 *
 * Protobuf type {@code google.api.BackendRule}
 */
public  final class BackendRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.BackendRule)
    BackendRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackendRule.newBuilder() to construct.
  private BackendRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackendRule() {
    selector_ = "";
    address_ = "";
    deadline_ = 0D;
    minDeadline_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BackendRule(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            selector_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            address_ = s;
            break;
          }
          case 25: {

            deadline_ = input.readDouble();
            break;
          }
          case 33: {

            minDeadline_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return com.google.api.BackendProto.internal_static_google_api_BackendRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.BackendProto.internal_static_google_api_BackendRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.BackendRule.class, com.google.api.BackendRule.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object selector_;
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object address_;
  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   */
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEADLINE_FIELD_NUMBER = 3;
  private double deadline_;
  /**
   * <pre>
   * The number of seconds to wait for a response from a request.  The default
   * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
   * </pre>
   *
   * <code>double deadline = 3;</code>
   */
  public double getDeadline() {
    return deadline_;
  }

  public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
  private double minDeadline_;
  /**
   * <pre>
   * Minimum deadline in seconds needed for this method. Calls having deadline
   * value lower than this will be rejected.
   * </pre>
   *
   * <code>double min_deadline = 4;</code>
   */
  public double getMinDeadline() {
    return minDeadline_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSelectorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    if (!getAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, address_);
    }
    if (deadline_ != 0D) {
      output.writeDouble(3, deadline_);
    }
    if (minDeadline_ != 0D) {
      output.writeDouble(4, minDeadline_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSelectorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    if (!getAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, address_);
    }
    if (deadline_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, deadline_);
    }
    if (minDeadline_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, minDeadline_);
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
    if (!(obj instanceof com.google.api.BackendRule)) {
      return super.equals(obj);
    }
    com.google.api.BackendRule other = (com.google.api.BackendRule) obj;

    boolean result = true;
    result = result && getSelector()
        .equals(other.getSelector());
    result = result && getAddress()
        .equals(other.getAddress());
    result = result && (
        java.lang.Double.doubleToLongBits(getDeadline())
        == java.lang.Double.doubleToLongBits(
            other.getDeadline()));
    result = result && (
        java.lang.Double.doubleToLongBits(getMinDeadline())
        == java.lang.Double.doubleToLongBits(
            other.getMinDeadline()));
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
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + DEADLINE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDeadline()));
    hash = (37 * hash) + MIN_DEADLINE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMinDeadline()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.BackendRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.BackendRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.BackendRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.BackendRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.BackendRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.BackendRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.BackendRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.BackendRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.BackendRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.BackendRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.BackendRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.BackendRule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.BackendRule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * A backend rule provides configuration for an individual API element.
   * </pre>
   *
   * Protobuf type {@code google.api.BackendRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.BackendRule)
      com.google.api.BackendRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.BackendProto.internal_static_google_api_BackendRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.BackendProto.internal_static_google_api_BackendRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.BackendRule.class, com.google.api.BackendRule.Builder.class);
    }

    // Construct using com.google.api.BackendRule.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      selector_ = "";

      address_ = "";

      deadline_ = 0D;

      minDeadline_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.BackendProto.internal_static_google_api_BackendRule_descriptor;
    }

    @java.lang.Override
    public com.google.api.BackendRule getDefaultInstanceForType() {
      return com.google.api.BackendRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.BackendRule build() {
      com.google.api.BackendRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.BackendRule buildPartial() {
      com.google.api.BackendRule result = new com.google.api.BackendRule(this);
      result.selector_ = selector_;
      result.address_ = address_;
      result.deadline_ = deadline_;
      result.minDeadline_ = minDeadline_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.BackendRule) {
        return mergeFrom((com.google.api.BackendRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.BackendRule other) {
      if (other == com.google.api.BackendRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        onChanged();
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (other.getDeadline() != 0D) {
        setDeadline(other.getDeadline());
      }
      if (other.getMinDeadline() != 0D) {
        setMinDeadline(other.getMinDeadline());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.BackendRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.BackendRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object selector_ = "";
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      selector_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder clearSelector() {
      
      selector_ = getDefaultInstance().getSelector();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Selects the methods to which this rule applies.
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      selector_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <pre>
     * The address of the API backend.
     * </pre>
     *
     * <code>string address = 2;</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The address of the API backend.
     * </pre>
     *
     * <code>string address = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The address of the API backend.
     * </pre>
     *
     * <code>string address = 2;</code>
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The address of the API backend.
     * </pre>
     *
     * <code>string address = 2;</code>
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The address of the API backend.
     * </pre>
     *
     * <code>string address = 2;</code>
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private double deadline_ ;
    /**
     * <pre>
     * The number of seconds to wait for a response from a request.  The default
     * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
     * </pre>
     *
     * <code>double deadline = 3;</code>
     */
    public double getDeadline() {
      return deadline_;
    }
    /**
     * <pre>
     * The number of seconds to wait for a response from a request.  The default
     * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
     * </pre>
     *
     * <code>double deadline = 3;</code>
     */
    public Builder setDeadline(double value) {
      
      deadline_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of seconds to wait for a response from a request.  The default
     * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
     * </pre>
     *
     * <code>double deadline = 3;</code>
     */
    public Builder clearDeadline() {
      
      deadline_ = 0D;
      onChanged();
      return this;
    }

    private double minDeadline_ ;
    /**
     * <pre>
     * Minimum deadline in seconds needed for this method. Calls having deadline
     * value lower than this will be rejected.
     * </pre>
     *
     * <code>double min_deadline = 4;</code>
     */
    public double getMinDeadline() {
      return minDeadline_;
    }
    /**
     * <pre>
     * Minimum deadline in seconds needed for this method. Calls having deadline
     * value lower than this will be rejected.
     * </pre>
     *
     * <code>double min_deadline = 4;</code>
     */
    public Builder setMinDeadline(double value) {
      
      minDeadline_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Minimum deadline in seconds needed for this method. Calls having deadline
     * value lower than this will be rejected.
     * </pre>
     *
     * <code>double min_deadline = 4;</code>
     */
    public Builder clearMinDeadline() {
      
      minDeadline_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.api.BackendRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.BackendRule)
  private static final com.google.api.BackendRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.BackendRule();
  }

  public static com.google.api.BackendRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendRule>
      PARSER = new com.google.protobuf.AbstractParser<BackendRule>() {
    @java.lang.Override
    public BackendRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BackendRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackendRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.BackendRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

