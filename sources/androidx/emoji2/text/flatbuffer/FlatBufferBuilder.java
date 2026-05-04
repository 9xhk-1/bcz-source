package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: bb, reason: collision with root package name */
    ByteBuffer f4375bb;
    ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.buf.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i11) {
            return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i11, ByteBufferFactory byteBufferFactory) {
        this(i11, byteBufferFactory, null, Utf8.getDefault());
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    public static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i11 = capacity == 0 ? 1 : capacity << 1;
        byteBuffer.position(0);
        ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i11);
        newByteBuffer.position(newByteBuffer.clear().capacity() - capacity);
        newByteBuffer.put(byteBuffer);
        return newByteBuffer;
    }

    public static boolean isFieldPresent(Table table, int i11) {
        return table.__offset(i11) != 0;
    }

    public void Nested(int i11) {
        if (i11 != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z11) {
        prep(1, 0);
        putBoolean(z11);
    }

    public void addByte(byte b11) {
        prep(1, 0);
        putByte(b11);
    }

    public void addDouble(double d11) {
        prep(8, 0);
        putDouble(d11);
    }

    public void addFloat(float f11) {
        prep(4, 0);
        putFloat(f11);
    }

    public void addInt(int i11) {
        prep(4, 0);
        putInt(i11);
    }

    public void addLong(long j11) {
        prep(8, 0);
        putLong(j11);
    }

    public void addOffset(int i11) {
        prep(4, 0);
        putInt((offset() - i11) + 4);
    }

    public void addShort(short s11) {
        prep(2, 0);
        putShort(s11);
    }

    public void addStruct(int i11, int i12, int i13) {
        if (i12 != i13) {
            Nested(i12);
            slot(i11);
        }
    }

    public void clear() {
        this.space = this.f4375bb.capacity();
        this.f4375bb.clear();
        this.minalign = 1;
        while (true) {
            int i11 = this.vtable_in_use;
            if (i11 <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i12 = i11 - 1;
            this.vtable_in_use = i12;
            iArr[i12] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - length;
        this.space = i11;
        byteBuffer.position(i11);
        this.f4375bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t11, int[] iArr) {
        t11.sortTables(iArr, this.f4375bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int encodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - encodedLength;
        this.space = i11;
        byteBuffer.position(i11);
        this.utf8.encodeUtf8(charSequence, this.f4375bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i11, int i12, int i13) {
        int i14 = i11 * i12;
        startVector(i11, i12, i13);
        ByteBuffer byteBuffer = this.f4375bb;
        int i15 = this.space - i14;
        this.space = i15;
        byteBuffer.position(i15);
        ByteBuffer order = this.f4375bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i14);
        return order;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.f4375bb;
    }

    public int endTable() {
        int i11;
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int offset = offset();
        int i12 = this.vtable_in_use - 1;
        while (i12 >= 0 && this.vtable[i12] == 0) {
            i12--;
        }
        for (int i13 = i12; i13 >= 0; i13--) {
            int i14 = this.vtable[i13];
            addShort((short) (i14 != 0 ? offset - i14 : 0));
        }
        addShort((short) (offset - this.object_start));
        addShort((short) ((i12 + 3) * 2));
        int i15 = 0;
        loop2: while (true) {
            if (i15 >= this.num_vtables) {
                i11 = 0;
                break;
            }
            int capacity = this.f4375bb.capacity() - this.vtables[i15];
            int i16 = this.space;
            short s11 = this.f4375bb.getShort(capacity);
            if (s11 == this.f4375bb.getShort(i16)) {
                for (int i17 = 2; i17 < s11; i17 += 2) {
                    if (this.f4375bb.getShort(capacity + i17) != this.f4375bb.getShort(i16 + i17)) {
                        break;
                    }
                }
                i11 = this.vtables[i15];
                break loop2;
            }
            i15++;
        }
        if (i11 != 0) {
            int capacity2 = this.f4375bb.capacity() - offset;
            this.space = capacity2;
            this.f4375bb.putInt(capacity2, i11 - offset);
        } else {
            int i18 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i18 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i18 * 2);
            }
            int[] iArr2 = this.vtables;
            int i19 = this.num_vtables;
            this.num_vtables = i19 + 1;
            iArr2[i19] = offset();
            ByteBuffer byteBuffer = this.f4375bb;
            byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
        }
        this.nested = false;
        return offset;
    }

    public int endVector() {
        if (!this.nested) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.nested = false;
        putInt(this.vector_num_elems);
        return offset();
    }

    public void finish(int i11, boolean z11) {
        prep(this.minalign, (z11 ? 4 : 0) + 4);
        addOffset(i11);
        if (z11) {
            addInt(this.f4375bb.capacity() - this.space);
        }
        this.f4375bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i11) {
        finish(i11, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z11) {
        this.force_defaults = z11;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.f4375bb = byteBuffer;
        byteBuffer.clear();
        this.f4375bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.f4375bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public void notNested() {
        if (this.nested) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.f4375bb.capacity() - this.space;
    }

    public void pad(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBuffer = this.f4375bb;
            int i13 = this.space - 1;
            this.space = i13;
            byteBuffer.put(i13, (byte) 0);
        }
    }

    public void prep(int i11, int i12) {
        if (i11 > this.minalign) {
            this.minalign = i11;
        }
        int i13 = ((~((this.f4375bb.capacity() - this.space) + i12)) + 1) & (i11 - 1);
        while (this.space < i13 + i11 + i12) {
            int capacity = this.f4375bb.capacity();
            ByteBuffer byteBuffer = this.f4375bb;
            ByteBuffer growByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.f4375bb = growByteBuffer;
            if (byteBuffer != growByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.f4375bb.capacity() - capacity;
        }
        pad(i13);
    }

    public void putBoolean(boolean z11) {
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - 1;
        this.space = i11;
        byteBuffer.put(i11, z11 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b11) {
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - 1;
        this.space = i11;
        byteBuffer.put(i11, b11);
    }

    public void putDouble(double d11) {
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - 8;
        this.space = i11;
        byteBuffer.putDouble(i11, d11);
    }

    public void putFloat(float f11) {
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - 4;
        this.space = i11;
        byteBuffer.putFloat(i11, f11);
    }

    public void putInt(int i11) {
        ByteBuffer byteBuffer = this.f4375bb;
        int i12 = this.space - 4;
        this.space = i12;
        byteBuffer.putInt(i12, i11);
    }

    public void putLong(long j11) {
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - 8;
        this.space = i11;
        byteBuffer.putLong(i11, j11);
    }

    public void putShort(short s11) {
        ByteBuffer byteBuffer = this.f4375bb;
        int i11 = this.space - 2;
        this.space = i11;
        byteBuffer.putShort(i11, s11);
    }

    public void required(int i11, int i12) {
        int capacity = this.f4375bb.capacity() - i11;
        if (this.f4375bb.getShort((capacity - this.f4375bb.getInt(capacity)) + i12) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i12 + " must be set");
    }

    public byte[] sizedByteArray(int i11, int i12) {
        finished();
        byte[] bArr = new byte[i12];
        this.f4375bb.position(i11);
        this.f4375bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer duplicate = this.f4375bb.duplicate();
        duplicate.position(this.space);
        duplicate.limit(this.f4375bb.capacity());
        return new ByteBufferBackedInputStream(duplicate);
    }

    public void slot(int i11) {
        this.vtable[i11] = offset();
    }

    public void startTable(int i11) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i11) {
            this.vtable = new int[i11];
        }
        this.vtable_in_use = i11;
        Arrays.fill(this.vtable, 0, i11, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i11, int i12, int i13) {
        notNested();
        this.vector_num_elems = i12;
        int i14 = i11 * i12;
        prep(4, i14);
        prep(i13, i14);
        this.nested = true;
    }

    public FlatBufferBuilder(int i11, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i11 = i11 <= 0 ? 1 : i11;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.f4375bb = byteBuffer;
            byteBuffer.clear();
            this.f4375bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f4375bb = byteBufferFactory.newByteBuffer(i11);
        }
        this.utf8 = utf8;
        this.space = this.f4375bb.capacity();
    }

    public void addBoolean(int i11, boolean z11, boolean z12) {
        if (this.force_defaults || z11 != z12) {
            addBoolean(z11);
            slot(i11);
        }
    }

    public void addByte(int i11, byte b11, int i12) {
        if (this.force_defaults || b11 != i12) {
            addByte(b11);
            slot(i11);
        }
    }

    public void addDouble(int i11, double d11, double d12) {
        if (this.force_defaults || d11 != d12) {
            addDouble(d11);
            slot(i11);
        }
    }

    public void addFloat(int i11, float f11, double d11) {
        if (this.force_defaults || f11 != d11) {
            addFloat(f11);
            slot(i11);
        }
    }

    public void addInt(int i11, int i12, int i13) {
        if (this.force_defaults || i12 != i13) {
            addInt(i12);
            slot(i11);
        }
    }

    public void addLong(int i11, long j11, long j12) {
        if (this.force_defaults || j11 != j12) {
            addLong(j11);
            slot(i11);
        }
    }

    public void addShort(int i11, short s11, int i12) {
        if (this.force_defaults || s11 != i12) {
            addShort(s11);
            slot(i11);
        }
    }

    public void finishSizePrefixed(int i11, String str) {
        finish(i11, str, true);
    }

    public void addOffset(int i11, int i12, int i13) {
        if (this.force_defaults || i12 != i13) {
            addOffset(i12);
            slot(i11);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.f4375bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i11, int i12) {
        startVector(1, i12, 1);
        ByteBuffer byteBuffer = this.f4375bb;
        int i13 = this.space - i12;
        this.space = i13;
        byteBuffer.position(i13);
        this.f4375bb.put(bArr, i11, i12);
        return endVector();
    }

    public void finish(int i11) {
        finish(i11, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f4375bb;
        int i11 = this.space - remaining;
        this.space = i11;
        byteBuffer2.position(i11);
        this.f4375bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i11, String str, boolean z11) {
        prep(this.minalign, (z11 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i12 = 3; i12 >= 0; i12--) {
                addByte((byte) str.charAt(i12));
            }
            finish(i11, z11);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f4375bb;
        int i11 = this.space - remaining;
        this.space = i11;
        byteBuffer2.position(i11);
        this.f4375bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i11, String str) {
        finish(i11, str, false);
    }

    public FlatBufferBuilder(int i11) {
        this(i11, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i11);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }
}
