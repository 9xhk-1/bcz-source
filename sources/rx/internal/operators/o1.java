package rx.internal.operators;

import rx.c;
import rx.internal.producers.SingleDelayedProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class o1<T> implements c.b<Boolean, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, Boolean> f85824a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85825b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85826a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f85827b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SingleDelayedProducer f85828c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85829d;

        public a(SingleDelayedProducer singleDelayedProducer, qb0.g gVar) {
            this.f85828c = singleDelayedProducer;
            this.f85829d = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85827b) {
                return;
            }
            this.f85827b = true;
            if (this.f85826a) {
                this.f85828c.setValue(Boolean.FALSE);
            } else {
                this.f85828c.setValue(Boolean.valueOf(o1.this.f85825b));
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85827b) {
                ac0.c.I(th2);
            } else {
                this.f85827b = true;
                this.f85829d.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85827b) {
                return;
            }
            this.f85826a = true;
            try {
                if (o1.this.f85824a.call(t11).booleanValue()) {
                    this.f85827b = true;
                    this.f85828c.setValue(Boolean.valueOf(true ^ o1.this.f85825b));
                    unsubscribe();
                }
            } catch (Throwable th2) {
                vb0.a.g(th2, this, t11);
            }
        }
    }

    public o1(wb0.p<? super T, Boolean> pVar, boolean z11) {
        this.f85824a = pVar;
        this.f85825b = z11;
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
