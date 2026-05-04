package a70;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class z implements k70.i, k70.a {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f2284g = {13, 10};

    /* renamed from: a, reason: collision with root package name */
    public final v f2285a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteArrayBuffer f2286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2287c;

    /* renamed from: d, reason: collision with root package name */
    public final CharsetEncoder f2288d;

    /* renamed from: e, reason: collision with root package name */
    public OutputStream f2289e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f2290f;

    public z(v vVar, int i11, int i12, CharsetEncoder charsetEncoder) {
        e80.a.k(i11, "Buffer size");
        e80.a.j(vVar, "HTTP transport metrcis");
        this.f2285a = vVar;
        this.f2286b = new ByteArrayBuffer(i11);
        this.f2287c = i12 < 0 ? 0 : i12;
        this.f2288d = charsetEncoder;
    }

    private void e() throws IOException {
        int length = this.f2286b.length();
        if (length > 0) {
            i(this.f2286b.buffer(), 0, length);
            this.f2286b.clear();
            this.f2285a.b(length);
        }
    }

    private void g(CoderResult coderResult) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f2290f.flip();
        while (this.f2290f.hasRemaining()) {
            write(this.f2290f.get());
        }
        this.f2290f.compact();
    }

    private void j(CharBuffer charBuffer) throws IOException {
        if (charBuffer.hasRemaining()) {
            if (this.f2290f == null) {
                this.f2290f = ByteBuffer.allocate(1024);
            }
            this.f2288d.reset();
            while (charBuffer.hasRemaining()) {
                g(this.f2288d.encode(charBuffer, this.f2290f, true));
            }
            g(this.f2288d.flush(this.f2290f));
            this.f2290f.clear();
        }
    }

    public void a(OutputStream outputStream) {
        this.f2289e = outputStream;
    }

    @Override // k70.a
    public int available() {
        return d() - length();
    }

    @Override // k70.i
    public void b(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.f2288d == null) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    write(str.charAt(i11));
                }
            } else {
                j(CharBuffer.wrap(str));
            }
        }
        write(f2284g);
    }

    @Override // k70.i
    public void c(CharArrayBuffer charArrayBuffer) throws IOException {
        if (charArrayBuffer == null) {
            return;
        }
        int i11 = 0;
        if (this.f2288d == null) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int min = Math.min(this.f2286b.capacity() - this.f2286b.length(), length);
                if (min > 0) {
                    this.f2286b.append(charArrayBuffer, i11, min);
                }
                if (this.f2286b.isFull()) {
                    e();
                }
                i11 += min;
                length -= min;
            }
        } else {
            j(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(f2284g);
    }

    @Override // k70.a
    public int d() {
        return this.f2286b.capacity();
    }

    public final void f() throws IOException {
        OutputStream outputStream = this.f2289e;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // k70.i
    public void flush() throws IOException {
        e();
        f();
    }

    @Override // k70.i
    public k70.g getMetrics() {
        return this.f2285a;
    }

    public boolean h() {
        return this.f2289e != null;
    }

    public final void i(byte[] bArr, int i11, int i12) throws IOException {
        e80.b.f(this.f2289e, "Output stream");
        this.f2289e.write(bArr, i11, i12);
    }

    @Override // k70.a
    public int length() {
        return this.f2286b.length();
    }

    @Override // k70.i
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i12 > this.f2287c || i12 > this.f2286b.capacity()) {
            e();
            i(bArr, i11, i12);
            this.f2285a.b(i12);
        } else {
            if (i12 > this.f2286b.capacity() - this.f2286b.length()) {
                e();
            }
            this.f2286b.append(bArr, i11, i12);
        }
    }

    public z(v vVar, int i11) {
        this(vVar, i11, i11, null);
    }

    @Override // k70.i
    public void write(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    @Override // k70.i
    public void write(int i11) throws IOException {
        if (this.f2287c > 0) {
            if (this.f2286b.isFull()) {
                e();
            }
            this.f2286b.append(i11);
        } else {
            e();
            this.f2289e.write(i11);
        }
    }
}
