// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/label.proto

package com.estafette.ci.contracts.v1;

public final class LabelOuterClass {
  private LabelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_contracts_v1_Label_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_contracts_v1_Label_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%estafette/ci/contracts/v1/label.proto\022" +
      "\031estafette.ci.contracts.v1\"#\n\005Label\022\013\n\003k" +
      "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\tB{\n\035com.estafette" +
      ".ci.contracts.v1P\001Z<github.com/estafette" +
      "/estafette-ci-protos-golang/contracts/v1" +
      "\252\002\031Estafette.Ci.Contracts.V1b\006proto3"
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
    internal_static_estafette_ci_contracts_v1_Label_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_contracts_v1_Label_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_contracts_v1_Label_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
