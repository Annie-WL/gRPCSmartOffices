package com.example.grpc.smartoffices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Smart Window Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: smartwindow.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartWindowServiceGrpc {

  private SmartWindowServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartWindowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.OpenWindowRequest,
      com.example.grpc.smartoffices.OpenWindowResponse> getOpenWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenWindow",
      requestType = com.example.grpc.smartoffices.OpenWindowRequest.class,
      responseType = com.example.grpc.smartoffices.OpenWindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.OpenWindowRequest,
      com.example.grpc.smartoffices.OpenWindowResponse> getOpenWindowMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.OpenWindowRequest, com.example.grpc.smartoffices.OpenWindowResponse> getOpenWindowMethod;
    if ((getOpenWindowMethod = SmartWindowServiceGrpc.getOpenWindowMethod) == null) {
      synchronized (SmartWindowServiceGrpc.class) {
        if ((getOpenWindowMethod = SmartWindowServiceGrpc.getOpenWindowMethod) == null) {
          SmartWindowServiceGrpc.getOpenWindowMethod = getOpenWindowMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.OpenWindowRequest, com.example.grpc.smartoffices.OpenWindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.OpenWindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.OpenWindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowServiceMethodDescriptorSupplier("OpenWindow"))
              .build();
        }
      }
    }
    return getOpenWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.CloseWindowRequest,
      com.example.grpc.smartoffices.CloseWindowResponse> getCloseWindowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseWindow",
      requestType = com.example.grpc.smartoffices.CloseWindowRequest.class,
      responseType = com.example.grpc.smartoffices.CloseWindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.CloseWindowRequest,
      com.example.grpc.smartoffices.CloseWindowResponse> getCloseWindowMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.CloseWindowRequest, com.example.grpc.smartoffices.CloseWindowResponse> getCloseWindowMethod;
    if ((getCloseWindowMethod = SmartWindowServiceGrpc.getCloseWindowMethod) == null) {
      synchronized (SmartWindowServiceGrpc.class) {
        if ((getCloseWindowMethod = SmartWindowServiceGrpc.getCloseWindowMethod) == null) {
          SmartWindowServiceGrpc.getCloseWindowMethod = getCloseWindowMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.CloseWindowRequest, com.example.grpc.smartoffices.CloseWindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseWindow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.CloseWindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.CloseWindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowServiceMethodDescriptorSupplier("CloseWindow"))
              .build();
        }
      }
    }
    return getCloseWindowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetWindowStatusRequest,
      com.example.grpc.smartoffices.GetWindowStatusResponse> getGetWindowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWindowStatus",
      requestType = com.example.grpc.smartoffices.GetWindowStatusRequest.class,
      responseType = com.example.grpc.smartoffices.GetWindowStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetWindowStatusRequest,
      com.example.grpc.smartoffices.GetWindowStatusResponse> getGetWindowStatusMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetWindowStatusRequest, com.example.grpc.smartoffices.GetWindowStatusResponse> getGetWindowStatusMethod;
    if ((getGetWindowStatusMethod = SmartWindowServiceGrpc.getGetWindowStatusMethod) == null) {
      synchronized (SmartWindowServiceGrpc.class) {
        if ((getGetWindowStatusMethod = SmartWindowServiceGrpc.getGetWindowStatusMethod) == null) {
          SmartWindowServiceGrpc.getGetWindowStatusMethod = getGetWindowStatusMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.GetWindowStatusRequest, com.example.grpc.smartoffices.GetWindowStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWindowStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.GetWindowStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.GetWindowStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowServiceMethodDescriptorSupplier("GetWindowStatus"))
              .build();
        }
      }
    }
    return getGetWindowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetWindowStatusRequest,
      com.example.grpc.smartoffices.SetWindowStatusResponse> getSetWindowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWindowStatus",
      requestType = com.example.grpc.smartoffices.SetWindowStatusRequest.class,
      responseType = com.example.grpc.smartoffices.SetWindowStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetWindowStatusRequest,
      com.example.grpc.smartoffices.SetWindowStatusResponse> getSetWindowStatusMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetWindowStatusRequest, com.example.grpc.smartoffices.SetWindowStatusResponse> getSetWindowStatusMethod;
    if ((getSetWindowStatusMethod = SmartWindowServiceGrpc.getSetWindowStatusMethod) == null) {
      synchronized (SmartWindowServiceGrpc.class) {
        if ((getSetWindowStatusMethod = SmartWindowServiceGrpc.getSetWindowStatusMethod) == null) {
          SmartWindowServiceGrpc.getSetWindowStatusMethod = getSetWindowStatusMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.SetWindowStatusRequest, com.example.grpc.smartoffices.SetWindowStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWindowStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.SetWindowStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.SetWindowStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowServiceMethodDescriptorSupplier("SetWindowStatus"))
              .build();
        }
      }
    }
    return getSetWindowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustWindowTintRequest,
      com.example.grpc.smartoffices.AdjustWindowTintResponse> getAdjustWindowTintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustWindowTint",
      requestType = com.example.grpc.smartoffices.AdjustWindowTintRequest.class,
      responseType = com.example.grpc.smartoffices.AdjustWindowTintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustWindowTintRequest,
      com.example.grpc.smartoffices.AdjustWindowTintResponse> getAdjustWindowTintMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustWindowTintRequest, com.example.grpc.smartoffices.AdjustWindowTintResponse> getAdjustWindowTintMethod;
    if ((getAdjustWindowTintMethod = SmartWindowServiceGrpc.getAdjustWindowTintMethod) == null) {
      synchronized (SmartWindowServiceGrpc.class) {
        if ((getAdjustWindowTintMethod = SmartWindowServiceGrpc.getAdjustWindowTintMethod) == null) {
          SmartWindowServiceGrpc.getAdjustWindowTintMethod = getAdjustWindowTintMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.AdjustWindowTintRequest, com.example.grpc.smartoffices.AdjustWindowTintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustWindowTint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.AdjustWindowTintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.AdjustWindowTintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartWindowServiceMethodDescriptorSupplier("AdjustWindowTint"))
              .build();
        }
      }
    }
    return getAdjustWindowTintMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartWindowServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartWindowServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartWindowServiceStub>() {
        @java.lang.Override
        public SmartWindowServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartWindowServiceStub(channel, callOptions);
        }
      };
    return SmartWindowServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartWindowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartWindowServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartWindowServiceBlockingStub>() {
        @java.lang.Override
        public SmartWindowServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartWindowServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartWindowServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartWindowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartWindowServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartWindowServiceFutureStub>() {
        @java.lang.Override
        public SmartWindowServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartWindowServiceFutureStub(channel, callOptions);
        }
      };
    return SmartWindowServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Smart Window Service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simple RPC to open the window
     * </pre>
     */
    default void openWindow(com.example.grpc.smartoffices.OpenWindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.OpenWindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC to close the window
     * </pre>
     */
    default void closeWindow(com.example.grpc.smartoffices.CloseWindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.CloseWindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseWindowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the window status
     * </pre>
     */
    default void getWindowStatus(com.example.grpc.smartoffices.GetWindowStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetWindowStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWindowStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set the window status
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetWindowStatusRequest> setWindowStatus(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetWindowStatusResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetWindowStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to adjust the window tint
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustWindowTintRequest> adjustWindowTint(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustWindowTintResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAdjustWindowTintMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartWindowService.
   * <pre>
   * Smart Window Service
   * </pre>
   */
  public static abstract class SmartWindowServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartWindowServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartWindowService.
   * <pre>
   * Smart Window Service
   * </pre>
   */
  public static final class SmartWindowServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SmartWindowServiceStub> {
    private SmartWindowServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWindowServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartWindowServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to open the window
     * </pre>
     */
    public void openWindow(com.example.grpc.smartoffices.OpenWindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.OpenWindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC to close the window
     * </pre>
     */
    public void closeWindow(com.example.grpc.smartoffices.CloseWindowRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.CloseWindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseWindowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the window status
     * </pre>
     */
    public void getWindowStatus(com.example.grpc.smartoffices.GetWindowStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetWindowStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetWindowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set the window status
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetWindowStatusRequest> setWindowStatus(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetWindowStatusResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetWindowStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to adjust the window tint
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustWindowTintRequest> adjustWindowTint(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustWindowTintResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAdjustWindowTintMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartWindowService.
   * <pre>
   * Smart Window Service
   * </pre>
   */
  public static final class SmartWindowServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartWindowServiceBlockingStub> {
    private SmartWindowServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWindowServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartWindowServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to open the window
     * </pre>
     */
    public com.example.grpc.smartoffices.OpenWindowResponse openWindow(com.example.grpc.smartoffices.OpenWindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC to close the window
     * </pre>
     */
    public com.example.grpc.smartoffices.CloseWindowResponse closeWindow(com.example.grpc.smartoffices.CloseWindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseWindowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the window status
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.smartoffices.GetWindowStatusResponse> getWindowStatus(
        com.example.grpc.smartoffices.GetWindowStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetWindowStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartWindowService.
   * <pre>
   * Smart Window Service
   * </pre>
   */
  public static final class SmartWindowServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartWindowServiceFutureStub> {
    private SmartWindowServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartWindowServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartWindowServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to open the window
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.OpenWindowResponse> openWindow(
        com.example.grpc.smartoffices.OpenWindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenWindowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC to close the window
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.CloseWindowResponse> closeWindow(
        com.example.grpc.smartoffices.CloseWindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseWindowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_WINDOW = 0;
  private static final int METHODID_CLOSE_WINDOW = 1;
  private static final int METHODID_GET_WINDOW_STATUS = 2;
  private static final int METHODID_SET_WINDOW_STATUS = 3;
  private static final int METHODID_ADJUST_WINDOW_TINT = 4;

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
          serviceImpl.openWindow((com.example.grpc.smartoffices.OpenWindowRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.OpenWindowResponse>) responseObserver);
          break;
        case METHODID_CLOSE_WINDOW:
          serviceImpl.closeWindow((com.example.grpc.smartoffices.CloseWindowRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.CloseWindowResponse>) responseObserver);
          break;
        case METHODID_GET_WINDOW_STATUS:
          serviceImpl.getWindowStatus((com.example.grpc.smartoffices.GetWindowStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetWindowStatusResponse>) responseObserver);
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
        case METHODID_SET_WINDOW_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setWindowStatus(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetWindowStatusResponse>) responseObserver);
        case METHODID_ADJUST_WINDOW_TINT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustWindowTint(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustWindowTintResponse>) responseObserver);
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
              com.example.grpc.smartoffices.OpenWindowRequest,
              com.example.grpc.smartoffices.OpenWindowResponse>(
                service, METHODID_OPEN_WINDOW)))
        .addMethod(
          getCloseWindowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.CloseWindowRequest,
              com.example.grpc.smartoffices.CloseWindowResponse>(
                service, METHODID_CLOSE_WINDOW)))
        .addMethod(
          getGetWindowStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.GetWindowStatusRequest,
              com.example.grpc.smartoffices.GetWindowStatusResponse>(
                service, METHODID_GET_WINDOW_STATUS)))
        .addMethod(
          getSetWindowStatusMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.SetWindowStatusRequest,
              com.example.grpc.smartoffices.SetWindowStatusResponse>(
                service, METHODID_SET_WINDOW_STATUS)))
        .addMethod(
          getAdjustWindowTintMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.AdjustWindowTintRequest,
              com.example.grpc.smartoffices.AdjustWindowTintResponse>(
                service, METHODID_ADJUST_WINDOW_TINT)))
        .build();
  }

  private static abstract class SmartWindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartWindowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.smartoffices.SmartWindowServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartWindowService");
    }
  }

  private static final class SmartWindowServiceFileDescriptorSupplier
      extends SmartWindowServiceBaseDescriptorSupplier {
    SmartWindowServiceFileDescriptorSupplier() {}
  }

  private static final class SmartWindowServiceMethodDescriptorSupplier
      extends SmartWindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartWindowServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartWindowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartWindowServiceFileDescriptorSupplier())
              .addMethod(getOpenWindowMethod())
              .addMethod(getCloseWindowMethod())
              .addMethod(getGetWindowStatusMethod())
              .addMethod(getSetWindowStatusMethod())
              .addMethod(getAdjustWindowTintMethod())
              .build();
        }
      }
    }
    return result;
  }
}
