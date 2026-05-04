package uw;

import a00.w1;
import ix.t2;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUnlimitedCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n168#2,3:55\n*S KotlinDebug\n*F\n+ 1 UnlimitedCacheStorage.kt\nio/ktor/client/plugins/cache/storage/UnlimitedCacheStorage\n*L\n26#1:55,3\n*E\n"})
/* loaded from: classes8.dex */
public final class p extends l {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final zy.d<t2, Set<tw.c>> f92547d = new zy.d<>(0, 1, null);

    public static final Set j() {
        return zy.f.a();
    }

    public static final Set k() {
        return zy.f.a();
    }

    @Override // uw.l
    @m80.l
    public tw.c e(@m80.k t2 url, @m80.k Map<String, String> varyKeys) {
        Object obj;
        g0.p(url, "url");
        g0.p(varyKeys, "varyKeys");
        Iterator<T> it = this.f92547d.g(url, new x00.a() { // from class: uw.o
            @Override // x00.a
            public final Object invoke() {
                Set j11;
                j11 = p.j();
                return j11;
            }
        }).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            tw.c cVar = (tw.c) obj;
            if (!varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    String key = entry.getKey();
                    if (!g0.g(cVar.e().get(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (tw.c) obj;
    }

    @Override // uw.l
    @m80.k
    public Set<tw.c> f(@m80.k t2 url) {
        g0.p(url, "url");
        Set<tw.c> set = this.f92547d.get(url);
        return set == null ? w1.k() : set;
    }

    @Override // uw.l
    public void g(@m80.k t2 url, @m80.k tw.c value) {
        g0.p(url, "url");
        g0.p(value, "value");
        Set<tw.c> g11 = this.f92547d.g(url, new x00.a() { // from class: uw.n
            @Override // x00.a
            public final Object invoke() {
                Set k11;
                k11 = p.k();
                return k11;
            }
        });
        if (g11.add(value)) {
            return;
        }
        g11.remove(value);
        g11.add(value);
    }
}
