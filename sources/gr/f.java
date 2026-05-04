package gr;

import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class f<TResult> implements fr.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public fr.h f54046a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f54047b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54048c = new Object();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f54049a;

        public a(k kVar) {
            this.f54049a = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (f.this.f54048c) {
                try {
                    if (f.this.f54046a != null) {
                        f.this.f54046a.onFailure(this.f54049a.getException());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public f(Executor executor, fr.h hVar) {
        this.f54046a = hVar;
        this.f54047b = executor;
    }

    @Override // fr.e
    public final void cancel() {
        synchronized (this.f54048c) {
            this.f54046a = null;
        }
    }

    @Override // fr.e
    public final void onComplete(k<TResult> kVar) {
        if (kVar.isSuccessful() || kVar.isCanceled()) {
            return;
        }
        this.f54047b.execute(new a(kVar));
    }
}
