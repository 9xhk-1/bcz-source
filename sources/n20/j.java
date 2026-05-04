package n20;

import a00.i0;
import a00.k1;
import g10.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1187#2,2:288\n1261#2,4:290\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n*L\n286#1:288,2\n286#1:290,4\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    public static final b k(String str) {
        c b11 = i.f74318a.b();
        f f11 = f.f(str);
        g0.o(f11, "identifier(...)");
        return new b(b11, f11);
    }

    public static final b l(String str) {
        c f11 = i.f74318a.f();
        f f12 = f.f(str);
        g0.o(f12, "identifier(...)");
        return new b(f11, f12);
    }

    public static final b m(String str) {
        c c11 = i.f74318a.c();
        f f11 = f.f(str);
        g0.o(f11, "identifier(...)");
        return new b(c11, f11);
    }

    public static final b n(String str) {
        c d11 = i.f74318a.d();
        f f11 = f.f(str);
        g0.o(f11, "identifier(...)");
        return new b(d11, f11);
    }

    public static final b o(String str) {
        c e11 = i.f74318a.e();
        f f11 = f.f(str);
        g0.o(f11, "identifier(...)");
        return new b(e11, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> p(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a11 = h1.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a11.getFirst(), a11.getSecond());
        }
        return linkedHashMap;
    }

    public static final b q(f fVar) {
        i iVar = i.f74318a;
        c f11 = iVar.a().f();
        f f12 = f.f(fVar.d() + iVar.a().h().d());
        g0.o(f12, "identifier(...)");
        return new b(f11, f12);
    }

    public static final b r(String str) {
        c g11 = i.f74318a.g();
        f f11 = f.f(str);
        g0.o(f11, "identifier(...)");
        return new b(g11, f11);
    }

    public static final b s(String str) {
        c h11 = i.f74318a.h();
        f f11 = f.f(str);
        g0.o(f11, "identifier(...)");
        return new b(h11, f11);
    }

    public static final b t(b bVar) {
        c f11 = i.f74318a.f();
        f f12 = f.f('U' + bVar.h().d());
        g0.o(f12, "identifier(...)");
        return new b(f11, f12);
    }
}
