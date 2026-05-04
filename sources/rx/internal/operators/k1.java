package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k1<T, K, V> implements c.a<Map<K, Collection<V>>>, wb0.o<Map<K, Collection<V>>> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends K> f85646a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends V> f85647b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.o<? extends Map<K, Collection<V>>> f85648c;

    /* renamed from: d, reason: collision with root package name */
    public final wb0.p<? super K, ? extends Collection<V>> f85649d;

    /* renamed from: e, reason: collision with root package name */
    public final rx.c<T> f85650e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> implements wb0.p<K, Collection<V>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a<Object, Object> f85651a = new a<>();

        public static <K, V> a<K, V> b() {
            return (a<K, V>) f85651a;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> call(K k11) {
            return new ArrayList();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T, K, V> extends u<T, Map<K, Collection<V>>> {

        /* renamed from: j, reason: collision with root package name */
        public final wb0.p<? super T, ? extends K> f85652j;

        /* renamed from: k, reason: collision with root package name */
        public final wb0.p<? super T, ? extends V> f85653k;

        /* renamed from: l, reason: collision with root package name */
        public final wb0.p<? super K, ? extends Collection<V>> f85654l;

        /* JADX WARN: Multi-variable type inference failed */
        public b(qb0.g<? super Map<K, Collection<V>>> gVar, Map<K, Collection<V>> map, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, wb0.p<? super K, ? extends Collection<V>> pVar3) {
            super(gVar);
            this.f86070c = map;
            this.f86069b = true;
            this.f85652j = pVar;
            this.f85653k = pVar2;
            this.f85654l = pVar3;
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86120i) {
                return;
            }
            try {
                K call = this.f85652j.call(t11);
                V call2 = this.f85653k.call(t11);
                Collection<V> collection = (Collection) ((Map) this.f86070c).get(call);
                if (collection == null) {
                    collection = this.f85654l.call(call);
                    ((Map) this.f86070c).put(call, collection);
                }
                collection.add(call2);
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

    public k1(rx.c<T> cVar, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2) {
        this(cVar, pVar, pVar2, null, a.b());
    }

    @Override // wb0.o, java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, Collection<V>> call() {
        return new HashMap();
    }

    @Override // wb0.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super Map<K, Collection<V>>> gVar) {
        try {
            new b(gVar, this.f85648c.call(), this.f85646a, this.f85647b, this.f85649d).H(this.f85650e);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            gVar.onError(th2);
        }
    }

    public k1(rx.c<T> cVar, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, wb0.o<? extends Map<K, Collection<V>>> oVar) {
        this(cVar, pVar, pVar2, oVar, a.b());
    }

    public k1(rx.c<T> cVar, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, wb0.o<? extends Map<K, Collection<V>>> oVar, wb0.p<? super K, ? extends Collection<V>> pVar3) {
        this.f85650e = cVar;
        this.f85646a = pVar;
        this.f85647b = pVar2;
        if (oVar == null) {
            this.f85648c = this;
        } else {
            this.f85648c = oVar;
        }
        this.f85649d = pVar3;
    }
}
