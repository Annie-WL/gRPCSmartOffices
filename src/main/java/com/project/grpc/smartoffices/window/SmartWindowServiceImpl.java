// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartWindow.proto

package com.project.grpc.smartoffices.window;

public final class SmartWindowServiceImpl {
  private SmartWindowServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartOffices_WindowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartOffices_WindowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartOffices_WindowResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartOffices_WindowResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021SmartWindow.proto\022\014SmartOffices\"R\n\rWin" +
      "dowRequest\022\025\n\rwindDirection\030\001 \001(\t\022\021\n\twin" +
      "dSpeed\030\002 \001(\001\022\027\n\017windTemperature\030\003 \001(\001\"9\n" +
      "\016WindowResponse\022\024\n\014windowStatus\030\001 \001(\010\022\021\n" +
      "\twindSpeed\030\002 \001(\0012\261\001\n\013SmartWindow\022O\n\016Cont" +
      "rolWindows\022\033.SmartOffices.WindowRequest\032" +
      "\034.SmartOffices.WindowResponse(\0010\001\022Q\n\022Str" +
      "eamWindowStatus\022\033.SmartOffices.WindowReq" +
      "uest\032\034.SmartOffices.WindowResponse0\001B@\n$" +
      "com.project.grpc.smartoffices.windowB\026Sm" +
      "artWindowServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_SmartOffices_WindowRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmartOffices_WindowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartOffices_WindowRequest_descriptor,
        new java.lang.String[] { "WindDirection", "WindSpeed", "WindTemperature", });
    internal_static_SmartOffices_WindowResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartOffices_WindowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartOffices_WindowResponse_descriptor,
        new java.lang.String[] { "WindowStatus", "WindSpeed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
