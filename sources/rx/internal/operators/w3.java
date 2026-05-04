package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import rx.c;
import rx.internal.producers.SingleDelayedProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class w3<T> implements c.b<List<T>, T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f86316c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<? super T> f86317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86318b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.q f86319a;

        public a(wb0.q qVar) {
            this.f86319a = qVar;
        }

        @Override // java.util.Comparator
        public int compare(T t11, T t12) {
            return ((Integer) this.f86319a.call(t11, t12)).intValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public List<T> f86321a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f86322b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SingleDelayedProducer f86323c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86324d;

        public b(SingleDelayedProducer singleDelayedProducer, qb0.g gVar) {
            this.f86323c = singleDelayedProducer;
            this.f86324d = gVar;
            this.f86321a = new ArrayList(w3.this.f86318b);
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86322b) {
                return;
            }
            this.f86322b = true;
            List<T> list = this.f86321a;
            this.f86321a = null;
            try {
                Collections.sort(list, w3.this.f86317a);
                this.f86323c.setValue(list);
            } catch (Throwable th2) {
                vb0.a.f(th2, this);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86324d.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86322b) {
                return;
            }
            this.f86321a.add(t11);
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public w3(int i11) {
        this.f86317a = f86316c;
        this.f86318b = i11;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super List<T>> gVar) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(gVar);
        b bVar = new b(singleDelayedProducer, gVar);
        gVar.add(bVar);
        gVar.setProducer(singleDelayedProducer);
        return bVar;
    }

    public w3(wb0.q<? super T, ? super T, Integer> qVar, int i11) {
        this.f86318b = i11;
        this.f86317a = new a(qVar);
    }
}
