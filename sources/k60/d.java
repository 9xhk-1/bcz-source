package k60;

import k60.a;
import kotlin.jvm.internal.g0;
import m80.k;
import okhttp3.l;
import okhttp3.n;
import t50.q;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f65996a = new d();

    @o
    @k
    public static final a.InterfaceC0761a b(@k final q client) {
        g0.p(client, "client");
        return new a.InterfaceC0761a() { // from class: k60.c
            @Override // k60.a.InterfaceC0761a
            public final a a(l lVar, b bVar) {
                a c11;
                c11 = d.c(q.this, lVar, bVar);
                return c11;
            }
        };
    }

    public static final a c(q client, l request, b listener) {
        g0.p(client, "$client");
        g0.p(request, "request");
        g0.p(listener, "listener");
        if (request.i("Accept") == null) {
            request = request.n().a("Accept", "text/event-stream").b();
        }
        h60.a aVar = new h60.a(request, listener);
        aVar.e(client);
        return aVar;
    }

    @o
    public static final void d(@k n response, @k b listener) {
        g0.p(response, "response");
        g0.p(listener, "listener");
        new h60.a(response.A0(), listener).g(response);
    }
}
