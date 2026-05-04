package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.j2;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Blob extends Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        public Blob(ReadBuf readBuf, int i11, int i12) {
            super(readBuf, i11, i12);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f4376bb.data());
            wrap.position(this.end);
            wrap.limit(this.end + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i11) {
            return this.f4376bb.get(this.end + i11);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i11 = 0; i11 < size; i11++) {
                bArr[i11] = this.f4376bb.get(this.end + i11);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.f4376bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f4376bb.getString(this.end, size()));
            sb2.append('\"');
            return sb2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        public Key(ReadBuf readBuf, int i11, int i12) {
            super(readBuf, i11, i12);
        }

        public static Key empty() {
            return EMPTY;
        }

        public int compareTo(byte[] bArr) {
            byte b11;
            byte b12;
            int i11 = this.end;
            int i12 = 0;
            do {
                b11 = this.f4376bb.get(i11);
                b12 = bArr[i12];
                if (b11 == 0) {
                    return b11 - b12;
                }
                i11++;
                i12++;
                if (i12 == bArr.length) {
                    return b11 - b12;
                }
            } while (b11 == b12);
            return b11 - b12;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.end == this.end && key.byteWidth == this.byteWidth;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i11 = this.end;
            while (this.f4376bb.get(i11) != 0) {
                i11++;
            }
            int i12 = this.end;
            return this.f4376bb.getString(i12, i11 - i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class KeyVector {
        private final TypedVector vec;

        public KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i11) {
            if (i11 >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i12 = typedVector.end + (i11 * typedVector.byteWidth);
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.f4376bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i12, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (int i11 = 0; i11 < this.vec.size(); i11++) {
                this.vec.get(i11).toString(sb2);
                if (i11 != this.vec.size() - 1) {
                    sb2.append(j2.O);
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        public Map(ReadBuf readBuf, int i11, int i12) {
            super(readBuf, i11, i12);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                int compareTo = keyVector.get(i12).compareTo(bArr);
                if (compareTo < 0) {
                    i11 = i12 + 1;
                } else {
                    if (compareTo <= 0) {
                        return i12;
                    }
                    size = i12 - 1;
                }
            }
            return -(i11 + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i11 = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.f4376bb;
            int indirect = FlexBuffers.indirect(readBuf, i11, this.byteWidth);
            ReadBuf readBuf2 = this.f4376bb;
            int i12 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, indirect, FlexBuffers.readInt(readBuf2, i11 + i12, i12), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append('\"');
                sb2.append(keys.get(i11).toString());
                sb2.append("\" : ");
                sb2.append(values.get(i11).toString());
                if (i11 != size - 1) {
                    sb2.append(j2.O);
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public Vector values() {
            return new Vector(this.f4376bb, this.end, this.byteWidth);
        }

        public Reference get(byte[] bArr) {
            KeyVector keys = keys();
            int size = keys.size();
            int binarySearch = binarySearch(keys, bArr);
            return (binarySearch < 0 || binarySearch >= size) ? Reference.NULL_REFERENCE : get(binarySearch);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Object {

        /* renamed from: bb, reason: collision with root package name */
        ReadBuf f4376bb;
        int byteWidth;
        int end;

        public Object(ReadBuf readBuf, int i11, int i12) {
            this.f4376bb = readBuf;
            this.end = i11;
            this.byteWidth = i12;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);

        /* renamed from: bb, reason: collision with root package name */
        private ReadBuf f4377bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        public Reference(ReadBuf readBuf, int i11, int i12, int i13) {
            this(readBuf, i11, i12, 1 << (i13 & 3), i13 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.f4377bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f4377bb.get(this.end) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i11 = this.type;
            if (i11 == 3) {
                return FlexBuffers.readDouble(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 1) {
                return FlexBuffers.readInt(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 != 2) {
                if (i11 == 5) {
                    return Double.parseDouble(asString());
                }
                if (i11 == 6) {
                    ReadBuf readBuf = this.f4377bb;
                    return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                }
                if (i11 == 7) {
                    ReadBuf readBuf2 = this.f4377bb;
                    return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                }
                if (i11 == 8) {
                    ReadBuf readBuf3 = this.f4377bb;
                    return FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                if (i11 == 10) {
                    return asVector().size();
                }
                if (i11 != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.readUInt(this.f4377bb, this.end, this.parentWidth);
        }

        public int asInt() {
            int i11 = this.type;
            if (i11 == 1) {
                return FlexBuffers.readInt(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 2) {
                return (int) FlexBuffers.readUInt(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 3) {
                return (int) FlexBuffers.readDouble(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 5) {
                return Integer.parseInt(asString());
            }
            if (i11 == 6) {
                ReadBuf readBuf = this.f4377bb;
                return FlexBuffers.readInt(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i11 == 7) {
                ReadBuf readBuf2 = this.f4377bb;
                return (int) FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i11 == 8) {
                ReadBuf readBuf3 = this.f4377bb;
                return (int) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i11 == 10) {
                return asVector().size();
            }
            if (i11 != 26) {
                return 0;
            }
            return FlexBuffers.readInt(this.f4377bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            ReadBuf readBuf = this.f4377bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public long asLong() {
            int i11 = this.type;
            if (i11 == 1) {
                return FlexBuffers.readLong(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 2) {
                return FlexBuffers.readUInt(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 3) {
                return (long) FlexBuffers.readDouble(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i11 == 6) {
                ReadBuf readBuf = this.f4377bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i11 == 7) {
                ReadBuf readBuf2 = this.f4377bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
            }
            if (i11 == 8) {
                ReadBuf readBuf3 = this.f4377bb;
                return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
            }
            if (i11 == 10) {
                return asVector().size();
            }
            if (i11 != 26) {
                return 0L;
            }
            return FlexBuffers.readInt(this.f4377bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            ReadBuf readBuf = this.f4377bb;
            return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public String asString() {
            if (isString()) {
                int indirect = FlexBuffers.indirect(this.f4377bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.f4377bb;
                int i11 = this.byteWidth;
                return this.f4377bb.getString(indirect, (int) FlexBuffers.readUInt(readBuf, indirect - i11, i11));
            }
            if (!isKey()) {
                return "";
            }
            int indirect2 = FlexBuffers.indirect(this.f4377bb, this.end, this.byteWidth);
            int i12 = indirect2;
            while (this.f4377bb.get(i12) != 0) {
                i12++;
            }
            return this.f4377bb.getString(indirect2, i12 - indirect2);
        }

        public long asUInt() {
            int i11 = this.type;
            if (i11 == 2) {
                return FlexBuffers.readUInt(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 1) {
                return FlexBuffers.readLong(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 3) {
                return (long) FlexBuffers.readDouble(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 10) {
                return asVector().size();
            }
            if (i11 == 26) {
                return FlexBuffers.readInt(this.f4377bb, this.end, this.parentWidth);
            }
            if (i11 == 5) {
                return Long.parseLong(asString());
            }
            if (i11 == 6) {
                ReadBuf readBuf = this.f4377bb;
                return FlexBuffers.readLong(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            if (i11 == 7) {
                ReadBuf readBuf2 = this.f4377bb;
                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
            }
            if (i11 != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f4377bb;
            return (long) FlexBuffers.readDouble(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.f4377bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i11 = this.type;
            if (i11 == 15) {
                ReadBuf readBuf2 = this.f4377bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (!FlexBuffers.isTypedVector(i11)) {
                return Vector.empty();
            }
            ReadBuf readBuf3 = this.f4377bb;
            return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            return this.type == 25;
        }

        public boolean isBoolean() {
            return this.type == 26;
        }

        public boolean isFloat() {
            int i11 = this.type;
            return i11 == 3 || i11 == 8;
        }

        public boolean isInt() {
            int i11 = this.type;
            return i11 == 1 || i11 == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.type == 4;
        }

        public boolean isMap() {
            return this.type == 9;
        }

        public boolean isNull() {
            return this.type == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.type == 5;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i11 = this.type;
            return i11 == 2 || i11 == 7;
        }

        public boolean isVector() {
            int i11 = this.type;
            return i11 == 10 || i11 == 9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i11, int i12, int i13, int i14) {
            this.f4377bb = readBuf;
            this.end = i11;
            this.parentWidth = i12;
            this.byteWidth = i13;
            this.type = i14;
        }

        public StringBuilder toString(StringBuilder sb2) {
            int i11 = this.type;
            if (i11 != 36) {
                switch (i11) {
                    case 0:
                        sb2.append("null");
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(asLong());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(asUInt());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(asFloat());
                        return sb2;
                    case 4:
                        Key asKey = asKey();
                        sb2.append('\"');
                        StringBuilder key = asKey.toString(sb2);
                        key.append('\"');
                        return key;
                    case 5:
                        sb2.append('\"');
                        sb2.append(asString());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return asMap().toString(sb2);
                    case 10:
                        return asVector().toString(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb2);
                    case 26:
                        sb2.append(asBoolean());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(asVector());
            return sb2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Sized extends Object {
        protected final int size;

        public Sized(ReadBuf readBuf, int i11, int i12) {
            super(readBuf, i11, i12);
            this.size = FlexBuffers.readInt(this.f4376bb, i11 - i12, i12);
        }

        public int size() {
            return this.size;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        public TypedVector(ReadBuf readBuf, int i11, int i12, int i13) {
            super(readBuf, i11, i12);
            this.elemType = i13;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i11) {
            if (i11 >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f4376bb, this.end + (i11 * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            return this == EMPTY_VECTOR;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Unsigned {
        public static int byteToUnsignedInt(byte b11) {
            return b11 & 255;
        }

        public static long intToUnsignedLong(int i11) {
            return i11 & 4294967295L;
        }

        public static int shortToUnsignedInt(short s11) {
            return s11 & c2.f100412d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        public Vector(ReadBuf readBuf, int i11, int i12) {
            super(readBuf, i11, i12);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i11) {
            long size = size();
            long j11 = i11;
            if (j11 >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.f4376bb, this.end + (i11 * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.f4376bb.get((int) (this.end + (size * this.byteWidth) + j11))));
        }

        public boolean isEmpty() {
            return this == EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append("[ ");
            int size = size();
            for (int i11 = 0; i11 < size; i11++) {
                get(i11).toString(sb2);
                if (i11 != size - 1) {
                    sb2.append(j2.O);
                }
            }
            sb2.append(" ]");
            return sb2;
        }
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i11, int i12) {
        return (int) (i11 - readUInt(readBuf, i11, i12));
    }

    public static boolean isTypeInline(int i11) {
        return i11 <= 3 || i11 == 26;
    }

    public static boolean isTypedVector(int i11) {
        return (i11 >= 11 && i11 <= 15) || i11 == 36;
    }

    public static boolean isTypedVectorElementType(int i11) {
        return (i11 >= 1 && i11 <= 4) || i11 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i11, int i12) {
        if (i12 == 4) {
            return readBuf.getFloat(i11);
        }
        if (i12 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i11, int i12) {
        return (int) readLong(readBuf, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i11, int i12) {
        int i13;
        if (i12 == 1) {
            i13 = readBuf.get(i11);
        } else if (i12 == 2) {
            i13 = readBuf.getShort(i11);
        } else {
            if (i12 != 4) {
                if (i12 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i11);
            }
            i13 = readBuf.getInt(i11);
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i11, int i12) {
        if (i12 == 1) {
            return Unsigned.byteToUnsignedInt(readBuf.get(i11));
        }
        if (i12 == 2) {
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i11));
        }
        if (i12 == 4) {
            return Unsigned.intToUnsignedLong(readBuf.getInt(i11));
        }
        if (i12 != 8) {
            return -1L;
        }
        return readBuf.getLong(i11);
    }

    public static int toTypedVector(int i11, int i12) {
        if (i12 == 0) {
            return i11 + 10;
        }
        if (i12 == 2) {
            return i11 + 15;
        }
        if (i12 == 3) {
            return i11 + 18;
        }
        if (i12 != 4) {
            return 0;
        }
        return i11 + 21;
    }

    public static int toTypedVectorElementType(int i11) {
        return i11 - 10;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int limit = readBuf.limit();
        byte b11 = readBuf.get(limit - 1);
        int i11 = limit - 2;
        return new Reference(readBuf, i11 - b11, b11, Unsigned.byteToUnsignedInt(readBuf.get(i11)));
    }
}
