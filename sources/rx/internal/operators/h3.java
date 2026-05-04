package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h3<T, U> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<U> f85448a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f85449a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zb0.g f85450b;

        public a(AtomicBoolean atomicBoolean, zb0.g gVar) {
            this.f85449a = atomicBoolean;
            this.f85450b = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            unsubscribe();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85450b.onError(th2);
            this.f85450b.unsubscribe();
        }

        @Override // qb0.c
        public void onNext(U u11) {
            this.f85449a.set(true);
            unsubscribe();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f85452a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zb0.g f85453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qb0.g gVar, AtomicBoolean atomicBoolean, zb0.g gVar2) {
            super(gVar);
            this.f85452a = atomicBoolean;
            this.f85453b = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85453b.onCompleted();
            unsubscribe();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85453b.onError(th2);
            unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85452a.get()) {
                this.f85453b.onNext(t11);
            } else {
                request(1L);
            }
        }
    }

    public h3(rx.c<U> cVar) {
        this.f85448a = cVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        zb0.g gVar2 = new zb0.g(gVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        a aVar = new a(atomicBoolean, gVar2);
        gVar.add(aVar);
        this.f85448a.J6(aVar);
        return new b(gVar, atomicBoolean, gVar2);
    }
}
