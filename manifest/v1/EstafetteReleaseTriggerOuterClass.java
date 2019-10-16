// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manifest.v1/estafette_release_trigger.proto

package manifest.v1;

public final class EstafetteReleaseTriggerOuterClass {
  private EstafetteReleaseTriggerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EstafetteReleaseTriggerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:manifest.v1.EstafetteReleaseTrigger)
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
     * <code>string status = 2;</code>
     */
    java.lang.String getStatus();
    /**
     * <code>string status = 2;</code>
     */
    com.google.protobuf.ByteString
        getStatusBytes();

    /**
     * <code>string name = 3;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 3;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string target = 4;</code>
     */
    java.lang.String getTarget();
    /**
     * <code>string target = 4;</code>
     */
    com.google.protobuf.ByteString
        getTargetBytes();
  }
  /**
   * Protobuf type {@code manifest.v1.EstafetteReleaseTrigger}
   */
  public  static final class EstafetteReleaseTrigger extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:manifest.v1.EstafetteReleaseTrigger)
      EstafetteReleaseTriggerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EstafetteReleaseTrigger.newBuilder() to construct.
    private EstafetteReleaseTrigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EstafetteReleaseTrigger() {
      event_ = "";
      status_ = "";
      name_ = "";
      target_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EstafetteReleaseTrigger(
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

              status_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              target_ = s;
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
      return manifest.v1.EstafetteReleaseTriggerOuterClass.internal_static_manifest_v1_EstafetteReleaseTrigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return manifest.v1.EstafetteReleaseTriggerOuterClass.internal_static_manifest_v1_EstafetteReleaseTrigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger.class, manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger.Builder.class);
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

    public static final int STATUS_FIELD_NUMBER = 2;
    private volatile java.lang.Object status_;
    /**
     * <code>string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      }
    }
    /**
     * <code>string status = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGET_FIELD_NUMBER = 4;
    private volatile java.lang.Object target_;
    /**
     * <code>string target = 4;</code>
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
     * <code>string target = 4;</code>
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
      if (!getStatusBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
      }
      if (!getTargetBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, target_);
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
      if (!getStatusBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
      }
      if (!getTargetBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, target_);
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
      if (!(obj instanceof manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger)) {
        return super.equals(obj);
      }
      manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger other = (manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger) obj;

      boolean result = true;
      result = result && getEvent()
          .equals(other.getEvent());
      result = result && getStatus()
          .equals(other.getStatus());
      result = result && getName()
          .equals(other.getName());
      result = result && getTarget()
          .equals(other.getTarget());
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
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parseFrom(
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
    public static Builder newBuilder(manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger prototype) {
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
     * Protobuf type {@code manifest.v1.EstafetteReleaseTrigger}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:manifest.v1.EstafetteReleaseTrigger)
        manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTriggerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return manifest.v1.EstafetteReleaseTriggerOuterClass.internal_static_manifest_v1_EstafetteReleaseTrigger_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return manifest.v1.EstafetteReleaseTriggerOuterClass.internal_static_manifest_v1_EstafetteReleaseTrigger_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger.class, manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger.Builder.class);
      }

      // Construct using manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger.newBuilder()
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

        status_ = "";

        name_ = "";

        target_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return manifest.v1.EstafetteReleaseTriggerOuterClass.internal_static_manifest_v1_EstafetteReleaseTrigger_descriptor;
      }

      @java.lang.Override
      public manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger getDefaultInstanceForType() {
        return manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger.getDefaultInstance();
      }

      @java.lang.Override
      public manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger build() {
        manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger buildPartial() {
        manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger result = new manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger(this);
        result.event_ = event_;
        result.status_ = status_;
        result.name_ = name_;
        result.target_ = target_;
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
        if (other instanceof manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger) {
          return mergeFrom((manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger other) {
        if (other == manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger.getDefaultInstance()) return this;
        if (!other.getEvent().isEmpty()) {
          event_ = other.event_;
          onChanged();
        }
        if (!other.getStatus().isEmpty()) {
          status_ = other.status_;
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getTarget().isEmpty()) {
          target_ = other.target_;
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
        manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger) e.getUnfinishedMessage();
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

      private java.lang.Object status_ = "";
      /**
       * <code>string status = 2;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          status_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string status = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string status = 2;</code>
       */
      public Builder setStatus(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string status = 2;</code>
       */
      public Builder clearStatus() {
        
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       * <code>string status = 2;</code>
       */
      public Builder setStatusBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        status_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 3;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 3;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 3;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 3;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object target_ = "";
      /**
       * <code>string target = 4;</code>
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
       * <code>string target = 4;</code>
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
       * <code>string target = 4;</code>
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
       * <code>string target = 4;</code>
       */
      public Builder clearTarget() {
        
        target_ = getDefaultInstance().getTarget();
        onChanged();
        return this;
      }
      /**
       * <code>string target = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:manifest.v1.EstafetteReleaseTrigger)
    }

    // @@protoc_insertion_point(class_scope:manifest.v1.EstafetteReleaseTrigger)
    private static final manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger();
    }

    public static manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EstafetteReleaseTrigger>
        PARSER = new com.google.protobuf.AbstractParser<EstafetteReleaseTrigger>() {
      @java.lang.Override
      public EstafetteReleaseTrigger parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EstafetteReleaseTrigger(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EstafetteReleaseTrigger> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EstafetteReleaseTrigger> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public manifest.v1.EstafetteReleaseTriggerOuterClass.EstafetteReleaseTrigger getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manifest_v1_EstafetteReleaseTrigger_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manifest_v1_EstafetteReleaseTrigger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+manifest.v1/estafette_release_trigger." +
      "proto\022\013manifest.v1\"V\n\027EstafetteReleaseTr" +
      "igger\022\r\n\005event\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\022\014\n\004" +
      "name\030\003 \001(\t\022\016\n\006target\030\004 \001(\tB@Z>github.com" +
      "/estafette/estafette-ci-contracts-golang" +
      "/manifest_v1b\006proto3"
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
    internal_static_manifest_v1_EstafetteReleaseTrigger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manifest_v1_EstafetteReleaseTrigger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manifest_v1_EstafetteReleaseTrigger_descriptor,
        new java.lang.String[] { "Event", "Status", "Name", "Target", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}