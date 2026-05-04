package zx;

import io.ktor.server.application.DuplicatePluginException;
import io.ktor.server.application.MissingApplicationPluginException;
import io.ktor.server.routing.RoutingRoot;
import io.ktor.server.routing.d1;
import io.ktor.server.routing.l1;
import io.ktor.server.routing.y1;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nApplicationPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationPlugin.kt\nio/ktor/server/application/ApplicationPluginKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,269:1\n1863#2:270\n1863#2,2:271\n1864#2:273\n1863#2,2:274\n18#3:276\n58#4,16:277\n*S KotlinDebug\n*F\n+ 1 ApplicationPlugin.kt\nio/ktor/server/application/ApplicationPluginKt\n*L\n166#1:270\n168#1:271,2\n166#1:273\n203#1:274,2\n56#1:276\n56#1:277,16\n*E\n"})
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<xy.b> f103106a;

    /* JADX INFO: Add missing generic type declarations: [TContext, TSubject] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.ApplicationPluginKt$addAllInterceptors$1$1$1", f = "ApplicationPlugin.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<TContext, TSubject> extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f103107a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f103108b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f103109c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t<B, F> f103110d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ F f103111e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.q<io.ktor.util.pipeline.d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object> f103112f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t<B, F> tVar, F f11, x00.q<? super io.ktor.util.pipeline.d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f103110d = tVar;
            this.f103111e = f11;
            this.f103112f = qVar;
        }

        public final Object invoke(io.ktor.util.pipeline.d<TSubject, TContext> dVar, TSubject tsubject, j00.c<? super g2> cVar) {
            a aVar = new a(this.f103110d, this.f103111e, this.f103112f, cVar);
            aVar.f103108b = dVar;
            aVar.f103109c = tsubject;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f103107a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f103108b;
                Object obj2 = this.f103109c;
                Object d11 = dVar.d();
                if ((d11 instanceof l1) && kotlin.jvm.internal.g0.g(u0.a(((l1) d11).i(), this.f103110d), this.f103111e)) {
                    x00.q<io.ktor.util.pipeline.d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object> qVar = this.f103112f;
                    this.f103108b = null;
                    this.f103107a = 1;
                    if (qVar.invoke(dVar, obj2, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, j00.c<? super g2> cVar) {
            return invoke((io.ktor.util.pipeline.d<io.ktor.util.pipeline.d<TSubject, TContext>, TContext>) obj, (io.ktor.util.pipeline.d<TSubject, TContext>) obj2, cVar);
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(xy.b.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(xy.b.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f103106a = new xy.a<>("ApplicationPluginRegistry", new gz.a(d11, rVar));
    }

    public static final xy.b e() {
        return xy.d.a(true);
    }

    public static final <B, F, TSubject, TContext, P extends io.ktor.util.pipeline.c<TSubject, TContext>> void f(P p11, P p12, t<B, F> tVar, F f11) {
        for (io.ktor.util.pipeline.h hVar : p11.x()) {
            Iterator<T> it = p12.D(hVar).iterator();
            while (it.hasNext()) {
                p11.C(hVar, new a(tVar, f11, (x00.q) it.next(), null));
            }
        }
    }

    @m80.k
    public static final <A extends io.ktor.util.pipeline.c<?, k0>> xy.b g(@m80.k A a11) {
        kotlin.jvm.internal.g0.p(a11, "<this>");
        return (xy.b) a11.getAttributes().i(f103106a, new x00.a() { // from class: zx.m
            @Override // x00.a
            public final Object invoke() {
                xy.b e11;
                e11 = q.e();
                return e11;
            }
        });
    }

    @m80.k
    public static final xy.a<xy.b> h() {
        return f103106a;
    }

    @yz.n(message = "Installing ApplicationPlugin into routing may lead to unexpected behaviour. Consider moving installation to the application level or migrate this plugin to `RouteScopedPlugin` to support installing into route.")
    @m80.k
    public static final <P extends d1, B, F> F i(@m80.k P p11, @m80.k s<? super P, ? extends B, F> plugin, @m80.k x00.l<? super B, g2> configure) {
        kotlin.jvm.internal.g0.p(p11, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        kotlin.jvm.internal.g0.p(configure, "configure");
        return (F) j(p11, plugin, configure);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <P extends io.ktor.util.pipeline.c<?, k0>, B, F> F j(@m80.k P p11, @m80.k m0<? super P, ? extends B, F> plugin, @m80.k x00.l<? super B, g2> configure) {
        kotlin.jvm.internal.g0.p(p11, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        kotlin.jvm.internal.g0.p(configure, "configure");
        if ((p11 instanceof d1) && (plugin instanceof t)) {
            return (F) o((d1) p11, (t) plugin, configure);
        }
        xy.b g11 = g(p11);
        F f11 = (F) g11.a(plugin.getKey());
        if (f11 == null) {
            F a11 = plugin.a(p11, configure);
            g11.e(plugin.getKey(), a11);
            return a11;
        }
        if (kotlin.jvm.internal.g0.g(f11, plugin)) {
            return f11;
        }
        throw new DuplicatePluginException("Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `" + plugin.getKey().e() + '`');
    }

    public static /* synthetic */ Object k(d1 d1Var, s sVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: zx.n
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 n11;
                    n11 = q.n(obj2);
                    return n11;
                }
            };
        }
        return i(d1Var, sVar, lVar);
    }

    public static /* synthetic */ Object l(io.ktor.util.pipeline.c cVar, m0 m0Var, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: zx.p
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 m11;
                    m11 = q.m(obj2);
                    return m11;
                }
            };
        }
        return j(cVar, m0Var, lVar);
    }

    public static final g2 m(Object obj) {
        kotlin.jvm.internal.g0.p(obj, "<this>");
        return g2.f100423a;
    }

    public static final g2 n(Object obj) {
        kotlin.jvm.internal.g0.p(obj, "<this>");
        return g2.f100423a;
    }

    public static final <B, F> F o(d1 d1Var, t<B, F> tVar, x00.l<? super B, g2> lVar) {
        if (g(d1Var).a(tVar.getKey()) != null) {
            throw new DuplicatePluginException("Please make sure that you use unique name for the plugin and don't install it twice. Plugin `" + tVar.getKey().e() + "` is already installed to the pipeline " + d1Var);
        }
        if (g(y1.a(d1Var)).a(tVar.getKey()) != null) {
            throw new DuplicatePluginException("Installing RouteScopedPlugin to application and route is not supported. Consider moving application level install to routing root.");
        }
        c routingRoot = d1Var instanceof RoutingRoot ? new RoutingRoot(((RoutingRoot) d1Var).w0()) : new d1(d1Var.getParent(), d1Var.q0(), d1Var.u(), d1Var.a());
        F a11 = tVar.a(routingRoot, lVar);
        g(d1Var).e(tVar.getKey(), a11);
        d1Var.K(routingRoot);
        d1Var.g0().K(routingRoot.g0());
        d1Var.j0().K(routingRoot.j0());
        f(d1Var, routingRoot, tVar, a11);
        f(d1Var.g0(), routingRoot.g0(), tVar, a11);
        f(d1Var.j0(), routingRoot.j0(), tVar, a11);
        return a11;
    }

    public static /* synthetic */ Object p(d1 d1Var, t tVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: zx.o
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 q11;
                    q11 = q.q(obj2);
                    return q11;
                }
            };
        }
        return o(d1Var, tVar, lVar);
    }

    public static final g2 q(Object obj) {
        kotlin.jvm.internal.g0.p(obj, "<this>");
        return g2.f100423a;
    }

    @m80.k
    public static final <A extends io.ktor.util.pipeline.c<?, k0>, F> F r(@m80.k A a11, @m80.k m0<?, ?, F> plugin) {
        kotlin.jvm.internal.g0.p(a11, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        F f11 = a11 instanceof d1 ? (F) u0.a((d1) a11, plugin) : (F) s(a11, plugin);
        if (f11 != null) {
            return f11;
        }
        throw new MissingApplicationPluginException(plugin.getKey());
    }

    @m80.l
    public static final <A extends io.ktor.util.pipeline.c<?, k0>, F> F s(@m80.k A a11, @m80.k m0<?, ?, F> plugin) {
        kotlin.jvm.internal.g0.p(a11, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        return (F) g(a11).a(plugin.getKey());
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "This method is misleading and will be removed. If you have use case that requires this functionaity, please add it in KTOR-2696")
    public static final <A extends io.ktor.util.pipeline.c<?, k0>, B, F> void t(@m80.k A a11, @m80.k m0<? super A, ? extends B, F> plugin) {
        kotlin.jvm.internal.g0.p(a11, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        v(a11, plugin.getKey());
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "This method is misleading and will be removed. If you have use case that requires this functionaity, please add it in KTOR-2696")
    public static final <A extends io.ktor.util.pipeline.c<?, k0>> void u(@m80.k A a11) {
        kotlin.jvm.internal.g0.p(a11, "<this>");
        Iterator<T> it = g(a11).f().iterator();
        while (it.hasNext()) {
            xy.a aVar = (xy.a) it.next();
            kotlin.jvm.internal.g0.n(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            v(a11, aVar);
        }
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "This method is misleading and will be removed. If you have use case that requires this functionaдity, please add it in KTOR-2696")
    public static final <A extends io.ktor.util.pipeline.c<?, k0>, F> void v(@m80.k A a11, @m80.k xy.a<F> key) {
        Object a12;
        kotlin.jvm.internal.g0.p(a11, "<this>");
        kotlin.jvm.internal.g0.p(key, "key");
        xy.b bVar = (xy.b) a11.getAttributes().a(f103106a);
        if (bVar == null || (a12 = bVar.a(key)) == null) {
            return;
        }
        if (a12 instanceof Closeable) {
            ((Closeable) a12).close();
        }
        bVar.b(key);
    }
}
