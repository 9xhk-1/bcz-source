package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 5;
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream output) {
        CodedOutputStream codedOutputStream = (CodedOutputStream) Internal.checkNotNull(output, "output");
        this.output = codedOutputStream;
        codedOutputStream.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream output) {
        CodedOutputStreamWriter codedOutputStreamWriter = output.wrapper;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(output);
    }

    private void writeBoolListInternal(int fieldNumber, BooleanArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeBool(fieldNumber, value.getBoolean(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeBoolSizeNoTag(value.getBoolean(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeBoolNoTag(value.getBoolean(i11));
            i11++;
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int fieldNumber, boolean key, V value, MapEntryLite.Metadata<Boolean, V> metadata) throws IOException {
        this.output.writeTag(fieldNumber, 2);
        this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Boolean.valueOf(key), value));
        MapEntryLite.writeTo(this.output, metadata, Boolean.valueOf(key), value);
    }

    private <V> void writeDeterministicIntegerMap(int fieldNumber, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v11 = map.get(Integer.valueOf(i13));
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i13), v11));
            MapEntryLite.writeTo(this.output, metadata, Integer.valueOf(i13), v11);
        }
    }

    private <V> void writeDeterministicLongMap(int fieldNumber, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j11 = jArr[i12];
            V v11 = map.get(Long.valueOf(j11));
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j11), v11));
            MapEntryLite.writeTo(this.output, metadata, Long.valueOf(j11), v11);
        }
    }

    private <K, V> void writeDeterministicMap(int fieldNumber, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v11 = map.get(Boolean.FALSE);
                if (v11 != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, false, v11, metadata);
                }
                V v12 = map.get(Boolean.TRUE);
                if (v12 != null) {
                    writeDeterministicBooleanMapEntry(fieldNumber, true, v12, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(fieldNumber, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(fieldNumber, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(fieldNumber, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int fieldNumber, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v11 = map.get(str);
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v11));
            MapEntryLite.writeTo(this.output, metadata, str, v11);
        }
    }

    private void writeDoubleListInternal(int fieldNumber, DoubleArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeDouble(fieldNumber, value.getDouble(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeDoubleSizeNoTag(value.getDouble(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeDoubleNoTag(value.getDouble(i11));
            i11++;
        }
    }

    private void writeEnumListInternal(int fieldNumber, IntArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeEnum(fieldNumber, value.getInt(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeEnumSizeNoTag(value.getInt(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeEnumNoTag(value.getInt(i11));
            i11++;
        }
    }

    private void writeFixed32ListInternal(int fieldNumber, IntArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeFixed32(fieldNumber, value.getInt(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeFixed32SizeNoTag(value.getInt(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeFixed32NoTag(value.getInt(i11));
            i11++;
        }
    }

    private void writeFixed64ListInternal(int fieldNumber, LongArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeFixed64(fieldNumber, value.getLong(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeFixed64SizeNoTag(value.getLong(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeFixed64NoTag(value.getLong(i11));
            i11++;
        }
    }

    private void writeFloatListInternal(int fieldNumber, FloatArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeFloat(fieldNumber, value.getFloat(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeFloatSizeNoTag(value.getFloat(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeFloatNoTag(value.getFloat(i11));
            i11++;
        }
    }

    private void writeInt32ListInternal(int fieldNumber, IntArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeInt32(fieldNumber, value.getInt(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeInt32SizeNoTag(value.getInt(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeInt32NoTag(value.getInt(i11));
            i11++;
        }
    }

    private void writeInt64ListInternal(int fieldNumber, LongArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeInt64(fieldNumber, value.getLong(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeInt64SizeNoTag(value.getLong(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeInt64NoTag(value.getLong(i11));
            i11++;
        }
    }

    private void writeLazyString(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            this.output.writeString(fieldNumber, (String) value);
        } else {
            this.output.writeBytes(fieldNumber, (ByteString) value);
        }
    }

    private void writeSFixed32ListInternal(int fieldNumber, IntArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeSFixed32(fieldNumber, value.getInt(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeSFixed32SizeNoTag(value.getInt(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeSFixed32NoTag(value.getInt(i11));
            i11++;
        }
    }

    private void writeSFixed64ListInternal(int fieldNumber, LongArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeSFixed64(fieldNumber, value.getLong(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeSFixed64SizeNoTag(value.getLong(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeSFixed64NoTag(value.getLong(i11));
            i11++;
        }
    }

    private void writeSInt32ListInternal(int fieldNumber, IntArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeSInt32(fieldNumber, value.getInt(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeSInt32SizeNoTag(value.getInt(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeSInt32NoTag(value.getInt(i11));
            i11++;
        }
    }

    private void writeSInt64ListInternal(int fieldNumber, LongArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeSInt64(fieldNumber, value.getLong(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeSInt64SizeNoTag(value.getLong(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeSInt64NoTag(value.getLong(i11));
            i11++;
        }
    }

    private void writeUInt32ListInternal(int fieldNumber, IntArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeUInt32(fieldNumber, value.getInt(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeUInt32SizeNoTag(value.getInt(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeUInt32NoTag(value.getInt(i11));
            i11++;
        }
    }

    private void writeUInt64ListInternal(int fieldNumber, LongArrayList value, boolean packed) throws IOException {
        int i11 = 0;
        if (!packed) {
            while (i11 < value.size()) {
                this.output.writeUInt64(fieldNumber, value.getLong(i11));
                i11++;
            }
            return;
        }
        this.output.writeTag(fieldNumber, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < value.size(); i13++) {
            i12 += CodedOutputStream.computeUInt64SizeNoTag(value.getLong(i13));
        }
        this.output.writeUInt32NoTag(i12);
        while (i11 < value.size()) {
            this.output.writeUInt64NoTag(value.getLong(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int fieldNumber, boolean value) throws IOException {
        this.output.writeBool(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        if (value instanceof BooleanArrayList) {
            writeBoolListInternal(fieldNumber, (BooleanArrayList) value, packed);
        } else {
            writeBoolListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytes(int fieldNumber, ByteString value) throws IOException {
        this.output.writeBytes(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int fieldNumber, List<ByteString> value) throws IOException {
        for (int i11 = 0; i11 < value.size(); i11++) {
            this.output.writeBytes(fieldNumber, value.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int fieldNumber, double value) throws IOException {
        this.output.writeDouble(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        if (value instanceof DoubleArrayList) {
            writeDoubleListInternal(fieldNumber, (DoubleArrayList) value, packed);
        } else {
            writeDoubleListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeEndGroup(int fieldNumber) throws IOException {
        this.output.writeTag(fieldNumber, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int fieldNumber, int value) throws IOException {
        this.output.writeEnum(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof IntArrayList) {
            writeEnumListInternal(fieldNumber, (IntArrayList) value, packed);
        } else {
            writeEnumListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int fieldNumber, int value) throws IOException {
        this.output.writeFixed32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof IntArrayList) {
            writeFixed32ListInternal(fieldNumber, (IntArrayList) value, packed);
        } else {
            writeFixed32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int fieldNumber, long value) throws IOException {
        this.output.writeFixed64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof LongArrayList) {
            writeFixed64ListInternal(fieldNumber, (LongArrayList) value, packed);
        } else {
            writeFixed64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int fieldNumber, float value) throws IOException {
        this.output.writeFloat(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        if (value instanceof FloatArrayList) {
            writeFloatListInternal(fieldNumber, (FloatArrayList) value, packed);
        } else {
            writeFloatListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroup(int fieldNumber, Object value) throws IOException {
        this.output.writeGroup(fieldNumber, (MessageLite) value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroupList(int fieldNumber, List<?> value) throws IOException {
        for (int i11 = 0; i11 < value.size(); i11++) {
            writeGroup(fieldNumber, value.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int fieldNumber, int value) throws IOException {
        this.output.writeInt32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof IntArrayList) {
            writeInt32ListInternal(fieldNumber, (IntArrayList) value, packed);
        } else {
            writeInt32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int fieldNumber, long value) throws IOException {
        this.output.writeInt64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof LongArrayList) {
            writeInt64ListInternal(fieldNumber, (LongArrayList) value, packed);
        } else {
            writeInt64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int fieldNumber, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(fieldNumber, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(fieldNumber, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int fieldNumber, Object value) throws IOException {
        this.output.writeMessage(fieldNumber, (MessageLite) value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int fieldNumber, List<?> value) throws IOException {
        for (int i11 = 0; i11 < value.size(); i11++) {
            writeMessage(fieldNumber, value.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int fieldNumber, Object value) throws IOException {
        if (value instanceof ByteString) {
            this.output.writeRawMessageSetExtension(fieldNumber, (ByteString) value);
        } else {
            this.output.writeMessageSetExtension(fieldNumber, (MessageLite) value);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int fieldNumber, int value) throws IOException {
        this.output.writeSFixed32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof IntArrayList) {
            writeSFixed32ListInternal(fieldNumber, (IntArrayList) value, packed);
        } else {
            writeSFixed32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int fieldNumber, long value) throws IOException {
        this.output.writeSFixed64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof LongArrayList) {
            writeSFixed64ListInternal(fieldNumber, (LongArrayList) value, packed);
        } else {
            writeSFixed64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int fieldNumber, int value) throws IOException {
        this.output.writeSInt32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof IntArrayList) {
            writeSInt32ListInternal(fieldNumber, (IntArrayList) value, packed);
        } else {
            writeSInt32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int fieldNumber, long value) throws IOException {
        this.output.writeSInt64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof LongArrayList) {
            writeSInt64ListInternal(fieldNumber, (LongArrayList) value, packed);
        } else {
            writeSInt64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeStartGroup(int fieldNumber) throws IOException {
        this.output.writeTag(fieldNumber, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int fieldNumber, String value) throws IOException {
        this.output.writeString(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int fieldNumber, List<String> value) throws IOException {
        int i11 = 0;
        if (!(value instanceof LazyStringList)) {
            while (i11 < value.size()) {
                this.output.writeString(fieldNumber, value.get(i11));
                i11++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) value;
            while (i11 < value.size()) {
                writeLazyString(fieldNumber, lazyStringList.getRaw(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int fieldNumber, int value) throws IOException {
        this.output.writeUInt32(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        if (value instanceof IntArrayList) {
            writeUInt32ListInternal(fieldNumber, (IntArrayList) value, packed);
        } else {
            writeUInt32ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int fieldNumber, long value) throws IOException {
        this.output.writeUInt64(fieldNumber, value);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        if (value instanceof LongArrayList) {
            writeUInt64ListInternal(fieldNumber, (LongArrayList) value, packed);
        } else {
            writeUInt64ListInternal(fieldNumber, value, packed);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int fieldNumber, Object value, Schema schema) throws IOException {
        this.output.writeGroup(fieldNumber, (MessageLite) value, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int fieldNumber, Object value, Schema schema) throws IOException {
        this.output.writeMessage(fieldNumber, (MessageLite) value, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int fieldNumber, List<?> value, Schema schema) throws IOException {
        for (int i11 = 0; i11 < value.size(); i11++) {
            writeGroup(fieldNumber, value.get(i11), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int fieldNumber, List<?> value, Schema schema) throws IOException {
        for (int i11 = 0; i11 < value.size(); i11++) {
            writeMessage(fieldNumber, value.get(i11), schema);
        }
    }

    private void writeBoolListInternal(int fieldNumber, List<Boolean> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeBoolSizeNoTag(value.get(i13).booleanValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeBoolNoTag(value.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeBool(fieldNumber, value.get(i11).booleanValue());
            i11++;
        }
    }

    private void writeDoubleListInternal(int fieldNumber, List<Double> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeDoubleSizeNoTag(value.get(i13).doubleValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeDoubleNoTag(value.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeDouble(fieldNumber, value.get(i11).doubleValue());
            i11++;
        }
    }

    private void writeEnumListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeEnumSizeNoTag(value.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeEnumNoTag(value.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeEnum(fieldNumber, value.get(i11).intValue());
            i11++;
        }
    }

    private void writeFixed32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeFixed32SizeNoTag(value.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeFixed32NoTag(value.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeFixed32(fieldNumber, value.get(i11).intValue());
            i11++;
        }
    }

    private void writeFixed64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeFixed64SizeNoTag(value.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeFixed64NoTag(value.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeFixed64(fieldNumber, value.get(i11).longValue());
            i11++;
        }
    }

    private void writeFloatListInternal(int fieldNumber, List<Float> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeFloatSizeNoTag(value.get(i13).floatValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeFloatNoTag(value.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeFloat(fieldNumber, value.get(i11).floatValue());
            i11++;
        }
    }

    private void writeInt32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeInt32SizeNoTag(value.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeInt32NoTag(value.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeInt32(fieldNumber, value.get(i11).intValue());
            i11++;
        }
    }

    private void writeInt64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeInt64SizeNoTag(value.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeInt64NoTag(value.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeInt64(fieldNumber, value.get(i11).longValue());
            i11++;
        }
    }

    private void writeSFixed32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeSFixed32SizeNoTag(value.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeSFixed32NoTag(value.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeSFixed32(fieldNumber, value.get(i11).intValue());
            i11++;
        }
    }

    private void writeSFixed64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeSFixed64SizeNoTag(value.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeSFixed64NoTag(value.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeSFixed64(fieldNumber, value.get(i11).longValue());
            i11++;
        }
    }

    private void writeSInt64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeSInt64SizeNoTag(value.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeSInt64NoTag(value.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeSInt64(fieldNumber, value.get(i11).longValue());
            i11++;
        }
    }

    private void writeUInt64ListInternal(int fieldNumber, List<Long> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeUInt64SizeNoTag(value.get(i13).longValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeUInt64NoTag(value.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeUInt64(fieldNumber, value.get(i11).longValue());
            i11++;
        }
    }

    public void writeSInt32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeSInt32SizeNoTag(value.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeSInt32NoTag(value.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeSInt32(fieldNumber, value.get(i11).intValue());
            i11++;
        }
    }

    public void writeUInt32ListInternal(int fieldNumber, List<Integer> value, boolean packed) throws IOException {
        int i11 = 0;
        if (packed) {
            this.output.writeTag(fieldNumber, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < value.size(); i13++) {
                i12 += CodedOutputStream.computeUInt32SizeNoTag(value.get(i13).intValue());
            }
            this.output.writeUInt32NoTag(i12);
            while (i11 < value.size()) {
                this.output.writeUInt32NoTag(value.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < value.size()) {
            this.output.writeUInt32(fieldNumber, value.get(i11).intValue());
            i11++;
        }
    }
}
