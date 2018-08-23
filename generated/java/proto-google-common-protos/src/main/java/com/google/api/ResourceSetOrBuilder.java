// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resources.proto

package com.google.api;

public interface ResourceSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ResourceSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The colloquial name of the resource.
   * If omitted, this is the name of the message.
   * </pre>
   *
   * <code>string base_name = 1;</code>
   */
  java.lang.String getBaseName();
  /**
   * <pre>
   * The colloquial name of the resource.
   * If omitted, this is the name of the message.
   * </pre>
   *
   * <code>string base_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getBaseNameBytes();

  /**
   * <pre>
   * The distinct resources that make up the set.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  java.util.List<com.google.api.Resource> 
      getResourcesList();
  /**
   * <pre>
   * The distinct resources that make up the set.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  com.google.api.Resource getResources(int index);
  /**
   * <pre>
   * The distinct resources that make up the set.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  int getResourcesCount();
  /**
   * <pre>
   * The distinct resources that make up the set.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  java.util.List<? extends com.google.api.ResourceOrBuilder> 
      getResourcesOrBuilderList();
  /**
   * <pre>
   * The distinct resources that make up the set.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  com.google.api.ResourceOrBuilder getResourcesOrBuilder(
      int index);
}