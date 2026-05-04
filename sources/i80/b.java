package i80;

import java.util.logging.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b implements Runnable, k {

    /* renamed from: a, reason: collision with root package name */
    public final j f60256a = new j();

    /* renamed from: b, reason: collision with root package name */
    public final c f60257b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f60258c;

    public b(c cVar) {
        this.f60257b = cVar;
    }

    @Override // i80.k
    public void a(p pVar, Object obj) {
        i a11 = i.a(pVar, obj);
        synchronized (this) {
            try {
                this.f60256a.a(a11);
                if (!this.f60258c) {
                    this.f60258c = true;
                    this.f60257b.g().execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    i c11 = this.f60256a.c(1000);
                    if (c11 == null) {
                        synchronized (this) {
                            c11 = this.f60256a.b();
                            if (c11 == null) {
                                this.f60258c = false;
                                this.f60258c = false;
                                return;
                            }
                        }
                    }
                    this.f60257b.l(c11);
                } catch (InterruptedException e11) {
                    this.f60257b.h().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e11);
                    this.f60258c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f60258c = false;
                throw th2;
            }
        }
    }
}
