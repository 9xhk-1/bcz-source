package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SourceContext extends GeneratedMessageLite<SourceContext, Builder> implements SourceContextOrBuilder {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SourceContext> PARSER;
    private String fileName_ = "";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.SourceContext$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.Builder<SourceContext, Builder> implements SourceContextOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((SourceContext) this.instance).clearFileName();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
        public String getFileName() {
            return ((SourceContext) this.instance).getFileName();
        }

        @Override // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
        public ByteString getFileNameBytes() {
            return ((SourceContext) this.instance).getFileNameBytes();
        }

        public Builder setFileName(String value) {
            copyOnWrite();
            ((SourceContext) this.instance).setFileName(value);
            return this;
        }

        public Builder setFileNameBytes(ByteString value) {
            copyOnWrite();
            ((SourceContext) this.instance).setFileNameBytes(value);
            return this;
        }

        private Builder() {
            super(SourceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        GeneratedMessageLite.registerDefaultInstance(SourceContext.class, sourceContext);
    }

    private SourceContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceContext parseDelimitedFrom(InputStream input) throws IOException {
        return (SourceContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static SourceContext parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Parser<SourceContext> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String value) {
        value.getClass();
        this.fileName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString value) {
        AbstractMessageLite.checkByteStringIsUtf8(value);
        this.fileName_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        Parser parser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new SourceContext();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SourceContext> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (SourceContext.class) {
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

    @Override // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    public static Builder newBuilder(SourceContext prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static SourceContext parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (SourceContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static SourceContext parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static SourceContext parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static SourceContext parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static SourceContext parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static SourceContext parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static SourceContext parseFrom(InputStream input) throws IOException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static SourceContext parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static SourceContext parseFrom(CodedInputStream input) throws IOException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static SourceContext parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (SourceContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
