package androidx.emoji2.text.flatbuffer;

import ho.c;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i11) {
        return this.buffer[i11];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i11) {
        return this.buffer[i11] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i11) {
        return Double.longBitsToDouble(getLong(i11));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i11) {
        return Float.intBitsToFloat(getInt(i11));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i11) {
        byte[] bArr = this.buffer;
        return (bArr[i11] & 255) | (bArr[i11 + 3] << c.B) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i11) {
        byte[] bArr = this.buffer;
        int i12 = i11 + 6;
        return (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i12] & 255) << 48) | (bArr[i11 + 7] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i11) {
        byte[] bArr = this.buffer;
        return (short) ((bArr[i11] & 255) | (bArr[i11 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i11, int i12) {
        return Utf8Safe.decodeUtf8Array(this.buffer, i11, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.writePos;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i11, int i12) {
        set(this.writePos, bArr, i11, i12);
        this.writePos += i12;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z11) {
        setBoolean(this.writePos, z11);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d11) {
        setDouble(this.writePos, d11);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f11) {
        setFloat(this.writePos, f11);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i11) {
        setInt(this.writePos, i11);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j11) {
        setLong(this.writePos, j11);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s11) {
        setShort(this.writePos, s11);
        this.writePos += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i11) {
        byte[] bArr = this.buffer;
        if (bArr.length > i11) {
            return true;
        }
        int length = bArr.length;
        this.buffer = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i11, byte b11) {
        requestCapacity(i11 + 1);
        this.buffer[i11] = b11;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i11, boolean z11) {
        set(i11, z11 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i11, double d11) {
        requestCapacity(i11 + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d11);
        int i12 = (int) doubleToRawLongBits;
        byte[] bArr = this.buffer;
        bArr[i11] = (byte) (i12 & 255);
        bArr[i11 + 1] = (byte) ((i12 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i12 >> 16) & 255);
        bArr[i11 + 3] = (byte) ((i12 >> 24) & 255);
        int i13 = (int) (doubleToRawLongBits >> 32);
        bArr[i11 + 4] = (byte) (i13 & 255);
        bArr[i11 + 5] = (byte) ((i13 >> 8) & 255);
        bArr[i11 + 6] = (byte) ((i13 >> 16) & 255);
        bArr[i11 + 7] = (byte) ((i13 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i11, float f11) {
        requestCapacity(i11 + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f11);
        byte[] bArr = this.buffer;
        bArr[i11] = (byte) (floatToRawIntBits & 255);
        bArr[i11 + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i11 + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i11 + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i11, int i12) {
        requestCapacity(i11 + 4);
        byte[] bArr = this.buffer;
        bArr[i11] = (byte) (i12 & 255);
        bArr[i11 + 1] = (byte) ((i12 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i12 >> 16) & 255);
        bArr[i11 + 3] = (byte) ((i12 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i11, long j11) {
        requestCapacity(i11 + 8);
        int i12 = (int) j11;
        byte[] bArr = this.buffer;
        bArr[i11] = (byte) (i12 & 255);
        bArr[i11 + 1] = (byte) ((i12 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i12 >> 16) & 255);
        bArr[i11 + 3] = (byte) ((i12 >> 24) & 255);
        int i13 = (int) (j11 >> 32);
        bArr[i11 + 4] = (byte) (i13 & 255);
        bArr[i11 + 5] = (byte) ((i13 >> 8) & 255);
        bArr[i11 + 6] = (byte) ((i13 >> 16) & 255);
        bArr[i11 + 7] = (byte) ((i13 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i11, short s11) {
        requestCapacity(i11 + 2);
        byte[] bArr = this.buffer;
        bArr[i11] = (byte) (s11 & 255);
        bArr[i11 + 1] = (byte) ((s11 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.writePos;
    }

    public ArrayReadWriteBuf(int i11) {
        this(new byte[i11]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.buffer = bArr;
        this.writePos = 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b11) {
        set(this.writePos, b11);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i11, byte[] bArr, int i12, int i13) {
        requestCapacity((i13 - i12) + i11);
        System.arraycopy(bArr, i12, this.buffer, i11, i13);
    }

    public ArrayReadWriteBuf(byte[] bArr, int i11) {
        this.buffer = bArr;
        this.writePos = i11;
    }
}
