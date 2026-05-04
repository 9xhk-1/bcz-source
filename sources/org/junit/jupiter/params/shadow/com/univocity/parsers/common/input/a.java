package org.junit.jupiter.params.shadow.com.univocity.parsers.common.input;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k90.c;
import k90.f;
import k90.g;
import k90.h;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.BomInput;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final f f78141a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f78142b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78143c;

    /* renamed from: d, reason: collision with root package name */
    public List<g> f78144d;

    /* renamed from: e, reason: collision with root package name */
    public char f78145e;

    /* renamed from: f, reason: collision with root package name */
    public char f78146f;

    /* renamed from: g, reason: collision with root package name */
    public final char f78147g;

    /* renamed from: h, reason: collision with root package name */
    public long f78148h;

    /* renamed from: i, reason: collision with root package name */
    public long f78149i;

    /* renamed from: j, reason: collision with root package name */
    public int f78150j;

    /* renamed from: k, reason: collision with root package name */
    public final int f78151k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f78152l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78153m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f78154n;

    /* renamed from: o, reason: collision with root package name */
    public int f78155o;

    /* renamed from: p, reason: collision with root package name */
    public char f78156p;

    /* renamed from: q, reason: collision with root package name */
    public char[] f78157q;

    /* renamed from: r, reason: collision with root package name */
    public int f78158r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f78159s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f78160t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a$a, reason: collision with other inner class name */
    public class C0957a extends h {
        public C0957a() {
        }

        @Override // k90.h
        public void b(char c11, char c12) {
            if (c11 == 0) {
                a.this.y(q.h());
                return;
            }
            a.this.f78142b = true;
            a.this.f78145e = c11;
            a.this.f78146f = c12;
        }
    }

    public a(char c11, int i11, boolean z11) {
        this(null, c11, i11, z11);
    }

    public final void A(Reader reader, boolean z11) {
        if (z11) {
            this.f78141a.reset();
        }
        stop();
        z(reader);
        this.f78148h = 0L;
        this.f78142b = false;
        B();
        E();
        if (this.f78158r <= 0 || this.f78157q[0] != 65279) {
            return;
        }
        this.f78155o++;
    }

    public final void B() {
        if (!this.f78143c || this.f78142b) {
            return;
        }
        w(new C0957a());
    }

    public final void C() {
        if (this.f78159s) {
            this.f78148h++;
        }
        this.f78156p = (char) 0;
        throw new EOFException();
    }

    public final void D(BomInput.BytesProcessedNotification bytesProcessedNotification) {
        InputStream inputStream = bytesProcessedNotification.input;
        String str = bytesProcessedNotification.encoding;
        if (str == null) {
            this.f78158r = -1;
            A(new InputStreamReader(inputStream), false);
        } else {
            try {
                v(new InputStreamReader(inputStream, str));
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public final void E() {
        char[] cArr;
        if (!this.f78153m) {
            int i11 = this.f78158r;
            int i12 = this.f78150j;
            if (i11 - i12 > 0 && (cArr = this.f78157q) != null && !this.f78152l) {
                this.f78141a.append(cArr, i12, i11 - i12);
            }
        }
        this.f78150j = 0;
        x();
        this.f78149i += this.f78155o;
        this.f78155o = 0;
        if (this.f78158r == -1) {
            stop();
            this.f78159s = true;
        }
        if (this.f78144d != null) {
            int i13 = this.f78158r;
            if (i13 > 0 && i13 <= 4) {
                char[] copyOfRange = Arrays.copyOfRange(this.f78157q, 0, i13 + 1);
                List<g> list = this.f78144d;
                this.f78144d = null;
                x();
                this.f78144d = list;
                if (this.f78158r != -1) {
                    char[] cArr2 = new char[this.f78157q.length + i13];
                    System.arraycopy(copyOfRange, 0, cArr2, 0, i13);
                    System.arraycopy(this.f78157q, 0, cArr2, i13, this.f78158r);
                    this.f78157q = cArr2;
                    this.f78158r += i13;
                } else {
                    this.f78157q = copyOfRange;
                    this.f78158r = i13;
                }
            }
            try {
                Iterator<g> it = this.f78144d.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f78157q, this.f78158r);
                }
            } finally {
                if (this.f78158r > 4) {
                    this.f78144d = null;
                }
            }
        }
    }

    @Override // k90.c
    public final int a(char c11) {
        int i11 = 0;
        if (this.f78141a.length() != 0) {
            int i12 = this.f78155o;
            if (i12 > this.f78150j) {
                int i13 = i12 - 1;
                while (i13 >= this.f78150j) {
                    if (this.f78157q[i13] == c11) {
                        return this.f78141a.length() + this.f78150j + i11;
                    }
                    i13--;
                    i11++;
                }
            }
            return this.f78141a.a(c11);
        }
        int i14 = this.f78155o;
        if (i14 <= this.f78150j) {
            return -1;
        }
        int i15 = i14 - 1;
        while (true) {
            int i16 = this.f78150j;
            if (i15 < i16) {
                return -1;
            }
            if (this.f78157q[i15] == c11) {
                return i16 + i11;
            }
            i15--;
            i11++;
        }
    }

    @Override // k90.c, k90.b
    public final char b() {
        return this.f78156p;
    }

    @Override // k90.c, k90.b
    public final char c() {
        char c11;
        if (this.f78158r == -1) {
            C();
        }
        char[] cArr = this.f78157q;
        int i11 = this.f78155o;
        int i12 = i11 + 1;
        this.f78155o = i12;
        this.f78156p = cArr[i11];
        if (i12 >= this.f78158r) {
            E();
        }
        if (this.f78145e == this.f78156p && ((c11 = this.f78146f) == 0 || (this.f78158r != -1 && c11 == this.f78157q[this.f78155o]))) {
            this.f78148h++;
            if (this.f78160t) {
                char c12 = this.f78147g;
                this.f78156p = c12;
                if (c11 == 0) {
                    return c12;
                }
                int i13 = this.f78155o + 1;
                this.f78155o = i13;
                int i14 = this.f78158r;
                if (i13 >= i14) {
                    if (i14 != -1) {
                        E();
                    } else {
                        C();
                    }
                }
            }
        }
        return this.f78156p;
    }

    @Override // k90.c
    public final void d(long j11) {
        if (j11 < 1) {
            this.f78152l = false;
            return;
        }
        this.f78152l = true;
        long j12 = this.f78148h + j11;
        do {
            try {
                c();
            } catch (EOFException unused) {
                this.f78152l = false;
                return;
            }
        } while (this.f78148h < j12);
        this.f78152l = false;
    }

    @Override // k90.c
    public final String i() {
        if (this.f78141a.length() == 0) {
            int i11 = this.f78155o;
            int i12 = this.f78150j;
            if (i11 > i12) {
                return new String(this.f78157q, i12, i11 - i12);
            }
            return null;
        }
        int i13 = this.f78155o;
        int i14 = this.f78150j;
        if (i13 > i14) {
            this.f78141a.append(this.f78157q, i14, i13 - i14);
        }
        return this.f78141a.A();
    }

    @Override // k90.c
    public final int j() {
        return (this.f78155o - this.f78150j) + this.f78141a.length();
    }

    @Override // k90.c
    public final boolean k(char c11, char c12, char c13, char c14) {
        char c15;
        int i11;
        char c16;
        int i12 = this.f78155o;
        if (i12 == 0) {
            return false;
        }
        while (true) {
            int i13 = this.f78158r;
            if (i12 >= i13) {
                return false;
            }
            char[] cArr = this.f78157q;
            char c17 = cArr[i12];
            this.f78156p = c17;
            if (c17 != c11) {
                if (this.f78145e == c17 && this.f78160t && ((c15 = this.f78146f) == 0 || ((i11 = i12 + 1) < i13 && c15 == cArr[i11]))) {
                    break;
                }
            } else if (cArr[i12 - 1] != c12) {
                int i14 = i12 + 1;
                if (i14 >= i13 || !((c16 = cArr[i14]) == c13 || c16 == c14)) {
                    return false;
                }
                this.f78155o = i14;
                if (i14 >= i13) {
                    E();
                }
                return true;
            }
            i12++;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0097, code lost:
    
        return null;
     */
    @Override // k90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String l(char r8, char r9, char r10, int r11, char r12, char r13, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            r7 = this;
            int r1 = r7.f78155o
            r2 = 0
            if (r1 != 0) goto L6
            return r2
        L6:
            int r3 = r7.f78158r
            if (r1 < r3) goto Lb
            return r2
        Lb:
            char[] r4 = r7.f78157q
            char r5 = r4[r1]
            r7.f78156p = r5
            if (r5 != r8) goto L74
            int r5 = r1 + (-1)
            char r5 = r4[r5]
            if (r5 != r9) goto L1f
            if (r15 == 0) goto L1e
        L1b:
            int r1 = r1 + 1
            goto L6
        L1e:
            return r2
        L1f:
            int r8 = r1 + 1
            if (r8 >= r3) goto L73
            char r9 = r4[r8]
            if (r9 == r12) goto L29
            if (r9 != r13) goto L73
        L29:
            int r9 = r7.f78155o
            int r1 = r1 - r9
            r10 = -1
            if (r11 == r10) goto L32
            if (r1 <= r11) goto L32
            return r2
        L32:
            if (r14 == 0) goto L39
            int r9 = r9 + (-1)
            int r1 = r1 + 2
            goto L5b
        L39:
            r10 = 32
            if (r17 == 0) goto L4c
        L3d:
            if (r1 <= 0) goto L4c
            char[] r0 = r7.f78157q
            int r2 = r9 + r1
            int r2 = r2 + (-1)
            char r0 = r0[r2]
            if (r0 > r10) goto L4c
            int r1 = r1 + (-1)
            goto L3d
        L4c:
            if (r16 == 0) goto L5b
        L4e:
            if (r1 <= 0) goto L5b
            char[] r0 = r7.f78157q
            char r0 = r0[r9]
            if (r0 > r10) goto L5b
            int r9 = r9 + 1
            int r1 = r1 + (-1)
            goto L4e
        L5b:
            r7.f78155o = r8
            if (r1 > 0) goto L62
            java.lang.String r8 = ""
            goto L69
        L62:
            java.lang.String r8 = new java.lang.String
            char[] r10 = r7.f78157q
            r8.<init>(r10, r9, r1)
        L69:
            int r9 = r7.f78155o
            int r10 = r7.f78158r
            if (r9 < r10) goto L72
            r7.E()
        L72:
            return r8
        L73:
            return r2
        L74:
            if (r5 != r9) goto L83
            if (r15 != 0) goto L83
            int r5 = r1 + 1
            if (r5 >= r3) goto L1b
            char r3 = r4[r5]
            if (r3 == r8) goto L82
            if (r3 != r10) goto L1b
        L82:
            return r2
        L83:
            char r6 = r7.f78145e
            if (r6 != r5) goto L1b
            boolean r5 = r7.f78160t
            if (r5 == 0) goto L1b
            char r5 = r7.f78146f
            if (r5 == 0) goto L97
            int r6 = r1 + 1
            if (r6 >= r3) goto L1b
            char r3 = r4[r6]
            if (r5 != r3) goto L1b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.a.l(char, char, char, int, char, char, boolean, boolean, boolean, boolean):java.lang.String");
    }

    @Override // k90.c
    public final boolean m(char c11, char c12) {
        char c13;
        int i11 = this.f78155o;
        if (i11 == 0) {
            return false;
        }
        while (c11 != c12) {
            if (i11 < this.f78158r) {
                if (this.f78145e == c11 && ((c13 = this.f78146f) == 0 || c13 == this.f78157q[i11])) {
                    break;
                }
                c11 = this.f78157q[i11];
                i11++;
            } else {
                return false;
            }
        }
        this.f78155o = i11 - 1;
        c();
        return true;
    }

    @Override // k90.c
    public final long n() {
        return this.f78148h;
    }

    @Override // k90.c
    public final void o() {
        this.f78141a.reset();
        this.f78150j = this.f78155o % this.f78158r;
    }

    @Override // k90.c
    public final char p(char c11, char c12, char c13) {
        while (c11 <= ' ' && c11 != c12 && c11 != this.f78147g && c11 != c13 && this.f78151k < c11) {
            c11 = c();
        }
        return c11;
    }

    @Override // k90.c
    public final String q(char c11, char c12, boolean z11, String str, int i11) {
        char c13;
        int i12 = this.f78155o;
        if (i12 == 0) {
            return null;
        }
        while (c11 != c12) {
            if (i12 < this.f78158r) {
                if (this.f78145e == c11 && ((c13 = this.f78146f) == 0 || c13 == this.f78157q[i12])) {
                    break;
                }
                c11 = this.f78157q[i12];
                i12++;
            } else {
                return null;
            }
        }
        int i13 = this.f78155o;
        int i14 = i13 - 1;
        int i15 = i12 - i13;
        if (i11 != -1 && i15 > i11) {
            return null;
        }
        this.f78155o = i12 - 1;
        if (z11) {
            int i16 = i12 - 2;
            while (true) {
                char c14 = this.f78157q[i16];
                if (c14 > ' ' || this.f78151k >= c14) {
                    break;
                }
                i15--;
                i16--;
            }
        }
        if (i15 > 0) {
            str = new String(this.f78157q, i14, i15);
        }
        c();
        return str;
    }

    @Override // k90.c
    public String r() {
        long j11 = this.f78148h + 1;
        this.f78153m = true;
        this.f78141a.reset();
        while (true) {
            try {
                try {
                    char c11 = c();
                    if (c11 <= ' ' && this.f78151k < c11) {
                        char c12 = this.f78147g;
                        c11 = p(c11, c12, c12);
                    }
                    f fVar = this.f78141a;
                    char c13 = this.f78147g;
                    fVar.u(c11, this, c13, c13);
                    if (this.f78148h >= j11) {
                        this.f78141a.o();
                        String A = this.f78141a.A();
                        this.f78153m = false;
                        return A;
                    }
                    this.f78141a.C(c());
                } catch (EOFException unused) {
                    this.f78141a.o();
                    String A2 = this.f78141a.A();
                    this.f78153m = false;
                    return A2;
                }
            } catch (Throwable th2) {
                this.f78153m = false;
                throw th2;
            }
        }
    }

    @Override // k90.c
    public final long s() {
        return this.f78149i + this.f78155o;
    }

    @Override // k90.c
    public final void t(boolean z11) {
        this.f78160t = z11;
    }

    @Override // k90.c
    public char[] u() {
        char c11 = this.f78146f;
        return c11 != 0 ? new char[]{this.f78145e, c11} : new char[]{this.f78145e};
    }

    @Override // k90.c
    public final void v(Reader reader) {
        A(reader, true);
    }

    public final void w(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f78144d == null) {
            this.f78144d = new ArrayList();
        }
        this.f78144d.add(gVar);
    }

    public abstract void x();

    public final void y(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            throw new IllegalArgumentException("Invalid line separator. Expected 1 to 2 characters");
        }
        if (cArr.length <= 2) {
            this.f78145e = cArr[0];
            this.f78146f = cArr.length == 2 ? cArr[1] : (char) 0;
        } else {
            throw new IllegalArgumentException("Invalid line separator. Up to 2 characters are expected. Got " + cArr.length + " characters.");
        }
    }

    public abstract void z(Reader reader);

    public a(char[] cArr, char c11, int i11, boolean z11) {
        this.f78152l = false;
        this.f78153m = false;
        this.f78158r = -1;
        this.f78160t = true;
        this.f78151k = i11;
        this.f78141a = new f(4096, null, i11);
        if (cArr == null) {
            this.f78143c = true;
            B();
            this.f78145e = (char) 0;
            this.f78146f = (char) 0;
        } else {
            y(cArr);
            this.f78143c = false;
        }
        this.f78147g = c11;
        this.f78154n = z11;
    }
}
