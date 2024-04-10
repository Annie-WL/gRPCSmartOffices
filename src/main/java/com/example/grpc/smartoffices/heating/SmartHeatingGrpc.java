package com.example.grpc.smartoffices.heating;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for managing smart heating systems based on temperature readings.
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
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getMonitorTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorTemperature",
      requestType = com.example.grpc.smartoffices.heating.TemperatureSettingRequest.class,
      responseType = com.example.grpc.smartoffices.heating.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getMonitorTemperatureMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse> getMonitorTemperatureMethod;
    if ((getMonitorTemperatureMethod = SmartHeatingGrpc.getMonitorTemperatureMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getMonitorTemperatureMethod = SmartHeatingGrpc.getMonitorTemperatureMethod) == null) {
          SmartHeatingGrpc.getMonitorTemperatureMethod = getMonitorTemperatureMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("MonitorTemperature"))
              .build();
        }
      }
    }
    return getMonitorTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getSetTemperatureHighMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemperatureHigh",
      requestType = com.example.grpc.smartoffices.heating.TemperatureSettingRequest.class,
      responseType = com.example.grpc.smartoffices.heating.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getSetTemperatureHighMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse> getSetTemperatureHighMethod;
    if ((getSetTemperatureHighMethod = SmartHeatingGrpc.getSetTemperatureHighMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getSetTemperatureHighMethod = SmartHeatingGrpc.getSetTemperatureHighMethod) == null) {
          SmartHeatingGrpc.getSetTemperatureHighMethod = getSetTemperatureHighMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTemperatureHigh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("SetTemperatureHigh"))
              .build();
        }
      }
    }
    return getSetTemperatureHighMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getSetTemperatureLowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemperatureLow",
      requestType = com.example.grpc.smartoffices.heating.TemperatureSettingRequest.class,
      responseType = com.example.grpc.smartoffices.heating.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getSetTemperatureLowMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse> getSetTemperatureLowMethod;
    if ((getSetTemperatureLowMethod = SmartHeatingGrpc.getSetTemperatureLowMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getSetTemperatureLowMethod = SmartHeatingGrpc.getSetTemperatureLowMethod) == null) {
          SmartHeatingGrpc.getSetTemperatureLowMethod = getSetTemperatureLowMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTemperatureLow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("SetTemperatureLow"))
              .build();
        }
      }
    }
    return getSetTemperatureLowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getTurnHeatingOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnHeatingOn",
      requestType = com.example.grpc.smartoffices.heating.TemperatureSettingRequest.class,
      responseType = com.example.grpc.smartoffices.heating.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getTurnHeatingOnMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse> getTurnHeatingOnMethod;
    if ((getTurnHeatingOnMethod = SmartHeatingGrpc.getTurnHeatingOnMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getTurnHeatingOnMethod = SmartHeatingGrpc.getTurnHeatingOnMethod) == null) {
          SmartHeatingGrpc.getTurnHeatingOnMethod = getTurnHeatingOnMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnHeatingOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("TurnHeatingOn"))
              .build();
        }
      }
    }
    return getTurnHeatingOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getTurnHeatingOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnHeatingOff",
      requestType = com.example.grpc.smartoffices.heating.TemperatureSettingRequest.class,
      responseType = com.example.grpc.smartoffices.heating.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
      com.example.grpc.smartoffices.heating.TemperatureResponse> getTurnHeatingOffMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse> getTurnHeatingOffMethod;
    if ((getTurnHeatingOffMethod = SmartHeatingGrpc.getTurnHeatingOffMethod) == null) {
      synchronized (SmartHeatingGrpc.class) {
        if ((getTurnHeatingOffMethod = SmartHeatingGrpc.getTurnHeatingOffMethod) == null) {
          SmartHeatingGrpc.getTurnHeatingOffMethod = getTurnHeatingOffMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.smartoffices.heating.TemperatureSettingRequest, com.example.grpc.smartoffices.heating.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnHeatingOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.smartoffices.heating.TemperatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartHeatingMethodDescriptorSupplier("TurnHeatingOff"))
              .build();
        }
      }
    }
    return getTurnHeatingOffMethod;
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
   * Service for managing smart heating systems based on temperature readings.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Client-side Streaming RPC: Stream temperature data from the sensor
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureSettingRequest> monitorTemperature(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Set high temperature
     * </pre>
     */
    default void setTemperatureHigh(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTemperatureHighMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Set low temperature
     * </pre>
     */
    default void setTemperatureLow(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTemperatureLowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating on
     * </pre>
     */
    default void turnHeatingOn(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnHeatingOnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating off
     * </pre>
     */
    default void turnHeatingOff(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnHeatingOffMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartHeating.
   * <pre>
   * Service for managing smart heating systems based on temperature readings.
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
   * Service for managing smart heating systems based on temperature readings.
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
     * Client-side Streaming RPC: Stream temperature data from the sensor
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureSettingRequest> monitorTemperature(
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getMonitorTemperatureMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Set high temperature
     * </pre>
     */
    public void setTemperatureHigh(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTemperatureHighMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Set low temperature
     * </pre>
     */
    public void setTemperatureLow(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTemperatureLowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating on
     * </pre>
     */
    public void turnHeatingOn(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnHeatingOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating off
     * </pre>
     */
    public void turnHeatingOff(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnHeatingOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartHeating.
   * <pre>
   * Service for managing smart heating systems based on temperature readings.
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
     * Simple RPC: Set high temperature
     * </pre>
     */
    public com.example.grpc.smartoffices.heating.TemperatureResponse setTemperatureHigh(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTemperatureHighMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Set low temperature
     * </pre>
     */
    public com.example.grpc.smartoffices.heating.TemperatureResponse setTemperatureLow(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTemperatureLowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating on
     * </pre>
     */
    public com.example.grpc.smartoffices.heating.TemperatureResponse turnHeatingOn(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnHeatingOnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating off
     * </pre>
     */
    public com.example.grpc.smartoffices.heating.TemperatureResponse turnHeatingOff(com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnHeatingOffMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartHeating.
   * <pre>
   * Service for managing smart heating systems based on temperature readings.
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
     * Simple RPC: Set high temperature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.heating.TemperatureResponse> setTemperatureHigh(
        com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTemperatureHighMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Set low temperature
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.heating.TemperatureResponse> setTemperatureLow(
        com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTemperatureLowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating on
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.heating.TemperatureResponse> turnHeatingOn(
        com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnHeatingOnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC: Turn heating off
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.smartoffices.heating.TemperatureResponse> turnHeatingOff(
        com.example.grpc.smartoffices.heating.TemperatureSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnHeatingOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_TEMPERATURE_HIGH = 0;
  private static final int METHODID_SET_TEMPERATURE_LOW = 1;
  private static final int METHODID_TURN_HEATING_ON = 2;
  private static final int METHODID_TURN_HEATING_OFF = 3;
  private static final int METHODID_MONITOR_TEMPERATURE = 4;

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
        case METHODID_SET_TEMPERATURE_HIGH:
          serviceImpl.setTemperatureHigh((com.example.grpc.smartoffices.heating.TemperatureSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse>) responseObserver);
          break;
        case METHODID_SET_TEMPERATURE_LOW:
          serviceImpl.setTemperatureLow((com.example.grpc.smartoffices.heating.TemperatureSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse>) responseObserver);
          break;
        case METHODID_TURN_HEATING_ON:
          serviceImpl.turnHeatingOn((com.example.grpc.smartoffices.heating.TemperatureSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse>) responseObserver);
          break;
        case METHODID_TURN_HEATING_OFF:
          serviceImpl.turnHeatingOff((com.example.grpc.smartoffices.heating.TemperatureSettingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse>) responseObserver);
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
        case METHODID_MONITOR_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorTemperature(
              (io.grpc.stub.StreamObserver<com.example.grpc.smartoffices.heating.TemperatureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMonitorTemperatureMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
              com.example.grpc.smartoffices.heating.TemperatureResponse>(
                service, METHODID_MONITOR_TEMPERATURE)))
        .addMethod(
          getSetTemperatureHighMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
              com.example.grpc.smartoffices.heating.TemperatureResponse>(
                service, METHODID_SET_TEMPERATURE_HIGH)))
        .addMethod(
          getSetTemperatureLowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
              com.example.grpc.smartoffices.heating.TemperatureResponse>(
                service, METHODID_SET_TEMPERATURE_LOW)))
        .addMethod(
          getTurnHeatingOnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
              com.example.grpc.smartoffices.heating.TemperatureResponse>(
                service, METHODID_TURN_HEATING_ON)))
        .addMethod(
          getTurnHeatingOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.smartoffices.heating.TemperatureSettingRequest,
              com.example.grpc.smartoffices.heating.TemperatureResponse>(
                service, METHODID_TURN_HEATING_OFF)))
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
              .addMethod(getMonitorTemperatureMethod())
              .addMethod(getSetTemperatureHighMethod())
              .addMethod(getSetTemperatureLowMethod())
              .addMethod(getTurnHeatingOnMethod())
              .addMethod(getTurnHeatingOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
