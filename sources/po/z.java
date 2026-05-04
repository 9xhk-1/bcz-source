package po;

import com.google.common.base.Preconditions;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class z extends FilterInputStream implements DataInput {
    public z(InputStream in2) {
        super((InputStream) Preconditions.checkNotNull(in2));
    }

    public final byte a() throws IOException, EOFException {
        int read = ((FilterInputStream) this).in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @uo.a
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @uo.a
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @uo.a
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @uo.a
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @uo.a
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b11) throws IOException {
        g.p(this, b11);
    }

    @Override // java.io.DataInput
    @uo.a
    public int readInt() throws IOException {
        byte a11 = a();
        byte a12 = a();
        return ro.i.l(a(), a(), a12, a11);
    }

    @Override // java.io.DataInput
    @uo.a
    @uo.e("Always throws UnsupportedOperationException")
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @uo.a
    public long readLong() throws IOException {
        byte a11 = a();
        byte a12 = a();
        byte a13 = a();
        byte a14 = a();
        byte a15 = a();
        byte a16 = a();
        return ro.k.k(a(), a(), a16, a15, a14, a13, a12, a11);
    }

    @Override // java.io.DataInput
    @uo.a
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @uo.a
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @uo.a
    public int readUnsignedByte() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @uo.a
    public int readUnsignedShort() throws IOException {
        return ro.i.l((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public int skipBytes(int n11) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(n11);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b11, int off, int len) throws IOException {
        g.q(this, b11, off, len);
    }
}
