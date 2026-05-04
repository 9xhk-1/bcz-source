package gr;

import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class h<TResult> implements fr.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public fr.i<TResult> f54053a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f54054b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54055c = new Object();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f54056a;

        public a(k kVar) {
            this.f54056a = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (h.this.f54055c) {
                try {
                    if (h.this.f54053a != null) {
                        h.this.f54053a.onSuccess(this.f54056a.getResult());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public h(Executor executor, fr.i<TResult> iVar) {
        this.f54053a = iVar;
        this.f54054b = executor;
    }

    @Override // fr.e
    public final void cancel() {
        synchronized (this.f54055c) {
            this.f54053a = null;
        }
    }

    @Override // fr.e
    public final void onComplete(k<TResult> kVar) {
        if (!kVar.isSuccessful() || kVar.isCanceled()) {
            return;
        }
        this.f54054b.execute(new a(kVar));
    }
}
