package sb;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import okhttp3.l;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i f88260a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q f88261b;

    public k(long j11) {
        i iVar = new i();
        this.f88260a = iVar;
        q.a a11 = rb.e.b().a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f88261b = a11.j0(5000L, timeUnit).k(j11, timeUnit).t(false).u(false).c(iVar).f();
    }

    public static /* synthetic */ t50.b b(k kVar, l lVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        return kVar.a(lVar, i11, i12);
    }

    @m80.k
    public final t50.b a(@m80.k l request, int i11, int i12) {
        g0.p(request, "request");
        t50.b b11 = this.f88261b.b(request);
        this.f88260a.a(request, i11, i12);
        return b11;
    }

    public final int c() {
        return this.f88261b.T().a();
    }
}
