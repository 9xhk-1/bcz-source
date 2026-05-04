package my;

import h10.r;
import ix.e1;
import ix.g1;
import ix.y0;
import ix.z1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import m80.k;
import n6.m;
import org.junit.jupiter.api.j2;
import qy.l;
import qy.q;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCORSUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CORSUtils.kt\nio/ktor/server/plugins/cors/CORSUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,136:1\n1755#2,3:137\n1755#2,3:140\n1734#2,3:143\n1755#2,3:146\n1#3:149\n25#4:150\n26#4:167\n58#5,16:151\n1069#6,2:168\n*S KotlinDebug\n*F\n+ 1 CORSUtils.kt\nio/ktor/server/plugins/cors/CORSUtilsKt\n*L\n54#1:137,3\n56#1:140,3\n63#1:143,3\n68#1:146,3\n78#1:150\n78#1:167\n78#1:151,16\n89#1:168,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Regex f73888a = new Regex("[0-9]+");

    public static final void a(@k zx.b bVar, boolean z11) {
        g0.p(bVar, "<this>");
        if (z11) {
            l.l(bVar.k(), y0.f63006a.i(), m.f74525c);
        }
    }

    public static final void b(@k zx.b bVar, @k String origin, boolean z11, boolean z12) {
        g0.p(bVar, "<this>");
        g0.p(origin, "origin");
        if (z11 && !z12) {
            origin = "*";
        }
        l.l(bVar.k(), y0.f63006a.l(), origin);
    }

    public static final void c(@k zx.b bVar, @m80.l String str) {
        g0.p(bVar, "<this>");
        if (str != null) {
            l.l(bVar.k(), y0.f63006a.n(), str);
        }
    }

    public static final boolean d(@k zx.b bVar, @k Set<e1> methods) {
        g0.p(bVar, "<this>");
        g0.p(methods, "methods");
        return methods.contains(py.e.o(bVar.f()));
    }

    public static final boolean e(@k String origin, boolean z11, @k Set<String> hostsNormalized, @k Set<Pair<String, String>> hostsWithWildcard, @k List<? extends x00.l<? super String, Boolean>> originPredicates) {
        g0.p(origin, "origin");
        g0.p(hostsNormalized, "hostsNormalized");
        g0.p(hostsWithWildcard, "hostsWithWildcard");
        g0.p(originPredicates, "originPredicates");
        String l11 = l(origin);
        if (z11 || hostsNormalized.contains(l11)) {
            return true;
        }
        Set<Pair<String, String>> set = hostsWithWildcard;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (f0.J2(l11, str, false, 2, null) && f0.b2(l11, str2, false, 2, null)) {
                    return true;
                }
            }
        }
        List<? extends x00.l<? super String, Boolean>> list = originPredicates;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Boolean) ((x00.l) it2.next()).invoke(origin)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean f(@k List<String> requestHeaders, @k Set<String> allHeadersSet, @k List<? extends x00.l<? super String, Boolean>> headerPredicates) {
        g0.p(requestHeaders, "requestHeaders");
        g0.p(allHeadersSet, "allHeadersSet");
        g0.p(headerPredicates, "headerPredicates");
        List<String> list = requestHeaders;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (String str : list) {
            if (!allHeadersSet.contains(str) && !i(str, headerPredicates)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean g(@k zx.b bVar, @k Set<e1> methods) {
        g0.p(bVar, "<this>");
        g0.p(methods, "methods");
        String r11 = py.e.r(bVar.f(), y0.f63006a.p());
        e1 e1Var = r11 != null ? new e1(r11) : null;
        return e1Var != null && methods.contains(e1Var);
    }

    public static final void h(@k zx.b bVar) {
        String str;
        g0.p(bVar, "<this>");
        q a11 = bVar.k().a();
        y0 y0Var = y0.f63006a;
        String f11 = a11.f(y0Var.M0());
        if (f11 == null) {
            str = y0Var.e0();
        } else {
            str = f11 + j2.O + y0Var.e0();
        }
        l.l(bVar.k(), y0Var.M0(), str);
    }

    public static final boolean i(@k String header, @k List<? extends x00.l<? super String, Boolean>> headerPredicates) {
        g0.p(header, "header");
        g0.p(headerPredicates, "headerPredicates");
        List<? extends x00.l<? super String, Boolean>> list = headerPredicates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((x00.l) it.next()).invoke(header)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(@k String origin, @k z1 point) {
        g0.p(origin, "origin");
        g0.p(point, "point");
        return g0.g(l(point.getScheme() + "://" + point.A() + ':' + point.C()), l(origin));
    }

    public static final boolean k(@k String origin) {
        int J3;
        g0.p(origin, "origin");
        if (origin.length() == 0) {
            return false;
        }
        if (g0.g(origin, "null")) {
            return true;
        }
        if (!k0.n3(origin, "%", false, 2, null) && (J3 = k0.J3(origin, "://", 0, false, 6, null)) > 0 && Character.isLetter(origin.charAt(0))) {
            CharSequence subSequence = origin.subSequence(0, J3);
            for (int i11 = 0; i11 < subSequence.length(); i11++) {
                char charAt = subSequence.charAt(i11);
                if (Character.isLetter(charAt) || Character.isDigit(charAt) || charAt == '-' || charAt == '+' || charAt == '.') {
                }
            }
            int length = origin.length();
            int length2 = origin.length();
            for (int i12 = J3 + 3; i12 < length2; i12++) {
                char charAt2 = origin.charAt(i12);
                if (charAt2 == '/' || charAt2 == ':') {
                    length = i12 + 1;
                    break;
                }
                if (charAt2 == '?') {
                    return false;
                }
            }
            int length3 = origin.length();
            while (length < length3) {
                boolean z11 = length == origin.length() - 1 && origin.charAt(length) == '/';
                if (!Character.isDigit(origin.charAt(length)) && !z11) {
                    return false;
                }
                length++;
            }
            return true;
        }
        return false;
    }

    @k
    public static final String l(@k String origin) {
        g0.p(origin, "origin");
        if (g0.g(origin, "null") || g0.g(origin, "*")) {
            return origin;
        }
        StringBuilder sb2 = new StringBuilder(origin.length());
        String str = null;
        if (f0.b2(origin, "/", false, 2, null)) {
            sb2.append((CharSequence) origin, 0, origin.length() - 1);
        } else {
            sb2.append(origin);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        if (!f73888a.matches(k0.O5(sb3, ":", ""))) {
            String sb4 = sb2.toString();
            g0.o(sb4, "toString(...)");
            String T5 = k0.T5(sb4, ':', null, 2, null);
            if (g0.g(T5, "http")) {
                str = "80";
            } else if (g0.g(T5, "https")) {
                str = "443";
            }
            if (str != null) {
                sb2.append(':' + str);
            }
        }
        String sb5 = sb2.toString();
        g0.o(sb5, "toString(...)");
        return sb5;
    }

    @m80.l
    public static final Object m(@k zx.b bVar, @k j00.c<? super g2> cVar) {
        r rVar;
        g1 k11 = g1.f62797c.k();
        h10.d d11 = o0.d(g1.class);
        try {
            rVar = o0.B(g1.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(k11, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }
}
