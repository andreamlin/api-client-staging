// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NodeManagementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodeManagement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A flag that specifies whether node auto-upgrade is enabled for the node
   * pool. If enabled, node auto-upgrade helps keep the nodes in your node pool
   * up to date with the latest release version of Kubernetes.
   * </pre>
   *
   * <code>bool auto_upgrade = 1;</code>
   */
  boolean getAutoUpgrade();

  /**
   * <pre>
   * A flag that specifies whether the node auto-repair is enabled for the node
   * pool. If enabled, the nodes in this node pool will be monitored and, if
   * they fail health checks too many times, an automatic repair action will be
   * triggered.
   * </pre>
   *
   * <code>bool auto_repair = 2;</code>
   */
  boolean getAutoRepair();

  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  boolean hasUpgradeOptions();
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  com.google.container.v1.AutoUpgradeOptions getUpgradeOptions();
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  com.google.container.v1.AutoUpgradeOptionsOrBuilder getUpgradeOptionsOrBuilder();
}
