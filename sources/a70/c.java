package a70;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.params.HttpParams;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public abstract class c implements k70.h, k70.a {

    /* renamed from: a, reason: collision with root package name */
    public InputStream f2197a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2198b;

    /* renamed from: c, reason: collision with root package name */
    public ByteArrayBuffer f2199c;

    /* renamed from: d, reason: collision with root package name */
    public Charset f2200d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2201e;

    /* renamed from: f, reason: collision with root package name */
    public int f2202f;

    /* renamed from: g, reason: collision with root package name */
    public int f2203g;

    /* renamed from: h, reason: collision with root package name */
    public v f2204h;

    /* renamed from: i, reason: collision with root package name */
    public CodingErrorAction f2205i;

    /* renamed from: j, reason: collision with root package name */
    public CodingErrorAction f2206j;

    /* renamed from: k, reason: collision with root package name */
    public int f2207k;

    /* renamed from: l, reason: collision with root package name */
    public int f2208l;

    /* renamed from: m, reason: collision with root package name */
    public CharsetDecoder f2209m;

    /* renamed from: n, reason: collision with root package name */
    public CharBuffer f2210n;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r2 == (-1)) goto L12;
     */
    @Override // k70.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(org.apache.http.util.CharArrayBuffer r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "Char array buffer"
            e80.a.j(r8, r0)
            r0 = 0
            r1 = 1
            r2 = r0
        L8:
            r3 = -1
            if (r1 == 0) goto L63
            int r4 = r7.m()
            if (r4 == r3) goto L2f
            org.apache.http.util.ByteArrayBuffer r1 = r7.f2199c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1e
            int r8 = r7.l(r8, r4)
            return r8
        L1e:
            int r4 = r4 + 1
            int r1 = r7.f2207k
            int r3 = r4 - r1
            org.apache.http.util.ByteArrayBuffer r5 = r7.f2199c
            byte[] r6 = r7.f2198b
            r5.append(r6, r1, r3)
            r7.f2207k = r4
        L2d:
            r1 = r0
            goto L4c
        L2f:
            boolean r2 = r7.i()
            if (r2 == 0) goto L45
            int r2 = r7.f2208l
            int r4 = r7.f2207k
            int r2 = r2 - r4
            org.apache.http.util.ByteArrayBuffer r5 = r7.f2199c
            byte[] r6 = r7.f2198b
            r5.append(r6, r4, r2)
            int r2 = r7.f2208l
            r7.f2207k = r2
        L45:
            int r2 = r7.g()
            if (r2 != r3) goto L4c
            goto L2d
        L4c:
            int r3 = r7.f2202f
            if (r3 <= 0) goto L8
            org.apache.http.util.ByteArrayBuffer r3 = r7.f2199c
            int r3 = r3.length()
            int r4 = r7.f2202f
            if (r3 >= r4) goto L5b
            goto L8
        L5b:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L63:
            if (r2 != r3) goto L6e
            org.apache.http.util.ByteArrayBuffer r0 = r7.f2199c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6e
            return r3
        L6e:
            int r8 = r7.k(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.c.a(org.apache.http.util.CharArrayBuffer):int");
    }

    @Override // k70.a
    public int available() {
        return d() - length();
    }

    @Override // k70.a
    public int d() {
        return this.f2198b.length;
    }

    public final int e(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        int i11 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f2209m == null) {
            CharsetDecoder newDecoder = this.f2200d.newDecoder();
            this.f2209m = newDecoder;
            newDecoder.onMalformedInput(this.f2205i);
            this.f2209m.onUnmappableCharacter(this.f2206j);
        }
        if (this.f2210n == null) {
            this.f2210n = CharBuffer.allocate(1024);
        }
        this.f2209m.reset();
        while (byteBuffer.hasRemaining()) {
            i11 += h(this.f2209m.decode(byteBuffer, this.f2210n, true), charArrayBuffer, byteBuffer);
        }
        int h11 = i11 + h(this.f2209m.flush(this.f2210n), charArrayBuffer, byteBuffer);
        this.f2210n.clear();
        return h11;
    }

    public v f() {
        return new v();
    }

    public int g() throws IOException {
        int i11 = this.f2207k;
        if (i11 > 0) {
            int i12 = this.f2208l - i11;
            if (i12 > 0) {
                byte[] bArr = this.f2198b;
                System.arraycopy(bArr, i11, bArr, 0, i12);
            }
            this.f2207k = 0;
            this.f2208l = i12;
        }
        int i13 = this.f2208l;
        byte[] bArr2 = this.f2198b;
        int read = this.f2197a.read(bArr2, i13, bArr2.length - i13);
        if (read == -1) {
            return -1;
        }
        this.f2208l = i13 + read;
        this.f2204h.b(read);
        return read;
    }

    @Override // k70.h
    public k70.g getMetrics() {
        return this.f2204h;
    }

    public final int h(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f2210n.flip();
        int remaining = this.f2210n.remaining();
        while (this.f2210n.hasRemaining()) {
            charArrayBuffer.append(this.f2210n.get());
        }
        this.f2210n.compact();
        return remaining;
    }

    public boolean i() {
        return this.f2207k < this.f2208l;
    }

    public void j(InputStream inputStream, int i11, HttpParams httpParams) {
        e80.a.j(inputStream, "Input stream");
        e80.a.h(i11, "Buffer size");
        e80.a.j(httpParams, "HTTP parameters");
        this.f2197a = inputStream;
        this.f2198b = new byte[i11];
        this.f2207k = 0;
        this.f2208l = 0;
        this.f2199c = new ByteArrayBuffer(i11);
        String str = (String) httpParams.getParameter(a80.c.f2303b);
        Charset forName = str != null ? Charset.forName(str) : org.apache.http.b.f77708f;
        this.f2200d = forName;
        this.f2201e = forName.equals(org.apache.http.b.f77708f);
        this.f2209m = null;
        this.f2202f = httpParams.getIntParameter(a80.b.f2298h, -1);
        this.f2203g = httpParams.getIntParameter(a80.b.f2300j, 512);
        this.f2204h = f();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(a80.c.f2310i);
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.f2205i = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(a80.c.f2311j);
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.f2206j = codingErrorAction2;
    }

    public final int k(CharArrayBuffer charArrayBuffer) throws IOException {
        int length = this.f2199c.length();
        if (length > 0) {
            if (this.f2199c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.f2199c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f2201e) {
            charArrayBuffer.append(this.f2199c, 0, length);
        } else {
            length = e(charArrayBuffer, ByteBuffer.wrap(this.f2199c.buffer(), 0, length));
        }
        this.f2199c.clear();
        return length;
    }

    public final int l(CharArrayBuffer charArrayBuffer, int i11) throws IOException {
        int i12 = this.f2207k;
        this.f2207k = i11 + 1;
        if (i11 > i12 && this.f2198b[i11 - 1] == 13) {
            i11--;
        }
        int i13 = i11 - i12;
        if (!this.f2201e) {
            return e(charArrayBuffer, ByteBuffer.wrap(this.f2198b, i12, i13));
        }
        charArrayBuffer.append(this.f2198b, i12, i13);
        return i13;
    }

    @Override // k70.a
    public int length() {
        return this.f2208l - this.f2207k;
    }

    public final int m() {
        for (int i11 = this.f2207k; i11 < this.f2208l; i11++) {
            if (this.f2198b[i11] == 10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // k70.h
    public int read() throws IOException {
        while (!i()) {
            if (g() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f2198b;
        int i11 = this.f2207k;
        this.f2207k = i11 + 1;
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
            int min = Math.min(i12, this.f2208l - this.f2207k);
            System.arraycopy(this.f2198b, this.f2207k, bArr, i11, min);
            this.f2207k += min;
            return min;
        }
        if (i12 > this.f2203g) {
            int read = this.f2197a.read(bArr, i11, i12);
            if (read > 0) {
                this.f2204h.b(read);
            }
            return read;
        }
        while (!i()) {
            if (g() == -1) {
                return -1;
            }
        }
        int min2 = Math.min(i12, this.f2208l - this.f2207k);
        System.arraycopy(this.f2198b, this.f2207k, bArr, i11, min2);
        this.f2207k += min2;
        return min2;
    }

    @Override // k70.h
    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }
}
