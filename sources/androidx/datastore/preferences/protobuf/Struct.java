package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<Struct> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.emptyMapField();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.Struct$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearFields() {
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().clear();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public boolean containsFields(String key) {
            key.getClass();
            return ((Struct) this.instance).getFieldsMap().containsKey(key);
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public int getFieldsCount() {
            return ((Struct) this.instance).getFieldsMap().size();
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrDefault(String key, Value defaultValue) {
            key.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(key) ? fieldsMap.get(key) : defaultValue;
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String key) {
            key.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            if (fieldsMap.containsKey(key)) {
                return fieldsMap.get(key);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFields(Map<String, Value> values) {
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().putAll(values);
            return this;
        }

        public Builder putFields(String key, Value value) {
            key.getClass();
            value.getClass();
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().put(key, value);
            return this;
        }

        public Builder removeFields(String key) {
            key.getClass();
            copyOnWrite();
            ((Struct) this.instance).getMutableFieldsMap().remove(key);
            return this;
        }

        private Builder() {
            super(Struct.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FieldsDefaultEntryHolder {
        static final MapEntryLite<String, Value> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private MapFieldLite<String, Value> internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream input) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Struct parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Parser<Struct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public boolean containsFields(String key) {
        key.getClass();
        return internalGetFields().containsKey(key);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        Parser parser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new Struct();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", FieldsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Struct> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Struct.class) {
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

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrDefault(String key, Value defaultValue) {
        key.getClass();
        MapFieldLite<String, Value> internalGetFields = internalGetFields();
        return internalGetFields.containsKey(key) ? internalGetFields.get(key) : defaultValue;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String key) {
        key.getClass();
        MapFieldLite<String, Value> internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(key)) {
            return internalGetFields.get(key);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(Struct prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static Struct parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Struct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Struct parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Struct parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Struct parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Struct parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Struct parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Struct parseFrom(InputStream input) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Struct parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Struct parseFrom(CodedInputStream input) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Struct parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Struct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
}
