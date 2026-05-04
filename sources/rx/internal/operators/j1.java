package rx.internal.operators;

import java.util.HashMap;
import java.util.Map;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class j1<T, K, V> implements c.a<Map<K, V>>, wb0.o<Map<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85558a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends K> f85559b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.p<? super T, ? extends V> f85560c;

    /* renamed from: d, reason: collision with root package name */
    public final wb0.o<? extends Map<K, V>> f85561d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, K, V> extends u<T, Map<K, V>> {

        /* renamed from: j, reason: collision with root package name */
        public final wb0.p<? super T, ? extends K> f85562j;

        /* renamed from: k, reason: collision with root package name */
        public final wb0.p<? super T, ? extends V> f85563k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(qb0.g<? super Map<K, V>> gVar, Map<K, V> map, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2) {
            super(gVar);
            this.f86070c = map;
            this.f86069b = true;
            this.f85562j = pVar;
            this.f85563k = pVar2;
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86120i) {
                return;
            }
            try {
                ((Map) this.f86070c).put(this.f85562j.call(t11), this.f85563k.call(t11));
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(th2);
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public j1(rx.c<T> cVar, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2) {
        this(cVar, pVar, pVar2, null);
    }

    @Override // wb0.o, java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> call() {
        return new HashMap();
    }

    @Override // wb0.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super Map<K, V>> gVar) {
        try {
            new a(gVar, this.f85561d.call(), this.f85559b, this.f85560c).H(this.f85558a);
        } catch (Throwable th2) {
            vb0.a.f(th2, gVar);
        }
    }

    public j1(rx.c<T> cVar, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, wb0.o<? extends Map<K, V>> oVar) {
        this.f85558a = cVar;
        this.f85559b = pVar;
        this.f85560c = pVar2;
        if (oVar == null) {
            this.f85561d = this;
        } else {
            this.f85561d = oVar;
        }
    }
}
