// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartHeating.proto

package com.example.grpc.smartoffices.heating;

public interface HeatingUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SmartOffices.HeatingUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string area = 1;</code>
   */
  java.lang.String getArea();
  /**
   * <code>string area = 1;</code>
   */
  com.google.protobuf.ByteString
      getAreaBytes();

  /**
   * <pre>
   * Continuous status updates (e.g., "Heating still on", "Temperature stabilized")
   * </pre>
   *
   * <code>string status = 2;</code>
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * Continuous status updates (e.g., "Heating still on", "Temperature stabilized")
   * </pre>
   *
   * <code>string status = 2;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
