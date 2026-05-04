package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Mixin extends GeneratedMessageLite<Mixin, Builder> implements MixinOrBuilder {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Mixin> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.Mixin$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.Builder<Mixin, Builder> implements MixinOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((Mixin) this.instance).clearName();
            return this;
        }

        public Builder clearRoot() {
            copyOnWrite();
            ((Mixin) this.instance).clearRoot();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getName() {
            return ((Mixin) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public ByteString getNameBytes() {
            return ((Mixin) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getRoot() {
            return ((Mixin) this.instance).getRoot();
        }

        @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public ByteString getRootBytes() {
            return ((Mixin) this.instance).getRootBytes();
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((Mixin) this.instance).setName(value);
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            copyOnWrite();
            ((Mixin) this.instance).setNameBytes(value);
            return this;
        }

        public Builder setRoot(String value) {
            copyOnWrite();
            ((Mixin) this.instance).setRoot(value);
            return this;
        }

        public Builder setRootBytes(ByteString value) {
            copyOnWrite();
            ((Mixin) this.instance).setRootBytes(value);
            return this;
        }

        private Builder() {
            super(Mixin.DEFAULT_INSTANCE);
        }
    }

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        GeneratedMessageLite.registerDefaultInstance(Mixin.class, mixin);
    }

    private Mixin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin parseDelimitedFrom(InputStream input) throws IOException {
        return (Mixin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Mixin parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Parser<Mixin> parser() {
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
    public void setRoot(String value) {
        value.getClass();
        this.root_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootBytes(ByteString value) {
        AbstractMessageLite.checkByteStringIsUtf8(value);
        this.root_ = value.toStringUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        Parser parser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new Mixin();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Mixin> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Mixin.class) {
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

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getRoot() {
        return this.root_;
    }

    @Override // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public ByteString getRootBytes() {
        return ByteString.copyFromUtf8(this.root_);
    }

    public static Builder newBuilder(Mixin prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static Mixin parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mixin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Mixin parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Mixin parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Mixin parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Mixin parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Mixin parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Mixin parseFrom(InputStream input) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Mixin parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Mixin parseFrom(CodedInputStream input) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Mixin parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
