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
// source: google/spanner/admin/database/v1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.spanner.admin.database.v1;

public interface EncryptionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.EncryptionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Cloud KMS key to be used for encrypting and decrypting
   * the database. Values are of the form
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys/&lt;kms_key_name&gt;`.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * The Cloud KMS key to be used for encrypting and decrypting
   * the database. Values are of the form
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys/&lt;kms_key_name&gt;`.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies the KMS configuration for the one or more keys used to encrypt
   * the database. Values are of the form
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys/&lt;kms_key_name&gt;`.
   *
   * The keys referenced by kms_key_names must fully cover all
   * regions of the database instance configuration. Some examples:
   * * For single region database instance configs, specify a single regional
   * location KMS key.
   * * For multi-regional database instance configs of type GOOGLE_MANAGED,
   * either specify a multi-regional location KMS key or multiple regional
   * location KMS keys that cover all regions in the instance config.
   * * For a database instance config of type USER_MANAGED, please specify only
   * regional location KMS keys to cover each region in the instance config.
   * Multi-regional location KMS keys are not supported for USER_MANAGED
   * instance configs.
   * </pre>
   *
   * <code>repeated string kms_key_names = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the kmsKeyNames.
   */
  java.util.List<java.lang.String> getKmsKeyNamesList();
  /**
   *
   *
   * <pre>
   * Specifies the KMS configuration for the one or more keys used to encrypt
   * the database. Values are of the form
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys/&lt;kms_key_name&gt;`.
   *
   * The keys referenced by kms_key_names must fully cover all
   * regions of the database instance configuration. Some examples:
   * * For single region database instance configs, specify a single regional
   * location KMS key.
   * * For multi-regional database instance configs of type GOOGLE_MANAGED,
   * either specify a multi-regional location KMS key or multiple regional
   * location KMS keys that cover all regions in the instance config.
   * * For a database instance config of type USER_MANAGED, please specify only
   * regional location KMS keys to cover each region in the instance config.
   * Multi-regional location KMS keys are not supported for USER_MANAGED
   * instance configs.
   * </pre>
   *
   * <code>repeated string kms_key_names = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of kmsKeyNames.
   */
  int getKmsKeyNamesCount();
  /**
   *
   *
   * <pre>
   * Specifies the KMS configuration for the one or more keys used to encrypt
   * the database. Values are of the form
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys/&lt;kms_key_name&gt;`.
   *
   * The keys referenced by kms_key_names must fully cover all
   * regions of the database instance configuration. Some examples:
   * * For single region database instance configs, specify a single regional
   * location KMS key.
   * * For multi-regional database instance configs of type GOOGLE_MANAGED,
   * either specify a multi-regional location KMS key or multiple regional
   * location KMS keys that cover all regions in the instance config.
   * * For a database instance config of type USER_MANAGED, please specify only
   * regional location KMS keys to cover each region in the instance config.
   * Multi-regional location KMS keys are not supported for USER_MANAGED
   * instance configs.
   * </pre>
   *
   * <code>repeated string kms_key_names = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The kmsKeyNames at the given index.
   */
  java.lang.String getKmsKeyNames(int index);
  /**
   *
   *
   * <pre>
   * Specifies the KMS configuration for the one or more keys used to encrypt
   * the database. Values are of the form
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys/&lt;kms_key_name&gt;`.
   *
   * The keys referenced by kms_key_names must fully cover all
   * regions of the database instance configuration. Some examples:
   * * For single region database instance configs, specify a single regional
   * location KMS key.
   * * For multi-regional database instance configs of type GOOGLE_MANAGED,
   * either specify a multi-regional location KMS key or multiple regional
   * location KMS keys that cover all regions in the instance config.
   * * For a database instance config of type USER_MANAGED, please specify only
   * regional location KMS keys to cover each region in the instance config.
   * Multi-regional location KMS keys are not supported for USER_MANAGED
   * instance configs.
   * </pre>
   *
   * <code>repeated string kms_key_names = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the kmsKeyNames at the given index.
   */
  com.google.protobuf.ByteString getKmsKeyNamesBytes(int index);
}
