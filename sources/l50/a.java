package l50;

import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,763:1\n226#1,10:764\n755#1,5:775\n226#1,10:780\n226#1,10:792\n229#2:774\n229#2:790\n1#3:791\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n206#1:764,10\n216#1:775,5\n223#1:780,10\n685#1:792,10\n206#1:774\n223#1:790\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public int f69912a;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public String f69914c;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final q0 f69913b = new q0();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public StringBuilder f69915d = new StringBuilder();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,763:1\n*E\n"})
    /* renamed from: l50.a$a, reason: collision with other inner class name */
    public static final class C0842a implements x00.p<String, String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0842a f69916a = new C0842a();

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String expected, String source) {
            kotlin.jvm.internal.g0.p(expected, "expected");
            kotlin.jvm.internal.g0.p(source, "source");
            return "Expected " + expected + ", but had '" + source + "' instead";
        }
    }

    public static /* synthetic */ Void B(a aVar, String str, int i11, String str2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f69912a;
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        return aVar.A(str, i11, str2);
    }

    public static /* synthetic */ Void D(a aVar, byte b11, boolean z11, x00.p message, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            message = C0842a.f69916a;
        }
        kotlin.jvm.internal.g0.p(message, "message");
        String c11 = b.c(b11);
        int i12 = z11 ? aVar.f69912a - 1 : aVar.f69912a;
        B(aVar, (String) message.invoke(c11, (aVar.f69912a == aVar.H().length() || i12 < 0) ? "EOF" : String.valueOf(aVar.H().charAt(i12))), i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void S(a aVar, boolean z11, int i11, x00.a message, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f69912a;
        }
        int i13 = i11;
        kotlin.jvm.internal.g0.p(message, "message");
        if (z11) {
            return;
        }
        B(aVar, (String) message.invoke(), i13, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ boolean a0(a aVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return aVar.Z(z11);
    }

    public static final double p(long j11, boolean z11) {
        if (!z11) {
            return Math.pow(10.0d, -j11);
        }
        if (z11) {
            return Math.pow(10.0d, j11);
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public final Void A(@m80.k String message, int i11, @m80.k String hint) {
        String str;
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw i0.f(i11, message + " at path: " + this.f69913b.a() + str, H());
    }

    @m80.k
    public final Void C(byte b11, boolean z11, @m80.k x00.p<? super String, ? super String, String> message) {
        kotlin.jvm.internal.g0.p(message, "message");
        String c11 = b.c(b11);
        int i11 = z11 ? this.f69912a - 1 : this.f69912a;
        B(this, message.invoke(c11, (this.f69912a == H().length() || i11 < 0) ? "EOF" : String.valueOf(H().charAt(i11))), i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void E(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        int Y3 = u30.k0.Y3(W(0, this.f69912a), key, 0, false, 6, null);
        throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + Y3 + " at path: " + this.f69913b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) i0.i(H(), Y3)));
    }

    public final int F(CharSequence charSequence, int i11) {
        char charAt = charSequence.charAt(i11);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        B(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @m80.k
    public final StringBuilder G() {
        return this.f69915d;
    }

    @m80.k
    public abstract CharSequence H();

    public int I(char c11, int i11) {
        return u30.k0.I3(H(), c11, i11, false, 4, null);
    }

    public final boolean J(boolean z11, char c11) {
        return z11 ? b.a(c11) == 0 : c11 != '\"';
    }

    public final boolean K() {
        return O() != 10;
    }

    public final boolean L(char c11) {
        return (c11 == ',' || c11 == ':' || c11 == ']' || c11 == '}') ? false : true;
    }

    public final boolean M(char c11) {
        return c11 == ' ' || c11 == '\n' || c11 == '\r' || c11 == '\t';
    }

    @m80.l
    public abstract String N(@m80.k String str, boolean z11);

    public byte O() {
        CharSequence H = H();
        int i11 = this.f69912a;
        while (true) {
            int Q = Q(i11);
            if (Q == -1) {
                this.f69912a = Q;
                return (byte) 10;
            }
            char charAt = H.charAt(Q);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f69912a = Q;
                return b.a(charAt);
            }
            i11 = Q + 1;
        }
    }

    @m80.l
    public final String P(boolean z11) {
        String r11;
        byte O = O();
        if (z11) {
            if (O != 1 && O != 0) {
                return null;
            }
            r11 = u();
        } else {
            if (O != 1) {
                return null;
            }
            r11 = r();
        }
        this.f69914c = r11;
        return r11;
    }

    public abstract int Q(int i11);

    public final void R(boolean z11, int i11, @m80.k x00.a<String> message) {
        kotlin.jvm.internal.g0.p(message, "message");
        if (z11) {
            return;
        }
        B(this, message.invoke(), i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void T(@m80.k StringBuilder sb2) {
        kotlin.jvm.internal.g0.p(sb2, "<set-?>");
        this.f69915d = sb2;
    }

    public final void U(boolean z11) {
        ArrayList arrayList = new ArrayList();
        byte O = O();
        if (O != 8 && O != 6) {
            u();
            return;
        }
        while (true) {
            byte O2 = O();
            if (O2 != 1) {
                if (O2 == 8 || O2 == 6) {
                    arrayList.add(Byte.valueOf(O2));
                } else if (O2 == 9) {
                    if (((Number) a00.r0.u3(arrayList)).byteValue() != 8) {
                        throw i0.f(this.f69912a, "found ] instead of } at path: " + this.f69913b, H());
                    }
                    a00.m0.Q0(arrayList);
                } else if (O2 == 7) {
                    if (((Number) a00.r0.u3(arrayList)).byteValue() != 6) {
                        throw i0.f(this.f69912a, "found } instead of ] at path: " + this.f69913b, H());
                    }
                    a00.m0.Q0(arrayList);
                } else if (O2 == 10) {
                    B(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                l();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z11) {
                u();
            } else {
                k();
            }
        }
    }

    public abstract int V();

    @m80.k
    public String W(int i11, int i12) {
        return H().subSequence(i11, i12).toString();
    }

    public final String X() {
        String str = this.f69914c;
        kotlin.jvm.internal.g0.m(str);
        this.f69914c = null;
        return str;
    }

    public final boolean Y() {
        int V = V();
        CharSequence H = H();
        if (V >= H.length() || V == -1 || H.charAt(V) != ',') {
            return false;
        }
        this.f69912a++;
        return true;
    }

    public final boolean Z(boolean z11) {
        int Q = Q(V());
        int length = H().length() - Q;
        if (length < 4 || Q == -1) {
            return false;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            if ("null".charAt(i11) != H().charAt(Q + i11)) {
                return false;
            }
        }
        if (length > 4 && b.a(H().charAt(Q + 4)) == 0) {
            return false;
        }
        if (!z11) {
            return true;
        }
        this.f69912a = Q + 4;
        return true;
    }

    public final int b(int i11) {
        int Q = Q(i11);
        if (Q == -1) {
            B(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i12 = Q + 1;
        char charAt = H().charAt(Q);
        if (charAt == 'u') {
            return d(H(), i12);
        }
        char b11 = b.b(charAt);
        if (b11 != 0) {
            this.f69915d.append(b11);
            return i12;
        }
        B(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void b0(char c11) {
        int i11 = this.f69912a;
        if (i11 > 0 && c11 == '\"') {
            try {
                this.f69912a = i11 - 1;
                String u11 = u();
                this.f69912a = i11;
                if (kotlin.jvm.internal.g0.g(u11, "null")) {
                    A("Expected string literal but 'null' literal was found", this.f69912a - 1, b.f69920b);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.f69912a = i11;
                throw th2;
            }
        }
        String c12 = b.c(b.a(c11));
        int i12 = this.f69912a;
        int i13 = i12 - 1;
        B(this, "Expected " + c12 + ", but had '" + ((i12 == H().length() || i13 < 0) ? "EOF" : String.valueOf(H().charAt(i13))) + "' instead", i13, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final int c(int i11, int i12) {
        e(i11, i12);
        return b(i12 + 1);
    }

    public final boolean c0() {
        return H().charAt(this.f69912a - 1) != '\"';
    }

    public final int d(CharSequence charSequence, int i11) {
        int i12 = i11 + 4;
        if (i12 < charSequence.length()) {
            this.f69915d.append((char) ((F(charSequence, i11) << 12) + (F(charSequence, i11 + 1) << 8) + (F(charSequence, i11 + 2) << 4) + F(charSequence, i11 + 3)));
            return i12;
        }
        this.f69912a = i11;
        y();
        if (this.f69912a + 4 < charSequence.length()) {
            return d(charSequence, this.f69912a);
        }
        B(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final <T> T d0(x00.a<? extends T> aVar) {
        int i11 = this.f69912a;
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.d0.d(1);
            this.f69912a = i11;
            kotlin.jvm.internal.d0.c(1);
        }
    }

    public void e(int i11, int i12) {
        this.f69915d.append(H(), i11, i12);
    }

    public final void e0(int i11, int i12, boolean z11, x00.l<? super String, g2> lVar) {
        if (z11) {
            lVar.invoke(w(i11, i12));
        } else {
            lVar.invoke(W(i11, i12));
        }
    }

    public abstract boolean f();

    public final boolean g() {
        return h(V());
    }

    public final boolean h(int i11) {
        int Q = Q(i11);
        if (Q >= H().length() || Q == -1) {
            B(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i12 = Q + 1;
        int charAt = H().charAt(Q) | ' ';
        if (charAt == 102) {
            j("alse", i12);
            return false;
        }
        if (charAt == 116) {
            j("rue", i12);
            return true;
        }
        B(this, "Expected valid boolean literal prefix, but had '" + u() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean i() {
        boolean z11;
        int V = V();
        if (V == H().length()) {
            B(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (H().charAt(V) == '\"') {
            V++;
            z11 = true;
        } else {
            z11 = false;
        }
        boolean h11 = h(V);
        if (!z11) {
            return h11;
        }
        if (this.f69912a == H().length()) {
            B(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (H().charAt(this.f69912a) == '\"') {
            this.f69912a++;
            return h11;
        }
        B(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void j(String str, int i11) {
        if (H().length() - i11 < str.length()) {
            B(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) != (H().charAt(i11 + i12) | ' ')) {
                B(this, "Expected valid boolean literal prefix, but had '" + u() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.f69912a = i11 + str.length();
    }

    @m80.k
    public abstract String k();

    public abstract byte l();

    public final byte m(byte b11) {
        byte l11 = l();
        if (l11 == b11) {
            return l11;
        }
        String c11 = b.c(b11);
        int i11 = this.f69912a;
        int i12 = i11 - 1;
        B(this, "Expected " + c11 + ", but had '" + ((i11 == H().length() || i12 < 0) ? "EOF" : String.valueOf(H().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public abstract void n(char c11);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        B(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013f, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0146, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014c, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:
    
        if (H().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015f, code lost:
    
        B(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        B(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0180, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        r18.f69912a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
    
        r1 = r10 * p(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
    
        B(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c3, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c4, code lost:
    
        B(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d5, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01df, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
    
        B(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f0, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f1, code lost:
    
        B(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0201, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0143, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.a.o():long");
    }

    public final long q() {
        long o11 = o();
        if (l() == 10) {
            return o11;
        }
        b.c((byte) 10);
        int i11 = this.f69912a;
        int i12 = i11 - 1;
        B(this, "Expected input to contain a single valid number, but got '" + ((i11 == H().length() || i12 < 0) ? "EOF" : String.valueOf(H().charAt(i12))) + "' after it", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @m80.k
    public final String r() {
        return this.f69914c != null ? X() : k();
    }

    @m80.k
    public final String s(@m80.k CharSequence source, int i11, int i12) {
        kotlin.jvm.internal.g0.p(source, "source");
        char charAt = source.charAt(i12);
        boolean z11 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                int Q = Q(c(i11, i12));
                if (Q == -1) {
                    B(this, "Unexpected EOF", Q, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z11 = true;
                i11 = Q;
                i12 = i11;
            } else {
                i12++;
                if (i12 >= source.length()) {
                    e(i11, i12);
                    int Q2 = Q(i12);
                    if (Q2 == -1) {
                        B(this, "Unexpected EOF", Q2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    i11 = Q2;
                    i12 = i11;
                    z11 = true;
                } else {
                    continue;
                }
            }
            charAt = source.charAt(i12);
        }
        String W = !z11 ? W(i11, i12) : w(i11, i12);
        this.f69912a = i12 + 1;
        return W;
    }

    public void t(boolean z11, @m80.k x00.l<? super String, g2> consumeChunk) {
        int i11;
        int i12;
        kotlin.jvm.internal.g0.p(consumeChunk, "consumeChunk");
        byte O = O();
        if (!z11 || O == 0) {
            if (!z11) {
                n('\"');
            }
            int i13 = this.f69912a;
            char charAt = H().charAt(i13);
            boolean z12 = false;
            int i14 = i13;
            while (J(z11, charAt)) {
                if (z11 || charAt != '\\') {
                    int i15 = i14 + 1;
                    i11 = i13;
                    i12 = i15;
                } else {
                    i12 = Q(c(i13, i14));
                    z12 = true;
                    i11 = i12;
                }
                if (i12 >= H().length()) {
                    e0(i11, i12, z12, consumeChunk);
                    int Q = Q(i12);
                    if (Q == -1) {
                        B(this, "EOF", Q, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    z12 = false;
                    i13 = Q;
                    i14 = i13;
                } else {
                    int i16 = i11;
                    i14 = i12;
                    i13 = i16;
                }
                charAt = H().charAt(i14);
            }
            e0(i13, i14, z12, consumeChunk);
            this.f69912a = i14;
            if (z11) {
                return;
            }
            n('\"');
        }
    }

    @m80.k
    public String toString() {
        return "JsonReader(source='" + ((Object) H()) + "', currentPosition=" + this.f69912a + ')';
    }

    @m80.k
    public final String u() {
        if (this.f69914c != null) {
            return X();
        }
        int V = V();
        if (V >= H().length() || V == -1) {
            B(this, "EOF", V, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte a11 = b.a(H().charAt(V));
        if (a11 == 1) {
            return r();
        }
        if (a11 != 0) {
            B(this, "Expected beginning of the string, but got " + H().charAt(V), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z11 = false;
        while (b.a(H().charAt(V)) == 0) {
            V++;
            if (V >= H().length()) {
                e(this.f69912a, V);
                int Q = Q(V);
                if (Q == -1) {
                    this.f69912a = V;
                    return w(0, 0);
                }
                V = Q;
                z11 = true;
            }
        }
        String W = !z11 ? W(this.f69912a, V) : w(this.f69912a, V);
        this.f69912a = V;
        return W;
    }

    @m80.k
    public final String v() {
        String u11 = u();
        if (!kotlin.jvm.internal.g0.g(u11, "null") || !c0()) {
            return u11;
        }
        B(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String w(int i11, int i12) {
        e(i11, i12);
        String sb2 = this.f69915d.toString();
        kotlin.jvm.internal.g0.o(sb2, "toString(...)");
        this.f69915d.setLength(0);
        return sb2;
    }

    public final void x() {
        this.f69914c = null;
    }

    public final void z() {
        if (l() == 10) {
            return;
        }
        B(this, "Expected EOF after parsing, but had " + H().charAt(this.f69912a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void y() {
    }
}
