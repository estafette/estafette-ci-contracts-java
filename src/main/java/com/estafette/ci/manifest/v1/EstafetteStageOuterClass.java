// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_stage.proto

package com.estafette.ci.manifest.v1;

public final class EstafetteStageOuterClass {
  private EstafetteStageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteStage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteStage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteStage_EnvVarsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteStage_EnvVarsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteStage_CustomPropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteStage_CustomPropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.estafette/ci/manifest/v1/estafette_sta" +
      "ge.proto\022\030estafette.ci.manifest.v1\032\031goog" +
      "le/protobuf/any.proto\"\314\003\n\016EstafetteStage" +
      "\022\014\n\004name\030\001 \001(\t\022\027\n\017container_image\030\002 \001(\t\022" +
      "\r\n\005shell\030\003 \001(\t\022\031\n\021working_directory\030\004 \001(" +
      "\t\022\020\n\010commands\030\005 \003(\t\022\014\n\004when\030\006 \001(\t\022G\n\010env" +
      "_vars\030\007 \003(\01325.estafette.ci.manifest.v1.E" +
      "stafetteStage.EnvVarsEntry\022\025\n\rauto_injec" +
      "ted\030\010 \001(\010\022\017\n\007retries\030\t \001(\003\022Y\n\021custom_pro" +
      "perties\030\n \003(\0132>.estafette.ci.manifest.v1" +
      ".EstafetteStage.CustomPropertiesEntry\032.\n" +
      "\014EnvVarsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\001\032M\n\025CustomPropertiesEntry\022\013\n\003key\030\001 " +
      "\001(\t\022#\n\005value\030\002 \001(\0132\024.google.protobuf.Any" +
      ":\0028\001Bx\n\034com.estafette.ci.manifest.v1P\001Z;" +
      "github.com/estafette/estafette-ci-protos" +
      "-golang/manifest_v1\252\002\030Estafette.Ci.Manif" +
      "est.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_estafette_ci_manifest_v1_EstafetteStage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafetteStage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteStage_descriptor,
        new java.lang.String[] { "Name", "ContainerImage", "Shell", "WorkingDirectory", "Commands", "When", "EnvVars", "AutoInjected", "Retries", "CustomProperties", });
    internal_static_estafette_ci_manifest_v1_EstafetteStage_EnvVarsEntry_descriptor =
      internal_static_estafette_ci_manifest_v1_EstafetteStage_descriptor.getNestedTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafetteStage_EnvVarsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteStage_EnvVarsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_estafette_ci_manifest_v1_EstafetteStage_CustomPropertiesEntry_descriptor =
      internal_static_estafette_ci_manifest_v1_EstafetteStage_descriptor.getNestedTypes().get(1);
    internal_static_estafette_ci_manifest_v1_EstafetteStage_CustomPropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteStage_CustomPropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
