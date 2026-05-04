package f70;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.HttpRoute;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE)
/* loaded from: classes9.dex */
public class c extends b80.e<HttpRoute, q70.e> {

    /* renamed from: i, reason: collision with root package name */
    public final Log f51147i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f51148j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f51149k;

    public c(Log log, String str, HttpRoute httpRoute, q70.e eVar, long j11, TimeUnit timeUnit) {
        super(str, httpRoute, eVar, j11, timeUnit);
        this.f51147i = log;
    }

    @Override // b80.e
    public void a() {
        try {
            o();
        } catch (IOException e11) {
            this.f51147i.debug("I/O error closing connection", e11);
        }
    }

    @Override // b80.e
    public boolean k() {
        return !b().isOpen();
    }

    @Override // b80.e
    public boolean l(long j11) {
        boolean l11 = super.l(j11);
        if (l11 && this.f51147i.isDebugEnabled()) {
            this.f51147i.debug("Connection " + this + " expired @ " + new Date(d()));
        }
        return l11;
    }

    public void o() throws IOException {
        b().close();
    }

    public int p() {
        return this.f51148j;
    }

    public boolean q() {
        return this.f51149k;
    }

    public void r() {
        this.f51149k = true;
    }

    public void s(int i11) {
        this.f51148j = i11;
    }

    public void t() throws IOException {
        b().shutdown();
    }
}
