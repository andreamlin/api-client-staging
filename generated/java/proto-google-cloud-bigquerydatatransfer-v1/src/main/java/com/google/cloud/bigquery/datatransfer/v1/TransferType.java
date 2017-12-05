// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * Represents data transfer type.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.bigquery.datatransfer.v1.TransferType}
 */
public enum TransferType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Invalid or Unknown transfer type placeholder.
   * </pre>
   *
   * <code>TRANSFER_TYPE_UNSPECIFIED = 0;</code>
   */
  TRANSFER_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Batch data transfer.
   * </pre>
   *
   * <code>BATCH = 1;</code>
   */
  BATCH(1),
  /**
   * <pre>
   * Streaming data transfer. Streaming data source currently doesn't
   * support multiple transfer configs per project.
   * </pre>
   *
   * <code>STREAMING = 2;</code>
   */
  STREAMING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Invalid or Unknown transfer type placeholder.
   * </pre>
   *
   * <code>TRANSFER_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TRANSFER_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Batch data transfer.
   * </pre>
   *
   * <code>BATCH = 1;</code>
   */
  public static final int BATCH_VALUE = 1;
  /**
   * <pre>
   * Streaming data transfer. Streaming data source currently doesn't
   * support multiple transfer configs per project.
   * </pre>
   *
   * <code>STREAMING = 2;</code>
   */
  public static final int STREAMING_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TransferType valueOf(int value) {
    return forNumber(value);
  }

  public static TransferType forNumber(int value) {
    switch (value) {
      case 0: return TRANSFER_TYPE_UNSPECIFIED;
      case 1: return BATCH;
      case 2: return STREAMING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransferType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransferType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransferType>() {
          public TransferType findValueByNumber(int number) {
            return TransferType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TransferType[] VALUES = values();

  public static TransferType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransferType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.datatransfer.v1.TransferType)
}

