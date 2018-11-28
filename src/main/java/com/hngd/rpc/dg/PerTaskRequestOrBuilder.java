// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dgAPi.proto

package com.hngd.rpc.dg;

public interface PerTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hngdrpcdg.PerTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  boolean hasDevInfo();
  /**
   * <code>required .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  com.hngd.rpc.dg.DeviceInfo getDevInfo();
  /**
   * <code>required .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  com.hngd.rpc.dg.DeviceInfoOrBuilder getDevInfoOrBuilder();

  /**
   * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
   */
  boolean hasReQueryParam();
  /**
   * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
   */
  com.hngd.rpc.dg.RecordQueryParam getReQueryParam();
  /**
   * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
   */
  com.hngd.rpc.dg.RecordQueryParamOrBuilder getReQueryParamOrBuilder();

  /**
   * <pre>
   *循环周期，单位：秒
   * </pre>
   *
   * <code>optional int32 perSecs = 3;</code>
   */
  boolean hasPerSecs();
  /**
   * <pre>
   *循环周期，单位：秒
   * </pre>
   *
   * <code>optional int32 perSecs = 3;</code>
   */
  int getPerSecs();

  /**
   * <pre>
   *任务ID（CMS根据任务ID关联查询应答）
   * </pre>
   *
   * <code>optional string taskID = 4;</code>
   */
  boolean hasTaskID();
  /**
   * <pre>
   *任务ID（CMS根据任务ID关联查询应答）
   * </pre>
   *
   * <code>optional string taskID = 4;</code>
   */
  java.lang.String getTaskID();
  /**
   * <pre>
   *任务ID（CMS根据任务ID关联查询应答）
   * </pre>
   *
   * <code>optional string taskID = 4;</code>
   */
  com.google.protobuf.ByteString
      getTaskIDBytes();
}
