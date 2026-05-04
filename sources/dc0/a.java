package dc0;

import dc0.g;
import java.util.ArrayList;
import rx.c;
import rx.internal.operators.v;
import rx.internal.producers.SingleProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a<T> extends f<T, T> {

    /* renamed from: b, reason: collision with root package name */
    public final g<T> f47732b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f47733c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dc0.a$a, reason: collision with other inner class name */
    public static class C0563a implements wb0.b<g.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47734a;

        public C0563a(g gVar) {
            this.f47734a = gVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g.c<T> cVar) {
            Object j11 = this.f47734a.j();
            if (j11 == null || v.f(j11)) {
                cVar.onCompleted();
            } else if (v.g(j11)) {
                cVar.onError(v.d(j11));
            } else {
                cVar.f47795a.setProducer(new SingleProducer(cVar.f47795a, v.e(j11)));
            }
        }
    }

    public a(c.a<T> aVar, g<T> gVar) {
        super(aVar);
        this.f47732b = gVar;
    }

    public static <T> a<T> y7() {
        g gVar = new g();
        gVar.f47787e = new C0563a(gVar);
        return new a<>(gVar, gVar);
    }

    public T A7() {
        Object obj = this.f47733c;
        if (v.g(this.f47732b.j()) || !v.h(obj)) {
            return null;
        }
        return (T) v.e(obj);
    }

    public boolean B7() {
        Object j11 = this.f47732b.j();
        return (j11 == null || v.g(j11)) ? false : true;
    }

    public boolean C7() {
        return v.g(this.f47732b.j());
    }

    public boolean D7() {
        return !v.g(this.f47732b.j()) && v.h(this.f47733c);
    }

    @Override // qb0.c
    public void onCompleted() {
        if (this.f47732b.f47784b) {
            Object obj = this.f47733c;
            if (obj == null) {
                obj = v.b();
            }
            for (g.c<T> cVar : this.f47732b.p(obj)) {
                if (obj == v.b()) {
                    cVar.onCompleted();
                } else {
                    cVar.f47795a.setProducer(new SingleProducer(cVar.f47795a, v.e(obj)));
                }
            }
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        if (this.f47732b.f47784b) {
            ArrayList arrayList = null;
            for (g.c<T> cVar : this.f47732b.p(v.c(th2))) {
                try {
                    cVar.onError(th2);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
            vb0.a.d(arrayList);
        }
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f47733c = v.j(t11);
    }

    @Override // dc0.f
    public boolean w7() {
        return this.f47732b.m().length > 0;
    }

    public Throwable z7() {
        Object j11 = this.f47732b.j();
        if (v.g(j11)) {
            return v.d(j11);
        }
        return null;
    }
}
