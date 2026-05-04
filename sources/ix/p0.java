package ix;

import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHeaderValueWithParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParametersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Set<Character> f62971a = a00.w1.u('(', ')', Character.valueOf(u30.u0.f91709e), Character.valueOf(u30.u0.f91710f), '@', ',', Character.valueOf(l70.f.f70689d), ':', '\\', '\"', '/', '[', Character.valueOf(l50.b.f69930l), Character.valueOf(s60.d.f88057a), '=', Character.valueOf(l50.b.f69927i), Character.valueOf(l50.b.f69928j), ' ', '\t', '\n', '\r');

    public static final void b(@m80.k xy.v1 v1Var, @m80.k String name, @m80.k o0 value) {
        kotlin.jvm.internal.g0.p(v1Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        v1Var.k(name, value.toString());
    }

    @m80.k
    public static final String c(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return f(str) ? g(str) : str;
    }

    public static final void d(String str, StringBuilder sb2) {
        if (f(str)) {
            sb2.append(g(str));
        } else {
            sb2.append(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            char r0 = u30.r0.x7(r9)
            r1 = 34
            if (r0 != r1) goto L4b
            char r0 = u30.r0.W7(r9)
            if (r0 == r1) goto L18
            goto L4b
        L18:
            r0 = 1
            r5 = r0
        L1a:
            r7 = 4
            r8 = 0
            r4 = 34
            r6 = 0
            r3 = r9
            int r9 = u30.k0.I3(r3, r4, r5, r6, r7, r8)
            int r1 = u30.k0.A3(r3)
            if (r9 != r1) goto L2b
            goto L48
        L2b:
            int r1 = r9 + (-1)
            r4 = r2
        L2e:
            char r5 = r3.charAt(r1)
            r6 = 92
            if (r5 != r6) goto L3b
            int r4 = r4 + 1
            int r1 = r1 + (-1)
            goto L2e
        L3b:
            int r4 = r4 % 2
            if (r4 != 0) goto L40
            return r2
        L40:
            int r5 = r9 + 1
            int r9 = r3.length()
            if (r5 < r9) goto L49
        L48:
            return r0
        L49:
            r9 = r3
            goto L1a
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ix.p0.e(java.lang.String):boolean");
    }

    public static final boolean f(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (e(str)) {
            return false;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (f62971a.contains(Character.valueOf(str.charAt(i11)))) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static final String g(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        h(str, sb2);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final void h(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\t') {
                sb2.append("\\t");
            } else if (charAt == '\n') {
                sb2.append("\\n");
            } else if (charAt == '\r') {
                sb2.append("\\r");
            } else if (charAt == '\"') {
                sb2.append("\\\"");
            } else if (charAt != '\\') {
                sb2.append(charAt);
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append("\"");
    }
}
