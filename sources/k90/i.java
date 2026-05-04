package k90;

import java.io.Reader;
import java.util.Arrays;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f66089a;

    /* renamed from: b, reason: collision with root package name */
    public char[] f66090b = new char[0];

    /* renamed from: c, reason: collision with root package name */
    public int f66091c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f66092d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final char f66093e;

    /* renamed from: f, reason: collision with root package name */
    public char f66094f;

    /* renamed from: g, reason: collision with root package name */
    public final int f66095g;

    public i(c cVar, char c11, int i11) {
        this.f66089a = cVar;
        this.f66093e = c11;
        this.f66095g = i11;
    }

    @Override // k90.c
    public int a(char c11) {
        return this.f66089a.a(c11);
    }

    @Override // k90.c, k90.b
    public final char b() {
        int i11 = this.f66092d;
        return (i11 == 0 || i11 < this.f66091c) ? this.f66090b[i11 - 1] : this.f66089a.b();
    }

    @Override // k90.c, k90.b
    public char c() {
        int i11 = this.f66092d;
        if (i11 >= this.f66091c) {
            return this.f66089a.c();
        }
        char[] cArr = this.f66090b;
        this.f66092d = i11 + 1;
        return cArr[i11];
    }

    @Override // k90.c
    public void d(long j11) {
        this.f66089a.d(j11);
    }

    public String e() {
        int i11 = this.f66092d;
        int i12 = this.f66091c;
        return i11 >= i12 ? "" : new String(this.f66090b, i11, i12);
    }

    public String f(char c11) {
        if (this.f66092d >= this.f66091c) {
            return String.valueOf(c11);
        }
        return c11 + new String(this.f66090b, this.f66092d, this.f66091c - 1);
    }

    public void g(int i11) {
        int i12 = i11 + (this.f66091c - this.f66092d);
        char[] cArr = this.f66090b;
        if (cArr.length < i12) {
            this.f66090b = Arrays.copyOf(cArr, i12);
        }
        if (this.f66092d >= this.f66091c) {
            this.f66092d = 0;
            this.f66091c = 0;
        }
        try {
            int i13 = i12 - this.f66091c;
            while (true) {
                int i14 = i13 - 1;
                if (i13 <= 0) {
                    return;
                }
                this.f66090b[this.f66091c] = this.f66089a.c();
                this.f66091c++;
                i13 = i14;
            }
        } catch (EOFException unused) {
        }
    }

    public boolean h(char c11, char[] cArr, char c12) {
        if (cArr.length > this.f66091c - this.f66092d) {
            return false;
        }
        char c13 = cArr[0];
        if (c13 != c11 && c13 != c12) {
            return false;
        }
        for (int i11 = 1; i11 < cArr.length; i11++) {
            char c14 = cArr[i11];
            if (c14 != c12 && c14 != this.f66090b[(i11 - 1) + this.f66092d]) {
                return false;
            }
        }
        return true;
    }

    @Override // k90.c
    public String i() {
        return this.f66089a.i();
    }

    @Override // k90.c
    public int j() {
        return this.f66089a.j();
    }

    @Override // k90.c
    public boolean k(char c11, char c12, char c13, char c14) {
        return this.f66089a.k(c11, c12, c13, c14);
    }

    @Override // k90.c
    public String l(char c11, char c12, char c13, int i11, char c14, char c15, boolean z11, boolean z12, boolean z13, boolean z14) {
        return this.f66089a.l(c11, c12, c13, i11, c14, c15, z11, z12, z13, z14);
    }

    @Override // k90.c
    public boolean m(char c11, char c12) {
        return this.f66089a.m(c11, c12);
    }

    @Override // k90.c
    public long n() {
        return this.f66089a.n();
    }

    @Override // k90.c
    public void o() {
        this.f66089a.o();
    }

    @Override // k90.c
    public char p(char c11, char c12, char c13) {
        while (true) {
            int i11 = this.f66092d;
            if (i11 >= this.f66091c || c11 > ' ' || c11 == c12 || c11 == this.f66093e || c11 == c13 || this.f66095g >= c11) {
                break;
            }
            char[] cArr = this.f66090b;
            this.f66092d = i11 + 1;
            c11 = cArr[i11];
        }
        return this.f66089a.p(c11, c12, c13);
    }

    @Override // k90.c
    public String q(char c11, char c12, boolean z11, String str, int i11) {
        return this.f66089a.q(c11, c12, z11, str, i11);
    }

    @Override // k90.c
    public String r() {
        return this.f66089a.r();
    }

    @Override // k90.c
    public long s() {
        return this.f66089a.s();
    }

    @Override // k90.c
    public void stop() {
        this.f66089a.stop();
    }

    @Override // k90.c
    public void t(boolean z11) {
        this.f66089a.t(z11);
    }

    @Override // k90.c
    public char[] u() {
        return this.f66089a.u();
    }

    @Override // k90.c
    public void v(Reader reader) {
        this.f66089a.v(reader);
    }

    public boolean w(char[] cArr, char c11) {
        if (cArr.length > this.f66091c - this.f66092d) {
            return false;
        }
        for (int i11 = 0; i11 < cArr.length; i11++) {
            char c12 = cArr[i11];
            if (c12 != c11 && c12 != this.f66090b[this.f66092d + i11]) {
                return false;
            }
        }
        return true;
    }

    public void x() {
        c cVar = this.f66089a;
        if (cVar instanceof org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.b) {
            ((org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.b) cVar).x();
        }
    }
}
