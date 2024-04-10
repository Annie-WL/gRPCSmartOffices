package com.example.grpc.smartoffices.window;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for controlling smart window systems.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: SmartWindow.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartWindowGrpc {

  private SmartWindowGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartWindow";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getOpenWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenWindow",
      requestType = com.example.grpc.smartoffices.window.WindowRequest.class,
      responseType = com.example.grpc.smartoffices.window.WindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getOpenWindowMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse> getOpenWindowMethod;
    if ((getOpenWindowMethod = SmartWindowGrpc.getOpenWindowMethod) == null) {
      synchronized (SmartWindowGrpc.class) {
        if ((getOpenWindowMethod = SmartWindowGrpc.getOpenWindowMethod) == null) {
          SmartWindowGrpc.getOpenWindowMethod = getOpenWindowMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowMethodDescriptorSupplier("OpenWindow"))
              .build();
        }
      }
    }
    return getOpenWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getCloseWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseWindow",
      requestType = com.example.grpc.smartoffices.window.WindowRequest.class,
      responseType = com.example.grpc.smartoffices.window.WindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getCloseWindowMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse> getCloseWindowMethod;
    if ((getCloseWindowMethod = SmartWindowGrpc.getCloseWindowMethod) == null) {
      synchronized (SmartWindowGrpc.class) {
        if ((getCloseWindowMethod = SmartWindowGrpc.getCloseWindowMethod) == null) {
          SmartWindowGrpc.getCloseWindowMethod = getCloseWindowMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowMethodDescriptorSupplier("CloseWindow"))
              .build();
        }
      }
    }
    return getCloseWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getTintLighterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TintLighter",
      requestType = com.example.grpc.smartoffices.window.WindowRequest.class,
      responseType = com.example.grpc.smartoffices.window.WindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getTintLighterMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse> getTintLighterMethod;
    if ((getTintLighterMethod = SmartWindowGrpc.getTintLighterMethod) == null) {
      synchronized (SmartWindowGrpc.class) {
        if ((getTintLighterMethod = SmartWindowGrpc.getTintLighterMethod) == null) {
          SmartWindowGrpc.getTintLighterMethod = getTintLighterMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TintLighter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowMethodDescriptorSupplier("TintLighter"))
              .build();
        }
      }
    }
    return getTintLighterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getTintDarkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TintDarker",
      requestType = com.example.grpc.smartoffices.window.WindowRequest.class,
      responseType = com.example.grpc.smartoffices.window.WindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getTintDarkerMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse> getTintDarkerMethod;
    if ((getTintDarkerMethod = SmartWindowGrpc.getTintDarkerMethod) == null) {
      synchronized (SmartWindowGrpc.class) {
        if ((getTintDarkerMethod = SmartWindowGrpc.getTintDarkerMethod) == null) {
          SmartWindowGrpc.getTintDarkerMethod = getTintDarkerMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.window.WindowRequest, com.example.grpc.smartoffices.window.WindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TintDarker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowMethodDescriptorSupplier("TintDarker"))
              .build();
        }
      }
    }
    return getTintDarkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowControlRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getInteractiveWindowControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InteractiveWindowControl",
      requestType = com.example.grpc.smartoffices.window.WindowControlRequest.class,
      responseType = com.example.grpc.smartoffices.window.WindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowControlRequest,
      com.example.grpc.smartoffices.window.WindowResponse> getInteractiveWindowControlMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.window.WindowControlRequest, com.example.grpc.smartoffices.window.WindowResponse> getInteractiveWindowControlMethod;
    if ((getInteractiveWindowControlMethod = SmartWindowGrpc.getInteractiveWindowControlMethod) == null) {
      synchronized (SmartWindowGrpc.class) {
        if ((getInteractiveWindowControlMethod = SmartWindowGrpc.getInteractiveWindowControlMethod) == null) {
          SmartWindowGrpc.getInteractiveWindowControlMethod = getInteractiveWindowControlMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.window.WindowControlRequest, com.example.grpc.smartoffices.window.WindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InteractiveWindowControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.window.WindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowMethodDescriptorSupplier("InteractiveWindowControl"))
              .build();
        }
      }
    }
    return getInteractiveWindowControlMethod;
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
   * <pre>
   * Service for controlling smart window systems.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simple RPC: Open windows
     * </pre>
     */
    default void openWindow(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Close windows
     * </pre>
     */
    default void closeWindow(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint lighter
     * </pre>
     */
    default void tintLighter(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTintLighterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint darker
     * </pre>
     */
    default void tintDarker(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTintDarkerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC: Interactive window control based on environmental data
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowControlRequest> interactiveWindowControl(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getInteractiveWindowControlMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartWindow.
   * <pre>
   * Service for controlling smart window systems.
   * </pre>
   */
  public static abstract class SmartWindowImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartWindowGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartWindow.
   * <pre>
   * Service for controlling smart window systems.
   * </pre>
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
     * Simple RPC: Open windows
     * </pre>
     */
    public void openWindow(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Close windows
     * </pre>
     */
    public void closeWindow(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint lighter
     * </pre>
     */
    public void tintLighter(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTintLighterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint darker
     * </pre>
     */
    public void tintDarker(com.example.grpc.smartoffices.window.WindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTintDarkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC: Interactive window control based on environmental data
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowControlRequest> interactiveWindowControl(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getInteractiveWindowControlMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartWindow.
   * <pre>
   * Service for controlling smart window systems.
   * </pre>
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

    /**
     * <pre>
     * Simple RPC: Open windows
     * </pre>
     */
    public com.example.grpc.smartoffices.window.WindowResponse openWindow(com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Close windows
     * </pre>
     */
    public com.example.grpc.smartoffices.window.WindowResponse closeWindow(com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint lighter
     * </pre>
     */
    public com.example.grpc.smartoffices.window.WindowResponse tintLighter(com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTintLighterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint darker
     * </pre>
     */
    public com.example.grpc.smartoffices.window.WindowResponse tintDarker(com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTintDarkerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartWindow.
   * <pre>
   * Service for controlling smart window systems.
   * </pre>
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

    /**
     * <pre>
     * Simple RPC: Open windows
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.window.WindowResponse> openWindow(
        com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenWindowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Close windows
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.window.WindowResponse> closeWindow(
        com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseWindowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint lighter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.window.WindowResponse> tintLighter(
        com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTintLighterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Make window tint darker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.window.WindowResponse> tintDarker(
        com.example.grpc.smartoffices.window.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTintDarkerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_WINDOW = 0;
  private static final int METHODID_CLOSE_WINDOW = 1;
  private static final int METHODID_TINT_LIGHTER = 2;
  private static final int METHODID_TINT_DARKER = 3;
  private static final int METHODID_INTERACTIVE_WINDOW_CONTROL = 4;

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
        case METHODID_OPEN_WINDOW:
          serviceImpl.openWindow((com.example.grpc.smartoffices.window.WindowRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse>) responseObserver);
          break;
        case METHODID_CLOSE_WINDOW:
          serviceImpl.closeWindow((com.example.grpc.smartoffices.window.WindowRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse>) responseObserver);
          break;
        case METHODID_TINT_LIGHTER:
          serviceImpl.tintLighter((com.example.grpc.smartoffices.window.WindowRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse>) responseObserver);
          break;
        case METHODID_TINT_DARKER:
          serviceImpl.tintDarker((com.example.grpc.smartoffices.window.WindowRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse>) responseObserver);
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
        case METHODID_INTERACTIVE_WINDOW_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.interactiveWindowControl(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.window.WindowResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getOpenWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.window.WindowRequest,
              com.example.grpc.smartoffices.window.WindowResponse>(
                service, METHODID_OPEN_WINDOW)))
        .addMethod(
          getCloseWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.window.WindowRequest,
              com.example.grpc.smartoffices.window.WindowResponse>(
                service, METHODID_CLOSE_WINDOW)))
        .addMethod(
          getTintLighterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.window.WindowRequest,
              com.example.grpc.smartoffices.window.WindowResponse>(
                service, METHODID_TINT_LIGHTER)))
        .addMethod(
          getTintDarkerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.window.WindowRequest,
              com.example.grpc.smartoffices.window.WindowResponse>(
                service, METHODID_TINT_DARKER)))
        .addMethod(
          getInteractiveWindowControlMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.window.WindowControlRequest,
              com.example.grpc.smartoffices.window.WindowResponse>(
                service, METHODID_INTERACTIVE_WINDOW_CONTROL)))
        .build();
  }

  private static abstract class SmartWindowBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartWindowBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.smartoffices.window.SmartWindowServiceImpl.getDescriptor();
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
              .addMethod(getOpenWindowMethod())
              .addMethod(getCloseWindowMethod())
              .addMethod(getTintLighterMethod())
              .addMethod(getTintDarkerMethod())
              .addMethod(getInteractiveWindowControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
