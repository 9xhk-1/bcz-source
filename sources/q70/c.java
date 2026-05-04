package q70;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public interface c extends x70.d {
    r70.b getSchemeRegistry();

    void l(d dVar, long j11, TimeUnit timeUnit);

    Future<d> p(HttpRoute httpRoute, Object obj, long j11, TimeUnit timeUnit, u60.b<d> bVar);
}
