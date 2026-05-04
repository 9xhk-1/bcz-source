package y60;

import androidx.camera.view.q;
import c80.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import org.apache.http.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f99411a;

    /* renamed from: b, reason: collision with root package name */
    public final InetAddress f99412b;

    /* renamed from: c, reason: collision with root package name */
    public final v60.f f99413c;

    /* renamed from: d, reason: collision with root package name */
    public final ServerSocketFactory f99414d;

    /* renamed from: e, reason: collision with root package name */
    public final s f99415e;

    /* renamed from: f, reason: collision with root package name */
    public final j<? extends x60.g> f99416f;

    /* renamed from: g, reason: collision with root package name */
    public final c f99417g;

    /* renamed from: h, reason: collision with root package name */
    public final org.apache.http.c f99418h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f99419i;

    /* renamed from: j, reason: collision with root package name */
    public final ThreadGroup f99420j;

    /* renamed from: k, reason: collision with root package name */
    public final g f99421k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference<EnumC1347a> f99422l;

    /* renamed from: m, reason: collision with root package name */
    public volatile ServerSocket f99423m;

    /* renamed from: n, reason: collision with root package name */
    public volatile b f99424n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y60.a$a, reason: collision with other inner class name */
    public enum EnumC1347a {
        READY,
        ACTIVE,
        STOPPING
    }

    public a(int i11, InetAddress inetAddress, v60.f fVar, ServerSocketFactory serverSocketFactory, s sVar, j<? extends x60.g> jVar, c cVar, org.apache.http.c cVar2) {
        this.f99411a = i11;
        this.f99412b = inetAddress;
        this.f99413c = fVar;
        this.f99414d = serverSocketFactory;
        this.f99415e = sVar;
        this.f99416f = jVar;
        this.f99417g = cVar;
        this.f99418h = cVar2;
        this.f99419i = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new e("HTTP-listener-" + i11));
        ThreadGroup threadGroup = new ThreadGroup("HTTP-workers");
        this.f99420j = threadGroup;
        this.f99421k = new g(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), new e("HTTP-worker", threadGroup));
        this.f99422l = new AtomicReference<>(EnumC1347a.READY);
    }

    public void a(long j11, TimeUnit timeUnit) throws InterruptedException {
        this.f99421k.awaitTermination(j11, timeUnit);
    }

    public InetAddress b() {
        ServerSocket serverSocket = this.f99423m;
        if (serverSocket != null) {
            return serverSocket.getInetAddress();
        }
        return null;
    }

    public int c() {
        ServerSocket serverSocket = this.f99423m;
        if (serverSocket != null) {
            return serverSocket.getLocalPort();
        }
        return -1;
    }

    public void d(long j11, TimeUnit timeUnit) {
        f();
        if (j11 > 0) {
            try {
                a(j11, timeUnit);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        Iterator<f> it = this.f99421k.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().a().shutdown();
            } catch (IOException e11) {
                this.f99418h.a(e11);
            }
        }
    }

    public void e() throws IOException {
        if (q.a(this.f99422l, EnumC1347a.READY, EnumC1347a.ACTIVE)) {
            this.f99423m = this.f99414d.createServerSocket(this.f99411a, this.f99413c.d(), this.f99412b);
            this.f99423m.setReuseAddress(this.f99413c.j());
            if (this.f99413c.e() > 0) {
                this.f99423m.setReceiveBufferSize(this.f99413c.e());
            }
            if (this.f99417g != null && (this.f99423m instanceof SSLServerSocket)) {
                this.f99417g.a((SSLServerSocket) this.f99423m);
            }
            this.f99424n = new b(this.f99413c, this.f99423m, this.f99415e, this.f99416f, this.f99418h, this.f99421k);
            this.f99419i.execute(this.f99424n);
        }
    }

    public void f() {
        if (q.a(this.f99422l, EnumC1347a.ACTIVE, EnumC1347a.STOPPING)) {
            this.f99419i.shutdown();
            this.f99421k.shutdown();
            b bVar = this.f99424n;
            if (bVar != null) {
                try {
                    bVar.b();
                } catch (IOException e11) {
                    this.f99418h.a(e11);
                }
            }
            this.f99420j.interrupt();
        }
    }
}
