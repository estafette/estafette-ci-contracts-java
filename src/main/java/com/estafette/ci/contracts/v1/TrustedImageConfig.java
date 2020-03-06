// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/trusted_image_config.proto

package com.estafette.ci.contracts.v1;

/**
 * Protobuf type {@code estafette.ci.contracts.v1.TrustedImageConfig}
 */
public  final class TrustedImageConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:estafette.ci.contracts.v1.TrustedImageConfig)
    TrustedImageConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrustedImageConfig.newBuilder() to construct.
  private TrustedImageConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrustedImageConfig() {
    imagePath_ = "";
    injectedCredentialTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrustedImageConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrustedImageConfig(
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

            imagePath_ = s;
            break;
          }
          case 16: {

            runPrivileged_ = input.readBool();
            break;
          }
          case 24: {

            runDocker_ = input.readBool();
            break;
          }
          case 32: {

            allowCommands_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              injectedCredentialTypes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            injectedCredentialTypes_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        injectedCredentialTypes_ = injectedCredentialTypes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.estafette.ci.contracts.v1.TrustedImageConfigOuterClass.internal_static_estafette_ci_contracts_v1_TrustedImageConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.estafette.ci.contracts.v1.TrustedImageConfigOuterClass.internal_static_estafette_ci_contracts_v1_TrustedImageConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.estafette.ci.contracts.v1.TrustedImageConfig.class, com.estafette.ci.contracts.v1.TrustedImageConfig.Builder.class);
  }

  public static final int IMAGE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object imagePath_;
  /**
   * <code>string image_path = 1;</code>
   */
  public java.lang.String getImagePath() {
    java.lang.Object ref = imagePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imagePath_ = s;
      return s;
    }
  }
  /**
   * <code>string image_path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getImagePathBytes() {
    java.lang.Object ref = imagePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imagePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RUN_PRIVILEGED_FIELD_NUMBER = 2;
  private boolean runPrivileged_;
  /**
   * <code>bool run_privileged = 2;</code>
   */
  public boolean getRunPrivileged() {
    return runPrivileged_;
  }

  public static final int RUN_DOCKER_FIELD_NUMBER = 3;
  private boolean runDocker_;
  /**
   * <code>bool run_docker = 3;</code>
   */
  public boolean getRunDocker() {
    return runDocker_;
  }

  public static final int ALLOW_COMMANDS_FIELD_NUMBER = 4;
  private boolean allowCommands_;
  /**
   * <code>bool allow_commands = 4;</code>
   */
  public boolean getAllowCommands() {
    return allowCommands_;
  }

  public static final int INJECTED_CREDENTIAL_TYPES_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList injectedCredentialTypes_;
  /**
   * <code>repeated string injected_credential_types = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getInjectedCredentialTypesList() {
    return injectedCredentialTypes_;
  }
  /**
   * <code>repeated string injected_credential_types = 5;</code>
   */
  public int getInjectedCredentialTypesCount() {
    return injectedCredentialTypes_.size();
  }
  /**
   * <code>repeated string injected_credential_types = 5;</code>
   */
  public java.lang.String getInjectedCredentialTypes(int index) {
    return injectedCredentialTypes_.get(index);
  }
  /**
   * <code>repeated string injected_credential_types = 5;</code>
   */
  public com.google.protobuf.ByteString
      getInjectedCredentialTypesBytes(int index) {
    return injectedCredentialTypes_.getByteString(index);
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
    if (!getImagePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imagePath_);
    }
    if (runPrivileged_ != false) {
      output.writeBool(2, runPrivileged_);
    }
    if (runDocker_ != false) {
      output.writeBool(3, runDocker_);
    }
    if (allowCommands_ != false) {
      output.writeBool(4, allowCommands_);
    }
    for (int i = 0; i < injectedCredentialTypes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, injectedCredentialTypes_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getImagePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, imagePath_);
    }
    if (runPrivileged_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, runPrivileged_);
    }
    if (runDocker_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, runDocker_);
    }
    if (allowCommands_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, allowCommands_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < injectedCredentialTypes_.size(); i++) {
        dataSize += computeStringSizeNoTag(injectedCredentialTypes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getInjectedCredentialTypesList().size();
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
    if (!(obj instanceof com.estafette.ci.contracts.v1.TrustedImageConfig)) {
      return super.equals(obj);
    }
    com.estafette.ci.contracts.v1.TrustedImageConfig other = (com.estafette.ci.contracts.v1.TrustedImageConfig) obj;

    if (!getImagePath()
        .equals(other.getImagePath())) return false;
    if (getRunPrivileged()
        != other.getRunPrivileged()) return false;
    if (getRunDocker()
        != other.getRunDocker()) return false;
    if (getAllowCommands()
        != other.getAllowCommands()) return false;
    if (!getInjectedCredentialTypesList()
        .equals(other.getInjectedCredentialTypesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IMAGE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getImagePath().hashCode();
    hash = (37 * hash) + RUN_PRIVILEGED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRunPrivileged());
    hash = (37 * hash) + RUN_DOCKER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRunDocker());
    hash = (37 * hash) + ALLOW_COMMANDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowCommands());
    if (getInjectedCredentialTypesCount() > 0) {
      hash = (37 * hash) + INJECTED_CREDENTIAL_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getInjectedCredentialTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.contracts.v1.TrustedImageConfig parseFrom(
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
  public static Builder newBuilder(com.estafette.ci.contracts.v1.TrustedImageConfig prototype) {
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
   * Protobuf type {@code estafette.ci.contracts.v1.TrustedImageConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:estafette.ci.contracts.v1.TrustedImageConfig)
      com.estafette.ci.contracts.v1.TrustedImageConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.estafette.ci.contracts.v1.TrustedImageConfigOuterClass.internal_static_estafette_ci_contracts_v1_TrustedImageConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.estafette.ci.contracts.v1.TrustedImageConfigOuterClass.internal_static_estafette_ci_contracts_v1_TrustedImageConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.estafette.ci.contracts.v1.TrustedImageConfig.class, com.estafette.ci.contracts.v1.TrustedImageConfig.Builder.class);
    }

    // Construct using com.estafette.ci.contracts.v1.TrustedImageConfig.newBuilder()
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
      imagePath_ = "";

      runPrivileged_ = false;

      runDocker_ = false;

      allowCommands_ = false;

      injectedCredentialTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.estafette.ci.contracts.v1.TrustedImageConfigOuterClass.internal_static_estafette_ci_contracts_v1_TrustedImageConfig_descriptor;
    }

    @java.lang.Override
    public com.estafette.ci.contracts.v1.TrustedImageConfig getDefaultInstanceForType() {
      return com.estafette.ci.contracts.v1.TrustedImageConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.estafette.ci.contracts.v1.TrustedImageConfig build() {
      com.estafette.ci.contracts.v1.TrustedImageConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.estafette.ci.contracts.v1.TrustedImageConfig buildPartial() {
      com.estafette.ci.contracts.v1.TrustedImageConfig result = new com.estafette.ci.contracts.v1.TrustedImageConfig(this);
      int from_bitField0_ = bitField0_;
      result.imagePath_ = imagePath_;
      result.runPrivileged_ = runPrivileged_;
      result.runDocker_ = runDocker_;
      result.allowCommands_ = allowCommands_;
      if (((bitField0_ & 0x00000001) != 0)) {
        injectedCredentialTypes_ = injectedCredentialTypes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.injectedCredentialTypes_ = injectedCredentialTypes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.estafette.ci.contracts.v1.TrustedImageConfig) {
        return mergeFrom((com.estafette.ci.contracts.v1.TrustedImageConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.estafette.ci.contracts.v1.TrustedImageConfig other) {
      if (other == com.estafette.ci.contracts.v1.TrustedImageConfig.getDefaultInstance()) return this;
      if (!other.getImagePath().isEmpty()) {
        imagePath_ = other.imagePath_;
        onChanged();
      }
      if (other.getRunPrivileged() != false) {
        setRunPrivileged(other.getRunPrivileged());
      }
      if (other.getRunDocker() != false) {
        setRunDocker(other.getRunDocker());
      }
      if (other.getAllowCommands() != false) {
        setAllowCommands(other.getAllowCommands());
      }
      if (!other.injectedCredentialTypes_.isEmpty()) {
        if (injectedCredentialTypes_.isEmpty()) {
          injectedCredentialTypes_ = other.injectedCredentialTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureInjectedCredentialTypesIsMutable();
          injectedCredentialTypes_.addAll(other.injectedCredentialTypes_);
        }
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
      com.estafette.ci.contracts.v1.TrustedImageConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.estafette.ci.contracts.v1.TrustedImageConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object imagePath_ = "";
    /**
     * <code>string image_path = 1;</code>
     */
    public java.lang.String getImagePath() {
      java.lang.Object ref = imagePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imagePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getImagePathBytes() {
      java.lang.Object ref = imagePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imagePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_path = 1;</code>
     */
    public Builder setImagePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imagePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_path = 1;</code>
     */
    public Builder clearImagePath() {
      
      imagePath_ = getDefaultInstance().getImagePath();
      onChanged();
      return this;
    }
    /**
     * <code>string image_path = 1;</code>
     */
    public Builder setImagePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imagePath_ = value;
      onChanged();
      return this;
    }

    private boolean runPrivileged_ ;
    /**
     * <code>bool run_privileged = 2;</code>
     */
    public boolean getRunPrivileged() {
      return runPrivileged_;
    }
    /**
     * <code>bool run_privileged = 2;</code>
     */
    public Builder setRunPrivileged(boolean value) {
      
      runPrivileged_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool run_privileged = 2;</code>
     */
    public Builder clearRunPrivileged() {
      
      runPrivileged_ = false;
      onChanged();
      return this;
    }

    private boolean runDocker_ ;
    /**
     * <code>bool run_docker = 3;</code>
     */
    public boolean getRunDocker() {
      return runDocker_;
    }
    /**
     * <code>bool run_docker = 3;</code>
     */
    public Builder setRunDocker(boolean value) {
      
      runDocker_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool run_docker = 3;</code>
     */
    public Builder clearRunDocker() {
      
      runDocker_ = false;
      onChanged();
      return this;
    }

    private boolean allowCommands_ ;
    /**
     * <code>bool allow_commands = 4;</code>
     */
    public boolean getAllowCommands() {
      return allowCommands_;
    }
    /**
     * <code>bool allow_commands = 4;</code>
     */
    public Builder setAllowCommands(boolean value) {
      
      allowCommands_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool allow_commands = 4;</code>
     */
    public Builder clearAllowCommands() {
      
      allowCommands_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList injectedCredentialTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureInjectedCredentialTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        injectedCredentialTypes_ = new com.google.protobuf.LazyStringArrayList(injectedCredentialTypes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getInjectedCredentialTypesList() {
      return injectedCredentialTypes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public int getInjectedCredentialTypesCount() {
      return injectedCredentialTypes_.size();
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public java.lang.String getInjectedCredentialTypes(int index) {
      return injectedCredentialTypes_.get(index);
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public com.google.protobuf.ByteString
        getInjectedCredentialTypesBytes(int index) {
      return injectedCredentialTypes_.getByteString(index);
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public Builder setInjectedCredentialTypes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureInjectedCredentialTypesIsMutable();
      injectedCredentialTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public Builder addInjectedCredentialTypes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureInjectedCredentialTypesIsMutable();
      injectedCredentialTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public Builder addAllInjectedCredentialTypes(
        java.lang.Iterable<java.lang.String> values) {
      ensureInjectedCredentialTypesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, injectedCredentialTypes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public Builder clearInjectedCredentialTypes() {
      injectedCredentialTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string injected_credential_types = 5;</code>
     */
    public Builder addInjectedCredentialTypesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureInjectedCredentialTypesIsMutable();
      injectedCredentialTypes_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:estafette.ci.contracts.v1.TrustedImageConfig)
  }

  // @@protoc_insertion_point(class_scope:estafette.ci.contracts.v1.TrustedImageConfig)
  private static final com.estafette.ci.contracts.v1.TrustedImageConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.estafette.ci.contracts.v1.TrustedImageConfig();
  }

  public static com.estafette.ci.contracts.v1.TrustedImageConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrustedImageConfig>
      PARSER = new com.google.protobuf.AbstractParser<TrustedImageConfig>() {
    @java.lang.Override
    public TrustedImageConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrustedImageConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrustedImageConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrustedImageConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.estafette.ci.contracts.v1.TrustedImageConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

