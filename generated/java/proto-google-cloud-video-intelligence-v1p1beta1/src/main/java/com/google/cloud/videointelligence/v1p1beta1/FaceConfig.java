// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

/**
 * <pre>
 * Config for FACE_DETECTION.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.FaceConfig}
 */
public  final class FaceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p1beta1.FaceConfig)
    FaceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FaceConfig.newBuilder() to construct.
  private FaceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FaceConfig() {
    model_ = "";
    includeBoundingBoxes_ = false;
    includeEmotions_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FaceConfig(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            model_ = s;
            break;
          }
          case 16: {

            includeBoundingBoxes_ = input.readBool();
            break;
          }
          case 32: {

            includeEmotions_ = input.readBool();
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
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_FaceConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_FaceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p1beta1.FaceConfig.class, com.google.cloud.videointelligence.v1p1beta1.FaceConfig.Builder.class);
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object model_;
  /**
   * <pre>
   * Model to use for face detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   */
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Model to use for face detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   */
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCLUDE_BOUNDING_BOXES_FIELD_NUMBER = 2;
  private boolean includeBoundingBoxes_;
  /**
   * <pre>
   * Whether bounding boxes be included in the face annotation output.
   * </pre>
   *
   * <code>bool include_bounding_boxes = 2;</code>
   */
  public boolean getIncludeBoundingBoxes() {
    return includeBoundingBoxes_;
  }

  public static final int INCLUDE_EMOTIONS_FIELD_NUMBER = 4;
  private boolean includeEmotions_;
  /**
   * <pre>
   * Whether to enable emotion detection. Ignored if 'include_bounding_boxes' is
   * false.
   * </pre>
   *
   * <code>bool include_emotions = 4;</code>
   */
  public boolean getIncludeEmotions() {
    return includeEmotions_;
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
    if (!getModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    if (includeBoundingBoxes_ != false) {
      output.writeBool(2, includeBoundingBoxes_);
    }
    if (includeEmotions_ != false) {
      output.writeBool(4, includeEmotions_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
    }
    if (includeBoundingBoxes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeBoundingBoxes_);
    }
    if (includeEmotions_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, includeEmotions_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p1beta1.FaceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p1beta1.FaceConfig other = (com.google.cloud.videointelligence.v1p1beta1.FaceConfig) obj;

    boolean result = true;
    result = result && getModel()
        .equals(other.getModel());
    result = result && (getIncludeBoundingBoxes()
        == other.getIncludeBoundingBoxes());
    result = result && (getIncludeEmotions()
        == other.getIncludeEmotions());
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
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + INCLUDE_BOUNDING_BOXES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeBoundingBoxes());
    hash = (37 * hash) + INCLUDE_EMOTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeEmotions());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1p1beta1.FaceConfig prototype) {
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
   * Config for FACE_DETECTION.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.FaceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p1beta1.FaceConfig)
      com.google.cloud.videointelligence.v1p1beta1.FaceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_FaceConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_FaceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p1beta1.FaceConfig.class, com.google.cloud.videointelligence.v1p1beta1.FaceConfig.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p1beta1.FaceConfig.newBuilder()
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
      model_ = "";

      includeBoundingBoxes_ = false;

      includeEmotions_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_FaceConfig_descriptor;
    }

    public com.google.cloud.videointelligence.v1p1beta1.FaceConfig getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p1beta1.FaceConfig.getDefaultInstance();
    }

    public com.google.cloud.videointelligence.v1p1beta1.FaceConfig build() {
      com.google.cloud.videointelligence.v1p1beta1.FaceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.videointelligence.v1p1beta1.FaceConfig buildPartial() {
      com.google.cloud.videointelligence.v1p1beta1.FaceConfig result = new com.google.cloud.videointelligence.v1p1beta1.FaceConfig(this);
      result.model_ = model_;
      result.includeBoundingBoxes_ = includeBoundingBoxes_;
      result.includeEmotions_ = includeEmotions_;
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
      if (other instanceof com.google.cloud.videointelligence.v1p1beta1.FaceConfig) {
        return mergeFrom((com.google.cloud.videointelligence.v1p1beta1.FaceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p1beta1.FaceConfig other) {
      if (other == com.google.cloud.videointelligence.v1p1beta1.FaceConfig.getDefaultInstance()) return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      if (other.getIncludeBoundingBoxes() != false) {
        setIncludeBoundingBoxes(other.getIncludeBoundingBoxes());
      }
      if (other.getIncludeEmotions() != false) {
        setIncludeEmotions(other.getIncludeEmotions());
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
      com.google.cloud.videointelligence.v1p1beta1.FaceConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1p1beta1.FaceConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <pre>
     * Model to use for face detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Model to use for face detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Model to use for face detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      model_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to use for face detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     */
    public Builder clearModel() {
      
      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Model to use for face detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      model_ = value;
      onChanged();
      return this;
    }

    private boolean includeBoundingBoxes_ ;
    /**
     * <pre>
     * Whether bounding boxes be included in the face annotation output.
     * </pre>
     *
     * <code>bool include_bounding_boxes = 2;</code>
     */
    public boolean getIncludeBoundingBoxes() {
      return includeBoundingBoxes_;
    }
    /**
     * <pre>
     * Whether bounding boxes be included in the face annotation output.
     * </pre>
     *
     * <code>bool include_bounding_boxes = 2;</code>
     */
    public Builder setIncludeBoundingBoxes(boolean value) {
      
      includeBoundingBoxes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether bounding boxes be included in the face annotation output.
     * </pre>
     *
     * <code>bool include_bounding_boxes = 2;</code>
     */
    public Builder clearIncludeBoundingBoxes() {
      
      includeBoundingBoxes_ = false;
      onChanged();
      return this;
    }

    private boolean includeEmotions_ ;
    /**
     * <pre>
     * Whether to enable emotion detection. Ignored if 'include_bounding_boxes' is
     * false.
     * </pre>
     *
     * <code>bool include_emotions = 4;</code>
     */
    public boolean getIncludeEmotions() {
      return includeEmotions_;
    }
    /**
     * <pre>
     * Whether to enable emotion detection. Ignored if 'include_bounding_boxes' is
     * false.
     * </pre>
     *
     * <code>bool include_emotions = 4;</code>
     */
    public Builder setIncludeEmotions(boolean value) {
      
      includeEmotions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to enable emotion detection. Ignored if 'include_bounding_boxes' is
     * false.
     * </pre>
     *
     * <code>bool include_emotions = 4;</code>
     */
    public Builder clearIncludeEmotions() {
      
      includeEmotions_ = false;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p1beta1.FaceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p1beta1.FaceConfig)
  private static final com.google.cloud.videointelligence.v1p1beta1.FaceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p1beta1.FaceConfig();
  }

  public static com.google.cloud.videointelligence.v1p1beta1.FaceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FaceConfig>
      PARSER = new com.google.protobuf.AbstractParser<FaceConfig>() {
    public FaceConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FaceConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FaceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FaceConfig> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.videointelligence.v1p1beta1.FaceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
