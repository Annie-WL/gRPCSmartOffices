package com.example.grpc.smartoffices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Smart Light Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: smartlights.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartLightServiceGrpc {

  private SmartLightServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartLightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOnLightRequest,
      com.example.grpc.smartoffices.TurnOnLightResponse> getTurnOnLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnLight",
      requestType = com.example.grpc.smartoffices.TurnOnLightRequest.class,
      responseType = com.example.grpc.smartoffices.TurnOnLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOnLightRequest,
      com.example.grpc.smartoffices.TurnOnLightResponse> getTurnOnLightMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOnLightRequest, com.example.grpc.smartoffices.TurnOnLightResponse> getTurnOnLightMethod;
    if ((getTurnOnLightMethod = SmartLightServiceGrpc.getTurnOnLightMethod) == null) {
      synchronized (SmartLightServiceGrpc.class) {
        if ((getTurnOnLightMethod = SmartLightServiceGrpc.getTurnOnLightMethod) == null) {
          SmartLightServiceGrpc.getTurnOnLightMethod = getTurnOnLightMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.TurnOnLightRequest, com.example.grpc.smartoffices.TurnOnLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOnLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOnLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOnLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightServiceMethodDescriptorSupplier("TurnOnLight"))
              .build();
        }
      }
    }
    return getTurnOnLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOffLightRequest,
      com.example.grpc.smartoffices.TurnOffLightResponse> getTurnOffLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOffLight",
      requestType = com.example.grpc.smartoffices.TurnOffLightRequest.class,
      responseType = com.example.grpc.smartoffices.TurnOffLightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOffLightRequest,
      com.example.grpc.smartoffices.TurnOffLightResponse> getTurnOffLightMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOffLightRequest, com.example.grpc.smartoffices.TurnOffLightResponse> getTurnOffLightMethod;
    if ((getTurnOffLightMethod = SmartLightServiceGrpc.getTurnOffLightMethod) == null) {
      synchronized (SmartLightServiceGrpc.class) {
        if ((getTurnOffLightMethod = SmartLightServiceGrpc.getTurnOffLightMethod) == null) {
          SmartLightServiceGrpc.getTurnOffLightMethod = getTurnOffLightMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.TurnOffLightRequest, com.example.grpc.smartoffices.TurnOffLightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOffLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOffLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOffLightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightServiceMethodDescriptorSupplier("TurnOffLight"))
              .build();
        }
      }
    }
    return getTurnOffLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetLightStatusRequest,
      com.example.grpc.smartoffices.GetLightStatusResponse> getGetLightStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLightStatus",
      requestType = com.example.grpc.smartoffices.GetLightStatusRequest.class,
      responseType = com.example.grpc.smartoffices.GetLightStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetLightStatusRequest,
      com.example.grpc.smartoffices.GetLightStatusResponse> getGetLightStatusMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetLightStatusRequest, com.example.grpc.smartoffices.GetLightStatusResponse> getGetLightStatusMethod;
    if ((getGetLightStatusMethod = SmartLightServiceGrpc.getGetLightStatusMethod) == null) {
      synchronized (SmartLightServiceGrpc.class) {
        if ((getGetLightStatusMethod = SmartLightServiceGrpc.getGetLightStatusMethod) == null) {
          SmartLightServiceGrpc.getGetLightStatusMethod = getGetLightStatusMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.GetLightStatusRequest, com.example.grpc.smartoffices.GetLightStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLightStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.GetLightStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.GetLightStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightServiceMethodDescriptorSupplier("GetLightStatus"))
              .build();
        }
      }
    }
    return getGetLightStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetLightStatusRequest,
      com.example.grpc.smartoffices.SetLightStatusResponse> getSetLightStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetLightStatus",
      requestType = com.example.grpc.smartoffices.SetLightStatusRequest.class,
      responseType = com.example.grpc.smartoffices.SetLightStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetLightStatusRequest,
      com.example.grpc.smartoffices.SetLightStatusResponse> getSetLightStatusMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetLightStatusRequest, com.example.grpc.smartoffices.SetLightStatusResponse> getSetLightStatusMethod;
    if ((getSetLightStatusMethod = SmartLightServiceGrpc.getSetLightStatusMethod) == null) {
      synchronized (SmartLightServiceGrpc.class) {
        if ((getSetLightStatusMethod = SmartLightServiceGrpc.getSetLightStatusMethod) == null) {
          SmartLightServiceGrpc.getSetLightStatusMethod = getSetLightStatusMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.SetLightStatusRequest, com.example.grpc.smartoffices.SetLightStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetLightStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.SetLightStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.SetLightStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightServiceMethodDescriptorSupplier("SetLightStatus"))
              .build();
        }
      }
    }
    return getSetLightStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustLightBrightnessRequest,
      com.example.grpc.smartoffices.AdjustLightBrightnessResponse> getAdjustLightBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustLightBrightness",
      requestType = com.example.grpc.smartoffices.AdjustLightBrightnessRequest.class,
      responseType = com.example.grpc.smartoffices.AdjustLightBrightnessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustLightBrightnessRequest,
      com.example.grpc.smartoffices.AdjustLightBrightnessResponse> getAdjustLightBrightnessMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustLightBrightnessRequest, com.example.grpc.smartoffices.AdjustLightBrightnessResponse> getAdjustLightBrightnessMethod;
    if ((getAdjustLightBrightnessMethod = SmartLightServiceGrpc.getAdjustLightBrightnessMethod) == null) {
      synchronized (SmartLightServiceGrpc.class) {
        if ((getAdjustLightBrightnessMethod = SmartLightServiceGrpc.getAdjustLightBrightnessMethod) == null) {
          SmartLightServiceGrpc.getAdjustLightBrightnessMethod = getAdjustLightBrightnessMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.AdjustLightBrightnessRequest, com.example.grpc.smartoffices.AdjustLightBrightnessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustLightBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.AdjustLightBrightnessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.AdjustLightBrightnessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightServiceMethodDescriptorSupplier("AdjustLightBrightness"))
              .build();
        }
      }
    }
    return getAdjustLightBrightnessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartLightServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightServiceStub>() {
        @java.lang.Override
        public SmartLightServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightServiceStub(channel, callOptions);
        }
      };
    return SmartLightServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartLightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightServiceBlockingStub>() {
        @java.lang.Override
        public SmartLightServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartLightServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartLightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightServiceFutureStub>() {
        @java.lang.Override
        public SmartLightServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightServiceFutureStub(channel, callOptions);
        }
      };
    return SmartLightServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Smart Light Service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simple RPC to turn on the light
     * </pre>
     */
    default void turnOnLight(com.example.grpc.smartoffices.TurnOnLightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOnLightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOnLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC to turn off the light
     * </pre>
     */
    default void turnOffLight(com.example.grpc.smartoffices.TurnOffLightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOffLightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOffLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the light status
     * </pre>
     */
    default void getLightStatus(com.example.grpc.smartoffices.GetLightStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetLightStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLightStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set the light status
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetLightStatusRequest> setLightStatus(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetLightStatusResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetLightStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to adjust the light brightness
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustLightBrightnessRequest> adjustLightBrightness(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustLightBrightnessResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAdjustLightBrightnessMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartLightService.
   * <pre>
   * Smart Light Service
   * </pre>
   */
  public static abstract class SmartLightServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartLightServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartLightService.
   * <pre>
   * Smart Light Service
   * </pre>
   */
  public static final class SmartLightServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SmartLightServiceStub> {
    private SmartLightServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to turn on the light
     * </pre>
     */
    public void turnOnLight(com.example.grpc.smartoffices.TurnOnLightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOnLightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOnLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC to turn off the light
     * </pre>
     */
    public void turnOffLight(com.example.grpc.smartoffices.TurnOffLightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOffLightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOffLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the light status
     * </pre>
     */
    public void getLightStatus(com.example.grpc.smartoffices.GetLightStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetLightStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetLightStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set the light status
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetLightStatusRequest> setLightStatus(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetLightStatusResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetLightStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to adjust the light brightness
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustLightBrightnessRequest> adjustLightBrightness(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustLightBrightnessResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAdjustLightBrightnessMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartLightService.
   * <pre>
   * Smart Light Service
   * </pre>
   */
  public static final class SmartLightServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartLightServiceBlockingStub> {
    private SmartLightServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to turn on the light
     * </pre>
     */
    public com.example.grpc.smartoffices.TurnOnLightResponse turnOnLight(com.example.grpc.smartoffices.TurnOnLightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC to turn off the light
     * </pre>
     */
    public com.example.grpc.smartoffices.TurnOffLightResponse turnOffLight(com.example.grpc.smartoffices.TurnOffLightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the light status
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.smartoffices.GetLightStatusResponse> getLightStatus(
        com.example.grpc.smartoffices.GetLightStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetLightStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartLightService.
   * <pre>
   * Smart Light Service
   * </pre>
   */
  public static final class SmartLightServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartLightServiceFutureStub> {
    private SmartLightServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to turn on the light
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.TurnOnLightResponse> turnOnLight(
        com.example.grpc.smartoffices.TurnOnLightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOnLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC to turn off the light
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.TurnOffLightResponse> turnOffLight(
        com.example.grpc.smartoffices.TurnOffLightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOffLightMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_LIGHT = 0;
  private static final int METHODID_TURN_OFF_LIGHT = 1;
  private static final int METHODID_GET_LIGHT_STATUS = 2;
  private static final int METHODID_SET_LIGHT_STATUS = 3;
  private static final int METHODID_ADJUST_LIGHT_BRIGHTNESS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_LIGHT:
          serviceImpl.turnOnLight((com.example.grpc.smartoffices.TurnOnLightRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOnLightResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_LIGHT:
          serviceImpl.turnOffLight((com.example.grpc.smartoffices.TurnOffLightRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOffLightResponse>) responseObserver);
          break;
        case METHODID_GET_LIGHT_STATUS:
          serviceImpl.getLightStatus((com.example.grpc.smartoffices.GetLightStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetLightStatusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_LIGHT_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setLightStatus(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetLightStatusResponse>) responseObserver);
        case METHODID_ADJUST_LIGHT_BRIGHTNESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustLightBrightness(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustLightBrightnessResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTurnOnLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.TurnOnLightRequest,
              com.example.grpc.smartoffices.TurnOnLightResponse>(
                service, METHODID_TURN_ON_LIGHT)))
        .addMethod(
          getTurnOffLightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.TurnOffLightRequest,
              com.example.grpc.smartoffices.TurnOffLightResponse>(
                service, METHODID_TURN_OFF_LIGHT)))
        .addMethod(
          getGetLightStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.GetLightStatusRequest,
              com.example.grpc.smartoffices.GetLightStatusResponse>(
                service, METHODID_GET_LIGHT_STATUS)))
        .addMethod(
          getSetLightStatusMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.SetLightStatusRequest,
              com.example.grpc.smartoffices.SetLightStatusResponse>(
                service, METHODID_SET_LIGHT_STATUS)))
        .addMethod(
          getAdjustLightBrightnessMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.AdjustLightBrightnessRequest,
              com.example.grpc.smartoffices.AdjustLightBrightnessResponse>(
                service, METHODID_ADJUST_LIGHT_BRIGHTNESS)))
        .build();
  }

  private static abstract class SmartLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartLightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.smartoffices.SmartLightServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartLightService");
    }
  }

  private static final class SmartLightServiceFileDescriptorSupplier
      extends SmartLightServiceBaseDescriptorSupplier {
    SmartLightServiceFileDescriptorSupplier() {}
  }

  private static final class SmartLightServiceMethodDescriptorSupplier
      extends SmartLightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartLightServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmartLightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartLightServiceFileDescriptorSupplier())
              .addMethod(getTurnOnLightMethod())
              .addMethod(getTurnOffLightMethod())
              .addMethod(getGetLightStatusMethod())
              .addMethod(getSetLightStatusMethod())
              .addMethod(getAdjustLightBrightnessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
