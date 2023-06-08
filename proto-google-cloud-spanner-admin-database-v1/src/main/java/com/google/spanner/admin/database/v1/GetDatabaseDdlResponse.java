/*
 * Copyright 2023 Google LLC
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

package com.google.spanner.admin.database.v1;

/**
 *
 *
 * <pre>
 * The response for [GetDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.GetDatabaseDdl].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.GetDatabaseDdlResponse}
 */
public final class GetDatabaseDdlResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
    GetDatabaseDdlResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetDatabaseDdlResponse.newBuilder() to construct.
  private GetDatabaseDdlResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetDatabaseDdlResponse() {
    statements_ = com.google.protobuf.LazyStringArrayList.emptyList();
    protoDescriptors_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetDatabaseDdlResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.class,
            com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.Builder.class);
  }

  public static final int STATEMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList statements_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   *
   * @return A list containing the statements.
   */
  public com.google.protobuf.ProtocolStringList getStatementsList() {
    return statements_;
  }
  /**
   *
   *
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   *
   * @return The count of statements.
   */
  public int getStatementsCount() {
    return statements_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The statements at the given index.
   */
  public java.lang.String getStatements(int index) {
    return statements_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of formatted DDL statements defining the schema of the database
   * specified in the request.
   * </pre>
   *
   * <code>repeated string statements = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the statements at the given index.
   */
  public com.google.protobuf.ByteString getStatementsBytes(int index) {
    return statements_.getByteString(index);
  }

  public static final int PROTO_DESCRIPTORS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString protoDescriptors_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Proto descriptors stored in the database.
   * Contains a protobuf-serialized
   * [google.protobuf.FileDescriptorSet](https://github.com/protocolbuffers/protobuf/blob/main/src/google/protobuf/descriptor.proto).
   * For more details, see protobuffer [self
   * description](https://developers.google.com/protocol-buffers/docs/techniques#self-description).
   * </pre>
   *
   * <code>bytes proto_descriptors = 2;</code>
   *
   * @return The protoDescriptors.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProtoDescriptors() {
    return protoDescriptors_;
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
    for (int i = 0; i < statements_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, statements_.getRaw(i));
    }
    if (!protoDescriptors_.isEmpty()) {
      output.writeBytes(2, protoDescriptors_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < statements_.size(); i++) {
        dataSize += computeStringSizeNoTag(statements_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStatementsList().size();
    }
    if (!protoDescriptors_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, protoDescriptors_);
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
    if (!(obj instanceof com.google.spanner.admin.database.v1.GetDatabaseDdlResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.GetDatabaseDdlResponse other =
        (com.google.spanner.admin.database.v1.GetDatabaseDdlResponse) obj;

    if (!getStatementsList().equals(other.getStatementsList())) return false;
    if (!getProtoDescriptors().equals(other.getProtoDescriptors())) return false;
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
    if (getStatementsCount() > 0) {
      hash = (37 * hash) + STATEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getStatementsList().hashCode();
    }
    hash = (37 * hash) + PROTO_DESCRIPTORS_FIELD_NUMBER;
    hash = (53 * hash) + getProtoDescriptors().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse parseFrom(
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
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponse prototype) {
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
   * The response for [GetDatabaseDdl][google.spanner.admin.database.v1.DatabaseAdmin.GetDatabaseDdl].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.GetDatabaseDdlResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.class,
              com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      statements_ = com.google.protobuf.LazyStringArrayList.emptyList();
      protoDescriptors_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_GetDatabaseDdlResponse_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse build() {
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse buildPartial() {
      com.google.spanner.admin.database.v1.GetDatabaseDdlResponse result =
          new com.google.spanner.admin.database.v1.GetDatabaseDdlResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.spanner.admin.database.v1.GetDatabaseDdlResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        statements_.makeImmutable();
        result.statements_ = statements_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.protoDescriptors_ = protoDescriptors_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.database.v1.GetDatabaseDdlResponse) {
        return mergeFrom((com.google.spanner.admin.database.v1.GetDatabaseDdlResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.GetDatabaseDdlResponse other) {
      if (other == com.google.spanner.admin.database.v1.GetDatabaseDdlResponse.getDefaultInstance())
        return this;
      if (!other.statements_.isEmpty()) {
        if (statements_.isEmpty()) {
          statements_ = other.statements_;
          bitField0_ |= 0x00000001;
        } else {
          ensureStatementsIsMutable();
          statements_.addAll(other.statements_);
        }
        onChanged();
      }
      if (other.getProtoDescriptors() != com.google.protobuf.ByteString.EMPTY) {
        setProtoDescriptors(other.getProtoDescriptors());
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureStatementsIsMutable();
                statements_.add(s);
                break;
              } // case 10
            case 18:
              {
                protoDescriptors_ = input.readBytes();
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

    private com.google.protobuf.LazyStringArrayList statements_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureStatementsIsMutable() {
      if (!statements_.isModifiable()) {
        statements_ = new com.google.protobuf.LazyStringArrayList(statements_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @return A list containing the statements.
     */
    public com.google.protobuf.ProtocolStringList getStatementsList() {
      statements_.makeImmutable();
      return statements_;
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @return The count of statements.
     */
    public int getStatementsCount() {
      return statements_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The statements at the given index.
     */
    public java.lang.String getStatements(int index) {
      return statements_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the statements at the given index.
     */
    public com.google.protobuf.ByteString getStatementsBytes(int index) {
      return statements_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The statements to set.
     * @return This builder for chaining.
     */
    public Builder setStatements(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStatementsIsMutable();
      statements_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @param value The statements to add.
     * @return This builder for chaining.
     */
    public Builder addStatements(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStatementsIsMutable();
      statements_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @param values The statements to add.
     * @return This builder for chaining.
     */
    public Builder addAllStatements(java.lang.Iterable<java.lang.String> values) {
      ensureStatementsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, statements_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStatements() {
      statements_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of formatted DDL statements defining the schema of the database
     * specified in the request.
     * </pre>
     *
     * <code>repeated string statements = 1;</code>
     *
     * @param value The bytes of the statements to add.
     * @return This builder for chaining.
     */
    public Builder addStatementsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureStatementsIsMutable();
      statements_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString protoDescriptors_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Proto descriptors stored in the database.
     * Contains a protobuf-serialized
     * [google.protobuf.FileDescriptorSet](https://github.com/protocolbuffers/protobuf/blob/main/src/google/protobuf/descriptor.proto).
     * For more details, see protobuffer [self
     * description](https://developers.google.com/protocol-buffers/docs/techniques#self-description).
     * </pre>
     *
     * <code>bytes proto_descriptors = 2;</code>
     *
     * @return The protoDescriptors.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getProtoDescriptors() {
      return protoDescriptors_;
    }
    /**
     *
     *
     * <pre>
     * Proto descriptors stored in the database.
     * Contains a protobuf-serialized
     * [google.protobuf.FileDescriptorSet](https://github.com/protocolbuffers/protobuf/blob/main/src/google/protobuf/descriptor.proto).
     * For more details, see protobuffer [self
     * description](https://developers.google.com/protocol-buffers/docs/techniques#self-description).
     * </pre>
     *
     * <code>bytes proto_descriptors = 2;</code>
     *
     * @param value The protoDescriptors to set.
     * @return This builder for chaining.
     */
    public Builder setProtoDescriptors(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      protoDescriptors_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Proto descriptors stored in the database.
     * Contains a protobuf-serialized
     * [google.protobuf.FileDescriptorSet](https://github.com/protocolbuffers/protobuf/blob/main/src/google/protobuf/descriptor.proto).
     * For more details, see protobuffer [self
     * description](https://developers.google.com/protocol-buffers/docs/techniques#self-description).
     * </pre>
     *
     * <code>bytes proto_descriptors = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProtoDescriptors() {
      bitField0_ = (bitField0_ & ~0x00000002);
      protoDescriptors_ = getDefaultInstance().getProtoDescriptors();
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

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.GetDatabaseDdlResponse)
  private static final com.google.spanner.admin.database.v1.GetDatabaseDdlResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.GetDatabaseDdlResponse();
  }

  public static com.google.spanner.admin.database.v1.GetDatabaseDdlResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDatabaseDdlResponse> PARSER =
      new com.google.protobuf.AbstractParser<GetDatabaseDdlResponse>() {
        @java.lang.Override
        public GetDatabaseDdlResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDatabaseDdlResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDatabaseDdlResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.GetDatabaseDdlResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
