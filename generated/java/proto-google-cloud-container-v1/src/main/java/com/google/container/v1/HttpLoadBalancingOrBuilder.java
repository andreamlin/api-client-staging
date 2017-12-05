// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface HttpLoadBalancingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.HttpLoadBalancing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether the HTTP Load Balancing controller is enabled in the cluster.
   * When enabled, it runs a small pod in the cluster that manages the load
   * balancers.
   * </pre>
   *
   * <code>bool disabled = 1;</code>
   */
  boolean getDisabled();
}
