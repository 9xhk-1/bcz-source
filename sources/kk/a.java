package kk;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kk.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66622a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f66623b;

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final Map<ik.b, d> f66624c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue<p<?>> f66625d;

    /* renamed from: e, reason: collision with root package name */
    public p.a f66626e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f66627f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public volatile c f66628g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kk.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0774a implements ThreadFactory {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kk.a$a$a, reason: collision with other inner class name */
        public class RunnableC0775a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f66629a;

            public RunnableC0775a(Runnable runnable) {
                this.f66629a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f66629a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0775a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public interface c {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class d extends WeakReference<p<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final ik.b f66632a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f66633b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public u<?> f66634c;

        public d(@NonNull ik.b bVar, @NonNull p<?> pVar, @NonNull ReferenceQueue<? super p<?>> referenceQueue, boolean z11) {
            super(pVar, referenceQueue);
            this.f66632a = (ik.b) fl.m.e(bVar);
            this.f66634c = (pVar.d() && z11) ? (u) fl.m.e(pVar.c()) : null;
            this.f66633b = pVar.d();
        }

        public void a() {
            this.f66634c = null;
            clear();
        }
    }

    public a(boolean z11) {
        this(z11, Executors.newSingleThreadExecutor(new ThreadFactoryC0774a()));
    }

    public synchronized void a(ik.b bVar, p<?> pVar) {
        d put = this.f66624c.put(bVar, new d(bVar, pVar, this.f66625d, this.f66622a));
        if (put != null) {
            put.a();
        }
    }

    public void b() {
        while (!this.f66627f) {
            try {
                c((d) this.f66625d.remove());
                c cVar = this.f66628g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(@NonNull d dVar) {
        u<?> uVar;
        synchronized (this) {
            this.f66624c.remove(dVar.f66632a);
            if (dVar.f66633b && (uVar = dVar.f66634c) != null) {
                this.f66626e.c(dVar.f66632a, new p<>(uVar, true, false, dVar.f66632a, this.f66626e));
            }
        }
    }

    public synchronized void d(ik.b bVar) {
        d remove = this.f66624c.remove(bVar);
        if (remove != null) {
            remove.a();
        }
    }

    @Nullable
    public synchronized p<?> e(ik.b bVar) {
        d dVar = this.f66624c.get(bVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    @VisibleForTesting
    public void f(c cVar) {
        this.f66628g = cVar;
    }

    public void g(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f66626e = aVar;
            }
        }
    }

    @VisibleForTesting
    public void h() {
        this.f66627f = true;
        Executor executor = this.f66623b;
        if (executor instanceof ExecutorService) {
            fl.f.d((ExecutorService) executor);
        }
    }

    @VisibleForTesting
    public a(boolean z11, Executor executor) {
        this.f66624c = new HashMap();
        this.f66625d = new ReferenceQueue<>();
        this.f66622a = z11;
        this.f66623b = executor;
        executor.execute(new b());
    }
}
