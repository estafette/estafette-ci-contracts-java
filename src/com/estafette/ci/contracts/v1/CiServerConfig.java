// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/ci_server_config.proto

package com.estafette.ci.contracts.v1;

/**
 * Protobuf type {@code estafette.ci.contracts.v1.CiServerConfig}
 */
public  final class CiServerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:estafette.ci.contracts.v1.CiServerConfig)
    CiServerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CiServerConfig.newBuilder() to construct.
  private CiServerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CiServerConfig() {
    baseUrl_ = "";
    builderEventsUrl_ = "";
    postLogsUrl_ = "";
    apiKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CiServerConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            baseUrl_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            builderEventsUrl_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            postLogsUrl_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            apiKey_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.estafette.ci.contracts.v1.CiServerConfigOuterClass.internal_static_estafette_ci_contracts_v1_CiServerConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.estafette.ci.contracts.v1.CiServerConfigOuterClass.internal_static_estafette_ci_contracts_v1_CiServerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.estafette.ci.contracts.v1.CiServerConfig.class, com.estafette.ci.contracts.v1.CiServerConfig.Builder.class);
  }

  public static final int BASE_URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object baseUrl_;
  /**
   * <code>string base_url = 1;</code>
   */
  public java.lang.String getBaseUrl() {
    java.lang.Object ref = baseUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string base_url = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBaseUrlBytes() {
    java.lang.Object ref = baseUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUILDER_EVENTS_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object builderEventsUrl_;
  /**
   * <code>string builder_events_url = 2;</code>
   */
  public java.lang.String getBuilderEventsUrl() {
    java.lang.Object ref = builderEventsUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      builderEventsUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string builder_events_url = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBuilderEventsUrlBytes() {
    java.lang.Object ref = builderEventsUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      builderEventsUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POST_LOGS_URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object postLogsUrl_;
  /**
   * <code>string post_logs_url = 3;</code>
   */
  public java.lang.String getPostLogsUrl() {
    java.lang.Object ref = postLogsUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      postLogsUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string post_logs_url = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPostLogsUrlBytes() {
    java.lang.Object ref = postLogsUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      postLogsUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int API_KEY_FIELD_NUMBER = 4;
  private volatile java.lang.Object apiKey_;
  /**
   * <code>string api_key = 4;</code>
   */
  public java.lang.String getApiKey() {
    java.lang.Object ref = apiKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiKey_ = s;
      return s;
    }
  }
  /**
   * <code>string api_key = 4;</code>
   */
  public com.google.protobuf.ByteString
      getApiKeyBytes() {
    java.lang.Object ref = apiKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apiKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getBaseUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, baseUrl_);
    }
    if (!getBuilderEventsUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, builderEventsUrl_);
    }
    if (!getPostLogsUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, postLogsUrl_);
    }
    if (!getApiKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, apiKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBaseUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, baseUrl_);
    }
    if (!getBuilderEventsUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, builderEventsUrl_);
    }
    if (!getPostLogsUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, postLogsUrl_);
    }
    if (!getApiKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, apiKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.estafette.ci.contracts.v1.CiServerConfig)) {
      return super.equals(obj);
    }
    com.estafette.ci.contracts.v1.CiServerConfig other = (com.estafette.ci.contracts.v1.CiServerConfig) obj;

    boolean result = true;
    result = result && getBaseUrl()
        .equals(other.getBaseUrl());
    result = result && getBuilderEventsUrl()
        .equals(other.getBuilderEventsUrl());
    result = result && getPostLogsUrl()
        .equals(other.getPostLogsUrl());
    result = result && getApiKey()
        .equals(other.getApiKey());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BASE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getBaseUrl().hashCode();
    hash = (37 * hash) + BUILDER_EVENTS_URL_FIELD_NUMBER;
    hash = (53 * hash) + getBuilderEventsUrl().hashCode();
    hash = (37 * hash) + POST_LOGS_URL_FIELD_NUMBER;
    hash = (53 * hash) + getPostLogsUrl().hashCode();
    hash = (37 * hash) + API_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getApiKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.contracts.v1.CiServerConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.estafette.ci.contracts.v1.CiServerConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code estafette.ci.contracts.v1.CiServerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:estafette.ci.contracts.v1.CiServerConfig)
      com.estafette.ci.contracts.v1.CiServerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.estafette.ci.contracts.v1.CiServerConfigOuterClass.internal_static_estafette_ci_contracts_v1_CiServerConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.estafette.ci.contracts.v1.CiServerConfigOuterClass.internal_static_estafette_ci_contracts_v1_CiServerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.estafette.ci.contracts.v1.CiServerConfig.class, com.estafette.ci.contracts.v1.CiServerConfig.Builder.class);
    }

    // Construct using com.estafette.ci.contracts.v1.CiServerConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      baseUrl_ = "";

      builderEventsUrl_ = "";

      postLogsUrl_ = "";

      apiKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.estafette.ci.contracts.v1.CiServerConfigOuterClass.internal_static_estafette_ci_contracts_v1_CiServerConfig_descriptor;
    }

    @java.lang.Override
    public com.estafette.ci.contracts.v1.CiServerConfig getDefaultInstanceForType() {
      return com.estafette.ci.contracts.v1.CiServerConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.estafette.ci.contracts.v1.CiServerConfig build() {
      com.estafette.ci.contracts.v1.CiServerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.estafette.ci.contracts.v1.CiServerConfig buildPartial() {
      com.estafette.ci.contracts.v1.CiServerConfig result = new com.estafette.ci.contracts.v1.CiServerConfig(this);
      result.baseUrl_ = baseUrl_;
      result.builderEventsUrl_ = builderEventsUrl_;
      result.postLogsUrl_ = postLogsUrl_;
      result.apiKey_ = apiKey_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.estafette.ci.contracts.v1.CiServerConfig) {
        return mergeFrom((com.estafette.ci.contracts.v1.CiServerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.estafette.ci.contracts.v1.CiServerConfig other) {
      if (other == com.estafette.ci.contracts.v1.CiServerConfig.getDefaultInstance()) return this;
      if (!other.getBaseUrl().isEmpty()) {
        baseUrl_ = other.baseUrl_;
        onChanged();
      }
      if (!other.getBuilderEventsUrl().isEmpty()) {
        builderEventsUrl_ = other.builderEventsUrl_;
        onChanged();
      }
      if (!other.getPostLogsUrl().isEmpty()) {
        postLogsUrl_ = other.postLogsUrl_;
        onChanged();
      }
      if (!other.getApiKey().isEmpty()) {
        apiKey_ = other.apiKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.estafette.ci.contracts.v1.CiServerConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.estafette.ci.contracts.v1.CiServerConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object baseUrl_ = "";
    /**
     * <code>string base_url = 1;</code>
     */
    public java.lang.String getBaseUrl() {
      java.lang.Object ref = baseUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string base_url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBaseUrlBytes() {
      java.lang.Object ref = baseUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string base_url = 1;</code>
     */
    public Builder setBaseUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      baseUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string base_url = 1;</code>
     */
    public Builder clearBaseUrl() {
      
      baseUrl_ = getDefaultInstance().getBaseUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string base_url = 1;</code>
     */
    public Builder setBaseUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      baseUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object builderEventsUrl_ = "";
    /**
     * <code>string builder_events_url = 2;</code>
     */
    public java.lang.String getBuilderEventsUrl() {
      java.lang.Object ref = builderEventsUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        builderEventsUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string builder_events_url = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBuilderEventsUrlBytes() {
      java.lang.Object ref = builderEventsUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        builderEventsUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string builder_events_url = 2;</code>
     */
    public Builder setBuilderEventsUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      builderEventsUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string builder_events_url = 2;</code>
     */
    public Builder clearBuilderEventsUrl() {
      
      builderEventsUrl_ = getDefaultInstance().getBuilderEventsUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string builder_events_url = 2;</code>
     */
    public Builder setBuilderEventsUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      builderEventsUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object postLogsUrl_ = "";
    /**
     * <code>string post_logs_url = 3;</code>
     */
    public java.lang.String getPostLogsUrl() {
      java.lang.Object ref = postLogsUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        postLogsUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string post_logs_url = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPostLogsUrlBytes() {
      java.lang.Object ref = postLogsUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        postLogsUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string post_logs_url = 3;</code>
     */
    public Builder setPostLogsUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      postLogsUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string post_logs_url = 3;</code>
     */
    public Builder clearPostLogsUrl() {
      
      postLogsUrl_ = getDefaultInstance().getPostLogsUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string post_logs_url = 3;</code>
     */
    public Builder setPostLogsUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      postLogsUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object apiKey_ = "";
    /**
     * <code>string api_key = 4;</code>
     */
    public java.lang.String getApiKey() {
      java.lang.Object ref = apiKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string api_key = 4;</code>
     */
    public com.google.protobuf.ByteString
        getApiKeyBytes() {
      java.lang.Object ref = apiKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apiKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string api_key = 4;</code>
     */
    public Builder setApiKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      apiKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string api_key = 4;</code>
     */
    public Builder clearApiKey() {
      
      apiKey_ = getDefaultInstance().getApiKey();
      onChanged();
      return this;
    }
    /**
     * <code>string api_key = 4;</code>
     */
    public Builder setApiKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      apiKey_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:estafette.ci.contracts.v1.CiServerConfig)
  }

  // @@protoc_insertion_point(class_scope:estafette.ci.contracts.v1.CiServerConfig)
  private static final com.estafette.ci.contracts.v1.CiServerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.estafette.ci.contracts.v1.CiServerConfig();
  }

  public static com.estafette.ci.contracts.v1.CiServerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CiServerConfig>
      PARSER = new com.google.protobuf.AbstractParser<CiServerConfig>() {
    @java.lang.Override
    public CiServerConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CiServerConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CiServerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CiServerConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.estafette.ci.contracts.v1.CiServerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

