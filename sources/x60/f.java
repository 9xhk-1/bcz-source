package x60;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class f implements org.apache.http.j<e> {

    /* renamed from: f, reason: collision with root package name */
    public static final f f97626f = new f();

    /* renamed from: a, reason: collision with root package name */
    public final v60.a f97627a;

    /* renamed from: b, reason: collision with root package name */
    public final w60.e f97628b;

    /* renamed from: c, reason: collision with root package name */
    public final w60.e f97629c;

    /* renamed from: d, reason: collision with root package name */
    public final k70.f<HttpRequest> f97630d;

    /* renamed from: e, reason: collision with root package name */
    public final k70.d<HttpResponse> f97631e;

    public f(v60.a aVar, w60.e eVar, w60.e eVar2, k70.f<HttpRequest> fVar, k70.d<HttpResponse> dVar) {
        this.f97627a = aVar == null ? v60.a.f93116g : aVar;
        this.f97628b = eVar;
        this.f97629c = eVar2;
        this.f97630d = fVar;
        this.f97631e = dVar;
    }

    @Override // org.apache.http.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(Socket socket) throws IOException {
        e eVar = new e(this.f97627a.d(), this.f97627a.f(), d.a(this.f97627a), d.b(this.f97627a), this.f97627a.h(), this.f97628b, this.f97629c, this.f97630d, this.f97631e);
        eVar.c(socket);
        return eVar;
    }

    public f(v60.a aVar, k70.f<HttpRequest> fVar, k70.d<HttpResponse> dVar) {
        this(aVar, null, null, fVar, dVar);
    }

    public f(v60.a aVar) {
        this(aVar, null, null, null, null);
    }

    public f() {
        this(null, null, null, null, null);
    }
}
