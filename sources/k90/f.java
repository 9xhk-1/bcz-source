package k90;

import java.util.Arrays;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends d {

    /* renamed from: g, reason: collision with root package name */
    public static final int f66088g = 2147483639;

    public f(String str, int i11) {
        this(8192, str, i11);
    }

    @Override // k90.d, k90.a
    public void B(char c11, char c12) {
        try {
            super.B(c11, c12);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            super.B(c11, c12);
        }
    }

    @Override // k90.d, k90.a
    public void C(char c11) {
        try {
            super.C(c11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            super.C(c11);
        }
    }

    public final void D(int i11) {
        E(i11, 1.5d);
    }

    public final void E(int i11, double d11) {
        char[] cArr = this.f66082c;
        if (cArr.length == 2147483639) {
            throw new TextParsingException((y) null, "Can't expand internal appender array to over 2147483639 characters in length.");
        }
        this.f66082c = Arrays.copyOf(cArr, (int) Math.min((this.f66083d + i11) * d11, 2.147483639E9d));
    }

    public final void F() {
        n();
        this.f66083d--;
    }

    @Override // k90.d, k90.a
    public void append(char c11) {
        try {
            super.append(c11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            super.append(c11);
        }
    }

    @Override // k90.d, k90.a
    public final void b(char[] cArr) {
        try {
            super.b(cArr);
        } catch (ArrayIndexOutOfBoundsException unused) {
            D(cArr.length);
            super.b(cArr);
        }
    }

    @Override // k90.d, k90.a
    public final void c(char c11, int i11) {
        try {
            super.c(c11, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            super.c(c11, i11);
        }
    }

    @Override // k90.d, k90.a
    public void d(char c11, char c12) {
        try {
            super.d(c11, c12);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            super.d(c11, c12);
        }
    }

    @Override // k90.d
    public final void h(d dVar) {
        try {
            super.h(dVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            D(dVar.f66083d);
            h(dVar);
        }
    }

    @Override // k90.d, k90.a
    public final char m(char c11, b bVar, char c12) {
        try {
            return super.m(c11, bVar, c12);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            return m(bVar.b(), bVar, c12);
        }
    }

    public final void n() {
        E(0, 2.0d);
    }

    @Override // k90.d, k90.a
    public final void p(String str, int i11, int i12) {
        try {
            super.p(str, i11, i12);
        } catch (IndexOutOfBoundsException unused) {
            D(i12 - i11);
            super.p(str, i11, i12);
        }
    }

    @Override // k90.d, k90.a
    public final void q(char c11) {
        try {
            super.q(c11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            n();
            super.q(c11);
        }
    }

    @Override // k90.d, k90.a
    public final char r(char c11, b bVar, char c12, char c13, char c14) {
        try {
            return super.r(c11, bVar, c12, c13, c14);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            return r(bVar.b(), bVar, c12, c13, c14);
        }
    }

    @Override // k90.d, k90.a
    public final void s(char c11, char c12) {
        try {
            super.s(c11, c12);
        } catch (ArrayIndexOutOfBoundsException unused) {
            D(2);
            super.s(c11, c12);
        }
    }

    @Override // k90.d, k90.a
    public final char u(char c11, b bVar, char c12, char c13) {
        try {
            return super.u(c11, bVar, c12, c13);
        } catch (ArrayIndexOutOfBoundsException unused) {
            F();
            return u(bVar.b(), bVar, c12, c13);
        }
    }

    public f(int i11, String str, int i12) {
        super(i11, str, i12);
    }

    @Override // k90.d, k90.a
    public final void append(char[] cArr, int i11, int i12) {
        int i13 = this.f66083d;
        int i14 = i13 + i12;
        char[] cArr2 = this.f66082c;
        if (i14 <= cArr2.length) {
            super.append(cArr, i11, i12);
        } else {
            this.f66082c = Arrays.copyOf(cArr2, Math.min(cArr2.length + i12 + i13, 2147483639));
            super.append(cArr, i11, i12);
        }
    }
}
