package zx;

import io.ktor.server.routing.d1;
import java.util.Iterator;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCreatePluginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/server/application/CreatePluginUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1863#2,2:309\n1863#2,2:311\n1863#2,2:313\n1863#2,2:315\n1863#2,2:317\n*S KotlinDebug\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/server/application/CreatePluginUtilsKt\n*L\n278#1:309,2\n282#1:311,2\n286#1:313,2\n290#1:315,2\n294#1:317,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b0 {

    /* JADX INFO: Add missing generic type declarations: [PluginConfigT] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<PluginConfigT> extends o0<PluginConfigT> {

        /* renamed from: g, reason: collision with root package name */
        public final zx.a f103012g;

        /* renamed from: h, reason: collision with root package name */
        public final c f103013h;

        /* renamed from: i, reason: collision with root package name */
        public final PluginConfigT f103014i;

        public a(zx.a aVar, c cVar, PluginConfigT pluginconfigt, xy.a<q0> aVar2) {
            super(aVar2);
            this.f103012g = aVar;
            this.f103013h = cVar;
            this.f103014i = pluginconfigt;
        }

        @Override // zx.o0
        public zx.a c() {
            return this.f103012g;
        }

        @Override // zx.o0
        public c k() {
            return this.f103013h;
        }

        @Override // zx.o0
        public PluginConfigT l() {
            return this.f103014i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [PluginConfigT] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<PluginConfigT> extends s0<PluginConfigT> {

        /* renamed from: g, reason: collision with root package name */
        public final zx.a f103015g;

        /* renamed from: h, reason: collision with root package name */
        public final c f103016h;

        /* renamed from: i, reason: collision with root package name */
        public final PluginConfigT f103017i;

        /* renamed from: j, reason: collision with root package name */
        public final d1 f103018j;

        public b(zx.a aVar, c cVar, PluginConfigT pluginconfigt, xy.a<q0> aVar2) {
            super(aVar2);
            this.f103015g = aVar;
            this.f103016h = cVar;
            this.f103017i = pluginconfigt;
            this.f103018j = cVar instanceof d1 ? (d1) cVar : null;
        }

        @Override // zx.o0
        public zx.a c() {
            return this.f103015g;
        }

        @Override // zx.o0
        public c k() {
            return this.f103016h;
        }

        @Override // zx.o0
        public PluginConfigT l() {
            return this.f103017i;
        }

        @Override // zx.s0
        public d1 w() {
            return this.f103018j;
        }
    }

    @m80.k
    public static final <PluginConfigT> k<PluginConfigT> h(@m80.k String name, @m80.k String configurationPath, @m80.k x00.l<? super ey.a, ? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super o0<PluginConfigT>, g2> body) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(configurationPath, "configurationPath");
        kotlin.jvm.internal.g0.p(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.g0.p(body, "body");
        return new l(name, u(createConfiguration, configurationPath), body);
    }

    @m80.k
    public static final <PluginConfigT> k<PluginConfigT> i(@m80.k String name, @m80.k final x00.a<? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super o0<PluginConfigT>, g2> body) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.g0.p(body, "body");
        return new l(name, new x00.l() { // from class: zx.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object k11;
                k11 = b0.k(x00.a.this, (c) obj);
                return k11;
            }
        }, body);
    }

    @m80.k
    public static final k<g2> j(@m80.k String name, @m80.k x00.l<? super o0<g2>, g2> body) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(body, "body");
        return i(name, new x00.a() { // from class: zx.w
            @Override // x00.a
            public final Object invoke() {
                g2 l11;
                l11 = b0.l();
                return l11;
            }
        }, body);
    }

    public static final Object k(x00.a aVar, c ApplicationPluginImpl) {
        kotlin.jvm.internal.g0.p(ApplicationPluginImpl, "$this$ApplicationPluginImpl");
        return aVar.invoke();
    }

    public static final g2 l() {
        return g2.f100423a;
    }

    public static final <PipelineT extends c, PluginConfigT> q0 m(m0<? super PipelineT, ? extends PluginConfigT, q0> m0Var, zx.a aVar, c cVar, x00.l<? super o0<PluginConfigT>, g2> lVar, x00.l<? super c, ? extends PluginConfigT> lVar2, x00.l<? super PluginConfigT, g2> lVar3) {
        PluginConfigT invoke = lVar2.invoke(cVar);
        lVar3.invoke(invoke);
        a aVar2 = new a(aVar, cVar, invoke, m0Var.getKey());
        t(aVar2, lVar);
        return new q0(aVar2);
    }

    @m80.k
    public static final <PluginConfigT> r0<PluginConfigT> n(@m80.k String name, @m80.k String configurationPath, @m80.k x00.l<? super ey.a, ? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super s0<PluginConfigT>, g2> body) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(configurationPath, "configurationPath");
        kotlin.jvm.internal.g0.p(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.g0.p(body, "body");
        return new t0(name, u(createConfiguration, configurationPath), body);
    }

    @m80.k
    public static final <PluginConfigT> r0<PluginConfigT> o(@m80.k String name, @m80.k final x00.a<? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super s0<PluginConfigT>, g2> body) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.g0.p(body, "body");
        return new t0(name, new x00.l() { // from class: zx.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object q11;
                q11 = b0.q(x00.a.this, (c) obj);
                return q11;
            }
        }, body);
    }

    @m80.k
    public static final r0<g2> p(@m80.k String name, @m80.k x00.l<? super s0<g2>, g2> body) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(body, "body");
        return o(name, new x00.a() { // from class: zx.z
            @Override // x00.a
            public final Object invoke() {
                g2 r11;
                r11 = b0.r();
                return r11;
            }
        }, body);
    }

    public static final Object q(x00.a aVar, c RouteScopedPluginImpl) {
        kotlin.jvm.internal.g0.p(RouteScopedPluginImpl, "$this$RouteScopedPluginImpl");
        return aVar.invoke();
    }

    public static final g2 r() {
        return g2.f100423a;
    }

    public static final <PipelineT extends c, PluginConfigT> q0 s(m0<? super PipelineT, ? extends PluginConfigT, q0> m0Var, zx.a aVar, c cVar, x00.l<? super s0<PluginConfigT>, g2> lVar, x00.l<? super c, ? extends PluginConfigT> lVar2, x00.l<? super PluginConfigT, g2> lVar3) {
        PluginConfigT invoke = lVar2.invoke(cVar);
        lVar3.invoke(invoke);
        b bVar = new b(aVar, cVar, invoke, m0Var.getKey());
        t(bVar, lVar);
        return new q0(bVar);
    }

    public static final <Configuration, Builder extends o0<Configuration>> void t(Builder builder, x00.l<? super Builder, g2> lVar) {
        lVar.invoke(builder);
        Iterator<T> it = builder.e().iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a().invoke(builder.k());
        }
        Iterator<T> it2 = builder.i().iterator();
        while (it2.hasNext()) {
            ((f0) it2.next()).a().invoke(builder.k().g0());
        }
        Iterator<T> it3 = builder.j().iterator();
        while (it3.hasNext()) {
            ((f0) it3.next()).a().invoke(builder.k().j0());
        }
        Iterator<T> it4 = builder.b().iterator();
        while (it4.hasNext()) {
            ((f0) it4.next()).a().invoke(builder.k().j0());
        }
        Iterator<T> it5 = builder.g().iterator();
        while (it5.hasNext()) {
            ((e0) it5.next()).a(builder.k());
        }
    }

    public static final <T> x00.l<c, T> u(final x00.l<? super ey.a, ? extends T> lVar, final String str) {
        return new x00.l() { // from class: zx.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object v11;
                v11 = b0.v(str, lVar, (c) obj);
                return v11;
            }
        };
    }

    public static final Object v(String str, x00.l lVar, c cVar) {
        ey.a iVar;
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        try {
            iVar = cVar.a().getConfig().b(str);
        } catch (Throwable unused) {
            iVar = new ey.i();
        }
        return lVar.invoke(iVar);
    }
}
