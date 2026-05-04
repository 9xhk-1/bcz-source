package p20;

import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,78:1\n1088#2,2:79\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n30#1:79,2\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {
    @m80.k
    public static final String a(@m80.k n20.d dVar) {
        g0.p(dVar, "<this>");
        List<n20.f> h11 = dVar.h();
        g0.o(h11, "pathSegments(...)");
        return c(h11);
    }

    @m80.k
    public static final String b(@m80.k n20.f fVar) {
        g0.p(fVar, "<this>");
        if (!e(fVar)) {
            String b11 = fVar.b();
            g0.o(b11, "asString(...)");
            return b11;
        }
        StringBuilder sb2 = new StringBuilder();
        String b12 = fVar.b();
        g0.o(b12, "asString(...)");
        sb2.append('`' + b12);
        sb2.append('`');
        return sb2.toString();
    }

    @m80.k
    public static final String c(@m80.k List<n20.f> pathSegments) {
        g0.p(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (n20.f fVar : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    @m80.l
    public static final String d(@m80.k String lowerRendered, @m80.k String lowerPrefix, @m80.k String upperRendered, @m80.k String upperPrefix, @m80.k String foldedPrefix) {
        g0.p(lowerRendered, "lowerRendered");
        g0.p(lowerPrefix, "lowerPrefix");
        g0.p(upperRendered, "upperRendered");
        g0.p(upperPrefix, "upperPrefix");
        g0.p(foldedPrefix, "foldedPrefix");
        if (f0.J2(lowerRendered, lowerPrefix, false, 2, null) && f0.J2(upperRendered, upperPrefix, false, 2, null)) {
            String substring = lowerRendered.substring(lowerPrefix.length());
            g0.o(substring, "substring(...)");
            String substring2 = upperRendered.substring(upperPrefix.length());
            g0.o(substring2, "substring(...)");
            String str = foldedPrefix + substring;
            if (g0.g(substring, substring2)) {
                return str;
            }
            if (f(substring, substring2)) {
                return str + PublicSuffixDatabase.f77441i;
            }
        }
        return null;
    }

    public static final boolean e(n20.f fVar) {
        String b11 = fVar.b();
        g0.o(b11, "asString(...)");
        if (z.f78797a.contains(b11)) {
            return true;
        }
        for (int i11 = 0; i11 < b11.length(); i11++) {
            char charAt = b11.charAt(i11);
            if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                return true;
            }
        }
        return b11.length() == 0 || !Character.isJavaIdentifierStart(b11.codePointAt(0));
    }

    public static final boolean f(@m80.k String lower, @m80.k String upper) {
        g0.p(lower, "lower");
        g0.p(upper, "upper");
        if (g0.g(lower, f0.z2(upper, "?", "", false, 4, null))) {
            return true;
        }
        if (f0.b2(upper, "?", false, 2, null)) {
            if (g0.g(lower + s60.d.f88057a, upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(lower);
        sb2.append(")?");
        return g0.g(sb2.toString(), upper);
    }
}
