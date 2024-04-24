package com.project.grpc.smartoffices.window;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartWindow.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartWindowGrpc {

  private SmartWindowGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartWindow";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.grpc.smartoffices.window.WindowRequest,
      com.project.grpc.smartoffices.window.WindowResponse> getControlWindowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlWindows",
      requestType = com.project.grpc.smartoffices.window.WindowRequest.class,
      responseType = com.project.grpc.smartoffices.window.WindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.project.grpc.smartoffices.window.WindowRequest,
      com.project.grpc.smartoffices.window.WindowResponse> getControlWindowsMethod() {
    io.grpc.MethodDescriptor<com.project.grpc.smartoffices.window.WindowRequest, com.project.grpc.smartoffices.window.WindowResponse> getControlWindowsMethod;
    if ((getControlWindowsMethod = SmartWindowGrpc.getControlWindowsMethod) == null) {
      synchronized (SmartWindowGrpc.class) {
        if ((getControlWindowsMethod = SmartWindowGrpc.getControlWindowsMethod) == null) {
          SmartWindowGrpc.getControlWindowsMethod = getControlWindowsMethod =
              io.grpc.MethodDescriptor.<com.project.grpc.smartoffices.window.WindowRequest, com.project.grpc.smartoffices.window.WindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlWindows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.window.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.grpc.smartoffices.window.WindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowMethodDescriptorSupplier("ControlWindows"))
              .build();
        }
      }
    }
    return getControlWindowsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartWindowStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartWindowStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartWindowStub>() {
        @java.lang.Override
        public SmartWindowStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartWindowStub(channel, callOptions);
        }
      };
    return SmartWindowStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartWindowBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartWindowBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartWindowBlockingStub>() {
        @java.lang.Override
        public SmartWindowBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartWindowBlockingStub(channel, callOptions);
        }
      };
    return SmartWindowBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartWindowFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartWindowFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartWindowFutureStub>() {
        @java.lang.Override
        public SmartWindowFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartWindowFutureStub(channel, callOptions);
        }
      };
    return SmartWindowFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Bidirectional streaming RPC: Both client and server send and receive a stream of messages concurrently.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.window.WindowRequest> controlWindows(
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.window.WindowResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getControlWindowsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartWindow.
   */
  public static abstract class SmartWindowImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartWindowGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartWindow.
   */
  public static final class SmartWindowStub
      extends io.grpc.stub.AbstractAsyncStub<SmartWindowStub> {
    private SmartWindowStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWindowStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartWindowStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC: Both client and server send and receive a stream of messages concurrently.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.window.WindowRequest> controlWindows(
        io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.window.WindowResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getControlWindowsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartWindow.
   */
  public static final class SmartWindowBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartWindowBlockingStub> {
    private SmartWindowBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWindowBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartWindowBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartWindow.
   */
  public static final class SmartWindowFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartWindowFutureStub> {
    private SmartWindowFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWindowFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartWindowFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONTROL_WINDOWS = 0;

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
        case METHODID_CONTROL_WINDOWS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlWindows(
              (io.grpc.stub.StreamObserver<com.project.grpc.smartoffices.window.WindowResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getControlWindowsMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.project.grpc.smartoffices.window.WindowRequest,
              com.project.grpc.smartoffices.window.WindowResponse>(
                service, METHODID_CONTROL_WINDOWS)))
        .build();
  }

  private static abstract class SmartWindowBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartWindowBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.grpc.smartoffices.window.SmartWindowServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartWindow");
    }
  }

  private static final class SmartWindowFileDescriptorSupplier
      extends SmartWindowBaseDescriptorSupplier {
    SmartWindowFileDescriptorSupplier() {}
  }

  private static final class SmartWindowMethodDescriptorSupplier
      extends SmartWindowBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartWindowMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartWindowGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartWindowFileDescriptorSupplier())
              .addMethod(getControlWindowsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
