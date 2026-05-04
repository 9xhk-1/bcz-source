package dc0;

import dc0.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import rx.c;
import rx.internal.operators.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b<T> extends f<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f47735c = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final g<T> f47736b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.b<g.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47737a;

        public a(g gVar) {
            this.f47737a = gVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g.c<T> cVar) {
            cVar.d(this.f47737a.j());
        }
    }

    public b(c.a<T> aVar, g<T> gVar) {
        super(aVar);
        this.f47736b = gVar;
    }

    public static <T> b<T> A7(T t11, boolean z11) {
        g gVar = new g();
        if (z11) {
            gVar.o(v.j(t11));
        }
        a aVar = new a(gVar);
        gVar.f47786d = aVar;
        gVar.f47787e = aVar;
        return new b<>(gVar, gVar);
    }

    public static <T> b<T> y7() {
        return A7(null, false);
    }

    public static <T> b<T> z7(T t11) {
        return A7(t11, true);
    }

    public Throwable B7() {
        Object j11 = this.f47736b.j();
        if (v.g(j11)) {
            return v.d(j11);
        }
        return null;
    }

    public T C7() {
        Object j11 = this.f47736b.j();
        if (v.h(j11)) {
            return (T) v.e(j11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] D7() {
        Object[] objArr = f47735c;
        Object[] E7 = E7(objArr);
        return E7 == objArr ? new Object[0] : E7;
    }

    public T[] E7(T[] tArr) {
        Object j11 = this.f47736b.j();
        if (!v.h(j11)) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
        }
        tArr[0] = v.e(j11);
        if (tArr.length > 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean F7() {
        return v.f(this.f47736b.j());
    }

    public boolean G7() {
        return v.g(this.f47736b.j());
    }

    public boolean H7() {
        return v.h(this.f47736b.j());
    }

    public int I7() {
        return this.f47736b.m().length;
    }

    @Override // qb0.c
    public void onCompleted() {
        if (this.f47736b.j() == null || this.f47736b.f47784b) {
            Object b11 = v.b();
            for (g.c<T> cVar : this.f47736b.p(b11)) {
                cVar.f(b11);
            }
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        if (this.f47736b.j() == null || this.f47736b.f47784b) {
            Object c11 = v.c(th2);
            ArrayList arrayList = null;
            for (g.c<T> cVar : this.f47736b.p(c11)) {
                try {
                    cVar.f(c11);
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
        if (this.f47736b.j() == null || this.f47736b.f47784b) {
            Object j11 = v.j(t11);
            for (g.c<T> cVar : this.f47736b.l(j11)) {
                cVar.f(j11);
            }
        }
    }

    @Override // dc0.f
    public boolean w7() {
        return this.f47736b.m().length > 0;
    }
}
