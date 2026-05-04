package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class s2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<? super T> f86047a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f86048a;

        public a(AtomicLong atomicLong) {
            this.f86048a = atomicLong;
        }

        @Override // qb0.d
        public void request(long j11) {
            rx.internal.operators.a.b(this.f86048a, j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f86050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86051b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f86052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qb0.g gVar, qb0.g gVar2, AtomicLong atomicLong) {
            super(gVar);
            this.f86051b = gVar2;
            this.f86052c = atomicLong;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86050a) {
                return;
            }
            this.f86050a = true;
            this.f86051b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86050a) {
                ac0.c.I(th2);
            } else {
                this.f86050a = true;
                this.f86051b.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86050a) {
                return;
            }
            if (this.f86052c.get() > 0) {
                this.f86051b.onNext(t11);
                this.f86052c.decrementAndGet();
                return;
            }
            wb0.b<? super T> bVar = s2.this.f86047a;
            if (bVar != null) {
                try {
                    bVar.call(t11);
                } catch (Throwable th2) {
                    vb0.a.g(th2, this, t11);
                }
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final s2<Object> f86054a = new s2<>();
    }

    public s2() {
        this(null);
    }

    public static <T> s2<T> b() {
        return (s2<T>) c.f86054a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        AtomicLong atomicLong = new AtomicLong();
        gVar.setProducer(new a(atomicLong));
        return new b(gVar, gVar, atomicLong);
    }

    public s2(wb0.b<? super T> bVar) {
        this.f86047a = bVar;
    }
}
