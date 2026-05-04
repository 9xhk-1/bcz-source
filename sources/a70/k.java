package a70;

import java.io.IOException;
import org.apache.http.HttpRequest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends b<HttpRequest> {
    public k(k70.i iVar, l70.p pVar) {
        super(iVar, pVar);
    }

    @Override // a70.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(HttpRequest httpRequest) throws IOException {
        this.f2196c.b(this.f2195b, httpRequest.getRequestLine());
        this.f2194a.c(this.f2195b);
    }

    public k(k70.i iVar) {
        this(iVar, null);
    }
}
