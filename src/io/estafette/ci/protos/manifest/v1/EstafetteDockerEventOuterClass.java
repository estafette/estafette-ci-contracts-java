// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/manifest.v1/estafette_docker_event.proto

package io.estafette.ci.protos.manifest.v1;

public final class EstafetteDockerEventOuterClass {
  private EstafetteDockerEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EstafetteDockerEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:manifest.v1.EstafetteDockerEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string event = 1;</code>
     */
    java.lang.String getEvent();
    /**
     * <code>string event = 1;</code>
     */
    com.google.protobuf.ByteString
        getEventBytes();

    /**
     * <code>string image = 2;</code>
     */
    java.lang.String getImage();
    /**
     * <code>string image = 2;</code>
     */
    com.google.protobuf.ByteString
        getImageBytes();

    /**
     * <code>string tag = 3;</code>
     */
    java.lang.String getTag();
    /**
     * <code>string tag = 3;</code>
     */
    com.google.protobuf.ByteString
        getTagBytes();
  }
  /**
   * Protobuf type {@code manifest.v1.EstafetteDockerEvent}
   */
  public  static final class EstafetteDockerEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:manifest.v1.EstafetteDockerEvent)
      EstafetteDockerEventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EstafetteDockerEvent.newBuilder() to construct.
    private EstafetteDockerEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EstafetteDockerEvent() {
      event_ = "";
      image_ = "";
      tag_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EstafetteDockerEvent(
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

              event_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              image_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              tag_ = s;
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
      return io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.internal_static_manifest_v1_EstafetteDockerEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.internal_static_manifest_v1_EstafetteDockerEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent.class, io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent.Builder.class);
    }

    public static final int EVENT_FIELD_NUMBER = 1;
    private volatile java.lang.Object event_;
    /**
     * <code>string event = 1;</code>
     */
    public java.lang.String getEvent() {
      java.lang.Object ref = event_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        event_ = s;
        return s;
      }
    }
    /**
     * <code>string event = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEventBytes() {
      java.lang.Object ref = event_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        event_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IMAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object image_;
    /**
     * <code>string image = 2;</code>
     */
    public java.lang.String getImage() {
      java.lang.Object ref = image_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        image_ = s;
        return s;
      }
    }
    /**
     * <code>string image = 2;</code>
     */
    public com.google.protobuf.ByteString
        getImageBytes() {
      java.lang.Object ref = image_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        image_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TAG_FIELD_NUMBER = 3;
    private volatile java.lang.Object tag_;
    /**
     * <code>string tag = 3;</code>
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      }
    }
    /**
     * <code>string tag = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
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
      if (!getEventBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, event_);
      }
      if (!getImageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, image_);
      }
      if (!getTagBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tag_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEventBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, event_);
      }
      if (!getImageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, image_);
      }
      if (!getTagBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tag_);
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
      if (!(obj instanceof io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent)) {
        return super.equals(obj);
      }
      io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent other = (io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent) obj;

      boolean result = true;
      result = result && getEvent()
          .equals(other.getEvent());
      result = result && getImage()
          .equals(other.getImage());
      result = result && getTag()
          .equals(other.getTag());
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
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
      hash = (37 * hash) + IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getImage().hashCode();
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parseFrom(
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
    public static Builder newBuilder(io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent prototype) {
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
     * Protobuf type {@code manifest.v1.EstafetteDockerEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:manifest.v1.EstafetteDockerEvent)
        io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.internal_static_manifest_v1_EstafetteDockerEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.internal_static_manifest_v1_EstafetteDockerEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent.class, io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent.Builder.class);
      }

      // Construct using io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent.newBuilder()
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
        event_ = "";

        image_ = "";

        tag_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.internal_static_manifest_v1_EstafetteDockerEvent_descriptor;
      }

      @java.lang.Override
      public io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent getDefaultInstanceForType() {
        return io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent.getDefaultInstance();
      }

      @java.lang.Override
      public io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent build() {
        io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent buildPartial() {
        io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent result = new io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent(this);
        result.event_ = event_;
        result.image_ = image_;
        result.tag_ = tag_;
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
        if (other instanceof io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent) {
          return mergeFrom((io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent other) {
        if (other == io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent.getDefaultInstance()) return this;
        if (!other.getEvent().isEmpty()) {
          event_ = other.event_;
          onChanged();
        }
        if (!other.getImage().isEmpty()) {
          image_ = other.image_;
          onChanged();
        }
        if (!other.getTag().isEmpty()) {
          tag_ = other.tag_;
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
        io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object event_ = "";
      /**
       * <code>string event = 1;</code>
       */
      public java.lang.String getEvent() {
        java.lang.Object ref = event_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          event_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string event = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEventBytes() {
        java.lang.Object ref = event_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          event_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string event = 1;</code>
       */
      public Builder setEvent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        event_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string event = 1;</code>
       */
      public Builder clearEvent() {
        
        event_ = getDefaultInstance().getEvent();
        onChanged();
        return this;
      }
      /**
       * <code>string event = 1;</code>
       */
      public Builder setEventBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        event_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object image_ = "";
      /**
       * <code>string image = 2;</code>
       */
      public java.lang.String getImage() {
        java.lang.Object ref = image_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          image_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string image = 2;</code>
       */
      public com.google.protobuf.ByteString
          getImageBytes() {
        java.lang.Object ref = image_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          image_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string image = 2;</code>
       */
      public Builder setImage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        image_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string image = 2;</code>
       */
      public Builder clearImage() {
        
        image_ = getDefaultInstance().getImage();
        onChanged();
        return this;
      }
      /**
       * <code>string image = 2;</code>
       */
      public Builder setImageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        image_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object tag_ = "";
      /**
       * <code>string tag = 3;</code>
       */
      public java.lang.String getTag() {
        java.lang.Object ref = tag_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          tag_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string tag = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTagBytes() {
        java.lang.Object ref = tag_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tag_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tag = 3;</code>
       */
      public Builder setTag(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 3;</code>
       */
      public Builder clearTag() {
        
        tag_ = getDefaultInstance().getTag();
        onChanged();
        return this;
      }
      /**
       * <code>string tag = 3;</code>
       */
      public Builder setTagBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tag_ = value;
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


      // @@protoc_insertion_point(builder_scope:manifest.v1.EstafetteDockerEvent)
    }

    // @@protoc_insertion_point(class_scope:manifest.v1.EstafetteDockerEvent)
    private static final io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent();
    }

    public static io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EstafetteDockerEvent>
        PARSER = new com.google.protobuf.AbstractParser<EstafetteDockerEvent>() {
      @java.lang.Override
      public EstafetteDockerEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EstafetteDockerEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EstafetteDockerEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EstafetteDockerEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.estafette.ci.protos.manifest.v1.EstafetteDockerEventOuterClass.EstafetteDockerEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manifest_v1_EstafetteDockerEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manifest_v1_EstafetteDockerEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/protos/manifest.v1/estafette_docker_ev" +
      "ent.proto\022\013manifest.v1\"A\n\024EstafetteDocke" +
      "rEvent\022\r\n\005event\030\001 \001(\t\022\r\n\005image\030\002 \001(\t\022\013\n\003" +
      "tag\030\003 \001(\tB|\n\"io.estafette.ci.protos.mani" +
      "fest.v1Z;github.com/estafette/estafette-" +
      "ci-protos-golang/manifest_v1\252\002\030Estafette" +
      ".CI.Manifest.V1b\006proto3"
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
    internal_static_manifest_v1_EstafetteDockerEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manifest_v1_EstafetteDockerEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manifest_v1_EstafetteDockerEvent_descriptor,
        new java.lang.String[] { "Event", "Image", "Tag", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
