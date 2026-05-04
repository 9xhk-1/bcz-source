package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
final class Protobuf {
    private static final Protobuf INSTANCE = new Protobuf();
    static boolean assumeLiteRuntime = false;
    private final ConcurrentMap<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap();
    private final SchemaFactory schemaFactory = new ManifestSchemaFactory();

    private Protobuf() {
    }

    public static Protobuf getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int i11 = 0;
        for (Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof MessageSchema) {
                i11 += ((MessageSchema) schema).getSchemaSize();
            }
        }
        return i11;
    }

    public <T> boolean isInitialized(T message) {
        return schemaFor((Protobuf) message).isInitialized(message);
    }

    public <T> void makeImmutable(T message) {
        schemaFor((Protobuf) message).makeImmutable(message);
    }

    public <T> void mergeFrom(T message, Reader reader) throws IOException {
        mergeFrom(message, reader, ExtensionRegistryLite.getEmptyRegistry());
    }

    public Schema<?> registerSchema(Class<?> messageType, Schema<?> schema) {
        Internal.checkNotNull(messageType, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(messageType, schema);
    }

    @CanIgnoreReturnValue
    public Schema<?> registerSchemaOverride(Class<?> messageType, Schema<?> schema) {
        Internal.checkNotNull(messageType, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(messageType, schema);
    }

    public <T> Schema<T> schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        Schema<T> schema = (Schema) this.schemaCache.get(cls);
        if (schema == null) {
            schema = this.schemaFactory.createSchema(cls);
            Schema<T> schema2 = (Schema<T>) registerSchema(cls, schema);
            if (schema2 != null) {
                return schema2;
            }
        }
        return schema;
    }

    public <T> void writeTo(T message, Writer writer) throws IOException {
        schemaFor((Protobuf) message).writeTo(message, writer);
    }

    public <T> void mergeFrom(T message, Reader reader, ExtensionRegistryLite extensionRegistry) throws IOException {
        schemaFor((Protobuf) message).mergeFrom(message, reader, extensionRegistry);
    }

    public <T> Schema<T> schemaFor(T message) {
        return schemaFor((Class) message.getClass());
    }
}
