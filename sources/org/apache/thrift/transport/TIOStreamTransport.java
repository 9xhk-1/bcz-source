package org.apache.thrift.transport;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TIOStreamTransport extends TTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TIOStreamTransport.class.getName());
    protected InputStream inputStream_;
    protected OutputStream outputStream_;

    public TIOStreamTransport() {
        this.inputStream_ = null;
        this.outputStream_ = null;
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.inputStream_;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                LOGGER.warn("Error closing input stream.", (Throwable) e11);
            }
            this.inputStream_ = null;
        }
        OutputStream outputStream = this.outputStream_;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e12) {
                LOGGER.warn("Error closing output stream.", (Throwable) e12);
            }
            this.outputStream_ = null;
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void flush() throws TTransportException {
        OutputStream outputStream = this.outputStream_;
        if (outputStream == null) {
            throw new TTransportException(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e11) {
            throw new TTransportException(0, e11);
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        InputStream inputStream = this.inputStream_;
        if (inputStream == null) {
            throw new TTransportException(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i11, i12);
            if (read >= 0) {
                return read;
            }
            throw new TTransportException(4);
        } catch (IOException e11) {
            throw new TTransportException(0, e11);
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        OutputStream outputStream = this.outputStream_;
        if (outputStream == null) {
            throw new TTransportException(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i11, i12);
        } catch (IOException e11) {
            throw new TTransportException(0, e11);
        }
    }

    public TIOStreamTransport(InputStream inputStream) {
        this.outputStream_ = null;
        this.inputStream_ = inputStream;
    }

    public TIOStreamTransport(OutputStream outputStream) {
        this.inputStream_ = null;
        this.outputStream_ = outputStream;
    }

    public TIOStreamTransport(InputStream inputStream, OutputStream outputStream) {
        this.inputStream_ = inputStream;
        this.outputStream_ = outputStream;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
    }
}
