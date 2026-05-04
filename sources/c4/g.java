package c4;

import a00.h0;
import ab0.e;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.koin.core.definition.Kind;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBizDi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizDi.android.kt\ncom/baicizhan/app/biz/context/BizDi_androidKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,30:1\n105#2,6:31\n111#2,5:59\n149#2,14:64\n163#2,2:94\n149#2,14:96\n163#2,2:126\n105#2,6:128\n111#2,5:156\n196#3,7:37\n203#3:58\n212#3:78\n213#3:93\n212#3:110\n213#3:125\n196#3,7:134\n203#3:155\n115#4,14:44\n115#4,14:79\n115#4,14:111\n115#4,14:141\n50#5:161\n138#6,5:162\n*S KotlinDebug\n*F\n+ 1 BizDi.android.kt\ncom/baicizhan/app/biz/context/BizDi_androidKt\n*L\n20#1:31,6\n20#1:59,5\n24#1:64,14\n24#1:94,2\n28#1:96,14\n28#1:126,2\n29#1:128,6\n29#1:156,5\n20#1:37,7\n20#1:58\n24#1:78\n24#1:93\n28#1:110\n28#1:125\n29#1:134,7\n29#1:155\n20#1:44,14\n24#1:79,14\n28#1:111,14\n29#1:141,14\n-1#1:161\n25#1:162,5\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<va0.c> f7799a = h0.Q(n3.h.g(), g());

    @m80.k
    public static final List<va0.c> f() {
        return f7799a;
    }

    public static final va0.c g() {
        return eb0.e.b(false, new x00.l() { // from class: c4.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = g.h((va0.c) obj);
                return h11;
            }
        }, 1, null);
    }

    public static final g2 h(va0.c module) {
        g0.p(module, "$this$module");
        p pVar = new p() { // from class: c4.b
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                com.baicizhan.app.preferences.f i11;
                i11 = g.i((cb0.b) obj, (ya0.a) obj2);
                return i11;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a11, o0.d(com.baicizhan.app.preferences.f.class), null, pVar, kind, h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        eb0.a.b(new ra0.f(module, hVar), o0.d(com.baicizhan.app.preferences.a.class));
        p pVar2 = new p() { // from class: c4.c
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                com.baicizhan.app.preferences.g j11;
                j11 = g.j((cb0.b) obj, (ya0.a) obj2);
                return j11;
            }
        };
        za0.c a12 = aVar.a();
        Kind kind2 = Kind.Factory;
        ta0.b<?> aVar2 = new ta0.a<>(new ra0.b(a12, o0.d(com.baicizhan.app.preferences.g.class), null, pVar2, kind2, h0.J()));
        module.q(aVar2);
        eb0.a.b(new ra0.f(module, aVar2), o0.d(com.baicizhan.app.preferences.g.class));
        p pVar3 = new p() { // from class: c4.d
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                d7.d k11;
                k11 = g.k((cb0.b) obj, (ya0.a) obj2);
                return k11;
            }
        };
        ta0.b<?> aVar3 = new ta0.a<>(new ra0.b(aVar.a(), o0.d(d7.d.class), null, pVar3, kind2, h0.J()));
        module.q(aVar3);
        eb0.a.b(new ra0.f(module, aVar3), o0.d(d7.j.class));
        p pVar4 = new p() { // from class: c4.e
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                d7.f l11;
                l11 = g.l((cb0.b) obj, (ya0.a) obj2);
                return l11;
            }
        };
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), o0.d(d7.f.class), null, pVar4, kind, h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        eb0.a.b(new ra0.f(module, hVar2), o0.d(d7.m.class));
        return g2.f100423a;
    }

    public static final com.baicizhan.app.preferences.f i(cb0.b single, ya0.a it) {
        g0.p(single, "$this$single");
        g0.p(it, "it");
        return new com.baicizhan.app.preferences.f(n.h().n());
    }

    public static final com.baicizhan.app.preferences.g j(cb0.b factory, ya0.a aVar) {
        g0.p(factory, "$this$factory");
        g0.p(aVar, "<destruct>");
        return ((com.baicizhan.app.preferences.a) factory.i(o0.d(com.baicizhan.app.preferences.a.class), null, null)).a((String) aVar.g(0, o0.d(String.class)));
    }

    public static final d7.d k(cb0.b factory, ya0.a it) {
        g0.p(factory, "$this$factory");
        g0.p(it, "it");
        return new d7.d();
    }

    public static final d7.f l(cb0.b single, ya0.a it) {
        g0.p(single, "$this$single");
        g0.p(it, "it");
        return new d7.f();
    }
}
