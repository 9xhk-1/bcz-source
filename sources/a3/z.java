package a3;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class z extends FilterInputStream implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public DataInputStream f1729a;

    public z(InputStream inputStream) {
        super(inputStream);
        this.f1729a = new DataInputStream(inputStream);
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        return this.f1729a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        return this.f1729a.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return this.f1729a.readChar();
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
    public void readFully(byte[] bArr) throws IOException {
        this.f1729a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int[] iArr = new int[4];
        for (int i11 = 3; i11 >= 0; i11--) {
            iArr[i11] = this.f1729a.read();
        }
        return (iArr[3] & 255) | ((iArr[0] & 255) << 24) | ((iArr[1] & 255) << 16) | ((iArr[2] & 255) << 8);
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        return this.f1729a.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int[] iArr = new int[8];
        for (int i11 = 7; i11 >= 0; i11--) {
            iArr[i11] = this.f1729a.read();
        }
        return (iArr[7] & 255) | ((iArr[0] & 255) << 56) | ((iArr[1] & 255) << 48) | ((iArr[2] & 255) << 40) | ((iArr[3] & 255) << 32) | ((iArr[4] & 255) << 24) | ((iArr[5] & 255) << 16) | ((iArr[6] & 255) << 8);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        return (short) ((this.f1729a.read() & 255) | (this.f1729a.read() << 8));
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        return this.f1729a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        return this.f1729a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return (this.f1729a.read() & 255) | ((this.f1729a.read() & 255) << 8);
    }

    @Override // java.io.DataInput
    public int skipBytes(int i11) throws IOException {
        return this.f1729a.skipBytes(i11);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i11, int i12) throws IOException {
        this.f1729a.readFully(bArr, i11, i12);
    }
}
