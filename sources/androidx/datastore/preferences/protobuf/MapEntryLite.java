package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final Metadata<K, V> metadata;
    private final V value;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final WireFormat.FieldType keyType;
        public final WireFormat.FieldType valueType;

        public Metadata(WireFormat.FieldType keyType, K defaultKey, WireFormat.FieldType valueType, V defaultValue) {
            this.keyType = keyType;
            this.defaultKey = defaultKey;
            this.valueType = valueType;
            this.defaultValue = defaultValue;
        }
    }

    private MapEntryLite(WireFormat.FieldType keyType, K defaultKey, WireFormat.FieldType valueType, V defaultValue) {
        this.metadata = new Metadata<>(keyType, defaultKey, valueType, defaultValue);
        this.key = defaultKey;
        this.value = defaultValue;
    }

    public static <K, V> int computeSerializedSize(Metadata<K, V> metadata, K key, V value) {
        return FieldSet.computeElementSize(metadata.keyType, 1, key) + FieldSet.computeElementSize(metadata.valueType, 2, value);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType keyType, K defaultKey, WireFormat.FieldType valueType, V defaultValue) {
        return new MapEntryLite<>(keyType, defaultKey, valueType, defaultValue);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t11) throws IOException {
        int i11 = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i11 == 1) {
            MessageLite.Builder builder = ((MessageLite) t11).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i11 == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i11 != 3) {
            return (T) FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void writeTo(CodedOutputStream output, Metadata<K, V> metadata, K key, V value) throws IOException {
        FieldSet.writeElement(output, metadata.keyType, 1, key);
        FieldSet.writeElement(output, metadata.valueType, 2, value);
    }

    public int computeMessageSize(int fieldNumber, K key, V value) {
        return CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, key, value));
    }

    public K getKey() {
        return this.key;
    }

    public Metadata<K, V> getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString bytes, ExtensionRegistryLite extensionRegistry) throws IOException {
        return parseEntry(bytes.newCodedInput(), this.metadata, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> map, CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        int pushLimit = input.pushLimit(input.readRawVarint32());
        Metadata<K, V> metadata = this.metadata;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (true) {
            int readTag = input.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                obj = parseField(input, extensionRegistry, this.metadata.keyType, obj);
            } else if (readTag == WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                obj2 = parseField(input, extensionRegistry, this.metadata.valueType, obj2);
            } else if (!input.skipField(readTag)) {
                break;
            }
        }
        input.checkLastTagWas(0);
        input.popLimit(pushLimit);
        map.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream output, int fieldNumber, K key, V value) throws IOException {
        output.writeTag(fieldNumber, 2);
        output.writeUInt32NoTag(computeSerializedSize(this.metadata, key, value));
        writeTo(output, this.metadata, key, value);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream input, Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistry) throws IOException {
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (true) {
            int readTag = input.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                obj = parseField(input, extensionRegistry, metadata.keyType, obj);
            } else if (readTag == WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                obj2 = parseField(input, extensionRegistry, metadata.valueType, obj2);
            } else if (!input.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private MapEntryLite(Metadata<K, V> metadata, K key, V value) {
        this.metadata = metadata;
        this.key = key;
        this.value = value;
    }
}
