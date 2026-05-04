package org.apache.thrift.transport;

import java.io.UnsupportedEncodingException;
import org.apache.thrift.TByteArrayOutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TMemoryBuffer extends TTransport {
    private TByteArrayOutputStream arr_;
    private int pos_;

    public TMemoryBuffer(int i11) {
        this.arr_ = new TByteArrayOutputStream(i11);
    }

    public byte[] getArray() {
        return this.arr_.get();
    }

    public String inspect() {
        StringBuilder sb2 = new StringBuilder();
        byte[] byteArray = this.arr_.toByteArray();
        int i11 = 0;
        while (i11 < byteArray.length) {
            sb2.append(this.pos_ == i11 ? "==>" : "");
            sb2.append(Integer.toHexString(byteArray[i11] & 255));
            sb2.append(" ");
            i11++;
        }
        return sb2.toString();
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    public int length() {
        return this.arr_.size();
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.arr_.get();
        if (i12 > this.arr_.len() - this.pos_) {
            i12 = this.arr_.len() - this.pos_;
        }
        if (i12 > 0) {
            System.arraycopy(bArr2, this.pos_, bArr, i11, i12);
            this.pos_ += i12;
        }
        return i12;
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return this.arr_.toString(str);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) {
        this.arr_.write(bArr, i11, i12);
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() {
    }
}
