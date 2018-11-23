// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dgAPi.proto

package com.hngd.rpc.dg;

/**
 * <pre>
 *录像查询请求参数
 * </pre>
 *
 * Protobuf type {@code hngdrpcdg.RecordQueryParam}
 */
public  final class RecordQueryParam extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hngdrpcdg.RecordQueryParam)
    RecordQueryParamOrBuilder {
  // Use RecordQueryParam.newBuilder() to construct.
  private RecordQueryParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordQueryParam() {
    subStream_ = 0;
    fileType_ = "";
    startTime_ = 0L;
    endTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecordQueryParam(
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
          case 8: {
            bitField0_ |= 0x00000001;
            subStream_ = input.readInt32();
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            fileType_ = bs;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            startTime_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            endTime_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_RecordQueryParam_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_RecordQueryParam_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hngd.rpc.dg.RecordQueryParam.class, com.hngd.rpc.dg.RecordQueryParam.Builder.class);
  }

  private int bitField0_;
  public static final int SUBSTREAM_FIELD_NUMBER = 1;
  private int subStream_;
  /**
   * <code>optional int32 subStream = 1;</code>
   */
  public boolean hasSubStream() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 subStream = 1;</code>
   */
  public int getSubStream() {
    return subStream_;
  }

  public static final int FILETYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object fileType_;
  /**
   * <pre>
   * 文件类型 Time|Alarm|Manual|All
   * </pre>
   *
   * <code>optional string fileType = 2;</code>
   */
  public boolean hasFileType() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * 文件类型 Time|Alarm|Manual|All
   * </pre>
   *
   * <code>optional string fileType = 2;</code>
   */
  public java.lang.String getFileType() {
    java.lang.Object ref = fileType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        fileType_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * 文件类型 Time|Alarm|Manual|All
   * </pre>
   *
   * <code>optional string fileType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFileTypeBytes() {
    java.lang.Object ref = fileType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIME_FIELD_NUMBER = 3;
  private long startTime_;
  /**
   * <code>optional int64 startTime = 3;</code>
   */
  public boolean hasStartTime() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 startTime = 3;</code>
   */
  public long getStartTime() {
    return startTime_;
  }

  public static final int ENDTIME_FIELD_NUMBER = 4;
  private long endTime_;
  /**
   * <code>optional int64 endTime = 4;</code>
   */
  public boolean hasEndTime() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 endTime = 4;</code>
   */
  public long getEndTime() {
    return endTime_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, subStream_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileType_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, startTime_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, endTime_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, subStream_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileType_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, startTime_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, endTime_);
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
    if (!(obj instanceof com.hngd.rpc.dg.RecordQueryParam)) {
      return super.equals(obj);
    }
    com.hngd.rpc.dg.RecordQueryParam other = (com.hngd.rpc.dg.RecordQueryParam) obj;

    boolean result = true;
    result = result && (hasSubStream() == other.hasSubStream());
    if (hasSubStream()) {
      result = result && (getSubStream()
          == other.getSubStream());
    }
    result = result && (hasFileType() == other.hasFileType());
    if (hasFileType()) {
      result = result && getFileType()
          .equals(other.getFileType());
    }
    result = result && (hasStartTime() == other.hasStartTime());
    if (hasStartTime()) {
      result = result && (getStartTime()
          == other.getStartTime());
    }
    result = result && (hasEndTime() == other.hasEndTime());
    if (hasEndTime()) {
      result = result && (getEndTime()
          == other.getEndTime());
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
    if (hasSubStream()) {
      hash = (37 * hash) + SUBSTREAM_FIELD_NUMBER;
      hash = (53 * hash) + getSubStream();
    }
    if (hasFileType()) {
      hash = (37 * hash) + FILETYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFileType().hashCode();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartTime());
    }
    if (hasEndTime()) {
      hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEndTime());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hngd.rpc.dg.RecordQueryParam parseFrom(
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
  public static Builder newBuilder(com.hngd.rpc.dg.RecordQueryParam prototype) {
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
   *录像查询请求参数
   * </pre>
   *
   * Protobuf type {@code hngdrpcdg.RecordQueryParam}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hngdrpcdg.RecordQueryParam)
      com.hngd.rpc.dg.RecordQueryParamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_RecordQueryParam_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_RecordQueryParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hngd.rpc.dg.RecordQueryParam.class, com.hngd.rpc.dg.RecordQueryParam.Builder.class);
    }

    // Construct using com.hngd.rpc.dg.RecordQueryParam.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      subStream_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      fileType_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      endTime_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hngd.rpc.dg.DgApiProto.internal_static_hngdrpcdg_RecordQueryParam_descriptor;
    }

    public com.hngd.rpc.dg.RecordQueryParam getDefaultInstanceForType() {
      return com.hngd.rpc.dg.RecordQueryParam.getDefaultInstance();
    }

    public com.hngd.rpc.dg.RecordQueryParam build() {
      com.hngd.rpc.dg.RecordQueryParam result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hngd.rpc.dg.RecordQueryParam buildPartial() {
      com.hngd.rpc.dg.RecordQueryParam result = new com.hngd.rpc.dg.RecordQueryParam(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.subStream_ = subStream_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.fileType_ = fileType_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.startTime_ = startTime_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.endTime_ = endTime_;
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
      if (other instanceof com.hngd.rpc.dg.RecordQueryParam) {
        return mergeFrom((com.hngd.rpc.dg.RecordQueryParam)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hngd.rpc.dg.RecordQueryParam other) {
      if (other == com.hngd.rpc.dg.RecordQueryParam.getDefaultInstance()) return this;
      if (other.hasSubStream()) {
        setSubStream(other.getSubStream());
      }
      if (other.hasFileType()) {
        bitField0_ |= 0x00000002;
        fileType_ = other.fileType_;
        onChanged();
      }
      if (other.hasStartTime()) {
        setStartTime(other.getStartTime());
      }
      if (other.hasEndTime()) {
        setEndTime(other.getEndTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hngd.rpc.dg.RecordQueryParam parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hngd.rpc.dg.RecordQueryParam) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int subStream_ ;
    /**
     * <code>optional int32 subStream = 1;</code>
     */
    public boolean hasSubStream() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 subStream = 1;</code>
     */
    public int getSubStream() {
      return subStream_;
    }
    /**
     * <code>optional int32 subStream = 1;</code>
     */
    public Builder setSubStream(int value) {
      bitField0_ |= 0x00000001;
      subStream_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 subStream = 1;</code>
     */
    public Builder clearSubStream() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subStream_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fileType_ = "";
    /**
     * <pre>
     * 文件类型 Time|Alarm|Manual|All
     * </pre>
     *
     * <code>optional string fileType = 2;</code>
     */
    public boolean hasFileType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * 文件类型 Time|Alarm|Manual|All
     * </pre>
     *
     * <code>optional string fileType = 2;</code>
     */
    public java.lang.String getFileType() {
      java.lang.Object ref = fileType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fileType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 文件类型 Time|Alarm|Manual|All
     * </pre>
     *
     * <code>optional string fileType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFileTypeBytes() {
      java.lang.Object ref = fileType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 文件类型 Time|Alarm|Manual|All
     * </pre>
     *
     * <code>optional string fileType = 2;</code>
     */
    public Builder setFileType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      fileType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文件类型 Time|Alarm|Manual|All
     * </pre>
     *
     * <code>optional string fileType = 2;</code>
     */
    public Builder clearFileType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fileType_ = getDefaultInstance().getFileType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文件类型 Time|Alarm|Manual|All
     * </pre>
     *
     * <code>optional string fileType = 2;</code>
     */
    public Builder setFileTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      fileType_ = value;
      onChanged();
      return this;
    }

    private long startTime_ ;
    /**
     * <code>optional int64 startTime = 3;</code>
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 startTime = 3;</code>
     */
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <code>optional int64 startTime = 3;</code>
     */
    public Builder setStartTime(long value) {
      bitField0_ |= 0x00000004;
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 startTime = 3;</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private long endTime_ ;
    /**
     * <code>optional int64 endTime = 4;</code>
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 endTime = 4;</code>
     */
    public long getEndTime() {
      return endTime_;
    }
    /**
     * <code>optional int64 endTime = 4;</code>
     */
    public Builder setEndTime(long value) {
      bitField0_ |= 0x00000008;
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 endTime = 4;</code>
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      endTime_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:hngdrpcdg.RecordQueryParam)
  }

  // @@protoc_insertion_point(class_scope:hngdrpcdg.RecordQueryParam)
  private static final com.hngd.rpc.dg.RecordQueryParam DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hngd.rpc.dg.RecordQueryParam();
  }

  public static com.hngd.rpc.dg.RecordQueryParam getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RecordQueryParam>
      PARSER = new com.google.protobuf.AbstractParser<RecordQueryParam>() {
    public RecordQueryParam parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RecordQueryParam(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordQueryParam> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordQueryParam> getParserForType() {
    return PARSER;
  }

  public com.hngd.rpc.dg.RecordQueryParam getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
