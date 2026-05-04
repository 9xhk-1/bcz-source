package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(size) : size * CodedOutputStream.computeBoolSize(fieldNumber, true);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int fieldNumber, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * CodedOutputStream.computeTagSize(fieldNumber);
        for (int i11 = 0; i11 < list.size(); i11++) {
            computeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i11));
        }
        return computeTagSize;
    }

    public static int computeSizeEnumList(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag) : computeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeEnumSizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    public static int computeSizeFixed32List(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) : size * CodedOutputStream.computeFixed32Size(fieldNumber, 0);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int fieldNumber, List<?> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) : size * CodedOutputStream.computeFixed64Size(fieldNumber, 0L);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int fieldNumber, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.computeGroupSize(fieldNumber, list.get(i12));
        }
        return i11;
    }

    public static int computeSizeInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag) : computeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    public static int computeSizeInt64List(int fieldNumber, List<Long> list, boolean packed) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag) : computeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i11));
            i11++;
        }
        return i13;
    }

    public static int computeSizeMessage(int fieldNumber, Object value, Schema schema) {
        return value instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(fieldNumber, (LazyFieldLite) value) : CodedOutputStream.computeMessageSize(fieldNumber, (MessageLite) value, schema);
    }

    public static int computeSizeMessageList(int fieldNumber, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            computeTagSize += obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
        }
        return computeTagSize;
    }

    public static int computeSizeSInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag) : computeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    public static int computeSizeSInt64List(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag) : computeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i11));
            i11++;
        }
        return i13;
    }

    public static int computeSizeStringList(int fieldNumber, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        if (!(list instanceof LazyStringList)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                computeTagSize += obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
                i11++;
            }
            return computeTagSize;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i11 < size) {
            Object raw = lazyStringList.getRaw(i11);
            computeTagSize += raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw);
            i11++;
        }
        return computeTagSize;
    }

    public static int computeSizeUInt32List(int fieldNumber, List<Integer> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag) : computeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i11));
            i11++;
        }
        return i13;
    }

    public static int computeSizeUInt64List(int fieldNumber, List<Long> list, boolean packed) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        return packed ? CodedOutputStream.computeTagSize(fieldNumber) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag) : computeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(fieldNumber));
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i11));
            i11++;
        }
        return i13;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i11, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (enumLiteMap.findValueByNumber(intValue) == null) {
                    ub2 = (UB) storeUnknownEnum(obj, i11, intValue, ub2, unknownFieldSchema);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int intValue2 = num.intValue();
            if (enumLiteMap.findValueByNumber(intValue2) != null) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                ub2 = (UB) storeUnknownEnum(obj, i11, intValue2, ub2, unknownFieldSchema);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }

    private static Class<?> getGeneratedMessageClass() {
        if (Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> clazz, String name) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(clazz.getName() + "$" + toCamelCase(name, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + name + " in " + clazz.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        if (Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> schema, T message, T other) {
        FieldSet<FT> extensions = schema.getExtensions(other);
        if (extensions.isEmpty()) {
            return;
        }
        schema.getMutableExtensions(message).mergeFrom(extensions);
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T message, T o11, long offset) {
        UnsafeUtil.putObject(message, offset, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(message, offset), UnsafeUtil.getObject(o11, offset)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> schema, T message, T other) {
        schema.setToMessage(message, schema.merge(schema.getFromMessage(message), schema.getFromMessage(other)));
    }

    public static void requireGeneratedMessage(Class<?> messageType) {
        Class<?> cls;
        if (!GeneratedMessageLite.class.isAssignableFrom(messageType) && !Protobuf.assumeLiteRuntime && (cls = GENERATED_MESSAGE_CLASS) != null && !cls.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object a11, Object b11) {
        if (a11 != b11) {
            return a11 != null && a11.equals(b11);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int lo2, int hi2, int numFields) {
        if (hi2 < 40) {
            return true;
        }
        long j11 = hi2 - lo2;
        long j12 = numFields;
        return j11 + 10 <= ((2 * j12) + 3) + ((j12 + 3) * 3);
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i11, int i12, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub2 == null) {
            ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub2, i11, i12);
        return ub2;
    }

    public static String toCamelCase(String name, boolean capNext) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < name.length(); i11++) {
            char charAt = name.charAt(i11);
            if ('a' > charAt || charAt > 'z') {
                if ('A' > charAt || charAt > 'Z') {
                    if ('0' <= charAt && charAt <= '9') {
                        sb2.append(charAt);
                    }
                    capNext = true;
                } else if (i11 != 0 || capNext) {
                    sb2.append(charAt);
                } else {
                    sb2.append((char) (charAt + ' '));
                }
            } else if (capNext) {
                sb2.append((char) (charAt - ' '));
            } else {
                sb2.append(charAt);
            }
            capNext = false;
        }
        return sb2.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int fieldNumber, boolean value, Writer writer) throws IOException {
        if (value) {
            writer.writeBool(fieldNumber, true);
        }
    }

    public static void writeBoolList(int fieldNumber, List<Boolean> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBoolList(fieldNumber, value, packed);
    }

    public static void writeBytes(int fieldNumber, ByteString value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytes(fieldNumber, value);
    }

    public static void writeBytesList(int fieldNumber, List<ByteString> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeBytesList(fieldNumber, value);
    }

    public static void writeDouble(int fieldNumber, double value, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(value) != 0) {
            writer.writeDouble(fieldNumber, value);
        }
    }

    public static void writeDoubleList(int fieldNumber, List<Double> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeDoubleList(fieldNumber, value, packed);
    }

    public static void writeEnum(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeEnum(fieldNumber, value);
        }
    }

    public static void writeEnumList(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeEnumList(fieldNumber, value, packed);
    }

    public static void writeFixed32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeFixed32(fieldNumber, value);
        }
    }

    public static void writeFixed32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed32List(fieldNumber, value, packed);
    }

    public static void writeFixed64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeFixed64(fieldNumber, value);
        }
    }

    public static void writeFixed64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFixed64List(fieldNumber, value, packed);
    }

    public static void writeFloat(int fieldNumber, float value, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(value) != 0) {
            writer.writeFloat(fieldNumber, value);
        }
    }

    public static void writeFloatList(int fieldNumber, List<Float> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeFloatList(fieldNumber, value, packed);
    }

    public static void writeGroupList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value);
    }

    public static void writeInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeInt32(fieldNumber, value);
        }
    }

    public static void writeInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt32List(fieldNumber, value, packed);
    }

    public static void writeInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeInt64(fieldNumber, value);
        }
    }

    public static void writeInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeInt64List(fieldNumber, value, packed);
    }

    public static void writeLazyFieldList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        Iterator<?> it = value.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, fieldNumber);
        }
    }

    public static void writeMessage(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value != null) {
            writer.writeMessage(fieldNumber, value);
        }
    }

    public static void writeMessageList(int fieldNumber, List<?> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value);
    }

    public static void writeSFixed32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed32(fieldNumber, value);
        }
    }

    public static void writeSFixed32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(fieldNumber, value, packed);
    }

    public static void writeSFixed64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSFixed64(fieldNumber, value);
        }
    }

    public static void writeSFixed64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(fieldNumber, value, packed);
    }

    public static void writeSInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSInt32(fieldNumber, value);
        }
    }

    public static void writeSInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt32List(fieldNumber, value, packed);
    }

    public static void writeSInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeSInt64(fieldNumber, value);
        }
    }

    public static void writeSInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeSInt64List(fieldNumber, value, packed);
    }

    public static void writeString(int fieldNumber, Object value, Writer writer) throws IOException {
        if (value instanceof String) {
            writeStringInternal(fieldNumber, (String) value, writer);
        } else {
            writeBytes(fieldNumber, (ByteString) value, writer);
        }
    }

    private static void writeStringInternal(int fieldNumber, String value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeString(fieldNumber, value);
    }

    public static void writeStringList(int fieldNumber, List<String> value, Writer writer) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeStringList(fieldNumber, value);
    }

    public static void writeUInt32(int fieldNumber, int value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeUInt32(fieldNumber, value);
        }
    }

    public static void writeUInt32List(int fieldNumber, List<Integer> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt32List(fieldNumber, value, packed);
    }

    public static void writeUInt64(int fieldNumber, long value, Writer writer) throws IOException {
        if (value != 0) {
            writer.writeUInt64(fieldNumber, value);
        }
    }

    public static void writeUInt64List(int fieldNumber, List<Long> value, Writer writer, boolean packed) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeUInt64List(fieldNumber, value, packed);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fields) {
        if (fields.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fields[0].getFieldNumber(), fields[fields.length - 1].getFieldNumber(), fields.length);
    }

    public static int computeSizeGroupList(int fieldNumber, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.computeGroupSize(fieldNumber, list.get(i12), schema);
        }
        return i11;
    }

    public static void writeGroupList(int fieldNumber, List<?> value, Writer writer, Schema schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeGroupList(fieldNumber, value, schema);
    }

    public static void writeMessageList(int fieldNumber, List<?> value, Writer writer, Schema schema) throws IOException {
        if (value == null || value.isEmpty()) {
            return;
        }
        writer.writeMessageList(fieldNumber, value, schema);
    }

    public static int computeSizeMessageList(int fieldNumber, List<?> list, Schema schema) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(fieldNumber) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof LazyFieldLite) {
                computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i11, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                Integer num = list.get(i13);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i13 != i12) {
                        list.set(i12, num);
                    }
                    i12++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i11, intValue, ub2, unknownFieldSchema);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
            return ub2;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(intValue2)) {
                ub2 = (UB) storeUnknownEnum(obj, i11, intValue2, ub2, unknownFieldSchema);
                it.remove();
            }
        }
        return ub2;
    }
}
