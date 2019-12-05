// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/contracts.v1/git_commit.proto

package io.estafette.ci.protos.contracts.v1;

public final class GitCommitOuterClass {
  private GitCommitOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GitCommitOrBuilder extends
      // @@protoc_insertion_point(interface_extends:contracts.v1.GitCommit)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>.contracts.v1.GitAuthor author = 2;</code>
     */
    boolean hasAuthor();
    /**
     * <code>.contracts.v1.GitAuthor author = 2;</code>
     */
    io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor getAuthor();
    /**
     * <code>.contracts.v1.GitAuthor author = 2;</code>
     */
    io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthorOrBuilder getAuthorOrBuilder();
  }
  /**
   * Protobuf type {@code contracts.v1.GitCommit}
   */
  public  static final class GitCommit extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:contracts.v1.GitCommit)
      GitCommitOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GitCommit.newBuilder() to construct.
    private GitCommit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GitCommit() {
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GitCommit(
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

              message_ = s;
              break;
            }
            case 18: {
              io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.Builder subBuilder = null;
              if (author_ != null) {
                subBuilder = author_.toBuilder();
              }
              author_ = input.readMessage(io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(author_);
                author_ = subBuilder.buildPartial();
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
      return io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.internal_static_contracts_v1_GitCommit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.internal_static_contracts_v1_GitCommit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit.class, io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit.Builder.class);
    }

    public static final int MESSAGE_FIELD_NUMBER = 1;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AUTHOR_FIELD_NUMBER = 2;
    private io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor author_;
    /**
     * <code>.contracts.v1.GitAuthor author = 2;</code>
     */
    public boolean hasAuthor() {
      return author_ != null;
    }
    /**
     * <code>.contracts.v1.GitAuthor author = 2;</code>
     */
    public io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor getAuthor() {
      return author_ == null ? io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.getDefaultInstance() : author_;
    }
    /**
     * <code>.contracts.v1.GitAuthor author = 2;</code>
     */
    public io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthorOrBuilder getAuthorOrBuilder() {
      return getAuthor();
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
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
      }
      if (author_ != null) {
        output.writeMessage(2, getAuthor());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
      }
      if (author_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAuthor());
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
      if (!(obj instanceof io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit)) {
        return super.equals(obj);
      }
      io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit other = (io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit) obj;

      boolean result = true;
      result = result && getMessage()
          .equals(other.getMessage());
      result = result && (hasAuthor() == other.hasAuthor());
      if (hasAuthor()) {
        result = result && getAuthor()
            .equals(other.getAuthor());
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
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      if (hasAuthor()) {
        hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
        hash = (53 * hash) + getAuthor().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parseFrom(
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
    public static Builder newBuilder(io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit prototype) {
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
     * Protobuf type {@code contracts.v1.GitCommit}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:contracts.v1.GitCommit)
        io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommitOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.internal_static_contracts_v1_GitCommit_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.internal_static_contracts_v1_GitCommit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit.class, io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit.Builder.class);
      }

      // Construct using io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit.newBuilder()
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
        message_ = "";

        if (authorBuilder_ == null) {
          author_ = null;
        } else {
          author_ = null;
          authorBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.internal_static_contracts_v1_GitCommit_descriptor;
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit getDefaultInstanceForType() {
        return io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit.getDefaultInstance();
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit build() {
        io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit buildPartial() {
        io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit result = new io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit(this);
        result.message_ = message_;
        if (authorBuilder_ == null) {
          result.author_ = author_;
        } else {
          result.author_ = authorBuilder_.build();
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
        if (other instanceof io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit) {
          return mergeFrom((io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit other) {
        if (other == io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit.getDefaultInstance()) return this;
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        if (other.hasAuthor()) {
          mergeAuthor(other.getAuthor());
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
        io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }

      private io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor author_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor, io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.Builder, io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthorOrBuilder> authorBuilder_;
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public boolean hasAuthor() {
        return authorBuilder_ != null || author_ != null;
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor getAuthor() {
        if (authorBuilder_ == null) {
          return author_ == null ? io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.getDefaultInstance() : author_;
        } else {
          return authorBuilder_.getMessage();
        }
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public Builder setAuthor(io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor value) {
        if (authorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          author_ = value;
          onChanged();
        } else {
          authorBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public Builder setAuthor(
          io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.Builder builderForValue) {
        if (authorBuilder_ == null) {
          author_ = builderForValue.build();
          onChanged();
        } else {
          authorBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public Builder mergeAuthor(io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor value) {
        if (authorBuilder_ == null) {
          if (author_ != null) {
            author_ =
              io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.newBuilder(author_).mergeFrom(value).buildPartial();
          } else {
            author_ = value;
          }
          onChanged();
        } else {
          authorBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public Builder clearAuthor() {
        if (authorBuilder_ == null) {
          author_ = null;
          onChanged();
        } else {
          author_ = null;
          authorBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.Builder getAuthorBuilder() {
        
        onChanged();
        return getAuthorFieldBuilder().getBuilder();
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      public io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthorOrBuilder getAuthorOrBuilder() {
        if (authorBuilder_ != null) {
          return authorBuilder_.getMessageOrBuilder();
        } else {
          return author_ == null ?
              io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.getDefaultInstance() : author_;
        }
      }
      /**
       * <code>.contracts.v1.GitAuthor author = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor, io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.Builder, io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthorOrBuilder> 
          getAuthorFieldBuilder() {
        if (authorBuilder_ == null) {
          authorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor, io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthor.Builder, io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.GitAuthorOrBuilder>(
                  getAuthor(),
                  getParentForChildren(),
                  isClean());
          author_ = null;
        }
        return authorBuilder_;
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


      // @@protoc_insertion_point(builder_scope:contracts.v1.GitCommit)
    }

    // @@protoc_insertion_point(class_scope:contracts.v1.GitCommit)
    private static final io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit();
    }

    public static io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GitCommit>
        PARSER = new com.google.protobuf.AbstractParser<GitCommit>() {
      @java.lang.Override
      public GitCommit parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GitCommit(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GitCommit> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GitCommit> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.estafette.ci.protos.contracts.v1.GitCommitOuterClass.GitCommit getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contracts_v1_GitCommit_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contracts_v1_GitCommit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$protos/contracts.v1/git_commit.proto\022\014" +
      "contracts.v1\032$protos/contracts.v1/git_au" +
      "thor.proto\"E\n\tGitCommit\022\017\n\007message\030\001 \001(\t" +
      "\022\'\n\006author\030\002 \001(\0132\027.contracts.v1.GitAutho" +
      "rB\177\n#io.estafette.ci.protos.contracts.v1" +
      "Z<github.com/estafette/estafette-ci-prot" +
      "os-golang/contracts_v1\252\002\031Estafette.CI.Co" +
      "ntracts.V1b\006proto3"
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
          io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.getDescriptor(),
        }, assigner);
    internal_static_contracts_v1_GitCommit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_contracts_v1_GitCommit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contracts_v1_GitCommit_descriptor,
        new java.lang.String[] { "Message", "Author", });
    io.estafette.ci.protos.contracts.v1.GitAuthorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
