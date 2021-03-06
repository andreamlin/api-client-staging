// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta2/dlp.proto

package com.google.privacy.dlp.v2beta2;

public interface FieldTransformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta2.FieldTransformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input field(s) to apply the transformation to. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId fields = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2beta2.FieldId> 
      getFieldsList();
  /**
   * <pre>
   * Input field(s) to apply the transformation to. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId fields = 1;</code>
   */
  com.google.privacy.dlp.v2beta2.FieldId getFields(int index);
  /**
   * <pre>
   * Input field(s) to apply the transformation to. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId fields = 1;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Input field(s) to apply the transformation to. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId fields = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2beta2.FieldIdOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * Input field(s) to apply the transformation to. [required]
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta2.FieldId fields = 1;</code>
   */
  com.google.privacy.dlp.v2beta2.FieldIdOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * Only apply the transformation if the condition evaluates to true for the
   * given `RecordCondition`. The conditions are allowed to reference fields
   * that are not used in the actual transformation. [optional]
   * Example Use Cases:
   * - Apply a different bucket transformation to an age column if the zip code
   * column for the same record is within a specific range.
   * - Redact a field if the date of birth field is greater than 85.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RecordCondition condition = 3;</code>
   */
  boolean hasCondition();
  /**
   * <pre>
   * Only apply the transformation if the condition evaluates to true for the
   * given `RecordCondition`. The conditions are allowed to reference fields
   * that are not used in the actual transformation. [optional]
   * Example Use Cases:
   * - Apply a different bucket transformation to an age column if the zip code
   * column for the same record is within a specific range.
   * - Redact a field if the date of birth field is greater than 85.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RecordCondition condition = 3;</code>
   */
  com.google.privacy.dlp.v2beta2.RecordCondition getCondition();
  /**
   * <pre>
   * Only apply the transformation if the condition evaluates to true for the
   * given `RecordCondition`. The conditions are allowed to reference fields
   * that are not used in the actual transformation. [optional]
   * Example Use Cases:
   * - Apply a different bucket transformation to an age column if the zip code
   * column for the same record is within a specific range.
   * - Redact a field if the date of birth field is greater than 85.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.RecordCondition condition = 3;</code>
   */
  com.google.privacy.dlp.v2beta2.RecordConditionOrBuilder getConditionOrBuilder();

  /**
   * <pre>
   * Apply the transformation to the entire field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.PrimitiveTransformation primitive_transformation = 4;</code>
   */
  boolean hasPrimitiveTransformation();
  /**
   * <pre>
   * Apply the transformation to the entire field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.PrimitiveTransformation primitive_transformation = 4;</code>
   */
  com.google.privacy.dlp.v2beta2.PrimitiveTransformation getPrimitiveTransformation();
  /**
   * <pre>
   * Apply the transformation to the entire field.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.PrimitiveTransformation primitive_transformation = 4;</code>
   */
  com.google.privacy.dlp.v2beta2.PrimitiveTransformationOrBuilder getPrimitiveTransformationOrBuilder();

  /**
   * <pre>
   * Treat the contents of the field as free text, and selectively
   * transform content that matches an `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InfoTypeTransformations info_type_transformations = 5;</code>
   */
  boolean hasInfoTypeTransformations();
  /**
   * <pre>
   * Treat the contents of the field as free text, and selectively
   * transform content that matches an `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InfoTypeTransformations info_type_transformations = 5;</code>
   */
  com.google.privacy.dlp.v2beta2.InfoTypeTransformations getInfoTypeTransformations();
  /**
   * <pre>
   * Treat the contents of the field as free text, and selectively
   * transform content that matches an `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta2.InfoTypeTransformations info_type_transformations = 5;</code>
   */
  com.google.privacy.dlp.v2beta2.InfoTypeTransformationsOrBuilder getInfoTypeTransformationsOrBuilder();

  public com.google.privacy.dlp.v2beta2.FieldTransformation.TransformationCase getTransformationCase();
}
