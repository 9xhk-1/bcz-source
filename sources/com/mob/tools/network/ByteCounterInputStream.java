package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class ByteCounterInputStream extends InputStream implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f41310a;

    /* renamed from: b, reason: collision with root package name */
    private long f41311b;

    /* renamed from: c, reason: collision with root package name */
    private OnReadListener f41312c;

    public ByteCounterInputStream(InputStream inputStream) {
        this.f41310a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f41310a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41310a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f41310a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f41310a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f41310a.read();
        if (read >= 0) {
            long j11 = this.f41311b + 1;
            this.f41311b = j11;
            OnReadListener onReadListener = this.f41312c;
            if (onReadListener != null) {
                onReadListener.onRead(j11);
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f41310a.reset();
        this.f41311b = 0L;
    }

    public void setOnInputStreamReadListener(OnReadListener onReadListener) {
        this.f41312c = onReadListener;
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        return this.f41310a.skip(j11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int read = this.f41310a.read(bArr, i11, i12);
        if (read > 0) {
            long j11 = this.f41311b + read;
            this.f41311b = j11;
            OnReadListener onReadListener = this.f41312c;
            if (onReadListener != null) {
                onReadListener.onRead(j11);
            }
        }
        return read;
    }
}
