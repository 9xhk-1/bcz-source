package s90;

import k90.j;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.x;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.y;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.UnescapedQuoteHandling;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.b<e> {
    public final boolean A;
    public boolean B;
    public char C;
    public char D;
    public char[] E;
    public char F;
    public char G;
    public char H;
    public char I;
    public final k90.d J;
    public final boolean K;
    public UnescapedQuoteHandling L;
    public final String M;
    public final int N;
    public final String O;
    public final boolean P;
    public final boolean Q;
    public char[] R;
    public int S;
    public int T;

    /* renamed from: v, reason: collision with root package name */
    public boolean f88154v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f88155w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f88156x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f88157y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f88158z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c {
        public a(int i11, e eVar, int i12) {
            super(i11, eVar, i12);
        }

        @Override // s90.c
        public void b(char c11, char c12, char c13) {
            if (((e) d.this.f78013a).j1()) {
                d.this.D = c11;
                d.this.R[0] = c11;
            }
            if (((e) d.this.f78013a).p1()) {
                d.this.F = c12;
                d.this.G = c13;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88160a;

        static {
            int[] iArr = new int[UnescapedQuoteHandling.values().length];
            f88160a = iArr;
            try {
                iArr[UnescapedQuoteHandling.SKIP_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88160a[UnescapedQuoteHandling.RAISE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88160a[UnescapedQuoteHandling.BACK_TO_DELIMITER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88160a[UnescapedQuoteHandling.STOP_AT_CLOSING_QUOTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88160a[UnescapedQuoteHandling.STOP_AT_DELIMITER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar) {
        super(eVar);
        this.S = 0;
        this.f88154v = eVar.n1();
        this.f88155w = eVar.o1();
        this.f88157y = !eVar.k1();
        this.f88158z = eVar.l1();
        this.A = eVar.h1();
        this.K = eVar.m1();
        this.M = eVar.v();
        this.O = eVar.d1();
        this.N = eVar.t();
        this.Q = eVar.g1();
        this.P = eVar.f1();
        this.T = eVar.e1();
        h1((s90.b) eVar.o());
        this.J = new k90.f(10, "", this.f78030r);
        UnescapedQuoteHandling i12 = eVar.i1();
        this.L = i12;
        if (i12 != null) {
            boolean z11 = i12 == UnescapedQuoteHandling.BACK_TO_DELIMITER;
            this.f88156x = z11;
            this.f88155w = i12 == UnescapedQuoteHandling.STOP_AT_DELIMITER || i12 == UnescapedQuoteHandling.SKIP_VALUE || z11;
            this.f88154v = i12 != UnescapedQuoteHandling.RAISE_ERROR;
            return;
        }
        if (!this.f88154v) {
            this.L = UnescapedQuoteHandling.RAISE_ERROR;
        } else if (this.f88155w) {
            this.L = UnescapedQuoteHandling.STOP_AT_DELIMITER;
        } else {
            this.L = UnescapedQuoteHandling.STOP_AT_CLOSING_QUOTE;
        }
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.b
    public final void D0() {
        if (this.E == null) {
            a1();
        } else {
            X0();
        }
    }

    public final void P0() {
        char c11;
        while (true) {
            int i11 = this.S;
            char[] cArr = this.E;
            if (i11 >= cArr.length || (c11 = this.f78021i) == this.I) {
                break;
            }
            if (cArr[i11] == c11) {
                int i12 = i11 + 1;
                this.S = i12;
                if (i12 == cArr.length) {
                    break;
                }
            } else if (i11 > 0) {
                e1();
            } else {
                this.f78014b.f78203g.append(c11);
            }
            this.f78021i = this.f78020h.c();
        }
        e1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s90.b Q0() {
        s90.b bVar;
        if (((e) this.f78013a).j1()) {
            bVar = ((s90.b) ((e) this.f78013a).o()).clone();
            bVar.E(this.D);
        } else {
            bVar = null;
        }
        if (((e) this.f78013a).p1()) {
            if (bVar == null) {
                bVar = ((s90.b) ((e) this.f78013a).o()).clone();
            }
            bVar.G(this.F);
            bVar.J(this.G);
        }
        if (((e) this.f78013a).A0()) {
            if (bVar == null) {
                bVar = ((s90.b) ((e) this.f78013a).o()).clone();
            }
            bVar.n(this.f78020h.u());
        }
        return bVar;
    }

    public final boolean R0() {
        this.B = true;
        int i11 = b.f88160a[this.L.ordinal()];
        if (i11 != 3) {
            if (i11 != 4 && i11 != 5) {
                T0(true);
                return false;
            }
            this.f78014b.f78203g.append(this.F);
            this.f78014b.f78203g.append(this.f78021i);
            this.C = this.f78021i;
            if (this.E == null) {
                Y0();
            } else {
                Z0();
            }
            return true;
        }
        int i12 = 0;
        while (true) {
            int W0 = W0();
            if (W0 == -1) {
                break;
            }
            String substring = this.f78014b.f78203g.substring(0, W0);
            if (this.A && this.f78014b.f78203g.charAt(W0 - 1) == this.F) {
                substring = substring + this.F;
            }
            this.f78014b.o(substring);
            if (this.f78014b.f78203g.charAt(W0) == this.I) {
                x xVar = this.f78014b;
                xVar.f78213q.add(xVar.m());
                this.f78014b.f78203g.remove(0, W0 + 1);
            } else {
                char[] cArr = this.E;
                if (cArr == null) {
                    this.f78014b.f78203g.remove(0, W0 + 1);
                } else {
                    this.f78014b.f78203g.remove(0, cArr.length + W0);
                }
            }
            i12 = W0;
        }
        if (this.A && this.f78020h.a(this.F) > i12) {
            this.f78014b.f78203g.append(this.F);
        }
        this.f78014b.f78203g.append(this.f78021i);
        this.C = (char) 0;
        if (this.E == null) {
            Y0();
        } else {
            Z0();
        }
        return true;
    }

    public final void S0() {
        int i11 = b.f88160a[this.L.ordinal()];
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            T0(false);
            return;
        }
        this.f78014b.f78203g.append(this.F);
        this.C = this.f78021i;
        b1();
    }

    public final void T0(boolean z11) {
        int i11 = b.f88160a[this.L.ordinal()];
        if (i11 == 1) {
            f1();
            return;
        }
        if (i11 != 2) {
            return;
        }
        y yVar = this.f78018f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unescaped quote character '");
        sb2.append(this.F);
        sb2.append("' inside ");
        sb2.append(z11 ? "quoted" : "");
        sb2.append(" value of CSV field. To allow unescaped quotes, set 'parseUnescapedQuotes' to 'true' in the CSV parser settings. Cannot parse CSV input.");
        throw new TextParsingException(yVar, sb2.toString());
    }

    public final boolean U0() {
        char[] cArr;
        while (true) {
            char c11 = this.f78021i;
            cArr = this.E;
            int i11 = this.S;
            if (c11 != cArr[i11]) {
                break;
            }
            int i12 = i11 + 1;
            this.S = i12;
            if (i12 == cArr.length) {
                break;
            }
            this.f78021i = this.f78020h.c();
        }
        int length = cArr.length;
        int i13 = this.S;
        if (length == i13) {
            this.S = 0;
            return true;
        }
        if (i13 > 0) {
            e1();
        }
        return false;
    }

    public final boolean V0() {
        char[] cArr;
        while (true) {
            char c11 = this.f78021i;
            cArr = this.E;
            int i11 = this.S;
            if (c11 != cArr[i11]) {
                break;
            }
            int i12 = i11 + 1;
            this.S = i12;
            if (i12 == cArr.length) {
                break;
            }
            this.f78021i = this.f78020h.c();
        }
        if (cArr.length != this.S) {
            return false;
        }
        this.S = 0;
        return true;
    }

    public final int W0() {
        if (this.E == null) {
            return this.f78014b.f78203g.l(this.R, 0);
        }
        int e11 = this.f78014b.f78203g.e(this.I, 0);
        int f11 = this.f78014b.f78203g.f(this.E, 0);
        return (e11 == -1 || e11 >= f11) ? f11 : e11;
    }

    public final void X0() {
        char c11 = this.f78021i;
        if (c11 <= ' ' && this.f78032t && this.f78030r < c11) {
            g1();
        }
        while (true) {
            char c12 = this.f78021i;
            if (c12 == this.I) {
                return;
            }
            if (c12 <= ' ' && this.f78032t && this.f78030r < c12) {
                g1();
            }
            if (this.f78021i == this.I || U0()) {
                this.f78014b.b();
            } else {
                this.B = false;
                this.C = (char) 0;
                if (this.f78021i == this.F && this.f78014b.f78203g.length() == 0) {
                    this.f78020h.t(this.K);
                    this.f78014b.f78212p = this.Q;
                    Z0();
                    this.f78020h.t(true);
                    if (!this.B || this.L != UnescapedQuoteHandling.BACK_TO_DELIMITER || this.f78014b.f78203g.length() != 0) {
                        this.f78014b.n();
                    }
                } else if (this.f88157y) {
                    P0();
                    if (this.f78031s) {
                        this.f78014b.f78203g.o();
                    }
                    this.f78014b.n();
                } else {
                    this.f78014b.f78212p = this.f78031s;
                    c1();
                    this.f78014b.n();
                }
            }
            if (this.f78021i != this.I) {
                char c13 = this.f78020h.c();
                this.f78021i = c13;
                if (c13 == this.I) {
                    this.f78014b.b();
                }
            }
        }
    }

    public final void Y0() {
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16 = this.C;
        if (c16 != 0 && this.f88155w) {
            if (this.L == UnescapedQuoteHandling.SKIP_VALUE) {
                f1();
                return;
            }
            if (!this.A) {
                this.f78014b.f78203g.q(this.F);
            }
            char c17 = this.f78020h.c();
            this.f78021i = c17;
            x xVar = this.f78014b;
            xVar.f78212p = this.f78031s;
            this.f78021i = xVar.f78203g.u(c17, this.f78020h, this.D, this.I);
            return;
        }
        if (this.A && c16 == 0) {
            this.f78014b.f78203g.append(this.F);
        }
        char c18 = this.f78020h.c();
        this.f78021i = c18;
        if (this.P && c18 <= ' ' && this.f78014b.f78203g.length() == 0) {
            do {
                c15 = this.f78020h.c();
                this.f78021i = c15;
            } while (c15 <= ' ');
        }
        while (true) {
            char c19 = this.C;
            char c21 = this.F;
            if (c19 == c21 && (((c14 = this.f78021i) <= ' ' && this.f78030r < c14) || c14 == this.D || c14 == this.I)) {
                break;
            }
            char c22 = this.f78021i;
            if (c22 == c21 || c22 == (c11 = this.G)) {
                d1();
                this.C = this.f78021i;
                char c23 = this.f78020h.c();
                this.f78021i = c23;
                if (this.B && (c23 == this.D || c23 == this.I)) {
                    return;
                }
            } else if (c19 != c21) {
                if (c19 == c11 && c11 != 0) {
                    this.f78014b.f78203g.append(c11);
                }
                char r11 = this.f78014b.f78203g.r(this.f78021i, this.f78020h, this.F, this.G, this.H);
                this.f78021i = r11;
                this.C = r11;
                this.f78021i = this.f78020h.c();
            } else if (!R0() || this.L != UnescapedQuoteHandling.SKIP_VALUE) {
                return;
            }
        }
        char c24 = this.f78021i;
        if (c24 != this.D && c24 != this.I && c24 <= ' ' && this.f78030r < c24) {
            this.J.reset();
            do {
                this.J.append(this.f78021i);
                c12 = this.f78020h.c();
                this.f78021i = c12;
                if (c12 != this.I) {
                    if (c12 > ' ' || this.f78030r >= c12) {
                        break;
                    }
                } else {
                    if (this.A) {
                        this.f78014b.f78203g.append(this.F);
                        return;
                    }
                    return;
                }
            } while (c12 != this.D);
            if (c12 != this.D && this.f88154v) {
                k90.a aVar = this.f78014b.f78203g;
                if (aVar instanceof k90.d) {
                    aVar.append(this.F);
                    ((k90.d) this.f78014b.f78203g).h(this.J);
                }
                if (this.f88155w || ((c13 = this.f78021i) != this.F && c13 != this.G)) {
                    this.f78014b.f78203g.append(this.f78021i);
                }
                this.C = this.f78021i;
                Y0();
            } else if (this.A) {
                this.f78014b.f78203g.append(this.F);
            }
        } else if (this.A) {
            this.f78014b.f78203g.append(this.F);
        }
        char c25 = this.f78021i;
        if (c25 == this.D || c25 == this.I) {
            return;
        }
        throw new TextParsingException(this.f78018f, "Unexpected character '" + this.f78021i + "' following quoted value of CSV field. Expecting '" + this.D + "'. Cannot parse CSV input.");
    }

    public final void Z0() {
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16 = this.C;
        if (c16 == 0 || !this.f88155w) {
            if (this.A && c16 == 0) {
                this.f78014b.f78203g.append(this.F);
            }
            char c17 = this.f78020h.c();
            this.f78021i = c17;
            if (this.P && c17 <= ' ' && this.f78014b.f78203g.length() == 0) {
                do {
                    c13 = this.f78020h.c();
                    this.f78021i = c13;
                } while (c13 <= ' ');
            }
            while (true) {
                char c18 = this.C;
                char c19 = this.F;
                if (c18 == c19 && (((c12 = this.f78021i) <= ' ' && this.f78030r < c12) || c12 == this.I)) {
                    break;
                }
                if (c18 == c19 && U0()) {
                    if (this.A) {
                        this.f78014b.f78203g.append(this.F);
                        return;
                    }
                    return;
                }
                char c21 = this.f78021i;
                char c22 = this.F;
                if (c21 == c22 || c21 == (c11 = this.G)) {
                    d1();
                    this.C = this.f78021i;
                    char c23 = this.f78020h.c();
                    this.f78021i = c23;
                    if (this.B && (c23 == this.I || U0())) {
                        return;
                    }
                } else {
                    char c24 = this.C;
                    if (c24 != c22) {
                        if (c24 == c11 && c11 != 0) {
                            this.f78014b.f78203g.append(c11);
                        }
                        char r11 = this.f78014b.f78203g.r(this.f78021i, this.f78020h, this.F, this.G, this.H);
                        this.f78021i = r11;
                        this.C = r11;
                        this.f78021i = this.f78020h.c();
                    } else if (!R0() || this.L != UnescapedQuoteHandling.SKIP_VALUE) {
                        return;
                    }
                }
            }
        } else {
            if (this.L == UnescapedQuoteHandling.SKIP_VALUE) {
                f1();
                return;
            }
            if (!this.A) {
                this.f78014b.f78203g.q(this.F);
            }
            this.f78021i = this.f78020h.c();
            this.f78014b.f78212p = this.f78031s;
            P0();
        }
        char c25 = this.f78021i;
        if (c25 == this.I || c25 > ' ' || this.f78030r >= c25 || V0()) {
            if (this.A) {
                if (!this.B || this.L == UnescapedQuoteHandling.STOP_AT_CLOSING_QUOTE) {
                    this.f78014b.f78203g.append(this.F);
                    return;
                }
                return;
            }
            return;
        }
        this.J.reset();
        do {
            this.J.append(this.f78021i);
            char c26 = this.f78020h.c();
            this.f78021i = c26;
            if (c26 != this.I) {
                if (!V0()) {
                    c14 = this.f78021i;
                    if (c14 > ' ') {
                        break;
                    }
                } else {
                    return;
                }
            } else {
                if (this.A) {
                    this.f78014b.f78203g.append(this.F);
                    return;
                }
                return;
            }
        } while (this.f78030r < c14);
        if (!this.f88154v || V0()) {
            if (this.A) {
                this.f78014b.f78203g.append(this.F);
                return;
            }
            return;
        }
        k90.a aVar = this.f78014b.f78203g;
        if (aVar instanceof k90.d) {
            aVar.append(this.F);
            ((k90.d) this.f78014b.f78203g).h(this.J);
        }
        if (this.f88155w || ((c15 = this.f78021i) != this.F && c15 != this.G)) {
            this.f78014b.f78203g.append(this.f78021i);
        }
        this.C = this.f78021i;
        Y0();
    }

    public final void a1() {
        char c11 = this.f78021i;
        if (c11 <= ' ' && this.f78032t && this.f78030r < c11) {
            this.f78021i = this.f78020h.p(c11, this.D, this.F);
        }
        while (true) {
            char c12 = this.f78021i;
            if (c12 == this.I) {
                return;
            }
            if (c12 <= ' ' && this.f78032t && this.f78030r < c12) {
                this.f78021i = this.f78020h.p(c12, this.D, this.F);
            }
            char c13 = this.f78021i;
            if (c13 == this.D || c13 == this.I) {
                this.f78014b.b();
            } else {
                this.B = false;
                this.C = (char) 0;
                if (c13 == this.F) {
                    this.f78020h.t(this.K);
                    int length = this.f78014b.f78203g.length();
                    if (length == 0) {
                        String l11 = this.f78020h.l(this.F, this.G, this.H, this.N, this.D, this.I, this.A, this.f88158z, this.P, this.Q);
                        if (l11 != null) {
                            x xVar = this.f78014b;
                            if (l11 == "") {
                                l11 = this.O;
                            }
                            xVar.o(l11);
                            this.f78020h.t(true);
                            try {
                                char c14 = this.f78020h.c();
                                this.f78021i = c14;
                                if (c14 == this.D) {
                                    try {
                                        char c15 = this.f78020h.c();
                                        this.f78021i = c15;
                                        if (c15 == this.I) {
                                            this.f78014b.b();
                                        }
                                    } catch (EOFException unused) {
                                        this.f78014b.b();
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (EOFException unused2) {
                                return;
                            }
                        } else {
                            this.f78014b.f78212p = this.Q;
                            Y0();
                            this.f78020h.t(true);
                            if (this.B || this.L != UnescapedQuoteHandling.BACK_TO_DELIMITER || this.f78014b.f78203g.length() != 0) {
                                this.f78014b.n();
                            }
                        }
                    } else {
                        if (length == -1 && this.f78020h.k(this.F, this.G, this.D, this.I)) {
                            this.f78014b.n();
                            char c16 = this.f78020h.c();
                            this.f78021i = c16;
                            if (c16 == this.D) {
                                try {
                                    char c17 = this.f78020h.c();
                                    this.f78021i = c17;
                                    if (c17 == this.I) {
                                        this.f78014b.b();
                                    }
                                } catch (EOFException unused3) {
                                    this.f78014b.b();
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        this.f78014b.f78212p = this.Q;
                        Y0();
                        this.f78020h.t(true);
                        if (this.B) {
                        }
                        this.f78014b.n();
                    }
                } else if (this.f88157y) {
                    int length2 = this.f78014b.f78203g.length();
                    String q11 = length2 == 0 ? this.f78020h.q(this.f78021i, this.D, this.f78031s, this.M, this.N) : null;
                    if (q11 != null) {
                        this.f78014b.o(q11);
                        this.f78021i = this.f78020h.b();
                    } else {
                        if (length2 != -1) {
                            x xVar2 = this.f78014b;
                            xVar2.f78212p = this.f78031s;
                            this.f78021i = xVar2.f78203g.u(this.f78021i, this.f78020h, this.D, this.I);
                        } else if (this.f78020h.m(this.f78021i, this.D)) {
                            this.f78021i = this.f78020h.b();
                        } else {
                            this.f78021i = this.f78014b.f78203g.u(this.f78021i, this.f78020h, this.D, this.I);
                        }
                        this.f78014b.n();
                    }
                } else {
                    this.f78014b.f78212p = this.f78031s;
                    b1();
                    this.f78014b.n();
                }
            }
            if (this.f78021i != this.I) {
                char c18 = this.f78020h.c();
                this.f78021i = c18;
                if (c18 == this.I) {
                    this.f78014b.b();
                }
            }
        }
    }

    public final void b1() {
        while (true) {
            char c11 = this.f78021i;
            if (c11 == this.D || c11 == this.I) {
                return;
            }
            char c12 = this.F;
            if (c11 == c12 || c11 == this.G) {
                d1();
            } else {
                if (this.C == c12) {
                    S0();
                    return;
                }
                this.f78014b.f78203g.append(c11);
            }
            this.C = this.f78021i;
            this.f78021i = this.f78020h.c();
        }
    }

    public final void c1() {
        while (this.f78021i != this.I && !U0()) {
            char c11 = this.f78021i;
            char c12 = this.F;
            if (c11 == c12 || c11 == this.G) {
                d1();
            } else {
                if (this.C == c12) {
                    S0();
                    return;
                }
                this.f78014b.f78203g.append(c11);
            }
            this.C = this.f78021i;
            this.f78021i = this.f78020h.c();
        }
    }

    public final void d1() {
        char c11 = this.f78021i;
        char c12 = this.G;
        if (c11 == c12) {
            char c13 = this.C;
            char c14 = this.H;
            if (c13 == c14 && c14 != 0) {
                if (this.f88158z) {
                    this.f78014b.f78203g.append(c14);
                }
                this.f78014b.f78203g.append(this.G);
                this.f78021i = (char) 0;
                return;
            }
        }
        char c15 = this.C;
        if (c15 == c12) {
            if (c11 != this.F) {
                this.f78014b.f78203g.append(c15);
                return;
            }
            if (this.f88158z) {
                this.f78014b.f78203g.append(c12);
            }
            this.f78014b.f78203g.append(this.F);
            this.f78021i = (char) 0;
            return;
        }
        char c16 = this.F;
        if (c11 == c16 && c15 == c16) {
            this.f78014b.f78203g.append(c16);
        } else if (c15 == c16) {
            S0();
        }
    }

    public final void e1() {
        int i11 = this.S;
        if (i11 > 0) {
            char[] cArr = this.E;
            if (i11 < cArr.length) {
                this.f78014b.f78203g.append(cArr, 0, i11);
            }
            this.S = 0;
        }
    }

    public final void f1() {
        char c11;
        this.f78014b.f78203g.reset();
        this.f78014b.f78203g = j.h();
        if (this.E == null) {
            this.f78021i = j.h().u(this.f78021i, this.f78020h, this.D, this.I);
            return;
        }
        while (true) {
            int i11 = this.S;
            char[] cArr = this.E;
            if (i11 >= cArr.length || (c11 = this.f78021i) == this.I) {
                return;
            }
            if (cArr[i11] == c11) {
                this.S = i11 + 1;
            } else {
                this.S = 0;
            }
            this.f78021i = this.f78020h.c();
        }
    }

    public final void g1() {
        while (true) {
            char c11 = this.f78021i;
            if (c11 > ' ' || this.S >= this.E.length || c11 == this.I || c11 == this.F || this.f78030r >= c11) {
                break;
            }
            char c12 = this.f78020h.c();
            this.f78021i = c12;
            if (this.E[this.S] == c12 && U0()) {
                this.f78014b.b();
                this.f78021i = this.f78020h.c();
            }
        }
        e1();
    }

    public final void h1(s90.b bVar) {
        this.I = bVar.g();
        char[] charArray = bVar.t().toCharArray();
        this.E = charArray;
        if (charArray.length == 1) {
            this.E = null;
            char s11 = bVar.s();
            this.D = s11;
            this.R = new char[]{s11, this.I};
        } else {
            this.R = new char[]{charArray[0], this.I};
        }
        this.F = bVar.u();
        this.G = bVar.v();
        this.H = bVar.q();
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.b
    public final boolean i() {
        char c11;
        char c12 = this.f78021i;
        char c13 = this.F;
        if (c12 == c13) {
            if (this.C == c13) {
                if (this.A) {
                    this.f78014b.f78203g.append(c13);
                }
                return true;
            }
            if (!this.B) {
                this.f78014b.f78203g.append(c13);
            }
        }
        boolean z11 = (this.C == 0 || (c11 = this.f78021i) == this.D || c11 == this.I || c11 == this.f78016d) ? false : true;
        this.C = (char) 0;
        this.f78021i = (char) 0;
        if (this.S <= 0) {
            return z11;
        }
        e1();
        return true;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.b
    public final k90.g n() {
        if (((e) this.f78013a).j1() || ((e) this.f78013a).p1()) {
            return new a(this.T, (e) this.f78013a, this.f78030r);
        }
        return null;
    }
}
