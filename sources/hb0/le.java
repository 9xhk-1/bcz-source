package hb0;

import ab0.e;
import com.baicizhan.app.biz.userinfo.UserInfoServiceImpl;
import org.koin.core.definition.Kind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUserInfoModuleGencom$baicizhan$app$biz$userinfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoModuleGencom$baicizhan$app$biz$userinfo.kt\norg/koin/ksp/generated/UserInfoModuleGencom_baicizhan_app_biz_userinfoKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,12:1\n105#2,6:13\n111#2,5:41\n105#2,6:46\n111#2,5:74\n196#3,7:19\n203#3:40\n196#3,7:52\n203#3:73\n115#4,14:26\n115#4,14:59\n138#5,5:79\n138#5,5:84\n*S KotlinDebug\n*F\n+ 1 UserInfoModuleGencom$baicizhan$app$biz$userinfo.kt\norg/koin/ksp/generated/UserInfoModuleGencom_baicizhan_app_biz_userinfoKt\n*L\n8#1:13,6\n8#1:41,5\n9#1:46,6\n9#1:74,5\n8#1:19,7\n8#1:40\n9#1:52,7\n9#1:73\n8#1:26,14\n9#1:59,14\n8#1:79,5\n9#1:84,5\n*E\n"})
/* loaded from: classes9.dex */
public final class le {
    public static final yz.g2 d(va0.c module) {
        kotlin.jvm.internal.g0.p(module, "$this$module");
        x00.p pVar = new x00.p() { // from class: hb0.je
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                s7.e e11;
                e11 = le.e((cb0.b) obj, (ya0.a) obj2);
                return e11;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a11, kotlin.jvm.internal.o0.d(s7.e.class), null, pVar, kind, a00.h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        eb0.a.b(new ra0.f(module, hVar), kotlin.jvm.internal.o0.d(s7.b.class));
        x00.p pVar2 = new x00.p() { // from class: hb0.ke
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                UserInfoServiceImpl f11;
                f11 = le.f((cb0.b) obj, (ya0.a) obj2);
                return f11;
            }
        };
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(UserInfoServiceImpl.class), null, pVar2, kind, a00.h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        eb0.a.b(new ra0.f(module, hVar2), kotlin.jvm.internal.o0.d(k3.x3.class));
        return yz.g2.f100423a;
    }

    public static final s7.e e(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new s7.e((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (n7.e) single.i(kotlin.jvm.internal.o0.d(n7.e.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final UserInfoServiceImpl f(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new UserInfoServiceImpl((s7.b) single.i(kotlin.jvm.internal.o0.d(s7.b.class), null, null), (n7.e) single.i(kotlin.jvm.internal.o0.d(n7.e.class), null, null), (r3.d) single.i(kotlin.jvm.internal.o0.d(r3.d.class), null, null), (com.baicizhan.app.biz.auth.n) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.n.class), null, null), (l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null));
    }

    @m80.k
    public static final va0.c g() {
        return eb0.e.b(false, new x00.l() { // from class: hb0.ie
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 d11;
                d11 = le.d((va0.c) obj);
                return d11;
            }
        }, 1, null);
    }

    @m80.k
    public static final va0.c h(@m80.k com.baicizhan.app.biz.userinfo.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return g();
    }
}
