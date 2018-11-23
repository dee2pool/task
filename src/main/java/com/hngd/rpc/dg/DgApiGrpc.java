package com.hngd.rpc.dg;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * 设备网关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: dgAPi.proto")
public final class DgApiGrpc {

  private DgApiGrpc() {}

  public static final String SERVICE_NAME = "hngdrpcdg.DgApi";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.hngd.rpc.dg.DoorRequest,
      com.hngd.rpc.dg.CommonResponse> METHOD_SET_DOOR_STATUS =
      io.grpc.MethodDescriptor.<com.hngd.rpc.dg.DoorRequest, com.hngd.rpc.dg.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "hngdrpcdg.DgApi", "SetDoorStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.DoorRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.CommonResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.hngd.rpc.dg.ITCTalkOperationRequest,
      com.hngd.rpc.dg.CommonResponse> METHOD_ITCTALK_OPERATION =
      io.grpc.MethodDescriptor.<com.hngd.rpc.dg.ITCTalkOperationRequest, com.hngd.rpc.dg.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "hngdrpcdg.DgApi", "ITCTalkOperation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.ITCTalkOperationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.CommonResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.hngd.rpc.dg.QuryFileRequest,
      com.hngd.rpc.dg.CommonResponse> METHOD_QUERY_FILE_OPERATION =
      io.grpc.MethodDescriptor.<com.hngd.rpc.dg.QuryFileRequest, com.hngd.rpc.dg.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "hngdrpcdg.DgApi", "QueryFileOperation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.QuryFileRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.CommonResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.hngd.rpc.dg.PerTaskRequest,
      com.hngd.rpc.dg.CommonResponse> METHOD_PERIODIC_TASK_CONFIG =
      io.grpc.MethodDescriptor.<com.hngd.rpc.dg.PerTaskRequest, com.hngd.rpc.dg.CommonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "hngdrpcdg.DgApi", "PeriodicTaskConfig"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.PerTaskRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.hngd.rpc.dg.CommonResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DgApiStub newStub(io.grpc.Channel channel) {
    return new DgApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DgApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DgApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DgApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DgApiFutureStub(channel);
  }

