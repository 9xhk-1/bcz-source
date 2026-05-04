package l50;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n158#2:130\n158#2:131\n158#2:132\n158#2:133\n226#2,10:134\n229#3:144\n1869#4,2:145\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n23#1:130\n38#1:131\n57#1:132\n73#1:133\n95#1:134,10\n95#1:144\n109#1:145,2\n*E\n"})
/* loaded from: classes8.dex */
public class n1 extends a {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f70039e;

    public n1(@m80.k String source) {
        kotlin.jvm.internal.g0.p(source, "source");
        this.f70039e = source;
    }

    @Override // l50.a
    @m80.l
    public String N(@m80.k String keyToMatch, boolean z11) {
        kotlin.jvm.internal.g0.p(keyToMatch, "keyToMatch");
        int i11 = this.f69912a;
        try {
            if (l() == 6 && kotlin.jvm.internal.g0.g(P(z11), keyToMatch)) {
                x();
                if (l() == 5) {
                    return P(z11);
                }
            }
            return null;
        } finally {
            this.f69912a = i11;
            x();
        }
    }

    @Override // l50.a
    public int Q(int i11) {
        if (i11 < H().length()) {
            return i11;
        }
        return -1;
    }

    @Override // l50.a
    public int V() {
        char charAt;
        int i11 = this.f69912a;
        if (i11 == -1) {
            return i11;
        }
        String H = H();
        while (i11 < H.length() && ((charAt = H.charAt(i11)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i11++;
        }
        this.f69912a = i11;
        return i11;
    }

    @Override // l50.a
    public boolean f() {
        int i11 = this.f69912a;
        if (i11 == -1) {
            return false;
        }
        String H = H();
        while (i11 < H.length()) {
            char charAt = H.charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f69912a = i11;
                return L(charAt);
            }
            i11++;
        }
        this.f69912a = i11;
        return false;
    }

    @Override // l50.a
    @m80.k
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public String H() {
        return this.f70039e;
    }

    @Override // l50.a
    @m80.k
    public String k() {
        n('\"');
        int i11 = this.f69912a;
        int I3 = u30.k0.I3(H(), '\"', i11, false, 4, null);
        if (I3 != -1) {
            for (int i12 = i11; i12 < I3; i12++) {
                if (H().charAt(i12) == '\\') {
                    return s(H(), this.f69912a, i12);
                }
            }
            this.f69912a = I3 + 1;
            String substring = H().substring(i11, I3);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return substring;
        }
        u();
        String c11 = b.c((byte) 1);
        int i13 = this.f69912a;
        a.B(this, "Expected " + c11 + ", but had '" + ((i13 == H().length() || i13 < 0) ? "EOF" : String.valueOf(H().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // l50.a
    public byte l() {
        String H = H();
        int i11 = this.f69912a;
        while (i11 != -1 && i11 < H.length()) {
            int i12 = i11 + 1;
            char charAt = H.charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f69912a = i12;
                return b.a(charAt);
            }
            i11 = i12;
        }
        this.f69912a = H.length();
        return (byte) 10;
    }

    @Override // l50.a
    public void n(char c11) {
        if (this.f69912a == -1) {
            b0(c11);
        }
        String H = H();
        int i11 = this.f69912a;
        while (i11 < H.length()) {
            int i12 = i11 + 1;
            char charAt = H.charAt(i11);
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
        this.f69912a = -1;
        b0(c11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l50.a
    public void t(boolean z11, @m80.k x00.l<? super String, g2> consumeChunk) {
        kotlin.jvm.internal.g0.p(consumeChunk, "consumeChunk");
        Iterator<T> it = u30.r0.V6(z11 ? u() : r(), 16384).iterator();
        while (it.hasNext()) {
            consumeChunk.invoke(it.next());
        }
    }
}
