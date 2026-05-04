package ix;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCodecs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Codecs.kt\nio/ktor/http/CodecsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,303:1\n1104#2,3:304\n13416#3,2:307\n1557#4:309\n1628#4,3:310\n1557#4:313\n1628#4,3:314\n1557#4:317\n1628#4,3:318\n*S KotlinDebug\n*F\n+ 1 Codecs.kt\nio/ktor/http/CodecsKt\n*L\n137#1:304,3\n148#1:307,2\n10#1:309\n10#1:310,3\n21#1:313\n21#1:314,3\n43#1:317\n43#1:318,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Set<Byte> f62764a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Set<Character> f62765b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Set<Character> f62766c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final List<Byte> f62767d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Set<Character> f62768e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final Set<Character> f62769f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final List<Byte> f62770g;

    static {
        Character valueOf = Character.valueOf(u30.u0.f91708d);
        Character valueOf2 = Character.valueOf(PublicSuffixDatabase.f77441i);
        List I4 = a00.r0.I4(a00.r0.E4(new g10.c('a', io.ktor.util.date.b.f62003i), new g10.c('A', 'Z')), new g10.c('0', '9'));
        ArrayList arrayList = new ArrayList(a00.i0.d0(I4, 10));
        Iterator it = I4.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f62764a = a00.r0.f6(arrayList);
        f62765b = a00.r0.f6(a00.r0.I4(a00.r0.E4(new g10.c('a', io.ktor.util.date.b.f62003i), new g10.c('A', 'Z')), new g10.c('0', '9')));
        f62766c = a00.r0.f6(a00.r0.I4(a00.r0.E4(new g10.c('a', 'f'), new g10.c('A', 'F')), new g10.c('0', '9')));
        Set u11 = a00.w1.u(':', '/', Character.valueOf(s60.d.f88057a), '#', '[', Character.valueOf(l50.b.f69930l), '@', valueOf2, '$', valueOf, '\'', '(', ')', '*', ',', Character.valueOf(l70.f.f70689d), '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(u11, 10));
        Iterator it2 = u11.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f62767d = arrayList2;
        f62768e = a00.w1.u(':', '@', valueOf2, '$', valueOf, '\'', '(', ')', '*', '+', ',', Character.valueOf(l70.f.f70689d), '=', '-', '.', '_', '~');
        f62769f = a00.x1.C(f62765b, a00.w1.u(valueOf2, '#', '$', valueOf, '+', '-', '.', '^', '_', '`', '|', '~'));
        List Q = a00.h0.Q('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(a00.i0.d0(Q, 10));
        Iterator it3 = Q.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f62770g = arrayList3;
    }

    public static final char A(int i11) {
        return (char) ((i11 < 0 || i11 >= 10) ? ((char) (i11 + 65)) - '\n' : i11 + 48);
    }

    public static final String B(byte b11) {
        return u30.f0.L1(new char[]{'%', A((b11 & 255) >> 4), A(b11 & 15)});
    }

    @m80.k
    public static final String C(@m80.k String str, @m80.k Set<Character> allowedSet) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(allowedSet, "allowedSet");
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (!allowedSet.contains(Character.valueOf(str.charAt(i12)))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        byte[] l11 = jz.s.l(str, u30.d.f91599b);
        int length = str.length() - i11;
        char[] cArr = new char[length + ((l11.length - length) * 3)];
        int i13 = 0;
        for (byte b11 : l11) {
            char c11 = (char) b11;
            if (allowedSet.contains(Character.valueOf(c11))) {
                cArr[i13] = c11;
                i13++;
            } else {
                cArr[i13] = '%';
                int i14 = i13 + 2;
                cArr[i13 + 1] = A((b11 & 255) >> 4);
                i13 += 3;
                cArr[i14] = A(b11 & 15);
            }
        }
        return u30.f0.L1(cArr);
    }

    public static final int e(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('A' <= c11 && c11 < 'G') {
            return c11 - '7';
        }
        if ('a' > c11 || c11 >= 'g') {
            return -1;
        }
        return c11 - 'W';
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        throw new io.ktor.http.URLDecodeException("Wrong HEX escape: %" + r8.charAt(r3) + r8.charAt(r9) + ", in " + ((java.lang.Object) r8) + ", at " + r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String f(java.lang.CharSequence r8, int r9, int r10, int r11, boolean r12, java.nio.charset.Charset r13) {
        /*
            int r13 = r10 - r9
            r0 = 255(0xff, float:3.57E-43)
            if (r13 <= r0) goto L8
            int r13 = r13 / 3
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            if (r11 <= r9) goto L12
            r0.append(r8, r9, r11)
        L12:
            r9 = 0
        L13:
            if (r11 >= r10) goto Lda
            char r13 = r8.charAt(r11)
            if (r12 == 0) goto L27
            r1 = 43
            if (r13 != r1) goto L27
            r13 = 32
            r0.append(r13)
        L24:
            int r11 = r11 + 1
            goto L13
        L27:
            r1 = 37
            if (r13 != r1) goto Ld5
            if (r9 != 0) goto L33
            int r9 = r10 - r11
            int r9 = r9 / 3
            byte[] r9 = new byte[r9]
        L33:
            r2 = r9
            r9 = 0
        L35:
            r4 = r9
            if (r11 >= r10) goto Lc7
            char r9 = r8.charAt(r11)
            if (r9 != r1) goto Lc7
            int r9 = r11 + 2
            java.lang.String r13 = ", in "
            if (r9 >= r10) goto L96
            int r3 = r11 + 1
            char r5 = r8.charAt(r3)
            int r5 = e(r5)
            char r6 = r8.charAt(r9)
            int r6 = e(r6)
            r7 = -1
            if (r5 == r7) goto L66
            if (r6 == r7) goto L66
            int r9 = r4 + 1
            int r5 = r5 * 16
            int r5 = r5 + r6
            byte r13 = (byte) r5
            r2[r4] = r13
            int r11 = r11 + 3
            goto L35
        L66:
            io.ktor.http.URLDecodeException r10 = new io.ktor.http.URLDecodeException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Wrong HEX escape: %"
            r12.append(r0)
            char r0 = r8.charAt(r3)
            r12.append(r0)
            char r9 = r8.charAt(r9)
            r12.append(r9)
            r12.append(r13)
            r12.append(r8)
            java.lang.String r8 = ", at "
            r12.append(r8)
            r12.append(r11)
            java.lang.String r8 = r12.toString()
            r10.<init>(r8)
            throw r10
        L96:
            io.ktor.http.URLDecodeException r9 = new io.ktor.http.URLDecodeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Incomplete trailing HEX escape: "
            r10.append(r12)
            int r12 = r8.length()
            java.lang.CharSequence r12 = r8.subSequence(r11, r12)
            java.lang.String r12 = r12.toString()
            r10.append(r12)
            r10.append(r13)
            r10.append(r8)
            java.lang.String r8 = " at "
            r10.append(r8)
            r10.append(r11)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        Lc7:
            r6 = 4
            r7 = 0
            r3 = 0
            r5 = 0
            java.lang.String r9 = u30.f0.W1(r2, r3, r4, r5, r6, r7)
            r0.append(r9)
            r9 = r2
            goto L13
        Ld5:
            r0.append(r13)
            goto L24
        Lda:
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ix.f.f(java.lang.CharSequence, int, int, int, boolean, java.nio.charset.Charset):java.lang.String");
    }

    public static final String g(String str, int i11, int i12, boolean z11, Charset charset) {
        for (int i13 = i11; i13 < i12; i13++) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (z11 && charAt == '+')) {
                return f(str, i11, i12, i13, z11, charset);
            }
        }
        if (i11 == 0 && i12 == str.length()) {
            return str.toString();
        }
        String substring = str.substring(i11, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @m80.k
    public static final String h(@m80.k String str, int i11, int i12, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return g(str, i11, i12, false, charset);
    }

    public static /* synthetic */ String i(String str, int i11, int i12, Charset charset, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            charset = u30.d.f91599b;
        }
        return h(str, i11, i12, charset);
    }

    @m80.k
    public static final String j(@m80.k String str, int i11, int i12, boolean z11, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return g(str, i11, i12, z11, charset);
    }

    public static /* synthetic */ String k(String str, int i11, int i12, boolean z11, Charset charset, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            charset = u30.d.f91599b;
        }
        return j(str, i11, i12, z11, charset);
    }

    @m80.k
    public static final String l(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return n(str, false, 1, null);
    }

    @m80.k
    public static final String m(@m80.k String str, final boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = u30.d.f91599b.newEncoder();
        kotlin.jvm.internal.g0.o(newEncoder, "newEncoder(...)");
        x(iz.b.e(newEncoder, str, 0, 0, 6, null), new x00.l() { // from class: ix.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 o11;
                o11 = f.o(sb2, z11, ((Byte) obj).byteValue());
                return o11;
            }
        });
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String n(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m(str, z11);
    }

    public static final yz.g2 o(StringBuilder sb2, boolean z11, byte b11) {
        if (f62764a.contains(Byte.valueOf(b11)) || f62770g.contains(Byte.valueOf(b11))) {
            sb2.append((char) b11);
        } else if (z11 && b11 == 32) {
            sb2.append('+');
        } else {
            sb2.append(B(b11));
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public static final String p(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return m(str, true);
    }

    @m80.k
    public static final String q(@m80.k String str, boolean z11, boolean z12) {
        int i11;
        kotlin.jvm.internal.g0.p(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        Charset charset = u30.d.f91599b;
        int i12 = 0;
        while (i12 < str.length()) {
            char charAt = str.charAt(i12);
            if ((!z11 && charAt == '/') || f62765b.contains(Character.valueOf(charAt)) || f62768e.contains(Character.valueOf(charAt))) {
                sb2.append(charAt);
                i12++;
            } else {
                if (!z12 && charAt == '%' && (i11 = i12 + 2) < str.length()) {
                    Set<Character> set = f62766c;
                    int i13 = i12 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i13))) && set.contains(Character.valueOf(str.charAt(i11)))) {
                        sb2.append(charAt);
                        sb2.append(str.charAt(i13));
                        sb2.append(str.charAt(i11));
                        i12 += 3;
                    }
                }
                int i14 = u30.c.L(charAt) ? 2 : 1;
                CharsetEncoder newEncoder = charset.newEncoder();
                kotlin.jvm.internal.g0.o(newEncoder, "newEncoder(...)");
                int i15 = i14 + i12;
                x(iz.b.c(newEncoder, str, i12, i15), new x00.l() { // from class: ix.e
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 s11;
                        s11 = f.s(sb2, ((Byte) obj).byteValue());
                        return s11;
                    }
                });
                i12 = i15;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String r(String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return q(str, z11, z12);
    }

    public static final yz.g2 s(StringBuilder sb2, byte b11) {
        sb2.append(B(b11));
        return yz.g2.f100423a;
    }

    @m80.k
    public static final String t(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return r(str, true, false, 2, null);
    }

    @m80.k
    public static final String u(@m80.k String str, final boolean z11, final boolean z12, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        kotlin.jvm.internal.g0.o(newEncoder, "newEncoder(...)");
        x(iz.b.e(newEncoder, str, 0, 0, 6, null), new x00.l() { // from class: ix.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 w11;
                w11 = f.w(z12, sb2, z11, ((Byte) obj).byteValue());
                return w11;
            }
        });
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String v(String str, boolean z11, boolean z12, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            charset = u30.d.f91599b;
        }
        return u(str, z11, z12, charset);
    }

    public static final yz.g2 w(boolean z11, StringBuilder sb2, boolean z12, byte b11) {
        if (b11 == 32) {
            if (z11) {
                sb2.append('+');
            } else {
                sb2.append("%20");
            }
        } else if (f62764a.contains(Byte.valueOf(b11)) || (!z12 && f62767d.contains(Byte.valueOf(b11)))) {
            sb2.append((char) b11);
        } else {
            sb2.append(B(b11));
        }
        return yz.g2.f100423a;
    }

    public static final void x(y40.c0 c0Var, final x00.l<? super Byte, yz.g2> lVar) {
        jz.j.s(c0Var, new x00.l() { // from class: ix.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean y11;
                y11 = f.y(x00.l.this, (y40.b) obj);
                return Boolean.valueOf(y11);
            }
        });
    }

    public static final boolean y(x00.l lVar, y40.b buffer) {
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        while (jz.b.b(buffer)) {
            lVar.invoke(Byte.valueOf(buffer.readByte()));
        }
        return true;
    }

    @m80.k
    public static final Set<Character> z() {
        return f62769f;
    }
}
