package po;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public class c0 extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator<? extends j> f81012a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public Reader f81013b;

    public c0(Iterator<? extends j> readers) throws IOException {
        this.f81012a = readers;
        a();
    }

    public final void a() throws IOException {
        close();
        if (this.f81012a.hasNext()) {
            this.f81013b = this.f81012a.next().m();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f81013b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f81013b = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cbuf, int off, int len) throws IOException {
        Preconditions.checkNotNull(cbuf);
        Reader reader = this.f81013b;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cbuf, off, len);
        if (read != -1) {
            return read;
        }
        a();
        return read(cbuf, off, len);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f81013b;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long n11) throws IOException {
        Preconditions.checkArgument(n11 >= 0, "n is negative");
        if (n11 > 0) {
            while (true) {
                Reader reader = this.f81013b;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(n11);
                if (skip > 0) {
                    return skip;
                }
                a();
            }
        }
        return 0L;
    }
}
