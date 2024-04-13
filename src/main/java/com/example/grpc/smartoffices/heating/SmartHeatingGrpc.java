package com.example.grpc.smartoffices.heating;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartHeating.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartHeatingGrpc {

  private SmartHeatingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartHeating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.HeatingRequest,
      com.example.grpc.smartoffices.heating.HeatingResponse> getUpdateSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSettings",
      requestType = com.example.grpc.smartoffices.heating.HeatingRequest.class,
      responseType = com.example.grpc.smartoffices.heating.HeatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.HeatingRequest,
      com.example.grpc.smartoffices.heating.HeatingResponse> getUpdateSettingsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.HeatingRequest, com.example.grpc.smartoffices.heating.HeatingResponse> getUpdateSettingsMethod;
    if ((getUpdateSettingsMethod = SmartHeatingGrpc.getUpdateSettingsMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getUpdateSettingsMethod = SmartHeatingGrpc.getUpdateSettingsMethod) == null) {
          SmartHeatingGrpc.getUpdateSettingsMethod = getUpdateSettingsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.heating.HeatingRequest, com.example.grpc.smartoffices.heating.HeatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.HeatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.HeatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("UpdateSettings"))
              .build();
        }
      }
    }
    return getUpdateSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.HeatingRequest,
      com.example.grpc.smartoffices.heating.HeatingResponse> getMonitorTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorTemperature",
      requestType = com.example.grpc.smartoffices.heating.HeatingRequest.class,
      responseType = com.example.grpc.smartoffices.heating.HeatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.HeatingRequest,
      com.example.grpc.smartoffices.heating.HeatingResponse> getMonitorTemperatureMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.HeatingRequest, com.example.grpc.smartoffices.heating.HeatingResponse> getMonitorTemperatureMethod;
    if ((getMonitorTemperatureMethod = SmartHeatingGrpc.getMonitorTemperatureMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getMonitorTemperatureMethod = SmartHeatingGrpc.getMonitorTemperatureMethod) == null) {
          SmartHeatingGrpc.getMonitorTemperatureMethod = getMonitorTemperatureMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.heating.HeatingRequest, com.example.grpc.smartoffices.heating.HeatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.HeatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.HeatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("MonitorTemperature"))
              .build();
        }
      }
    }
    return getMonitorTemperatureMethod;
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
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simple RPC: A single request-response for updating settings.
     * </pre>
     */
    default void updateSettings(com.example.grpc.smartoffices.heating.HeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.HeatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC: Client sends a request, server responds with a stream of updates.
     * </pre>
     */
    default void monitorTemperature(com.example.grpc.smartoffices.heating.HeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.HeatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMonitorTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartHeating.
   */
  public static abstract class SmartHeatingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartHeatingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartHeating.
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
     * Simple RPC: A single request-response for updating settings.
     * </pre>
     */
    public void updateSettings(com.example.grpc.smartoffices.heating.HeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.HeatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC: Client sends a request, server responds with a stream of updates.
     * </pre>
     */
    public void monitorTemperature(com.example.grpc.smartoffices.heating.HeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.HeatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMonitorTemperatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartHeating.
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
     * Simple RPC: A single request-response for updating settings.
     * </pre>
     */
    public com.example.grpc.smartoffices.heating.HeatingResponse updateSettings(com.example.grpc.smartoffices.heating.HeatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side streaming RPC: Client sends a request, server responds with a stream of updates.
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.smartoffices.heating.HeatingResponse> monitorTemperature(
        com.example.grpc.smartoffices.heating.HeatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMonitorTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartHeating.
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
     * Simple RPC: A single request-response for updating settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.heating.HeatingResponse> updateSettings(
        com.example.grpc.smartoffices.heating.HeatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_SETTINGS = 0;
  private static final int METHODID_MONITOR_TEMPERATURE = 1;

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
        case METHODID_UPDATE_SETTINGS:
          serviceImpl.updateSettings((com.example.grpc.smartoffices.heating.HeatingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.HeatingResponse>) responseObserver);
          break;
        case METHODID_MONITOR_TEMPERATURE:
          serviceImpl.monitorTemperature((com.example.grpc.smartoffices.heating.HeatingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.HeatingResponse>) responseObserver);
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
          getUpdateSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.heating.HeatingRequest,
              com.example.grpc.smartoffices.heating.HeatingResponse>(
                service, METHODID_UPDATE_SETTINGS)))
        .addMethod(
          getMonitorTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.heating.HeatingRequest,
              com.example.grpc.smartoffices.heating.HeatingResponse>(
                service, METHODID_MONITOR_TEMPERATURE)))
        .build();
  }

  private static abstract class SmartHeatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartHeatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.smartoffices.heating.SmartHeatingServiceImpl.getDescriptor();
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
              .addMethod(getUpdateSettingsMethod())
              .addMethod(getMonitorTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
