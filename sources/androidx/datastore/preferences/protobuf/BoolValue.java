package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BoolValue extends GeneratedMessageLite<BoolValue, Builder> implements BoolValueOrBuilder {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile Parser<BoolValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.BoolValue$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.Builder<BoolValue, Builder> implements BoolValueOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            ((BoolValue) this.instance).clearValue();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.BoolValueOrBuilder
        public boolean getValue() {
            return ((BoolValue) this.instance).getValue();
        }

        public Builder setValue(boolean value) {
            copyOnWrite();
            ((BoolValue) this.instance).setValue(value);
            return this;
        }

        private Builder() {
            super(BoolValue.DEFAULT_INSTANCE);
        }
    }

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        GeneratedMessageLite.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BoolValue of(boolean value) {
        return newBuilder().setValue(value).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream input) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Parser<BoolValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean value) {
        this.value_ = value;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        Parser parser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new BoolValue();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BoolValue> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (BoolValue.class) {
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

    @Override // androidx.datastore.preferences.protobuf.BoolValueOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    public static Builder newBuilder(BoolValue prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static BoolValue parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BoolValue parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BoolValue parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BoolValue parseFrom(InputStream input) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BoolValue parseFrom(CodedInputStream input) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BoolValue parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BoolValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