  /**
   * <pre>
   * 设备网关接口
   * </pre>
   */
  public static abstract class DgApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *[设置门的状态:关门,短开门,常开门]
     * </pre>
     */
    public void setDoorStatus(com.hngd.rpc.dg.DoorRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DOOR_STATUS, responseObserver);
    }

    /**
     * <pre>
     *定义接口---[ITC语音对讲操作]
     * </pre>
     */
    public void iTCTalkOperation(com.hngd.rpc.dg.ITCTalkOperationRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ITCTALK_OPERATION, responseObserver);
    }

    /**
     * <pre>
     *定义接口---[录像查询]
     * </pre>
     */
    public void queryFileOperation(com.hngd.rpc.dg.QuryFileRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_FILE_OPERATION, responseObserver);
    }

    /**
     * <pre>
     *定义接口---[周期任务配置]
     * </pre>
     */
    public void periodicTaskConfig(com.hngd.rpc.dg.PerTaskRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PERIODIC_TASK_CONFIG, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SET_DOOR_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.hngd.rpc.dg.DoorRequest,
                com.hngd.rpc.dg.CommonResponse>(
                  this, METHODID_SET_DOOR_STATUS)))
          .addMethod(
            METHOD_ITCTALK_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.hngd.rpc.dg.ITCTalkOperationRequest,
                com.hngd.rpc.dg.CommonResponse>(
                  this, METHODID_ITCTALK_OPERATION)))
          .addMethod(
            METHOD_QUERY_FILE_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.hngd.rpc.dg.QuryFileRequest,
                com.hngd.rpc.dg.CommonResponse>(
                  this, METHODID_QUERY_FILE_OPERATION)))
          .addMethod(
            METHOD_PERIODIC_TASK_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.hngd.rpc.dg.PerTaskRequest,
                com.hngd.rpc.dg.CommonResponse>(
                  this, METHODID_PERIODIC_TASK_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * 设备网关接口
   * </pre>
   */
  public static final class DgApiStub extends io.grpc.stub.AbstractStub<DgApiStub> {
    private DgApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DgApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DgApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DgApiStub(channel, callOptions);
    }

    /**
     * <pre>
     *[设置门的状态:关门,短开门,常开门]
     * </pre>
     */
    public void setDoorStatus(com.hngd.rpc.dg.DoorRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DOOR_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *定义接口---[ITC语音对讲操作]
     * </pre>
     */
    public void iTCTalkOperation(com.hngd.rpc.dg.ITCTalkOperationRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ITCTALK_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *定义接口---[录像查询]
     * </pre>
     */
    public void queryFileOperation(com.hngd.rpc.dg.QuryFileRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_FILE_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *定义接口---[周期任务配置]
     * </pre>
     */
    public void periodicTaskConfig(com.hngd.rpc.dg.PerTaskRequest request,
        io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PERIODIC_TASK_CONFIG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 设备网关接口
   * </pre>
   */
  public static final class DgApiBlockingStub extends io.grpc.stub.AbstractStub<DgApiBlockingStub> {
    private DgApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DgApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DgApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DgApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *[设置门的状态:关门,短开门,常开门]
     * </pre>
     */
    public com.hngd.rpc.dg.CommonResponse setDoorStatus(com.hngd.rpc.dg.DoorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DOOR_STATUS, getCallOptions(), request);
    }

    /**
     * <pre>
     *定义接口---[ITC语音对讲操作]
     * </pre>
     */
    public com.hngd.rpc.dg.CommonResponse iTCTalkOperation(com.hngd.rpc.dg.ITCTalkOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ITCTALK_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     *定义接口---[录像查询]
     * </pre>
     */
    public com.hngd.rpc.dg.CommonResponse queryFileOperation(com.hngd.rpc.dg.QuryFileRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_FILE_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     *定义接口---[周期任务配置]
     * </pre>
     */
    public com.hngd.rpc.dg.CommonResponse periodicTaskConfig(com.hngd.rpc.dg.PerTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PERIODIC_TASK_CONFIG, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 设备网关接口
   * </pre>
   */
  public static final class DgApiFutureStub extends io.grpc.stub.AbstractStub<DgApiFutureStub> {
    private DgApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DgApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DgApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DgApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *[设置门的状态:关门,短开门,常开门]
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hngd.rpc.dg.CommonResponse> setDoorStatus(
        com.hngd.rpc.dg.DoorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DOOR_STATUS, getCallOptions()), request);
    }

    /**
     * <pre>
     *定义接口---[ITC语音对讲操作]
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hngd.rpc.dg.CommonResponse> iTCTalkOperation(
        com.hngd.rpc.dg.ITCTalkOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ITCTALK_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     *定义接口---[录像查询]
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hngd.rpc.dg.CommonResponse> queryFileOperation(
        com.hngd.rpc.dg.QuryFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_FILE_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     *定义接口---[周期任务配置]
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hngd.rpc.dg.CommonResponse> periodicTaskConfig(
        com.hngd.rpc.dg.PerTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PERIODIC_TASK_CONFIG, getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_DOOR_STATUS = 0;
  private static final int METHODID_ITCTALK_OPERATION = 1;
  private static final int METHODID_QUERY_FILE_OPERATION = 2;
  private static final int METHODID_PERIODIC_TASK_CONFIG = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DgApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DgApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_DOOR_STATUS:
          serviceImpl.setDoorStatus((com.hngd.rpc.dg.DoorRequest) request,
              (io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse>) responseObserver);
          break;
        case METHODID_ITCTALK_OPERATION:
          serviceImpl.iTCTalkOperation((com.hngd.rpc.dg.ITCTalkOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse>) responseObserver);
          break;
        case METHODID_QUERY_FILE_OPERATION:
          serviceImpl.queryFileOperation((com.hngd.rpc.dg.QuryFileRequest) request,
              (io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse>) responseObserver);
          break;
        case METHODID_PERIODIC_TASK_CONFIG:
          serviceImpl.periodicTaskConfig((com.hngd.rpc.dg.PerTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.hngd.rpc.dg.CommonResponse>) responseObserver);
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

  private static final class DgApiDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hngd.rpc.dg.DgApiProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DgApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DgApiDescriptorSupplier())
              .addMethod(METHOD_SET_DOOR_STATUS)
              .addMethod(METHOD_ITCTALK_OPERATION)
              .addMethod(METHOD_QUERY_FILE_OPERATION)
              .addMethod(METHOD_PERIODIC_TASK_CONFIG)
              .build();
        }
      }
    }
    return result;
  }
}
