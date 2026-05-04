package org.apache.thrift.transport;

import en.r;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class TSimpleFileTransport extends TTransport {
    private RandomAccessFile file;
    private String path_;
    private boolean readable;
    private boolean writable;

    public TSimpleFileTransport(String str, boolean z11, boolean z12, boolean z13) throws TTransportException {
        this.file = null;
        if (str.length() <= 0) {
            throw new TTransportException("No path specified");
        }
        if (!z11 && !z12) {
            throw new TTransportException("Neither READ nor WRITE specified");
        }
        this.readable = z11;
        this.writable = z12;
        this.path_ = str;
        if (z13) {
            open();
        }
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception unused) {
            }
            this.file = null;
        }
    }

    public long getFilePointer() throws TTransportException {
        try {
            return this.file.getFilePointer();
        } catch (IOException e11) {
            throw new TTransportException(e11.getMessage());
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return this.file != null;
    }

    public long length() throws TTransportException {
        try {
            return this.file.length();
        } catch (IOException e11) {
            throw new TTransportException(e11.getMessage());
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        if (this.file == null) {
            try {
                String str = r.f50027a;
                if (this.writable) {
                    str = r.f50027a + "w";
                }
                this.file = new RandomAccessFile(this.path_, str);
            } catch (IOException e11) {
                this.file = null;
                throw new TTransportException(e11.getMessage());
            }
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        if (!this.readable) {
            throw new TTransportException("Read operation on write only file");
        }
        try {
            return this.file.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.file = null;
            throw new TTransportException(e11.getMessage());
        }
    }

    public void seek(long j11) throws TTransportException {
        try {
            this.file.seek(j11);
        } catch (IOException e11) {
            throw new TTransportException(e11.getMessage());
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        try {
            this.file.write(bArr, i11, i12);
        } catch (IOException e11) {
            this.file = null;
            throw new TTransportException(e11.getMessage());
        }
    }

    public TSimpleFileTransport(String str, boolean z11, boolean z12) throws TTransportException {
        this(str, z11, z12, true);
    }

    public TSimpleFileTransport(String str) throws TTransportException {
        this(str, true, false, true);
    }
}
