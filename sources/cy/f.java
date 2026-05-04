package cy;

import hx.a;
import io.ktor.server.routing.y1;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;
import zx.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f<Param, Event extends hx.a<Param>> implements d0<l<? super Param, ? extends g2>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Event f46964a;

    public f(@k Event event) {
        g0.p(event, "event");
        this.f46964a = event;
    }

    public static final g2 d(l lVar, Object it) {
        g0.p(it, "it");
        lVar.invoke(it);
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx.d0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@k zx.c pipeline, @k final l<? super Param, g2> handler) {
        zx.a a11;
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        if (pipeline instanceof zx.a) {
            a11 = (zx.a) pipeline;
        } else {
            if (!(pipeline instanceof io.ktor.server.routing.g0)) {
                throw new IllegalStateException(("Unsupported pipeline: " + pipeline).toString());
            }
            a11 = y1.a((io.ktor.server.routing.g0) pipeline);
        }
        a11.n0().c(this.f46964a, new l() { // from class: cy.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = f.d(l.this, obj);
                return d11;
            }
        });
    }
}
