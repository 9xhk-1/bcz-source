package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.c;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m1<T, Resource> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.o<Resource> f85724a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super Resource, ? extends rx.c<? extends T>> f85725b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.b<? super Resource> f85726c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f85727d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<Resource> extends AtomicBoolean implements wb0.a, qb0.h {
        private static final long serialVersionUID = 4262875056400218316L;

        /* renamed from: a, reason: collision with root package name */
        public wb0.b<? super Resource> f85728a;

        /* renamed from: b, reason: collision with root package name */
        public Resource f85729b;

        public a(wb0.b<? super Resource> bVar, Resource resource) {
            this.f85728a = bVar;
            this.f85729b = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Resource, wb0.b<? super Resource>] */
        @Override // wb0.a
        public void call() {
            if (compareAndSet(false, true)) {
                ?? r02 = (Resource) null;
                try {
                    this.f85728a.call(this.f85729b);
                } finally {
                    this.f85729b = null;
                    this.f85728a = null;
                }
            }
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // qb0.h
        public void unsubscribe() {
            call();
        }
    }

    public m1(wb0.o<Resource> oVar, wb0.p<? super Resource, ? extends rx.c<? extends T>> pVar, wb0.b<? super Resource> bVar, boolean z11) {
        this.f85724a = oVar;
        this.f85725b = pVar;
        this.f85726c = bVar;
        this.f85727d = z11;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        try {
            Resource call = this.f85724a.call();
            a aVar = new a(this.f85726c, call);
            gVar.add(aVar);
            try {
                rx.c<? extends T> call2 = this.f85725b.call(call);
                try {
                    (this.f85727d ? call2.O1(aVar) : call2.G1(aVar)).J6(zb0.h.f(gVar));
                } catch (Throwable th2) {
                    Throwable b11 = b(aVar);
                    vb0.a.e(th2);
                    vb0.a.e(b11);
                    if (b11 != null) {
                        gVar.onError(new CompositeException(th2, b11));
                    } else {
                        gVar.onError(th2);
                    }
                }
            } catch (Throwable th3) {
                Throwable b12 = b(aVar);
                vb0.a.e(th3);
                vb0.a.e(b12);
                if (b12 != null) {
                    gVar.onError(new CompositeException(th3, b12));
                } else {
                    gVar.onError(th3);
                }
            }
        } catch (Throwable th4) {
            vb0.a.f(th4, gVar);
        }
    }

    public final Throwable b(wb0.a aVar) {
        try {
            aVar.call();
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }
}
