// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manifest.v1/estafette_version_params.proto

package io.estafette.ci.manifest.v1;

public final class EstafetteVersionParamsOuterClass {
  private EstafetteVersionParamsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EstafetteVersionParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:manifest.v1.EstafetteVersionParams)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 auto_increment = 1;</code>
     */
    long getAutoIncrement();

    /**
     * <code>string branch = 2;</code>
     */
    java.lang.String getBranch();
    /**
     * <code>string branch = 2;</code>
     */
    com.google.protobuf.ByteString
        getBranchBytes();

    /**
     * <code>string revision = 3;</code>
     */
    java.lang.String getRevision();
    /**
     * <code>string revision = 3;</code>
     */
    com.google.protobuf.ByteString
        getRevisionBytes();
  }
  /**
   * Protobuf type {@code manifest.v1.EstafetteVersionParams}
   */
  public  static final class EstafetteVersionParams extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:manifest.v1.EstafetteVersionParams)
      EstafetteVersionParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EstafetteVersionParams.newBuilder() to construct.
    private EstafetteVersionParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EstafetteVersionParams() {
      autoIncrement_ = 0L;
      branch_ = "";
      revision_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EstafetteVersionParams(
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

              autoIncrement_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              branch_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              revision_ = s;
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
      return io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.internal_static_manifest_v1_EstafetteVersionParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.internal_static_manifest_v1_EstafetteVersionParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams.class, io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams.Builder.class);
    }

    public static final int AUTO_INCREMENT_FIELD_NUMBER = 1;
    private long autoIncrement_;
    /**
     * <code>int64 auto_increment = 1;</code>
     */
    public long getAutoIncrement() {
      return autoIncrement_;
    }

    public static final int BRANCH_FIELD_NUMBER = 2;
    private volatile java.lang.Object branch_;
    /**
     * <code>string branch = 2;</code>
     */
    public java.lang.String getBranch() {
      java.lang.Object ref = branch_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        branch_ = s;
        return s;
      }
    }
    /**
     * <code>string branch = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBranchBytes() {
      java.lang.Object ref = branch_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        branch_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REVISION_FIELD_NUMBER = 3;
    private volatile java.lang.Object revision_;
    /**
     * <code>string revision = 3;</code>
     */
    public java.lang.String getRevision() {
      java.lang.Object ref = revision_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revision_ = s;
        return s;
      }
    }
    /**
     * <code>string revision = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRevisionBytes() {
      java.lang.Object ref = revision_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revision_ = b;
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
      if (autoIncrement_ != 0L) {
        output.writeInt64(1, autoIncrement_);
      }
      if (!getBranchBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, branch_);
      }
      if (!getRevisionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, revision_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (autoIncrement_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, autoIncrement_);
      }
      if (!getBranchBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, branch_);
      }
      if (!getRevisionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, revision_);
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
      if (!(obj instanceof io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams)) {
        return super.equals(obj);
      }
      io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams other = (io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams) obj;

      boolean result = true;
      result = result && (getAutoIncrement()
          == other.getAutoIncrement());
      result = result && getBranch()
          .equals(other.getBranch());
      result = result && getRevision()
          .equals(other.getRevision());
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
      hash = (37 * hash) + AUTO_INCREMENT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAutoIncrement());
      hash = (37 * hash) + BRANCH_FIELD_NUMBER;
      hash = (53 * hash) + getBranch().hashCode();
      hash = (37 * hash) + REVISION_FIELD_NUMBER;
      hash = (53 * hash) + getRevision().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parseFrom(
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
    public static Builder newBuilder(io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams prototype) {
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
     * Protobuf type {@code manifest.v1.EstafetteVersionParams}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:manifest.v1.EstafetteVersionParams)
        io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.internal_static_manifest_v1_EstafetteVersionParams_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.internal_static_manifest_v1_EstafetteVersionParams_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams.class, io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams.Builder.class);
      }

      // Construct using io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams.newBuilder()
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
        autoIncrement_ = 0L;

        branch_ = "";

        revision_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.internal_static_manifest_v1_EstafetteVersionParams_descriptor;
      }

      @java.lang.Override
      public io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams getDefaultInstanceForType() {
        return io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams.getDefaultInstance();
      }

      @java.lang.Override
      public io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams build() {
        io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams buildPartial() {
        io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams result = new io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams(this);
        result.autoIncrement_ = autoIncrement_;
        result.branch_ = branch_;
        result.revision_ = revision_;
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
        if (other instanceof io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams) {
          return mergeFrom((io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams other) {
        if (other == io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams.getDefaultInstance()) return this;
        if (other.getAutoIncrement() != 0L) {
          setAutoIncrement(other.getAutoIncrement());
        }
        if (!other.getBranch().isEmpty()) {
          branch_ = other.branch_;
          onChanged();
        }
        if (!other.getRevision().isEmpty()) {
          revision_ = other.revision_;
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
        io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long autoIncrement_ ;
      /**
       * <code>int64 auto_increment = 1;</code>
       */
      public long getAutoIncrement() {
        return autoIncrement_;
      }
      /**
       * <code>int64 auto_increment = 1;</code>
       */
      public Builder setAutoIncrement(long value) {
        
        autoIncrement_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 auto_increment = 1;</code>
       */
      public Builder clearAutoIncrement() {
        
        autoIncrement_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object branch_ = "";
      /**
       * <code>string branch = 2;</code>
       */
      public java.lang.String getBranch() {
        java.lang.Object ref = branch_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          branch_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string branch = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBranchBytes() {
        java.lang.Object ref = branch_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          branch_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string branch = 2;</code>
       */
      public Builder setBranch(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        branch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string branch = 2;</code>
       */
      public Builder clearBranch() {
        
        branch_ = getDefaultInstance().getBranch();
        onChanged();
        return this;
      }
      /**
       * <code>string branch = 2;</code>
       */
      public Builder setBranchBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        branch_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object revision_ = "";
      /**
       * <code>string revision = 3;</code>
       */
      public java.lang.String getRevision() {
        java.lang.Object ref = revision_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          revision_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string revision = 3;</code>
       */
      public com.google.protobuf.ByteString
          getRevisionBytes() {
        java.lang.Object ref = revision_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          revision_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string revision = 3;</code>
       */
      public Builder setRevision(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        revision_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string revision = 3;</code>
       */
      public Builder clearRevision() {
        
        revision_ = getDefaultInstance().getRevision();
        onChanged();
        return this;
      }
      /**
       * <code>string revision = 3;</code>
       */
      public Builder setRevisionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        revision_ = value;
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


      // @@protoc_insertion_point(builder_scope:manifest.v1.EstafetteVersionParams)
    }

    // @@protoc_insertion_point(class_scope:manifest.v1.EstafetteVersionParams)
    private static final io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams();
    }

    public static io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EstafetteVersionParams>
        PARSER = new com.google.protobuf.AbstractParser<EstafetteVersionParams>() {
      @java.lang.Override
      public EstafetteVersionParams parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EstafetteVersionParams(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EstafetteVersionParams> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EstafetteVersionParams> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.estafette.ci.manifest.v1.EstafetteVersionParamsOuterClass.EstafetteVersionParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manifest_v1_EstafetteVersionParams_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manifest_v1_EstafetteVersionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*manifest.v1/estafette_version_params.p" +
      "roto\022\013manifest.v1\"R\n\026EstafetteVersionPar" +
      "ams\022\026\n\016auto_increment\030\001 \001(\003\022\016\n\006branch\030\002 " +
      "\001(\t\022\020\n\010revision\030\003 \001(\tBx\n\033io.estafette.ci" +
      ".manifest.v1Z>github.com/estafette/estaf" +
      "ette-ci-contracts-golang/manifest_v1\252\002\030E" +
      "stafette.CI.Manifest.V1b\006proto3"
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
    internal_static_manifest_v1_EstafetteVersionParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manifest_v1_EstafetteVersionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manifest_v1_EstafetteVersionParams_descriptor,
        new java.lang.String[] { "AutoIncrement", "Branch", "Revision", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}