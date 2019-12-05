// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_cron_trigger.proto

package com.estafette.ci.manifest.v1;

/**
 * Protobuf type {@code estafette.ci.manifest.v1.EstafetteCronTrigger}
 */
public  final class EstafetteCronTrigger extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:estafette.ci.manifest.v1.EstafetteCronTrigger)
    EstafetteCronTriggerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EstafetteCronTrigger.newBuilder() to construct.
  private EstafetteCronTrigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EstafetteCronTrigger() {
    schedule_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EstafetteCronTrigger(
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

            schedule_ = s;
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
    return com.estafette.ci.manifest.v1.EstafetteCronTriggerOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteCronTrigger_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.estafette.ci.manifest.v1.EstafetteCronTriggerOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteCronTrigger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.estafette.ci.manifest.v1.EstafetteCronTrigger.class, com.estafette.ci.manifest.v1.EstafetteCronTrigger.Builder.class);
  }

  public static final int SCHEDULE_FIELD_NUMBER = 1;
  private volatile java.lang.Object schedule_;
  /**
   * <code>string schedule = 1;</code>
   */
  public java.lang.String getSchedule() {
    java.lang.Object ref = schedule_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schedule_ = s;
      return s;
    }
  }
  /**
   * <code>string schedule = 1;</code>
   */
  public com.google.protobuf.ByteString
      getScheduleBytes() {
    java.lang.Object ref = schedule_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      schedule_ = b;
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
    if (!getScheduleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, schedule_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getScheduleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, schedule_);
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
    if (!(obj instanceof com.estafette.ci.manifest.v1.EstafetteCronTrigger)) {
      return super.equals(obj);
    }
    com.estafette.ci.manifest.v1.EstafetteCronTrigger other = (com.estafette.ci.manifest.v1.EstafetteCronTrigger) obj;

    boolean result = true;
    result = result && getSchedule()
        .equals(other.getSchedule());
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
    hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
    hash = (53 * hash) + getSchedule().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger parseFrom(
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
  public static Builder newBuilder(com.estafette.ci.manifest.v1.EstafetteCronTrigger prototype) {
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
   * Protobuf type {@code estafette.ci.manifest.v1.EstafetteCronTrigger}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:estafette.ci.manifest.v1.EstafetteCronTrigger)
      com.estafette.ci.manifest.v1.EstafetteCronTriggerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.estafette.ci.manifest.v1.EstafetteCronTriggerOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteCronTrigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.estafette.ci.manifest.v1.EstafetteCronTriggerOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteCronTrigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.estafette.ci.manifest.v1.EstafetteCronTrigger.class, com.estafette.ci.manifest.v1.EstafetteCronTrigger.Builder.class);
    }

    // Construct using com.estafette.ci.manifest.v1.EstafetteCronTrigger.newBuilder()
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
      schedule_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.estafette.ci.manifest.v1.EstafetteCronTriggerOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteCronTrigger_descriptor;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteCronTrigger getDefaultInstanceForType() {
      return com.estafette.ci.manifest.v1.EstafetteCronTrigger.getDefaultInstance();
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteCronTrigger build() {
      com.estafette.ci.manifest.v1.EstafetteCronTrigger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteCronTrigger buildPartial() {
      com.estafette.ci.manifest.v1.EstafetteCronTrigger result = new com.estafette.ci.manifest.v1.EstafetteCronTrigger(this);
      result.schedule_ = schedule_;
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
      if (other instanceof com.estafette.ci.manifest.v1.EstafetteCronTrigger) {
        return mergeFrom((com.estafette.ci.manifest.v1.EstafetteCronTrigger)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.estafette.ci.manifest.v1.EstafetteCronTrigger other) {
      if (other == com.estafette.ci.manifest.v1.EstafetteCronTrigger.getDefaultInstance()) return this;
      if (!other.getSchedule().isEmpty()) {
        schedule_ = other.schedule_;
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
      com.estafette.ci.manifest.v1.EstafetteCronTrigger parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.estafette.ci.manifest.v1.EstafetteCronTrigger) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object schedule_ = "";
    /**
     * <code>string schedule = 1;</code>
     */
    public java.lang.String getSchedule() {
      java.lang.Object ref = schedule_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schedule_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string schedule = 1;</code>
     */
    public com.google.protobuf.ByteString
        getScheduleBytes() {
      java.lang.Object ref = schedule_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schedule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string schedule = 1;</code>
     */
    public Builder setSchedule(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      schedule_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string schedule = 1;</code>
     */
    public Builder clearSchedule() {
      
      schedule_ = getDefaultInstance().getSchedule();
      onChanged();
      return this;
    }
    /**
     * <code>string schedule = 1;</code>
     */
    public Builder setScheduleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      schedule_ = value;
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


    // @@protoc_insertion_point(builder_scope:estafette.ci.manifest.v1.EstafetteCronTrigger)
  }

  // @@protoc_insertion_point(class_scope:estafette.ci.manifest.v1.EstafetteCronTrigger)
  private static final com.estafette.ci.manifest.v1.EstafetteCronTrigger DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.estafette.ci.manifest.v1.EstafetteCronTrigger();
  }

  public static com.estafette.ci.manifest.v1.EstafetteCronTrigger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EstafetteCronTrigger>
      PARSER = new com.google.protobuf.AbstractParser<EstafetteCronTrigger>() {
    @java.lang.Override
    public EstafetteCronTrigger parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EstafetteCronTrigger(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EstafetteCronTrigger> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EstafetteCronTrigger> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.estafette.ci.manifest.v1.EstafetteCronTrigger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

