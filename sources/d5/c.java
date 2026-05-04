package d5;

import a00.i0;
import a00.k1;
import a00.r0;
import b5.c1;
import b5.x0;
import g10.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import oa0.r;
import org.junit.jupiter.api.j2;
import yz.c0;
import yz.e0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {g.class})
@u0({"SMAP\nCommandRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandRegistry.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/CommandRegistry\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n195#2:37\n387#3:38\n1193#4,2:39\n1267#4,4:41\n*S KotlinDebug\n*F\n+ 1 CommandRegistry.kt\ncom/baicizhan/app/biz/game/impl/unity/proto/CommandRegistry\n*L\n19#1:37\n19#1:38\n19#1:39,2\n19#1:41,4\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements g, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f47246b = e0.c(new x00.a() { // from class: d5.b
        @Override // x00.a
        public final Object invoke() {
            Map d11;
            d11 = c.d(c.this);
            return d11;
        }
    });

    public static final Map d(c cVar) {
        List<f> n11 = cVar.r().P().h().n(o0.d(f.class));
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(n11, 10)), 16));
        for (f fVar : n11) {
            Pair a11 = h1.a(fVar.c(), fVar);
            linkedHashMap.put(a11.getFirst(), a11.getSecond());
        }
        z6.b.j(z6.b.f101032b, d.f47247a, "command map: " + r0.r3(linkedHashMap.keySet(), j2.O, null, null, 0, null, null, 62, null), null, 4, null);
        return linkedHashMap;
    }

    @Override // d5.g
    public boolean a(@m80.k String command) {
        g0.p(command, "command");
        return e().containsKey(command);
    }

    @Override // d5.g
    @m80.k
    public f<x0, c1> b(@m80.k String command) {
        g0.p(command, "command");
        Object obj = e().get(command);
        g0.m(obj);
        return (f) obj;
    }

    public final Map<String, f<?, ?>> e() {
        return (Map) this.f47246b.getValue();
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
