// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1/budget_service.proto

package com.google.cloud.billing.budgets.v1;

public interface CreateBudgetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1.CreateBudgetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the billing account to create the budget in. Values
   * are of the form `billingAccounts/{billingAccountId}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the billing account to create the budget in. Values
   * are of the form `billingAccounts/{billingAccountId}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Budget to create.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the budget field is set.
   */
  boolean hasBudget();
  /**
   * <pre>
   * Required. Budget to create.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The budget.
   */
  com.google.cloud.billing.budgets.v1.Budget getBudget();
  /**
   * <pre>
   * Required. Budget to create.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.Budget budget = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.billing.budgets.v1.BudgetOrBuilder getBudgetOrBuilder();
}
