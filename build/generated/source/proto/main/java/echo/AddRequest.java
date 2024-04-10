// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: add.proto

package echo;

/**
 * <pre>
 * The request message
 * </pre>
 *
 * Protobuf type {@code addmessage.AddRequest}
 */
public final class AddRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:addmessage.AddRequest)
    AddRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddRequest.newBuilder() to construct.
  private AddRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            bitField0_ |= 0x00000001;
            num1_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            num2_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return echo.CalcProto.internal_static_addmessage_AddRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return echo.CalcProto.internal_static_addmessage_AddRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            echo.AddRequest.class, echo.AddRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NUM1_FIELD_NUMBER = 1;
  private int num1_;
  /**
   * <code>optional int32 num1 = 1;</code>
   * @return Whether the num1 field is set.
   */
  @java.lang.Override
  public boolean hasNum1() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 num1 = 1;</code>
   * @return The num1.
   */
  @java.lang.Override
  public int getNum1() {
    return num1_;
  }

  public static final int NUM2_FIELD_NUMBER = 2;
  private int num2_;
  /**
   * <code>optional int32 num2 = 2;</code>
   * @return Whether the num2 field is set.
   */
  @java.lang.Override
  public boolean hasNum2() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 num2 = 2;</code>
   * @return The num2.
   */
  @java.lang.Override
  public int getNum2() {
    return num2_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, num1_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, num2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, num1_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, num2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof echo.AddRequest)) {
      return super.equals(obj);
    }
    echo.AddRequest other = (echo.AddRequest) obj;

    if (hasNum1() != other.hasNum1()) return false;
    if (hasNum1()) {
      if (getNum1()
          != other.getNum1()) return false;
    }
    if (hasNum2() != other.hasNum2()) return false;
    if (hasNum2()) {
      if (getNum2()
          != other.getNum2()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasNum1()) {
      hash = (37 * hash) + NUM1_FIELD_NUMBER;
      hash = (53 * hash) + getNum1();
    }
    if (hasNum2()) {
      hash = (37 * hash) + NUM2_FIELD_NUMBER;
      hash = (53 * hash) + getNum2();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static echo.AddRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static echo.AddRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static echo.AddRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static echo.AddRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static echo.AddRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static echo.AddRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static echo.AddRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static echo.AddRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static echo.AddRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static echo.AddRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static echo.AddRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static echo.AddRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(echo.AddRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * The request message
   * </pre>
   *
   * Protobuf type {@code addmessage.AddRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:addmessage.AddRequest)
      echo.AddRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return echo.CalcProto.internal_static_addmessage_AddRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return echo.CalcProto.internal_static_addmessage_AddRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              echo.AddRequest.class, echo.AddRequest.Builder.class);
    }

    // Construct using echo.AddRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      num1_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      num2_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return echo.CalcProto.internal_static_addmessage_AddRequest_descriptor;
    }

    @java.lang.Override
    public echo.AddRequest getDefaultInstanceForType() {
      return echo.AddRequest.getDefaultInstance();
    }

    @java.lang.Override
    public echo.AddRequest build() {
      echo.AddRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public echo.AddRequest buildPartial() {
      echo.AddRequest result = new echo.AddRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.num1_ = num1_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.num2_ = num2_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof echo.AddRequest) {
        return mergeFrom((echo.AddRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(echo.AddRequest other) {
      if (other == echo.AddRequest.getDefaultInstance()) return this;
      if (other.hasNum1()) {
        setNum1(other.getNum1());
      }
      if (other.hasNum2()) {
        setNum2(other.getNum2());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      echo.AddRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (echo.AddRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int num1_ ;
    /**
     * <code>optional int32 num1 = 1;</code>
     * @return Whether the num1 field is set.
     */
    @java.lang.Override
    public boolean hasNum1() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 num1 = 1;</code>
     * @return The num1.
     */
    @java.lang.Override
    public int getNum1() {
      return num1_;
    }
    /**
     * <code>optional int32 num1 = 1;</code>
     * @param value The num1 to set.
     * @return This builder for chaining.
     */
    public Builder setNum1(int value) {
      bitField0_ |= 0x00000001;
      num1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 num1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum1() {
      bitField0_ = (bitField0_ & ~0x00000001);
      num1_ = 0;
      onChanged();
      return this;
    }

    private int num2_ ;
    /**
     * <code>optional int32 num2 = 2;</code>
     * @return Whether the num2 field is set.
     */
    @java.lang.Override
    public boolean hasNum2() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 num2 = 2;</code>
     * @return The num2.
     */
    @java.lang.Override
    public int getNum2() {
      return num2_;
    }
    /**
     * <code>optional int32 num2 = 2;</code>
     * @param value The num2 to set.
     * @return This builder for chaining.
     */
    public Builder setNum2(int value) {
      bitField0_ |= 0x00000002;
      num2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 num2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum2() {
      bitField0_ = (bitField0_ & ~0x00000002);
      num2_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:addmessage.AddRequest)
  }

  // @@protoc_insertion_point(class_scope:addmessage.AddRequest)
  private static final echo.AddRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new echo.AddRequest();
  }

  public static echo.AddRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AddRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddRequest>() {
    @java.lang.Override
    public AddRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public echo.AddRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

