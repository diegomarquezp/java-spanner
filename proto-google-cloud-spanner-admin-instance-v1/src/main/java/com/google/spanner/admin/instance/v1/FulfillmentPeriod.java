/*
 * Copyright 2024 Google LLC
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
// source: google/spanner/admin/instance/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.spanner.admin.instance.v1;

/**
 *
 *
 * <pre>
 * Indicates the expected fulfillment period of an operation.
 * </pre>
 *
 * Protobuf enum {@code google.spanner.admin.instance.v1.FulfillmentPeriod}
 */
public enum FulfillmentPeriod implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>FULFILLMENT_PERIOD_UNSPECIFIED = 0;</code>
   */
  FULFILLMENT_PERIOD_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Normal fulfillment period. The operation is expected to complete within
   * minutes.
   * </pre>
   *
   * <code>FULFILLMENT_PERIOD_NORMAL = 1;</code>
   */
  FULFILLMENT_PERIOD_NORMAL(1),
  /**
   *
   *
   * <pre>
   * Extended fulfillment period. It can take up to an hour for the operation
   * to complete.
   * </pre>
   *
   * <code>FULFILLMENT_PERIOD_EXTENDED = 2;</code>
   */
  FULFILLMENT_PERIOD_EXTENDED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>FULFILLMENT_PERIOD_UNSPECIFIED = 0;</code>
   */
  public static final int FULFILLMENT_PERIOD_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Normal fulfillment period. The operation is expected to complete within
   * minutes.
   * </pre>
   *
   * <code>FULFILLMENT_PERIOD_NORMAL = 1;</code>
   */
  public static final int FULFILLMENT_PERIOD_NORMAL_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Extended fulfillment period. It can take up to an hour for the operation
   * to complete.
   * </pre>
   *
   * <code>FULFILLMENT_PERIOD_EXTENDED = 2;</code>
   */
  public static final int FULFILLMENT_PERIOD_EXTENDED_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static FulfillmentPeriod valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FulfillmentPeriod forNumber(int value) {
    switch (value) {
      case 0:
        return FULFILLMENT_PERIOD_UNSPECIFIED;
      case 1:
        return FULFILLMENT_PERIOD_NORMAL;
      case 2:
        return FULFILLMENT_PERIOD_EXTENDED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FulfillmentPeriod> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FulfillmentPeriod>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FulfillmentPeriod>() {
            public FulfillmentPeriod findValueByNumber(int number) {
              return FulfillmentPeriod.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.spanner.admin.instance.v1.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final FulfillmentPeriod[] VALUES = values();

  public static FulfillmentPeriod valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FulfillmentPeriod(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.spanner.admin.instance.v1.FulfillmentPeriod)
}
