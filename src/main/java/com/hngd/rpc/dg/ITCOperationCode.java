// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dgAPi.proto

package com.hngd.rpc.dg;

/**
 * <pre>
 *ITC语音对讲操作码
 * </pre>
 *
 * Protobuf enum {@code hngdrpcdg.ITCOperationCode}
 */
public enum ITCOperationCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *开始寻呼
   * </pre>
   *
   * <code>IOC_SPEECHSTART = 0;</code>
   */
  IOC_SPEECHSTART(0),
  /**
   * <pre>
   *结束寻呼
   * </pre>
   *
   * <code>IOC_SPEECHSTOP = 1;</code>
   */
  IOC_SPEECHSTOP(1),
  /**
   * <pre>
   *开始对讲
   * </pre>
   *
   * <code>IOC_TALKSTART = 2;</code>
   */
  IOC_TALKSTART(2),
  /**
   * <pre>
   *结束对讲
   * </pre>
   *
   * <code>IOC_TALKSTOP = 3;</code>
   */
  IOC_TALKSTOP(3),
  /**
   * <pre>
   *接听对讲
   * </pre>
   *
   * <code>IOC_TALKACCEPT = 4;</code>
   */
  IOC_TALKACCEPT(4),
  ;

  /**
   * <pre>
   *开始寻呼
   * </pre>
   *
   * <code>IOC_SPEECHSTART = 0;</code>
   */
  public static final int IOC_SPEECHSTART_VALUE = 0;
  /**
   * <pre>
   *结束寻呼
   * </pre>
   *
   * <code>IOC_SPEECHSTOP = 1;</code>
   */
  public static final int IOC_SPEECHSTOP_VALUE = 1;
  /**
   * <pre>
   *开始对讲
   * </pre>
   *
   * <code>IOC_TALKSTART = 2;</code>
   */
  public static final int IOC_TALKSTART_VALUE = 2;
  /**
   * <pre>
   *结束对讲
   * </pre>
   *
   * <code>IOC_TALKSTOP = 3;</code>
   */
  public static final int IOC_TALKSTOP_VALUE = 3;
  /**
   * <pre>
   *接听对讲
   * </pre>
   *
   * <code>IOC_TALKACCEPT = 4;</code>
   */
  public static final int IOC_TALKACCEPT_VALUE = 4;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ITCOperationCode valueOf(int value) {
    return forNumber(value);
  }

  public static ITCOperationCode forNumber(int value) {
    switch (value) {
      case 0: return IOC_SPEECHSTART;
      case 1: return IOC_SPEECHSTOP;
      case 2: return IOC_TALKSTART;
      case 3: return IOC_TALKSTOP;
      case 4: return IOC_TALKACCEPT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ITCOperationCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ITCOperationCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ITCOperationCode>() {
          public ITCOperationCode findValueByNumber(int number) {
            return ITCOperationCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.hngd.rpc.dg.DgApiProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final ITCOperationCode[] VALUES = values();

  public static ITCOperationCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ITCOperationCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:hngdrpcdg.ITCOperationCode)
}

