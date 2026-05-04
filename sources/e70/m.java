package e70;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m extends d<HttpResponse> {
    @Deprecated
    public m(x70.k kVar, l70.p pVar, HttpParams httpParams) {
        super(kVar, pVar, httpParams);
    }

    @Override // e70.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(HttpResponse httpResponse) throws IOException {
        this.f49531a.c(this.f49533c.d(this.f49532b, httpResponse.n()));
    }

    public m(x70.k kVar, l70.p pVar) {
        super(kVar, pVar);
    }

    public m(x70.k kVar) {
        super(kVar, null);
    }
}
