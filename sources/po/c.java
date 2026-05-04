package po;

import java.io.DataOutput;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public interface c extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int b11);

    @Override // java.io.DataOutput
    void write(byte[] b11);

    @Override // java.io.DataOutput
    void write(byte[] b11, int off, int len);

    @Override // java.io.DataOutput
    void writeBoolean(boolean v11);

    @Override // java.io.DataOutput
    void writeByte(int v11);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String s11);

    @Override // java.io.DataOutput
    void writeChar(int v11);

    @Override // java.io.DataOutput
    void writeChars(String s11);

    @Override // java.io.DataOutput
    void writeDouble(double v11);

    @Override // java.io.DataOutput
    void writeFloat(float v11);

    @Override // java.io.DataOutput
    void writeInt(int v11);

    @Override // java.io.DataOutput
    void writeLong(long v11);

    @Override // java.io.DataOutput
    void writeShort(int v11);

    @Override // java.io.DataOutput
    void writeUTF(String s11);
}
