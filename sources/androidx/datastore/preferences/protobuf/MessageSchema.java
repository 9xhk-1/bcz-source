package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] buffer, Object[] objects, int minFieldNumber, int maxFieldNumber, MessageLite defaultInstance, ProtoSyntax syntax, boolean useCachedSizeField, int[] intArray, int checkInitialized, int mapFieldPositions, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = buffer;
        this.objects = objects;
        this.minFieldNumber = minFieldNumber;
        this.maxFieldNumber = maxFieldNumber;
        this.lite = defaultInstance instanceof GeneratedMessageLite;
        this.syntax = syntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(defaultInstance);
        this.useCachedSizeField = useCachedSizeField;
        this.intArray = intArray;
        this.checkInitializedCount = checkInitialized;
        this.repeatedFieldOffsetStart = mapFieldPositions;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T message, T other, int pos) {
        return isFieldPresent(message, pos) == isFieldPresent(other, pos);
    }

    private static <T> boolean booleanAt(T message, long offset) {
        return UnsafeUtil.getBoolean(message, offset);
    }

    private static void checkMutable(Object message) {
        if (isMutable(message)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] data, int position, int limit, MapEntryLite.Metadata<K, V> metadata, Map<K, V> target, ArrayDecoders.Registers registers) throws IOException {
        int decodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
        int i11 = registers.int1;
        if (i11 < 0 || i11 > limit - decodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i12 = decodeVarint32 + i11;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (decodeVarint32 < i12) {
            int i13 = decodeVarint32 + 1;
            int i14 = data[decodeVarint32];
            if (i14 < 0) {
                i13 = ArrayDecoders.decodeVarint32(i14, data, i13, registers);
                i14 = registers.int1;
            }
            int i15 = i13;
            int i16 = i14 >>> 3;
            int i17 = i14 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == metadata.valueType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(data, i15, limit, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                }
                decodeVarint32 = ArrayDecoders.skipField(i14, data, i15, limit, registers);
            } else if (i17 == metadata.keyType.getWireType()) {
                decodeVarint32 = decodeMapEntryValue(data, i15, limit, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                decodeVarint32 = ArrayDecoders.skipField(i14, data, i15, limit, registers);
            }
        }
        if (decodeVarint32 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        target.put(obj, obj2);
        return i12;
    }

    private int decodeMapEntryValue(byte[] data, int position, int limit, WireFormat.FieldType fieldType, Class<?> messageType, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(data, position, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(data, position));
                return position + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(data, position));
                return position + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(data, position));
                return position + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(data, position));
                return position + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) messageType), data, position, limit, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(data, position, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(data, position, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(data, position, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T message, long offset) {
        return UnsafeUtil.getDouble(message, offset);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i11, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int numberAt = numberAt(i11);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i11)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i11)) == null) ? ub2 : (UB) filterUnknownEnumMap(i11, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i11, int i12, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i12, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T message, long offset) {
        return UnsafeUtil.getFloat(message, offset);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int pos) {
        return (Internal.EnumVerifier) this.objects[((pos / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int pos) {
        return this.objects[(pos / 3) * 2];
    }

    private Schema getMessageFieldSchema(int pos) {
        int i11 = (pos / 3) * 2;
        Schema schema = (Schema) this.objects[i11];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = schemaFor;
        return schemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object message) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) message;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = newInstance;
        return newInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSize(schema.getFromMessage(message));
    }

    private static <T> int intAt(T message, long offset) {
        return UnsafeUtil.getInt(message, offset);
    }

    private static boolean isEnforceUtf8(int value) {
        return (value & 536870912) != 0;
    }

    private boolean isFieldPresent(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        return presenceFieldOffset == 1048575 ? isFieldPresent(message, pos) : (presenceField & presenceMask) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int value) {
        return (value & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object message, int typeAndOffset, int pos) {
        List list = (List) UnsafeUtil.getObject(message, offset(typeAndOffset));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!messageFieldSchema.isInitialized(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.Schema] */
    private boolean isMapInitialized(T t11, int i11, int i12) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t11, offset(i11)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : forMapData.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!r52.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) message).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T message, T other, int pos) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos) & 1048575;
        return UnsafeUtil.getInt(message, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(other, presenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T message, int fieldNumber, int pos) {
        return UnsafeUtil.getInt(message, (long) (presenceMaskAndOffsetAt(pos) & 1048575)) == fieldNumber;
    }

    private static boolean isRequired(int value) {
        return (value & 268435456) != 0;
    }

    private static <T> long longAt(T message, long offset) {
        return UnsafeUtil.getLong(message, offset);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r18, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r19, T r20, androidx.datastore.preferences.protobuf.Reader r21, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object message, int pos, Object mapDefaultEntry, ExtensionRegistryLite extensionRegistry, Reader reader) throws IOException {
        long offset = offset(typeAndOffsetAt(pos));
        Object object = UnsafeUtil.getObject(message, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(mapDefaultEntry);
            UnsafeUtil.putObject(message, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(message, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(mapDefaultEntry), extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T targetParent, T sourceParent, int pos) {
        if (isFieldPresent(sourceParent, pos)) {
            long offset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isFieldPresent(targetParent, pos)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(targetParent, offset, newInstance);
                } else {
                    unsafe.putObject(targetParent, offset, object);
                }
                setFieldPresent(targetParent, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(targetParent, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T targetParent, T sourceParent, int pos) {
        int numberAt = numberAt(pos);
        if (isOneofPresent(sourceParent, numberAt, pos)) {
            long offset = offset(typeAndOffsetAt(pos));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(sourceParent, offset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(pos) + " is present but null: " + sourceParent);
            }
            Schema messageFieldSchema = getMessageFieldSchema(pos);
            if (!isOneofPresent(targetParent, numberAt, pos)) {
                if (isMutable(object)) {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(targetParent, offset, newInstance);
                } else {
                    unsafe.putObject(targetParent, offset, object);
                }
                setOneofPresent(targetParent, numberAt, pos);
                return;
            }
            Object object2 = unsafe.getObject(targetParent, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(targetParent, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T message, T other, int pos) {
        int typeAndOffsetAt = typeAndOffsetAt(pos);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(pos);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putDouble(message, offset, UnsafeUtil.getDouble(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putFloat(message, offset, UnsafeUtil.getFloat(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, offset, UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, offset, UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, offset, UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, offset, UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, offset, UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putBoolean(message, offset, UnsafeUtil.getBoolean(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, offset, UnsafeUtil.getObject(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 9:
                mergeMessage(message, other, pos);
                break;
            case 10:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putObject(message, offset, UnsafeUtil.getObject(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, offset, UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, offset, UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, offset, UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, offset, UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putInt(message, offset, UnsafeUtil.getInt(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(other, pos)) {
                    UnsafeUtil.putLong(message, offset, UnsafeUtil.getLong(other, offset));
                    setFieldPresent(message, pos);
                    break;
                }
                break;
            case 17:
                mergeMessage(message, other, pos);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(message, other, offset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, message, other, offset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(other, numberAt, pos)) {
                    UnsafeUtil.putObject(message, offset, UnsafeUtil.getObject(other, offset));
                    setOneofPresent(message, numberAt, pos);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(message, other, pos);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(other, numberAt, pos)) {
                    UnsafeUtil.putObject(message, offset, UnsafeUtil.getObject(other, offset));
                    setOneofPresent(message, numberAt, pos);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(message, other, pos);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T message, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        long offset = offset(typeAndOffsetAt(pos));
        if (!isFieldPresent(message, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T message, int fieldNumber, int pos) {
        Schema messageFieldSchema = getMessageFieldSchema(pos);
        if (!isOneofPresent(message, fieldNumber, pos)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(message, offset(typeAndOffsetAt(pos)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> messageClass, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i11;
        FieldInfo[] fields = messageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i12 = 0;
        int i13 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i12++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i13++;
            }
        }
        int[] iArr2 = i12 > 0 ? new int[i12] : null;
        int[] iArr3 = i13 > 0 ? new int[i13] : null;
        int[] checkInitialized = messageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i14 < fields.length) {
            FieldInfo fieldInfo2 = fields[i14];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i15, objArr);
            if (i16 < checkInitialized.length && checkInitialized[i16] == fieldNumber3) {
                checkInitialized[i16] = i15;
                i16++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i17] = i15;
                i17++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i11 = i15;
                iArr3[i18] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i18++;
                i14++;
                i15 = i11 + 3;
            }
            i11 = i15;
            i14++;
            i15 = i11 + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, messageInfo.getDefaultInstance(), messageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo r33, androidx.datastore.preferences.protobuf.NewInstanceSchema r34, androidx.datastore.preferences.protobuf.ListFieldSchema r35, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r36, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r37, androidx.datastore.preferences.protobuf.MapFieldSchema r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    private int numberAt(int pos) {
        return this.buffer[pos];
    }

    private static long offset(int value) {
        return value & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T message, long offset) {
        return ((Boolean) UnsafeUtil.getObject(message, offset)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T message, long offset) {
        return ((Double) UnsafeUtil.getObject(message, offset)).doubleValue();
    }

    private static <T> float oneofFloatAt(T message, long offset) {
        return ((Float) UnsafeUtil.getObject(message, offset)).floatValue();
    }

    private static <T> int oneofIntAt(T message, long offset) {
        return ((Integer) UnsafeUtil.getObject(message, offset)).intValue();
    }

    private static <T> long oneofLongAt(T message, long offset) {
        return ((Long) UnsafeUtil.getObject(message, offset)).longValue();
    }

    private <K, V> int parseMapField(T message, byte[] data, int position, int limit, int bufferPosition, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(bufferPosition);
        Object object = unsafe.getObject(message, fieldOffset);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(message, fieldOffset, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(data, position, limit, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int typeAndOffset, int fieldType, long fieldOffset, int bufferPosition, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[bufferPosition + 2] & 1048575;
        switch (fieldType) {
            case 51:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Double.valueOf(ArrayDecoders.decodeDouble(data, position)));
                int i11 = position + 8;
                unsafe.putInt(message, j11, number);
                return i11;
            case 52:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Float.valueOf(ArrayDecoders.decodeFloat(data, position)));
                int i12 = position + 4;
                unsafe.putInt(message, j11, number);
                return i12;
            case 53:
            case 54:
                if (wireType != 0) {
                    return position;
                }
                int decodeVarint64 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(registers.long1));
                unsafe.putInt(message, j11, number);
                return decodeVarint64;
            case 55:
            case 62:
                if (wireType != 0) {
                    return position;
                }
                int decodeVarint32 = ArrayDecoders.decodeVarint32(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(registers.int1));
                unsafe.putInt(message, j11, number);
                return decodeVarint32;
            case 56:
            case 65:
                if (wireType != 1) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Long.valueOf(ArrayDecoders.decodeFixed64(data, position)));
                int i13 = position + 8;
                unsafe.putInt(message, j11, number);
                return i13;
            case 57:
            case 64:
                if (wireType != 5) {
                    return position;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(ArrayDecoders.decodeFixed32(data, position)));
                int i14 = position + 4;
                unsafe.putInt(message, j11, number);
                return i14;
            case 58:
                if (wireType != 0) {
                    return position;
                }
                int decodeVarint642 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(message, j11, number);
                return decodeVarint642;
            case 59:
                if (wireType != 2) {
                    return position;
                }
                int decodeVarint322 = ArrayDecoders.decodeVarint32(data, position, registers);
                int i15 = registers.int1;
                if (i15 == 0) {
                    unsafe.putObject(message, fieldOffset, "");
                } else {
                    if ((typeAndOffset & 536870912) != 0 && !Utf8.isValidUtf8(data, decodeVarint322, decodeVarint322 + i15)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(message, fieldOffset, new String(data, decodeVarint322, i15, Internal.UTF_8));
                    decodeVarint322 += i15;
                }
                unsafe.putInt(message, j11, number);
                return decodeVarint322;
            case 60:
                if (wireType != 2) {
                    return position;
                }
                Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(bufferPosition), data, position, limit, registers);
                storeOneofMessageField(message, number, bufferPosition, mutableOneofMessageFieldForMerge);
                return mergeMessageField;
            case 61:
                if (wireType != 2) {
                    return position;
                }
                int decodeBytes = ArrayDecoders.decodeBytes(data, position, registers);
                unsafe.putObject(message, fieldOffset, registers.object1);
                unsafe.putInt(message, j11, number);
                return decodeBytes;
            case 63:
                if (wireType != 0) {
                    return position;
                }
                int decodeVarint323 = ArrayDecoders.decodeVarint32(data, position, registers);
                int i16 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(bufferPosition);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i16)) {
                    getMutableUnknownFields(message).storeField(tag, Long.valueOf(i16));
                    return decodeVarint323;
                }
                unsafe.putObject(message, fieldOffset, Integer.valueOf(i16));
                unsafe.putInt(message, j11, number);
                return decodeVarint323;
            case 66:
                if (wireType != 0) {
                    return position;
                }
                int decodeVarint324 = ArrayDecoders.decodeVarint32(data, position, registers);
                unsafe.putObject(message, fieldOffset, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(message, j11, number);
                return decodeVarint324;
            case 67:
                if (wireType != 0) {
                    return position;
                }
                int decodeVarint643 = ArrayDecoders.decodeVarint64(data, position, registers);
                unsafe.putObject(message, fieldOffset, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(message, j11, number);
                return decodeVarint643;
            case 68:
                if (wireType == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(message, number, bufferPosition);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(bufferPosition), data, position, limit, (tag & (-8)) | 4, registers);
                    storeOneofMessageField(message, number, bufferPosition, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                break;
        }
        return position;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T message, byte[] data, int position, int limit, int tag, int number, int wireType, int bufferPosition, long typeAndOffset, int fieldType, long fieldOffset, ArrayDecoders.Registers registers) throws IOException {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(message, fieldOffset);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(message, fieldOffset, protobufList);
        }
        Internal.ProtobufList protobufList2 = protobufList;
        switch (fieldType) {
            case 18:
            case 35:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedDoubleList(data, position, protobufList2, registers);
                }
                if (wireType == 1) {
                    return ArrayDecoders.decodeDoubleList(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 19:
            case 36:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFloatList(data, position, protobufList2, registers);
                }
                if (wireType == 5) {
                    return ArrayDecoders.decodeFloatList(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 20:
            case 21:
            case 37:
            case 38:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedVarint64List(data, position, protobufList2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeVarint64List(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 22:
            case 29:
            case 39:
            case 43:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedVarint32List(data, position, protobufList2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 23:
            case 32:
            case 40:
            case 46:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFixed64List(data, position, protobufList2, registers);
                }
                if (wireType == 1) {
                    return ArrayDecoders.decodeFixed64List(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 24:
            case 31:
            case 41:
            case 45:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedFixed32List(data, position, protobufList2, registers);
                }
                if (wireType == 5) {
                    return ArrayDecoders.decodeFixed32List(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 25:
            case 42:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedBoolList(data, position, protobufList2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeBoolList(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 26:
                if (wireType == 2) {
                    return (typeAndOffset & IjkMediaMeta.AV_CH_STEREO_LEFT) == 0 ? ArrayDecoders.decodeStringList(tag, data, position, limit, protobufList2, registers) : ArrayDecoders.decodeStringListRequireUtf8(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 27:
                if (wireType == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 28:
                if (wireType == 2) {
                    return ArrayDecoders.decodeBytesList(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 30:
            case 44:
                if (wireType != 2) {
                    if (wireType == 0) {
                        decodeVarint32List = ArrayDecoders.decodeVarint32List(tag, data, position, limit, protobufList2, registers);
                    }
                    return position;
                }
                decodeVarint32List = ArrayDecoders.decodePackedVarint32List(data, position, protobufList2, registers);
                SchemaUtil.filterUnknownEnumList((Object) message, number, (List<Integer>) protobufList2, getEnumFieldVerifier(bufferPosition), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedSInt32List(data, position, protobufList2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeSInt32List(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 34:
            case 48:
                if (wireType == 2) {
                    return ArrayDecoders.decodePackedSInt64List(data, position, protobufList2, registers);
                }
                if (wireType == 0) {
                    return ArrayDecoders.decodeSInt64List(tag, data, position, limit, protobufList2, registers);
                }
                return position;
            case 49:
                if (wireType == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(bufferPosition), tag, data, position, limit, protobufList2, registers);
                }
                return position;
            default:
                return position;
        }
    }

    private int positionForFieldNumber(final int number) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, 0);
    }

    private int presenceMaskAndOffsetAt(int pos) {
        return this.buffer[pos + 2];
    }

    private <E> void readGroupList(Object message, long offset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(message, offset), schema, extensionRegistry);
    }

    private <E> void readMessageList(Object message, int typeAndOffset, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistry) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)), schema, extensionRegistry);
    }

    private void readString(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readString());
        } else {
            UnsafeUtil.putObject(message, offset(typeAndOffset), reader.readBytes());
        }
    }

    private void readStringList(Object message, int typeAndOffset, Reader reader) throws IOException {
        if (isEnforceUtf8(typeAndOffset)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(message, offset(typeAndOffset)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = messageClass.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + fieldName + " for " + messageClass.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T message, int pos) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j11 = 1048575 & presenceMaskAndOffsetAt;
        if (j11 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(message, j11, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(message, j11));
    }

    private void setOneofPresent(T message, int fieldNumber, int pos) {
        UnsafeUtil.putInt(message, presenceMaskAndOffsetAt(pos) & 1048575, fieldNumber);
    }

    private int slowPositionForFieldNumber(final int number, int min) {
        int length = (this.buffer.length / 3) - 1;
        while (min <= length) {
            int i11 = (length + min) >>> 1;
            int i12 = i11 * 3;
            int numberAt = numberAt(i12);
            if (number == numberAt) {
                return i12;
            }
            if (number < numberAt) {
                length = i11 - 1;
            } else {
                min = i11 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            androidx.datastore.preferences.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            androidx.datastore.preferences.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            androidx.datastore.preferences.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Laf:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            return
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Lc9:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T message, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setFieldPresent(message, pos);
    }

    private void storeOneofMessageField(T message, int fieldNumber, int pos, Object field) {
        UNSAFE.putObject(message, offset(typeAndOffsetAt(pos)), field);
        setOneofPresent(message, fieldNumber, pos);
    }

    private static int type(int value) {
        return (value & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int pos) {
        return this.buffer[pos + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrder(T r19, androidx.datastore.preferences.protobuf.Writer r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int number, Object mapField, int pos) throws IOException {
        if (mapField != null) {
            writer.writeMap(number, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(pos)), this.mapFieldSchema.forMapData(mapField));
        }
    }

    private void writeString(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value instanceof String) {
            writer.writeString(fieldNumber, (String) value);
        } else {
            writer.writeBytes(fieldNumber, (ByteString) value);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> schema, T message, Writer writer) throws IOException {
        schema.writeTo(schema.getFromMessage(message), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T message, T other) {
        int length = this.buffer.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!equals(message, other, i11)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T message) {
        int i11;
        int computeDoubleSize;
        int computeFloatSize;
        int computeInt64Size;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t11 = message;
        Unsafe unsafe = UNSAFE;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < messageSchema.buffer.length) {
            int typeAndOffsetAt = messageSchema.typeAndOffsetAt(i13);
            int type = type(typeAndOffsetAt);
            int numberAt = messageSchema.numberAt(i13);
            int i17 = messageSchema.buffer[i13 + 2];
            int i18 = i17 & i12;
            if (type <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(t11, i18);
                    i16 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            int i19 = i15;
            long offset = offset(typeAndOffsetAt);
            if (type < FieldType.DOUBLE_LIST_PACKED.id() || type > FieldType.SINT64_LIST_PACKED.id()) {
                i18 = 0;
            }
            switch (type) {
                case 0:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeFloatSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i15 = i19 + computeFloatSize;
                        messageSchema = this;
                        t11 = message;
                        break;
                    }
                    messageSchema = this;
                    t11 = message;
                    i15 = i19;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeFloatSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i15 = i19 + computeFloatSize;
                        messageSchema = this;
                        t11 = message;
                        break;
                    }
                    messageSchema = this;
                    t11 = message;
                    i15 = i19;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeFloatSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i15 = i19 + computeFloatSize;
                        messageSchema = this;
                        t11 = message;
                        break;
                    }
                    messageSchema = this;
                    t11 = message;
                    i15 = i19;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeFloatSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i15 = i19 + computeFloatSize;
                        messageSchema = this;
                        t11 = message;
                        break;
                    }
                    messageSchema = this;
                    t11 = message;
                    i15 = i19;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        Object object = unsafe.getObject(t11, offset);
                        computeInt64Size = object instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object) : CodedOutputStream.computeStringSize(numberAt, (String) object);
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeFloatSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i15 = i19 + computeFloatSize;
                        messageSchema = this;
                        t11 = message;
                        break;
                    }
                    messageSchema = this;
                    t11 = message;
                    i15 = i19;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeFloatSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i15 = i19 + computeFloatSize;
                        messageSchema = this;
                        t11 = message;
                        break;
                    }
                    messageSchema = this;
                    t11 = message;
                    i15 = i19;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeInt64Size = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t11, offset));
                        i15 = i19 + computeInt64Size;
                        messageSchema = this;
                        break;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t11, i13, i16, i14, i11)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t11, offset));
                    i15 = i19 + computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i13));
                    i15 = i19 + computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t11, offset));
                    i15 = i19 + computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t11, offset), false);
                    i15 = i19 + computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t11, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t11, i18, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        i15 = i19 + computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        break;
                    }
                    i15 = i19;
                    break;
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i13));
                    i15 = i19 + computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = messageSchema.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t11, offset), messageSchema.getMapFieldDefaultEntry(i13));
                    i15 = i19 + computeDoubleSize;
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        Object object2 = unsafe.getObject(t11, offset);
                        computeDoubleSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t11, offset));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t11, numberAt, i13)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t11, offset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + computeDoubleSize;
                        break;
                    }
                    i15 = i19;
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int unknownFieldsSerializedSize = i15 + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t11);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t11).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T message) {
        int i11;
        int hashLong;
        int length = this.buffer.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i13);
            int numberAt = numberAt(i13);
            long offset = offset(typeAndOffsetAt);
            int i14 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(message, offset)));
                    i12 = i11 + hashLong;
                    break;
                case 1:
                    i11 = i12 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(message, offset));
                    i12 = i11 + hashLong;
                    break;
                case 2:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(message, offset));
                    i12 = i11 + hashLong;
                    break;
                case 3:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(message, offset));
                    i12 = i11 + hashLong;
                    break;
                case 4:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(message, offset);
                    i12 = i11 + hashLong;
                    break;
                case 5:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(message, offset));
                    i12 = i11 + hashLong;
                    break;
                case 6:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(message, offset);
                    i12 = i11 + hashLong;
                    break;
                case 7:
                    i11 = i12 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(message, offset));
                    i12 = i11 + hashLong;
                    break;
                case 8:
                    i11 = i12 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(message, offset)).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(message, offset);
                    if (object != null) {
                        i14 = object.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 10:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getObject(message, offset).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 11:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(message, offset);
                    i12 = i11 + hashLong;
                    break;
                case 12:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(message, offset);
                    i12 = i11 + hashLong;
                    break;
                case 13:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(message, offset);
                    i12 = i11 + hashLong;
                    break;
                case 14:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(message, offset));
                    i12 = i11 + hashLong;
                    break;
                case 15:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getInt(message, offset);
                    i12 = i11 + hashLong;
                    break;
                case 16:
                    i11 = i12 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(message, offset));
                    i12 = i11 + hashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(message, offset);
                    if (object2 != null) {
                        i14 = object2.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getObject(message, offset).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 50:
                    i11 = i12 * 53;
                    hashLong = UnsafeUtil.getObject(message, offset).hashCode();
                    i12 = i11 + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(message, offset)));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(message, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(message, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(message, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(message, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(message, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(message, offset)).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = UnsafeUtil.getObject(message, offset).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = UnsafeUtil.getObject(message, offset).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(message, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = oneofIntAt(message, offset);
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(message, offset));
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(message, numberAt, i13)) {
                        i11 = i12 * 53;
                        hashLong = UnsafeUtil.getObject(message, offset).hashCode();
                        i12 = i11 + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.unknownFieldSchema.getFromMessage(message).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(message).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T message) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.checkInitializedCount) {
            int i16 = this.intArray[i14];
            int numberAt = numberAt(i16);
            int typeAndOffsetAt = typeAndOffsetAt(i16);
            int i17 = this.buffer[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i13) {
                if (i18 != 1048575) {
                    i15 = UNSAFE.getInt(message, i18);
                }
                i12 = i15;
                i11 = i18;
            } else {
                i11 = i13;
                i12 = i15;
            }
            T t11 = message;
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t11, i16, i11, i12, i19)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t11, numberAt, i16) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i16))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t11, typeAndOffsetAt, i16)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t11, typeAndOffsetAt, i16)) {
                    return false;
                }
            } else if (isFieldPresent(t11, i16, i11, i12, i19) && !isInitialized(t11, typeAndOffsetAt, getMessageFieldSchema(i16))) {
                return false;
            }
            i14++;
            message = t11;
            i13 = i11;
            i15 = i12;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(message).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T message) {
        if (isMutable(message)) {
            if (message instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) message;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int typeAndOffsetAt = typeAndOffsetAt(i11);
                long offset = offset(typeAndOffsetAt);
                int type = type(typeAndOffsetAt);
                if (type != 9) {
                    if (type != 60 && type != 68) {
                        switch (type) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(message, offset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(message, offset);
                                if (object != null) {
                                    unsafe.putObject(message, offset, this.mapFieldSchema.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (isOneofPresent(message, numberAt(i11), i11)) {
                        getMessageFieldSchema(i11).makeImmutable(UNSAFE.getObject(message, offset));
                    }
                }
                if (isFieldPresent(message, i11)) {
                    getMessageFieldSchema(i11).makeImmutable(UNSAFE.getObject(message, offset));
                }
            }
            this.unknownFieldSchema.makeImmutable(message);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(message);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, T other) {
        checkMutable(message);
        other.getClass();
        for (int i11 = 0; i11 < this.buffer.length; i11 += 3) {
            mergeSingleField(message, other, i11);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0422  */
    @androidx.datastore.preferences.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, androidx.datastore.preferences.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T message, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(message, writer);
        } else {
            writeFieldsInAscendingOrder(message, writer);
        }
    }

    private boolean isFieldPresent(T message, int pos) {
        boolean equals;
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(pos);
        long j11 = 1048575 & presenceMaskAndOffsetAt;
        if (j11 != 1048575) {
            return (UnsafeUtil.getInt(message, j11) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(pos);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(message, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(message, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(message, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(message, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(message, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(message, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(message, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(message, offset);
            case 8:
                Object object = UnsafeUtil.getObject(message, offset);
                if (object instanceof String) {
                    equals = ((String) object).isEmpty();
                    break;
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    equals = ByteString.EMPTY.equals(object);
                    break;
                }
            case 9:
                return UnsafeUtil.getObject(message, offset) != null;
            case 10:
                equals = ByteString.EMPTY.equals(UnsafeUtil.getObject(message, offset));
                break;
            case 11:
                return UnsafeUtil.getInt(message, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(message, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(message, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(message, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(message, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(message, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(message, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    private int positionForFieldNumber(final int number, final int min) {
        if (number < this.minFieldNumber || number > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(number, min);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, Reader reader, ExtensionRegistryLite extensionRegistry) throws IOException {
        extensionRegistry.getClass();
        checkMutable(message);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    private boolean equals(T message, T other, int pos) {
        int typeAndOffsetAt = typeAndOffsetAt(pos);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(message, other, pos) || Double.doubleToLongBits(UnsafeUtil.getDouble(message, offset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(other, offset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(message, other, pos) || Float.floatToIntBits(UnsafeUtil.getFloat(message, offset)) != Float.floatToIntBits(UnsafeUtil.getFloat(other, offset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getLong(message, offset) != UnsafeUtil.getLong(other, offset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getLong(message, offset) != UnsafeUtil.getLong(other, offset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getInt(message, offset) != UnsafeUtil.getInt(other, offset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getLong(message, offset) != UnsafeUtil.getLong(other, offset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getInt(message, offset) != UnsafeUtil.getInt(other, offset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getBoolean(message, offset) != UnsafeUtil.getBoolean(other, offset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(message, other, pos) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(other, offset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(message, other, pos) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(other, offset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(message, other, pos) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(other, offset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getInt(message, offset) != UnsafeUtil.getInt(other, offset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getInt(message, offset) != UnsafeUtil.getInt(other, offset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getInt(message, offset) != UnsafeUtil.getInt(other, offset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getLong(message, offset) != UnsafeUtil.getLong(other, offset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getInt(message, offset) != UnsafeUtil.getInt(other, offset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(message, other, pos) || UnsafeUtil.getLong(message, offset) != UnsafeUtil.getLong(other, offset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(message, other, pos) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(other, offset))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!isOneofCaseEqual(message, other, pos) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(other, offset))) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, byte[] data, int position, int limit, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(message, data, position, limit, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object message, int typeAndOffset, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(message, offset(typeAndOffset)));
    }
}
