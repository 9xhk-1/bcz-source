package gr;

import fr.k;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class d<TResult> implements fr.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public fr.g<TResult> f54035a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f54036b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f54037c = new Object();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f54038a;

        public a(k kVar) {
            this.f54038a = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (d.this.f54037c) {
                try {
                    if (d.this.f54035a != null) {
                        d.this.f54035a.onComplete(this.f54038a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public d(Executor executor, fr.g<TResult> gVar) {
        this.f54035a = gVar;
        this.f54036b = executor;
    }

    @Override // fr.e
    public final void cancel() {
        synchronized (this.f54037c) {
            this.f54035a = null;
        }
    }

    @Override // fr.e
    public final void onComplete(k<TResult> kVar) {
        this.f54036b.execute(new a(kVar));
    }
}
