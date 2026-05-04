package a70;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m extends a<HttpResponse> {

    /* renamed from: i, reason: collision with root package name */
    public final org.apache.http.r f2257i;

    /* renamed from: j, reason: collision with root package name */
    public final CharArrayBuffer f2258j;

    @Deprecated
    public m(k70.h hVar, l70.q qVar, org.apache.http.r rVar, HttpParams httpParams) {
        super(hVar, qVar, httpParams);
        this.f2257i = (org.apache.http.r) e80.a.j(rVar, "Response factory");
        this.f2258j = new CharArrayBuffer(128);
    }

    @Override // a70.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public HttpResponse b(k70.h hVar) throws IOException, HttpException, ParseException {
        this.f2258j.clear();
        if (hVar.a(this.f2258j) == -1) {
            throw new NoHttpResponseException("The target server failed to respond");
        }
        return this.f2257i.b(this.f2189d.b(this.f2258j, new l70.r(0, this.f2258j.length())), null);
    }

    public m(k70.h hVar, l70.q qVar, org.apache.http.r rVar, v60.c cVar) {
        super(hVar, qVar, cVar);
        this.f2257i = rVar == null ? x60.l.f97646b : rVar;
        this.f2258j = new CharArrayBuffer(128);
    }

    public m(k70.h hVar, v60.c cVar) {
        this(hVar, (l70.q) null, (org.apache.http.r) null, cVar);
    }

    public m(k70.h hVar) {
        this(hVar, (l70.q) null, (org.apache.http.r) null, v60.c.f93129c);
    }
}
