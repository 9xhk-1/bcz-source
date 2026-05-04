package f70;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class j extends b80.e<HttpRoute, x70.f> {

    /* renamed from: i, reason: collision with root package name */
    public final Log f51170i;

    /* renamed from: j, reason: collision with root package name */
    public final RouteTracker f51171j;

    public j(Log log, String str, HttpRoute httpRoute, x70.f fVar, long j11, TimeUnit timeUnit) {
        super(str, httpRoute, fVar, j11, timeUnit);
        this.f51170i = log;
        this.f51171j = new RouteTracker(httpRoute);
    }

    @Override // b80.e
    public void a() {
        try {
            p().shutdown();
        } catch (IOException e11) {
            if (this.f51170i.isDebugEnabled()) {
                this.f51170i.debug("I/O error shutting down connection", e11);
            }
        }
    }

    @Override // b80.e
    public boolean k() {
        return b().isClosed();
    }

    @Override // b80.e
    public boolean l(long j11) {
        boolean l11 = super.l(j11);
        if (l11 && this.f51170i.isDebugEnabled()) {
            this.f51170i.debug("Connection " + this + " expired @ " + new Date(d()));
        }
        return l11;
    }

    public HttpRoute o() {
        return this.f51171j.toRoute();
    }

    public q70.a p() {
        return (q70.a) b().getAttribute("http.connection");
    }

    public HttpRoute q() {
        return (HttpRoute) super.f();
    }

    public RouteTracker r() {
        return this.f51171j;
    }
}
