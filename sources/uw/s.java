package uw;

import a00.w1;
import ix.t2;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUnlimitedCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n168#2,3:55\n*S KotlinDebug\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedStorage\n*L\n48#1:55,3\n*E\n"})
/* loaded from: classes8.dex */
public final class s implements b {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final zy.d<t2, Set<c>> f92548b = new zy.d<>(0, 1, null);

    public static final Set f() {
        return zy.f.a();
    }

    public static final Set g() {
        return zy.f.a();
    }

    @Override // uw.b
    @m80.l
    public Object a(@m80.k t2 t2Var, @m80.k j00.c<? super Set<c>> cVar) {
        Set<c> set = this.f92548b.get(t2Var);
        return set == null ? w1.k() : set;
    }

    @Override // uw.b
    @m80.l
    public Object b(@m80.k t2 t2Var, @m80.k c cVar, @m80.k j00.c<? super g2> cVar2) {
        Set<c> g11 = this.f92548b.g(t2Var, new x00.a() { // from class: uw.r
            @Override // x00.a
            public final Object invoke() {
                Set g12;
                g12 = s.g();
                return g12;
            }
        });
        if (!g11.add(cVar)) {
            g11.remove(cVar);
            g11.add(cVar);
        }
        return g2.f100423a;
    }

    @Override // uw.b
    @m80.l
    public Object c(@m80.k t2 t2Var, @m80.k Map<String, String> map, @m80.k j00.c<? super c> cVar) {
        for (Object obj : this.f92548b.g(t2Var, new x00.a() { // from class: uw.q
            @Override // x00.a
            public final Object invoke() {
                Set f11;
                f11 = s.f();
                return f11;
            }
        })) {
            c cVar2 = (c) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!g0.g(cVar2.i().get(key), entry.getValue())) {
                    break;
                }
            }
            return obj;
        }
        return null;
    }
}
