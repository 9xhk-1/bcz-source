package e70;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends c<HttpRequest> {

    /* renamed from: l, reason: collision with root package name */
    public final org.apache.http.p f49549l;

    @Deprecated
    public g(x70.j jVar, l70.q qVar, org.apache.http.p pVar, HttpParams httpParams) {
        super(jVar, qVar, httpParams);
        e80.a.j(pVar, "Request factory");
        this.f49549l = pVar;
    }

    @Override // e70.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public HttpRequest c(CharArrayBuffer charArrayBuffer) throws HttpException, ParseException {
        return this.f49549l.b(this.f49529g.a(charArrayBuffer, new l70.r(0, charArrayBuffer.length())));
    }

    public g(x70.j jVar, l70.q qVar, org.apache.http.p pVar, v60.c cVar) {
        super(jVar, qVar, cVar);
        this.f49549l = pVar == null ? x60.k.f97641a : pVar;
    }

    public g(x70.j jVar, v60.c cVar) {
        this(jVar, (l70.q) null, (org.apache.http.p) null, cVar);
    }

    public g(x70.j jVar) {
        this(jVar, null);
    }
}
