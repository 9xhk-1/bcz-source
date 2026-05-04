package d70;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.logging.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Log f47344a = org.apache.commons.logging.g.q(getClass());

    /* renamed from: b, reason: collision with root package name */
    public final q70.f f47345b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f47346c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<b> f47347d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m70.i f47348a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q70.f f47349b;

        public a(m70.i iVar, q70.f fVar) {
            this.f47348a = iVar;
            this.f47349b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    this.f47349b.b(new q(this.f47348a));
                } catch (Exception e11) {
                    d.this.f47344a.error("I/O reactor terminated abnormally", e11);
                }
            } finally {
                d.this.f47347d.set(b.STOPPED);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        INACTIVE,
        ACTIVE,
        STOPPED
    }

    public d(q70.f fVar, ThreadFactory threadFactory, m70.i iVar) {
        this.f47345b = fVar;
        if (threadFactory == null || iVar == null) {
            this.f47346c = null;
        } else {
            this.f47346c = threadFactory.newThread(new a(iVar, fVar));
        }
        this.f47347d = new AtomicReference<>(b.INACTIVE);
    }

    @Override // d70.c
    public boolean E() {
        return this.f47347d.get() == b.ACTIVE;
    }

    @Override // d70.c
    public void H() {
        Thread thread;
        if (!androidx.camera.view.q.a(this.f47347d, b.INACTIVE, b.ACTIVE) || (thread = this.f47346c) == null) {
            return;
        }
        thread.start();
    }

    public final void S(d70.a aVar) {
        try {
            if (!E()) {
                throw new CancellationException("Request execution cancelled");
            }
            aVar.x0();
        } catch (Exception e11) {
            aVar.b(e11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!androidx.camera.view.q.a(this.f47347d, b.ACTIVE, b.STOPPED) || this.f47346c == null) {
            return;
        }
        try {
            this.f47345b.shutdown();
        } catch (IOException e11) {
            this.f47344a.error("I/O error shutting down connection manager", e11);
        }
        try {
            this.f47346c.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
