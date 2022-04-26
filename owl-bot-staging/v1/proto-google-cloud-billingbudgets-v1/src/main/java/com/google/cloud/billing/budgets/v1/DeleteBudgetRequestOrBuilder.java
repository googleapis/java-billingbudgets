// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1/budget_service.proto

package com.google.cloud.billing.budgets.v1;

public interface DeleteBudgetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1.DeleteBudgetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the budget to delete. Values are of the form
   * `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the budget to delete. Values are of the form
   * `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
