package sw;

import h10.t;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KVariance;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCreatePluginUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/client/plugins/api/ClientPluginImpl\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,94:1\n18#2:95\n58#3,16:96\n*S KotlinDebug\n*F\n+ 1 CreatePluginUtils.kt\nio/ktor/client/plugins/api/ClientPluginImpl\n*L\n59#1:95\n59#1:96,16\n*E\n"})
/* loaded from: classes8.dex */
public final class e<PluginConfigT> implements b<PluginConfigT> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.a<PluginConfigT> f88954a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<d<PluginConfigT>, g2> f88955b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final xy.a<g<PluginConfigT>> f88956c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@m80.k String name, @m80.k x00.a<? extends PluginConfigT> createConfiguration, @m80.k x00.l<? super d<PluginConfigT>, g2> body) {
        h10.r rVar;
        g0.p(name, "name");
        g0.p(createConfiguration, "createConfiguration");
        g0.p(body, "body");
        this.f88954a = createConfiguration;
        this.f88955b = body;
        h10.d d11 = o0.d(g.class);
        try {
            t.a aVar = h10.t.f57954c;
            h10.s F = o0.F(o0.d(e.class), "PluginConfigT", KVariance.INVARIANT, false);
            o0.y(F, o0.B(Object.class));
            rVar = o0.C(g.class, aVar.e(o0.A(F)));
        } catch (Throwable unused) {
            rVar = null;
        }
        this.f88956c = new xy.a<>(name, new gz.a(d11, rVar));
    }

    @Override // rw.y
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k g<PluginConfigT> plugin, @m80.k lw.c scope) {
        g0.p(plugin, "plugin");
        g0.p(scope, "scope");
        plugin.z5(scope);
    }

    @Override // rw.y
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public g<PluginConfigT> a(@m80.k x00.l<? super PluginConfigT, g2> block) {
        g0.p(block, "block");
        PluginConfigT invoke = this.f88954a.invoke();
        block.invoke(invoke);
        return new g<>(getKey(), invoke, this.f88955b);
    }

    @Override // rw.y
    @m80.k
    public xy.a<g<PluginConfigT>> getKey() {
        return this.f88956c;
    }
}
