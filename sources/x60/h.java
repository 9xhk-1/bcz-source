package x60;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class h implements org.apache.http.j<g> {

    /* renamed from: f, reason: collision with root package name */
    public static final h f97634f = new h();

    /* renamed from: a, reason: collision with root package name */
    public final v60.a f97635a;

    /* renamed from: b, reason: collision with root package name */
    public final w60.e f97636b;

    /* renamed from: c, reason: collision with root package name */
    public final w60.e f97637c;

    /* renamed from: d, reason: collision with root package name */
    public final k70.d<HttpRequest> f97638d;

    /* renamed from: e, reason: collision with root package name */
    public final k70.f<HttpResponse> f97639e;

    public h(v60.a aVar, w60.e eVar, w60.e eVar2, k70.d<HttpRequest> dVar, k70.f<HttpResponse> fVar) {
        this.f97635a = aVar == null ? v60.a.f93116g : aVar;
        this.f97636b = eVar;
        this.f97637c = eVar2;
        this.f97638d = dVar;
        this.f97639e = fVar;
    }

    @Override // org.apache.http.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g a(Socket socket) throws IOException {
        g gVar = new g(this.f97635a.d(), this.f97635a.f(), d.a(this.f97635a), d.b(this.f97635a), this.f97635a.h(), this.f97636b, this.f97637c, this.f97638d, this.f97639e);
        gVar.c(socket);
        return gVar;
    }

    public h(v60.a aVar, k70.d<HttpRequest> dVar, k70.f<HttpResponse> fVar) {
        this(aVar, null, null, dVar, fVar);
    }

    public h(v60.a aVar) {
        this(aVar, null, null, null, null);
    }

    public h() {
        this(null, null, null, null, null);
    }
}
