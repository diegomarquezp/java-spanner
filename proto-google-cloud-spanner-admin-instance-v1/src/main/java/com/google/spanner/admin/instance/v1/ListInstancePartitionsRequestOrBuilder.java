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
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.spanner.admin.instance.v1;

public interface ListInstancePartitionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.ListInstancePartitionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The instance whose instance partitions should be listed. Values
   * are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The instance whose instance partitions should be listed. Values
   * are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Number of instance partitions to be returned in the response. If 0 or less,
   * defaults to the server's maximum allowed page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` should contain a
   * [next_page_token][google.spanner.admin.instance.v1.ListInstancePartitionsResponse.next_page_token]
   * from a previous
   * [ListInstancePartitionsResponse][google.spanner.admin.instance.v1.ListInstancePartitionsResponse].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` should contain a
   * [next_page_token][google.spanner.admin.instance.v1.ListInstancePartitionsResponse.next_page_token]
   * from a previous
   * [ListInstancePartitionsResponse][google.spanner.admin.instance.v1.ListInstancePartitionsResponse].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Deadline used while retrieving metadata for instance partitions.
   * Instance partitions whose metadata cannot be retrieved within this deadline
   * will be added to
   * [unreachable][google.spanner.admin.instance.v1.ListInstancePartitionsResponse.unreachable]
   * in
   * [ListInstancePartitionsResponse][google.spanner.admin.instance.v1.ListInstancePartitionsResponse].
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp instance_partition_deadline = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the instancePartitionDeadline field is set.
   */
  boolean hasInstancePartitionDeadline();
  /**
   *
   *
   * <pre>
   * Optional. Deadline used while retrieving metadata for instance partitions.
   * Instance partitions whose metadata cannot be retrieved within this deadline
   * will be added to
   * [unreachable][google.spanner.admin.instance.v1.ListInstancePartitionsResponse.unreachable]
   * in
   * [ListInstancePartitionsResponse][google.spanner.admin.instance.v1.ListInstancePartitionsResponse].
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp instance_partition_deadline = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The instancePartitionDeadline.
   */
  com.google.protobuf.Timestamp getInstancePartitionDeadline();
  /**
   *
   *
   * <pre>
   * Optional. Deadline used while retrieving metadata for instance partitions.
   * Instance partitions whose metadata cannot be retrieved within this deadline
   * will be added to
   * [unreachable][google.spanner.admin.instance.v1.ListInstancePartitionsResponse.unreachable]
   * in
   * [ListInstancePartitionsResponse][google.spanner.admin.instance.v1.ListInstancePartitionsResponse].
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp instance_partition_deadline = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getInstancePartitionDeadlineOrBuilder();
}
