package hb0;

import ab0.e;
import org.koin.core.definition.Kind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAdvertisementModuleGencom$baicizhan$app$biz$advertisement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvertisementModuleGencom$baicizhan$app$biz$advertisement.kt\norg/koin/ksp/generated/AdvertisementModuleGencom_baicizhan_app_biz_advertisementKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,12:1\n105#2,6:13\n111#2,5:41\n105#2,6:46\n111#2,5:74\n196#3,7:19\n203#3:40\n196#3,7:52\n203#3:73\n115#4,14:26\n115#4,14:59\n138#5,5:79\n138#5,5:84\n*S KotlinDebug\n*F\n+ 1 AdvertisementModuleGencom$baicizhan$app$biz$advertisement.kt\norg/koin/ksp/generated/AdvertisementModuleGencom_baicizhan_app_biz_advertisementKt\n*L\n8#1:13,6\n8#1:41,5\n9#1:46,6\n9#1:74,5\n8#1:19,7\n8#1:40\n9#1:52,7\n9#1:73\n8#1:26,14\n9#1:59,14\n8#1:79,5\n9#1:84,5\n*E\n"})
/* loaded from: classes9.dex */
public final class h {
    public static final yz.g2 d(va0.c module) {
        kotlin.jvm.internal.g0.p(module, "$this$module");
        x00.p pVar = new x00.p() { // from class: hb0.e
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p3.a e11;
                e11 = h.e((cb0.b) obj, (ya0.a) obj2);
                return e11;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a11, kotlin.jvm.internal.o0.d(p3.a.class), null, pVar, kind, a00.h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        eb0.a.b(new ra0.f(module, hVar), kotlin.jvm.internal.o0.d(k3.e.class));
        x00.p pVar2 = new x00.p() { // from class: hb0.f
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                p3.e f11;
                f11 = h.f((cb0.b) obj, (ya0.a) obj2);
                return f11;
            }
        };
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(p3.e.class), null, pVar2, kind, a00.h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        eb0.a.b(new ra0.f(module, hVar2), kotlin.jvm.internal.o0.d(c4.j.class));
        return yz.g2.f100423a;
    }

    public static final p3.a e(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p3.a((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (p3.e) single.i(kotlin.jvm.internal.o0.d(p3.e.class), null, null));
    }

    public static final p3.e f(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new p3.e((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null));
    }

    @m80.k
    public static final va0.c g() {
        return eb0.e.b(false, new x00.l() { // from class: hb0.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d11;
                d11 = h.d((va0.c) obj);
                return d11;
            }
        }, 1, null);
    }

    @m80.k
    public static final va0.c h(@m80.k p3.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return g();
    }
}
