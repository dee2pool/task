// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dgAPi.proto

package com.hngd.rpc.dg;

/**
 * <pre>
 *录像查询请求
 * </pre>
 *
 * Protobuf type {@code hngdrpcdg.QuryFileRequest}
 */
public  final class QuryFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hngdrpcdg.QuryFileRequest)
    QuryFileRequestOrBuilder {
  // Use QuryFileRequest.newBuilder() to construct.
  private QuryFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuryFileRequest() {
    devInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuryFileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              devInfo_ = new java.util.ArrayList<com.hngd.rpc.dg.DeviceInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            devInfo_.add(
                input.readMessage(com.hngd.rpc.dg.DeviceInfo.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            com.hngd.rpc.dg.RecordQueryParam.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = reQueryParam_.toBuilder();
            }
            reQueryParam_ = input.readMessage(com.hngd.rpc.dg.RecordQueryParam.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(reQueryParam_);
              reQueryParam_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        devInfo_ = java.util.Collections.unmodifiableList(devInfo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_QuryFileRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_QuryFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hngd.rpc.dg.QuryFileRequest.class, com.hngd.rpc.dg.QuryFileRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DEVINFO_FIELD_NUMBER = 1;
  private java.util.List<com.hngd.rpc.dg.DeviceInfo> devInfo_;
  /**
   * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  public java.util.List<com.hngd.rpc.dg.DeviceInfo> getDevInfoList() {
    return devInfo_;
  }
  /**
   * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  public java.util.List<? extends com.hngd.rpc.dg.DeviceInfoOrBuilder> 
      getDevInfoOrBuilderList() {
    return devInfo_;
  }
  /**
   * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  public int getDevInfoCount() {
    return devInfo_.size();
  }
  /**
   * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  public com.hngd.rpc.dg.DeviceInfo getDevInfo(int index) {
    return devInfo_.get(index);
  }
  /**
   * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
   */
  public com.hngd.rpc.dg.DeviceInfoOrBuilder getDevInfoOrBuilder(
      int index) {
    return devInfo_.get(index);
  }

  public static final int REQUERYPARAM_FIELD_NUMBER = 2;
  private com.hngd.rpc.dg.RecordQueryParam reQueryParam_;
  /**
   * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
   */
  public boolean hasReQueryParam() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
   */
  public com.hngd.rpc.dg.RecordQueryParam getReQueryParam() {
    return reQueryParam_ == null ? com.hngd.rpc.dg.RecordQueryParam.getDefaultInstance() : reQueryParam_;
  }
  /**
   * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
   */
  public com.hngd.rpc.dg.RecordQueryParamOrBuilder getReQueryParamOrBuilder() {
    return reQueryParam_ == null ? com.hngd.rpc.dg.RecordQueryParam.getDefaultInstance() : reQueryParam_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getDevInfoCount(); i++) {
      if (!getDevInfo(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < devInfo_.size(); i++) {
      output.writeMessage(1, devInfo_.get(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(2, getReQueryParam());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < devInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, devInfo_.get(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReQueryParam());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hngd.rpc.dg.QuryFileRequest)) {
      return super.equals(obj);
    }
    com.hngd.rpc.dg.QuryFileRequest other = (com.hngd.rpc.dg.QuryFileRequest) obj;

    boolean result = true;
    result = result && getDevInfoList()
        .equals(other.getDevInfoList());
    result = result && (hasReQueryParam() == other.hasReQueryParam());
    if (hasReQueryParam()) {
      result = result && getReQueryParam()
          .equals(other.getReQueryParam());
    }
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
    if (getDevInfoCount() > 0) {
      hash = (37 * hash) + DEVINFO_FIELD_NUMBER;
      hash = (53 * hash) + getDevInfoList().hashCode();
    }
    if (hasReQueryParam()) {
      hash = (37 * hash) + REQUERYPARAM_FIELD_NUMBER;
      hash = (53 * hash) + getReQueryParam().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hngd.rpc.dg.QuryFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hngd.rpc.dg.QuryFileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   *录像查询请求
   * </pre>
   *
   * Protobuf type {@code hngdrpcdg.QuryFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hngdrpcdg.QuryFileRequest)
      com.hngd.rpc.dg.QuryFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_QuryFileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_QuryFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hngd.rpc.dg.QuryFileRequest.class, com.hngd.rpc.dg.QuryFileRequest.Builder.class);
    }

    // Construct using com.hngd.rpc.dg.QuryFileRequest.newBuilder()
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
        getDevInfoFieldBuilder();
        getReQueryParamFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (devInfoBuilder_ == null) {
        devInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        devInfoBuilder_.clear();
      }
      if (reQueryParamBuilder_ == null) {
        reQueryParam_ = null;
      } else {
        reQueryParamBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_QuryFileRequest_descriptor;
    }

    public com.hngd.rpc.dg.QuryFileRequest getDefaultInstanceForType() {
      return com.hngd.rpc.dg.QuryFileRequest.getDefaultInstance();
    }

    public com.hngd.rpc.dg.QuryFileRequest build() {
      com.hngd.rpc.dg.QuryFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hngd.rpc.dg.QuryFileRequest buildPartial() {
      com.hngd.rpc.dg.QuryFileRequest result = new com.hngd.rpc.dg.QuryFileRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (devInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          devInfo_ = java.util.Collections.unmodifiableList(devInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.devInfo_ = devInfo_;
      } else {
        result.devInfo_ = devInfoBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000001;
      }
      if (reQueryParamBuilder_ == null) {
        result.reQueryParam_ = reQueryParam_;
      } else {
        result.reQueryParam_ = reQueryParamBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hngd.rpc.dg.QuryFileRequest) {
        return mergeFrom((com.hngd.rpc.dg.QuryFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hngd.rpc.dg.QuryFileRequest other) {
      if (other == com.hngd.rpc.dg.QuryFileRequest.getDefaultInstance()) return this;
      if (devInfoBuilder_ == null) {
        if (!other.devInfo_.isEmpty()) {
          if (devInfo_.isEmpty()) {
            devInfo_ = other.devInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDevInfoIsMutable();
            devInfo_.addAll(other.devInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.devInfo_.isEmpty()) {
          if (devInfoBuilder_.isEmpty()) {
            devInfoBuilder_.dispose();
            devInfoBuilder_ = null;
            devInfo_ = other.devInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            devInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDevInfoFieldBuilder() : null;
          } else {
            devInfoBuilder_.addAllMessages(other.devInfo_);
          }
        }
      }
      if (other.hasReQueryParam()) {
        mergeReQueryParam(other.getReQueryParam());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      for (int i = 0; i < getDevInfoCount(); i++) {
        if (!getDevInfo(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hngd.rpc.dg.QuryFileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hngd.rpc.dg.QuryFileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.hngd.rpc.dg.DeviceInfo> devInfo_ =
      java.util.Collections.emptyList();
    private void ensureDevInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        devInfo_ = new java.util.ArrayList<com.hngd.rpc.dg.DeviceInfo>(devInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hngd.rpc.dg.DeviceInfo, com.hngd.rpc.dg.DeviceInfo.Builder, com.hngd.rpc.dg.DeviceInfoOrBuilder> devInfoBuilder_;

    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public java.util.List<com.hngd.rpc.dg.DeviceInfo> getDevInfoList() {
      if (devInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devInfo_);
      } else {
        return devInfoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public int getDevInfoCount() {
      if (devInfoBuilder_ == null) {
        return devInfo_.size();
      } else {
        return devInfoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public com.hngd.rpc.dg.DeviceInfo getDevInfo(int index) {
      if (devInfoBuilder_ == null) {
        return devInfo_.get(index);
      } else {
        return devInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder setDevInfo(
        int index, com.hngd.rpc.dg.DeviceInfo value) {
      if (devInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevInfoIsMutable();
        devInfo_.set(index, value);
        onChanged();
      } else {
        devInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder setDevInfo(
        int index, com.hngd.rpc.dg.DeviceInfo.Builder builderForValue) {
      if (devInfoBuilder_ == null) {
        ensureDevInfoIsMutable();
        devInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        devInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder addDevInfo(com.hngd.rpc.dg.DeviceInfo value) {
      if (devInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevInfoIsMutable();
        devInfo_.add(value);
        onChanged();
      } else {
        devInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder addDevInfo(
        int index, com.hngd.rpc.dg.DeviceInfo value) {
      if (devInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevInfoIsMutable();
        devInfo_.add(index, value);
        onChanged();
      } else {
        devInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder addDevInfo(
        com.hngd.rpc.dg.DeviceInfo.Builder builderForValue) {
      if (devInfoBuilder_ == null) {
        ensureDevInfoIsMutable();
        devInfo_.add(builderForValue.build());
        onChanged();
      } else {
        devInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder addDevInfo(
        int index, com.hngd.rpc.dg.DeviceInfo.Builder builderForValue) {
      if (devInfoBuilder_ == null) {
        ensureDevInfoIsMutable();
        devInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        devInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder addAllDevInfo(
        java.lang.Iterable<? extends com.hngd.rpc.dg.DeviceInfo> values) {
      if (devInfoBuilder_ == null) {
        ensureDevInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, devInfo_);
        onChanged();
      } else {
        devInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder clearDevInfo() {
      if (devInfoBuilder_ == null) {
        devInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        devInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public Builder removeDevInfo(int index) {
      if (devInfoBuilder_ == null) {
        ensureDevInfoIsMutable();
        devInfo_.remove(index);
        onChanged();
      } else {
        devInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public com.hngd.rpc.dg.DeviceInfo.Builder getDevInfoBuilder(
        int index) {
      return getDevInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public com.hngd.rpc.dg.DeviceInfoOrBuilder getDevInfoOrBuilder(
        int index) {
      if (devInfoBuilder_ == null) {
        return devInfo_.get(index);  } else {
        return devInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public java.util.List<? extends com.hngd.rpc.dg.DeviceInfoOrBuilder> 
         getDevInfoOrBuilderList() {
      if (devInfoBuilder_ != null) {
        return devInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devInfo_);
      }
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public com.hngd.rpc.dg.DeviceInfo.Builder addDevInfoBuilder() {
      return getDevInfoFieldBuilder().addBuilder(
          com.hngd.rpc.dg.DeviceInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public com.hngd.rpc.dg.DeviceInfo.Builder addDevInfoBuilder(
        int index) {
      return getDevInfoFieldBuilder().addBuilder(
          index, com.hngd.rpc.dg.DeviceInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .hngdrpcdg.DeviceInfo devInfo = 1;</code>
     */
    public java.util.List<com.hngd.rpc.dg.DeviceInfo.Builder> 
         getDevInfoBuilderList() {
      return getDevInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hngd.rpc.dg.DeviceInfo, com.hngd.rpc.dg.DeviceInfo.Builder, com.hngd.rpc.dg.DeviceInfoOrBuilder> 
        getDevInfoFieldBuilder() {
      if (devInfoBuilder_ == null) {
        devInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hngd.rpc.dg.DeviceInfo, com.hngd.rpc.dg.DeviceInfo.Builder, com.hngd.rpc.dg.DeviceInfoOrBuilder>(
                devInfo_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        devInfo_ = null;
      }
      return devInfoBuilder_;
    }

    private com.hngd.rpc.dg.RecordQueryParam reQueryParam_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hngd.rpc.dg.RecordQueryParam, com.hngd.rpc.dg.RecordQueryParam.Builder, com.hngd.rpc.dg.RecordQueryParamOrBuilder> reQueryParamBuilder_;
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public boolean hasReQueryParam() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public com.hngd.rpc.dg.RecordQueryParam getReQueryParam() {
      if (reQueryParamBuilder_ == null) {
        return reQueryParam_ == null ? com.hngd.rpc.dg.RecordQueryParam.getDefaultInstance() : reQueryParam_;
      } else {
        return reQueryParamBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public Builder setReQueryParam(com.hngd.rpc.dg.RecordQueryParam value) {
      if (reQueryParamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reQueryParam_ = value;
        onChanged();
      } else {
        reQueryParamBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public Builder setReQueryParam(
        com.hngd.rpc.dg.RecordQueryParam.Builder builderForValue) {
      if (reQueryParamBuilder_ == null) {
        reQueryParam_ = builderForValue.build();
        onChanged();
      } else {
        reQueryParamBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public Builder mergeReQueryParam(com.hngd.rpc.dg.RecordQueryParam value) {
      if (reQueryParamBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            reQueryParam_ != null &&
            reQueryParam_ != com.hngd.rpc.dg.RecordQueryParam.getDefaultInstance()) {
          reQueryParam_ =
            com.hngd.rpc.dg.RecordQueryParam.newBuilder(reQueryParam_).mergeFrom(value).buildPartial();
        } else {
          reQueryParam_ = value;
        }
        onChanged();
      } else {
        reQueryParamBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public Builder clearReQueryParam() {
      if (reQueryParamBuilder_ == null) {
        reQueryParam_ = null;
        onChanged();
      } else {
        reQueryParamBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public com.hngd.rpc.dg.RecordQueryParam.Builder getReQueryParamBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReQueryParamFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    public com.hngd.rpc.dg.RecordQueryParamOrBuilder getReQueryParamOrBuilder() {
      if (reQueryParamBuilder_ != null) {
        return reQueryParamBuilder_.getMessageOrBuilder();
      } else {
        return reQueryParam_ == null ?
            com.hngd.rpc.dg.RecordQueryParam.getDefaultInstance() : reQueryParam_;
      }
    }
    /**
     * <code>optional .hngdrpcdg.RecordQueryParam reQueryParam = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hngd.rpc.dg.RecordQueryParam, com.hngd.rpc.dg.RecordQueryParam.Builder, com.hngd.rpc.dg.RecordQueryParamOrBuilder> 
        getReQueryParamFieldBuilder() {
      if (reQueryParamBuilder_ == null) {
        reQueryParamBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hngd.rpc.dg.RecordQueryParam, com.hngd.rpc.dg.RecordQueryParam.Builder, com.hngd.rpc.dg.RecordQueryParamOrBuilder>(
                getReQueryParam(),
                getParentForChildren(),
                isClean());
        reQueryParam_ = null;
      }
      return reQueryParamBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:hngdrpcdg.QuryFileRequest)
  }

  // @@protoc_insertion_point(class_scope:hngdrpcdg.QuryFileRequest)
  private static final com.hngd.rpc.dg.QuryFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hngd.rpc.dg.QuryFileRequest();
  }

  public static com.hngd.rpc.dg.QuryFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<QuryFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<QuryFileRequest>() {
    public QuryFileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuryFileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuryFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuryFileRequest> getParserForType() {
    return PARSER;
  }

  public com.hngd.rpc.dg.QuryFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

