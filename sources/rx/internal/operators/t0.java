package rx.internal.operators;

import rx.b;
import rx.exceptions.AssemblyStackTraceException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class t0<T> implements b.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f86073c;

    /* renamed from: a, reason: collision with root package name */
    public final b.j0 f86074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86075b = s0.b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.b f86076a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86077b;

        public a(qb0.b bVar, String str) {
            this.f86076a = bVar;
            this.f86077b = str;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f86076a.a(hVar);
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f86076a.onCompleted();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            new AssemblyStackTraceException(this.f86077b).attachTo(th2);
            this.f86076a.onError(th2);
        }
    }

    public t0(b.j0 j0Var) {
        this.f86074a = j0Var;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        this.f86074a.call(new a(bVar, this.f86075b));
    }
}
