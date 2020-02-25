// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: estafette/ci/contracts/v1/build.proto

package com.estafette.ci.contracts.v1;

public interface BuildOrBuilder extends
    // @@protoc_insertion_point(interface_extends:estafette.ci.contracts.v1.Build)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string repo_source = 2;</code>
   */
  java.lang.String getRepoSource();
  /**
   * <code>string repo_source = 2;</code>
   */
  com.google.protobuf.ByteString
      getRepoSourceBytes();

  /**
   * <code>string repo_owner = 3;</code>
   */
  java.lang.String getRepoOwner();
  /**
   * <code>string repo_owner = 3;</code>
   */
  com.google.protobuf.ByteString
      getRepoOwnerBytes();

  /**
   * <code>string repo_name = 4;</code>
   */
  java.lang.String getRepoName();
  /**
   * <code>string repo_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getRepoNameBytes();

  /**
   * <code>string repo_branch = 5;</code>
   */
  java.lang.String getRepoBranch();
  /**
   * <code>string repo_branch = 5;</code>
   */
  com.google.protobuf.ByteString
      getRepoBranchBytes();

  /**
   * <code>string repo_revision = 6;</code>
   */
  java.lang.String getRepoRevision();
  /**
   * <code>string repo_revision = 6;</code>
   */
  com.google.protobuf.ByteString
      getRepoRevisionBytes();

  /**
   * <code>string build_version = 7;</code>
   */
  java.lang.String getBuildVersion();
  /**
   * <code>string build_version = 7;</code>
   */
  com.google.protobuf.ByteString
      getBuildVersionBytes();

  /**
   * <code>string build_status = 8;</code>
   */
  java.lang.String getBuildStatus();
  /**
   * <code>string build_status = 8;</code>
   */
  com.google.protobuf.ByteString
      getBuildStatusBytes();

  /**
   * <code>repeated .estafette.ci.contracts.v1.Label labels = 9;</code>
   */
  java.util.List<com.estafette.ci.contracts.v1.Label> 
      getLabelsList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.Label labels = 9;</code>
   */
  com.estafette.ci.contracts.v1.Label getLabels(int index);
  /**
   * <code>repeated .estafette.ci.contracts.v1.Label labels = 9;</code>
   */
  int getLabelsCount();
  /**
   * <code>repeated .estafette.ci.contracts.v1.Label labels = 9;</code>
   */
  java.util.List<? extends com.estafette.ci.contracts.v1.LabelOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.Label labels = 9;</code>
   */
  com.estafette.ci.contracts.v1.LabelOrBuilder getLabelsOrBuilder(
      int index);

  /**
   * <code>repeated .estafette.ci.contracts.v1.ReleaseTarget release_targets = 10;</code>
   */
  java.util.List<com.estafette.ci.contracts.v1.ReleaseTarget> 
      getReleaseTargetsList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.ReleaseTarget release_targets = 10;</code>
   */
  com.estafette.ci.contracts.v1.ReleaseTarget getReleaseTargets(int index);
  /**
   * <code>repeated .estafette.ci.contracts.v1.ReleaseTarget release_targets = 10;</code>
   */
  int getReleaseTargetsCount();
  /**
   * <code>repeated .estafette.ci.contracts.v1.ReleaseTarget release_targets = 10;</code>
   */
  java.util.List<? extends com.estafette.ci.contracts.v1.ReleaseTargetOrBuilder> 
      getReleaseTargetsOrBuilderList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.ReleaseTarget release_targets = 10;</code>
   */
  com.estafette.ci.contracts.v1.ReleaseTargetOrBuilder getReleaseTargetsOrBuilder(
      int index);

  /**
   * <code>string manifest = 11;</code>
   */
  java.lang.String getManifest();
  /**
   * <code>string manifest = 11;</code>
   */
  com.google.protobuf.ByteString
      getManifestBytes();

  /**
   * <code>string manifest_with_defaults = 12;</code>
   */
  java.lang.String getManifestWithDefaults();
  /**
   * <code>string manifest_with_defaults = 12;</code>
   */
  com.google.protobuf.ByteString
      getManifestWithDefaultsBytes();

  /**
   * <code>repeated .estafette.ci.contracts.v1.GitCommit commits = 13;</code>
   */
  java.util.List<com.estafette.ci.contracts.v1.GitCommit> 
      getCommitsList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.GitCommit commits = 13;</code>
   */
  com.estafette.ci.contracts.v1.GitCommit getCommits(int index);
  /**
   * <code>repeated .estafette.ci.contracts.v1.GitCommit commits = 13;</code>
   */
  int getCommitsCount();
  /**
   * <code>repeated .estafette.ci.contracts.v1.GitCommit commits = 13;</code>
   */
  java.util.List<? extends com.estafette.ci.contracts.v1.GitCommitOrBuilder> 
      getCommitsOrBuilderList();
  /**
   * <code>repeated .estafette.ci.contracts.v1.GitCommit commits = 13;</code>
   */
  com.estafette.ci.contracts.v1.GitCommitOrBuilder getCommitsOrBuilder(
      int index);

  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteTrigger triggers = 14;</code>
   */
  java.util.List<com.estafette.ci.manifest.v1.EstafetteTrigger> 
      getTriggersList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteTrigger triggers = 14;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteTrigger getTriggers(int index);
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteTrigger triggers = 14;</code>
   */
  int getTriggersCount();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteTrigger triggers = 14;</code>
   */
  java.util.List<? extends com.estafette.ci.manifest.v1.EstafetteTriggerOrBuilder> 
      getTriggersOrBuilderList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteTrigger triggers = 14;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteTriggerOrBuilder getTriggersOrBuilder(
      int index);

  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 15;</code>
   */
  java.util.List<com.estafette.ci.manifest.v1.EstafetteEvent> 
      getEventsList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 15;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteEvent getEvents(int index);
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 15;</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 15;</code>
   */
  java.util.List<? extends com.estafette.ci.manifest.v1.EstafetteEventOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .estafette.ci.manifest.v1.EstafetteEvent events = 15;</code>
   */
  com.estafette.ci.manifest.v1.EstafetteEventOrBuilder getEventsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Timestamp inserted_at_time = 16;</code>
   */
  boolean hasInsertedAtTime();
  /**
   * <code>.google.protobuf.Timestamp inserted_at_time = 16;</code>
   */
  com.google.protobuf.Timestamp getInsertedAtTime();
  /**
   * <code>.google.protobuf.Timestamp inserted_at_time = 16;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInsertedAtTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp updated_at_time = 17;</code>
   */
  boolean hasUpdatedAtTime();
  /**
   * <code>.google.protobuf.Timestamp updated_at_time = 17;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAtTime();
  /**
   * <code>.google.protobuf.Timestamp updated_at_time = 17;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtTimeOrBuilder();

  /**
   * <code>.google.protobuf.Duration duration = 18;</code>
   */
  boolean hasDuration();
  /**
   * <code>.google.protobuf.Duration duration = 18;</code>
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <code>.google.protobuf.Duration duration = 18;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}