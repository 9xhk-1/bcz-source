package l50;

import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n*L\n66#1:220\n*E\n"})
/* loaded from: classes8.dex */
public final class p1 extends n1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(@m80.k String source) {
        super(source);
        kotlin.jvm.internal.g0.p(source, "source");
    }

    @Override // l50.a
    public byte O() {
        String H = H();
        int V = V();
        if (V >= H.length() || V == -1) {
            return (byte) 10;
        }
        this.f69912a = V;
        return b.a(H.charAt(V));
    }

    @Override // l50.n1, l50.a
    public int V() {
        int i11;
        int i12 = this.f69912a;
        if (i12 == -1) {
            return i12;
        }
        String H = H();
        while (i12 < H.length()) {
            char charAt = H.charAt(i12);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i11 = i12 + 1) >= H.length()) {
                    break;
                }
                char charAt2 = H.charAt(i11);
                if (charAt2 == '*') {
                    int J3 = u30.k0.J3(H, r60.e.f83303c, i12 + 2, false, 4, null);
                    if (J3 == -1) {
                        this.f69912a = H.length();
                        a.B(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i12 = J3 + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i12 = u30.k0.I3(H, '\n', i12 + 2, false, 4, null);
                    if (i12 == -1) {
                        i12 = H.length();
                    }
                }
            }
            i12++;
        }
        this.f69912a = i12;
        return i12;
    }

    @Override // l50.n1, l50.a
    public boolean f() {
        int V = V();
        if (V >= H().length() || V == -1) {
            return false;
        }
        return L(H().charAt(V));
    }

    @Override // l50.n1, l50.a
    public byte l() {
        String H = H();
        int V = V();
        if (V >= H.length() || V == -1) {
            return (byte) 10;
        }
        this.f69912a = V + 1;
        return b.a(H.charAt(V));
    }

    @Override // l50.n1, l50.a
    public void n(char c11) {
        String H = H();
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
