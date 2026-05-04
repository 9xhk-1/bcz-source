package y60;

import c80.s;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.j;
import org.apache.http.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final v60.f f99429a;

    /* renamed from: b, reason: collision with root package name */
    public final ServerSocket f99430b;

    /* renamed from: c, reason: collision with root package name */
    public final s f99431c;

    /* renamed from: d, reason: collision with root package name */
    public final j<? extends t> f99432d;

    /* renamed from: e, reason: collision with root package name */
    public final org.apache.http.c f99433e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f99434f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f99435g = new AtomicBoolean(false);

    public b(v60.f fVar, ServerSocket serverSocket, s sVar, j<? extends t> jVar, org.apache.http.c cVar, ExecutorService executorService) {
        this.f99429a = fVar;
        this.f99430b = serverSocket;
        this.f99432d = jVar;
        this.f99431c = sVar;
        this.f99433e = cVar;
        this.f99434f = executorService;
    }

    public boolean a() {
        return this.f99435g.get();
    }

    public void b() throws IOException {
        if (this.f99435g.compareAndSet(false, true)) {
            this.f99430b.close();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!a() && !Thread.interrupted()) {
            try {
                Socket accept = this.f99430b.accept();
                accept.setSoTimeout(this.f99429a.h());
                accept.setKeepAlive(this.f99429a.i());
                accept.setTcpNoDelay(this.f99429a.l());
                if (this.f99429a.e() > 0) {
                    accept.setReceiveBufferSize(this.f99429a.e());
                }
                if (this.f99429a.f() > 0) {
                    accept.setSendBufferSize(this.f99429a.f());
                }
                if (this.f99429a.g() >= 0) {
                    accept.setSoLinger(true, this.f99429a.g());
                }
                this.f99434f.execute(new f(this.f99431c, this.f99432d.a(accept), this.f99433e));
            } catch (Exception e11) {
                this.f99433e.a(e11);
                return;
            }
        }
    }
}
