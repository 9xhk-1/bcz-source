package yb0;

import qb0.g;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d<K, T> extends rx.c<T> {

    /* renamed from: b, reason: collision with root package name */
    public final K f99855b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f99856a;

        public a(rx.c cVar) {
            this.f99856a = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g<? super T> gVar) {
            this.f99856a.J6(gVar);
        }
    }

    public d(K k11, c.a<T> aVar) {
        super(aVar);
        this.f99855b = k11;
    }

    public static <K, T> d<K, T> w7(K k11, c.a<T> aVar) {
        return new d<>(k11, aVar);
    }

    public static <K, T> d<K, T> x7(K k11, rx.c<T> cVar) {
        return new d<>(k11, new a(cVar));
    }

    public K y7() {
        return this.f99855b;
    }
}
