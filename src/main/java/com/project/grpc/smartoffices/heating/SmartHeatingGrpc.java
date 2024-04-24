package com.project.grpc.smartoffices.heating;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The SmartHeating service provides operations for controlling and monitoring heating
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartHeating.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartHeatingGrpc {

  private SmartHeatingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartHeating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest,
      com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse> getAdjustHeatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustHeating",
      requestType = com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest.class,
      responseType = com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest,
      com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse> getAdjustHeatingMethod() {
    io.grpc.MethodDescriptor<com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest, com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse> getAdjustHeatingMethod;
    if ((getAdjustHeatingMethod = SmartHeatingGrpc.getAdjustHeatingMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getAdjustHeatingMethod = SmartHeatingGrpc.getAdjustHeatingMethod) == null) {
          SmartHeatingGrpc.getAdjustHeatingMethod = getAdjustHeatingMethod =
              io.grpc.MethodDescriptor.<com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest, com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustHeating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("AdjustHeating"))
              .build();
        }
      }
    }
    return getAdjustHeatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.grpc.smartoffices.heating.TemperatureStreamRequest,
      com.project.grpc.smartoffices.heating.TemperatureStreamResponse> getStreamTemperatureUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTemperatureUpdates",
      requestType = com.project.grpc.smartoffices.heating.TemperatureStreamRequest.class,
      responseType = com.project.grpc.smartoffices.heating.TemperatureStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.project.grpc.smartoffices.heating.TemperatureStreamRequest,
      com.project.grpc.smartoffices.heating.TemperatureStreamResponse> getStreamTemperatureUpdatesMethod() {
    io.grpc.MethodDescriptor<com.project.grpc.smartoffices.heating.TemperatureStreamRequest, com.project.grpc.smartoffices.heating.TemperatureStreamResponse> getStreamTemperatureUpdatesMethod;
    if ((getStreamTemperatureUpdatesMethod = SmartHeatingGrpc.getStreamTemperatureUpdatesMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getStreamTemperatureUpdatesMethod = SmartHeatingGrpc.getStreamTemperatureUpdatesMethod) == null) {
          SmartHeatingGrpc.getStreamTemperatureUpdatesMethod = getStreamTemperatureUpdatesMethod =
              io.grpc.MethodDescriptor.<com.project.grpc.smartoffices.heating.TemperatureStreamRequest, com.project.grpc.smartoffices.heating.TemperatureStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTemperatureUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.heating.TemperatureStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.heating.TemperatureStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("StreamTemperatureUpdates"))
              .build();
        }
      }
    }
    return getStreamTemperatureUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartHeatingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartHeatingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartHeatingStub>() {
        @java.lang.Override
        public SmartHeatingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartHeatingStub(channel, callOptions);
        }
      };
    return SmartHeatingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartHeatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartHeatingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartHeatingBlockingStub>() {
        @java.lang.Override
        public SmartHeatingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartHeatingBlockingStub(channel, callOptions);
        }
      };
    return SmartHeatingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartHeatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartHeatingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartHeatingFutureStub>() {
        @java.lang.Override
        public SmartHeatingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartHeatingFutureStub(channel, callOptions);
        }
      };
    return SmartHeatingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The SmartHeating service provides operations for controlling and monitoring heating
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary RPC: Adjusts the heating based on the environmental sensor data.
     * </pre>
     */
    default void adjustHeating(com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest request,
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdjustHeatingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC: Client requests ongoing updates, server streams back temperature and heating status.
     * </pre>
     */
    default void streamTemperatureUpdates(com.project.grpc.smartoffices.heating.TemperatureStreamRequest request,
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.heating.TemperatureStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamTemperatureUpdatesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartHeating.
   * <pre>
   * The SmartHeating service provides operations for controlling and monitoring heating
   * </pre>
   */
  public static abstract class SmartHeatingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartHeatingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartHeating.
   * <pre>
   * The SmartHeating service provides operations for controlling and monitoring heating
   * </pre>
   */
  public static final class SmartHeatingStub
      extends io.grpc.stub.AbstractAsyncStub<SmartHeatingStub> {
    private SmartHeatingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartHeatingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartHeatingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Adjusts the heating based on the environmental sensor data.
     * </pre>
     */
    public void adjustHeating(com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest request,
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdjustHeatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC: Client requests ongoing updates, server streams back temperature and heating status.
     * </pre>
     */
    public void streamTemperatureUpdates(com.project.grpc.smartoffices.heating.TemperatureStreamRequest request,
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.heating.TemperatureStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamTemperatureUpdatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartHeating.
   * <pre>
   * The SmartHeating service provides operations for controlling and monitoring heating
   * </pre>
   */
  public static final class SmartHeatingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartHeatingBlockingStub> {
    private SmartHeatingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartHeatingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartHeatingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Adjusts the heating based on the environmental sensor data.
     * </pre>
     */
    public com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse adjustHeating(com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdjustHeatingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side streaming RPC: Client requests ongoing updates, server streams back temperature and heating status.
     * </pre>
     */
    public java.util.Iterator<com.project.grpc.smartoffices.heating.TemperatureStreamResponse> streamTemperatureUpdates(
        com.project.grpc.smartoffices.heating.TemperatureStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamTemperatureUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartHeating.
   * <pre>
   * The SmartHeating service provides operations for controlling and monitoring heating
   * </pre>
   */
  public static final class SmartHeatingFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartHeatingFutureStub> {
    private SmartHeatingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartHeatingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartHeatingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Adjusts the heating based on the environmental sensor data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse> adjustHeating(
        com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdjustHeatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADJUST_HEATING = 0;
  private static final int METHODID_STREAM_TEMPERATURE_UPDATES = 1;

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
        case METHODID_ADJUST_HEATING:
          serviceImpl.adjustHeating((com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest) request,
              (io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse>) responseObserver);
          break;
        case METHODID_STREAM_TEMPERATURE_UPDATES:
          serviceImpl.streamTemperatureUpdates((com.project.grpc.smartoffices.heating.TemperatureStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.heating.TemperatureStreamResponse>) responseObserver);
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
          getAdjustHeatingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.project.grpc.smartoffices.heating.HeatingAdjustmentRequest,
              com.project.grpc.smartoffices.heating.HeatingAdjustmentResponse>(
                service, METHODID_ADJUST_HEATING)))
        .addMethod(
          getStreamTemperatureUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.project.grpc.smartoffices.heating.TemperatureStreamRequest,
              com.project.grpc.smartoffices.heating.TemperatureStreamResponse>(
                service, METHODID_STREAM_TEMPERATURE_UPDATES)))
        .build();
  }

  private static abstract class SmartHeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartHeatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.grpc.smartoffices.heating.SmartHeatingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartHeating");
    }
  }

  private static final class SmartHeatingFileDescriptorSupplier
      extends SmartHeatingBaseDescriptorSupplier {
    SmartHeatingFileDescriptorSupplier() {}
  }

  private static final class SmartHeatingMethodDescriptorSupplier
      extends SmartHeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartHeatingMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartHeatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartHeatingFileDescriptorSupplier())
              .addMethod(getAdjustHeatingMethod())
              .addMethod(getStreamTemperatureUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
