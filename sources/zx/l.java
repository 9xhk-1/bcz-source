package zx;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCreatePluginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/server/application/ApplicationPluginImpl\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,308:1\n18#2:309\n58#3,16:310\n*S KotlinDebug\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/server/application/ApplicationPluginImpl\n*L\n77#1:309\n77#1:310,16\n*E\n"})
/* loaded from: classes8.dex */
public final class l<PluginConfigT> implements k<PluginConfigT> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<c, PluginConfigT> f103053a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<o0<PluginConfigT>, g2> f103054b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final xy.a<q0> f103055c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k String name, @m80.k x00.l<? super c, ? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super o0<PluginConfigT>, g2> body) {
        h10.r rVar;
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.g0.p(body, "body");
        this.f103053a = createConfiguration;
        this.f103054b = body;
        h10.d d11 = kotlin.jvm.internal.o0.d(q0.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(q0.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        this.f103055c = new xy.a<>(name, new gz.a(d11, rVar));
    }

    @Override // zx.m0
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0 a(@m80.k a pipeline, @m80.k x00.l<? super PluginConfigT, g2> configure) {
        q0 m11;
        kotlin.jvm.internal.g0.p(pipeline, "pipeline");
        kotlin.jvm.internal.g0.p(configure, "configure");
        m11 = b0.m(this, pipeline, pipeline, this.f103054b, this.f103053a, configure);
        return m11;
    }

    @Override // zx.m0
    @m80.k
    public xy.a<q0> getKey() {
        return this.f103055c;
    }
}
