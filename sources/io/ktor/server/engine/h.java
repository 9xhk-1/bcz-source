package io.ktor.server.engine;

import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class h implements zx.k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.a f61381a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final xy.b f61382b;

    public h(@m80.k zx.a application) {
        kotlin.jvm.internal.g0.p(application, "application");
        this.f61381a = application;
        this.f61382b = xy.d.b(false, 1, null);
    }

    public static /* synthetic */ void e(h hVar, BaseApplicationResponse baseApplicationResponse, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putResponseAttribute");
        }
        if ((i11 & 1) != 0) {
            baseApplicationResponse = hVar.k();
        }
        hVar.d(baseApplicationResponse);
    }

    @Override // zx.k0, zx.b
    @m80.l
    public Object E(@m80.l Object obj, @m80.l gz.a aVar, @m80.k j00.c<? super yz.g2> cVar) {
        return k0.a.b(this, obj, aVar, cVar);
    }

    @Override // zx.k0, zx.b
    @m80.l
    public <T> Object L(@m80.k gz.a aVar, @m80.k j00.c<? super T> cVar) {
        return k0.a.a(this, aVar, cVar);
    }

    @m80.k
    /* renamed from: a */
    public abstract n f();

    @m80.k
    /* renamed from: b */
    public abstract BaseApplicationResponse k();

    public final void d(@m80.k BaseApplicationResponse response) {
        kotlin.jvm.internal.g0.p(response, "response");
        this.f61382b.e(BaseApplicationResponse.f61233g.a(), response);
    }

    @Override // zx.b
    @m80.k
    public final xy.b getAttributes() {
        return this.f61382b;
    }

    @Override // zx.b
    @m80.k
    public ix.p1 getParameters() {
        return f().m();
    }

    @Override // zx.b
    @m80.k
    public final zx.a w0() {
        return this.f61381a;
    }
}
