package a70;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.params.HttpParams;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class d implements k70.i, k70.a {

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f2211k = {13, 10};

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f2212a;

    /* renamed from: b, reason: collision with root package name */
    public ByteArrayBuffer f2213b;

    /* renamed from: c, reason: collision with root package name */
    public Charset f2214c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2215d;

    /* renamed from: e, reason: collision with root package name */
    public int f2216e;

    /* renamed from: f, reason: collision with root package name */
    public v f2217f;

    /* renamed from: g, reason: collision with root package name */
    public CodingErrorAction f2218g;

    /* renamed from: h, reason: collision with root package name */
    public CodingErrorAction f2219h;

    /* renamed from: i, reason: collision with root package name */
    public CharsetEncoder f2220i;

    /* renamed from: j, reason: collision with root package name */
    public ByteBuffer f2221j;

    public d(OutputStream outputStream, int i11, Charset charset, int i12, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2) {
        e80.a.j(outputStream, "Input stream");
        e80.a.h(i11, "Buffer size");
        this.f2212a = outputStream;
        this.f2213b = new ByteArrayBuffer(i11);
        charset = charset == null ? org.apache.http.b.f77708f : charset;
        this.f2214c = charset;
        this.f2215d = charset.equals(org.apache.http.b.f77708f);
        this.f2220i = null;
        this.f2216e = i12 < 0 ? 512 : i12;
        this.f2217f = a();
        this.f2218g = codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction;
        this.f2219h = codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2;
    }

    public v a() {
        return new v();
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
            if (this.f2215d) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    write(str.charAt(i11));
                }
            } else {
                h(CharBuffer.wrap(str));
            }
        }
        write(f2211k);
    }

    @Override // k70.i
    public void c(CharArrayBuffer charArrayBuffer) throws IOException {
        if (charArrayBuffer == null) {
            return;
        }
        int i11 = 0;
        if (this.f2215d) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int min = Math.min(this.f2213b.capacity() - this.f2213b.length(), length);
                if (min > 0) {
                    this.f2213b.append(charArrayBuffer, i11, min);
                }
                if (this.f2213b.isFull()) {
                    e();
                }
                i11 += min;
                length -= min;
            }
        } else {
            h(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(f2211k);
    }

    @Override // k70.a
    public int d() {
        return this.f2213b.capacity();
    }

    public void e() throws IOException {
        int length = this.f2213b.length();
        if (length > 0) {
            this.f2212a.write(this.f2213b.buffer(), 0, length);
            this.f2213b.clear();
            this.f2217f.b(length);
        }
    }

    public final void f(CoderResult coderResult) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f2221j.flip();
        while (this.f2221j.hasRemaining()) {
            write(this.f2221j.get());
        }
        this.f2221j.compact();
    }

    @Override // k70.i
    public void flush() throws IOException {
        e();
        this.f2212a.flush();
    }

    public void g(OutputStream outputStream, int i11, HttpParams httpParams) {
        e80.a.j(outputStream, "Input stream");
        e80.a.h(i11, "Buffer size");
        e80.a.j(httpParams, "HTTP parameters");
        this.f2212a = outputStream;
        this.f2213b = new ByteArrayBuffer(i11);
        String str = (String) httpParams.getParameter(a80.c.f2303b);
        Charset forName = str != null ? Charset.forName(str) : org.apache.http.b.f77708f;
        this.f2214c = forName;
        this.f2215d = forName.equals(org.apache.http.b.f77708f);
        this.f2220i = null;
        this.f2216e = httpParams.getIntParameter(a80.b.f2300j, 512);
        this.f2217f = a();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(a80.c.f2310i);
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.f2218g = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(a80.c.f2311j);
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.f2219h = codingErrorAction2;
    }

    @Override // k70.i
    public k70.g getMetrics() {
        return this.f2217f;
    }

    public final void h(CharBuffer charBuffer) throws IOException {
        if (charBuffer.hasRemaining()) {
            if (this.f2220i == null) {
                CharsetEncoder newEncoder = this.f2214c.newEncoder();
                this.f2220i = newEncoder;
                newEncoder.onMalformedInput(this.f2218g);
                this.f2220i.onUnmappableCharacter(this.f2219h);
            }
            if (this.f2221j == null) {
                this.f2221j = ByteBuffer.allocate(1024);
            }
            this.f2220i.reset();
            while (charBuffer.hasRemaining()) {
                f(this.f2220i.encode(charBuffer, this.f2221j, true));
            }
            f(this.f2220i.flush(this.f2221j));
            this.f2221j.clear();
        }
    }

    @Override // k70.a
    public int length() {
        return this.f2213b.length();
    }

    @Override // k70.i
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i12 > this.f2216e || i12 > this.f2213b.capacity()) {
            e();
            this.f2212a.write(bArr, i11, i12);
            this.f2217f.b(i12);
        } else {
            if (i12 > this.f2213b.capacity() - this.f2213b.length()) {
                e();
            }
            this.f2213b.append(bArr, i11, i12);
        }
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
        if (this.f2213b.isFull()) {
            e();
        }
        this.f2213b.append(i11);
    }

    public d() {
    }
}
