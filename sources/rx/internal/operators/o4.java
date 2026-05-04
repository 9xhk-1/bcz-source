package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class o4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Future<? extends T> f85864a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85865b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f85866c;

    public o4(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        this.f85864a = future;
        this.f85865b = j11;
        this.f85866c = timeUnit;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        Future<? extends T> future = this.f85864a;
        fVar.b(ec0.f.d(future));
        try {
            long j11 = this.f85865b;
            fVar.h(j11 == 0 ? future.get() : future.get(j11, this.f85866c));
        } catch (Throwable th2) {
            vb0.a.e(th2);
            fVar.onError(th2);
        }
    }
}
