// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartLight.proto

package com.project.grpc.smartoffices.light;

public final class SmartLightServiceImpl {
  private SmartLightServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartOffices_LightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartOffices_LightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartOffices_LightResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartOffices_LightResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020SmartLight.proto\022\014SmartOffices\"!\n\014Ligh" +
      "tRequest\022\021\n\tnumPeople\030\001 \001(\005\"7\n\rLightResp" +
      "onse\022\023\n\013lightStatus\030\001 \001(\010\022\021\n\tnumPeople\030\002" +
      " \001(\0052\253\001\n\nSmartLight\022J\n\rControlLights\022\032.S" +
      "martOffices.LightRequest\032\033.SmartOffices." +
      "LightResponse(\001\022Q\n\024streamNumberOfPeople\022" +
      "\032.SmartOffices.LightRequest\032\033.SmartOffic" +
      "es.LightResponse0\001B>\n#com.project.grpc.s" +
      "martoffices.lightB\025SmartLightServiceImpl" +
      "P\001b\006proto3"
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
    internal_static_SmartOffices_LightRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmartOffices_LightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartOffices_LightRequest_descriptor,
        new java.lang.String[] { "NumPeople", });
    internal_static_SmartOffices_LightResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartOffices_LightResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartOffices_LightResponse_descriptor,
        new java.lang.String[] { "LightStatus", "NumPeople", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
