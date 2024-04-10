package com.example.grpc.smartoffices.light;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for controlling smart light systems based on occupancy.
 * Service for controlling smart light systems.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartLights.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartLightsGrpc {

  private SmartLightsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartLights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOn",
      requestType = com.example.grpc.smartoffices.light.LightRequest.class,
      responseType = com.example.grpc.smartoffices.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getTurnOnMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse> getTurnOnMethod;
    if ((getTurnOnMethod = SmartLightsGrpc.getTurnOnMethod) == null) {
      synchronized (SmartLightsGrpc.class) {
        if ((getTurnOnMethod = SmartLightsGrpc.getTurnOnMethod) == null) {
          SmartLightsGrpc.getTurnOnMethod = getTurnOnMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightsMethodDescriptorSupplier("TurnOn"))
              .build();
        }
      }
    }
    return getTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOff",
      requestType = com.example.grpc.smartoffices.light.LightRequest.class,
      responseType = com.example.grpc.smartoffices.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getTurnOffMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse> getTurnOffMethod;
    if ((getTurnOffMethod = SmartLightsGrpc.getTurnOffMethod) == null) {
      synchronized (SmartLightsGrpc.class) {
        if ((getTurnOffMethod = SmartLightsGrpc.getTurnOffMethod) == null) {
          SmartLightsGrpc.getTurnOffMethod = getTurnOffMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightsMethodDescriptorSupplier("TurnOff"))
              .build();
        }
      }
    }
    return getTurnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getBrightnessUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrightnessUp",
      requestType = com.example.grpc.smartoffices.light.LightRequest.class,
      responseType = com.example.grpc.smartoffices.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getBrightnessUpMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse> getBrightnessUpMethod;
    if ((getBrightnessUpMethod = SmartLightsGrpc.getBrightnessUpMethod) == null) {
      synchronized (SmartLightsGrpc.class) {
        if ((getBrightnessUpMethod = SmartLightsGrpc.getBrightnessUpMethod) == null) {
          SmartLightsGrpc.getBrightnessUpMethod = getBrightnessUpMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrightnessUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightsMethodDescriptorSupplier("BrightnessUp"))
              .build();
        }
      }
    }
    return getBrightnessUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getBrightnessDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrightnessDown",
      requestType = com.example.grpc.smartoffices.light.LightRequest.class,
      responseType = com.example.grpc.smartoffices.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getBrightnessDownMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse> getBrightnessDownMethod;
    if ((getBrightnessDownMethod = SmartLightsGrpc.getBrightnessDownMethod) == null) {
      synchronized (SmartLightsGrpc.class) {
        if ((getBrightnessDownMethod = SmartLightsGrpc.getBrightnessDownMethod) == null) {
          SmartLightsGrpc.getBrightnessDownMethod = getBrightnessDownMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrightnessDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightsMethodDescriptorSupplier("BrightnessDown"))
              .build();
        }
      }
    }
    return getBrightnessDownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getStreamLightStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLightStatus",
      requestType = com.example.grpc.smartoffices.light.LightRequest.class,
      responseType = com.example.grpc.smartoffices.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest,
      com.example.grpc.smartoffices.light.LightResponse> getStreamLightStatusMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse> getStreamLightStatusMethod;
    if ((getStreamLightStatusMethod = SmartLightsGrpc.getStreamLightStatusMethod) == null) {
      synchronized (SmartLightsGrpc.class) {
        if ((getStreamLightStatusMethod = SmartLightsGrpc.getStreamLightStatusMethod) == null) {
          SmartLightsGrpc.getStreamLightStatusMethod = getStreamLightStatusMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.light.LightRequest, com.example.grpc.smartoffices.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLightStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightsMethodDescriptorSupplier("StreamLightStatus"))
              .build();
        }
      }
    }
    return getStreamLightStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartLightsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightsStub>() {
        @java.lang.Override
        public SmartLightsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightsStub(channel, callOptions);
        }
      };
    return SmartLightsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartLightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightsBlockingStub>() {
        @java.lang.Override
        public SmartLightsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightsBlockingStub(channel, callOptions);
        }
      };
    return SmartLightsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartLightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightsFutureStub>() {
        @java.lang.Override
        public SmartLightsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightsFutureStub(channel, callOptions);
        }
      };
    return SmartLightsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for controlling smart light systems based on occupancy.
   * Service for controlling smart light systems.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simple RPC: Turn lights on
     * </pre>
     */
    default void turnOn(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Turn lights off
     * </pre>
     */
    default void turnOff(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Increase brightness
     * </pre>
     */
    default void brightnessUp(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrightnessUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Decrease brightness
     * </pre>
     */
    default void brightnessDown(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrightnessDownMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC: Stream light status updates
     * </pre>
     */
    default void streamLightStatus(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamLightStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartLights.
   * <pre>
   * Service for controlling smart light systems based on occupancy.
   * Service for controlling smart light systems.
   * </pre>
   */
  public static abstract class SmartLightsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartLightsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartLights.
   * <pre>
   * Service for controlling smart light systems based on occupancy.
   * Service for controlling smart light systems.
   * </pre>
   */
  public static final class SmartLightsStub
      extends io.grpc.stub.AbstractAsyncStub<SmartLightsStub> {
    private SmartLightsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC: Turn lights on
     * </pre>
     */
    public void turnOn(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Turn lights off
     * </pre>
     */
    public void turnOff(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Increase brightness
     * </pre>
     */
    public void brightnessUp(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrightnessUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Decrease brightness
     * </pre>
     */
    public void brightnessDown(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrightnessDownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC: Stream light status updates
     * </pre>
     */
    public void streamLightStatus(com.example.grpc.smartoffices.light.LightRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamLightStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartLights.
   * <pre>
   * Service for controlling smart light systems based on occupancy.
   * Service for controlling smart light systems.
   * </pre>
   */
  public static final class SmartLightsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartLightsBlockingStub> {
    private SmartLightsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC: Turn lights on
     * </pre>
     */
    public com.example.grpc.smartoffices.light.LightResponse turnOn(com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Turn lights off
     * </pre>
     */
    public com.example.grpc.smartoffices.light.LightResponse turnOff(com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Increase brightness
     * </pre>
     */
    public com.example.grpc.smartoffices.light.LightResponse brightnessUp(com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrightnessUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Decrease brightness
     * </pre>
     */
    public com.example.grpc.smartoffices.light.LightResponse brightnessDown(com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrightnessDownMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side Streaming RPC: Stream light status updates
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.smartoffices.light.LightResponse> streamLightStatus(
        com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamLightStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartLights.
   * <pre>
   * Service for controlling smart light systems based on occupancy.
   * Service for controlling smart light systems.
   * </pre>
   */
  public static final class SmartLightsFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartLightsFutureStub> {
    private SmartLightsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC: Turn lights on
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.light.LightResponse> turnOn(
        com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Turn lights off
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.light.LightResponse> turnOff(
        com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Increase brightness
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.light.LightResponse> brightnessUp(
        com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrightnessUpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Decrease brightness
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.light.LightResponse> brightnessDown(
        com.example.grpc.smartoffices.light.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrightnessDownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON = 0;
  private static final int METHODID_TURN_OFF = 1;
  private static final int METHODID_BRIGHTNESS_UP = 2;
  private static final int METHODID_BRIGHTNESS_DOWN = 3;
  private static final int METHODID_STREAM_LIGHT_STATUS = 4;

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
        case METHODID_TURN_ON:
          serviceImpl.turnOn((com.example.grpc.smartoffices.light.LightRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF:
          serviceImpl.turnOff((com.example.grpc.smartoffices.light.LightRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse>) responseObserver);
          break;
        case METHODID_BRIGHTNESS_UP:
          serviceImpl.brightnessUp((com.example.grpc.smartoffices.light.LightRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse>) responseObserver);
          break;
        case METHODID_BRIGHTNESS_DOWN:
          serviceImpl.brightnessDown((com.example.grpc.smartoffices.light.LightRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse>) responseObserver);
          break;
        case METHODID_STREAM_LIGHT_STATUS:
          serviceImpl.streamLightStatus((com.example.grpc.smartoffices.light.LightRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTurnOnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.light.LightRequest,
              com.example.grpc.smartoffices.light.LightResponse>(
                service, METHODID_TURN_ON)))
        .addMethod(
          getTurnOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.light.LightRequest,
              com.example.grpc.smartoffices.light.LightResponse>(
                service, METHODID_TURN_OFF)))
        .addMethod(
          getBrightnessUpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.light.LightRequest,
              com.example.grpc.smartoffices.light.LightResponse>(
                service, METHODID_BRIGHTNESS_UP)))
        .addMethod(
          getBrightnessDownMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.light.LightRequest,
              com.example.grpc.smartoffices.light.LightResponse>(
                service, METHODID_BRIGHTNESS_DOWN)))
        .addMethod(
          getStreamLightStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.light.LightRequest,
              com.example.grpc.smartoffices.light.LightResponse>(
                service, METHODID_STREAM_LIGHT_STATUS)))
        .build();
  }

  private static abstract class SmartLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartLightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.smartoffices.light.SmartLightServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartLights");
    }
  }

  private static final class SmartLightsFileDescriptorSupplier
      extends SmartLightsBaseDescriptorSupplier {
    SmartLightsFileDescriptorSupplier() {}
  }

  private static final class SmartLightsMethodDescriptorSupplier
      extends SmartLightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartLightsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartLightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartLightsFileDescriptorSupplier())
              .addMethod(getTurnOnMethod())
              .addMethod(getTurnOffMethod())
              .addMethod(getBrightnessUpMethod())
              .addMethod(getBrightnessDownMethod())
              .addMethod(getStreamLightStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
