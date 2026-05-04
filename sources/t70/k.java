package t70;

import en.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends w60.a implements i, n {

    /* renamed from: e, reason: collision with root package name */
    public final File f89959e;

    /* renamed from: f, reason: collision with root package name */
    public RandomAccessFile f89960f;

    /* renamed from: g, reason: collision with root package name */
    public FileChannel f89961g;

    /* renamed from: h, reason: collision with root package name */
    public long f89962h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f89963i;

    public k(File file, ContentType contentType, boolean z11) {
        this.f89962h = -1L;
        e80.a.j(file, "File");
        this.f89959e = file;
        this.f89963i = z11;
        if (contentType != null) {
            i(contentType.toString());
        }
    }

    @Override // t70.n
    @Deprecated
    public void a() throws IOException {
        close();
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f89959e.length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f89960f;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.f89960f = null;
        this.f89961g = null;
    }

    @Override // t70.i
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        if (this.f89960f == null) {
            this.f89960f = new RandomAccessFile(this.f89959e, r.f50027a);
        }
        if (this.f89961g == null) {
            this.f89961g = this.f89960f.getChannel();
            this.f89962h = 0L;
        }
        long a11 = (this.f89963i && (cVar instanceof m70.f)) ? ((m70.f) cVar).a(this.f89961g, this.f89962h, Long.MAX_VALUE) : this.f89961g.transferTo(this.f89962h, Long.MAX_VALUE, new m70.d(cVar));
        if (a11 > 0) {
            this.f89962h += a11;
        }
        if (this.f89962h >= this.f89961g.size()) {
            cVar.complete();
            close();
        }
    }

    @Override // org.apache.http.HttpEntity
    public boolean n() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean q() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream w() throws IOException {
        return new FileInputStream(this.f89959e);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        FileInputStream fileInputStream = new FileInputStream(this.f89959e);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    outputStream.flush();
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    public k(File file) {
        this.f89962h = -1L;
        e80.a.j(file, "File");
        this.f89959e = file;
    }

    public k(File file, ContentType contentType) {
        this(file, contentType, true);
    }

    @Deprecated
    public k(File file, String str, boolean z11) {
        this.f89962h = -1L;
        e80.a.j(file, "File");
        this.f89959e = file;
        this.f89963i = z11;
        i(str);
    }

    @Deprecated
    public k(File file, String str) {
        this(file, str, true);
    }
}
