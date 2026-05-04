package rx.internal.operators;

import rx.e;
import rx.exceptions.AssemblyStackTraceException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class u0<T> implements e.t<T> {

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f86121c;

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f86122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86123b = s0.b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f86124b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86125c;

        public a(qb0.f<? super T> fVar, String str) {
            this.f86124b = fVar;
            this.f86125c = str;
            fVar.b(this);
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f86124b.h(t11);
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f86125c).attachTo(th2);
            this.f86124b.onError(th2);
        }
    }

    public u0(e.t<T> tVar) {
        this.f86122a = tVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        this.f86122a.call(new a(fVar, this.f86123b));
    }
}
