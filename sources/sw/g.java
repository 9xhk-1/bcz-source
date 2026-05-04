package sw;

import io.ktor.utils.io.b0;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClientPluginInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientPluginInstance.kt\nio/ktor/client/plugins/api/ClientPluginInstance\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1863#2,2:35\n*S KotlinDebug\n*F\n+ 1 ClientPluginInstance.kt\nio/ktor/client/plugins/api/ClientPluginInstance\n*L\n27#1:35,2\n*E\n"})
/* loaded from: classes8.dex */
public final class g<PluginConfig> implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final xy.a<g<PluginConfig>> f88957a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final PluginConfig f88958b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<d<PluginConfig>, g2> f88959c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public x00.a<g2> f88960d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k xy.a<g<PluginConfig>> key, @m80.k PluginConfig config, @m80.k x00.l<? super d<PluginConfig>, g2> body) {
        g0.p(key, "key");
        g0.p(config, "config");
        g0.p(body, "body");
        this.f88957a = key;
        this.f88958b = config;
        this.f88959c = body;
        this.f88960d = new x00.a() { // from class: sw.f
            @Override // x00.a
            public final Object invoke() {
                g2 c11;
                c11 = g.c();
                return c11;
            }
        };
    }

    public static final g2 c() {
        return g2.f100423a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f88960d.invoke();
    }

    @b0
    public final void z5(@m80.k lw.c scope) {
        g0.p(scope, "scope");
        d<PluginConfig> dVar = new d<>(this.f88957a, scope, this.f88958b);
        this.f88959c.invoke(dVar);
        this.f88960d = dVar.e();
        Iterator<T> it = dVar.c().iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(scope);
        }
    }
}
