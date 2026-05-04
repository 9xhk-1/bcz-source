package l50;

import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nReaderJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,221:1\n158#2:222\n158#2:223\n158#2:224\n226#2,10:225\n229#3:235\n*S KotlinDebug\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n*L\n66#1:222\n133#1:223\n150#1:224\n181#1:225,10\n181#1:235\n*E\n"})
/* loaded from: classes8.dex */
public class f1 extends a {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0 f69989e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final char[] f69990f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public int f69991g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final i f69992h;

    public /* synthetic */ f1(c0 c0Var, char[] cArr, int i11, kotlin.jvm.internal.v vVar) {
        this(c0Var, (i11 & 2) != 0 ? p.f70044c.d() : cArr);
    }

    @Override // l50.a
    public int I(char c11, int i11) {
        i H = H();
        int length = H.length();
        while (i11 < length) {
            if (H.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // l50.a
    @m80.l
    public String N(@m80.k String keyToMatch, boolean z11) {
        kotlin.jvm.internal.g0.p(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // l50.a
    public int Q(int i11) {
        if (i11 < H().length()) {
            return i11;
        }
        this.f69912a = i11;
        y();
        return (this.f69912a != 0 || H().length() == 0) ? -1 : 0;
    }

    @Override // l50.a
    public int V() {
        int Q;
        char charAt;
        int i11 = this.f69912a;
        while (true) {
            Q = Q(i11);
            if (Q == -1 || !((charAt = H().charAt(Q)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i11 = Q + 1;
        }
        this.f69912a = Q;
        return Q;
    }

    @Override // l50.a
    @m80.k
    public String W(int i11, int i12) {
        return H().substring(i11, i12);
    }

    @Override // l50.a
    public void e(int i11, int i12) {
        StringBuilder G = G();
        G.append(H().j(), i11, i12 - i11);
        kotlin.jvm.internal.g0.o(G, "append(...)");
    }

    @Override // l50.a
    public boolean f() {
        y();
        int i11 = this.f69912a;
        while (true) {
            int Q = Q(i11);
            if (Q == -1) {
                this.f69912a = Q;
                return false;
            }
            char charAt = H().charAt(Q);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f69912a = Q;
                return L(charAt);
            }
            i11 = Q + 1;
        }
    }

    @m80.k
    public final char[] f0() {
        return this.f69990f;
    }

    @m80.k
    public final c0 g0() {
        return this.f69989e;
    }

    @Override // l50.a
    @m80.k
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public i H() {
        return this.f69992h;
    }

    public final void i0(int i11) {
        char[] j11 = H().j();
        if (i11 != 0) {
            int i12 = this.f69912a;
            a00.q.w0(j11, j11, 0, i12, i12 + i11);
        }
        int length = H().length();
        while (true) {
            if (i11 == length) {
                break;
            }
            int a11 = this.f69989e.a(j11, i11, length - i11);
            if (a11 == -1) {
                H().E(i11);
                this.f69991g = -1;
                break;
            }
            i11 += a11;
        }
        this.f69912a = 0;
    }

    public final void j0() {
        p.f70044c.c(this.f69990f);
    }

    @Override // l50.a
    @m80.k
    public String k() {
        n('\"');
        int i11 = this.f69912a;
        int I = I('\"', i11);
        if (I != -1) {
            for (int i12 = i11; i12 < I; i12++) {
                if (H().charAt(i12) == '\\') {
                    return s(H(), this.f69912a, i12);
                }
            }
            this.f69912a = I + 1;
            return W(i11, I);
        }
        int Q = Q(i11);
        if (Q != -1) {
            return s(H(), this.f69912a, Q);
        }
        String c11 = b.c((byte) 1);
        int i13 = this.f69912a;
        int i14 = i13 - 1;
        a.B(this, "Expected " + c11 + ", but had '" + ((i13 == H().length() || i14 < 0) ? "EOF" : String.valueOf(H().charAt(i14))) + "' instead", i14, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // l50.a
    public byte l() {
        y();
        i H = H();
        int i11 = this.f69912a;
        while (true) {
            int Q = Q(i11);
            if (Q == -1) {
                this.f69912a = Q;
                return (byte) 10;
            }
            int i12 = Q + 1;
            byte a11 = b.a(H.charAt(Q));
            if (a11 != 3) {
                this.f69912a = i12;
                return a11;
            }
            i11 = i12;
        }
    }

    @Override // l50.a
    public void n(char c11) {
        y();
        i H = H();
        int i11 = this.f69912a;
        while (true) {
            int Q = Q(i11);
            if (Q == -1) {
                this.f69912a = Q;
                b0(c11);
                return;
            }
            int i12 = Q + 1;
            char charAt = H.charAt(Q);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f69912a = i12;
                if (charAt == c11) {
                    return;
                } else {
                    b0(c11);
                }
            }
            i11 = i12;
        }
    }

    @Override // l50.a
    public void y() {
        int length = H().length() - this.f69912a;
        if (length > this.f69991g) {
            return;
        }
        i0(length);
    }

    public f1(@m80.k c0 reader, @m80.k char[] buffer) {
        kotlin.jvm.internal.g0.p(reader, "reader");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        this.f69989e = reader;
        this.f69990f = buffer;
        this.f69991g = 128;
        this.f69992h = new i(buffer);
        i0(0);
    }
}
