package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Any;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Any value_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.Option$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements OptionOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((Option) this.instance).clearName();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Option) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public String getName() {
            return ((Option) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public ByteString getNameBytes() {
            return ((Option) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public Any getValue() {
            return ((Option) this.instance).getValue();
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public boolean hasValue() {
            return ((Option) this.instance).hasValue();
        }

        public Builder mergeValue(Any value) {
            copyOnWrite();
            ((Option) this.instance).mergeValue(value);
            return this;
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((Option) this.instance).setName(value);
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            copyOnWrite();
            ((Option) this.instance).setNameBytes(value);
            return this;
        }

        public Builder setValue(Any value) {
            copyOnWrite();
            ((Option) this.instance).setValue(value);
            return this;
        }

        private Builder() {
            super(Option.DEFAULT_INSTANCE);
        }

        public Builder setValue(Any.Builder builderForValue) {
            copyOnWrite();
            ((Option) this.instance).setValue(builderForValue.build());
            return this;
        }
    }

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(Any value) {
        value.getClass();
        Any any = this.value_;
        if (any == null || any == Any.getDefaultInstance()) {
            this.value_ = value;
        } else {
            this.value_ = Any.newBuilder(this.value_).mergeFrom((Any.Builder) value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream input) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Option parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Parser<Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString value) {
        AbstractMessageLite.checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(Any value) {
        value.getClass();
        this.value_ = value;
        this.bitField0_ |= 1;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        Parser parser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new Option();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Option> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Option.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Option prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static Option parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Option) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Option parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Option parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Option parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Option parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Option parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Option parseFrom(InputStream input) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Option parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Option parseFrom(CodedInputStream input) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Option parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Option) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
