package t70;

import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d extends w60.b {

    /* renamed from: g, reason: collision with root package name */
    public final HttpEntity f89947g;

    public d(HttpEntity httpEntity, z70.c cVar) {
        e80.a.j(httpEntity, "HTTP entity");
        this.f89947g = httpEntity;
        f0(new e(cVar));
    }

    @Override // w60.a, org.apache.http.HttpEntity
    public org.apache.http.e Z() {
        return this.f89947g.Z();
    }

    @Override // w60.a, org.apache.http.HttpEntity
    public boolean a0() {
        return this.f89947g.a0();
    }

    @Override // w60.b, org.apache.http.HttpEntity
    public long c0() {
        return this.f89947g.c0();
    }

    @Override // w60.a, org.apache.http.HttpEntity
    public org.apache.http.e getContentType() {
        return this.f89947g.getContentType();
    }
}
