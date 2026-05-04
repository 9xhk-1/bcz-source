package hb0;

import ab0.e;
import com.baicizhan.app.biz.auth.AuthServiceImpl;
import com.baicizhan.app.biz.auth.IAuthRepo;
import org.koin.core.definition.Kind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAuthModuleGencom$baicizhan$app$biz$auth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthModuleGencom$baicizhan$app$biz$auth.kt\norg/koin/ksp/generated/AuthModuleGencom_baicizhan_app_biz_authKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,16:1\n105#2,6:17\n111#2,5:45\n105#2,6:50\n111#2,5:78\n105#2,6:83\n111#2,5:111\n105#2,6:116\n111#2,5:144\n105#2,6:149\n111#2,5:177\n105#2,6:182\n111#2,5:210\n196#3,7:23\n203#3:44\n196#3,7:56\n203#3:77\n196#3,7:89\n203#3:110\n196#3,7:122\n203#3:143\n196#3,7:155\n203#3:176\n196#3,7:188\n203#3:209\n115#4,14:30\n115#4,14:63\n115#4,14:96\n115#4,14:129\n115#4,14:162\n115#4,14:195\n138#5,5:215\n138#5,5:220\n138#5,5:225\n*S KotlinDebug\n*F\n+ 1 AuthModuleGencom$baicizhan$app$biz$auth.kt\norg/koin/ksp/generated/AuthModuleGencom_baicizhan_app_biz_authKt\n*L\n8#1:17,6\n8#1:45,5\n9#1:50,6\n9#1:78,5\n10#1:83,6\n10#1:111,5\n11#1:116,6\n11#1:144,5\n12#1:149,6\n12#1:177,5\n13#1:182,6\n13#1:210,5\n8#1:23,7\n8#1:44\n9#1:56,7\n9#1:77\n10#1:89,7\n10#1:110\n11#1:122,7\n11#1:143\n12#1:155,7\n12#1:176\n13#1:188,7\n13#1:209\n8#1:30,14\n9#1:63,14\n10#1:96,14\n11#1:129,14\n12#1:162,14\n13#1:195,14\n8#1:215,5\n9#1:220,5\n10#1:225,5\n*E\n"})
/* loaded from: classes9.dex */
public final class p {
    public static final yz.g2 h(va0.c module) {
        kotlin.jvm.internal.g0.p(module, "$this$module");
        x00.p pVar = new x00.p() { // from class: hb0.j
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                r3.d i11;
                i11 = p.i((cb0.b) obj, (ya0.a) obj2);
                return i11;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a11, kotlin.jvm.internal.o0.d(r3.d.class), null, pVar, kind, a00.h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        new ra0.f(module, hVar);
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.c.class), null, new x00.p() { // from class: hb0.k
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                com.baicizhan.app.biz.auth.c j11;
                j11 = p.j((cb0.b) obj, (ya0.a) obj2);
                return j11;
            }
        }, kind, a00.h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        eb0.a.b(new ra0.f(module, hVar2), kotlin.jvm.internal.o0.d(IAuthRepo.class));
        ta0.h<?> hVar3 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(AuthServiceImpl.class), null, new x00.p() { // from class: hb0.l
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                AuthServiceImpl k11;
                k11 = p.k((cb0.b) obj, (ya0.a) obj2);
                return k11;
            }
        }, kind, a00.h0.J()));
        module.q(hVar3);
        if (module.m()) {
            module.v(hVar3);
        }
        eb0.a.b(new ra0.f(module, hVar3), kotlin.jvm.internal.o0.d(k3.j.class));
        ta0.h<?> hVar4 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.k.class), null, new x00.p() { // from class: hb0.m
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                com.baicizhan.app.biz.auth.k l11;
                l11 = p.l((cb0.b) obj, (ya0.a) obj2);
                return l11;
            }
        }, kind, a00.h0.J()));
        module.q(hVar4);
        if (module.m()) {
            module.v(hVar4);
        }
        eb0.a.c(new ra0.f(module, hVar4), new h10.d[]{kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.n.class), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.o.class)});
        ta0.h<?> hVar5 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.o.class), null, new x00.p() { // from class: hb0.n
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                com.baicizhan.app.biz.auth.o m11;
                m11 = p.m((cb0.b) obj, (ya0.a) obj2);
                return m11;
            }
        }, kind, a00.h0.J()));
        module.q(hVar5);
        if (module.m()) {
            module.v(hVar5);
        }
        eb0.a.c(new ra0.f(module, hVar5), new h10.d[]{kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.n.class), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.o.class)});
        ta0.h<?> hVar6 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.s.class), null, new x00.p() { // from class: hb0.o
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                com.baicizhan.app.biz.auth.s n11;
                n11 = p.n((cb0.b) obj, (ya0.a) obj2);
                return n11;
            }
        }, kind, a00.h0.J()));
        module.q(hVar6);
        if (module.m()) {
            module.v(hVar6);
        }
        eb0.a.c(new ra0.f(module, hVar6), new h10.d[]{kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.r.class), kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.s.class)});
        return yz.g2.f100423a;
    }

    public static final r3.d i(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new r3.d((com.baicizhan.app.preferences.a) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.preferences.a.class), null, null), (k50.a) single.i(kotlin.jvm.internal.o0.d(k50.a.class), null, null));
    }

    public static final com.baicizhan.app.biz.auth.c j(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new com.baicizhan.app.biz.auth.c((l7.p) single.i(kotlin.jvm.internal.o0.d(l7.p.class), null, null), (c7.e) single.i(kotlin.jvm.internal.o0.d(c7.e.class), null, null), (r3.d) single.i(kotlin.jvm.internal.o0.d(r3.d.class), null, null), (com.baicizhan.app.biz.auth.k) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.k.class), null, null));
    }

    public static final AuthServiceImpl k(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new AuthServiceImpl((com.baicizhan.app.biz.auth.s) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.s.class), null, null), (r3.d) single.i(kotlin.jvm.internal.o0.d(r3.d.class), null, null), (IAuthRepo) single.i(kotlin.jvm.internal.o0.d(IAuthRepo.class), null, null), (b6.a) single.i(kotlin.jvm.internal.o0.d(b6.a.class), null, null), (y5.a) single.i(kotlin.jvm.internal.o0.d(y5.a.class), null, null), (w3.a) single.i(kotlin.jvm.internal.o0.d(w3.a.class), null, null));
    }

    public static final com.baicizhan.app.biz.auth.k l(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new com.baicizhan.app.biz.auth.k();
    }

    public static final com.baicizhan.app.biz.auth.o m(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new com.baicizhan.app.biz.auth.o();
    }

    public static final com.baicizhan.app.biz.auth.s n(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new com.baicizhan.app.biz.auth.s();
    }

    @m80.k
    public static final va0.c o() {
        return eb0.e.b(false, new x00.l() { // from class: hb0.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h11;
                h11 = p.h((va0.c) obj);
                return h11;
            }
        }, 1, null);
    }

    @m80.k
    public static final va0.c p(@m80.k com.baicizhan.app.biz.auth.e eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        return o();
    }
}
