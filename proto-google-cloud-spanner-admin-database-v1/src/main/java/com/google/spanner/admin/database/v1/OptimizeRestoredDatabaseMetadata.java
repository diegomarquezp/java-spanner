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
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.spanner.admin.database.v1;

/**
 *
 *
 * <pre>
 * Metadata type for the long-running operation used to track the progress
 * of optimizations performed on a newly restored database. This long-running
 * operation is automatically created by the system after the successful
 * completion of a database restore, and cannot be cancelled.
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata}
 */
public final class OptimizeRestoredDatabaseMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata)
    OptimizeRestoredDatabaseMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OptimizeRestoredDatabaseMetadata.newBuilder() to construct.
  private OptimizeRestoredDatabaseMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OptimizeRestoredDatabaseMetadata() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OptimizeRestoredDatabaseMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_OptimizeRestoredDatabaseMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_OptimizeRestoredDatabaseMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata.class,
            com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of the restored database being optimized.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the restored database being optimized.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROGRESS_FIELD_NUMBER = 2;
  private com.google.spanner.admin.database.v1.OperationProgress progress_;
  /**
   *
   *
   * <pre>
   * The progress of the post-restore optimizations.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
   *
   * @return Whether the progress field is set.
   */
  @java.lang.Override
  public boolean hasProgress() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The progress of the post-restore optimizations.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
   *
   * @return The progress.
   */
  @java.lang.Override
  public com.google.spanner.admin.database.v1.OperationProgress getProgress() {
    return progress_ == null
        ? com.google.spanner.admin.database.v1.OperationProgress.getDefaultInstance()
        : progress_;
  }
  /**
   *
   *
   * <pre>
   * The progress of the post-restore optimizations.
   * </pre>
   *
   * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
   */
  @java.lang.Override
  public com.google.spanner.admin.database.v1.OperationProgressOrBuilder getProgressOrBuilder() {
    return progress_ == null
        ? com.google.spanner.admin.database.v1.OperationProgress.getDefaultInstance()
        : progress_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getProgress());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProgress());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata other =
        (com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasProgress() != other.hasProgress()) return false;
    if (hasProgress()) {
      if (!getProgress().equals(other.getProgress())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasProgress()) {
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Metadata type for the long-running operation used to track the progress
   * of optimizations performed on a newly restored database. This long-running
   * operation is automatically created by the system after the successful
   * completion of a database restore, and cannot be cancelled.
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata)
      com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_OptimizeRestoredDatabaseMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_OptimizeRestoredDatabaseMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata.class,
              com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata.Builder.class);
    }

    // Construct using
    // com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProgressFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      progress_ = null;
      if (progressBuilder_ != null) {
        progressBuilder_.dispose();
        progressBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_OptimizeRestoredDatabaseMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
        getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata build() {
      com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata buildPartial() {
      com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata result =
          new com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.progress_ = progressBuilder_ == null ? progress_ : progressBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata) {
        return mergeFrom(
            (com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata other) {
      if (other
          == com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasProgress()) {
        mergeProgress(other.getProgress());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getProgressFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the restored database being optimized.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the restored database being optimized.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the restored database being optimized.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the restored database being optimized.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the restored database being optimized.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.spanner.admin.database.v1.OperationProgress progress_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.admin.database.v1.OperationProgress,
            com.google.spanner.admin.database.v1.OperationProgress.Builder,
            com.google.spanner.admin.database.v1.OperationProgressOrBuilder>
        progressBuilder_;
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     *
     * @return Whether the progress field is set.
     */
    public boolean hasProgress() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     *
     * @return The progress.
     */
    public com.google.spanner.admin.database.v1.OperationProgress getProgress() {
      if (progressBuilder_ == null) {
        return progress_ == null
            ? com.google.spanner.admin.database.v1.OperationProgress.getDefaultInstance()
            : progress_;
      } else {
        return progressBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     */
    public Builder setProgress(com.google.spanner.admin.database.v1.OperationProgress value) {
      if (progressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        progress_ = value;
      } else {
        progressBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     */
    public Builder setProgress(
        com.google.spanner.admin.database.v1.OperationProgress.Builder builderForValue) {
      if (progressBuilder_ == null) {
        progress_ = builderForValue.build();
      } else {
        progressBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     */
    public Builder mergeProgress(com.google.spanner.admin.database.v1.OperationProgress value) {
      if (progressBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && progress_ != null
            && progress_
                != com.google.spanner.admin.database.v1.OperationProgress.getDefaultInstance()) {
          getProgressBuilder().mergeFrom(value);
        } else {
          progress_ = value;
        }
      } else {
        progressBuilder_.mergeFrom(value);
      }
      if (progress_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     */
    public Builder clearProgress() {
      bitField0_ = (bitField0_ & ~0x00000002);
      progress_ = null;
      if (progressBuilder_ != null) {
        progressBuilder_.dispose();
        progressBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     */
    public com.google.spanner.admin.database.v1.OperationProgress.Builder getProgressBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProgressFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     */
    public com.google.spanner.admin.database.v1.OperationProgressOrBuilder getProgressOrBuilder() {
      if (progressBuilder_ != null) {
        return progressBuilder_.getMessageOrBuilder();
      } else {
        return progress_ == null
            ? com.google.spanner.admin.database.v1.OperationProgress.getDefaultInstance()
            : progress_;
      }
    }
    /**
     *
     *
     * <pre>
     * The progress of the post-restore optimizations.
     * </pre>
     *
     * <code>.google.spanner.admin.database.v1.OperationProgress progress = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.admin.database.v1.OperationProgress,
            com.google.spanner.admin.database.v1.OperationProgress.Builder,
            com.google.spanner.admin.database.v1.OperationProgressOrBuilder>
        getProgressFieldBuilder() {
      if (progressBuilder_ == null) {
        progressBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.spanner.admin.database.v1.OperationProgress,
                com.google.spanner.admin.database.v1.OperationProgress.Builder,
                com.google.spanner.admin.database.v1.OperationProgressOrBuilder>(
                getProgress(), getParentForChildren(), isClean());
        progress_ = null;
      }
      return progressBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata)
  private static final com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata();
  }

  public static com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptimizeRestoredDatabaseMetadata> PARSER =
      new com.google.protobuf.AbstractParser<OptimizeRestoredDatabaseMetadata>() {
        @java.lang.Override
        public OptimizeRestoredDatabaseMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<OptimizeRestoredDatabaseMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptimizeRestoredDatabaseMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.OptimizeRestoredDatabaseMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
