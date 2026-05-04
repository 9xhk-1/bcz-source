package mw;

import cx.w;
import io.ktor.utils.io.g;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d extends a {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final byte[] f73747h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f73748i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k lw.c client, @k w request, @k ex.c response, @k byte[] responseBody) {
        super(client);
        g0.p(client, "client");
        g0.p(request, "request");
        g0.p(response, "response");
        g0.p(responseBody, "responseBody");
        this.f73747h = responseBody;
        n(new e(this, request));
        p(new f(this, responseBody, response));
        this.f73748i = true;
    }

    @Override // mw.a
    public boolean d() {
        return this.f73748i;
    }

    @Override // mw.a
    @l
    public Object l(@k j00.c<? super g> cVar) {
        return io.ktor.utils.io.c.e(this.f73747h, 0, 0, 6, null);
    }
}
