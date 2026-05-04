package po;

import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@q
@go.d
@go.c
/* loaded from: classes7.dex */
public final class r extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final int f81076a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81077b;

    /* renamed from: c, reason: collision with root package name */
    public final f f81078c;

    /* renamed from: d, reason: collision with root package name */
    @vo.a("this")
    public OutputStream f81079d;

    /* renamed from: e, reason: collision with root package name */
    @CheckForNull
    @vo.a("this")
    public c f81080e;

    /* renamed from: f, reason: collision with root package name */
    @CheckForNull
    @vo.a("this")
    public File f81081f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends f {
        public a() {
        }

        public void finalize() {
            try {
                r.this.reset();
            } catch (Throwable th2) {
                th2.printStackTrace(System.err);
            }
        }

        @Override // po.f
        public InputStream m() throws IOException {
            return r.this.f();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends f {
        public b() {
        }

        @Override // po.f
        public InputStream m() throws IOException {
            return r.this.f();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends ByteArrayOutputStream {
        public c() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public r(int fileThreshold) {
        this(fileThreshold, false);
    }

    public f c() {
        return this.f81078c;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f81079d.close();
    }

    @CheckForNull
    @go.e
    public synchronized File e() {
        return this.f81081f;
    }

    public final synchronized InputStream f() throws IOException {
        if (this.f81081f != null) {
            return new FileInputStream(this.f81081f);
        }
        Objects.requireNonNull(this.f81080e);
        return new ByteArrayInputStream(this.f81080e.a(), 0, this.f81080e.getCount());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f81079d.flush();
    }

    @vo.a("this")
    public final void i(int len) throws IOException {
        c cVar = this.f81080e;
        if (cVar == null || cVar.getCount() + len <= this.f81076a) {
            return;
        }
        File b11 = h0.f81052a.b("FileBackedOutputStream");
        if (this.f81077b) {
            b11.deleteOnExit();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b11);
            fileOutputStream.write(this.f81080e.a(), 0, this.f81080e.getCount());
            fileOutputStream.flush();
            this.f81079d = fileOutputStream;
            this.f81081f = b11;
            this.f81080e = null;
        } catch (IOException e11) {
            b11.delete();
            throw e11;
        }
    }

    public synchronized void reset() throws IOException {
        a aVar = null;
        try {
            close();
            c cVar = this.f81080e;
            if (cVar == null) {
                this.f81080e = new c(aVar);
            } else {
                cVar.reset();
            }
            this.f81079d = this.f81080e;
            File file = this.f81081f;
            if (file != null) {
                this.f81081f = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        } catch (Throwable th2) {
            if (this.f81080e == null) {
                this.f81080e = new c(aVar);
            } else {
                this.f81080e.reset();
            }
            this.f81079d = this.f81080e;
            File file2 = this.f81081f;
            if (file2 != null) {
                this.f81081f = null;
                if (!file2.delete()) {
                    throw new IOException("Could not delete: " + file2);
                }
            }
            throw th2;
        } finally {
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int b11) throws IOException {
        i(1);
        this.f81079d.write(b11);
    }

    public r(int fileThreshold, boolean resetOnFinalize) {
        Preconditions.checkArgument(fileThreshold >= 0, "fileThreshold must be non-negative, but was %s", fileThreshold);
        this.f81076a = fileThreshold;
        this.f81077b = resetOnFinalize;
        c cVar = new c(null);
        this.f81080e = cVar;
        this.f81079d = cVar;
        if (resetOnFinalize) {
            this.f81078c = new a();
        } else {
            this.f81078c = new b();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b11) throws IOException {
        write(b11, 0, b11.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] b11, int off, int len) throws IOException {
        i(len);
        this.f81079d.write(b11, off, len);
    }
}
