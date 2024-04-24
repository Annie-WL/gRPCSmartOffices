// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmartWindow.proto

package com.project.grpc.smartoffices.window;

/**
 * Protobuf type {@code SmartOffices.WindowResponse}
 */
public  final class WindowResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SmartOffices.WindowResponse)
    WindowResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WindowResponse.newBuilder() to construct.
  private WindowResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WindowResponse() {
    windowStatus_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WindowResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            windowStatus_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.project.grpc.smartoffices.window.SmartWindowServiceImpl.internal_static_SmartOffices_WindowResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.project.grpc.smartoffices.window.SmartWindowServiceImpl.internal_static_SmartOffices_WindowResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.project.grpc.smartoffices.window.WindowResponse.class, com.project.grpc.smartoffices.window.WindowResponse.Builder.class);
  }

  public static final int WINDOWSTATUS_FIELD_NUMBER = 1;
  private boolean windowStatus_;
  /**
   * <pre>
   * True if window is closed, False if open
   * </pre>
   *
   * <code>bool windowStatus = 1;</code>
   */
  public boolean getWindowStatus() {
    return windowStatus_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (windowStatus_ != false) {
      output.writeBool(1, windowStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (windowStatus_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, windowStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.project.grpc.smartoffices.window.WindowResponse)) {
      return super.equals(obj);
    }
    com.project.grpc.smartoffices.window.WindowResponse other = (com.project.grpc.smartoffices.window.WindowResponse) obj;

    boolean result = true;
    result = result && (getWindowStatus()
        == other.getWindowStatus());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WINDOWSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWindowStatus());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.project.grpc.smartoffices.window.WindowResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.project.grpc.smartoffices.window.WindowResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SmartOffices.WindowResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartOffices.WindowResponse)
      com.project.grpc.smartoffices.window.WindowResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.project.grpc.smartoffices.window.SmartWindowServiceImpl.internal_static_SmartOffices_WindowResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.project.grpc.smartoffices.window.SmartWindowServiceImpl.internal_static_SmartOffices_WindowResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.project.grpc.smartoffices.window.WindowResponse.class, com.project.grpc.smartoffices.window.WindowResponse.Builder.class);
    }

    // Construct using com.project.grpc.smartoffices.window.WindowResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      windowStatus_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.project.grpc.smartoffices.window.SmartWindowServiceImpl.internal_static_SmartOffices_WindowResponse_descriptor;
    }

    @java.lang.Override
    public com.project.grpc.smartoffices.window.WindowResponse getDefaultInstanceForType() {
      return com.project.grpc.smartoffices.window.WindowResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.project.grpc.smartoffices.window.WindowResponse build() {
      com.project.grpc.smartoffices.window.WindowResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.project.grpc.smartoffices.window.WindowResponse buildPartial() {
      com.project.grpc.smartoffices.window.WindowResponse result = new com.project.grpc.smartoffices.window.WindowResponse(this);
      result.windowStatus_ = windowStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.project.grpc.smartoffices.window.WindowResponse) {
        return mergeFrom((com.project.grpc.smartoffices.window.WindowResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.project.grpc.smartoffices.window.WindowResponse other) {
      if (other == com.project.grpc.smartoffices.window.WindowResponse.getDefaultInstance()) return this;
      if (other.getWindowStatus() != false) {
        setWindowStatus(other.getWindowStatus());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.project.grpc.smartoffices.window.WindowResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.project.grpc.smartoffices.window.WindowResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean windowStatus_ ;
    /**
     * <pre>
     * True if window is closed, False if open
     * </pre>
     *
     * <code>bool windowStatus = 1;</code>
     */
    public boolean getWindowStatus() {
      return windowStatus_;
    }
    /**
     * <pre>
     * True if window is closed, False if open
     * </pre>
     *
     * <code>bool windowStatus = 1;</code>
     */
    public Builder setWindowStatus(boolean value) {
      
      windowStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if window is closed, False if open
     * </pre>
     *
     * <code>bool windowStatus = 1;</code>
     */
    public Builder clearWindowStatus() {
      
      windowStatus_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SmartOffices.WindowResponse)
  }

  // @@protoc_insertion_point(class_scope:SmartOffices.WindowResponse)
  private static final com.project.grpc.smartoffices.window.WindowResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.project.grpc.smartoffices.window.WindowResponse();
  }

  public static com.project.grpc.smartoffices.window.WindowResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WindowResponse>
      PARSER = new com.google.protobuf.AbstractParser<WindowResponse>() {
    @java.lang.Override
    public WindowResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WindowResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WindowResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WindowResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.project.grpc.smartoffices.window.WindowResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
