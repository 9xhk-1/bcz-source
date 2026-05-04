package sw;

import hx.a;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l<Param, Event extends hx.a<Param>> implements a<x00.l<? super Param, ? extends g2>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Event f88964a;

    public l(@m80.k Event event) {
        g0.p(event, "event");
        this.f88964a = event;
    }

    public static final g2 d(x00.l lVar, Object it) {
        g0.p(it, "it");
        lVar.invoke(it);
        return g2.f100423a;
    }

    @Override // sw.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k final x00.l<? super Param, g2> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        client.Z().c(this.f88964a, new x00.l() { // from class: sw.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = l.d(x00.l.this, obj);
                return d11;
            }
        });
    }
}
