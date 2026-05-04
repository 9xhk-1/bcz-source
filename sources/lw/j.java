package lw;

import io.ktor.utils.io.c0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import ow.j;
import rw.y;
import rw.z;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
@u0({"SMAP\nHttpClientConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientConfig.kt\nio/ktor/client/HttpClientConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1863#2,2:135\n1863#2,2:137\n*S KotlinDebug\n*F\n+ 1 HttpClientConfig.kt\nio/ktor/client/HttpClientConfig\n*L\n108#1:135,2\n109#1:137,2\n*E\n"})
/* loaded from: classes8.dex */
public final class j<T extends ow.j> {

    /* renamed from: g, reason: collision with root package name */
    public boolean f71640g;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<xy.a<?>, x00.l<c, g2>> f71634a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<xy.a<?>, x00.l<Object, g2>> f71635b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<String, x00.l<c, g2>> f71636c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public x00.l<? super T, g2> f71637d = new x00.l() { // from class: lw.g
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 j11;
            j11 = j.j((ow.j) obj);
            return j11;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public boolean f71638e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71639f = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f71641h = io.ktor.util.a.f61985a.b();

    public static final g2 i(x00.l lVar, x00.l lVar2, ow.j jVar) {
        g0.p(jVar, "<this>");
        lVar.invoke(jVar);
        lVar2.invoke(jVar);
        return g2.f100423a;
    }

    public static final g2 j(ow.j jVar) {
        g0.p(jVar, "<this>");
        return g2.f100423a;
    }

    public static /* synthetic */ void t(j jVar, y yVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: lw.f
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 u11;
                    u11 = j.u(obj2);
                    return u11;
                }
            };
        }
        jVar.s(yVar, lVar);
    }

    public static final g2 u(Object obj) {
        g0.p(obj, "<this>");
        return g2.f100423a;
    }

    public static final g2 v(x00.l lVar, x00.l lVar2, Object obj) {
        g0.p(obj, "<this>");
        if (lVar != null) {
            lVar.invoke(obj);
        }
        lVar2.invoke(obj);
        return g2.f100423a;
    }

    public static final g2 w(y yVar, c scope) {
        g0.p(scope, "scope");
        xy.b bVar = (xy.b) scope.getAttributes().i(z.a(), new x00.a() { // from class: lw.i
            @Override // x00.a
            public final Object invoke() {
                xy.b x11;
                x11 = j.x();
                return x11;
            }
        });
        x00.l<Object, g2> lVar = scope.H().f71635b.get(yVar.getKey());
        g0.m(lVar);
        Object a11 = yVar.a(lVar);
        yVar.b(a11, scope);
        bVar.e(yVar.getKey(), a11);
        return g2.f100423a;
    }

    public static final xy.b x() {
        return xy.d.a(true);
    }

    public final void A(@m80.k x00.l<? super T, g2> lVar) {
        g0.p(lVar, "<set-?>");
        this.f71637d = lVar;
    }

    public final void B(boolean z11) {
        this.f71640g = z11;
    }

    public final void C(boolean z11) {
        this.f71638e = z11;
    }

    public final void D(boolean z11) {
        this.f71639f = z11;
    }

    @m80.k
    public final j<T> g() {
        j<T> jVar = new j<>();
        jVar.y(this);
        return jVar;
    }

    public final void h(@m80.k final x00.l<? super T, g2> block) {
        g0.p(block, "block");
        final x00.l<? super T, g2> lVar = this.f71637d;
        this.f71637d = new x00.l() { // from class: lw.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = j.i(x00.l.this, block, (ow.j) obj);
                return i11;
            }
        };
    }

    public final boolean k() {
        return this.f71641h;
    }

    @m80.k
    public final x00.l<T, g2> m() {
        return this.f71637d;
    }

    public final boolean n() {
        return this.f71640g;
    }

    public final boolean o() {
        return this.f71638e;
    }

    public final boolean p() {
        return this.f71639f;
    }

    public final void q(@m80.k String key, @m80.k x00.l<? super c, g2> block) {
        g0.p(key, "key");
        g0.p(block, "block");
        this.f71636c.put(key, block);
    }

    public final void r(@m80.k c client) {
        g0.p(client, "client");
        Iterator<T> it = this.f71634a.values().iterator();
        while (it.hasNext()) {
            ((x00.l) it.next()).invoke(client);
        }
        Iterator<T> it2 = this.f71636c.values().iterator();
        while (it2.hasNext()) {
            ((x00.l) it2.next()).invoke(client);
        }
    }

    public final <TBuilder, TPlugin> void s(@m80.k final y<? extends TBuilder, TPlugin> plugin, @m80.k final x00.l<? super TBuilder, g2> configure) {
        g0.p(plugin, "plugin");
        g0.p(configure, "configure");
        final x00.l<Object, g2> lVar = this.f71635b.get(plugin.getKey());
        this.f71635b.put(plugin.getKey(), new x00.l() { // from class: lw.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v11;
                v11 = j.v(x00.l.this, configure, obj);
                return v11;
            }
        });
        if (this.f71634a.containsKey(plugin.getKey())) {
            return;
        }
        this.f71634a.put(plugin.getKey(), new x00.l() { // from class: lw.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 w11;
                w11 = j.w(y.this, (c) obj);
                return w11;
            }
        });
    }

    public final void y(@m80.k j<? extends T> other) {
        g0.p(other, "other");
        this.f71638e = other.f71638e;
        this.f71639f = other.f71639f;
        this.f71640g = other.f71640g;
        this.f71634a.putAll(other.f71634a);
        this.f71635b.putAll(other.f71635b);
        this.f71636c.putAll(other.f71636c);
    }

    public final void z(boolean z11) {
        this.f71641h = z11;
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Development mode is no longer required. The property will be removed in the future.", replaceWith = @w0(expression = "", imports = {}))
    public static /* synthetic */ void l() {
    }
}
