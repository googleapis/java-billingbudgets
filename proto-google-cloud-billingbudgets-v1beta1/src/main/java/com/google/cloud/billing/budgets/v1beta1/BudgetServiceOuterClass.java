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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1beta1/budget_service.proto

package com.google.cloud.billing.budgets.v1beta1;

public final class BudgetServiceOuterClass {
  private BudgetServiceOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1beta1_UpdateBudgetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1beta1_UpdateBudgetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1beta1_GetBudgetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1beta1_GetBudgetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1beta1_DeleteBudgetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1beta1_DeleteBudgetRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/billing/budgets/v1beta1/b"
          + "udget_service.proto\022$google.cloud.billin"
          + "g.budgets.v1beta1\032\034google/api/annotation"
          + "s.proto\032\027google/api/client.proto\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\0327google/cloud/billing/budge"
          + "ts/v1beta1/budget_model.proto\032\033google/pr"
          + "otobuf/empty.proto\032 google/protobuf/fiel"
          + "d_mask.proto\"\226\001\n\023CreateBudgetRequest\022<\n\006"
          + "parent\030\001 \001(\tB,\340A\002\372A&\022$billingbudgets.goo"
          + "gleapis.com/Budget\022A\n\006budget\030\002 \001(\0132,.goo"
          + "gle.cloud.billing.budgets.v1beta1.Budget"
          + "B\003\340A\002\"\216\001\n\023UpdateBudgetRequest\022A\n\006budget\030"
          + "\001 \001(\0132,.google.cloud.billing.budgets.v1b"
          + "eta1.BudgetB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032."
          + "google.protobuf.FieldMaskB\003\340A\001\"N\n\020GetBud"
          + "getRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$billin"
          + "gbudgets.googleapis.com/Budget\"\203\001\n\022ListB"
          + "udgetsRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$b"
          + "illingbudgets.googleapis.com/Budget\022\026\n\tp"
          + "age_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB"
          + "\003\340A\001\"m\n\023ListBudgetsResponse\022=\n\007budgets\030\001"
          + " \003(\0132,.google.cloud.billing.budgets.v1be"
          + "ta1.Budget\022\027\n\017next_page_token\030\002 \001(\t\"Q\n\023D"
          + "eleteBudgetRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&"
          + "\n$billingbudgets.googleapis.com/Budget2\311"
          + "\007\n\rBudgetService\022\257\001\n\014CreateBudget\0229.goog"
          + "le.cloud.billing.budgets.v1beta1.CreateB"
          + "udgetRequest\032,.google.cloud.billing.budg"
          + "ets.v1beta1.Budget\"6\202\323\344\223\0020\"+/v1beta1/{pa"
          + "rent=billingAccounts/*}/budgets:\001*\022\266\001\n\014U"
          + "pdateBudget\0229.google.cloud.billing.budge"
          + "ts.v1beta1.UpdateBudgetRequest\032,.google."
          + "cloud.billing.budgets.v1beta1.Budget\"=\202\323"
          + "\344\223\002722/v1beta1/{budget.name=billingAccou"
          + "nts/*/budgets/*}:\001*\022\246\001\n\tGetBudget\0226.goog"
          + "le.cloud.billing.budgets.v1beta1.GetBudg"
          + "etRequest\032,.google.cloud.billing.budgets"
          + ".v1beta1.Budget\"3\202\323\344\223\002-\022+/v1beta1/{name="
          + "billingAccounts/*/budgets/*}\022\267\001\n\013ListBud"
          + "gets\0228.google.cloud.billing.budgets.v1be"
          + "ta1.ListBudgetsRequest\0329.google.cloud.bi"
          + "lling.budgets.v1beta1.ListBudgetsRespons"
          + "e\"3\202\323\344\223\002-\022+/v1beta1/{parent=billingAccou"
          + "nts/*}/budgets\022\226\001\n\014DeleteBudget\0229.google"
          + ".cloud.billing.budgets.v1beta1.DeleteBud"
          + "getRequest\032\026.google.protobuf.Empty\"3\202\323\344\223"
          + "\002-*+/v1beta1/{name=billingAccounts/*/bud"
          + "gets/*}\032Q\312A\035billingbudgets.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformBy\n(com.google.cloud.billing.b"
          + "udgets.v1beta1P\001ZKgoogle.golang.org/genp"
          + "roto/googleapis/cloud/billing/budgets/v1"
          + "beta1;budgetsb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.billing.budgets.v1beta1.BudgetModel.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1beta1_CreateBudgetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Budget",
            });
    internal_static_google_cloud_billing_budgets_v1beta1_UpdateBudgetRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_billing_budgets_v1beta1_UpdateBudgetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1beta1_UpdateBudgetRequest_descriptor,
            new java.lang.String[] {
              "Budget", "UpdateMask",
            });
    internal_static_google_cloud_billing_budgets_v1beta1_GetBudgetRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_billing_budgets_v1beta1_GetBudgetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1beta1_GetBudgetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_descriptor,
            new java.lang.String[] {
              "Budgets", "NextPageToken",
            });
    internal_static_google_cloud_billing_budgets_v1beta1_DeleteBudgetRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_billing_budgets_v1beta1_DeleteBudgetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1beta1_DeleteBudgetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.billing.budgets.v1beta1.BudgetModel.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
