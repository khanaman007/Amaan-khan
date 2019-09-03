// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deposit.proto

package com.betPawa.bitWallet;

public final class IDeposit {
  private IDeposit() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DepositRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DepositRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 userId = 1;</code>
     */
    long getUserId();

    /**
     * <code>double amount = 2;</code>
     */
    double getAmount();

    /**
     * <code>string currency = 3;</code>
     */
    java.lang.String getCurrency();
    /**
     * <code>string currency = 3;</code>
     */
    com.google.protobuf.ByteString
        getCurrencyBytes();
  }
  /**
   * Protobuf type {@code DepositRequest}
   */
  public  static final class DepositRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DepositRequest)
      DepositRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DepositRequest.newBuilder() to construct.
    private DepositRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DepositRequest() {
      userId_ = 0L;
      amount_ = 0D;
      currency_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DepositRequest(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              userId_ = input.readInt64();
              break;
            }
            case 17: {

              amount_ = input.readDouble();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              currency_ = s;
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
      return com.betPawa.bitWallet.IDeposit.internal_static_DepositRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.betPawa.bitWallet.IDeposit.internal_static_DepositRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.betPawa.bitWallet.IDeposit.DepositRequest.class, com.betPawa.bitWallet.IDeposit.DepositRequest.Builder.class);
    }

    public static final int USERID_FIELD_NUMBER = 1;
    private long userId_;
    /**
     * <code>int64 userId = 1;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int AMOUNT_FIELD_NUMBER = 2;
    private double amount_;
    /**
     * <code>double amount = 2;</code>
     */
    public double getAmount() {
      return amount_;
    }

    public static final int CURRENCY_FIELD_NUMBER = 3;
    private volatile java.lang.Object currency_;
    /**
     * <code>string currency = 3;</code>
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      }
    }
    /**
     * <code>string currency = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (userId_ != 0L) {
        output.writeInt64(1, userId_);
      }
      if (amount_ != 0D) {
        output.writeDouble(2, amount_);
      }
      if (!getCurrencyBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, currency_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, userId_);
      }
      if (amount_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, amount_);
      }
      if (!getCurrencyBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, currency_);
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
      if (!(obj instanceof com.betPawa.bitWallet.IDeposit.DepositRequest)) {
        return super.equals(obj);
      }
      com.betPawa.bitWallet.IDeposit.DepositRequest other = (com.betPawa.bitWallet.IDeposit.DepositRequest) obj;

      boolean result = true;
      result = result && (getUserId()
          == other.getUserId());
      result = result && (
          java.lang.Double.doubleToLongBits(getAmount())
          == java.lang.Double.doubleToLongBits(
              other.getAmount()));
      result = result && getCurrency()
          .equals(other.getCurrency());
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
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAmount()));
      hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
      hash = (53 * hash) + getCurrency().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.betPawa.bitWallet.IDeposit.DepositRequest parseFrom(
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
    public static Builder newBuilder(com.betPawa.bitWallet.IDeposit.DepositRequest prototype) {
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
     * Protobuf type {@code DepositRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DepositRequest)
        com.betPawa.bitWallet.IDeposit.DepositRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.betPawa.bitWallet.IDeposit.internal_static_DepositRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.betPawa.bitWallet.IDeposit.internal_static_DepositRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.betPawa.bitWallet.IDeposit.DepositRequest.class, com.betPawa.bitWallet.IDeposit.DepositRequest.Builder.class);
      }

      // Construct using com.betPawa.bitWallet.IDeposit.DepositRequest.newBuilder()
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
        userId_ = 0L;

        amount_ = 0D;

        currency_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.betPawa.bitWallet.IDeposit.internal_static_DepositRequest_descriptor;
      }

      public com.betPawa.bitWallet.IDeposit.DepositRequest getDefaultInstanceForType() {
        return com.betPawa.bitWallet.IDeposit.DepositRequest.getDefaultInstance();
      }

      public com.betPawa.bitWallet.IDeposit.DepositRequest build() {
        com.betPawa.bitWallet.IDeposit.DepositRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.betPawa.bitWallet.IDeposit.DepositRequest buildPartial() {
        com.betPawa.bitWallet.IDeposit.DepositRequest result = new com.betPawa.bitWallet.IDeposit.DepositRequest(this);
        result.userId_ = userId_;
        result.amount_ = amount_;
        result.currency_ = currency_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.betPawa.bitWallet.IDeposit.DepositRequest) {
          return mergeFrom((com.betPawa.bitWallet.IDeposit.DepositRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.betPawa.bitWallet.IDeposit.DepositRequest other) {
        if (other == com.betPawa.bitWallet.IDeposit.DepositRequest.getDefaultInstance()) return this;
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (other.getAmount() != 0D) {
          setAmount(other.getAmount());
        }
        if (!other.getCurrency().isEmpty()) {
          currency_ = other.currency_;
          onChanged();
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
        com.betPawa.bitWallet.IDeposit.DepositRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.betPawa.bitWallet.IDeposit.DepositRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long userId_ ;
      /**
       * <code>int64 userId = 1;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>int64 userId = 1;</code>
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 userId = 1;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private double amount_ ;
      /**
       * <code>double amount = 2;</code>
       */
      public double getAmount() {
        return amount_;
      }
      /**
       * <code>double amount = 2;</code>
       */
      public Builder setAmount(double value) {
        
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double amount = 2;</code>
       */
      public Builder clearAmount() {
        
        amount_ = 0D;
        onChanged();
        return this;
      }

      private java.lang.Object currency_ = "";
      /**
       * <code>string currency = 3;</code>
       */
      public java.lang.String getCurrency() {
        java.lang.Object ref = currency_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          currency_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string currency = 3;</code>
       */
      public com.google.protobuf.ByteString
          getCurrencyBytes() {
        java.lang.Object ref = currency_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          currency_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string currency = 3;</code>
       */
      public Builder setCurrency(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        currency_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string currency = 3;</code>
       */
      public Builder clearCurrency() {
        
        currency_ = getDefaultInstance().getCurrency();
        onChanged();
        return this;
      }
      /**
       * <code>string currency = 3;</code>
       */
      public Builder setCurrencyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        currency_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DepositRequest)
    }

    // @@protoc_insertion_point(class_scope:DepositRequest)
    private static final com.betPawa.bitWallet.IDeposit.DepositRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.betPawa.bitWallet.IDeposit.DepositRequest();
    }

    public static com.betPawa.bitWallet.IDeposit.DepositRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DepositRequest>
        PARSER = new com.google.protobuf.AbstractParser<DepositRequest>() {
      public DepositRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DepositRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DepositRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DepositRequest> getParserForType() {
      return PARSER;
    }

    public com.betPawa.bitWallet.IDeposit.DepositRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EmpltyResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EmpltyResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code EmpltyResponse}
   */
  public  static final class EmpltyResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EmpltyResponse)
      EmpltyResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EmpltyResponse.newBuilder() to construct.
    private EmpltyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EmpltyResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EmpltyResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return com.betPawa.bitWallet.IDeposit.internal_static_EmpltyResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.betPawa.bitWallet.IDeposit.internal_static_EmpltyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.betPawa.bitWallet.IDeposit.EmpltyResponse.class, com.betPawa.bitWallet.IDeposit.EmpltyResponse.Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.betPawa.bitWallet.IDeposit.EmpltyResponse)) {
        return super.equals(obj);
      }
      com.betPawa.bitWallet.IDeposit.EmpltyResponse other = (com.betPawa.bitWallet.IDeposit.EmpltyResponse) obj;

      boolean result = true;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse parseFrom(
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
    public static Builder newBuilder(com.betPawa.bitWallet.IDeposit.EmpltyResponse prototype) {
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
     * Protobuf type {@code EmpltyResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EmpltyResponse)
        com.betPawa.bitWallet.IDeposit.EmpltyResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.betPawa.bitWallet.IDeposit.internal_static_EmpltyResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.betPawa.bitWallet.IDeposit.internal_static_EmpltyResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.betPawa.bitWallet.IDeposit.EmpltyResponse.class, com.betPawa.bitWallet.IDeposit.EmpltyResponse.Builder.class);
      }

      // Construct using com.betPawa.bitWallet.IDeposit.EmpltyResponse.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.betPawa.bitWallet.IDeposit.internal_static_EmpltyResponse_descriptor;
      }

      public com.betPawa.bitWallet.IDeposit.EmpltyResponse getDefaultInstanceForType() {
        return com.betPawa.bitWallet.IDeposit.EmpltyResponse.getDefaultInstance();
      }

      public com.betPawa.bitWallet.IDeposit.EmpltyResponse build() {
        com.betPawa.bitWallet.IDeposit.EmpltyResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.betPawa.bitWallet.IDeposit.EmpltyResponse buildPartial() {
        com.betPawa.bitWallet.IDeposit.EmpltyResponse result = new com.betPawa.bitWallet.IDeposit.EmpltyResponse(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.betPawa.bitWallet.IDeposit.EmpltyResponse) {
          return mergeFrom((com.betPawa.bitWallet.IDeposit.EmpltyResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.betPawa.bitWallet.IDeposit.EmpltyResponse other) {
        if (other == com.betPawa.bitWallet.IDeposit.EmpltyResponse.getDefaultInstance()) return this;
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
        com.betPawa.bitWallet.IDeposit.EmpltyResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.betPawa.bitWallet.IDeposit.EmpltyResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EmpltyResponse)
    }

    // @@protoc_insertion_point(class_scope:EmpltyResponse)
    private static final com.betPawa.bitWallet.IDeposit.EmpltyResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.betPawa.bitWallet.IDeposit.EmpltyResponse();
    }

    public static com.betPawa.bitWallet.IDeposit.EmpltyResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EmpltyResponse>
        PARSER = new com.google.protobuf.AbstractParser<EmpltyResponse>() {
      public EmpltyResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EmpltyResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EmpltyResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EmpltyResponse> getParserForType() {
      return PARSER;
    }

    public com.betPawa.bitWallet.IDeposit.EmpltyResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DepositRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DepositRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmpltyResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmpltyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rdeposit.proto\032\031google/protobuf/any.pro" +
      "to\"B\n\016DepositRequest\022\016\n\006userId\030\001 \001(\003\022\016\n\006" +
      "amount\030\002 \001(\001\022\020\n\010currency\030\003 \001(\t\"\020\n\016Emplty" +
      "Response2G\n\030BitWallletDepositService\022+\n\007" +
      "Deposit\022\017.DepositRequest\032\017.EmpltyRespons" +
      "eB!\n\025com.betPawa.bitWalletB\010IDepositb\006pr" +
      "oto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_DepositRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DepositRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DepositRequest_descriptor,
        new java.lang.String[] { "UserId", "Amount", "Currency", });
    internal_static_EmpltyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EmpltyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmpltyResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}