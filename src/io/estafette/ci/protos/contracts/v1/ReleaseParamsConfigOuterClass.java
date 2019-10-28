// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contracts.v1/release_params_config.proto

package io.estafette.ci.protos.contracts.v1;

public final class ReleaseParamsConfigOuterClass {
  private ReleaseParamsConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReleaseParamsConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:contracts.v1.ReleaseParamsConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string release_name = 1;</code>
     */
    java.lang.String getReleaseName();
    /**
     * <code>string release_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getReleaseNameBytes();

    /**
     * <code>int64 release_id = 2;</code>
     */
    long getReleaseId();

    /**
     * <code>string release_action = 3;</code>
     */
    java.lang.String getReleaseAction();
    /**
     * <code>string release_action = 3;</code>
     */
    com.google.protobuf.ByteString
        getReleaseActionBytes();

    /**
     * <code>string triggered_by = 4;</code>
     */
    java.lang.String getTriggeredBy();
    /**
     * <code>string triggered_by = 4;</code>
     */
    com.google.protobuf.ByteString
        getTriggeredByBytes();
  }
  /**
   * Protobuf type {@code contracts.v1.ReleaseParamsConfig}
   */
  public  static final class ReleaseParamsConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:contracts.v1.ReleaseParamsConfig)
      ReleaseParamsConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReleaseParamsConfig.newBuilder() to construct.
    private ReleaseParamsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReleaseParamsConfig() {
      releaseName_ = "";
      releaseId_ = 0L;
      releaseAction_ = "";
      triggeredBy_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReleaseParamsConfig(
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

              releaseName_ = s;
              break;
            }
            case 16: {

              releaseId_ = input.readInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              releaseAction_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              triggeredBy_ = s;
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
      return io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.internal_static_contracts_v1_ReleaseParamsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.internal_static_contracts_v1_ReleaseParamsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig.class, io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig.Builder.class);
    }

    public static final int RELEASE_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object releaseName_;
    /**
     * <code>string release_name = 1;</code>
     */
    public java.lang.String getReleaseName() {
      java.lang.Object ref = releaseName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        releaseName_ = s;
        return s;
      }
    }
    /**
     * <code>string release_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReleaseNameBytes() {
      java.lang.Object ref = releaseName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        releaseName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RELEASE_ID_FIELD_NUMBER = 2;
    private long releaseId_;
    /**
     * <code>int64 release_id = 2;</code>
     */
    public long getReleaseId() {
      return releaseId_;
    }

    public static final int RELEASE_ACTION_FIELD_NUMBER = 3;
    private volatile java.lang.Object releaseAction_;
    /**
     * <code>string release_action = 3;</code>
     */
    public java.lang.String getReleaseAction() {
      java.lang.Object ref = releaseAction_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        releaseAction_ = s;
        return s;
      }
    }
    /**
     * <code>string release_action = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReleaseActionBytes() {
      java.lang.Object ref = releaseAction_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        releaseAction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TRIGGERED_BY_FIELD_NUMBER = 4;
    private volatile java.lang.Object triggeredBy_;
    /**
     * <code>string triggered_by = 4;</code>
     */
    public java.lang.String getTriggeredBy() {
      java.lang.Object ref = triggeredBy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        triggeredBy_ = s;
        return s;
      }
    }
    /**
     * <code>string triggered_by = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTriggeredByBytes() {
      java.lang.Object ref = triggeredBy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        triggeredBy_ = b;
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
      if (!getReleaseNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, releaseName_);
      }
      if (releaseId_ != 0L) {
        output.writeInt64(2, releaseId_);
      }
      if (!getReleaseActionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, releaseAction_);
      }
      if (!getTriggeredByBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, triggeredBy_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getReleaseNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, releaseName_);
      }
      if (releaseId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, releaseId_);
      }
      if (!getReleaseActionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, releaseAction_);
      }
      if (!getTriggeredByBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, triggeredBy_);
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
      if (!(obj instanceof io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig)) {
        return super.equals(obj);
      }
      io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig other = (io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig) obj;

      boolean result = true;
      result = result && getReleaseName()
          .equals(other.getReleaseName());
      result = result && (getReleaseId()
          == other.getReleaseId());
      result = result && getReleaseAction()
          .equals(other.getReleaseAction());
      result = result && getTriggeredBy()
          .equals(other.getTriggeredBy());
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
      hash = (37 * hash) + RELEASE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseName().hashCode();
      hash = (37 * hash) + RELEASE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getReleaseId());
      hash = (37 * hash) + RELEASE_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseAction().hashCode();
      hash = (37 * hash) + TRIGGERED_BY_FIELD_NUMBER;
      hash = (53 * hash) + getTriggeredBy().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parseFrom(
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
    public static Builder newBuilder(io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig prototype) {
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
     * Protobuf type {@code contracts.v1.ReleaseParamsConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:contracts.v1.ReleaseParamsConfig)
        io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.internal_static_contracts_v1_ReleaseParamsConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.internal_static_contracts_v1_ReleaseParamsConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig.class, io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig.Builder.class);
      }

      // Construct using io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig.newBuilder()
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
        releaseName_ = "";

        releaseId_ = 0L;

        releaseAction_ = "";

        triggeredBy_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.internal_static_contracts_v1_ReleaseParamsConfig_descriptor;
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig getDefaultInstanceForType() {
        return io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig.getDefaultInstance();
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig build() {
        io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig buildPartial() {
        io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig result = new io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig(this);
        result.releaseName_ = releaseName_;
        result.releaseId_ = releaseId_;
        result.releaseAction_ = releaseAction_;
        result.triggeredBy_ = triggeredBy_;
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
        if (other instanceof io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig) {
          return mergeFrom((io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig other) {
        if (other == io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig.getDefaultInstance()) return this;
        if (!other.getReleaseName().isEmpty()) {
          releaseName_ = other.releaseName_;
          onChanged();
        }
        if (other.getReleaseId() != 0L) {
          setReleaseId(other.getReleaseId());
        }
        if (!other.getReleaseAction().isEmpty()) {
          releaseAction_ = other.releaseAction_;
          onChanged();
        }
        if (!other.getTriggeredBy().isEmpty()) {
          triggeredBy_ = other.triggeredBy_;
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
        io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object releaseName_ = "";
      /**
       * <code>string release_name = 1;</code>
       */
      public java.lang.String getReleaseName() {
        java.lang.Object ref = releaseName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          releaseName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string release_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getReleaseNameBytes() {
        java.lang.Object ref = releaseName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          releaseName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string release_name = 1;</code>
       */
      public Builder setReleaseName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        releaseName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string release_name = 1;</code>
       */
      public Builder clearReleaseName() {
        
        releaseName_ = getDefaultInstance().getReleaseName();
        onChanged();
        return this;
      }
      /**
       * <code>string release_name = 1;</code>
       */
      public Builder setReleaseNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        releaseName_ = value;
        onChanged();
        return this;
      }

      private long releaseId_ ;
      /**
       * <code>int64 release_id = 2;</code>
       */
      public long getReleaseId() {
        return releaseId_;
      }
      /**
       * <code>int64 release_id = 2;</code>
       */
      public Builder setReleaseId(long value) {
        
        releaseId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 release_id = 2;</code>
       */
      public Builder clearReleaseId() {
        
        releaseId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object releaseAction_ = "";
      /**
       * <code>string release_action = 3;</code>
       */
      public java.lang.String getReleaseAction() {
        java.lang.Object ref = releaseAction_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          releaseAction_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string release_action = 3;</code>
       */
      public com.google.protobuf.ByteString
          getReleaseActionBytes() {
        java.lang.Object ref = releaseAction_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          releaseAction_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string release_action = 3;</code>
       */
      public Builder setReleaseAction(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        releaseAction_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string release_action = 3;</code>
       */
      public Builder clearReleaseAction() {
        
        releaseAction_ = getDefaultInstance().getReleaseAction();
        onChanged();
        return this;
      }
      /**
       * <code>string release_action = 3;</code>
       */
      public Builder setReleaseActionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        releaseAction_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object triggeredBy_ = "";
      /**
       * <code>string triggered_by = 4;</code>
       */
      public java.lang.String getTriggeredBy() {
        java.lang.Object ref = triggeredBy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          triggeredBy_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string triggered_by = 4;</code>
       */
      public com.google.protobuf.ByteString
          getTriggeredByBytes() {
        java.lang.Object ref = triggeredBy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          triggeredBy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string triggered_by = 4;</code>
       */
      public Builder setTriggeredBy(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        triggeredBy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string triggered_by = 4;</code>
       */
      public Builder clearTriggeredBy() {
        
        triggeredBy_ = getDefaultInstance().getTriggeredBy();
        onChanged();
        return this;
      }
      /**
       * <code>string triggered_by = 4;</code>
       */
      public Builder setTriggeredByBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        triggeredBy_ = value;
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


      // @@protoc_insertion_point(builder_scope:contracts.v1.ReleaseParamsConfig)
    }

    // @@protoc_insertion_point(class_scope:contracts.v1.ReleaseParamsConfig)
    private static final io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig();
    }

    public static io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReleaseParamsConfig>
        PARSER = new com.google.protobuf.AbstractParser<ReleaseParamsConfig>() {
      @java.lang.Override
      public ReleaseParamsConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReleaseParamsConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReleaseParamsConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReleaseParamsConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.estafette.ci.protos.contracts.v1.ReleaseParamsConfigOuterClass.ReleaseParamsConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contracts_v1_ReleaseParamsConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contracts_v1_ReleaseParamsConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(contracts.v1/release_params_config.pro" +
      "to\022\014contracts.v1\"m\n\023ReleaseParamsConfig\022" +
      "\024\n\014release_name\030\001 \001(\t\022\022\n\nrelease_id\030\002 \001(" +
      "\003\022\026\n\016release_action\030\003 \001(\t\022\024\n\014triggered_b" +
      "y\030\004 \001(\tB\177\n#io.estafette.ci.protos.contra" +
      "cts.v1Z<github.com/estafette/estafette-c" +
      "i-protos-golang/contracts_v1\252\002\031Estafette" +
      ".CI.Contracts.V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_contracts_v1_ReleaseParamsConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_contracts_v1_ReleaseParamsConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contracts_v1_ReleaseParamsConfig_descriptor,
        new java.lang.String[] { "ReleaseName", "ReleaseId", "ReleaseAction", "TriggeredBy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}