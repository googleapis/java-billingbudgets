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
// source: google/cloud/billing/budgets/v1/budget_model.proto

package com.google.cloud.billing.budgets.v1;

public final class BudgetModelProto {
  private BudgetModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_Budget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_Budget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_BudgetAmount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_BudgetAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_ThresholdRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_NotificationsRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_NotificationsRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_Filter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_Filter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_billing_budgets_v1_CustomPeriod_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "2google/cloud/billing/budgets/v1/budget_model.proto\022\037google.cloud.billing.budgets.v1\032\037google/api/field_behavior.proto\032\031google/api/resource.proto\032\034google/protobuf/struct.proto\032\026google/type/date.proto\032\027google/type/money.proto\"\317\003\n"
          + "\006Budget\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\024\n"
          + "\014display_name\030\002 \001(\t\022C\n\r"
          + "budget_filter\030\003"
          + " \001(\0132\'.google.cloud.billing.budgets.v1.FilterB\003\340A\001\022B\n"
          + "\006amount\030\004"
          + " \001(\0132-.google.cloud.billing.budgets.v1.BudgetAmountB\003\340A\002\022L\n"
          + "\017threshold_rules\030\005"
          + " \003(\0132..google.cloud.billing.budgets.v1.ThresholdRuleB\003\340A\001\022S\n"
          + "\022notifications_rule\030\006"
          + " \001(\01322.google.cloud.billing.budgets.v1.NotificationsRuleB\003\340A\001\022\021\n"
          + "\004etag\030\007 \001(\tB\003\340A\001:]\352AZ\n"
          + "$billingbudgets.googleapis.com/Budget\0222billingAccounts/{billing_account}/budgets/{budget}\"\240\001\n"
          + "\014BudgetAmount\022.\n"
          + "\020specified_amount\030\001 \001(\0132\022.google.type.MoneyH\000\022O\n"
          + "\022last_period_amount\030\002"
          + " \001(\01321.google.cloud.billing.budgets.v1.LastPeriodAmountH\000B\017\n\r"
          + "budget_amount\"\022\n"
          + "\020LastPeriodAmount\"\310\001\n\r"
          + "ThresholdRule\022\036\n"
          + "\021threshold_percent\030\001 \001(\001B\003\340A\002\022N\n"
          + "\013spend_basis\030\002"
          + " \001(\01624.google.cloud.billing.budgets.v1.ThresholdRule.BasisB\003\340A\001\"G\n"
          + "\005Basis\022\025\n"
          + "\021BASIS_UNSPECIFIED\020\000\022\021\n\r"
          + "CURRENT_SPEND\020\001\022\024\n"
          + "\020FORECASTED_SPEND\020\002\"\247\001\n"
          + "\021NotificationsRule\022\031\n"
          + "\014pubsub_topic\030\001 \001(\tB\003\340A\001\022\033\n"
          + "\016schema_version\030\002 \001(\tB\003\340A\001\022-\n"
          + " monitoring_notification_channels\030\003 \003(\tB\003\340A\001\022+\n"
          + "\036disable_default_iam_recipients\030\004 \001(\010B\003\340A\001\"\243\005\n"
          + "\006Filter\022\025\n"
          + "\010projects\030\001 \003(\tB\003\340A\001\022\031\n"
          + "\014credit_types\030\007 \003(\tB\003\340A\001\022a\n"
          + "\026credit_types_treatment\030\004"
          + " \001(\0162<.google.cloud.billing.budgets.v1.Filter.CreditTypesTreatmentB\003\340A\001\022\025\n"
          + "\010services\030\003 \003(\tB\003\340A\001\022\030\n"
          + "\013subaccounts\030\005 \003(\tB\003\340A\001\022H\n"
          + "\006labels\030\006"
          + " \003(\01323.google.cloud.billing.budgets.v1.Filter.LabelsEntryB\003\340A\001\022O\n"
          + "\017calendar_period\030\010"
          + " \001(\0162/.google.cloud.billing.budgets.v1.CalendarPeriodB\003\340A\001H\000\022K\n\r"
          + "custom_period\030\t"
          + " \001(\0132-.google.cloud.billing.budgets.v1.CustomPeriodB\003\340A\001H\000\032I\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022)\n"
          + "\005value\030\002 \001(\0132\032.google.protobuf.ListValue:\0028\001\"\217\001\n"
          + "\024CreditTypesTreatment\022&\n"
          + "\"CREDIT_TYPES_TREATMENT_UNSPECIFIED\020\000\022\027\n"
          + "\023INCLUDE_ALL_CREDITS\020\001\022\027\n"
          + "\023EXCLUDE_ALL_CREDITS\020\002\022\035\n"
          + "\031INCLUDE_SPECIFIED_CREDITS\020\003B\016\n"
          + "\014usage_period\"d\n"
          + "\014CustomPeriod\022*\n\n"
          + "start_date\030\001 \001(\0132\021.google.type.DateB\003\340A\002\022(\n"
          + "\010end_date\030\002 \001(\0132\021.google.type.DateB\003\340A\001*S\n"
          + "\016CalendarPeriod\022\037\n"
          + "\033CALENDAR_PERIOD_UNSPECIFIED\020\000\022\t\n"
          + "\005MONTH\020\001\022\013\n"
          + "\007QUARTER\020\002\022\010\n"
          + "\004YEAR\020\003B\201\001\n"
          + "#com.google.cloud.billing.budgets.v1B\020BudgetM"
          + "odelProtoP\001ZFgoogle.golang.org/genproto/googleapis/cloud/billing/budgets/v1;budg"
          + "etsb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_cloud_billing_budgets_v1_Budget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_billing_budgets_v1_Budget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_Budget_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "BudgetFilter",
              "Amount",
              "ThresholdRules",
              "NotificationsRule",
              "Etag",
            });
    internal_static_google_cloud_billing_budgets_v1_BudgetAmount_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_billing_budgets_v1_BudgetAmount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_BudgetAmount_descriptor,
            new java.lang.String[] {
              "SpecifiedAmount", "LastPeriodAmount", "BudgetAmount",
            });
    internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_LastPeriodAmount_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_billing_budgets_v1_ThresholdRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor,
            new java.lang.String[] {
              "ThresholdPercent", "SpendBasis",
            });
    internal_static_google_cloud_billing_budgets_v1_NotificationsRule_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_billing_budgets_v1_NotificationsRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_NotificationsRule_descriptor,
            new java.lang.String[] {
              "PubsubTopic",
              "SchemaVersion",
              "MonitoringNotificationChannels",
              "DisableDefaultIamRecipients",
            });
    internal_static_google_cloud_billing_budgets_v1_Filter_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_billing_budgets_v1_Filter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_Filter_descriptor,
            new java.lang.String[] {
              "Projects",
              "CreditTypes",
              "CreditTypesTreatment",
              "Services",
              "Subaccounts",
              "Labels",
              "CalendarPeriod",
              "CustomPeriod",
              "UsagePeriod",
            });
    internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_descriptor =
        internal_static_google_cloud_billing_budgets_v1_Filter_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_Filter_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_billing_budgets_v1_CustomPeriod_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_billing_budgets_v1_CustomPeriod_descriptor,
            new java.lang.String[] {
              "StartDate", "EndDate",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
