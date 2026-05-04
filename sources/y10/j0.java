package y10;

import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n774#2:103\n865#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 {
    @m80.k
    public static final List<n20.f> a(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        String b11 = name.b();
        kotlin.jvm.internal.g0.o(b11, "asString(...)");
        return d0.c(b11) ? a00.h0.R(b(name)) : d0.d(b11) ? f(name) : g.f99079a.b(name);
    }

    @m80.l
    public static final n20.f b(@m80.k n20.f methodName) {
        kotlin.jvm.internal.g0.p(methodName, "methodName");
        n20.f e11 = e(methodName, ct.d.f46852f, false, null, 12, null);
        return e11 == null ? e(methodName, "is", false, null, 8, null) : e11;
    }

    @m80.l
    public static final n20.f c(@m80.k n20.f methodName, boolean z11) {
        kotlin.jvm.internal.g0.p(methodName, "methodName");
        return e(methodName, ct.d.f46854h, false, z11 ? "is" : null, 4, null);
    }

    public static final n20.f d(n20.f fVar, String str, boolean z11, String str2) {
        if (fVar.g()) {
            return null;
        }
        String d11 = fVar.d();
        kotlin.jvm.internal.g0.o(d11, "getIdentifier(...)");
        if (!u30.f0.J2(d11, str, false, 2, null) || d11.length() == str.length()) {
            return null;
        }
        char charAt = d11.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            return n20.f.f(str2 + u30.k0.x4(d11, str));
        }
        if (!z11) {
            return fVar;
        }
        String c11 = m30.a.c(u30.k0.x4(d11, str), true);
        if (n20.f.i(c11)) {
            return n20.f.f(c11);
        }
        return null;
    }

    public static /* synthetic */ n20.f e(n20.f fVar, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z11, str2);
    }

    @m80.k
    public static final List<n20.f> f(@m80.k n20.f methodName) {
        kotlin.jvm.internal.g0.p(methodName, "methodName");
        return a00.h0.S(c(methodName, false), c(methodName, true));
    }
}
