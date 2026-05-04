package rx.internal.operators;

import rx.c;
import rx.internal.producers.SingleDelayedProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class n1<T> implements c.b<Boolean, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, Boolean> f85763a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85764a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SingleDelayedProducer f85765b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85766c;

        public a(SingleDelayedProducer singleDelayedProducer, qb0.g gVar) {
            this.f85765b = singleDelayedProducer;
            this.f85766c = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85764a) {
                return;
            }
            this.f85764a = true;
            this.f85765b.setValue(Boolean.TRUE);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85764a) {
                ac0.c.I(th2);
            } else {
                this.f85764a = true;
                this.f85766c.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85764a) {
                return;
            }
            try {
                if (n1.this.f85763a.call(t11).booleanValue()) {
                    return;
                }
                this.f85764a = true;
                this.f85765b.setValue(Boolean.FALSE);
                unsubscribe();
            } catch (Throwable th2) {
                vb0.a.g(th2, this, t11);
            }
        }
    }

    public n1(wb0.p<? super T, Boolean> pVar) {
        this.f85763a = pVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super Boolean> gVar) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gVar);
        a aVar = new a(singleDelayedProducer, gVar);
        gVar.add(aVar);
        gVar.setProducer(singleDelayedProducer);
        return aVar;
    }
}
