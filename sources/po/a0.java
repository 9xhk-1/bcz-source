package po;

import com.google.common.base.Preconditions;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class a0 extends FilterOutputStream implements DataOutput {
    public a0(OutputStream out) {
        super(new DataOutputStream((OutputStream) Preconditions.checkNotNull(out)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] b11, int off, int len) throws IOException {
        ((FilterOutputStream) this).out.write(b11, off, len);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean v11) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(v11);
    }

    @Override // java.io.DataOutput
    public void writeByte(int v11) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(v11);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String s11) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(s11);
    }

    @Override // java.io.DataOutput
    public void writeChar(int v11) throws IOException {
        writeShort(v11);
    }

    @Override // java.io.DataOutput
    public void writeChars(String s11) throws IOException {
        for (int i11 = 0; i11 < s11.length(); i11++) {
            writeChar(s11.charAt(i11));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double v11) throws IOException {
        writeLong(Double.doubleToLongBits(v11));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float v11) throws IOException {
        writeInt(Float.floatToIntBits(v11));
    }

    @Override // java.io.DataOutput
    public void writeInt(int v11) throws IOException {
        ((FilterOutputStream) this).out.write(v11 & 255);
        ((FilterOutputStream) this).out.write((v11 >> 8) & 255);
        ((FilterOutputStream) this).out.write((v11 >> 16) & 255);
        ((FilterOutputStream) this).out.write((v11 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long v11) throws IOException {
        byte[] D = ro.k.D(Long.reverseBytes(v11));
        write(D, 0, D.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int v11) throws IOException {
        ((FilterOutputStream) this).out.write(v11 & 255);
        ((FilterOutputStream) this).out.write((v11 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
