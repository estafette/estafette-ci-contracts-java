// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/release_target.proto

package com.estafette.ci.contracts.v1;

public final class ReleaseTargetOuterClass {
  private ReleaseTargetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_contracts_v1_ReleaseTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_contracts_v1_ReleaseTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.estafette/ci/contracts/v1/release_targ" +
      "et.proto\022\031estafette.ci.contracts.v1\032\'est" +
      "afette/ci/contracts/v1/release.proto\0327es" +
      "tafette/ci/manifest/v1/estafette_release" +
      "_action.proto\"\235\001\n\rReleaseTarget\022\014\n\004name\030" +
      "\001 \001(\t\022A\n\007actions\030\002 \003(\01320.estafette.ci.ma" +
      "nifest.v1.EstafetteReleaseAction\022;\n\017acti" +
      "ve_releases\030\003 \003(\0132\".estafette.ci.contrac" +
      "ts.v1.ReleaseB{\n\035com.estafette.ci.contra" +
      "cts.v1P\001Z<github.com/estafette/estafette" +
      "-ci-protos-golang/contracts/v1\252\002\031Estafet" +
      "te.Ci.Contracts.V1b\006proto3"
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
          com.estafette.ci.contracts.v1.ReleaseOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteReleaseActionOuterClass.getDescriptor(),
        }, assigner);
    internal_static_estafette_ci_contracts_v1_ReleaseTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_contracts_v1_ReleaseTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_contracts_v1_ReleaseTarget_descriptor,
        new java.lang.String[] { "Name", "Actions", "ActiveReleases", });
    com.estafette.ci.contracts.v1.ReleaseOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteReleaseActionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
