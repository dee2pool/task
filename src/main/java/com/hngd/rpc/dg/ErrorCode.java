// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dgAPi.proto

package com.hngd.rpc.dg;

/**
 * <pre>
 *错误码
 * </pre>
 *
 * Protobuf enum {@code hngdrpcdg.ErrorCode}
 */
public enum ErrorCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OK = 0;</code>
   */
  OK(0),
  /**
   * <code>FAILED = 1;</code>
   */
  FAILED(1),
  /**
   * <pre>
   *TODO错误码定义
   * </pre>
   *
   * <code>OTHERS = 2;</code>
   */
  OTHERS(2),
  ;

  /**
   * <code>OK = 0;</code>
   */
  public static final int OK_VALUE = 0;
  /**
   * <code>FAILED = 1;</code>
   */
  public static final int FAILED_VALUE = 1;
  /**
   * <pre>
   *TODO错误码定义
   * </pre>
   *
   * <code>OTHERS = 2;</code>
   */
  public static final int OTHERS_VALUE = 2;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ErrorCode valueOf(int value) {
    return forNumber(value);
  }

  public static ErrorCode forNumber(int value) {
    switch (value) {
      case 0: return OK;
      case 1: return FAILED;
      case 2: return OTHERS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrorCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
          public ErrorCode findValueByNumber(int number) {
            return ErrorCode.forNumber(number);
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
    return com.hngd.rpc.dg.DgApiProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ErrorCode[] VALUES = values();

  public static ErrorCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ErrorCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:hngdrpcdg.ErrorCode)
}
