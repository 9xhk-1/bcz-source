package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f85167a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rx.c f85168b;

        public a(Object obj, rx.c cVar) {
            this.f85167a = obj;
            this.f85168b = cVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            b bVar = new b(this.f85167a);
            this.f85168b.r5(bVar);
            return bVar.q();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public volatile Object f85169a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            public Object f85170a;

            public a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f85170a = b.this.f85169a;
                return !v.f(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f85170a == null) {
                        this.f85170a = b.this.f85169a;
                    }
                    if (v.f(this.f85170a)) {
                        throw new NoSuchElementException();
                    }
                    if (v.g(this.f85170a)) {
                        throw vb0.a.c(v.d(this.f85170a));
                    }
                    T t11 = (T) v.e(this.f85170a);
                    this.f85170a = null;
                    return t11;
                } catch (Throwable th2) {
                    this.f85170a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public b(T t11) {
            this.f85169a = v.j(t11);
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85169a = v.b();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85169a = v.c(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85169a = v.j(t11);
        }

        public Iterator<T> q() {
            return new a();
        }
    }

    public c() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> a(rx.c<? extends T> cVar, T t11) {
        return new a(t11, cVar);
    }
}
