package c70;

import androidx.camera.view.q;
import b70.f;
import h70.g;
import h70.i;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m70.m;
import m70.s;
import org.apache.http.nio.reactor.IOReactorException;
import x70.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8248a;

    /* renamed from: b, reason: collision with root package name */
    public final InetAddress f8249b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8250c;

    /* renamed from: d, reason: collision with root package name */
    public final s f8251d;

    /* renamed from: e, reason: collision with root package name */
    public final m<? extends f> f8252e;

    /* renamed from: f, reason: collision with root package name */
    public final org.apache.http.c f8253f;

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f8254g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadGroup f8255h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference<c> f8256i;

    /* renamed from: j, reason: collision with root package name */
    public final g f8257j;

    /* renamed from: k, reason: collision with root package name */
    public volatile x70.g f8258k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: c70.a$a, reason: collision with other inner class name */
    public class C0138a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ org.apache.http.c f8259a;

        public C0138a(org.apache.http.c cVar) {
            this.f8259a = cVar;
        }

        @Override // x70.e
        public boolean a(RuntimeException runtimeException) {
            this.f8259a.a(runtimeException);
            return false;
        }

        @Override // x70.e
        public boolean b(IOException iOException) {
            this.f8259a.a(iOException);
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x70.c f8261a;

        public b(x70.c cVar) {
            this.f8261a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.f8257j.b(this.f8261a);
            } catch (Exception e11) {
                a.this.f8253f.a(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c {
        READY,
        ACTIVE,
        STOPPING
    }

    public a(int i11, InetAddress inetAddress, i iVar, s sVar, m<? extends f> mVar, org.apache.http.c cVar) {
        this.f8248a = i11;
        this.f8249b = inetAddress;
        this.f8250c = iVar;
        this.f8251d = sVar;
        this.f8252e = mVar;
        this.f8253f = cVar;
        this.f8254g = Executors.newSingleThreadExecutor(new c70.c("HTTP-listener-" + i11));
        ThreadGroup threadGroup = new ThreadGroup("I/O-dispatchers");
        this.f8255h = threadGroup;
        try {
            g gVar = new g(iVar, new c70.c("I/O-dispatch", threadGroup));
            this.f8257j = gVar;
            gVar.u(new C0138a(cVar));
            this.f8256i = new AtomicReference<>(c.READY);
        } catch (IOReactorException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void c(long j11, TimeUnit timeUnit) throws InterruptedException {
        this.f8254g.awaitTermination(j11, timeUnit);
    }

    public x70.g d() {
        return this.f8258k;
    }

    public void e(long j11, TimeUnit timeUnit) {
        if (q.a(this.f8256i, c.ACTIVE, c.STOPPING)) {
            try {
                this.f8257j.i(timeUnit.toMillis(j11));
            } catch (IOException e11) {
                this.f8253f.a(e11);
            }
            this.f8254g.shutdown();
        }
    }

    public void f() throws IOException {
        if (q.a(this.f8256i, c.READY, c.ACTIVE)) {
            g gVar = this.f8257j;
            InetAddress inetAddress = this.f8249b;
            int i11 = this.f8248a;
            if (i11 <= 0) {
                i11 = 0;
            }
            this.f8258k = gVar.c(new InetSocketAddress(inetAddress, i11));
            this.f8254g.execute(new b(new b70.c(this.f8251d, this.f8252e)));
        }
    }
}
