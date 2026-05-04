package e70;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends c<HttpResponse> {

    /* renamed from: l, reason: collision with root package name */
    public final org.apache.http.r f49555l;

    @Deprecated
    public k(x70.j jVar, l70.q qVar, org.apache.http.r rVar, HttpParams httpParams) {
        super(jVar, qVar, httpParams);
        e80.a.j(rVar, "Response factory");
        this.f49555l = rVar;
    }

    @Override // e70.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public HttpResponse c(CharArrayBuffer charArrayBuffer) throws HttpException, ParseException {
        return this.f49555l.b(this.f49529g.b(charArrayBuffer, new l70.r(0, charArrayBuffer.length())), null);
    }

    public k(x70.j jVar, l70.q qVar, org.apache.http.r rVar, v60.c cVar) {
        super(jVar, qVar, cVar);
        this.f49555l = rVar == null ? x60.l.f97646b : rVar;
    }

    public k(x70.j jVar, v60.c cVar) {
        this(jVar, (l70.q) null, (org.apache.http.r) null, cVar);
    }

    public k(x70.j jVar) {
        this(jVar, null);
    }
}
