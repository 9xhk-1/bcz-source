package zx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
/* loaded from: classes8.dex */
public class u<PluginConfig> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final PluginConfig f103118a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final io.ktor.util.pipeline.d<?, k0> f103119b;

    public u(@m80.k PluginConfig pluginConfig, @m80.k io.ktor.util.pipeline.d<?, k0> context) {
        kotlin.jvm.internal.g0.p(pluginConfig, "pluginConfig");
        kotlin.jvm.internal.g0.p(context, "context");
        this.f103118a = pluginConfig;
        this.f103119b = context;
    }

    public final void a() {
        b().b();
    }

    @m80.k
    public io.ktor.util.pipeline.d<?, k0> b() {
        return this.f103119b;
    }

    @m80.k
    public final PluginConfig c() {
        return this.f103118a;
    }
}
