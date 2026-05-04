package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f85441a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85442b;

    /* renamed from: c, reason: collision with root package name */
    public final T f85443c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f85444a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85445b;

        public a(qb0.g gVar) {
            this.f85445b = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            int i11 = this.f85444a;
            h2 h2Var = h2.this;
            if (i11 <= h2Var.f85441a) {
                if (h2Var.f85442b) {
                    this.f85445b.onNext(h2Var.f85443c);
                    this.f85445b.onCompleted();
                    return;
                }
                this.f85445b.onError(new IndexOutOfBoundsException(h2.this.f85441a + " is out of bounds"));
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85445b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            int i11 = this.f85444a;
            this.f85444a = i11 + 1;
            if (i11 == h2.this.f85441a) {
                this.f85445b.onNext(t11);
                this.f85445b.onCompleted();
                unsubscribe();
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85445b.setProducer(new b(dVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends AtomicBoolean implements qb0.d {
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.d f85447a;

        public b(qb0.d dVar) {
            this.f85447a = dVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j11 <= 0 || !compareAndSet(false, true)) {
                return;
            }
            this.f85447a.request(Long.MAX_VALUE);
        }
    }

    public h2(int i11) {
        this(i11, null, false);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar);
        gVar.add(aVar);
        return aVar;
    }

    public h2(int i11, T t11) {
        this(i11, t11, true);
    }

    public h2(int i11, T t11, boolean z11) {
        if (i11 >= 0) {
            this.f85441a = i11;
            this.f85443c = t11;
            this.f85442b = z11;
        } else {
            throw new IndexOutOfBoundsException(i11 + " is out of bounds");
        }
    }
}
