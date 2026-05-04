package j70;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpHost;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.i;
import org.apache.http.params.HttpParams;
import v60.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public class b extends b80.a<HttpHost, i, c> {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicLong f63703m = new AtomicLong();

    public b(b80.b<HttpHost, i> bVar) {
        super(bVar, 2, 20);
    }

    @Override // b80.a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public c r(HttpHost httpHost, i iVar) {
        return new c(Long.toString(f63703m.getAndIncrement()), httpHost, iVar);
    }

    @Override // b80.a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public boolean J(c cVar) {
        return !cVar.b().X1();
    }

    @Deprecated
    public b(HttpParams httpParams) {
        super(new a(httpParams), 2, 20);
    }

    public b(f fVar, v60.a aVar) {
        super(new a(fVar, aVar), 2, 20);
    }

    public b() {
        super(new a(f.f93136i, v60.a.f93116g), 2, 20);
    }
}
