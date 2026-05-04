package n3;

import a00.h0;
import android.app.Application;
import c4.n;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.koin.core.definition.Kind;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBizSdk.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizSdk.android.kt\ncom/baicizhan/app/biz/BizSdk_androidKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,32:1\n105#2,6:33\n111#2,5:61\n196#3,7:39\n203#3:60\n115#4,14:46\n*S KotlinDebug\n*F\n+ 1 BizSdk.android.kt\ncom/baicizhan/app/biz/BizSdk_androidKt\n*L\n28#1:33,6\n28#1:61,5\n28#1:39,7\n28#1:60\n28#1:46,14\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static Application f74382a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final va0.c f74383b = eb0.e.b(false, new x00.l() { // from class: n3.f
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 c11;
            c11 = h.c((va0.c) obj);
            return c11;
        }
    }, 1, null);

    public static final g2 c(va0.c module) {
        g0.p(module, "$this$module");
        p pVar = new p() { // from class: n3.g
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Application d11;
                d11 = h.d((cb0.b) obj, (ya0.a) obj2);
                return d11;
            }
        };
        ta0.h<?> hVar = new ta0.h<>(new ra0.b(ab0.e.f2509e.a(), o0.d(Application.class), null, pVar, Kind.Singleton, h0.J()));
        module.q(hVar);
        if (module.m()) {
            module.v(hVar);
        }
        new ra0.f(module, hVar);
        return g2.f100423a;
    }

    public static final Application d(cb0.b single, ya0.a it) {
        g0.p(single, "$this$single");
        g0.p(it, "it");
        return f();
    }

    @m80.k
    public static final e e(@m80.k x00.l<? super a, g2> config) {
        g0.p(config, "config");
        a aVar = new a();
        config.invoke(aVar);
        if (aVar.m() == null) {
            throw new RuntimeException("context must not be null");
        }
        Application m11 = aVar.m();
        g0.m(m11);
        h(m11);
        f7.b.e(f());
        return n.e(aVar);
    }

    @m80.k
    public static final Application f() {
        Application application = f74382a;
        if (application != null) {
            return application;
        }
        g0.S("androidApp");
        return null;
    }

    @m80.k
    public static final va0.c g() {
        return f74383b;
    }

    public static final void h(@m80.k Application application) {
        g0.p(application, "<set-?>");
        f74382a = application;
    }
}
