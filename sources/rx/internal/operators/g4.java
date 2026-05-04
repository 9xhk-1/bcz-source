package rx.internal.operators;

import java.util.Iterator;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g4<T1, T2, R> implements c.b<R, T1> {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<? extends T2> f85409a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.q<? super T1, ? super T2, ? extends R> f85410b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T1> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85411a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85412b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f85413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2, Iterator it) {
            super(gVar);
            this.f85412b = gVar2;
            this.f85413c = it;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85411a) {
                return;
            }
            this.f85411a = true;
            this.f85412b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85411a) {
                vb0.a.e(th2);
            } else {
                this.f85411a = true;
                this.f85412b.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T1 t12) {
            if (this.f85411a) {
                return;
            }
            try {
                this.f85412b.onNext(g4.this.f85410b.call(t12, (Object) this.f85413c.next()));
                if (this.f85413c.hasNext()) {
                    return;
                }
                onCompleted();
            } catch (Throwable th2) {
                vb0.a.f(th2, this);
            }
        }
    }

    public g4(Iterable<? extends T2> iterable, wb0.q<? super T1, ? super T2, ? extends R> qVar) {
        this.f85409a = iterable;
        this.f85410b = qVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T1> call(qb0.g<? super R> gVar) {
        Iterator<? extends T2> it = this.f85409a.iterator();
        try {
            if (it.hasNext()) {
                return new a(gVar, gVar, it);
            }
            gVar.onCompleted();
            return zb0.h.d();
        } catch (Throwable th2) {
            vb0.a.f(th2, gVar);
            return zb0.h.d();
        }
    }
}
