package d70;

import org.apache.http.HttpVersion;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestAuthCache;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.client.protocol.RequestProxyAuthentication;
import org.apache.http.client.protocol.RequestTargetAuthentication;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.nio.reactor.IOReactorException;
import org.apache.http.params.HttpParams;
import org.apache.http.params.SyncBasicHttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class i extends b {
    public i(q70.c cVar) {
        super(cVar);
    }

    public static void q0(HttpParams httpParams) {
        a80.k.m(httpParams, HttpVersion.HTTP_1_1);
        a80.k.g(httpParams, c80.f.f8331t.name());
        a80.g.p(httpParams, true);
        a80.g.n(httpParams, 8192);
        a80.k.l(httpParams, e80.j.g("Apache-HttpAsyncClient", "org.apache.http.nio.client", i.class));
    }

    @Override // d70.b
    public HttpParams y() {
        SyncBasicHttpParams syncBasicHttpParams = new SyncBasicHttpParams();
        q0(syncBasicHttpParams);
        return syncBasicHttpParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.apache.http.client.protocol.RequestDefaultHeaders, org.apache.http.q] */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.apache.http.client.protocol.RequestProxyAuthentication, org.apache.http.q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.apache.http.client.protocol.RequestAddCookies, org.apache.http.q] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.apache.http.client.protocol.ResponseProcessCookies, org.apache.http.s] */
    /* JADX WARN: Type inference failed for: r1v9, types: [org.apache.http.client.protocol.RequestTargetAuthentication, org.apache.http.q] */
    @Override // d70.b
    public c80.b z() {
        c80.b bVar = new c80.b();
        bVar.p(new RequestDefaultHeaders());
        bVar.p(new c80.v());
        bVar.p(new c80.y());
        bVar.p(new RequestClientConnControl());
        bVar.p(new c80.z());
        bVar.p(new c80.x());
        bVar.p(new RequestAddCookies());
        bVar.s(new ResponseProcessCookies());
        bVar.p(new RequestAuthCache());
        bVar.p(new RequestTargetAuthentication());
        bVar.p(new RequestProxyAuthentication());
        return bVar;
    }

    public i(h70.i iVar) throws IOReactorException {
        super(iVar);
    }

    public i() throws IOReactorException {
        super(new h70.i());
    }
}
