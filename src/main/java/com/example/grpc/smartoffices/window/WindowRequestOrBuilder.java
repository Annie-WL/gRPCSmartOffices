// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartWindow.proto

package com.example.grpc.smartoffices.window;

public interface WindowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SmartOffices.WindowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string windDirection = 1;</code>
   */
  java.lang.String getWindDirection();
  /**
   * <code>string windDirection = 1;</code>
   */
  com.google.protobuf.ByteString
      getWindDirectionBytes();

  /**
   * <code>double windSpeed = 2;</code>
   */
  double getWindSpeed();

  /**
   * <code>double windTemperature = 3;</code>
   */
  double getWindTemperature();
}
