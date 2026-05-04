package hb0;

import ab0.e;
import org.koin.core.definition.Kind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGameBaseModuleGencom$baicizhan$app$biz$game$base.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameBaseModuleGencom$baicizhan$app$biz$game$base.kt\norg/koin/ksp/generated/GameBaseModuleGencom_baicizhan_app_biz_game_baseKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,12:1\n105#2,6:13\n111#2,5:41\n105#2,6:46\n111#2,5:74\n196#3,7:19\n203#3:40\n196#3,7:52\n203#3:73\n115#4,14:26\n115#4,14:59\n138#5,5:79\n*S KotlinDebug\n*F\n+ 1 GameBaseModuleGencom$baicizhan$app$biz$game$base.kt\norg/koin/ksp/generated/GameBaseModuleGencom_baicizhan_app_biz_game_baseKt\n*L\n8#1:13,6\n8#1:41,5\n9#1:46,6\n9#1:74,5\n8#1:19,7\n8#1:40\n9#1:52,7\n9#1:73\n8#1:26,14\n9#1:59,14\n8#1:79,5\n*E\n"})
/* loaded from: classes9.dex */
public final class t0 {
    public static final yz.g2 d(va0.c module) {
        kotlin.jvm.internal.g0.p(module, "$this$module");
        x00.p pVar = new x00.p() { // from class: hb0.r0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                h4.a e11;
                e11 = t0.e((cb0.b) obj, (ya0.a) obj2);
                return e11;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a11, kotlin.jvm.internal.o0.d(h4.a.class), null, pVar, kind, a00.h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        eb0.a.b(new ra0.f(module, hVar), kotlin.jvm.internal.o0.d(h4.c.class));
        x00.p pVar2 = new x00.p() { // from class: hb0.s0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                k50.a f11;
                f11 = t0.f((cb0.b) obj, (ya0.a) obj2);
                return f11;
            }
        };
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(k50.a.class), null, pVar2, kind, a00.h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        eb0.a.b(new ra0.f(module, hVar2), kotlin.jvm.internal.o0.d(k50.a.class));
        return yz.g2.f100423a;
    }

    public static final h4.a e(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new h4.a((v3.b) single.i(kotlin.jvm.internal.o0.d(v3.b.class), null, null));
    }

    public static final k50.a f(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return g4.c.b();
    }

    @m80.k
    public static final va0.c g() {
        return eb0.e.b(false, new x00.l() { // from class: hb0.q0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d11;
                d11 = t0.d((va0.c) obj);
                return d11;
            }
        }, 1, null);
    }

    @m80.k
    public static final va0.c h(@m80.k g4.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return g();
    }
}
