// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_pub_sub_trigger.proto

package com.estafette.ci.manifest.v1;

public final class EstafettePubSubTriggerOuterClass {
  private EstafettePubSubTriggerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafettePubSubTrigger_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafettePubSubTrigger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8estafette/ci/manifest/v1/estafette_pub" +
      "_sub_trigger.proto\022\030estafette.ci.manifes" +
      "t.v1\"8\n\026EstafettePubSubTrigger\022\017\n\007projec" +
      "t\030\001 \001(\t\022\r\n\005topic\030\002 \001(\tBx\n\034com.estafette." +
      "ci.manifest.v1P\001Z;github.com/estafette/e" +
      "stafette-ci-protos-golang/manifest_v1\252\002\030" +
      "Estafette.Ci.Manifest.V1b\006proto3"
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
    internal_static_estafette_ci_manifest_v1_EstafettePubSubTrigger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafettePubSubTrigger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafettePubSubTrigger_descriptor,
        new java.lang.String[] { "Project", "Topic", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
