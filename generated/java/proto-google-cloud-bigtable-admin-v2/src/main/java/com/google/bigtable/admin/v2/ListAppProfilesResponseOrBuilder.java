// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

public interface ListAppProfilesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListAppProfilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  java.util.List<com.google.bigtable.admin.v2.AppProfile> 
      getAppProfilesList();
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  com.google.bigtable.admin.v2.AppProfile getAppProfiles(int index);
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  int getAppProfilesCount();
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  java.util.List<? extends com.google.bigtable.admin.v2.AppProfileOrBuilder> 
      getAppProfilesOrBuilderList();
  /**
   * <pre>
   * The list of requested app profiles.
   * </pre>
   *
   * <code>repeated .google.bigtable.admin.v2.AppProfile app_profiles = 1;</code>
   */
  com.google.bigtable.admin.v2.AppProfileOrBuilder getAppProfilesOrBuilder(
      int index);

  /**
   * <pre>
   * Set if not all app profiles could be returned in a single response.
   * Pass this value to `page_token` in another request to get the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Set if not all app profiles could be returned in a single response.
   * Pass this value to `page_token` in another request to get the next
   * page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
