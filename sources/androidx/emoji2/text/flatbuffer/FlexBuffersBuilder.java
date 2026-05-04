package androidx.emoji2.text.flatbuffer;

import androidx.collection.SieveCacheKt;
import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;

    /* renamed from: bb, reason: collision with root package name */
    private final ReadWriteBuf f4378bb;
    private boolean finished;
    private final int flags;
    private Comparator<Value> keyComparator;
    private final HashMap<String, Integer> keyPool;
    private final ArrayList<Value> stack;
    private final HashMap<String, Integer> stringPool;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        public Value(int i11, int i12, int i13, long j11) {
            this.key = i11;
            this.type = i12;
            this.minBitWidth = i13;
            this.iValue = j11;
            this.dValue = Double.MIN_VALUE;
        }

        public static Value blob(int i11, int i12, int i13, int i14) {
            return new Value(i11, i13, i14, i12);
        }

        public static Value bool(int i11, boolean z11) {
            return new Value(i11, 26, 0, z11 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i11, int i12) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, i11, i12);
        }

        public static Value float32(int i11, float f11) {
            return new Value(i11, 3, 2, f11);
        }

        public static Value float64(int i11, double d11) {
            return new Value(i11, 3, 3, d11);
        }

        public static Value int16(int i11, int i12) {
            return new Value(i11, 1, 1, i12);
        }

        public static Value int32(int i11, int i12) {
            return new Value(i11, 1, 2, i12);
        }

        public static Value int64(int i11, long j11) {
            return new Value(i11, 1, 3, j11);
        }

        public static Value int8(int i11, int i12) {
            return new Value(i11, 1, 0, i12);
        }

        private static byte packedType(int i11, int i12) {
            return (byte) (i11 | (i12 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i11, int i12) {
            return ((~i11) + 1) & (i12 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i11) {
            return FlexBuffers.isTypeInline(this.type) ? Math.max(this.minBitWidth, i11) : this.minBitWidth;
        }

        public static Value uInt16(int i11, int i12) {
            return new Value(i11, 2, 1, i12);
        }

        public static Value uInt32(int i11, int i12) {
            return new Value(i11, 2, 2, i12);
        }

        public static Value uInt64(int i11, long j11) {
            return new Value(i11, 2, 3, j11);
        }

        public static Value uInt8(int i11, int i12) {
            return new Value(i11, 2, 0, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i11, int i12, long j11, int i13, int i14) {
            if (FlexBuffers.isTypeInline(i11)) {
                return i12;
            }
            for (int i15 = 1; i15 <= 32; i15 *= 2) {
                int widthUInBits = FlexBuffersBuilder.widthUInBits((int) (((paddingBytes(i13, i15) + i13) + (i14 * i15)) - j11));
                if ((1 << widthUInBits) == i15) {
                    return widthUInBits;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i11) {
            return packedType(storedWidth(i11), this.type);
        }

        public Value(int i11, int i12, int i13, double d11) {
            this.key = i11;
            this.type = i12;
            this.minBitWidth = i13;
            this.dValue = d11;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i11) {
        this(new ArrayReadWriteBuf(i11), 1);
    }

    private int align(int i11) {
        int i12 = 1 << i11;
        int paddingBytes = Value.paddingBytes(this.f4378bb.writePosition(), i12);
        while (true) {
            int i13 = paddingBytes - 1;
            if (paddingBytes == 0) {
                return i12;
            }
            this.f4378bb.put((byte) 0);
            paddingBytes = i13;
        }
    }

    private Value createKeyVector(int i11, int i12) {
        long j11 = i12;
        int max = Math.max(0, widthUInBits(j11));
        int i13 = i11;
        while (i13 < this.stack.size()) {
            int i14 = i13 + 1;
            max = Math.max(max, Value.elemWidth(4, 0, this.stack.get(i13).key, this.f4378bb.writePosition(), i14));
            i13 = i14;
        }
        int align = align(max);
        writeInt(j11, align);
        int writePosition = this.f4378bb.writePosition();
        while (i11 < this.stack.size()) {
            int i15 = this.stack.get(i11).key;
            writeOffset(this.stack.get(i11).key, align);
            i11++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), max, writePosition);
    }

    private Value createVector(int i11, int i12, int i13, boolean z11, boolean z12, Value value) {
        int i14;
        int i15;
        int i16 = i13;
        long j11 = i16;
        int max = Math.max(0, widthUInBits(j11));
        if (value != null) {
            max = Math.max(max, value.elemWidth(this.f4378bb.writePosition(), 0));
            i14 = 3;
        } else {
            i14 = 1;
        }
        int i17 = 4;
        int i18 = max;
        for (int i19 = i12; i19 < this.stack.size(); i19++) {
            i18 = Math.max(i18, this.stack.get(i19).elemWidth(this.f4378bb.writePosition(), i19 + i14));
            if (z11 && i19 == i12) {
                i17 = this.stack.get(i19).type;
                if (!FlexBuffers.isTypedVectorElementType(i17)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i21 = i12;
        int align = align(i18);
        if (value != null) {
            writeOffset(value.iValue, align);
            writeInt(1 << value.minBitWidth, align);
        }
        if (!z12) {
            writeInt(j11, align);
        }
        int writePosition = this.f4378bb.writePosition();
        for (int i22 = i21; i22 < this.stack.size(); i22++) {
            writeAny(this.stack.get(i22), align);
        }
        if (!z11) {
            while (i21 < this.stack.size()) {
                this.f4378bb.put(this.stack.get(i21).storedPackedType(i18));
                i21++;
            }
        }
        if (value != null) {
            i15 = 9;
        } else if (z11) {
            if (!z12) {
                i16 = 0;
            }
            i15 = FlexBuffers.toTypedVector(i17, i16);
        } else {
            i15 = 10;
        }
        return new Value(i11, i15, i18, writePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int writePosition = this.f4378bb.writePosition();
        if ((this.flags & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f4378bb.put(bytes, 0, bytes.length);
            this.f4378bb.put((byte) 0);
            this.keyPool.put(str, Integer.valueOf(writePosition));
            return writePosition;
        }
        Integer num = this.keyPool.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f4378bb.put(bytes2, 0, bytes2.length);
        this.f4378bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(writePosition));
        return writePosition;
    }

    public static int widthUInBits(long j11) {
        if (j11 <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j11 <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        return j11 <= FlexBuffers.Unsigned.intToUnsignedLong(-1) ? 2 : 3;
    }

    private void writeAny(Value value, int i11) {
        int i12 = value.type;
        if (i12 != 0 && i12 != 1 && i12 != 2) {
            if (i12 == 3) {
                writeDouble(value.dValue, i11);
                return;
            } else if (i12 != 26) {
                writeOffset(value.iValue, i11);
                return;
            }
        }
        writeInt(value.iValue, i11);
    }

    private Value writeBlob(int i11, byte[] bArr, int i12, boolean z11) {
        int widthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(widthUInBits));
        int writePosition = this.f4378bb.writePosition();
        this.f4378bb.put(bArr, 0, bArr.length);
        if (z11) {
            this.f4378bb.put((byte) 0);
        }
        return Value.blob(i11, writePosition, i12, widthUInBits);
    }

    private void writeDouble(double d11, int i11) {
        if (i11 == 4) {
            this.f4378bb.putFloat((float) d11);
        } else if (i11 == 8) {
            this.f4378bb.putDouble(d11);
        }
    }

    private void writeInt(long j11, int i11) {
        if (i11 == 1) {
            this.f4378bb.put((byte) j11);
            return;
        }
        if (i11 == 2) {
            this.f4378bb.putShort((short) j11);
        } else if (i11 == 4) {
            this.f4378bb.putInt((int) j11);
        } else {
            if (i11 != 8) {
                return;
            }
            this.f4378bb.putLong(j11);
        }
    }

    private void writeOffset(long j11, int i11) {
        writeInt((int) (this.f4378bb.writePosition() - j11), i11);
    }

    private Value writeString(int i11, String str) {
        return writeBlob(i11, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i11) {
        int putKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i11, arrayList.size()), this.keyComparator);
        Value createVector = createVector(putKey, i11, this.stack.size() - i11, false, false, createKeyVector(i11, this.stack.size() - i11));
        while (this.stack.size() > i11) {
            this.stack.remove(r9.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public int endVector(String str, int i11, boolean z11, boolean z12) {
        Value createVector = createVector(putKey(str), i11, this.stack.size() - i11, z11, z12, null);
        while (this.stack.size() > i11) {
            this.stack.remove(r9.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public ByteBuffer finish() {
        int align = align(this.stack.get(0).elemWidth(this.f4378bb.writePosition(), 0));
        writeAny(this.stack.get(0), align);
        this.f4378bb.put(this.stack.get(0).storedPackedType());
        this.f4378bb.put((byte) align);
        this.finished = true;
        return ByteBuffer.wrap(this.f4378bb.data(), 0, this.f4378bb.writePosition());
    }

    public ReadWriteBuf getBuffer() {
        return this.f4378bb;
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z11) {
        putBoolean(null, z11);
    }

    public void putFloat(float f11) {
        putFloat((String) null, f11);
    }

    public void putInt(int i11) {
        putInt((String) null, i11);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i11) {
        putUInt(null, i11);
    }

    public void putUInt64(BigInteger bigInteger) {
        putUInt64(null, bigInteger.longValue());
    }

    public int startMap() {
        return this.stack.size();
    }

    public int startVector() {
        return this.stack.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    private void putUInt64(String str, long j11) {
        this.stack.add(Value.uInt64(putKey(str), j11));
    }

    public int putBlob(String str, byte[] bArr) {
        Value writeBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(writeBlob);
        return (int) writeBlob.iValue;
    }

    public void putBoolean(String str, boolean z11) {
        this.stack.add(Value.bool(putKey(str), z11));
    }

    public void putFloat(String str, float f11) {
        this.stack.add(Value.float32(putKey(str), f11));
    }

    public void putInt(String str, int i11) {
        putInt(str, i11);
    }

    public int putString(String str, String str2) {
        int putKey = putKey(str);
        if ((this.flags & 2) == 0) {
            Value writeString = writeString(putKey, str2);
            this.stack.add(writeString);
            return (int) writeString.iValue;
        }
        Integer num = this.stringPool.get(str2);
        if (num != null) {
            this.stack.add(Value.blob(putKey, num.intValue(), 5, widthUInBits(str2.length())));
            return num.intValue();
        }
        Value writeString2 = writeString(putKey, str2);
        this.stringPool.put(str2, Integer.valueOf((int) writeString2.iValue));
        this.stack.add(writeString2);
        return (int) writeString2.iValue;
    }

    public void putUInt(long j11) {
        putUInt(null, j11);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i11) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i11);
    }

    private void putUInt(String str, long j11) {
        Value uInt64;
        int putKey = putKey(str);
        int widthUInBits = widthUInBits(j11);
        if (widthUInBits == 0) {
            uInt64 = Value.uInt8(putKey, (int) j11);
        } else if (widthUInBits == 1) {
            uInt64 = Value.uInt16(putKey, (int) j11);
        } else if (widthUInBits == 2) {
            uInt64 = Value.uInt32(putKey, (int) j11);
        } else {
            uInt64 = Value.uInt64(putKey, j11);
        }
        this.stack.add(uInt64);
    }

    public void putFloat(double d11) {
        putFloat((String) null, d11);
    }

    public void putInt(String str, long j11) {
        int putKey = putKey(str);
        if (-128 <= j11 && j11 <= 127) {
            this.stack.add(Value.int8(putKey, (int) j11));
            return;
        }
        if (-32768 <= j11 && j11 <= 32767) {
            this.stack.add(Value.int16(putKey, (int) j11));
        } else if (SieveCacheKt.NodeMetaAndPreviousMask <= j11 && j11 <= SieveCacheKt.NodeLinkMask) {
            this.stack.add(Value.int32(putKey, (int) j11));
        } else {
            this.stack.add(Value.int64(putKey, j11));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i11) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public int compare(Value value, Value value2) {
                byte b11;
                byte b12;
                int i12 = value.key;
                int i13 = value2.key;
                do {
                    b11 = FlexBuffersBuilder.this.f4378bb.get(i12);
                    b12 = FlexBuffersBuilder.this.f4378bb.get(i13);
                    if (b11 == 0) {
                        return b11 - b12;
                    }
                    i12++;
                    i13++;
                } while (b11 == b12);
                return b11 - b12;
            }
        };
        this.f4378bb = readWriteBuf;
        this.flags = i11;
    }

    public void putFloat(String str, double d11) {
        this.stack.add(Value.float64(putKey(str), d11));
    }

    public void putInt(long j11) {
        putInt((String) null, j11);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
