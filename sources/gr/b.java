package gr;

import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class b<TResult> implements fr.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public fr.f f54028a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f54029b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54030c = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (b.this.f54030c) {
                try {
                    if (b.this.f54028a != null) {
                        b.this.f54028a.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public b(Executor executor, fr.f fVar) {
        this.f54028a = fVar;
        this.f54029b = executor;
    }

    @Override // fr.e
    public final void cancel() {
        synchronized (this.f54030c) {
            this.f54028a = null;
        }
    }

    @Override // fr.e
    public final void onComplete(k<TResult> kVar) {
        if (kVar.isCanceled()) {
            this.f54029b.execute(new a());
        }
    }
}
