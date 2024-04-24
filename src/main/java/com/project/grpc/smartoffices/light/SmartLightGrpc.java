package com.project.grpc.smartoffices.light;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartLight.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartLightGrpc {

  private SmartLightGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartLight";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.grpc.smartoffices.light.LightRequest,
      com.project.grpc.smartoffices.light.LightResponse> getControlLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlLights",
      requestType = com.project.grpc.smartoffices.light.LightRequest.class,
      responseType = com.project.grpc.smartoffices.light.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.project.grpc.smartoffices.light.LightRequest,
      com.project.grpc.smartoffices.light.LightResponse> getControlLightsMethod() {
    io.grpc.MethodDescriptor<com.project.grpc.smartoffices.light.LightRequest, com.project.grpc.smartoffices.light.LightResponse> getControlLightsMethod;
    if ((getControlLightsMethod = SmartLightGrpc.getControlLightsMethod) == null) {
      synchronized (SmartLightGrpc.class) {
        if ((getControlLightsMethod = SmartLightGrpc.getControlLightsMethod) == null) {
          SmartLightGrpc.getControlLightsMethod = getControlLightsMethod =
              io.grpc.MethodDescriptor.<com.project.grpc.smartoffices.light.LightRequest, com.project.grpc.smartoffices.light.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.light.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.light.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLightMethodDescriptorSupplier("ControlLights"))
              .build();
        }
      }
    }
    return getControlLightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartLightStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightStub>() {
        @java.lang.Override
        public SmartLightStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightStub(channel, callOptions);
        }
      };
    return SmartLightStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartLightBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightBlockingStub>() {
        @java.lang.Override
        public SmartLightBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightBlockingStub(channel, callOptions);
        }
      };
    return SmartLightBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartLightFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLightFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLightFutureStub>() {
        @java.lang.Override
        public SmartLightFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLightFutureStub(channel, callOptions);
        }
      };
    return SmartLightFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Client-side streaming RPC:
     * Client sends a stream of occupancy data, server responds once after processing all the data.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.light.LightRequest> controlLights(
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.light.LightResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getControlLightsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartLight.
   */
  public static abstract class SmartLightImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartLightGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartLight.
   */
  public static final class SmartLightStub
      extends io.grpc.stub.AbstractAsyncStub<SmartLightStub> {
    private SmartLightStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client-side streaming RPC:
     * Client sends a stream of occupancy data, server responds once after processing all the data.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.light.LightRequest> controlLights(
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.light.LightResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getControlLightsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartLight.
   */
  public static final class SmartLightBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartLightBlockingStub> {
    private SmartLightBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartLight.
   */
  public static final class SmartLightFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartLightFutureStub> {
    private SmartLightFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLightFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLightFutureStub(channel, callOptions);
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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTROL_LIGHTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlLights(
              (io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.light.LightResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getControlLightsMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.project.grpc.smartoffices.light.LightRequest,
              com.project.grpc.smartoffices.light.LightResponse>(
                service, METHODID_CONTROL_LIGHTS)))
        .build();
  }

  private static abstract class SmartLightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartLightBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.grpc.smartoffices.light.SmartLightServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartLight");
    }
  }

  private static final class SmartLightFileDescriptorSupplier
      extends SmartLightBaseDescriptorSupplier {
    SmartLightFileDescriptorSupplier() {}
  }

  private static final class SmartLightMethodDescriptorSupplier
      extends SmartLightBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartLightMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartLightGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartLightFileDescriptorSupplier())
              .addMethod(getControlLightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
