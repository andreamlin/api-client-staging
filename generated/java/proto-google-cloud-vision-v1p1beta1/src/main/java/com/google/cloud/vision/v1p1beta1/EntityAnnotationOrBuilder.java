// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

public interface EntityAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p1beta1.EntityAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string mid = 1;</code>
   */
  java.lang.String getMid();
  /**
   * <pre>
   * Opaque entity ID. Some IDs may be available in
   * [Google Knowledge Graph Search API](https://developers.google.com/knowledge-graph/).
   * </pre>
   *
   * <code>string mid = 1;</code>
   */
  com.google.protobuf.ByteString
      getMidBytes();

  /**
   * <pre>
   * The language code for the locale in which the entity textual
   * `description` is expressed.
   * </pre>
   *
   * <code>string locale = 2;</code>
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * The language code for the locale in which the entity textual
   * `description` is expressed.
   * </pre>
   *
   * <code>string locale = 2;</code>
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * Entity textual description, expressed in its `locale` language.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Entity textual description, expressed in its `locale` language.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Overall score of the result. Range [0, 1].
   * </pre>
   *
   * <code>float score = 4;</code>
   */
  float getScore();

  /**
   * <pre>
   * The accuracy of the entity detection in an image.
   * For example, for an image in which the "Eiffel Tower" entity is detected,
   * this field represents the confidence that there is a tower in the query
   * image. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 5;</code>
   */
  float getConfidence();

  /**
   * <pre>
   * The relevancy of the ICA (Image Content Annotation) label to the
   * image. For example, the relevancy of "tower" is likely higher to an image
   * containing the detected "Eiffel Tower" than to an image containing a
   * detected distant towering building, even though the confidence that
   * there is a tower in each image may be the same. Range [0, 1].
   * </pre>
   *
   * <code>float topicality = 6;</code>
   */
  float getTopicality();

  /**
   * <pre>
   * Image region to which this entity belongs. Not produced
   * for `LABEL_DETECTION` features.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.BoundingPoly bounding_poly = 7;</code>
   */
  boolean hasBoundingPoly();
  /**
   * <pre>
   * Image region to which this entity belongs. Not produced
   * for `LABEL_DETECTION` features.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.BoundingPoly bounding_poly = 7;</code>
   */
  com.google.cloud.vision.v1p1beta1.BoundingPoly getBoundingPoly();
  /**
   * <pre>
   * Image region to which this entity belongs. Not produced
   * for `LABEL_DETECTION` features.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.BoundingPoly bounding_poly = 7;</code>
   */
  com.google.cloud.vision.v1p1beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.LocationInfo locations = 8;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.LocationInfo> 
      getLocationsList();
  /**
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.LocationInfo locations = 8;</code>
   */
  com.google.cloud.vision.v1p1beta1.LocationInfo getLocations(int index);
  /**
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.LocationInfo locations = 8;</code>
   */
  int getLocationsCount();
  /**
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.LocationInfo locations = 8;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.LocationInfoOrBuilder> 
      getLocationsOrBuilderList();
  /**
   * <pre>
   * The location information for the detected entity. Multiple
   * `LocationInfo` elements can be present because one location may
   * indicate the location of the scene in the image, and another location
   * may indicate the location of the place where the image was taken.
   * Location information is usually present for landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.LocationInfo locations = 8;</code>
   */
  com.google.cloud.vision.v1p1beta1.LocationInfoOrBuilder getLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Property properties = 9;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.Property> 
      getPropertiesList();
  /**
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Property properties = 9;</code>
   */
  com.google.cloud.vision.v1p1beta1.Property getProperties(int index);
  /**
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Property properties = 9;</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Property properties = 9;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.PropertyOrBuilder> 
      getPropertiesOrBuilderList();
  /**
   * <pre>
   * Some entities may have optional user-supplied `Property` (name/value)
   * fields, such a score or string that qualifies the entity.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.Property properties = 9;</code>
   */
  com.google.cloud.vision.v1p1beta1.PropertyOrBuilder getPropertiesOrBuilder(
      int index);
}
