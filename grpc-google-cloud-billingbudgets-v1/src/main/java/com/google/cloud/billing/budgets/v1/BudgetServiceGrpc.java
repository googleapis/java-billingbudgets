/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.billing.budgets.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/billing/budgets/v1/budget_service.proto")
public final class BudgetServiceGrpc {

  private BudgetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.billing.budgets.v1.BudgetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.CreateBudgetRequest,
          com.google.cloud.billing.budgets.v1.Budget>
      getCreateBudgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBudget",
      requestType = com.google.cloud.billing.budgets.v1.CreateBudgetRequest.class,
      responseType = com.google.cloud.billing.budgets.v1.Budget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.CreateBudgetRequest,
          com.google.cloud.billing.budgets.v1.Budget>
      getCreateBudgetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.budgets.v1.CreateBudgetRequest,
            com.google.cloud.billing.budgets.v1.Budget>
        getCreateBudgetMethod;
    if ((getCreateBudgetMethod = BudgetServiceGrpc.getCreateBudgetMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getCreateBudgetMethod = BudgetServiceGrpc.getCreateBudgetMethod) == null) {
          BudgetServiceGrpc.getCreateBudgetMethod =
              getCreateBudgetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.budgets.v1.CreateBudgetRequest,
                          com.google.cloud.billing.budgets.v1.Budget>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBudget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.CreateBudgetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.Budget.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new BudgetServiceMethodDescriptorSupplier("CreateBudget"))
                      .build();
        }
      }
    }
    return getCreateBudgetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.UpdateBudgetRequest,
          com.google.cloud.billing.budgets.v1.Budget>
      getUpdateBudgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBudget",
      requestType = com.google.cloud.billing.budgets.v1.UpdateBudgetRequest.class,
      responseType = com.google.cloud.billing.budgets.v1.Budget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.UpdateBudgetRequest,
          com.google.cloud.billing.budgets.v1.Budget>
      getUpdateBudgetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.budgets.v1.UpdateBudgetRequest,
            com.google.cloud.billing.budgets.v1.Budget>
        getUpdateBudgetMethod;
    if ((getUpdateBudgetMethod = BudgetServiceGrpc.getUpdateBudgetMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getUpdateBudgetMethod = BudgetServiceGrpc.getUpdateBudgetMethod) == null) {
          BudgetServiceGrpc.getUpdateBudgetMethod =
              getUpdateBudgetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.budgets.v1.UpdateBudgetRequest,
                          com.google.cloud.billing.budgets.v1.Budget>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBudget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.UpdateBudgetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.Budget.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new BudgetServiceMethodDescriptorSupplier("UpdateBudget"))
                      .build();
        }
      }
    }
    return getUpdateBudgetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.GetBudgetRequest,
          com.google.cloud.billing.budgets.v1.Budget>
      getGetBudgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBudget",
      requestType = com.google.cloud.billing.budgets.v1.GetBudgetRequest.class,
      responseType = com.google.cloud.billing.budgets.v1.Budget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.GetBudgetRequest,
          com.google.cloud.billing.budgets.v1.Budget>
      getGetBudgetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.budgets.v1.GetBudgetRequest,
            com.google.cloud.billing.budgets.v1.Budget>
        getGetBudgetMethod;
    if ((getGetBudgetMethod = BudgetServiceGrpc.getGetBudgetMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getGetBudgetMethod = BudgetServiceGrpc.getGetBudgetMethod) == null) {
          BudgetServiceGrpc.getGetBudgetMethod =
              getGetBudgetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.budgets.v1.GetBudgetRequest,
                          com.google.cloud.billing.budgets.v1.Budget>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBudget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.GetBudgetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.Budget.getDefaultInstance()))
                      .setSchemaDescriptor(new BudgetServiceMethodDescriptorSupplier("GetBudget"))
                      .build();
        }
      }
    }
    return getGetBudgetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.ListBudgetsRequest,
          com.google.cloud.billing.budgets.v1.ListBudgetsResponse>
      getListBudgetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBudgets",
      requestType = com.google.cloud.billing.budgets.v1.ListBudgetsRequest.class,
      responseType = com.google.cloud.billing.budgets.v1.ListBudgetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.ListBudgetsRequest,
          com.google.cloud.billing.budgets.v1.ListBudgetsResponse>
      getListBudgetsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.budgets.v1.ListBudgetsRequest,
            com.google.cloud.billing.budgets.v1.ListBudgetsResponse>
        getListBudgetsMethod;
    if ((getListBudgetsMethod = BudgetServiceGrpc.getListBudgetsMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getListBudgetsMethod = BudgetServiceGrpc.getListBudgetsMethod) == null) {
          BudgetServiceGrpc.getListBudgetsMethod =
              getListBudgetsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.budgets.v1.ListBudgetsRequest,
                          com.google.cloud.billing.budgets.v1.ListBudgetsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBudgets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.ListBudgetsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.ListBudgetsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new BudgetServiceMethodDescriptorSupplier("ListBudgets"))
                      .build();
        }
      }
    }
    return getListBudgetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.DeleteBudgetRequest, com.google.protobuf.Empty>
      getDeleteBudgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBudget",
      requestType = com.google.cloud.billing.budgets.v1.DeleteBudgetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.billing.budgets.v1.DeleteBudgetRequest, com.google.protobuf.Empty>
      getDeleteBudgetMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.billing.budgets.v1.DeleteBudgetRequest, com.google.protobuf.Empty>
        getDeleteBudgetMethod;
    if ((getDeleteBudgetMethod = BudgetServiceGrpc.getDeleteBudgetMethod) == null) {
      synchronized (BudgetServiceGrpc.class) {
        if ((getDeleteBudgetMethod = BudgetServiceGrpc.getDeleteBudgetMethod) == null) {
          BudgetServiceGrpc.getDeleteBudgetMethod =
              getDeleteBudgetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.billing.budgets.v1.DeleteBudgetRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBudget"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.billing.budgets.v1.DeleteBudgetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new BudgetServiceMethodDescriptorSupplier("DeleteBudget"))
                      .build();
        }
      }
    }
    return getDeleteBudgetMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static BudgetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BudgetServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<BudgetServiceStub>() {
          @java.lang.Override
          public BudgetServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new BudgetServiceStub(channel, callOptions);
          }
        };
    return BudgetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BudgetServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BudgetServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<BudgetServiceBlockingStub>() {
          @java.lang.Override
          public BudgetServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new BudgetServiceBlockingStub(channel, callOptions);
          }
        };
    return BudgetServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static BudgetServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BudgetServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<BudgetServiceFutureStub>() {
          @java.lang.Override
          public BudgetServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new BudgetServiceFutureStub(channel, callOptions);
          }
        };
    return BudgetServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class BudgetServiceImplBase implements io.grpc.BindableService {

    /** */
    public void createBudget(
        com.google.cloud.billing.budgets.v1.CreateBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBudgetMethod(), responseObserver);
    }

    /** */
    public void updateBudget(
        com.google.cloud.billing.budgets.v1.UpdateBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBudgetMethod(), responseObserver);
    }

    /** */
    public void getBudget(
        com.google.cloud.billing.budgets.v1.GetBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBudgetMethod(), responseObserver);
    }

    /** */
    public void listBudgets(
        com.google.cloud.billing.budgets.v1.ListBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.ListBudgetsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListBudgetsMethod(), responseObserver);
    }

    /** */
    public void deleteBudget(
        com.google.cloud.billing.budgets.v1.DeleteBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBudgetMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateBudgetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.budgets.v1.CreateBudgetRequest,
                      com.google.cloud.billing.budgets.v1.Budget>(this, METHODID_CREATE_BUDGET)))
          .addMethod(
              getUpdateBudgetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.budgets.v1.UpdateBudgetRequest,
                      com.google.cloud.billing.budgets.v1.Budget>(this, METHODID_UPDATE_BUDGET)))
          .addMethod(
              getGetBudgetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.budgets.v1.GetBudgetRequest,
                      com.google.cloud.billing.budgets.v1.Budget>(this, METHODID_GET_BUDGET)))
          .addMethod(
              getListBudgetsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.budgets.v1.ListBudgetsRequest,
                      com.google.cloud.billing.budgets.v1.ListBudgetsResponse>(
                      this, METHODID_LIST_BUDGETS)))
          .addMethod(
              getDeleteBudgetMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.billing.budgets.v1.DeleteBudgetRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_BUDGET)))
          .build();
    }
  }

  /** */
  public static final class BudgetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BudgetServiceStub> {
    private BudgetServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BudgetServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BudgetServiceStub(channel, callOptions);
    }

    /** */
    public void createBudget(
        com.google.cloud.billing.budgets.v1.CreateBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBudgetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateBudget(
        com.google.cloud.billing.budgets.v1.UpdateBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBudgetMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getBudget(
        com.google.cloud.billing.budgets.v1.GetBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBudgetMethod(), getCallOptions()), request, responseObserver);
    }

    /** */
    public void listBudgets(
        com.google.cloud.billing.budgets.v1.ListBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.ListBudgetsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBudgetsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteBudget(
        com.google.cloud.billing.budgets.v1.DeleteBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBudgetMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class BudgetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BudgetServiceBlockingStub> {
    private BudgetServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BudgetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BudgetServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.billing.budgets.v1.Budget createBudget(
        com.google.cloud.billing.budgets.v1.CreateBudgetRequest request) {
      return blockingUnaryCall(getChannel(), getCreateBudgetMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.budgets.v1.Budget updateBudget(
        com.google.cloud.billing.budgets.v1.UpdateBudgetRequest request) {
      return blockingUnaryCall(getChannel(), getUpdateBudgetMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.budgets.v1.Budget getBudget(
        com.google.cloud.billing.budgets.v1.GetBudgetRequest request) {
      return blockingUnaryCall(getChannel(), getGetBudgetMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.billing.budgets.v1.ListBudgetsResponse listBudgets(
        com.google.cloud.billing.budgets.v1.ListBudgetsRequest request) {
      return blockingUnaryCall(getChannel(), getListBudgetsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteBudget(
        com.google.cloud.billing.budgets.v1.DeleteBudgetRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteBudgetMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class BudgetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BudgetServiceFutureStub> {
    private BudgetServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BudgetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BudgetServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.budgets.v1.Budget>
        createBudget(com.google.cloud.billing.budgets.v1.CreateBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBudgetMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.budgets.v1.Budget>
        updateBudget(com.google.cloud.billing.budgets.v1.UpdateBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBudgetMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.budgets.v1.Budget>
        getBudget(com.google.cloud.billing.budgets.v1.GetBudgetRequest request) {
      return futureUnaryCall(getChannel().newCall(getGetBudgetMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.billing.budgets.v1.ListBudgetsResponse>
        listBudgets(com.google.cloud.billing.budgets.v1.ListBudgetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBudgetsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteBudget(com.google.cloud.billing.budgets.v1.DeleteBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBudgetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BUDGET = 0;
  private static final int METHODID_UPDATE_BUDGET = 1;
  private static final int METHODID_GET_BUDGET = 2;
  private static final int METHODID_LIST_BUDGETS = 3;
  private static final int METHODID_DELETE_BUDGET = 4;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BudgetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BudgetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BUDGET:
          serviceImpl.createBudget(
              (com.google.cloud.billing.budgets.v1.CreateBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget>)
                  responseObserver);
          break;
        case METHODID_UPDATE_BUDGET:
          serviceImpl.updateBudget(
              (com.google.cloud.billing.budgets.v1.UpdateBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget>)
                  responseObserver);
          break;
        case METHODID_GET_BUDGET:
          serviceImpl.getBudget(
              (com.google.cloud.billing.budgets.v1.GetBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.Budget>)
                  responseObserver);
          break;
        case METHODID_LIST_BUDGETS:
          serviceImpl.listBudgets(
              (com.google.cloud.billing.budgets.v1.ListBudgetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.budgets.v1.ListBudgetsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_BUDGET:
          serviceImpl.deleteBudget(
              (com.google.cloud.billing.budgets.v1.DeleteBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private abstract static class BudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BudgetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.billing.budgets.v1.BudgetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BudgetService");
    }
  }

  private static final class BudgetServiceFileDescriptorSupplier
      extends BudgetServiceBaseDescriptorSupplier {
    BudgetServiceFileDescriptorSupplier() {}
  }

  private static final class BudgetServiceMethodDescriptorSupplier
      extends BudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BudgetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BudgetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new BudgetServiceFileDescriptorSupplier())
                      .addMethod(getCreateBudgetMethod())
                      .addMethod(getUpdateBudgetMethod())
                      .addMethod(getGetBudgetMethod())
                      .addMethod(getListBudgetsMethod())
                      .addMethod(getDeleteBudgetMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
