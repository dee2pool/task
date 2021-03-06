// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dgAPi.proto

package com.hngd.rpc.dg;

public interface DeviceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:hngdrpcdg.DeviceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string strDeviceCode = 1;</code>
   */
  boolean hasStrDeviceCode();
  /**
   * <code>required string strDeviceCode = 1;</code>
   */
  java.lang.String getStrDeviceCode();
  /**
   * <code>required string strDeviceCode = 1;</code>
   */
  com.google.protobuf.ByteString
      getStrDeviceCodeBytes();

  /**
   * <code>optional string strLoginName = 2;</code>
   */
  boolean hasStrLoginName();
  /**
   * <code>optional string strLoginName = 2;</code>
   */
  java.lang.String getStrLoginName();
  /**
   * <code>optional string strLoginName = 2;</code>
   */
  com.google.protobuf.ByteString
      getStrLoginNameBytes();

  /**
   * <code>optional string strLoginPwd = 3;</code>
   */
  boolean hasStrLoginPwd();
  /**
   * <code>optional string strLoginPwd = 3;</code>
   */
  java.lang.String getStrLoginPwd();
  /**
   * <code>optional string strLoginPwd = 3;</code>
   */
  com.google.protobuf.ByteString
      getStrLoginPwdBytes();

  /**
   * <code>optional int32 nPort = 4;</code>
   */
  boolean hasNPort();
  /**
   * <code>optional int32 nPort = 4;</code>
   */
  int getNPort();

  /**
   * <code>optional string strIP = 5;</code>
   */
  boolean hasStrIP();
  /**
   * <code>optional string strIP = 5;</code>
   */
  java.lang.String getStrIP();
  /**
   * <code>optional string strIP = 5;</code>
   */
  com.google.protobuf.ByteString
      getStrIPBytes();

  /**
   * <code>optional int32 nChannel = 6;</code>
   */
  boolean hasNChannel();
  /**
   * <code>optional int32 nChannel = 6;</code>
   */
  int getNChannel();

  /**
   * <pre>
   *例如IPC,
   * </pre>
   *
   * <code>optional string deviceTypeCode = 9;</code>
   */
  boolean hasDeviceTypeCode();
  /**
   * <pre>
   *例如IPC,
   * </pre>
   *
   * <code>optional string deviceTypeCode = 9;</code>
   */
  java.lang.String getDeviceTypeCode();
  /**
   * <pre>
   *例如IPC,
   * </pre>
   *
   * <code>optional string deviceTypeCode = 9;</code>
   */
  com.google.protobuf.ByteString
      getDeviceTypeCodeBytes();

  /**
   * <code>optional string enVendor = 10;</code>
   */
  boolean hasEnVendor();
  /**
   * <code>optional string enVendor = 10;</code>
   */
  java.lang.String getEnVendor();
  /**
   * <code>optional string enVendor = 10;</code>
   */
  com.google.protobuf.ByteString
      getEnVendorBytes();
}
