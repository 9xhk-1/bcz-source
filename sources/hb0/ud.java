package hb0;

import ab0.e;
import com.baicizhan.app.biz.auth.IAuthRepo;
import com.baicizhan.app.biz.synservice.version.IVersionRepo;
import org.koin.core.definition.Kind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSynModuleGencom$baicizhan$app$biz$synservice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynModuleGencom$baicizhan$app$biz$synservice.kt\norg/koin/ksp/generated/SynModuleGencom_baicizhan_app_biz_synserviceKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,16:1\n153#2,10:17\n163#2,2:43\n105#2,6:45\n111#2,5:73\n153#2,10:78\n163#2,2:104\n153#2,10:106\n163#2,2:132\n105#2,6:134\n111#2,5:162\n105#2,6:167\n111#2,5:195\n212#3:27\n213#3:42\n196#3,7:51\n203#3:72\n212#3:88\n213#3:103\n212#3:116\n213#3:131\n196#3,7:140\n203#3:161\n196#3,7:173\n203#3:194\n115#4,14:28\n115#4,14:58\n115#4,14:89\n115#4,14:117\n115#4,14:147\n115#4,14:180\n50#5:200\n138#6,5:201\n138#6,5:206\n138#6,5:211\n138#6,5:216\n*S KotlinDebug\n*F\n+ 1 SynModuleGencom$baicizhan$app$biz$synservice.kt\norg/koin/ksp/generated/SynModuleGencom_baicizhan_app_biz_synserviceKt\n*L\n8#1:17,10\n8#1:43,2\n9#1:45,6\n9#1:73,5\n10#1:78,10\n10#1:104,2\n11#1:106,10\n11#1:132,2\n12#1:134,6\n12#1:162,5\n13#1:167,6\n13#1:195,5\n8#1:27\n8#1:42\n9#1:51,7\n9#1:72\n10#1:88\n10#1:103\n11#1:116\n11#1:131\n12#1:140,7\n12#1:161\n13#1:173,7\n13#1:194\n8#1:28,14\n9#1:58,14\n10#1:89,14\n11#1:117,14\n12#1:147,14\n13#1:180,14\n-1#1:200\n9#1:201,5\n10#1:206,5\n11#1:211,5\n12#1:216,5\n*E\n"})
/* loaded from: classes9.dex */
public final class ud {
    public static final yz.g2 h(va0.c module) {
        kotlin.jvm.internal.g0.p(module, "$this$module");
        za0.c cVar = new za0.c(i7.c.f60215c);
        x00.p pVar = new x00.p() { // from class: hb0.nd
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                j7.e i11;
                i11 = ud.i((cb0.b) obj, (ya0.a) obj2);
                return i11;
            }
        };
        e.a aVar = ab0.e.f2509e;
        za0.c a11 = aVar.a();
        Kind kind = Kind.Factory;
        ta0.b<?> aVar2 = new ta0.a<>(new ra0.b(a11, kotlin.jvm.internal.o0.d(j7.e.class), cVar, pVar, kind, a00.h0.J()));
        module.q(aVar2);
        eb0.a.b(new ra0.f(module, aVar2), kotlin.jvm.internal.o0.d(i7.a.class));
        x00.p pVar2 = new x00.p() { // from class: hb0.od
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                com.baicizhan.app.biz.synservice.version.a j11;
                j11 = ud.j((cb0.b) obj, (ya0.a) obj2);
                return j11;
            }
        };
        za0.c a12 = aVar.a();
        Kind kind2 = Kind.Singleton;
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(a12, kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.synservice.version.a.class), null, pVar2, kind2, a00.h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        eb0.a.b(new ra0.f(module, hVar), kotlin.jvm.internal.o0.d(IVersionRepo.class));
        za0.c cVar2 = new za0.c(i7.c.f60213a);
        x00.p pVar3 = new x00.p() { // from class: hb0.pd
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                i7.d k11;
                k11 = ud.k((cb0.b) obj, (ya0.a) obj2);
                return k11;
            }
        };
        ta0.b<?> aVar3 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(i7.d.class), cVar2, pVar3, kind, a00.h0.J()));
        module.q(aVar3);
        eb0.a.b(new ra0.f(module, aVar3), kotlin.jvm.internal.o0.d(i7.a.class));
        za0.c cVar3 = new za0.c(i7.c.f60214b);
        x00.p pVar4 = new x00.p() { // from class: hb0.qd
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                i7.f l11;
                l11 = ud.l((cb0.b) obj, (ya0.a) obj2);
                return l11;
            }
        };
        ta0.b<?> aVar4 = new ta0.a<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(i7.f.class), cVar3, pVar4, kind, a00.h0.J()));
        module.q(aVar4);
        eb0.a.b(new ra0.f(module, aVar4), kotlin.jvm.internal.o0.d(i7.a.class));
        x00.p pVar5 = new x00.p() { // from class: hb0.rd
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                i7.g m11;
                m11 = ud.m((cb0.b) obj, (ya0.a) obj2);
                return m11;
            }
        };
        ta0.h<?> hVar2 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(i7.g.class), null, pVar5, kind2, a00.h0.J()));
        module.q(hVar2);
        if (module.m()) {
            module.v(hVar2);
        }
        eb0.a.b(new ra0.f(module, hVar2), kotlin.jvm.internal.o0.d(k3.f3.class));
        x00.p pVar6 = new x00.p() { // from class: hb0.sd
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                i7.j n11;
                n11 = ud.n((cb0.b) obj, (ya0.a) obj2);
                return n11;
            }
        };
        ta0.h<?> hVar3 = new ta0.h<>(new ra0.b(aVar.a(), kotlin.jvm.internal.o0.d(i7.j.class), null, pVar6, kind2, a00.h0.J()));
        module.q(hVar3);
        if (module.m()) {
            module.v(hVar3);
        }
        eb0.a.b(new ra0.f(module, hVar3), kotlin.jvm.internal.o0.d(i7.b.class));
        return yz.g2.f100423a;
    }

    public static final j7.e i(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<destruct>");
        return new j7.e((i7.a) aVar.g(0, kotlin.jvm.internal.o0.d(i7.a.class)));
    }

    public static final com.baicizhan.app.biz.synservice.version.a j(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new com.baicizhan.app.biz.synservice.version.a((n7.e) single.i(kotlin.jvm.internal.o0.d(n7.e.class), null, null));
    }

    public static final i7.d k(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new i7.d((n7.e) factory.i(kotlin.jvm.internal.o0.d(n7.e.class), null, null), (r7.b) factory.i(kotlin.jvm.internal.o0.d(r7.b.class), null, null));
    }

    public static final i7.f l(cb0.b factory, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(factory, "$this$factory");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new i7.f((n7.e) factory.i(kotlin.jvm.internal.o0.d(n7.e.class), null, null));
    }

    public static final i7.g m(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new i7.g((i7.b) single.i(kotlin.jvm.internal.o0.d(i7.b.class), null, null), (IAuthRepo) single.i(kotlin.jvm.internal.o0.d(IAuthRepo.class), null, null), (com.baicizhan.app.biz.auth.n) single.i(kotlin.jvm.internal.o0.d(com.baicizhan.app.biz.auth.n.class), null, null));
    }

    public static final i7.j n(cb0.b single, ya0.a aVar) {
        kotlin.jvm.internal.g0.p(single, "$this$single");
        kotlin.jvm.internal.g0.p(aVar, "<unused var>");
        return new i7.j();
    }

    @m80.k
    public static final va0.c o() {
        return eb0.e.b(false, new x00.l() { // from class: hb0.td
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h11;
                h11 = ud.h((va0.c) obj);
                return h11;
            }
        }, 1, null);
    }

    @m80.k
    public static final va0.c p(@m80.k i7.e eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        return o();
    }
}
