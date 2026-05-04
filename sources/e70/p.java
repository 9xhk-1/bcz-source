package e70;

import java.io.IOException;
import org.apache.http.HttpRequest;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class p extends d {
    public p(x70.k kVar, l70.p pVar, HttpParams httpParams) {
        super(kVar, pVar, httpParams);
    }

    @Override // e70.d
    public void b(org.apache.http.o oVar) throws IOException {
        this.f49531a.c(this.f49533c.b(this.f49532b, ((HttpRequest) oVar).getRequestLine()));
    }
}
