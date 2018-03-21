// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

/**
 * <pre>
 * Results of de-identifying a ContentItem.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta2.DeidentifyContentResponse}
 */
public  final class DeidentifyContentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta2.DeidentifyContentResponse)
    DeidentifyContentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeidentifyContentResponse.newBuilder() to construct.
  private DeidentifyContentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeidentifyContentResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeidentifyContentResponse(
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
            com.google.privacy.dlp.v2beta2.ContentItem.Builder subBuilder = null;
            if (item_ != null) {
              subBuilder = item_.toBuilder();
            }
            item_ = input.readMessage(com.google.privacy.dlp.v2beta2.ContentItem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(item_);
              item_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.privacy.dlp.v2beta2.TransformationOverview.Builder subBuilder = null;
            if (overview_ != null) {
              subBuilder = overview_.toBuilder();
            }
            overview_ = input.readMessage(com.google.privacy.dlp.v2beta2.TransformationOverview.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(overview_);
              overview_ = subBuilder.buildPartial();
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
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_DeidentifyContentResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_DeidentifyContentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.class, com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2beta2.ContentItem item_;
  /**
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
   */
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.ContentItem getItem() {
    return item_ == null ? com.google.privacy.dlp.v2beta2.ContentItem.getDefaultInstance() : item_;
  }
  /**
   * <pre>
   * The de-identified item.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
   */
  public com.google.privacy.dlp.v2beta2.ContentItemOrBuilder getItemOrBuilder() {
    return getItem();
  }

  public static final int OVERVIEW_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2beta2.TransformationOverview overview_;
  /**
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
   */
  public boolean hasOverview() {
    return overview_ != null;
  }
  /**
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.TransformationOverview getOverview() {
    return overview_ == null ? com.google.privacy.dlp.v2beta2.TransformationOverview.getDefaultInstance() : overview_;
  }
  /**
   * <pre>
   * An overview of the changes that were made on the `item`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
   */
  public com.google.privacy.dlp.v2beta2.TransformationOverviewOrBuilder getOverviewOrBuilder() {
    return getOverview();
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
    if (item_ != null) {
      output.writeMessage(1, getItem());
    }
    if (overview_ != null) {
      output.writeMessage(2, getOverview());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getItem());
    }
    if (overview_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOverview());
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta2.DeidentifyContentResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta2.DeidentifyContentResponse other = (com.google.privacy.dlp.v2beta2.DeidentifyContentResponse) obj;

    boolean result = true;
    result = result && (hasItem() == other.hasItem());
    if (hasItem()) {
      result = result && getItem()
          .equals(other.getItem());
    }
    result = result && (hasOverview() == other.hasOverview());
    if (hasOverview()) {
      result = result && getOverview()
          .equals(other.getOverview());
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    if (hasOverview()) {
      hash = (37 * hash) + OVERVIEW_FIELD_NUMBER;
      hash = (53 * hash) + getOverview().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta2.DeidentifyContentResponse prototype) {
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
   * Results of de-identifying a ContentItem.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta2.DeidentifyContentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta2.DeidentifyContentResponse)
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_DeidentifyContentResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_DeidentifyContentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.class, com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.newBuilder()
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
      if (itemBuilder_ == null) {
        item_ = null;
      } else {
        item_ = null;
        itemBuilder_ = null;
      }
      if (overviewBuilder_ == null) {
        overview_ = null;
      } else {
        overview_ = null;
        overviewBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta2.DlpProto.internal_static_google_privacy_dlp_v2beta2_DeidentifyContentResponse_descriptor;
    }

    public com.google.privacy.dlp.v2beta2.DeidentifyContentResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta2.DeidentifyContentResponse build() {
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta2.DeidentifyContentResponse buildPartial() {
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse result = new com.google.privacy.dlp.v2beta2.DeidentifyContentResponse(this);
      if (itemBuilder_ == null) {
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
      }
      if (overviewBuilder_ == null) {
        result.overview_ = overview_;
      } else {
        result.overview_ = overviewBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2beta2.DeidentifyContentResponse) {
        return mergeFrom((com.google.privacy.dlp.v2beta2.DeidentifyContentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta2.DeidentifyContentResponse other) {
      if (other == com.google.privacy.dlp.v2beta2.DeidentifyContentResponse.getDefaultInstance()) return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
      }
      if (other.hasOverview()) {
        mergeOverview(other.getOverview());
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
      com.google.privacy.dlp.v2beta2.DeidentifyContentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta2.DeidentifyContentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2beta2.ContentItem item_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.ContentItem, com.google.privacy.dlp.v2beta2.ContentItem.Builder, com.google.privacy.dlp.v2beta2.ContentItemOrBuilder> itemBuilder_;
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public boolean hasItem() {
      return itemBuilder_ != null || item_ != null;
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.ContentItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? com.google.privacy.dlp.v2beta2.ContentItem.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public Builder setItem(com.google.privacy.dlp.v2beta2.ContentItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public Builder setItem(
        com.google.privacy.dlp.v2beta2.ContentItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public Builder mergeItem(com.google.privacy.dlp.v2beta2.ContentItem value) {
      if (itemBuilder_ == null) {
        if (item_ != null) {
          item_ =
            com.google.privacy.dlp.v2beta2.ContentItem.newBuilder(item_).mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        itemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = null;
        onChanged();
      } else {
        item_ = null;
        itemBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.ContentItem.Builder getItemBuilder() {
      
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    public com.google.privacy.dlp.v2beta2.ContentItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            com.google.privacy.dlp.v2beta2.ContentItem.getDefaultInstance() : item_;
      }
    }
    /**
     * <pre>
     * The de-identified item.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.ContentItem item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.ContentItem, com.google.privacy.dlp.v2beta2.ContentItem.Builder, com.google.privacy.dlp.v2beta2.ContentItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.ContentItem, com.google.privacy.dlp.v2beta2.ContentItem.Builder, com.google.privacy.dlp.v2beta2.ContentItemOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    private com.google.privacy.dlp.v2beta2.TransformationOverview overview_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.TransformationOverview, com.google.privacy.dlp.v2beta2.TransformationOverview.Builder, com.google.privacy.dlp.v2beta2.TransformationOverviewOrBuilder> overviewBuilder_;
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public boolean hasOverview() {
      return overviewBuilder_ != null || overview_ != null;
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.TransformationOverview getOverview() {
      if (overviewBuilder_ == null) {
        return overview_ == null ? com.google.privacy.dlp.v2beta2.TransformationOverview.getDefaultInstance() : overview_;
      } else {
        return overviewBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public Builder setOverview(com.google.privacy.dlp.v2beta2.TransformationOverview value) {
      if (overviewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        overview_ = value;
        onChanged();
      } else {
        overviewBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public Builder setOverview(
        com.google.privacy.dlp.v2beta2.TransformationOverview.Builder builderForValue) {
      if (overviewBuilder_ == null) {
        overview_ = builderForValue.build();
        onChanged();
      } else {
        overviewBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public Builder mergeOverview(com.google.privacy.dlp.v2beta2.TransformationOverview value) {
      if (overviewBuilder_ == null) {
        if (overview_ != null) {
          overview_ =
            com.google.privacy.dlp.v2beta2.TransformationOverview.newBuilder(overview_).mergeFrom(value).buildPartial();
        } else {
          overview_ = value;
        }
        onChanged();
      } else {
        overviewBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public Builder clearOverview() {
      if (overviewBuilder_ == null) {
        overview_ = null;
        onChanged();
      } else {
        overview_ = null;
        overviewBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.TransformationOverview.Builder getOverviewBuilder() {
      
      onChanged();
      return getOverviewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    public com.google.privacy.dlp.v2beta2.TransformationOverviewOrBuilder getOverviewOrBuilder() {
      if (overviewBuilder_ != null) {
        return overviewBuilder_.getMessageOrBuilder();
      } else {
        return overview_ == null ?
            com.google.privacy.dlp.v2beta2.TransformationOverview.getDefaultInstance() : overview_;
      }
    }
    /**
     * <pre>
     * An overview of the changes that were made on the `item`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2beta2.TransformationOverview overview = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2beta2.TransformationOverview, com.google.privacy.dlp.v2beta2.TransformationOverview.Builder, com.google.privacy.dlp.v2beta2.TransformationOverviewOrBuilder> 
        getOverviewFieldBuilder() {
      if (overviewBuilder_ == null) {
        overviewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2beta2.TransformationOverview, com.google.privacy.dlp.v2beta2.TransformationOverview.Builder, com.google.privacy.dlp.v2beta2.TransformationOverviewOrBuilder>(
                getOverview(),
                getParentForChildren(),
                isClean());
        overview_ = null;
      }
      return overviewBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta2.DeidentifyContentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta2.DeidentifyContentResponse)
  private static final com.google.privacy.dlp.v2beta2.DeidentifyContentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta2.DeidentifyContentResponse();
  }

  public static com.google.privacy.dlp.v2beta2.DeidentifyContentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeidentifyContentResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeidentifyContentResponse>() {
    public DeidentifyContentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeidentifyContentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeidentifyContentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeidentifyContentResponse> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta2.DeidentifyContentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

