package org.apache.thrift.transport;

import en.r;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TStandardFile implements TSeekableFile {
    protected RandomAccessFile inputFile_;
    protected String path_;

    public TStandardFile(String str) throws IOException {
        this.inputFile_ = null;
        this.path_ = str;
        this.inputFile_ = new RandomAccessFile(this.path_, r.f50027a);
    }

    @Override // org.apache.thrift.transport.TSeekableFile
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.inputFile_;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // org.apache.thrift.transport.TSeekableFile
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.inputFile_.getFD());
    }

    @Override // org.apache.thrift.transport.TSeekableFile
    public OutputStream getOutputStream() throws IOException {
        return new FileOutputStream(this.path_);
    }

    @Override // org.apache.thrift.transport.TSeekableFile
    public long length() throws IOException {
        return this.inputFile_.length();
    }

    @Override // org.apache.thrift.transport.TSeekableFile
    public void seek(long j11) throws IOException {
        this.inputFile_.seek(j11);
    }
}
