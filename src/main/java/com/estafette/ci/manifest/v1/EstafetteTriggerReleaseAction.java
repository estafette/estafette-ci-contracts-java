// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_trigger_release_action.proto

package com.estafette.ci.manifest.v1;

/**
 * Protobuf type {@code estafette.ci.manifest.v1.EstafetteTriggerReleaseAction}
 */
public  final class EstafetteTriggerReleaseAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:estafette.ci.manifest.v1.EstafetteTriggerReleaseAction)
    EstafetteTriggerReleaseActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EstafetteTriggerReleaseAction.newBuilder() to construct.
  private EstafetteTriggerReleaseAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EstafetteTriggerReleaseAction() {
    target_ = "";
    action_ = "";
    version_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EstafetteTriggerReleaseAction(
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

            target_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            action_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
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
    return com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction.class, com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction.Builder.class);
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private volatile java.lang.Object target_;
  /**
   * <code>string target = 1;</code>
   */
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <code>string target = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object action_;
  /**
   * <code>string action = 2;</code>
   */
  public java.lang.String getAction() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      action_ = s;
      return s;
    }
  }
  /**
   * <code>string action = 2;</code>
   */
  public com.google.protobuf.ByteString
      getActionBytes() {
    java.lang.Object ref = action_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      action_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 3;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 3;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
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
    if (!getTargetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, target_);
    }
    if (!getActionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, action_);
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, version_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTargetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, target_);
    }
    if (!getActionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, action_);
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, version_);
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
    if (!(obj instanceof com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction)) {
      return super.equals(obj);
    }
    com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction other = (com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction) obj;

    boolean result = true;
    result = result && getTarget()
        .equals(other.getTarget());
    result = result && getAction()
        .equals(other.getAction());
    result = result && getVersion()
        .equals(other.getVersion());
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
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + getAction().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parseFrom(
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
  public static Builder newBuilder(com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction prototype) {
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
   * Protobuf type {@code estafette.ci.manifest.v1.EstafetteTriggerReleaseAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:estafette.ci.manifest.v1.EstafetteTriggerReleaseAction)
      com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction.class, com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction.Builder.class);
    }

    // Construct using com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction.newBuilder()
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
      target_ = "";

      action_ = "";

      version_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteTriggerReleaseAction_descriptor;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction getDefaultInstanceForType() {
      return com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction build() {
      com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction buildPartial() {
      com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction result = new com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction(this);
      result.target_ = target_;
      result.action_ = action_;
      result.version_ = version_;
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
      if (other instanceof com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction) {
        return mergeFrom((com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction other) {
      if (other == com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction.getDefaultInstance()) return this;
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        onChanged();
      }
      if (!other.getAction().isEmpty()) {
        action_ = other.action_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
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
      com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object target_ = "";
    /**
     * <code>string target = 1;</code>
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string target = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string target = 1;</code>
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string target = 1;</code>
     */
    public Builder clearTarget() {
      
      target_ = getDefaultInstance().getTarget();
      onChanged();
      return this;
    }
    /**
     * <code>string target = 1;</code>
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      target_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object action_ = "";
    /**
     * <code>string action = 2;</code>
     */
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        action_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string action = 2;</code>
     */
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string action = 2;</code>
     */
    public Builder setAction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string action = 2;</code>
     */
    public Builder clearAction() {
      
      action_ = getDefaultInstance().getAction();
      onChanged();
      return this;
    }
    /**
     * <code>string action = 2;</code>
     */
    public Builder setActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      action_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 3;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 3;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 3;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 3;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
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


    // @@protoc_insertion_point(builder_scope:estafette.ci.manifest.v1.EstafetteTriggerReleaseAction)
  }

  // @@protoc_insertion_point(class_scope:estafette.ci.manifest.v1.EstafetteTriggerReleaseAction)
  private static final com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction();
  }

  public static com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EstafetteTriggerReleaseAction>
      PARSER = new com.google.protobuf.AbstractParser<EstafetteTriggerReleaseAction>() {
    @java.lang.Override
    public EstafetteTriggerReleaseAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EstafetteTriggerReleaseAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EstafetteTriggerReleaseAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EstafetteTriggerReleaseAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.estafette.ci.manifest.v1.EstafetteTriggerReleaseAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
