package rw;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpClientPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientPlugin.kt\nio/ktor/client/plugins/HttpClientPluginKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,49:1\n18#2:50\n58#3,16:51\n*S KotlinDebug\n*F\n+ 1 HttpClientPlugin.kt\nio/ktor/client/plugins/HttpClientPluginKt\n*L\n11#1:50\n11#1:51,16\n*E\n"})
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<xy.b> f84845a;

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(xy.b.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(xy.b.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f84845a = new xy.a<>("ApplicationPluginRegistry", new gz.a(d11, rVar));
    }

    @m80.k
    public static final xy.a<xy.b> a() {
        return f84845a;
    }

    @m80.k
    public static final <B, F> F b(@m80.k lw.c cVar, @m80.k y<? extends B, F> plugin) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        F f11 = (F) c(cVar, plugin);
        if (f11 != null) {
            return f11;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + plugin.getKey() + ")` in client config first.");
    }

    @m80.l
    public static final <B, F> F c(@m80.k lw.c cVar, @m80.k y<? extends B, F> plugin) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        xy.b bVar = (xy.b) cVar.getAttributes().a(f84845a);
        if (bVar != null) {
            return (F) bVar.a(plugin.getKey());
        }
        return null;
    }
}
