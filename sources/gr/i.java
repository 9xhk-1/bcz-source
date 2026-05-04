package gr;

import android.app.Activity;
import fr.k;
import fr.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class i<TResult> extends k<TResult> {

    /* renamed from: g, reason: collision with root package name */
    public boolean f54059g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f54060h;

    /* renamed from: i, reason: collision with root package name */
    public TResult f54061i;

    /* renamed from: j, reason: collision with root package name */
    public Exception f54062j;

    /* renamed from: f, reason: collision with root package name */
    public final Object f54058f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List<fr.e<TResult>> f54063k = new ArrayList();

    public class a implements fr.i<TResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fr.j f54064a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f54065b;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* renamed from: gr.i$a$a, reason: collision with other inner class name */
        public class C0645a<TContinuationResult> implements fr.g<TContinuationResult> {
            public C0645a() {
            }

            @Override // fr.g
            public final void onComplete(k<TContinuationResult> kVar) {
                if (kVar.isSuccessful()) {
                    a.this.f54065b.c(kVar.getResult());
                } else if (kVar.isCanceled()) {
                    a.this.f54065b.d();
                } else {
                    a.this.f54065b.b(kVar.getException());
                }
            }
        }

        public a(fr.j jVar, i iVar) {
            this.f54064a = jVar;
            this.f54065b = iVar;
        }

        @Override // fr.i
        public final void onSuccess(TResult tresult) {
            try {
                k a11 = this.f54064a.a(tresult);
                if (a11 == null) {
                    this.f54065b.b(new NullPointerException("SuccessContinuation returned null"));
                } else {
                    a11.addOnCompleteListener(new C0645a());
                }
            } catch (Exception e11) {
                this.f54065b.b(e11);
            }
        }
    }

    public class b implements fr.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f54068a;

        public b(i iVar) {
            this.f54068a = iVar;
        }

        @Override // fr.h
        public final void onFailure(Exception exc) {
            this.f54068a.b(exc);
        }
    }

    public class c implements fr.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f54070a;

        public c(i iVar) {
            this.f54070a = iVar;
        }

        @Override // fr.f
        public final void a() {
            this.f54070a.d();
        }
    }

    public class d implements fr.g<TResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fr.d f54072a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f54073b;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        public class a<TContinuationResult> implements fr.g<TContinuationResult> {
            public a() {
            }

            @Override // fr.g
            public final void onComplete(k<TContinuationResult> kVar) {
                if (kVar.isSuccessful()) {
                    d.this.f54073b.c(kVar.getResult());
                } else if (kVar.isCanceled()) {
                    d.this.f54073b.d();
                } else {
                    d.this.f54073b.b(kVar.getException());
                }
            }
        }

        public d(fr.d dVar, i iVar) {
            this.f54072a = dVar;
            this.f54073b = iVar;
        }

        @Override // fr.g
        public final void onComplete(k<TResult> kVar) {
            try {
                k kVar2 = (k) this.f54072a.a(kVar);
                if (kVar2 == null) {
                    this.f54073b.b(new NullPointerException("Continuation returned null"));
                } else {
                    kVar2.addOnCompleteListener(new a());
                }
            } catch (Exception e11) {
                this.f54073b.b(e11);
            }
        }
    }

    public class e implements fr.g<TResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f54076a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fr.d f54077b;

        public e(i iVar, fr.d dVar) {
            this.f54076a = iVar;
            this.f54077b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // fr.g
        public final void onComplete(k<TResult> kVar) {
            if (kVar.isCanceled()) {
                this.f54076a.d();
                return;
            }
            try {
                this.f54076a.c(this.f54077b.a(kVar));
            } catch (Exception e11) {
                this.f54076a.b(e11);
            }
        }
    }

    public final k<TResult> a(fr.e<TResult> eVar) {
        boolean isComplete;
        synchronized (this.f54058f) {
            try {
                isComplete = isComplete();
                if (!isComplete) {
                    this.f54063k.add(eVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (isComplete) {
            eVar.onComplete(this);
        }
        return this;
    }

    @Override // fr.k
    public final k<TResult> addOnCanceledListener(Activity activity, fr.f fVar) {
        gr.b bVar = new gr.b(m.c(), fVar);
        g.c(activity, bVar);
        return a(bVar);
    }

    @Override // fr.k
    public final k<TResult> addOnCompleteListener(Activity activity, fr.g<TResult> gVar) {
        gr.d dVar = new gr.d(m.c(), gVar);
        g.c(activity, dVar);
        return a(dVar);
    }

    @Override // fr.k
    public final k<TResult> addOnFailureListener(Activity activity, fr.h hVar) {
        f fVar = new f(m.c(), hVar);
        g.c(activity, fVar);
        return a(fVar);
    }

    @Override // fr.k
    public final k<TResult> addOnSuccessListener(Activity activity, fr.i<TResult> iVar) {
        h hVar = new h(m.c(), iVar);
        g.c(activity, hVar);
        return a(hVar);
    }

    public final void b(Exception exc) {
        synchronized (this.f54058f) {
            try {
                if (!this.f54059g) {
                    this.f54059g = true;
                    this.f54062j = exc;
                    this.f54058f.notifyAll();
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(TResult tresult) {
        synchronized (this.f54058f) {
            try {
                if (!this.f54059g) {
                    this.f54059g = true;
                    this.f54061i = tresult;
                    this.f54058f.notifyAll();
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fr.k
    public final <TContinuationResult> k<TContinuationResult> continueWith(fr.d<TResult, TContinuationResult> dVar) {
        return continueWith(m.c(), dVar);
    }

    @Override // fr.k
    public final <TContinuationResult> k<TContinuationResult> continueWithTask(fr.d<TResult, k<TContinuationResult>> dVar) {
        return continueWithTask(m.c(), dVar);
    }

    public final boolean d() {
        synchronized (this.f54058f) {
            try {
                if (this.f54059g) {
                    return false;
                }
                this.f54059g = true;
                this.f54060h = true;
                this.f54058f.notifyAll();
                e();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f54058f) {
            Iterator<fr.e<TResult>> it = this.f54063k.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onComplete(this);
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception e12) {
                    throw new RuntimeException(e12);
                }
            }
            this.f54063k = null;
        }
    }

    @Override // fr.k
    public final Exception getException() {
        Exception exc;
        synchronized (this.f54058f) {
            exc = this.f54062j;
        }
        return exc;
    }

    @Override // fr.k
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f54058f) {
            try {
                if (this.f54062j != null) {
                    throw new RuntimeException(this.f54062j);
                }
                tresult = this.f54061i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // fr.k
    public final <E extends Throwable> TResult getResultThrowException(Class<E> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f54058f) {
            if (cls != null) {
                try {
                    if (cls.isInstance(this.f54062j)) {
                        throw cls.cast(this.f54062j);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f54062j != null) {
                throw new RuntimeException(this.f54062j);
            }
            tresult = this.f54061i;
        }
        return tresult;
    }

    @Override // fr.k
    public final boolean isCanceled() {
        return this.f54060h;
    }

    @Override // fr.k
    public final boolean isComplete() {
        boolean z11;
        synchronized (this.f54058f) {
            z11 = this.f54059g;
        }
        return z11;
    }

    @Override // fr.k
    public final boolean isSuccessful() {
        boolean z11;
        synchronized (this.f54058f) {
            try {
                z11 = this.f54059g && !isCanceled() && this.f54062j == null;
            } finally {
            }
        }
        return z11;
    }

    @Override // fr.k
    public final <TContinuationResult> k<TContinuationResult> onSuccessTask(fr.j<TResult, TContinuationResult> jVar) {
        return onSuccessTask(m.c(), jVar);
    }

    @Override // fr.k
    public final k<TResult> addOnCanceledListener(fr.f fVar) {
        return addOnCanceledListener(m.c(), fVar);
    }

    @Override // fr.k
    public final k<TResult> addOnCompleteListener(fr.g<TResult> gVar) {
        return addOnCompleteListener(m.c(), gVar);
    }

    @Override // fr.k
    public final k<TResult> addOnFailureListener(fr.h hVar) {
        return addOnFailureListener(m.c(), hVar);
    }

    @Override // fr.k
    public final k<TResult> addOnSuccessListener(fr.i<TResult> iVar) {
        return addOnSuccessListener(m.c(), iVar);
    }

    @Override // fr.k
    public final <TContinuationResult> k<TContinuationResult> continueWith(Executor executor, fr.d<TResult, TContinuationResult> dVar) {
        i iVar = new i();
        addOnCompleteListener(executor, new e(iVar, dVar));
        return iVar;
    }

    @Override // fr.k
    public final <TContinuationResult> k<TContinuationResult> continueWithTask(Executor executor, fr.d<TResult, k<TContinuationResult>> dVar) {
        i iVar = new i();
        addOnCompleteListener(executor, new d(dVar, iVar));
        return iVar;
    }

    @Override // fr.k
    public final <TContinuationResult> k<TContinuationResult> onSuccessTask(Executor executor, fr.j<TResult, TContinuationResult> jVar) {
        i iVar = new i();
        addOnSuccessListener(executor, new a(jVar, iVar));
        addOnFailureListener(new b(iVar));
        addOnCanceledListener(new c(iVar));
        return iVar;
    }

    @Override // fr.k
    public final k<TResult> addOnCanceledListener(Executor executor, fr.f fVar) {
        return a(new gr.b(executor, fVar));
    }

    @Override // fr.k
    public final k<TResult> addOnCompleteListener(Executor executor, fr.g<TResult> gVar) {
        return a(new gr.d(executor, gVar));
    }

    @Override // fr.k
    public final k<TResult> addOnFailureListener(Executor executor, fr.h hVar) {
        return a(new f(executor, hVar));
    }

    @Override // fr.k
    public final k<TResult> addOnSuccessListener(Executor executor, fr.i<TResult> iVar) {
        return a(new h(executor, iVar));
    }
}
