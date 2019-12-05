// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_semver_version.proto

package com.estafette.ci.manifest.v1;

/**
 * Protobuf type {@code estafette.ci.manifest.v1.EstafetteSemverVersion}
 */
public  final class EstafetteSemverVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:estafette.ci.manifest.v1.EstafetteSemverVersion)
    EstafetteSemverVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EstafetteSemverVersion.newBuilder() to construct.
  private EstafetteSemverVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EstafetteSemverVersion() {
    major_ = 0L;
    minor_ = 0L;
    patch_ = "";
    labelTemplate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EstafetteSemverVersion(
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
          case 8: {

            major_ = input.readInt64();
            break;
          }
          case 16: {

            minor_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            patch_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            labelTemplate_ = s;
            break;
          }
          case 42: {
            com.estafette.ci.manifest.v1.StringOrStringArray.Builder subBuilder = null;
            if (releaseBranch_ != null) {
              subBuilder = releaseBranch_.toBuilder();
            }
            releaseBranch_ = input.readMessage(com.estafette.ci.manifest.v1.StringOrStringArray.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(releaseBranch_);
              releaseBranch_ = subBuilder.buildPartial();
            }

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
    return com.estafette.ci.manifest.v1.EstafetteSemverVersionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteSemverVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.estafette.ci.manifest.v1.EstafetteSemverVersionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteSemverVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.estafette.ci.manifest.v1.EstafetteSemverVersion.class, com.estafette.ci.manifest.v1.EstafetteSemverVersion.Builder.class);
  }

  public static final int MAJOR_FIELD_NUMBER = 1;
  private long major_;
  /**
   * <code>int64 major = 1;</code>
   */
  public long getMajor() {
    return major_;
  }

  public static final int MINOR_FIELD_NUMBER = 2;
  private long minor_;
  /**
   * <code>int64 minor = 2;</code>
   */
  public long getMinor() {
    return minor_;
  }

  public static final int PATCH_FIELD_NUMBER = 3;
  private volatile java.lang.Object patch_;
  /**
   * <code>string patch = 3;</code>
   */
  public java.lang.String getPatch() {
    java.lang.Object ref = patch_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      patch_ = s;
      return s;
    }
  }
  /**
   * <code>string patch = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPatchBytes() {
    java.lang.Object ref = patch_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      patch_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABEL_TEMPLATE_FIELD_NUMBER = 4;
  private volatile java.lang.Object labelTemplate_;
  /**
   * <code>string label_template = 4;</code>
   */
  public java.lang.String getLabelTemplate() {
    java.lang.Object ref = labelTemplate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      labelTemplate_ = s;
      return s;
    }
  }
  /**
   * <code>string label_template = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLabelTemplateBytes() {
    java.lang.Object ref = labelTemplate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      labelTemplate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELEASE_BRANCH_FIELD_NUMBER = 5;
  private com.estafette.ci.manifest.v1.StringOrStringArray releaseBranch_;
  /**
   * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
   */
  public boolean hasReleaseBranch() {
    return releaseBranch_ != null;
  }
  /**
   * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
   */
  public com.estafette.ci.manifest.v1.StringOrStringArray getReleaseBranch() {
    return releaseBranch_ == null ? com.estafette.ci.manifest.v1.StringOrStringArray.getDefaultInstance() : releaseBranch_;
  }
  /**
   * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
   */
  public com.estafette.ci.manifest.v1.StringOrStringArrayOrBuilder getReleaseBranchOrBuilder() {
    return getReleaseBranch();
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
    if (major_ != 0L) {
      output.writeInt64(1, major_);
    }
    if (minor_ != 0L) {
      output.writeInt64(2, minor_);
    }
    if (!getPatchBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, patch_);
    }
    if (!getLabelTemplateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, labelTemplate_);
    }
    if (releaseBranch_ != null) {
      output.writeMessage(5, getReleaseBranch());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (major_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, major_);
    }
    if (minor_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, minor_);
    }
    if (!getPatchBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, patch_);
    }
    if (!getLabelTemplateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, labelTemplate_);
    }
    if (releaseBranch_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getReleaseBranch());
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
    if (!(obj instanceof com.estafette.ci.manifest.v1.EstafetteSemverVersion)) {
      return super.equals(obj);
    }
    com.estafette.ci.manifest.v1.EstafetteSemverVersion other = (com.estafette.ci.manifest.v1.EstafetteSemverVersion) obj;

    boolean result = true;
    result = result && (getMajor()
        == other.getMajor());
    result = result && (getMinor()
        == other.getMinor());
    result = result && getPatch()
        .equals(other.getPatch());
    result = result && getLabelTemplate()
        .equals(other.getLabelTemplate());
    result = result && (hasReleaseBranch() == other.hasReleaseBranch());
    if (hasReleaseBranch()) {
      result = result && getReleaseBranch()
          .equals(other.getReleaseBranch());
    }
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
    hash = (37 * hash) + MAJOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMajor());
    hash = (37 * hash) + MINOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMinor());
    hash = (37 * hash) + PATCH_FIELD_NUMBER;
    hash = (53 * hash) + getPatch().hashCode();
    hash = (37 * hash) + LABEL_TEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getLabelTemplate().hashCode();
    if (hasReleaseBranch()) {
      hash = (37 * hash) + RELEASE_BRANCH_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseBranch().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion parseFrom(
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
  public static Builder newBuilder(com.estafette.ci.manifest.v1.EstafetteSemverVersion prototype) {
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
   * Protobuf type {@code estafette.ci.manifest.v1.EstafetteSemverVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:estafette.ci.manifest.v1.EstafetteSemverVersion)
      com.estafette.ci.manifest.v1.EstafetteSemverVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.estafette.ci.manifest.v1.EstafetteSemverVersionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteSemverVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.estafette.ci.manifest.v1.EstafetteSemverVersionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteSemverVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.estafette.ci.manifest.v1.EstafetteSemverVersion.class, com.estafette.ci.manifest.v1.EstafetteSemverVersion.Builder.class);
    }

    // Construct using com.estafette.ci.manifest.v1.EstafetteSemverVersion.newBuilder()
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
      major_ = 0L;

      minor_ = 0L;

      patch_ = "";

      labelTemplate_ = "";

      if (releaseBranchBuilder_ == null) {
        releaseBranch_ = null;
      } else {
        releaseBranch_ = null;
        releaseBranchBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.estafette.ci.manifest.v1.EstafetteSemverVersionOuterClass.internal_static_estafette_ci_manifest_v1_EstafetteSemverVersion_descriptor;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteSemverVersion getDefaultInstanceForType() {
      return com.estafette.ci.manifest.v1.EstafetteSemverVersion.getDefaultInstance();
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteSemverVersion build() {
      com.estafette.ci.manifest.v1.EstafetteSemverVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.estafette.ci.manifest.v1.EstafetteSemverVersion buildPartial() {
      com.estafette.ci.manifest.v1.EstafetteSemverVersion result = new com.estafette.ci.manifest.v1.EstafetteSemverVersion(this);
      result.major_ = major_;
      result.minor_ = minor_;
      result.patch_ = patch_;
      result.labelTemplate_ = labelTemplate_;
      if (releaseBranchBuilder_ == null) {
        result.releaseBranch_ = releaseBranch_;
      } else {
        result.releaseBranch_ = releaseBranchBuilder_.build();
      }
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
      if (other instanceof com.estafette.ci.manifest.v1.EstafetteSemverVersion) {
        return mergeFrom((com.estafette.ci.manifest.v1.EstafetteSemverVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.estafette.ci.manifest.v1.EstafetteSemverVersion other) {
      if (other == com.estafette.ci.manifest.v1.EstafetteSemverVersion.getDefaultInstance()) return this;
      if (other.getMajor() != 0L) {
        setMajor(other.getMajor());
      }
      if (other.getMinor() != 0L) {
        setMinor(other.getMinor());
      }
      if (!other.getPatch().isEmpty()) {
        patch_ = other.patch_;
        onChanged();
      }
      if (!other.getLabelTemplate().isEmpty()) {
        labelTemplate_ = other.labelTemplate_;
        onChanged();
      }
      if (other.hasReleaseBranch()) {
        mergeReleaseBranch(other.getReleaseBranch());
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
      com.estafette.ci.manifest.v1.EstafetteSemverVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.estafette.ci.manifest.v1.EstafetteSemverVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long major_ ;
    /**
     * <code>int64 major = 1;</code>
     */
    public long getMajor() {
      return major_;
    }
    /**
     * <code>int64 major = 1;</code>
     */
    public Builder setMajor(long value) {
      
      major_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 major = 1;</code>
     */
    public Builder clearMajor() {
      
      major_ = 0L;
      onChanged();
      return this;
    }

    private long minor_ ;
    /**
     * <code>int64 minor = 2;</code>
     */
    public long getMinor() {
      return minor_;
    }
    /**
     * <code>int64 minor = 2;</code>
     */
    public Builder setMinor(long value) {
      
      minor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 minor = 2;</code>
     */
    public Builder clearMinor() {
      
      minor_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object patch_ = "";
    /**
     * <code>string patch = 3;</code>
     */
    public java.lang.String getPatch() {
      java.lang.Object ref = patch_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        patch_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string patch = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPatchBytes() {
      java.lang.Object ref = patch_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patch_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string patch = 3;</code>
     */
    public Builder setPatch(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      patch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string patch = 3;</code>
     */
    public Builder clearPatch() {
      
      patch_ = getDefaultInstance().getPatch();
      onChanged();
      return this;
    }
    /**
     * <code>string patch = 3;</code>
     */
    public Builder setPatchBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      patch_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object labelTemplate_ = "";
    /**
     * <code>string label_template = 4;</code>
     */
    public java.lang.String getLabelTemplate() {
      java.lang.Object ref = labelTemplate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        labelTemplate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string label_template = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLabelTemplateBytes() {
      java.lang.Object ref = labelTemplate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        labelTemplate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string label_template = 4;</code>
     */
    public Builder setLabelTemplate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      labelTemplate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string label_template = 4;</code>
     */
    public Builder clearLabelTemplate() {
      
      labelTemplate_ = getDefaultInstance().getLabelTemplate();
      onChanged();
      return this;
    }
    /**
     * <code>string label_template = 4;</code>
     */
    public Builder setLabelTemplateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      labelTemplate_ = value;
      onChanged();
      return this;
    }

    private com.estafette.ci.manifest.v1.StringOrStringArray releaseBranch_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.estafette.ci.manifest.v1.StringOrStringArray, com.estafette.ci.manifest.v1.StringOrStringArray.Builder, com.estafette.ci.manifest.v1.StringOrStringArrayOrBuilder> releaseBranchBuilder_;
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public boolean hasReleaseBranch() {
      return releaseBranchBuilder_ != null || releaseBranch_ != null;
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public com.estafette.ci.manifest.v1.StringOrStringArray getReleaseBranch() {
      if (releaseBranchBuilder_ == null) {
        return releaseBranch_ == null ? com.estafette.ci.manifest.v1.StringOrStringArray.getDefaultInstance() : releaseBranch_;
      } else {
        return releaseBranchBuilder_.getMessage();
      }
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public Builder setReleaseBranch(com.estafette.ci.manifest.v1.StringOrStringArray value) {
      if (releaseBranchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        releaseBranch_ = value;
        onChanged();
      } else {
        releaseBranchBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public Builder setReleaseBranch(
        com.estafette.ci.manifest.v1.StringOrStringArray.Builder builderForValue) {
      if (releaseBranchBuilder_ == null) {
        releaseBranch_ = builderForValue.build();
        onChanged();
      } else {
        releaseBranchBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public Builder mergeReleaseBranch(com.estafette.ci.manifest.v1.StringOrStringArray value) {
      if (releaseBranchBuilder_ == null) {
        if (releaseBranch_ != null) {
          releaseBranch_ =
            com.estafette.ci.manifest.v1.StringOrStringArray.newBuilder(releaseBranch_).mergeFrom(value).buildPartial();
        } else {
          releaseBranch_ = value;
        }
        onChanged();
      } else {
        releaseBranchBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public Builder clearReleaseBranch() {
      if (releaseBranchBuilder_ == null) {
        releaseBranch_ = null;
        onChanged();
      } else {
        releaseBranch_ = null;
        releaseBranchBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public com.estafette.ci.manifest.v1.StringOrStringArray.Builder getReleaseBranchBuilder() {
      
      onChanged();
      return getReleaseBranchFieldBuilder().getBuilder();
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    public com.estafette.ci.manifest.v1.StringOrStringArrayOrBuilder getReleaseBranchOrBuilder() {
      if (releaseBranchBuilder_ != null) {
        return releaseBranchBuilder_.getMessageOrBuilder();
      } else {
        return releaseBranch_ == null ?
            com.estafette.ci.manifest.v1.StringOrStringArray.getDefaultInstance() : releaseBranch_;
      }
    }
    /**
     * <code>.estafette.ci.manifest.v1.StringOrStringArray release_branch = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.estafette.ci.manifest.v1.StringOrStringArray, com.estafette.ci.manifest.v1.StringOrStringArray.Builder, com.estafette.ci.manifest.v1.StringOrStringArrayOrBuilder> 
        getReleaseBranchFieldBuilder() {
      if (releaseBranchBuilder_ == null) {
        releaseBranchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.estafette.ci.manifest.v1.StringOrStringArray, com.estafette.ci.manifest.v1.StringOrStringArray.Builder, com.estafette.ci.manifest.v1.StringOrStringArrayOrBuilder>(
                getReleaseBranch(),
                getParentForChildren(),
                isClean());
        releaseBranch_ = null;
      }
      return releaseBranchBuilder_;
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


    // @@protoc_insertion_point(builder_scope:estafette.ci.manifest.v1.EstafetteSemverVersion)
  }

  // @@protoc_insertion_point(class_scope:estafette.ci.manifest.v1.EstafetteSemverVersion)
  private static final com.estafette.ci.manifest.v1.EstafetteSemverVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.estafette.ci.manifest.v1.EstafetteSemverVersion();
  }

  public static com.estafette.ci.manifest.v1.EstafetteSemverVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EstafetteSemverVersion>
      PARSER = new com.google.protobuf.AbstractParser<EstafetteSemverVersion>() {
    @java.lang.Override
    public EstafetteSemverVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EstafetteSemverVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EstafetteSemverVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EstafetteSemverVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.estafette.ci.manifest.v1.EstafetteSemverVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

