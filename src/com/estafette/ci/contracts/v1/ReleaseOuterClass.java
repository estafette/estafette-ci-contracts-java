// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/release.proto

package com.estafette.ci.contracts.v1;

public final class ReleaseOuterClass {
  private ReleaseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_contracts_v1_Release_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_contracts_v1_Release_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'estafette/ci/contracts/v1/release.prot" +
      "o\022\031estafette.ci.contracts.v1\032\036google/pro" +
      "tobuf/duration.proto\032\037google/protobuf/ti" +
      "mestamp.proto\032.estafette/ci/manifest/v1/" +
      "estafette_event.proto\"\337\002\n\007Release\022\014\n\004nam" +
      "e\030\001 \001(\t\022\016\n\006action\030\002 \001(\t\022\n\n\002id\030\003 \001(\t\022\023\n\013r" +
      "epo_source\030\004 \001(\t\022\022\n\nrepo_owner\030\005 \001(\t\022\027\n\017" +
      "release_version\030\006 \001(\t\022\026\n\016release_status\030" +
      "\007 \001(\t\0228\n\006events\030\010 \003(\0132(.estafette.ci.man" +
      "ifest.v1.EstafetteEvent\0224\n\020inserted_at_t" +
      "ime\030\t \001(\0132\032.google.protobuf.Timestamp\0223\n" +
      "\017updated_at_time\030\n \001(\0132\032.google.protobuf" +
      ".Timestamp\022+\n\010duration\030\013 \001(\0132\031.google.pr" +
      "otobuf.DurationB{\n\035com.estafette.ci.cont" +
      "racts.v1P\001Z<github.com/estafette/estafet" +
      "te-ci-protos-golang/contracts/v1\252\002\031Estaf" +
      "ette.Ci.Contracts.V1b\006proto3"
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
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteEventOuterClass.getDescriptor(),
        }, assigner);
    internal_static_estafette_ci_contracts_v1_Release_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_contracts_v1_Release_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_contracts_v1_Release_descriptor,
        new java.lang.String[] { "Name", "Action", "Id", "RepoSource", "RepoOwner", "ReleaseVersion", "ReleaseStatus", "Events", "InsertedAtTime", "UpdatedAtTime", "Duration", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteEventOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}