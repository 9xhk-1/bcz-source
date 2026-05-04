package sw;

import cx.y;
import io.ktor.utils.io.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public final class d<PluginConfig> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final xy.a<g<PluginConfig>> f88949a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final lw.c f88950b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final PluginConfig f88951c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<j<?>> f88952d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public x00.a<g2> f88953e;

    public d(@m80.k xy.a<g<PluginConfig>> key, @m80.k lw.c client, @m80.k PluginConfig pluginConfig) {
        g0.p(key, "key");
        g0.p(client, "client");
        g0.p(pluginConfig, "pluginConfig");
        this.f88949a = key;
        this.f88950b = client;
        this.f88951c = pluginConfig;
        this.f88952d = new ArrayList();
        this.f88953e = new x00.a() { // from class: sw.c
            @Override // x00.a
            public final Object invoke() {
                g2 i11;
                i11 = d.i();
                return i11;
            }
        };
    }

    public static final g2 i() {
        return g2.f100423a;
    }

    @m80.k
    public final lw.c b() {
        return this.f88950b;
    }

    @m80.k
    public final List<j<?>> c() {
        return this.f88952d;
    }

    @m80.k
    public final xy.a<g<PluginConfig>> d() {
        return this.f88949a;
    }

    @m80.k
    public final x00.a<g2> e() {
        return this.f88953e;
    }

    @m80.k
    public final PluginConfig f() {
        return this.f88951c;
    }

    public final <HookHandler> void g(@m80.k a<HookHandler> hook, HookHandler hookhandler) {
        g0.p(hook, "hook");
        this.f88952d.add(new j<>(hook, hookhandler));
    }

    public final void h(@m80.k x00.a<g2> block) {
        g0.p(block, "block");
        this.f88953e = block;
    }

    public final void j(@m80.k x00.r<? super m, ? super y, Object, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(block, "block");
        g(o.f88965a, block);
    }

    public final void k(@m80.k x00.q<? super n, ? super ex.c, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(block, "block");
        g(p.f88969a, block);
    }

    public final void l(@m80.k x00.a<g2> aVar) {
        g0.p(aVar, "<set-?>");
        this.f88953e = aVar;
    }

    public final void m(@m80.k x00.s<? super t, ? super y, Object, ? super gz.a, ? super j00.c<? super mx.v>, ? extends Object> block) {
        g0.p(block, "block");
        g(u.f88989a, block);
    }

    public final void n(@m80.k x00.s<? super v, ? super ex.c, ? super io.ktor.utils.io.g, ? super gz.a, ? super j00.c<Object>, ? extends Object> block) {
        g0.p(block, "block");
        g(w.f88993a, block);
    }
}
