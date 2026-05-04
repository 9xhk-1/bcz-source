package zx;

import io.ktor.server.routing.d1;
import io.ktor.server.routing.y1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCreatePluginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/server/application/RouteScopedPluginImpl\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,308:1\n18#2:309\n58#3,16:310\n*S KotlinDebug\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/server/application/RouteScopedPluginImpl\n*L\n158#1:309\n158#1:310,16\n*E\n"})
/* loaded from: classes8.dex */
public final class t0<PluginConfigT> implements r0<PluginConfigT> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<c, PluginConfigT> f103115a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<s0<PluginConfigT>, g2> f103116b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final xy.a<q0> f103117c;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@m80.k String name, @m80.k x00.l<? super c, ? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super s0<PluginConfigT>, g2> body) {
        h10.r rVar;
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.g0.p(body, "body");
        this.f103115a = createConfiguration;
        this.f103116b = body;
        h10.d d11 = kotlin.jvm.internal.o0.d(q0.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(q0.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        this.f103117c = new xy.a<>(name, new gz.a(d11, rVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx.m0
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0 a(@m80.k c pipeline, @m80.k x00.l<? super PluginConfigT, g2> configure) {
        a aVar;
        q0 s11;
        kotlin.jvm.internal.g0.p(pipeline, "pipeline");
        kotlin.jvm.internal.g0.p(configure, "configure");
        if (pipeline instanceof d1) {
            aVar = y1.a((io.ktor.server.routing.g0) pipeline);
        } else {
            if (!(pipeline instanceof a)) {
                throw new IllegalStateException(("Unsupported pipeline type: " + kotlin.jvm.internal.o0.d(pipeline.getClass())).toString());
            }
            aVar = (a) pipeline;
        }
        s11 = b0.s(this, aVar, pipeline, this.f103116b, this.f103115a, configure);
        return s11;
    }

    @Override // zx.m0
    @m80.k
    public xy.a<q0> getKey() {
        return this.f103117c;
    }
}
