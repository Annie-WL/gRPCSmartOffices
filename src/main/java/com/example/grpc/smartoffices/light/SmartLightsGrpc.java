package com.example.grpc.smartoffices.light;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for controlling smart light systems based on occupancy.
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
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.OccupancyRequest,
      com.example.grpc.smartoffices.light.LightResponse> getControlLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlLights",
      requestType = com.example.grpc.smartoffices.light.OccupancyRequest.class,
      responseType = com.example.grpc.smartoffices.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.OccupancyRequest,
      com.example.grpc.smartoffices.light.LightResponse> getControlLightsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.light.OccupancyRequest, com.example.grpc.smartoffices.light.LightResponse> getControlLightsMethod;
    if ((getControlLightsMethod = SmartLightsGrpc.getControlLightsMethod) == null) {
      synchronized (SmartLightsGrpc.class) {
        if ((getControlLightsMethod = SmartLightsGrpc.getControlLightsMethod) == null) {
          SmartLightsGrpc.getControlLightsMethod = getControlLightsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.light.OccupancyRequest, com.example.grpc.smartoffices.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.OccupancyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightsMethodDescriptorSupplier("ControlLights"))
              .build();
        }
      }
    }
    return getControlLightsMethod;
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
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simple RPC: Immediate light control based on room occupancy.
     * </pre>
     */
    default void controlLights(com.example.grpc.smartoffices.light.OccupancyRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getControlLightsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartLights.
   * <pre>
   * Service for controlling smart light systems based on occupancy.
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
     * Simple RPC: Immediate light control based on room occupancy.
     * </pre>
     */
    public void controlLights(com.example.grpc.smartoffices.light.OccupancyRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.light.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getControlLightsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartLights.
   * <pre>
   * Service for controlling smart light systems based on occupancy.
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
     * Simple RPC: Immediate light control based on room occupancy.
     * </pre>
     */
    public com.example.grpc.smartoffices.light.LightResponse controlLights(com.example.grpc.smartoffices.light.OccupancyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getControlLightsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartLights.
   * <pre>
   * Service for controlling smart light systems based on occupancy.
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
     * Simple RPC: Immediate light control based on room occupancy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.light.LightResponse> controlLights(
        com.example.grpc.smartoffices.light.OccupancyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getControlLightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTROL_LIGHTS = 0;

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
        case METHODID_CONTROL_LIGHTS:
          serviceImpl.controlLights((com.example.grpc.smartoffices.light.OccupancyRequest) request,
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
          getControlLightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.light.OccupancyRequest,
              com.example.grpc.smartoffices.light.LightResponse>(
                service, METHODID_CONTROL_LIGHTS)))
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
              .addMethod(getControlLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
