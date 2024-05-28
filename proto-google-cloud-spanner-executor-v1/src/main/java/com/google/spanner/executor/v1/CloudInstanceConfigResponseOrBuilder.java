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
// source: google/spanner/executor/v1/cloud_executor.proto

// Protobuf Java Version: 3.25.2
package com.google.spanner.executor.v1;

public interface CloudInstanceConfigResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.executor.v1.CloudInstanceConfigResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of instance configs returned by ListCloudInstanceConfigsAction.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig listed_instance_configs = 1;
   * </code>
   */
  java.util.List<com.google.spanner.admin.instance.v1.InstanceConfig>
      getListedInstanceConfigsList();
  /**
   *
   *
   * <pre>
   * List of instance configs returned by ListCloudInstanceConfigsAction.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig listed_instance_configs = 1;
   * </code>
   */
  com.google.spanner.admin.instance.v1.InstanceConfig getListedInstanceConfigs(int index);
  /**
   *
   *
   * <pre>
   * List of instance configs returned by ListCloudInstanceConfigsAction.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig listed_instance_configs = 1;
   * </code>
   */
  int getListedInstanceConfigsCount();
  /**
   *
   *
   * <pre>
   * List of instance configs returned by ListCloudInstanceConfigsAction.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig listed_instance_configs = 1;
   * </code>
   */
  java.util.List<? extends com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder>
      getListedInstanceConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of instance configs returned by ListCloudInstanceConfigsAction.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.instance.v1.InstanceConfig listed_instance_configs = 1;
   * </code>
   */
  com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder getListedInstanceConfigsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * "next_page_token" can be sent in a subsequent list action
   * to fetch more of the matching data.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * "next_page_token" can be sent in a subsequent list action
   * to fetch more of the matching data.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Instance config returned by GetCloudInstanceConfigAction.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.InstanceConfig instance_config = 3;</code>
   *
   * @return Whether the instanceConfig field is set.
   */
  boolean hasInstanceConfig();
  /**
   *
   *
   * <pre>
   * Instance config returned by GetCloudInstanceConfigAction.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.InstanceConfig instance_config = 3;</code>
   *
   * @return The instanceConfig.
   */
  com.google.spanner.admin.instance.v1.InstanceConfig getInstanceConfig();
  /**
   *
   *
   * <pre>
   * Instance config returned by GetCloudInstanceConfigAction.
   * </pre>
   *
   * <code>.google.spanner.admin.instance.v1.InstanceConfig instance_config = 3;</code>
   */
  com.google.spanner.admin.instance.v1.InstanceConfigOrBuilder getInstanceConfigOrBuilder();
}
