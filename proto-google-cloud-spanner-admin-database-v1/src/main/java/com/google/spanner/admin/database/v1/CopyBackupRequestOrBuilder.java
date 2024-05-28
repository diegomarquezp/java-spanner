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
// source: google/spanner/admin/database/v1/backup.proto

// Protobuf Java Version: 3.25.2
package com.google.spanner.admin.database.v1;

public interface CopyBackupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.CopyBackupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the destination instance that will contain the backup
   * copy. Values are of the form: `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
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
   * Required. The name of the destination instance that will contain the backup
   * copy. Values are of the form: `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
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
   * Required. The id of the backup copy.
   * The `backup_id` appended to `parent` forms the full backup_uri of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup&gt;`.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupId.
   */
  java.lang.String getBackupId();
  /**
   *
   *
   * <pre>
   * Required. The id of the backup copy.
   * The `backup_id` appended to `parent` forms the full backup_uri of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup&gt;`.
   * </pre>
   *
   * <code>string backup_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupId.
   */
  com.google.protobuf.ByteString getBackupIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The source backup to be copied.
   * The source backup needs to be in READY state for it to be copied.
   * Once CopyBackup is in progress, the source backup cannot be deleted or
   * cleaned up on expiration until CopyBackup is finished.
   * Values are of the form:
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup&gt;`.
   * </pre>
   *
   * <code>
   * string source_backup = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The sourceBackup.
   */
  java.lang.String getSourceBackup();
  /**
   *
   *
   * <pre>
   * Required. The source backup to be copied.
   * The source backup needs to be in READY state for it to be copied.
   * Once CopyBackup is in progress, the source backup cannot be deleted or
   * cleaned up on expiration until CopyBackup is finished.
   * Values are of the form:
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/backups/&lt;backup&gt;`.
   * </pre>
   *
   * <code>
   * string source_backup = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for sourceBackup.
   */
  com.google.protobuf.ByteString getSourceBackupBytes();

  /**
   *
   *
   * <pre>
   * Required. The expiration time of the backup in microsecond granularity.
   * The expiration time must be at least 6 hours and at most 366 days
   * from the `create_time` of the source backup. Once the `expire_time` has
   * passed, the backup is eligible to be automatically deleted by Cloud Spanner
   * to free the resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Required. The expiration time of the backup in microsecond granularity.
   * The expiration time must be at least 6 hours and at most 366 days
   * from the `create_time` of the source backup. Once the `expire_time` has
   * passed, the backup is eligible to be automatically deleted by Cloud Spanner
   * to free the resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Required. The expiration time of the backup in microsecond granularity.
   * The expiration time must be at least 6 hours and at most 366 days
   * from the `create_time` of the source backup. Once the `expire_time` has
   * passed, the backup is eligible to be automatically deleted by Cloud Spanner
   * to free the resources used by the backup.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The encryption configuration used to encrypt the backup. If this
   * field is not specified, the backup will use the same encryption
   * configuration as the source backup by default, namely
   * [encryption_type][google.spanner.admin.database.v1.CopyBackupEncryptionConfig.encryption_type]
   * = `USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.CopyBackupEncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption configuration used to encrypt the backup. If this
   * field is not specified, the backup will use the same encryption
   * configuration as the source backup by default, namely
   * [encryption_type][google.spanner.admin.database.v1.CopyBackupEncryptionConfig.encryption_type]
   * = `USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.CopyBackupEncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.spanner.admin.database.v1.CopyBackupEncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption configuration used to encrypt the backup. If this
   * field is not specified, the backup will use the same encryption
   * configuration as the source backup by default, namely
   * [encryption_type][google.spanner.admin.database.v1.CopyBackupEncryptionConfig.encryption_type]
   * = `USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION`.
   * </pre>
   *
   * <code>
   * .google.spanner.admin.database.v1.CopyBackupEncryptionConfig encryption_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.spanner.admin.database.v1.CopyBackupEncryptionConfigOrBuilder
      getEncryptionConfigOrBuilder();
}
