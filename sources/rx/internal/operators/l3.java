package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class l3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f85709a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f85710a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f85711b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85712c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.l3$a$a, reason: collision with other inner class name */
        public class C1092a implements qb0.d {

            /* renamed from: a, reason: collision with root package name */
            public final AtomicLong f85714a = new AtomicLong(0);

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ qb0.d f85715b;

            public C1092a(qb0.d dVar) {
                this.f85715b = dVar;
            }

            @Override // qb0.d
            public void request(long j11) {
                long j12;
                long min;
                if (j11 <= 0 || a.this.f85711b) {
                    return;
                }
                do {
                    j12 = this.f85714a.get();
                    min = Math.min(j11, l3.this.f85709a - j12);
                    if (min == 0) {
                        return;
                    }
                } while (!this.f85714a.compareAndSet(j12, j12 + min));
                this.f85715b.request(min);
            }
        }

        public a(qb0.g gVar) {
            this.f85712c = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85711b) {
                return;
            }
            this.f85711b = true;
            this.f85712c.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85711b) {
                ac0.c.I(th2);
                return;
            }
            this.f85711b = true;
            try {
                this.f85712c.onError(th2);
            } finally {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (isUnsubscribed()) {
                return;
            }
            int i11 = this.f85710a;
            int i12 = i11 + 1;
            this.f85710a = i12;
            int i13 = l3.this.f85709a;
            if (i11 < i13) {
                boolean z11 = i12 == i13;
                this.f85712c.onNext(t11);
                if (!z11 || this.f85711b) {
                    return;
                }
                this.f85711b = true;
                try {
                    this.f85712c.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85712c.setProducer(new C1092a(dVar));
        }
    }

    public l3(int i11) {
        if (i11 >= 0) {
            this.f85709a = i11;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i11);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar);
        if (this.f85709a == 0) {
            gVar.onCompleted();
            aVar.unsubscribe();
        }
        gVar.add(aVar);
        return aVar;
    }
}
