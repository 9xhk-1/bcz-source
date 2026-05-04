package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ByteBufferReadWriteBuf implements ReadWriteBuf {
    private final ByteBuffer buffer;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i11) {
        return this.buffer.get(i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i11) {
        return get(i11) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i11) {
        return this.buffer.getDouble(i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i11) {
        return this.buffer.getFloat(i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i11) {
        return this.buffer.getInt(i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i11) {
        return this.buffer.getLong(i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i11) {
        return this.buffer.getShort(i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i11, int i12) {
        return Utf8Safe.decodeUtf8Buffer(this.buffer, i11, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.buffer.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i11, int i12) {
        this.buffer.put(bArr, i11, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z11) {
        this.buffer.put(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d11) {
        this.buffer.putDouble(d11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f11) {
        this.buffer.putFloat(f11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i11) {
        this.buffer.putInt(i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j11) {
        this.buffer.putLong(j11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s11) {
        this.buffer.putShort(s11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i11) {
        return i11 <= this.buffer.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i11, byte b11) {
        requestCapacity(i11 + 1);
        this.buffer.put(i11, b11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i11, boolean z11) {
        set(i11, z11 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i11, double d11) {
        requestCapacity(i11 + 8);
        this.buffer.putDouble(i11, d11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i11, float f11) {
        requestCapacity(i11 + 4);
        this.buffer.putFloat(i11, f11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i11, int i12) {
        requestCapacity(i11 + 4);
        this.buffer.putInt(i11, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i11, long j11) {
        requestCapacity(i11 + 8);
        this.buffer.putLong(i11, j11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i11, short s11) {
        requestCapacity(i11 + 2);
        this.buffer.putShort(i11, s11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.buffer.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b11) {
        this.buffer.put(b11);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i11, byte[] bArr, int i12, int i13) {
        requestCapacity((i13 - i12) + i11);
        int position = this.buffer.position();
        this.buffer.position(i11);
        this.buffer.put(bArr, i12, i13);
        this.buffer.position(position);
    }
}
