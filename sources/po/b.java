package po;

import java.io.DataInput;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public interface b extends DataInput {
    @Override // java.io.DataInput
    @uo.a
    boolean readBoolean();

    @Override // java.io.DataInput
    @uo.a
    byte readByte();

    @Override // java.io.DataInput
    @uo.a
    char readChar();

    @Override // java.io.DataInput
    @uo.a
    double readDouble();

    @Override // java.io.DataInput
    @uo.a
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] b11);

    @Override // java.io.DataInput
    void readFully(byte[] b11, int off, int len);

    @Override // java.io.DataInput
    @uo.a
    int readInt();

    @Override // java.io.DataInput
    @CheckForNull
    @uo.a
    String readLine();

    @Override // java.io.DataInput
    @uo.a
    long readLong();

    @Override // java.io.DataInput
    @uo.a
    short readShort();

    @Override // java.io.DataInput
    @uo.a
    String readUTF();

    @Override // java.io.DataInput
    @uo.a
    int readUnsignedByte();

    @Override // java.io.DataInput
    @uo.a
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int n11);
}
