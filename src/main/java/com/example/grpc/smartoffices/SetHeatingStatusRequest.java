// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartheating.proto

package com.example.grpc.smartoffices;

/**
 * <pre>
 * SetHeatingStatusRequest
 * </pre>
 *
 * Protobuf type {@code SmartOffices.SetHeatingStatusRequest}
 */
public  final class SetHeatingStatusRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SmartOffices.SetHeatingStatusRequest)
    SetHeatingStatusRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetHeatingStatusRequest.newBuilder() to construct.
  private SetHeatingStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetHeatingStatusRequest() {
    area_ = "";
    status_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetHeatingStatusRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            area_ = s;
            break;
          }
          case 16: {

            status_ = input.readBool();
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
    return com.example.grpc.smartoffices.SmartHeatingServiceImpl.internal_static_SmartOffices_SetHeatingStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.smartoffices.SmartHeatingServiceImpl.internal_static_SmartOffices_SetHeatingStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.smartoffices.SetHeatingStatusRequest.class, com.example.grpc.smartoffices.SetHeatingStatusRequest.Builder.class);
  }

  public static final int AREA_FIELD_NUMBER = 1;
  private volatile java.lang.Object area_;
  /**
   * <code>string area = 1;</code>
   */
  public java.lang.String getArea() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      area_ = s;
      return s;
    }
  }
  /**
   * <code>string area = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAreaBytes() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      area_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private boolean status_;
  /**
   * <code>bool status = 2;</code>
   */
  public boolean getStatus() {
    return status_;
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
    if (!getAreaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, area_);
    }
    if (status_ != false) {
      output.writeBool(2, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAreaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, area_);
    }
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, status_);
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
    if (!(obj instanceof com.example.grpc.smartoffices.SetHeatingStatusRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.smartoffices.SetHeatingStatusRequest other = (com.example.grpc.smartoffices.SetHeatingStatusRequest) obj;

    boolean result = true;
    result = result && getArea()
        .equals(other.getArea());
    result = result && (getStatus()
        == other.getStatus());
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
    hash = (37 * hash) + AREA_FIELD_NUMBER;
    hash = (53 * hash) + getArea().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.smartoffices.SetHeatingStatusRequest parseFrom(
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
  public static Builder newBuilder(com.example.grpc.smartoffices.SetHeatingStatusRequest prototype) {
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
   * <pre>
   * SetHeatingStatusRequest
   * </pre>
   *
   * Protobuf type {@code SmartOffices.SetHeatingStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartOffices.SetHeatingStatusRequest)
      com.example.grpc.smartoffices.SetHeatingStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.smartoffices.SmartHeatingServiceImpl.internal_static_SmartOffices_SetHeatingStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.smartoffices.SmartHeatingServiceImpl.internal_static_SmartOffices_SetHeatingStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.smartoffices.SetHeatingStatusRequest.class, com.example.grpc.smartoffices.SetHeatingStatusRequest.Builder.class);
    }

    // Construct using com.example.grpc.smartoffices.SetHeatingStatusRequest.newBuilder()
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
      area_ = "";

      status_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.smartoffices.SmartHeatingServiceImpl.internal_static_SmartOffices_SetHeatingStatusRequest_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.smartoffices.SetHeatingStatusRequest getDefaultInstanceForType() {
      return com.example.grpc.smartoffices.SetHeatingStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.smartoffices.SetHeatingStatusRequest build() {
      com.example.grpc.smartoffices.SetHeatingStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.smartoffices.SetHeatingStatusRequest buildPartial() {
      com.example.grpc.smartoffices.SetHeatingStatusRequest result = new com.example.grpc.smartoffices.SetHeatingStatusRequest(this);
      result.area_ = area_;
      result.status_ = status_;
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
      if (other instanceof com.example.grpc.smartoffices.SetHeatingStatusRequest) {
        return mergeFrom((com.example.grpc.smartoffices.SetHeatingStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.smartoffices.SetHeatingStatusRequest other) {
      if (other == com.example.grpc.smartoffices.SetHeatingStatusRequest.getDefaultInstance()) return this;
      if (!other.getArea().isEmpty()) {
        area_ = other.area_;
        onChanged();
      }
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
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
      com.example.grpc.smartoffices.SetHeatingStatusRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.smartoffices.SetHeatingStatusRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object area_ = "";
    /**
     * <code>string area = 1;</code>
     */
    public java.lang.String getArea() {
      java.lang.Object ref = area_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        area_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string area = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAreaBytes() {
      java.lang.Object ref = area_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        area_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string area = 1;</code>
     */
    public Builder setArea(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      area_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string area = 1;</code>
     */
    public Builder clearArea() {
      
      area_ = getDefaultInstance().getArea();
      onChanged();
      return this;
    }
    /**
     * <code>string area = 1;</code>
     */
    public Builder setAreaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      area_ = value;
      onChanged();
      return this;
    }

    private boolean status_ ;
    /**
     * <code>bool status = 2;</code>
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <code>bool status = 2;</code>
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool status = 2;</code>
     */
    public Builder clearStatus() {
      
      status_ = false;
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


    // @@protoc_insertion_point(builder_scope:SmartOffices.SetHeatingStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:SmartOffices.SetHeatingStatusRequest)
  private static final com.example.grpc.smartoffices.SetHeatingStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.smartoffices.SetHeatingStatusRequest();
  }

  public static com.example.grpc.smartoffices.SetHeatingStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetHeatingStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetHeatingStatusRequest>() {
    @java.lang.Override
    public SetHeatingStatusRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetHeatingStatusRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetHeatingStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetHeatingStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.smartoffices.SetHeatingStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

