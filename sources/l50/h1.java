package l50;

import kotlin.KotlinNothingValueException;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n*L\n204#1:220\n*E\n"})
/* loaded from: classes8.dex */
public final class h1 extends f1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(@m80.k c0 reader, @m80.k char[] buffer) {
        super(reader, buffer);
        kotlin.jvm.internal.g0.p(reader, "reader");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
    }

    @Override // l50.a
    public byte O() {
        y();
        i H = H();
        int V = V();
        if (V >= H.length() || V == -1) {
            return (byte) 10;
        }
        this.f69912a = V;
        return b.a(H.charAt(V));
    }

    @Override // l50.f1, l50.a
    public int V() {
        int Q;
        int i11 = this.f69912a;
        while (true) {
            Q = Q(i11);
            if (Q != -1) {
                char charAt = H().charAt(Q);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    if (charAt != '/' || Q + 1 >= H().length()) {
                        break;
                    }
                    Pair<Integer, Boolean> k02 = k0(Q);
                    int intValue = k02.component1().intValue();
                    if (!k02.component2().booleanValue()) {
                        Q = intValue;
                        break;
                    }
                    i11 = intValue;
                } else {
                    i11 = Q + 1;
                }
            } else {
                break;
            }
        }
        this.f69912a = Q;
        return Q;
    }

    @Override // l50.f1, l50.a
    public boolean f() {
        y();
        int V = V();
        if (V >= H().length() || V == -1) {
            return false;
        }
        return L(H().charAt(V));
    }

    public final Pair<Integer, Boolean> k0(int i11) {
        int i12 = i11 + 2;
        char charAt = H().charAt(i11 + 1);
        if (charAt != '*') {
            if (charAt != '/') {
                return yz.h1.a(Integer.valueOf(i11), Boolean.FALSE);
            }
            int i13 = i12;
            while (i11 != -1) {
                int I3 = u30.k0.I3(H(), '\n', i13, false, 4, null);
                if (I3 != -1) {
                    return yz.h1.a(Integer.valueOf(I3 + 1), Boolean.TRUE);
                }
                i13 = Q(H().length());
                i11 = i13;
            }
            return yz.h1.a(-1, Boolean.TRUE);
        }
        boolean z11 = false;
        int i14 = i12;
        while (i11 != -1) {
            int J3 = u30.k0.J3(H(), r60.e.f83303c, i14, false, 4, null);
            if (J3 != -1) {
                return yz.h1.a(Integer.valueOf(J3 + 2), Boolean.TRUE);
            }
            if (H().charAt(H().length() - 1) == '*') {
                i14 = l0(H().length() - 1);
                if (z11) {
                    break;
                }
                z11 = true;
            } else {
                i14 = Q(H().length());
            }
            i11 = i14;
        }
        this.f69912a = H().length();
        a.B(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // l50.f1, l50.a
    public byte l() {
        y();
        i H = H();
        int V = V();
        if (V >= H.length() || V == -1) {
            return (byte) 10;
        }
        this.f69912a = V + 1;
        return b.a(H.charAt(V));
    }

    public final int l0(int i11) {
        if (H().length() - i11 > this.f69991g) {
            return i11;
        }
        this.f69912a = i11;
        y();
        return (this.f69912a != 0 || H().length() == 0) ? -1 : 0;
    }

    @Override // l50.f1, l50.a
    public void n(char c11) {
        y();
        i H = H();
        int V = V();
        if (V >= H.length() || V == -1) {
            this.f69912a = -1;
            b0(c11);
        }
        char charAt = H.charAt(V);
        this.f69912a = V + 1;
        if (charAt == c11) {
            return;
        }
        b0(c11);
    }
}
