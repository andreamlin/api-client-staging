// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * ListNodePoolsResponse is the result of ListNodePoolsRequest.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.ListNodePoolsResponse}
 */
public  final class ListNodePoolsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.ListNodePoolsResponse)
    ListNodePoolsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNodePoolsResponse.newBuilder() to construct.
  private ListNodePoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNodePoolsResponse() {
    nodePools_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNodePoolsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              nodePools_ = new java.util.ArrayList<com.google.container.v1.NodePool>();
              mutable_bitField0_ |= 0x00000001;
            }
            nodePools_.add(
                input.readMessage(com.google.container.v1.NodePool.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        nodePools_ = java.util.Collections.unmodifiableList(nodePools_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListNodePoolsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListNodePoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.ListNodePoolsResponse.class, com.google.container.v1.ListNodePoolsResponse.Builder.class);
  }

  public static final int NODE_POOLS_FIELD_NUMBER = 1;
  private java.util.List<com.google.container.v1.NodePool> nodePools_;
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
   */
  public java.util.List<com.google.container.v1.NodePool> getNodePoolsList() {
    return nodePools_;
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
   */
  public java.util.List<? extends com.google.container.v1.NodePoolOrBuilder> 
      getNodePoolsOrBuilderList() {
    return nodePools_;
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
   */
  public int getNodePoolsCount() {
    return nodePools_.size();
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
   */
  public com.google.container.v1.NodePool getNodePools(int index) {
    return nodePools_.get(index);
  }
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
   */
  public com.google.container.v1.NodePoolOrBuilder getNodePoolsOrBuilder(
      int index) {
    return nodePools_.get(index);
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
    for (int i = 0; i < nodePools_.size(); i++) {
      output.writeMessage(1, nodePools_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodePools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nodePools_.get(i));
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
    if (!(obj instanceof com.google.container.v1.ListNodePoolsResponse)) {
      return super.equals(obj);
    }
    com.google.container.v1.ListNodePoolsResponse other = (com.google.container.v1.ListNodePoolsResponse) obj;

    boolean result = true;
    result = result && getNodePoolsList()
        .equals(other.getNodePoolsList());
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
    if (getNodePoolsCount() > 0) {
      hash = (37 * hash) + NODE_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getNodePoolsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListNodePoolsResponse parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.ListNodePoolsResponse prototype) {
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
   * ListNodePoolsResponse is the result of ListNodePoolsRequest.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.ListNodePoolsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.ListNodePoolsResponse)
      com.google.container.v1.ListNodePoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListNodePoolsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListNodePoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.ListNodePoolsResponse.class, com.google.container.v1.ListNodePoolsResponse.Builder.class);
    }

    // Construct using com.google.container.v1.ListNodePoolsResponse.newBuilder()
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
        getNodePoolsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (nodePoolsBuilder_ == null) {
        nodePools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nodePoolsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListNodePoolsResponse_descriptor;
    }

    public com.google.container.v1.ListNodePoolsResponse getDefaultInstanceForType() {
      return com.google.container.v1.ListNodePoolsResponse.getDefaultInstance();
    }

    public com.google.container.v1.ListNodePoolsResponse build() {
      com.google.container.v1.ListNodePoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.container.v1.ListNodePoolsResponse buildPartial() {
      com.google.container.v1.ListNodePoolsResponse result = new com.google.container.v1.ListNodePoolsResponse(this);
      int from_bitField0_ = bitField0_;
      if (nodePoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          nodePools_ = java.util.Collections.unmodifiableList(nodePools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodePools_ = nodePools_;
      } else {
        result.nodePools_ = nodePoolsBuilder_.build();
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
      if (other instanceof com.google.container.v1.ListNodePoolsResponse) {
        return mergeFrom((com.google.container.v1.ListNodePoolsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.ListNodePoolsResponse other) {
      if (other == com.google.container.v1.ListNodePoolsResponse.getDefaultInstance()) return this;
      if (nodePoolsBuilder_ == null) {
        if (!other.nodePools_.isEmpty()) {
          if (nodePools_.isEmpty()) {
            nodePools_ = other.nodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodePoolsIsMutable();
            nodePools_.addAll(other.nodePools_);
          }
          onChanged();
        }
      } else {
        if (!other.nodePools_.isEmpty()) {
          if (nodePoolsBuilder_.isEmpty()) {
            nodePoolsBuilder_.dispose();
            nodePoolsBuilder_ = null;
            nodePools_ = other.nodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodePoolsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodePoolsFieldBuilder() : null;
          } else {
            nodePoolsBuilder_.addAllMessages(other.nodePools_);
          }
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
      com.google.container.v1.ListNodePoolsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.ListNodePoolsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.container.v1.NodePool> nodePools_ =
      java.util.Collections.emptyList();
    private void ensureNodePoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        nodePools_ = new java.util.ArrayList<com.google.container.v1.NodePool>(nodePools_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1.NodePool, com.google.container.v1.NodePool.Builder, com.google.container.v1.NodePoolOrBuilder> nodePoolsBuilder_;

    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public java.util.List<com.google.container.v1.NodePool> getNodePoolsList() {
      if (nodePoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodePools_);
      } else {
        return nodePoolsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public int getNodePoolsCount() {
      if (nodePoolsBuilder_ == null) {
        return nodePools_.size();
      } else {
        return nodePoolsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1.NodePool getNodePools(int index) {
      if (nodePoolsBuilder_ == null) {
        return nodePools_.get(index);
      } else {
        return nodePoolsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder setNodePools(
        int index, com.google.container.v1.NodePool value) {
      if (nodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodePoolsIsMutable();
        nodePools_.set(index, value);
        onChanged();
      } else {
        nodePoolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder setNodePools(
        int index, com.google.container.v1.NodePool.Builder builderForValue) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodePoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(com.google.container.v1.NodePool value) {
      if (nodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodePoolsIsMutable();
        nodePools_.add(value);
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(
        int index, com.google.container.v1.NodePool value) {
      if (nodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodePoolsIsMutable();
        nodePools_.add(index, value);
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(
        com.google.container.v1.NodePool.Builder builderForValue) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.add(builderForValue.build());
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder addNodePools(
        int index, com.google.container.v1.NodePool.Builder builderForValue) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodePoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder addAllNodePools(
        java.lang.Iterable<? extends com.google.container.v1.NodePool> values) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodePools_);
        onChanged();
      } else {
        nodePoolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder clearNodePools() {
      if (nodePoolsBuilder_ == null) {
        nodePools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodePoolsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public Builder removeNodePools(int index) {
      if (nodePoolsBuilder_ == null) {
        ensureNodePoolsIsMutable();
        nodePools_.remove(index);
        onChanged();
      } else {
        nodePoolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1.NodePool.Builder getNodePoolsBuilder(
        int index) {
      return getNodePoolsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1.NodePoolOrBuilder getNodePoolsOrBuilder(
        int index) {
      if (nodePoolsBuilder_ == null) {
        return nodePools_.get(index);  } else {
        return nodePoolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public java.util.List<? extends com.google.container.v1.NodePoolOrBuilder> 
         getNodePoolsOrBuilderList() {
      if (nodePoolsBuilder_ != null) {
        return nodePoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodePools_);
      }
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1.NodePool.Builder addNodePoolsBuilder() {
      return getNodePoolsFieldBuilder().addBuilder(
          com.google.container.v1.NodePool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public com.google.container.v1.NodePool.Builder addNodePoolsBuilder(
        int index) {
      return getNodePoolsFieldBuilder().addBuilder(
          index, com.google.container.v1.NodePool.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of node pools for a cluster.
     * </pre>
     *
     * <code>repeated .google.container.v1.NodePool node_pools = 1;</code>
     */
    public java.util.List<com.google.container.v1.NodePool.Builder> 
         getNodePoolsBuilderList() {
      return getNodePoolsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1.NodePool, com.google.container.v1.NodePool.Builder, com.google.container.v1.NodePoolOrBuilder> 
        getNodePoolsFieldBuilder() {
      if (nodePoolsBuilder_ == null) {
        nodePoolsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.container.v1.NodePool, com.google.container.v1.NodePool.Builder, com.google.container.v1.NodePoolOrBuilder>(
                nodePools_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        nodePools_ = null;
      }
      return nodePoolsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.container.v1.ListNodePoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.ListNodePoolsResponse)
  private static final com.google.container.v1.ListNodePoolsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.ListNodePoolsResponse();
  }

  public static com.google.container.v1.ListNodePoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNodePoolsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListNodePoolsResponse>() {
    public ListNodePoolsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListNodePoolsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNodePoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNodePoolsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.container.v1.ListNodePoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

