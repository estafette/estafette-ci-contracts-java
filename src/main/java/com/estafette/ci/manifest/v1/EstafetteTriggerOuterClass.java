// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/manifest/v1/estafette_trigger.proto

package com.estafette.ci.manifest.v1;

public final class EstafetteTriggerOuterClass {
  private EstafetteTriggerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_estafette_ci_manifest_v1_EstafetteTrigger_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_estafette_ci_manifest_v1_EstafetteTrigger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0estafette/ci/manifest/v1/estafette_tri" +
      "gger.proto\022\030estafette.ci.manifest.v1\0325es" +
      "tafette/ci/manifest/v1/estafette_cron_tr" +
      "igger.proto\0327estafette/ci/manifest/v1/es" +
      "tafette_docker_trigger.proto\0324estafette/" +
      "ci/manifest/v1/estafette_git_trigger.pro" +
      "to\0329estafette/ci/manifest/v1/estafette_p" +
      "ipeline_trigger.proto\0328estafette/ci/mani" +
      "fest/v1/estafette_pub_sub_trigger.proto\032" +
      "8estafette/ci/manifest/v1/estafette_rele" +
      "ase_trigger.proto\032=estafette/ci/manifest" +
      "/v1/estafette_trigger_build_action.proto" +
      "\032?estafette/ci/manifest/v1/estafette_tri" +
      "gger_release_action.proto\"\271\004\n\020EstafetteT" +
      "rigger\022D\n\010pipeline\030\001 \001(\01322.estafette.ci." +
      "manifest.v1.EstafettePipelineTrigger\022B\n\007" +
      "release\030\002 \001(\01321.estafette.ci.manifest.v1" +
      ".EstafetteReleaseTrigger\022:\n\003git\030\003 \001(\0132-." +
      "estafette.ci.manifest.v1.EstafetteGitTri" +
      "gger\022@\n\006docker\030\004 \001(\01320.estafette.ci.mani" +
      "fest.v1.EstafetteDockerTrigger\022<\n\004cron\030\005" +
      " \001(\0132..estafette.ci.manifest.v1.Estafett" +
      "eCronTrigger\022A\n\007pub_sub\030\006 \001(\01320.estafett" +
      "e.ci.manifest.v1.EstafettePubSubTrigger\022" +
      "K\n\014build_action\030\007 \001(\01325.estafette.ci.man" +
      "ifest.v1.EstafetteTriggerBuildAction\022O\n\016" +
      "release_action\030\010 \001(\01327.estafette.ci.mani" +
      "fest.v1.EstafetteTriggerReleaseActionBx\n" +
      "\034com.estafette.ci.manifest.v1P\001Z;github." +
      "com/estafette/estafette-ci-protos-golang" +
      "/manifest_v1\252\002\030Estafette.Ci.Manifest.V1b" +
      "\006proto3"
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
          com.estafette.ci.manifest.v1.EstafetteCronTriggerOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteDockerTriggerOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteGitTriggerOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafettePipelineTriggerOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafettePubSubTriggerOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteReleaseTriggerOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteTriggerBuildActionOuterClass.getDescriptor(),
          com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOuterClass.getDescriptor(),
        }, assigner);
    internal_static_estafette_ci_manifest_v1_EstafetteTrigger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_estafette_ci_manifest_v1_EstafetteTrigger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_estafette_ci_manifest_v1_EstafetteTrigger_descriptor,
        new java.lang.String[] { "Pipeline", "Release", "Git", "Docker", "Cron", "PubSub", "BuildAction", "ReleaseAction", });
    com.estafette.ci.manifest.v1.EstafetteCronTriggerOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteDockerTriggerOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteGitTriggerOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafettePipelineTriggerOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafettePubSubTriggerOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteReleaseTriggerOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteTriggerBuildActionOuterClass.getDescriptor();
    com.estafette.ci.manifest.v1.EstafetteTriggerReleaseActionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}