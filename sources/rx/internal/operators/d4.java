package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d4<T, U, R> implements c.b<R, T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f85267c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final wb0.q<? super T, ? super U, ? extends R> f85268a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<? extends U> f85269b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85270a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zb0.g f85271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, boolean z11, AtomicReference atomicReference, zb0.g gVar2) {
            super(gVar, z11);
            this.f85270a = atomicReference;
            this.f85271b = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85271b.onCompleted();
            this.f85271b.unsubscribe();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85271b.onError(th2);
            this.f85271b.unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            Object obj = this.f85270a.get();
            if (obj != d4.f85267c) {
                try {
                    this.f85271b.onNext(d4.this.f85268a.call(t11, obj));
                } catch (Throwable th2) {
                    vb0.a.f(th2, this);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85273a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zb0.g f85274b;

        public b(AtomicReference atomicReference, zb0.g gVar) {
            this.f85273a = atomicReference;
            this.f85274b = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85273a.get() == d4.f85267c) {
                this.f85274b.onCompleted();
                this.f85274b.unsubscribe();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85274b.onError(th2);
            this.f85274b.unsubscribe();
        }

        @Override // qb0.c
        public void onNext(U u11) {
            this.f85273a.set(u11);
        }
    }

    public d4(rx.c<? extends U> cVar, wb0.q<? super T, ? super U, ? extends R> qVar) {
        this.f85269b = cVar;
        this.f85268a = qVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super R> gVar) {
        zb0.g gVar2 = new zb0.g(gVar, false);
        gVar.add(gVar2);
        AtomicReference atomicReference = new AtomicReference(f85267c);
        a aVar = new a(gVar2, true, atomicReference, gVar2);
        b bVar = new b(atomicReference, gVar2);
        gVar2.add(aVar);
        gVar2.add(bVar);
        this.f85269b.J6(bVar);
        return aVar;
    }
}
