package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import ho.c;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.ArrayDecoders$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int depth) throws InvalidProtocolBufferException {
        if (depth >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int decodeBoolList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int decodeVarint64 = decodeVarint64(data, position, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (decodeVarint64 < limit) {
            int decodeVarint32 = decodeVarint32(data, decodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(data, decodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return decodeVarint64;
    }

    public static int decodeBytes(byte[] data, int position, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 > data.length - decodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i11 == 0) {
            registers.object1 = ByteString.EMPTY;
            return decodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(data, decodeVarint32, i11);
        return decodeVarint32 + i11;
    }

    public static int decodeBytesList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 > data.length - decodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i11 == 0) {
            list.add(ByteString.EMPTY);
        } else {
            list.add(ByteString.copyFrom(data, decodeVarint32, i11));
            decodeVarint32 += i11;
        }
        while (decodeVarint32 < limit) {
            int decodeVarint322 = decodeVarint32(data, decodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(data, decodeVarint322, registers);
            int i12 = registers.int1;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i12 > data.length - decodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i12 == 0) {
                list.add(ByteString.EMPTY);
            } else {
                list.add(ByteString.copyFrom(data, decodeVarint32, i12));
                decodeVarint32 += i12;
            }
        }
        return decodeVarint32;
    }

    public static double decodeDouble(byte[] data, int position) {
        return Double.longBitsToDouble(decodeFixed64(data, position));
    }

    public static int decodeDoubleList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        doubleArrayList.addDouble(decodeDouble(data, position));
        int i11 = position + 8;
        while (i11 < limit) {
            int decodeVarint32 = decodeVarint32(data, i11, registers);
            if (tag != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(data, decodeVarint32));
            i11 = decodeVarint32 + 8;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int tag, byte[] data, int position, int limit, GeneratedMessageLite.ExtendableMessage<?, ?> message, GeneratedMessageLite.GeneratedExtension<?, ?> extension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        int i11;
        int i12;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = message.extensions;
        int i13 = tag >>> 3;
        if (extension.descriptor.isRepeated() && extension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int decodePackedDoubleList = decodePackedDoubleList(data, position, doubleArrayList, registers);
                    fieldSet.setField(extension.descriptor, doubleArrayList);
                    return decodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int decodePackedFloatList = decodePackedFloatList(data, position, floatArrayList, registers);
                    fieldSet.setField(extension.descriptor, floatArrayList);
                    return decodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int decodePackedVarint64List = decodePackedVarint64List(data, position, longArrayList, registers);
                    fieldSet.setField(extension.descriptor, longArrayList);
                    return decodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int decodePackedVarint32List = decodePackedVarint32List(data, position, intArrayList, registers);
                    fieldSet.setField(extension.descriptor, intArrayList);
                    return decodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int decodePackedFixed64List = decodePackedFixed64List(data, position, longArrayList2, registers);
                    fieldSet.setField(extension.descriptor, longArrayList2);
                    return decodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int decodePackedFixed32List = decodePackedFixed32List(data, position, intArrayList2, registers);
                    fieldSet.setField(extension.descriptor, intArrayList2);
                    return decodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int decodePackedBoolList = decodePackedBoolList(data, position, booleanArrayList, registers);
                    fieldSet.setField(extension.descriptor, booleanArrayList);
                    return decodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int decodePackedSInt32List = decodePackedSInt32List(data, position, intArrayList3, registers);
                    fieldSet.setField(extension.descriptor, intArrayList3);
                    return decodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int decodePackedSInt64List = decodePackedSInt64List(data, position, longArrayList3, registers);
                    fieldSet.setField(extension.descriptor, longArrayList3);
                    return decodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int decodePackedVarint32List2 = decodePackedVarint32List(data, position, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) message, i13, (List<Integer>) intArrayList4, extension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(extension.descriptor, intArrayList4);
                    return decodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + extension.descriptor.getLiteType());
            }
        }
        Object obj = null;
        if (extension.getLiteType() == WireFormat.FieldType.ENUM) {
            position = decodeVarint32(data, position, registers);
            if (extension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                SchemaUtil.storeUnknownEnum(message, i13, registers.int1, null, unknownFieldSchema);
                return position;
            }
            obj = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extension.getLiteType().ordinal()]) {
                case 1:
                    i11 = position;
                    obj = Double.valueOf(decodeDouble(data, i11));
                    position = i11 + 8;
                    break;
                case 2:
                    i12 = position;
                    obj = Float.valueOf(decodeFloat(data, i12));
                    position = i12 + 4;
                    break;
                case 3:
                case 4:
                    position = decodeVarint64(data, position, registers);
                    obj = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    position = decodeVarint32(data, position, registers);
                    obj = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    i11 = position;
                    obj = Long.valueOf(decodeFixed64(data, i11));
                    position = i11 + 8;
                    break;
                case 9:
                case 10:
                    i12 = position;
                    obj = Integer.valueOf(decodeFixed32(data, i12));
                    position = i12 + 4;
                    break;
                case 11:
                    position = decodeVarint64(data, position, registers);
                    obj = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    position = decodeVarint32(data, position, registers);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    position = decodeVarint64(data, position, registers);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    position = decodeBytes(data, position, registers);
                    obj = registers.object1;
                    break;
                case 16:
                    position = decodeString(data, position, registers);
                    obj = registers.object1;
                    break;
                case 17:
                    int i14 = (i13 << 3) | 4;
                    Schema schemaFor = Protobuf.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int decodeGroupField = decodeGroupField(schemaFor, data, position, limit, i14, registers);
                        fieldSet.addRepeatedField(extension.descriptor, registers.object1);
                        return decodeGroupField;
                    }
                    Object field = fieldSet.getField(extension.descriptor);
                    if (field == null) {
                        field = schemaFor.newInstance();
                        fieldSet.setField(extension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaFor, data, position, limit, i14, registers);
                case 18:
                    Schema schemaFor2 = Protobuf.getInstance().schemaFor((Class) extension.getMessageDefaultInstance().getClass());
                    if (extension.isRepeated()) {
                        int decodeMessageField = decodeMessageField(schemaFor2, data, position, limit, registers);
                        fieldSet.addRepeatedField(extension.descriptor, registers.object1);
                        return decodeMessageField;
                    }
                    Object field2 = fieldSet.getField(extension.descriptor);
                    if (field2 == null) {
                        field2 = schemaFor2.newInstance();
                        fieldSet.setField(extension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaFor2, data, position, limit, registers);
            }
        }
        if (extension.isRepeated()) {
            fieldSet.addRepeatedField(extension.descriptor, obj);
            return position;
        }
        fieldSet.setField(extension.descriptor, obj);
        return position;
    }

    public static int decodeExtensionOrUnknownField(int tag, byte[] data, int position, int limit, Object message, MessageLite defaultInstance, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(defaultInstance, tag >>> 3);
        if (findLiteExtensionByNumber == null) {
            return decodeUnknownField(tag, data, position, limit, MessageSchema.getMutableUnknownFields(message), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) message;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(tag, data, position, limit, extendableMessage, findLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    public static int decodeFixed32(byte[] data, int position) {
        return ((data[position + 3] & 255) << 24) | (data[position] & 255) | ((data[position + 1] & 255) << 8) | ((data[position + 2] & 255) << 16);
    }

    public static int decodeFixed32List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) list;
        intArrayList.addInt(decodeFixed32(data, position));
        int i11 = position + 4;
        while (i11 < limit) {
            int decodeVarint32 = decodeVarint32(data, i11, registers);
            if (tag != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(data, decodeVarint32));
            i11 = decodeVarint32 + 4;
        }
        return i11;
    }

    public static long decodeFixed64(byte[] data, int position) {
        return ((data[position + 7] & 255) << 56) | (data[position] & 255) | ((data[position + 1] & 255) << 8) | ((data[position + 2] & 255) << 16) | ((data[position + 3] & 255) << 24) | ((data[position + 4] & 255) << 32) | ((data[position + 5] & 255) << 40) | ((data[position + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) list;
        longArrayList.addLong(decodeFixed64(data, position));
        int i11 = position + 8;
        while (i11 < limit) {
            int decodeVarint32 = decodeVarint32(data, i11, registers);
            if (tag != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(data, decodeVarint32));
            i11 = decodeVarint32 + 8;
        }
        return i11;
    }

    public static float decodeFloat(byte[] data, int position) {
        return Float.intBitsToFloat(decodeFixed32(data, position));
    }

    public static int decodeFloatList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) list;
        floatArrayList.addFloat(decodeFloat(data, position));
        int i11 = position + 4;
        while (i11 < limit) {
            int decodeVarint32 = decodeVarint32(data, i11, registers);
            if (tag != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(data, decodeVarint32));
            i11 = decodeVarint32 + 4;
        }
        return i11;
    }

    public static int decodeGroupField(Schema schema, byte[] data, int position, int limit, int endGroup, Registers registers) throws IOException {
        Object newInstance = schema.newInstance();
        int mergeGroupField = mergeGroupField(newInstance, schema, data, position, limit, endGroup, registers);
        schema.makeImmutable(newInstance);
        registers.object1 = newInstance;
        return mergeGroupField;
    }

    public static int decodeGroupList(Schema schema, int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        int i11 = (tag & (-8)) | 4;
        int decodeGroupField = decodeGroupField(schema, data, position, limit, i11, registers);
        list.add(registers.object1);
        while (decodeGroupField < limit) {
            int decodeVarint32 = decodeVarint32(data, decodeGroupField, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeGroupField = decodeGroupField(schema, data, decodeVarint32, limit, i11, registers);
            list.add(registers.object1);
        }
        return decodeGroupField;
    }

    public static int decodeMessageField(Schema schema, byte[] data, int position, int limit, Registers registers) throws IOException {
        Object newInstance = schema.newInstance();
        int mergeMessageField = mergeMessageField(newInstance, schema, data, position, limit, registers);
        schema.makeImmutable(newInstance);
        registers.object1 = newInstance;
        return mergeMessageField;
    }

    public static int decodeMessageList(Schema<?> schema, int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        int decodeMessageField = decodeMessageField(schema, data, position, limit, registers);
        list.add(registers.object1);
        while (decodeMessageField < limit) {
            int decodeVarint32 = decodeVarint32(data, decodeMessageField, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeMessageField = decodeMessageField(schema, data, decodeVarint32, limit, registers);
            list.add(registers.object1);
        }
        return decodeMessageField;
    }

    public static int decodePackedBoolList(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint64(data, decodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            doubleArrayList.addDouble(decodeDouble(data, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            intArrayList.addInt(decodeFixed32(data, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            longArrayList.addLong(decodeFixed64(data, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            floatArrayList.addFloat(decodeFloat(data, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint32(data, decodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint64(data, decodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint32(data, decodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] data, int position, Internal.ProtobufList<?> list, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i11) {
            decodeVarint32 = decodeVarint64(data, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (decodeVarint32 == i11) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (decodeVarint32 < limit) {
            int decodeVarint322 = decodeVarint32(data, decodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(data, decodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return decodeVarint32;
    }

    public static int decodeSInt64List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) list;
        int decodeVarint64 = decodeVarint64(data, position, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (decodeVarint64 < limit) {
            int decodeVarint32 = decodeVarint32(data, decodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(data, decodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return decodeVarint64;
    }

    public static int decodeString(byte[] data, int position, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            registers.object1 = "";
            return decodeVarint32;
        }
        registers.object1 = new String(data, decodeVarint32, i11, Internal.UTF_8);
        return decodeVarint32 + i11;
    }

    public static int decodeStringList(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            list.add("");
        } else {
            list.add(new String(data, decodeVarint32, i11, Internal.UTF_8));
            decodeVarint32 += i11;
        }
        while (decodeVarint32 < limit) {
            int decodeVarint322 = decodeVarint32(data, decodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(data, decodeVarint322, registers);
            int i12 = registers.int1;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i12 == 0) {
                list.add("");
            } else {
                list.add(new String(data, decodeVarint32, i12, Internal.UTF_8));
                decodeVarint32 += i12;
            }
        }
        return decodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            list.add("");
        } else {
            int i12 = decodeVarint32 + i11;
            if (!Utf8.isValidUtf8(data, decodeVarint32, i12)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            list.add(new String(data, decodeVarint32, i11, Internal.UTF_8));
            decodeVarint32 = i12;
        }
        while (decodeVarint32 < limit) {
            int decodeVarint322 = decodeVarint32(data, decodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(data, decodeVarint322, registers);
            int i13 = registers.int1;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i13 == 0) {
                list.add("");
            } else {
                int i14 = decodeVarint32 + i13;
                if (!Utf8.isValidUtf8(data, decodeVarint32, i14)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                list.add(new String(data, decodeVarint32, i13, Internal.UTF_8));
                decodeVarint32 = i14;
            }
        }
        return decodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] data, int position, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(data, position, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            registers.object1 = "";
            return decodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(data, decodeVarint32, i11);
        return decodeVarint32 + i11;
    }

    public static int decodeUnknownField(int tag, byte[] data, int position, int limit, UnknownFieldSetLite unknownFields, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(tag) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            int decodeVarint64 = decodeVarint64(data, position, registers);
            unknownFields.storeField(tag, Long.valueOf(registers.long1));
            return decodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFields.storeField(tag, Long.valueOf(decodeFixed64(data, position)));
            return position + 8;
        }
        if (tagWireType == 2) {
            int decodeVarint32 = decodeVarint32(data, position, registers);
            int i11 = registers.int1;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i11 > data.length - decodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i11 == 0) {
                unknownFields.storeField(tag, ByteString.EMPTY);
            } else {
                unknownFields.storeField(tag, ByteString.copyFrom(data, decodeVarint32, i11));
            }
            return decodeVarint32 + i11;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFields.storeField(tag, Integer.valueOf(decodeFixed32(data, position)));
            return position + 4;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        int i12 = (tag & (-8)) | 4;
        int i13 = registers.recursionDepth + 1;
        registers.recursionDepth = i13;
        checkRecursionLimit(i13);
        int i14 = 0;
        while (true) {
            if (position >= limit) {
                break;
            }
            int decodeVarint322 = decodeVarint32(data, position, registers);
            i14 = registers.int1;
            if (i14 == i12) {
                position = decodeVarint322;
                break;
            }
            position = decodeUnknownField(i14, data, decodeVarint322, limit, newInstance, registers);
        }
        registers.recursionDepth--;
        if (position > limit || i14 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFields.storeField(tag, newInstance);
        return position;
    }

    public static int decodeVarint32(byte[] data, int position, Registers registers) {
        int i11 = position + 1;
        byte b11 = data[position];
        if (b11 < 0) {
            return decodeVarint32(b11, data, i11, registers);
        }
        registers.int1 = b11;
        return i11;
    }

    public static int decodeVarint32List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) list;
        int decodeVarint32 = decodeVarint32(data, position, registers);
        intArrayList.addInt(registers.int1);
        while (decodeVarint32 < limit) {
            int decodeVarint322 = decodeVarint32(data, decodeVarint32, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(data, decodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return decodeVarint32;
    }

    public static int decodeVarint64(byte[] data, int position, Registers registers) {
        int i11 = position + 1;
        long j11 = data[position];
        if (j11 < 0) {
            return decodeVarint64(j11, data, i11, registers);
        }
        registers.long1 = j11;
        return i11;
    }

    public static int decodeVarint64List(int tag, byte[] data, int position, int limit, Internal.ProtobufList<?> list, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) list;
        int decodeVarint64 = decodeVarint64(data, position, registers);
        longArrayList.addLong(registers.long1);
        while (decodeVarint64 < limit) {
            int decodeVarint32 = decodeVarint32(data, decodeVarint64, registers);
            if (tag != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(data, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return decodeVarint64;
    }

    public static int mergeGroupField(Object msg, Schema schema, byte[] data, int position, int limit, int endGroup, Registers registers) throws IOException {
        int i11 = registers.recursionDepth + 1;
        registers.recursionDepth = i11;
        checkRecursionLimit(i11);
        int parseMessage = ((MessageSchema) schema).parseMessage(msg, data, position, limit, endGroup, registers);
        registers.recursionDepth--;
        registers.object1 = msg;
        return parseMessage;
    }

    public static int mergeMessageField(Object msg, Schema schema, byte[] data, int position, int limit, Registers registers) throws IOException {
        int i11 = position + 1;
        int i12 = data[position];
        if (i12 < 0) {
            i11 = decodeVarint32(i12, data, i11, registers);
            i12 = registers.int1;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > limit - i13) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = registers.recursionDepth + 1;
        registers.recursionDepth = i14;
        checkRecursionLimit(i14);
        int i15 = i13 + i12;
        schema.mergeFrom(msg, data, i13, i15, registers);
        registers.recursionDepth--;
        registers.object1 = msg;
        return i15;
    }

    public static void setRecursionLimit(int limit) {
        recursionLimit = limit;
    }

    public static int skipField(int tag, byte[] data, int position, int limit, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(tag) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            return decodeVarint64(data, position, registers);
        }
        if (tagWireType == 1) {
            return position + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(data, position, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return position + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i11 = (tag & (-8)) | 4;
        int i12 = 0;
        while (position < limit) {
            position = decodeVarint32(data, position, registers);
            i12 = registers.int1;
            if (i12 == i11) {
                break;
            }
            position = skipField(i12, data, position, limit, registers);
        }
        if (position > limit || i12 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return position;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        public Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        public Registers(ExtensionRegistryLite extensionRegistry) {
            extensionRegistry.getClass();
            this.extensionRegistry = extensionRegistry;
        }
    }

    public static int decodeVarint32(int firstByte, byte[] data, int position, Registers registers) {
        int i11 = firstByte & 127;
        int i12 = position + 1;
        byte b11 = data[position];
        if (b11 >= 0) {
            registers.int1 = i11 | (b11 << 7);
            return i12;
        }
        int i13 = i11 | ((b11 & Byte.MAX_VALUE) << 7);
        int i14 = position + 2;
        byte b12 = data[i12];
        if (b12 >= 0) {
            registers.int1 = i13 | (b12 << 14);
            return i14;
        }
        int i15 = i13 | ((b12 & Byte.MAX_VALUE) << 14);
        int i16 = position + 3;
        byte b13 = data[i14];
        if (b13 >= 0) {
            registers.int1 = i15 | (b13 << c.f59560y);
            return i16;
        }
        int i17 = i15 | ((b13 & Byte.MAX_VALUE) << 21);
        int i18 = position + 4;
        byte b14 = data[i16];
        if (b14 >= 0) {
            registers.int1 = i17 | (b14 << 28);
            return i18;
        }
        int i19 = i17 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i18 + 1;
            if (data[i18] >= 0) {
                registers.int1 = i19;
                return i21;
            }
            i18 = i21;
        }
    }

    public static int decodeVarint64(long firstByte, byte[] data, int position, Registers registers) {
        int i11 = position + 1;
        byte b11 = data[position];
        long j11 = (firstByte & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b11 < 0) {
            int i13 = i11 + 1;
            byte b12 = data[i11];
            i12 += 7;
            j11 |= (b12 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b11 = b12;
        }
        registers.long1 = j11;
        return i11;
    }
}
