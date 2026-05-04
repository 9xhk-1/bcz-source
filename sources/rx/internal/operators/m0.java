package rx.internal.operators;

import java.util.concurrent.Callable;
import rx.c;
import rx.internal.producers.SingleDelayedProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f85723a;

    public m0(Callable<? extends T> callable) {
        this.f85723a = callable;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gVar);
        gVar.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.f85723a.call());
        } catch (Throwable th2) {
            vb0.a.f(th2, gVar);
        }
    }
}
