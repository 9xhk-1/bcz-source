package gr;

import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class e<TResult> implements fr.f, fr.h, fr.i<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f54040a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f54041b;

    /* renamed from: c, reason: collision with root package name */
    public final i<Void> f54042c;

    /* renamed from: d, reason: collision with root package name */
    public int f54043d;

    /* renamed from: e, reason: collision with root package name */
    public Exception f54044e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54045f;

    public e(int i11, i<Void> iVar) {
        this.f54041b = i11;
        this.f54042c = iVar;
    }

    @Override // fr.f
    public final void a() {
        synchronized (this.f54040a) {
            this.f54043d++;
            this.f54045f = true;
            b();
        }
    }

    public final void b() {
        if (this.f54043d >= this.f54041b) {
            if (this.f54044e != null) {
                this.f54042c.b(new ExecutionException("a task failed", this.f54044e));
            } else if (this.f54045f) {
                this.f54042c.d();
            } else {
                this.f54042c.c(null);
            }
        }
    }

    @Override // fr.h
    public final void onFailure(Exception exc) {
        synchronized (this.f54040a) {
            this.f54043d++;
            this.f54044e = exc;
            b();
        }
    }

    @Override // fr.i
    public final void onSuccess(TResult tresult) {
        synchronized (this.f54040a) {
            this.f54043d++;
            b();
        }
    }
}
