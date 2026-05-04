package rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.c;
import rx.internal.producers.SingleDelayedProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class v3<T> implements c.b<List<T>, T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f86188a;

        /* renamed from: b, reason: collision with root package name */
        public List<T> f86189b = new LinkedList();

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SingleDelayedProducer f86190c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86191d;

        public a(SingleDelayedProducer singleDelayedProducer, qb0.g gVar) {
            this.f86190c = singleDelayedProducer;
            this.f86191d = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86188a) {
                return;
            }
            this.f86188a = true;
            try {
                ArrayList arrayList = new ArrayList(this.f86189b);
                this.f86189b = null;
                this.f86190c.setValue(arrayList);
            } catch (Throwable th2) {
                vb0.a.f(th2, this);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86191d.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86188a) {
                return;
            }
            this.f86189b.add(t11);
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final v3<Object> f86193a = new v3<>();
    }

    public static <T> v3<T> b() {
        return (v3<T>) b.f86193a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super List<T>> gVar) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gVar);
        a aVar = new a(singleDelayedProducer, gVar);
        gVar.add(aVar);
        gVar.setProducer(singleDelayedProducer);
        return aVar;
    }
}
