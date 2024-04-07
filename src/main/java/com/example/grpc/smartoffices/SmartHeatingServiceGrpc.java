package com.example.grpc.smartoffices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Smart Heating Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: smartheating.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartHeatingServiceGrpc {

  private SmartHeatingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SmartOffices.SmartHeatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOnHeatingRequest,
      com.example.grpc.smartoffices.TurnOnHeatingResponse> getTurnOnHeatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnHeating",
      requestType = com.example.grpc.smartoffices.TurnOnHeatingRequest.class,
      responseType = com.example.grpc.smartoffices.TurnOnHeatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOnHeatingRequest,
      com.example.grpc.smartoffices.TurnOnHeatingResponse> getTurnOnHeatingMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOnHeatingRequest, com.example.grpc.smartoffices.TurnOnHeatingResponse> getTurnOnHeatingMethod;
    if ((getTurnOnHeatingMethod = SmartHeatingServiceGrpc.getTurnOnHeatingMethod) == null) {
      synchronized (SmartHeatingServiceGrpc.class) {
        if ((getTurnOnHeatingMethod = SmartHeatingServiceGrpc.getTurnOnHeatingMethod) == null) {
          SmartHeatingServiceGrpc.getTurnOnHeatingMethod = getTurnOnHeatingMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.TurnOnHeatingRequest, com.example.grpc.smartoffices.TurnOnHeatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOnHeating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOnHeatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOnHeatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingServiceMethodDescriptorSupplier("TurnOnHeating"))
              .build();
        }
      }
    }
    return getTurnOnHeatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOffHeatingRequest,
      com.example.grpc.smartoffices.TurnOffHeatingResponse> getTurnOffHeatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOffHeating",
      requestType = com.example.grpc.smartoffices.TurnOffHeatingRequest.class,
      responseType = com.example.grpc.smartoffices.TurnOffHeatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOffHeatingRequest,
      com.example.grpc.smartoffices.TurnOffHeatingResponse> getTurnOffHeatingMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.TurnOffHeatingRequest, com.example.grpc.smartoffices.TurnOffHeatingResponse> getTurnOffHeatingMethod;
    if ((getTurnOffHeatingMethod = SmartHeatingServiceGrpc.getTurnOffHeatingMethod) == null) {
      synchronized (SmartHeatingServiceGrpc.class) {
        if ((getTurnOffHeatingMethod = SmartHeatingServiceGrpc.getTurnOffHeatingMethod) == null) {
          SmartHeatingServiceGrpc.getTurnOffHeatingMethod = getTurnOffHeatingMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.TurnOffHeatingRequest, com.example.grpc.smartoffices.TurnOffHeatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOffHeating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOffHeatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.TurnOffHeatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingServiceMethodDescriptorSupplier("TurnOffHeating"))
              .build();
        }
      }
    }
    return getTurnOffHeatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetHeatingStatusRequest,
      com.example.grpc.smartoffices.GetHeatingStatusResponse> getGetHeatingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHeatingStatus",
      requestType = com.example.grpc.smartoffices.GetHeatingStatusRequest.class,
      responseType = com.example.grpc.smartoffices.GetHeatingStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetHeatingStatusRequest,
      com.example.grpc.smartoffices.GetHeatingStatusResponse> getGetHeatingStatusMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.GetHeatingStatusRequest, com.example.grpc.smartoffices.GetHeatingStatusResponse> getGetHeatingStatusMethod;
    if ((getGetHeatingStatusMethod = SmartHeatingServiceGrpc.getGetHeatingStatusMethod) == null) {
      synchronized (SmartHeatingServiceGrpc.class) {
        if ((getGetHeatingStatusMethod = SmartHeatingServiceGrpc.getGetHeatingStatusMethod) == null) {
          SmartHeatingServiceGrpc.getGetHeatingStatusMethod = getGetHeatingStatusMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.GetHeatingStatusRequest, com.example.grpc.smartoffices.GetHeatingStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHeatingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.GetHeatingStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.GetHeatingStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingServiceMethodDescriptorSupplier("GetHeatingStatus"))
              .build();
        }
      }
    }
    return getGetHeatingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetHeatingStatusRequest,
      com.example.grpc.smartoffices.SetHeatingStatusResponse> getSetHeatingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetHeatingStatus",
      requestType = com.example.grpc.smartoffices.SetHeatingStatusRequest.class,
      responseType = com.example.grpc.smartoffices.SetHeatingStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetHeatingStatusRequest,
      com.example.grpc.smartoffices.SetHeatingStatusResponse> getSetHeatingStatusMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.SetHeatingStatusRequest, com.example.grpc.smartoffices.SetHeatingStatusResponse> getSetHeatingStatusMethod;
    if ((getSetHeatingStatusMethod = SmartHeatingServiceGrpc.getSetHeatingStatusMethod) == null) {
      synchronized (SmartHeatingServiceGrpc.class) {
        if ((getSetHeatingStatusMethod = SmartHeatingServiceGrpc.getSetHeatingStatusMethod) == null) {
          SmartHeatingServiceGrpc.getSetHeatingStatusMethod = getSetHeatingStatusMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.SetHeatingStatusRequest, com.example.grpc.smartoffices.SetHeatingStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetHeatingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.SetHeatingStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.SetHeatingStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingServiceMethodDescriptorSupplier("SetHeatingStatus"))
              .build();
        }
      }
    }
    return getSetHeatingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest,
      com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse> getAdjustHeatingTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustHeatingTemperature",
      requestType = com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest.class,
      responseType = com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest,
      com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse> getAdjustHeatingTemperatureMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest, com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse> getAdjustHeatingTemperatureMethod;
    if ((getAdjustHeatingTemperatureMethod = SmartHeatingServiceGrpc.getAdjustHeatingTemperatureMethod) == null) {
      synchronized (SmartHeatingServiceGrpc.class) {
        if ((getAdjustHeatingTemperatureMethod = SmartHeatingServiceGrpc.getAdjustHeatingTemperatureMethod) == null) {
          SmartHeatingServiceGrpc.getAdjustHeatingTemperatureMethod = getAdjustHeatingTemperatureMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest, com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdjustHeatingTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingServiceMethodDescriptorSupplier("AdjustHeatingTemperature"))
              .build();
        }
      }
    }
    return getAdjustHeatingTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartHeatingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartHeatingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartHeatingServiceStub>() {
        @java.lang.Override
        public SmartHeatingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartHeatingServiceStub(channel, callOptions);
        }
      };
    return SmartHeatingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartHeatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartHeatingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartHeatingServiceBlockingStub>() {
        @java.lang.Override
        public SmartHeatingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartHeatingServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartHeatingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartHeatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartHeatingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartHeatingServiceFutureStub>() {
        @java.lang.Override
        public SmartHeatingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartHeatingServiceFutureStub(channel, callOptions);
        }
      };
    return SmartHeatingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Smart Heating Service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Simple RPC to turn on the heating
     * </pre>
     */
    default void turnOnHeating(com.example.grpc.smartoffices.TurnOnHeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOnHeatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOnHeatingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC to turn off the heating
     * </pre>
     */
    default void turnOffHeating(com.example.grpc.smartoffices.TurnOffHeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOffHeatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOffHeatingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the heating status
     * </pre>
     */
    default void getHeatingStatus(com.example.grpc.smartoffices.GetHeatingStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetHeatingStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHeatingStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set the heating status
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetHeatingStatusRequest> setHeatingStatus(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetHeatingStatusResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetHeatingStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to adjust the heating temperature
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest> adjustHeatingTemperature(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAdjustHeatingTemperatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartHeatingService.
   * <pre>
   * Smart Heating Service
   * </pre>
   */
  public static abstract class SmartHeatingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartHeatingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartHeatingService.
   * <pre>
   * Smart Heating Service
   * </pre>
   */
  public static final class SmartHeatingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SmartHeatingServiceStub> {
    private SmartHeatingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartHeatingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartHeatingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to turn on the heating
     * </pre>
     */
    public void turnOnHeating(com.example.grpc.smartoffices.TurnOnHeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOnHeatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOnHeatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC to turn off the heating
     * </pre>
     */
    public void turnOffHeating(com.example.grpc.smartoffices.TurnOffHeatingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOffHeatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOffHeatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the heating status
     * </pre>
     */
    public void getHeatingStatus(com.example.grpc.smartoffices.GetHeatingStatusRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetHeatingStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetHeatingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC to set the heating status
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetHeatingStatusRequest> setHeatingStatus(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetHeatingStatusResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetHeatingStatusMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC to adjust the heating temperature
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest> adjustHeatingTemperature(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAdjustHeatingTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartHeatingService.
   * <pre>
   * Smart Heating Service
   * </pre>
   */
  public static final class SmartHeatingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartHeatingServiceBlockingStub> {
    private SmartHeatingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartHeatingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartHeatingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to turn on the heating
     * </pre>
     */
    public com.example.grpc.smartoffices.TurnOnHeatingResponse turnOnHeating(com.example.grpc.smartoffices.TurnOnHeatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnHeatingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC to turn off the heating
     * </pre>
     */
    public com.example.grpc.smartoffices.TurnOffHeatingResponse turnOffHeating(com.example.grpc.smartoffices.TurnOffHeatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffHeatingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side streaming RPC to get the heating status
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.smartoffices.GetHeatingStatusResponse> getHeatingStatus(
        com.example.grpc.smartoffices.GetHeatingStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetHeatingStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartHeatingService.
   * <pre>
   * Smart Heating Service
   * </pre>
   */
  public static final class SmartHeatingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartHeatingServiceFutureStub> {
    private SmartHeatingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartHeatingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartHeatingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC to turn on the heating
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.TurnOnHeatingResponse> turnOnHeating(
        com.example.grpc.smartoffices.TurnOnHeatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOnHeatingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC to turn off the heating
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.TurnOffHeatingResponse> turnOffHeating(
        com.example.grpc.smartoffices.TurnOffHeatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOffHeatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_HEATING = 0;
  private static final int METHODID_TURN_OFF_HEATING = 1;
  private static final int METHODID_GET_HEATING_STATUS = 2;
  private static final int METHODID_SET_HEATING_STATUS = 3;
  private static final int METHODID_ADJUST_HEATING_TEMPERATURE = 4;

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
        case METHODID_TURN_ON_HEATING:
          serviceImpl.turnOnHeating((com.example.grpc.smartoffices.TurnOnHeatingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOnHeatingResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_HEATING:
          serviceImpl.turnOffHeating((com.example.grpc.smartoffices.TurnOffHeatingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.TurnOffHeatingResponse>) responseObserver);
          break;
        case METHODID_GET_HEATING_STATUS:
          serviceImpl.getHeatingStatus((com.example.grpc.smartoffices.GetHeatingStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.GetHeatingStatusResponse>) responseObserver);
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
        case METHODID_SET_HEATING_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setHeatingStatus(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.SetHeatingStatusResponse>) responseObserver);
        case METHODID_ADJUST_HEATING_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustHeatingTemperature(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTurnOnHeatingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.TurnOnHeatingRequest,
              com.example.grpc.smartoffices.TurnOnHeatingResponse>(
                service, METHODID_TURN_ON_HEATING)))
        .addMethod(
          getTurnOffHeatingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.TurnOffHeatingRequest,
              com.example.grpc.smartoffices.TurnOffHeatingResponse>(
                service, METHODID_TURN_OFF_HEATING)))
        .addMethod(
          getGetHeatingStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.GetHeatingStatusRequest,
              com.example.grpc.smartoffices.GetHeatingStatusResponse>(
                service, METHODID_GET_HEATING_STATUS)))
        .addMethod(
          getSetHeatingStatusMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.SetHeatingStatusRequest,
              com.example.grpc.smartoffices.SetHeatingStatusResponse>(
                service, METHODID_SET_HEATING_STATUS)))
        .addMethod(
          getAdjustHeatingTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.AdjustHeatingTemperatureRequest,
              com.example.grpc.smartoffices.AdjustHeatingTemperatureResponse>(
                service, METHODID_ADJUST_HEATING_TEMPERATURE)))
        .build();
  }

  private static abstract class SmartHeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartHeatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.smartoffices.SmartHeatingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartHeatingService");
    }
  }

  private static final class SmartHeatingServiceFileDescriptorSupplier
      extends SmartHeatingServiceBaseDescriptorSupplier {
    SmartHeatingServiceFileDescriptorSupplier() {}
  }

  private static final class SmartHeatingServiceMethodDescriptorSupplier
      extends SmartHeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartHeatingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartHeatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartHeatingServiceFileDescriptorSupplier())
              .addMethod(getTurnOnHeatingMethod())
              .addMethod(getTurnOffHeatingMethod())
              .addMethod(getGetHeatingStatusMethod())
              .addMethod(getSetHeatingStatusMethod())
              .addMethod(getAdjustHeatingTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
