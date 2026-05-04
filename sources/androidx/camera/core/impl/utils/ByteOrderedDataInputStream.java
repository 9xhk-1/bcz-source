package androidx.camera.core.impl.utils;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

    public ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mDataInputStream.available();
    }

    public int getLength() {
        return this.mLength;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i11);
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int i11 = this.mPosition + 1;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.mPosition + i12;
        this.mPosition = i13;
        if (i13 > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, i11, i12) != i12) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i11 = this.mPosition + 4;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i11 = this.mPosition + 8;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        int read5 = this.mDataInputStream.read();
        int read6 = this.mDataInputStream.read();
        int read7 = this.mDataInputStream.read();
        int read8 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i11 = this.mPosition + 2;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    public long readUnsignedInt() throws IOException {
        return readInt() & 4294967295L;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i11 = this.mPosition + 2;
        this.mPosition = i11;
        if (i11 > this.mLength) {
            throw new EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    public void seek(long j11) throws IOException {
        int i11 = this.mPosition;
        if (i11 > j11) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j11 -= i11;
        }
        int i12 = (int) j11;
        if (skipBytes(i12) != i12) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i11) throws IOException {
        int min = Math.min(i11, this.mLength - this.mPosition);
        int i12 = 0;
        while (i12 < min) {
            i12 += this.mDataInputStream.skipBytes(min - i12);
        }
        this.mPosition += i12;
        return i12;
    }

    public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int available = dataInputStream.available();
        this.mLength = available;
        this.mPosition = 0;
        dataInputStream.mark(available);
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int read = this.mDataInputStream.read(bArr, i11, i12);
        this.mPosition += read;
        return read;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length <= this.mLength) {
            if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public ByteOrderedDataInputStream(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
