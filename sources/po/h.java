package po;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class h extends Reader {

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public CharSequence f81049a;

    /* renamed from: b, reason: collision with root package name */
    public int f81050b;

    /* renamed from: c, reason: collision with root package name */
    public int f81051c;

    public h(CharSequence seq) {
        this.f81049a = (CharSequence) Preconditions.checkNotNull(seq);
    }

    public final void a() throws IOException {
        if (this.f81049a == null) {
            throw new IOException("reader closed");
        }
    }

    public final boolean c() {
        return e() > 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f81049a = null;
    }

    public final int e() {
        Objects.requireNonNull(this.f81049a);
        return this.f81049a.length() - this.f81050b;
    }

    @Override // java.io.Reader
    public synchronized void mark(int readAheadLimit) throws IOException {
        Preconditions.checkArgument(readAheadLimit >= 0, "readAheadLimit (%s) may not be negative", readAheadLimit);
        a();
        this.f81051c = this.f81050b;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer target) throws IOException {
        Preconditions.checkNotNull(target);
        a();
        Objects.requireNonNull(this.f81049a);
        if (!c()) {
            return -1;
        }
        int min = Math.min(target.remaining(), e());
        for (int i11 = 0; i11 < min; i11++) {
            CharSequence charSequence = this.f81049a;
            int i12 = this.f81050b;
            this.f81050b = i12 + 1;
            target.put(charSequence.charAt(i12));
        }
        return min;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        a();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        a();
        this.f81050b = this.f81051c;
    }

    @Override // java.io.Reader
    public synchronized long skip(long n11) throws IOException {
        int min;
        Preconditions.checkArgument(n11 >= 0, "n (%s) may not be negative", n11);
        a();
        min = (int) Math.min(e(), n11);
        this.f81050b += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        char c11;
        a();
        Objects.requireNonNull(this.f81049a);
        if (c()) {
            CharSequence charSequence = this.f81049a;
            int i11 = this.f81050b;
            this.f81050b = i11 + 1;
            c11 = charSequence.charAt(i11);
        } else {
            c11 = 65535;
        }
        return c11;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cbuf, int off, int len) throws IOException {
        Preconditions.checkPositionIndexes(off, off + len, cbuf.length);
        a();
        Objects.requireNonNull(this.f81049a);
        if (!c()) {
            return -1;
        }
        int min = Math.min(len, e());
        for (int i11 = 0; i11 < min; i11++) {
            CharSequence charSequence = this.f81049a;
            int i12 = this.f81050b;
            this.f81050b = i12 + 1;
            cbuf[off + i11] = charSequence.charAt(i12);
        }
        return min;
    }
}
