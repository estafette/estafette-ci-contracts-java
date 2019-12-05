// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/contracts.v1/pagination.proto

package io.estafette.ci.protos.contracts.v1;

public final class PaginationOuterClass {
  private PaginationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PaginationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:contracts.v1.Pagination)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 page = 1;</code>
     */
    long getPage();

    /**
     * <code>int64 size = 2;</code>
     */
    long getSize();

    /**
     * <code>int64 total_pages = 3;</code>
     */
    long getTotalPages();

    /**
     * <code>int64 total_items = 4;</code>
     */
    long getTotalItems();
  }
  /**
   * Protobuf type {@code contracts.v1.Pagination}
   */
  public  static final class Pagination extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:contracts.v1.Pagination)
      PaginationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Pagination.newBuilder() to construct.
    private Pagination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Pagination() {
      page_ = 0L;
      size_ = 0L;
      totalPages_ = 0L;
      totalItems_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Pagination(
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

              page_ = input.readInt64();
              break;
            }
            case 16: {

              size_ = input.readInt64();
              break;
            }
            case 24: {

              totalPages_ = input.readInt64();
              break;
            }
            case 32: {

              totalItems_ = input.readInt64();
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
      return io.estafette.ci.protos.contracts.v1.PaginationOuterClass.internal_static_contracts_v1_Pagination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.estafette.ci.protos.contracts.v1.PaginationOuterClass.internal_static_contracts_v1_Pagination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination.class, io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination.Builder.class);
    }

    public static final int PAGE_FIELD_NUMBER = 1;
    private long page_;
    /**
     * <code>int64 page = 1;</code>
     */
    public long getPage() {
      return page_;
    }

    public static final int SIZE_FIELD_NUMBER = 2;
    private long size_;
    /**
     * <code>int64 size = 2;</code>
     */
    public long getSize() {
      return size_;
    }

    public static final int TOTAL_PAGES_FIELD_NUMBER = 3;
    private long totalPages_;
    /**
     * <code>int64 total_pages = 3;</code>
     */
    public long getTotalPages() {
      return totalPages_;
    }

    public static final int TOTAL_ITEMS_FIELD_NUMBER = 4;
    private long totalItems_;
    /**
     * <code>int64 total_items = 4;</code>
     */
    public long getTotalItems() {
      return totalItems_;
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
      if (page_ != 0L) {
        output.writeInt64(1, page_);
      }
      if (size_ != 0L) {
        output.writeInt64(2, size_);
      }
      if (totalPages_ != 0L) {
        output.writeInt64(3, totalPages_);
      }
      if (totalItems_ != 0L) {
        output.writeInt64(4, totalItems_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (page_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, page_);
      }
      if (size_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, size_);
      }
      if (totalPages_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, totalPages_);
      }
      if (totalItems_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, totalItems_);
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
      if (!(obj instanceof io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination)) {
        return super.equals(obj);
      }
      io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination other = (io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination) obj;

      boolean result = true;
      result = result && (getPage()
          == other.getPage());
      result = result && (getSize()
          == other.getSize());
      result = result && (getTotalPages()
          == other.getTotalPages());
      result = result && (getTotalItems()
          == other.getTotalItems());
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
      hash = (37 * hash) + PAGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPage());
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSize());
      hash = (37 * hash) + TOTAL_PAGES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalPages());
      hash = (37 * hash) + TOTAL_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTotalItems());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parseFrom(
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
    public static Builder newBuilder(io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination prototype) {
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
     * Protobuf type {@code contracts.v1.Pagination}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:contracts.v1.Pagination)
        io.estafette.ci.protos.contracts.v1.PaginationOuterClass.PaginationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.estafette.ci.protos.contracts.v1.PaginationOuterClass.internal_static_contracts_v1_Pagination_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.estafette.ci.protos.contracts.v1.PaginationOuterClass.internal_static_contracts_v1_Pagination_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination.class, io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination.Builder.class);
      }

      // Construct using io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination.newBuilder()
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
        page_ = 0L;

        size_ = 0L;

        totalPages_ = 0L;

        totalItems_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.estafette.ci.protos.contracts.v1.PaginationOuterClass.internal_static_contracts_v1_Pagination_descriptor;
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination getDefaultInstanceForType() {
        return io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination.getDefaultInstance();
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination build() {
        io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination buildPartial() {
        io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination result = new io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination(this);
        result.page_ = page_;
        result.size_ = size_;
        result.totalPages_ = totalPages_;
        result.totalItems_ = totalItems_;
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
        if (other instanceof io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination) {
          return mergeFrom((io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination other) {
        if (other == io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination.getDefaultInstance()) return this;
        if (other.getPage() != 0L) {
          setPage(other.getPage());
        }
        if (other.getSize() != 0L) {
          setSize(other.getSize());
        }
        if (other.getTotalPages() != 0L) {
          setTotalPages(other.getTotalPages());
        }
        if (other.getTotalItems() != 0L) {
          setTotalItems(other.getTotalItems());
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
        io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long page_ ;
      /**
       * <code>int64 page = 1;</code>
       */
      public long getPage() {
        return page_;
      }
      /**
       * <code>int64 page = 1;</code>
       */
      public Builder setPage(long value) {
        
        page_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 page = 1;</code>
       */
      public Builder clearPage() {
        
        page_ = 0L;
        onChanged();
        return this;
      }

      private long size_ ;
      /**
       * <code>int64 size = 2;</code>
       */
      public long getSize() {
        return size_;
      }
      /**
       * <code>int64 size = 2;</code>
       */
      public Builder setSize(long value) {
        
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 size = 2;</code>
       */
      public Builder clearSize() {
        
        size_ = 0L;
        onChanged();
        return this;
      }

      private long totalPages_ ;
      /**
       * <code>int64 total_pages = 3;</code>
       */
      public long getTotalPages() {
        return totalPages_;
      }
      /**
       * <code>int64 total_pages = 3;</code>
       */
      public Builder setTotalPages(long value) {
        
        totalPages_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 total_pages = 3;</code>
       */
      public Builder clearTotalPages() {
        
        totalPages_ = 0L;
        onChanged();
        return this;
      }

      private long totalItems_ ;
      /**
       * <code>int64 total_items = 4;</code>
       */
      public long getTotalItems() {
        return totalItems_;
      }
      /**
       * <code>int64 total_items = 4;</code>
       */
      public Builder setTotalItems(long value) {
        
        totalItems_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 total_items = 4;</code>
       */
      public Builder clearTotalItems() {
        
        totalItems_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:contracts.v1.Pagination)
    }

    // @@protoc_insertion_point(class_scope:contracts.v1.Pagination)
    private static final io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination();
    }

    public static io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Pagination>
        PARSER = new com.google.protobuf.AbstractParser<Pagination>() {
      @java.lang.Override
      public Pagination parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Pagination(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Pagination> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Pagination> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.estafette.ci.protos.contracts.v1.PaginationOuterClass.Pagination getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contracts_v1_Pagination_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contracts_v1_Pagination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$protos/contracts.v1/pagination.proto\022\014" +
      "contracts.v1\"R\n\nPagination\022\014\n\004page\030\001 \001(\003" +
      "\022\014\n\004size\030\002 \001(\003\022\023\n\013total_pages\030\003 \001(\003\022\023\n\013t" +
      "otal_items\030\004 \001(\003B\177\n#io.estafette.ci.prot" +
      "os.contracts.v1Z<github.com/estafette/es" +
      "tafette-ci-protos-golang/contracts_v1\252\002\031" +
      "Estafette.CI.Contracts.V1b\006proto3"
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
    internal_static_contracts_v1_Pagination_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_contracts_v1_Pagination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contracts_v1_Pagination_descriptor,
        new java.lang.String[] { "Page", "Size", "TotalPages", "TotalItems", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
