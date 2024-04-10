// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartWindow.proto

package com.example.grpc.smartoffices.window;

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
    internal_static_SmartOffices_WindowControlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartOffices_WindowControlRequest_fieldAccessorTable;
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
      "\n\021SmartWindow.proto\022\014SmartOffices\"\035\n\rWin" +
      "dowRequest\022\014\n\004area\030\001 \001(\t\"5\n\024WindowContro" +
      "lRequest\022\014\n\004area\030\001 \001(\t\022\017\n\007command\030\002 \001(\t\"" +
      "!\n\016WindowResponse\022\017\n\007message\030\001 \001(\t2\225\003\n\013S" +
      "martWindow\022G\n\nOpenWindow\022\033.SmartOffices." +
      "WindowRequest\032\034.SmartOffices.WindowRespo" +
      "nse\022H\n\013CloseWindow\022\033.SmartOffices.Window" +
      "Request\032\034.SmartOffices.WindowResponse\022H\n" +
      "\013TintLighter\022\033.SmartOffices.WindowReques" +
      "t\032\034.SmartOffices.WindowResponse\022G\n\nTintD" +
      "arker\022\033.SmartOffices.WindowRequest\032\034.Sma" +
      "rtOffices.WindowResponse\022`\n\030InteractiveW" +
      "indowControl\022\".SmartOffices.WindowContro" +
      "lRequest\032\034.SmartOffices.WindowResponse(\001" +
      "0\001B@\n$com.example.grpc.smartoffices.wind" +
      "owB\026SmartWindowServiceImplP\001b\006proto3"
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
        new java.lang.String[] { "Area", });
    internal_static_SmartOffices_WindowControlRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartOffices_WindowControlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartOffices_WindowControlRequest_descriptor,
        new java.lang.String[] { "Area", "Command", });
    internal_static_SmartOffices_WindowResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SmartOffices_WindowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartOffices_WindowResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
