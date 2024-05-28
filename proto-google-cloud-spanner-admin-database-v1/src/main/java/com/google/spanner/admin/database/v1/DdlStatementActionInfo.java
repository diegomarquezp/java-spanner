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
 * Action information extracted from a DDL statement. This proto is used to
 * display the brief info of the DDL statement for the operation
 * [UpdateDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdl].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.DdlStatementActionInfo}
 */
public final class DdlStatementActionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.DdlStatementActionInfo)
    DdlStatementActionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DdlStatementActionInfo.newBuilder() to construct.
  private DdlStatementActionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DdlStatementActionInfo() {
    action_ = "";
    entityType_ = "";
    entityNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DdlStatementActionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_DdlStatementActionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_DdlStatementActionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.DdlStatementActionInfo.class,
            com.google.spanner.admin.database.v1.DdlStatementActionInfo.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object action_ = "";
  /**
   *
   *
   * <pre>
   * The action for the DDL statement, e.g. CREATE, ALTER, DROP, GRANT, etc.
   * This field is a non-empty string.
   * </pre>
   *
   * <code>string action = 1;</code>
   *
   * @return The action.
   */
  @java.lang.Override
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The action for the DDL statement, e.g. CREATE, ALTER, DROP, GRANT, etc.
   * This field is a non-empty string.
   * </pre>
   *
   * <code>string action = 1;</code>
   *
   * @return The bytes for action.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      action_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entityType_ = "";
  /**
   *
   *
   * <pre>
   * The entity type for the DDL statement, e.g. TABLE, INDEX, VIEW, etc.
   * This field can be empty string for some DDL statement,
   * e.g. for statement "ANALYZE", `entity_type` = "".
   * </pre>
   *
   * <code>string entity_type = 2;</code>
   *
   * @return The entityType.
   */
  @java.lang.Override
  public java.lang.String getEntityType() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The entity type for the DDL statement, e.g. TABLE, INDEX, VIEW, etc.
   * This field can be empty string for some DDL statement,
   * e.g. for statement "ANALYZE", `entity_type` = "".
   * </pre>
   *
   * <code>string entity_type = 2;</code>
   *
   * @return The bytes for entityType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntityTypeBytes() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entityType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_NAMES_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList entityNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The entity name(s) being operated on the DDL statement.
   * E.g.
   * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
   * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
   * 3. For statement "ANALYZE", `entity_names` = [].
   * </pre>
   *
   * <code>repeated string entity_names = 3;</code>
   *
   * @return A list containing the entityNames.
   */
  public com.google.protobuf.ProtocolStringList getEntityNamesList() {
    return entityNames_;
  }
  /**
   *
   *
   * <pre>
   * The entity name(s) being operated on the DDL statement.
   * E.g.
   * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
   * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
   * 3. For statement "ANALYZE", `entity_names` = [].
   * </pre>
   *
   * <code>repeated string entity_names = 3;</code>
   *
   * @return The count of entityNames.
   */
  public int getEntityNamesCount() {
    return entityNames_.size();
  }
  /**
   *
   *
   * <pre>
   * The entity name(s) being operated on the DDL statement.
   * E.g.
   * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
   * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
   * 3. For statement "ANALYZE", `entity_names` = [].
   * </pre>
   *
   * <code>repeated string entity_names = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The entityNames at the given index.
   */
  public java.lang.String getEntityNames(int index) {
    return entityNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The entity name(s) being operated on the DDL statement.
   * E.g.
   * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
   * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
   * 3. For statement "ANALYZE", `entity_names` = [].
   * </pre>
   *
   * <code>repeated string entity_names = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the entityNames at the given index.
   */
  public com.google.protobuf.ByteString getEntityNamesBytes(int index) {
    return entityNames_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityType_);
    }
    for (int i = 0; i < entityNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, entityNames_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(action_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, action_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entityType_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < entityNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(entityNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntityNamesList().size();
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
    if (!(obj instanceof com.google.spanner.admin.database.v1.DdlStatementActionInfo)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.DdlStatementActionInfo other =
        (com.google.spanner.admin.database.v1.DdlStatementActionInfo) obj;

    if (!getAction().equals(other.getAction())) return false;
    if (!getEntityType().equals(other.getEntityType())) return false;
    if (!getEntityNamesList().equals(other.getEntityNamesList())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEntityType().hashCode();
    if (getEntityNamesCount() > 0) {
      hash = (37 * hash) + ENTITY_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getEntityNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo parseFrom(
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
      com.google.spanner.admin.database.v1.DdlStatementActionInfo prototype) {
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
   * Action information extracted from a DDL statement. This proto is used to
   * display the brief info of the DDL statement for the operation
   * [UpdateDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdl].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.DdlStatementActionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.DdlStatementActionInfo)
      com.google.spanner.admin.database.v1.DdlStatementActionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_DdlStatementActionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_DdlStatementActionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.DdlStatementActionInfo.class,
              com.google.spanner.admin.database.v1.DdlStatementActionInfo.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.DdlStatementActionInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      action_ = "";
      entityType_ = "";
      entityNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_DdlStatementActionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.DdlStatementActionInfo getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.DdlStatementActionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.DdlStatementActionInfo build() {
      com.google.spanner.admin.database.v1.DdlStatementActionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.DdlStatementActionInfo buildPartial() {
      com.google.spanner.admin.database.v1.DdlStatementActionInfo result =
          new com.google.spanner.admin.database.v1.DdlStatementActionInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.spanner.admin.database.v1.DdlStatementActionInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityType_ = entityType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        entityNames_.makeImmutable();
        result.entityNames_ = entityNames_;
      }
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
      if (other instanceof com.google.spanner.admin.database.v1.DdlStatementActionInfo) {
        return mergeFrom((com.google.spanner.admin.database.v1.DdlStatementActionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.DdlStatementActionInfo other) {
      if (other == com.google.spanner.admin.database.v1.DdlStatementActionInfo.getDefaultInstance())
        return this;
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEntityType().isEmpty()) {
        entityType_ = other.entityType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.entityNames_.isEmpty()) {
        if (entityNames_.isEmpty()) {
          entityNames_ = other.entityNames_;
          bitField0_ |= 0x00000004;
        } else {
          ensureEntityNamesIsMutable();
          entityNames_.addAll(other.entityNames_);
        }
        onChanged();
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
                action_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                entityType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureEntityNamesIsMutable();
                entityNames_.add(s);
                break;
              } // case 26
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

    private java.lang.Object action_ = "";
    /**
     *
     *
     * <pre>
     * The action for the DDL statement, e.g. CREATE, ALTER, DROP, GRANT, etc.
     * This field is a non-empty string.
     * </pre>
     *
     * <code>string action = 1;</code>
     *
     * @return The action.
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The action for the DDL statement, e.g. CREATE, ALTER, DROP, GRANT, etc.
     * This field is a non-empty string.
     * </pre>
     *
     * <code>string action = 1;</code>
     *
     * @return The bytes for action.
     */
    public com.google.protobuf.ByteString getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The action for the DDL statement, e.g. CREATE, ALTER, DROP, GRANT, etc.
     * This field is a non-empty string.
     * </pre>
     *
     * <code>string action = 1;</code>
     *
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The action for the DDL statement, e.g. CREATE, ALTER, DROP, GRANT, etc.
     * This field is a non-empty string.
     * </pre>
     *
     * <code>string action = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      action_ = getDefaultInstance().getAction();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The action for the DDL statement, e.g. CREATE, ALTER, DROP, GRANT, etc.
     * This field is a non-empty string.
     * </pre>
     *
     * <code>string action = 1;</code>
     *
     * @param value The bytes for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object entityType_ = "";
    /**
     *
     *
     * <pre>
     * The entity type for the DDL statement, e.g. TABLE, INDEX, VIEW, etc.
     * This field can be empty string for some DDL statement,
     * e.g. for statement "ANALYZE", `entity_type` = "".
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @return The entityType.
     */
    public java.lang.String getEntityType() {
      java.lang.Object ref = entityType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The entity type for the DDL statement, e.g. TABLE, INDEX, VIEW, etc.
     * This field can be empty string for some DDL statement,
     * e.g. for statement "ANALYZE", `entity_type` = "".
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @return The bytes for entityType.
     */
    public com.google.protobuf.ByteString getEntityTypeBytes() {
      java.lang.Object ref = entityType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entityType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The entity type for the DDL statement, e.g. TABLE, INDEX, VIEW, etc.
     * This field can be empty string for some DDL statement,
     * e.g. for statement "ANALYZE", `entity_type` = "".
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @param value The entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entityType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity type for the DDL statement, e.g. TABLE, INDEX, VIEW, etc.
     * This field can be empty string for some DDL statement,
     * e.g. for statement "ANALYZE", `entity_type` = "".
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityType() {
      entityType_ = getDefaultInstance().getEntityType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity type for the DDL statement, e.g. TABLE, INDEX, VIEW, etc.
     * This field can be empty string for some DDL statement,
     * e.g. for statement "ANALYZE", `entity_type` = "".
     * </pre>
     *
     * <code>string entity_type = 2;</code>
     *
     * @param value The bytes for entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entityType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList entityNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureEntityNamesIsMutable() {
      if (!entityNames_.isModifiable()) {
        entityNames_ = new com.google.protobuf.LazyStringArrayList(entityNames_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @return A list containing the entityNames.
     */
    public com.google.protobuf.ProtocolStringList getEntityNamesList() {
      entityNames_.makeImmutable();
      return entityNames_;
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @return The count of entityNames.
     */
    public int getEntityNamesCount() {
      return entityNames_.size();
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The entityNames at the given index.
     */
    public java.lang.String getEntityNames(int index) {
      return entityNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the entityNames at the given index.
     */
    public com.google.protobuf.ByteString getEntityNamesBytes(int index) {
      return entityNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The entityNames to set.
     * @return This builder for chaining.
     */
    public Builder setEntityNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityNamesIsMutable();
      entityNames_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @param value The entityNames to add.
     * @return This builder for chaining.
     */
    public Builder addEntityNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityNamesIsMutable();
      entityNames_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @param values The entityNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntityNames(java.lang.Iterable<java.lang.String> values) {
      ensureEntityNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entityNames_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityNames() {
      entityNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity name(s) being operated on the DDL statement.
     * E.g.
     * 1. For statement "CREATE TABLE t1(...)", `entity_names` = ["t1"].
     * 2. For statement "GRANT ROLE r1, r2 ...", `entity_names` = ["r1", "r2"].
     * 3. For statement "ANALYZE", `entity_names` = [].
     * </pre>
     *
     * <code>repeated string entity_names = 3;</code>
     *
     * @param value The bytes of the entityNames to add.
     * @return This builder for chaining.
     */
    public Builder addEntityNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureEntityNamesIsMutable();
      entityNames_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.DdlStatementActionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.DdlStatementActionInfo)
  private static final com.google.spanner.admin.database.v1.DdlStatementActionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.DdlStatementActionInfo();
  }

  public static com.google.spanner.admin.database.v1.DdlStatementActionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DdlStatementActionInfo> PARSER =
      new com.google.protobuf.AbstractParser<DdlStatementActionInfo>() {
        @java.lang.Override
        public DdlStatementActionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<DdlStatementActionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DdlStatementActionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.DdlStatementActionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
