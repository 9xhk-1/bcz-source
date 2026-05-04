package po;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class b0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public Iterator<? extends f> f81010a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public InputStream f81011b;

    public b0(Iterator<? extends f> it) throws IOException {
        this.f81010a = (Iterator) Preconditions.checkNotNull(it);
        a();
    }

    public final void a() throws IOException {
        close();
        if (this.f81010a.hasNext()) {
            this.f81011b = this.f81010a.next().m();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f81011b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f81011b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f81011b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f81011b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public long skip(long n11) throws IOException {
        InputStream inputStream = this.f81011b;
        if (inputStream == null || n11 <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(n11);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f81011b.skip(n11 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] b11, int off, int len) throws IOException {
        Preconditions.checkNotNull(b11);
        while (true) {
            InputStream inputStream = this.f81011b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(b11, off, len);
            if (read != -1) {
                return read;
            }
            a();
        }
    }
}
