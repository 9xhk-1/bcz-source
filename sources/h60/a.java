package h60;

import androidx.core.app.NotificationCompat;
import h60.b;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import okhttp3.j;
import okhttp3.l;
import okhttp3.n;
import okhttp3.o;
import t50.c;
import t50.m;
import t50.q;
import u50.f;
import yz.g2;
import z50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements k60.a, b.a, c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f58564a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final k60.b f58565b;

    /* renamed from: c, reason: collision with root package name */
    public e f58566c;

    public a(@k l request, @k k60.b listener) {
        g0.p(request, "request");
        g0.p(listener, "listener");
        this.f58564a = request;
        this.f58565b = listener;
    }

    @Override // h60.b.a
    public void b(@m80.l String str, @m80.l String str2, @k String data) {
        g0.p(data, "data");
        this.f58565b.b(this, str, str2, data);
    }

    @Override // t50.c
    public void c(@k t50.b call, @k n response) {
        g0.p(call, "call");
        g0.p(response, "response");
        g(response);
    }

    @Override // k60.a
    public void cancel() {
        e eVar = this.f58566c;
        if (eVar == null) {
            g0.S(NotificationCompat.CATEGORY_CALL);
            eVar = null;
        }
        eVar.cancel();
    }

    @Override // t50.c
    public void d(@k t50.b call, @k IOException e11) {
        g0.p(call, "call");
        g0.p(e11, "e");
        this.f58565b.d(this, e11, null);
    }

    public final void e(@k q client) {
        g0.p(client, "client");
        t50.b b11 = client.l0().r(m.f89630b).f().b(this.f58564a);
        g0.n(b11, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall");
        e eVar = (e) b11;
        this.f58566c = eVar;
        if (eVar == null) {
            g0.S(NotificationCompat.CATEGORY_CALL);
            eVar = null;
        }
        eVar.U(this);
    }

    public final boolean f(o oVar) {
        j r11 = oVar.r();
        return r11 != null && g0.g(r11.l(), "text") && g0.g(r11.k(), "event-stream");
    }

    public final void g(@k n response) {
        g0.p(response, "response");
        try {
            if (!response.S5()) {
                this.f58565b.d(this, null, response);
                r00.b.a(response, null);
                return;
            }
            o L = response.L();
            g0.m(L);
            if (!f(L)) {
                this.f58565b.d(this, new IllegalStateException("Invalid content-type: " + L.r()), response);
                r00.b.a(response, null);
                return;
            }
            e eVar = this.f58566c;
            if (eVar == null) {
                g0.S(NotificationCompat.CATEGORY_CALL);
                eVar = null;
            }
            eVar.B();
            n c11 = response.v0().b(f.f91848c).c();
            b bVar = new b(L.V(), this);
            try {
                this.f58565b.e(this, c11);
                do {
                } while (bVar.d());
                this.f58565b.a(this);
                g2 g2Var = g2.f100423a;
                r00.b.a(response, null);
            } catch (Exception e11) {
                this.f58565b.d(this, e11, c11);
                r00.b.a(response, null);
            }
        } finally {
        }
    }

    @Override // k60.a
    @k
    public l request() {
        return this.f58564a;
    }

    @Override // h60.b.a
    public void a(long j11) {
    }
}
