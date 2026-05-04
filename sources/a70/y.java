package a70;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.MessageConstraintException;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class y implements k70.h, k70.a {

    /* renamed from: a, reason: collision with root package name */
    public final v f2274a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2275b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteArrayBuffer f2276c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2277d;

    /* renamed from: e, reason: collision with root package name */
    public final v60.c f2278e;

    /* renamed from: f, reason: collision with root package name */
    public final CharsetDecoder f2279f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f2280g;

    /* renamed from: h, reason: collision with root package name */
    public int f2281h;

    /* renamed from: i, reason: collision with root package name */
    public int f2282i;

    /* renamed from: j, reason: collision with root package name */
    public CharBuffer f2283j;

    public y(v vVar, int i11, int i12, v60.c cVar, CharsetDecoder charsetDecoder) {
        e80.a.j(vVar, "HTTP transport metrcis");
        e80.a.k(i11, "Buffer size");
        this.f2274a = vVar;
        this.f2275b = new byte[i11];
        this.f2281h = 0;
        this.f2282i = 0;
        this.f2277d = i12 < 0 ? 512 : i12;
        this.f2278e = cVar == null ? v60.c.f93129c : cVar;
        this.f2276c = new ByteArrayBuffer(i11);
        this.f2279f = charsetDecoder;
    }

    private int c(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        int i11 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f2283j == null) {
            this.f2283j = CharBuffer.allocate(1024);
        }
        this.f2279f.reset();
        while (byteBuffer.hasRemaining()) {
            i11 += h(this.f2279f.decode(byteBuffer, this.f2283j, true), charArrayBuffer, byteBuffer);
        }
        int h11 = i11 + h(this.f2279f.flush(this.f2283j), charArrayBuffer, byteBuffer);
        this.f2283j.clear();
        return h11;
    }

    private int h(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f2283j.flip();
        int remaining = this.f2283j.remaining();
        while (this.f2283j.hasRemaining()) {
            charArrayBuffer.append(this.f2283j.get());
        }
        this.f2283j.compact();
        return remaining;
    }

    private int k(CharArrayBuffer charArrayBuffer) throws IOException {
        int length = this.f2276c.length();
        if (length > 0) {
            if (this.f2276c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.f2276c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f2279f == null) {
            charArrayBuffer.append(this.f2276c, 0, length);
        } else {
            length = c(charArrayBuffer, ByteBuffer.wrap(this.f2276c.buffer(), 0, length));
        }
        this.f2276c.clear();
        return length;
    }

    private int l(CharArrayBuffer charArrayBuffer, int i11) throws IOException {
        int i12 = this.f2281h;
        this.f2281h = i11 + 1;
        if (i11 > i12 && this.f2275b[i11 - 1] == 13) {
            i11--;
        }
        int i13 = i11 - i12;
        if (this.f2279f != null) {
            return c(charArrayBuffer, ByteBuffer.wrap(this.f2275b, i12, i13));
        }
        charArrayBuffer.append(this.f2275b, i12, i13);
        return i13;
    }

    @Override // k70.h
    public int a(CharArrayBuffer charArrayBuffer) throws IOException {
        e80.a.j(charArrayBuffer, "Char array buffer");
        int e11 = this.f2278e.e();
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int i12 = this.f2281h;
            while (true) {
                if (i12 >= this.f2282i) {
                    i12 = -1;
                    break;
                }
                if (this.f2275b[i12] == 10) {
                    break;
                }
                i12++;
            }
            if (e11 > 0) {
                if ((this.f2276c.length() + (i12 >= 0 ? i12 : this.f2282i)) - this.f2281h >= e11) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
            }
            if (i12 == -1) {
                if (i()) {
                    int i13 = this.f2282i;
                    int i14 = this.f2281h;
                    this.f2276c.append(this.f2275b, i14, i13 - i14);
                    this.f2281h = this.f2282i;
                }
                i11 = g();
                if (i11 == -1) {
                }
            } else {
                if (this.f2276c.isEmpty()) {
                    return l(charArrayBuffer, i12);
                }
                int i15 = i12 + 1;
                int i16 = this.f2281h;
                this.f2276c.append(this.f2275b, i16, i15 - i16);
                this.f2281h = i15;
            }
            z11 = false;
        }
        if (i11 == -1 && this.f2276c.isEmpty()) {
            return -1;
        }
        return k(charArrayBuffer);
    }

    @Override // k70.a
    public int available() {
        return d() - length();
    }

    @Override // k70.h
    public boolean b(int i11) throws IOException {
        return i();
    }

    @Override // k70.a
    public int d() {
        return this.f2275b.length;
    }

    public void e(InputStream inputStream) {
        this.f2280g = inputStream;
    }

    public void f() {
        this.f2281h = 0;
        this.f2282i = 0;
    }

    public int g() throws IOException {
        int i11 = this.f2281h;
        if (i11 > 0) {
            int i12 = this.f2282i - i11;
            if (i12 > 0) {
                byte[] bArr = this.f2275b;
                System.arraycopy(bArr, i11, bArr, 0, i12);
            }
            this.f2281h = 0;
            this.f2282i = i12;
        }
        int i13 = this.f2282i;
        byte[] bArr2 = this.f2275b;
        int m11 = m(bArr2, i13, bArr2.length - i13);
        if (m11 == -1) {
            return -1;
        }
        this.f2282i = i13 + m11;
        this.f2274a.b(m11);
        return m11;
    }

    @Override // k70.h
    public k70.g getMetrics() {
        return this.f2274a;
    }

    public boolean i() {
        return this.f2281h < this.f2282i;
    }

    public boolean j() {
        return this.f2280g != null;
    }

    @Override // k70.a
    public int length() {
        return this.f2282i - this.f2281h;
    }

    public final int m(byte[] bArr, int i11, int i12) throws IOException {
        e80.b.f(this.f2280g, "Input stream");
        return this.f2280g.read(bArr, i11, i12);
    }

    @Override // k70.h
    public int read() throws IOException {
        while (!i()) {
            if (g() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f2275b;
        int i11 = this.f2281h;
        this.f2281h = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // k70.h
    public String readLine() throws IOException {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (a(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }

    @Override // k70.h
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (i()) {
            int min = Math.min(i12, this.f2282i - this.f2281h);
            System.arraycopy(this.f2275b, this.f2281h, bArr, i11, min);
            this.f2281h += min;
            return min;
        }
        if (i12 > this.f2277d) {
            int m11 = m(bArr, i11, i12);
            if (m11 > 0) {
                this.f2274a.b(m11);
            }
            return m11;
        }
        while (!i()) {
            if (g() == -1) {
                return -1;
            }
        }
        int min2 = Math.min(i12, this.f2282i - this.f2281h);
        System.arraycopy(this.f2275b, this.f2281h, bArr, i11, min2);
        this.f2281h += min2;
        return min2;
    }

    public y(v vVar, int i11) {
        this(vVar, i11, i11, null, null);
    }

    @Override // k70.h
    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }
}
