package a70;

import java.io.IOException;
import org.apache.http.HttpRequest;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class s extends b<HttpRequest> {
    public s(k70.i iVar, l70.p pVar, HttpParams httpParams) {
        super(iVar, pVar, httpParams);
    }

    @Override // a70.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(HttpRequest httpRequest) throws IOException {
        this.f2196c.b(this.f2195b, httpRequest.getRequestLine());
        this.f2194a.c(this.f2195b);
    }
}
