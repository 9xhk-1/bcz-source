package com.getui.gtc.base.http;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class BufferedSink {
    public final OutputStream sink;
    private long size;

    public BufferedSink(OutputStream outputStream) {
        if (outputStream == null) {
            throw new NullPointerException("sink == null");
        }
        this.sink = outputStream;
        this.size = 0L;
    }

    public final void close() throws IOException {
        this.sink.close();
    }

    public final long size() {
        return this.size;
    }

    public final BufferedSink write(String str) throws IOException {
        this.sink.write(str.getBytes());
        this.size += r5.length;
        return this;
    }

    public final BufferedSink writeLong(long j11) throws IOException {
        this.sink.write(String.valueOf(j11).getBytes());
        this.size += r3.length;
        return this;
    }

    public final BufferedSink writeUtf8(String str) throws IOException {
        this.sink.write(str.getBytes());
        this.size += r5.length;
        return this;
    }

    public final BufferedSink write(ByteBuffer byteBuffer) throws IOException {
        this.sink.write(byteBuffer.array());
        this.size += r5.length;
        return this;
    }

    public final BufferedSink write(byte[] bArr) throws IOException {
        this.sink.write(bArr);
        this.size += bArr.length;
        return this;
    }
}
