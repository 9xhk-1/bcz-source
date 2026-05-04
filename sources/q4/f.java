package q4;

import a00.m0;
import io.ktor.server.routing.k0;
import io.ktor.server.routing.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBczServerBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczServerBuilder.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/server/BczServerBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1869#2,2:70\n1869#2,2:72\n*S KotlinDebug\n*F\n+ 1 BczServerBuilder.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/server/BczServerBuilder\n*L\n56#1:70,2\n60#1:72,2\n*E\n"})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<l<zx.a, g2>> f81701a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<h> f81702b = new ArrayList();

    public static final g2 g(final f fVar, zx.a BczServer) {
        g0.p(BczServer, "$this$BczServer");
        Iterator<T> it = fVar.f81701a.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(BczServer);
        }
        y1.e(BczServer, new l() { // from class: q4.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = f.h(f.this, (k0) obj);
                return h11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 h(f fVar, k0 routing) {
        g0.p(routing, "$this$routing");
        Iterator<T> it = fVar.f81702b.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(routing);
        }
        return g2.f100423a;
    }

    @k
    public final f c(@k l<? super zx.a, g2> config) {
        g0.p(config, "config");
        this.f81701a.add(config);
        return this;
    }

    @k
    public final f d(@k h provider) {
        g0.p(provider, "provider");
        this.f81702b.add(provider);
        return this;
    }

    @k
    public final f e(@k h... providers) {
        g0.p(providers, "providers");
        m0.u0(this.f81702b, providers);
        return this;
    }

    @k
    public final c f() {
        return new c(new l() { // from class: q4.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = f.g(f.this, (zx.a) obj);
                return g11;
            }
        });
    }
}
