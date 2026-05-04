package a70;

import java.io.IOException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.ParseException;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i extends a<HttpRequest> {

    /* renamed from: i, reason: collision with root package name */
    public final org.apache.http.p f2250i;

    /* renamed from: j, reason: collision with root package name */
    public final CharArrayBuffer f2251j;

    @Deprecated
    public i(k70.h hVar, l70.q qVar, org.apache.http.p pVar, HttpParams httpParams) {
        super(hVar, qVar, httpParams);
        this.f2250i = (org.apache.http.p) e80.a.j(pVar, "Request factory");
        this.f2251j = new CharArrayBuffer(128);
    }

    @Override // a70.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public HttpRequest b(k70.h hVar) throws IOException, HttpException, ParseException {
        this.f2251j.clear();
        if (hVar.a(this.f2251j) == -1) {
            throw new ConnectionClosedException("Client closed connection");
        }
        return this.f2250i.b(this.f2189d.a(this.f2251j, new l70.r(0, this.f2251j.length())));
    }

    public i(k70.h hVar, l70.q qVar, org.apache.http.p pVar, v60.c cVar) {
        super(hVar, qVar, cVar);
        this.f2250i = pVar == null ? x60.k.f97641a : pVar;
        this.f2251j = new CharArrayBuffer(128);
    }

    public i(k70.h hVar, v60.c cVar) {
        this(hVar, (l70.q) null, (org.apache.http.p) null, cVar);
    }

    public i(k70.h hVar) {
        this(hVar, (l70.q) null, (org.apache.http.p) null, v60.c.f93129c);
    }
}
