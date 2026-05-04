package dc0;

import dc0.g;
import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;
import rx.internal.operators.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h<T> extends f<T, T> {

    /* renamed from: b, reason: collision with root package name */
    public final g<T> f47802b;

    /* renamed from: c, reason: collision with root package name */
    public final d.a f47803c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.b<g.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47804a;

        public a(g gVar) {
            this.f47804a = gVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g.c<T> cVar) {
            cVar.d(this.f47804a.j());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.a {
        public b() {
        }

        @Override // wb0.a
        public void call() {
            h.this.z7();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f47806a;

        public c(Throwable th2) {
            this.f47806a = th2;
        }

        @Override // wb0.a
        public void call() {
            h.this.A7(this.f47806a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f47808a;

        public d(Object obj) {
            this.f47808a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wb0.a
        public void call() {
            h.this.B7(this.f47808a);
        }
    }

    public h(c.a<T> aVar, g<T> gVar, bc0.d dVar) {
        super(aVar);
        this.f47802b = gVar;
        this.f47803c = dVar.a();
    }

    public static <T> h<T> y7(bc0.d dVar) {
        g gVar = new g();
        a aVar = new a(gVar);
        gVar.f47786d = aVar;
        gVar.f47787e = aVar;
        return new h<>(gVar, gVar, dVar);
    }

    public void A7(Throwable th2) {
        g<T> gVar = this.f47802b;
        if (gVar.f47784b) {
            for (g.c<T> cVar : gVar.p(v.c(th2))) {
                cVar.onError(th2);
            }
        }
    }

    public void B7(T t11) {
        for (g.c<T> cVar : this.f47802b.m()) {
            cVar.onNext(t11);
        }
    }

    public void C7(long j11) {
        this.f47803c.j(new b(), j11, TimeUnit.MILLISECONDS);
    }

    public void D7(Throwable th2, long j11) {
        this.f47803c.j(new c(th2), j11, TimeUnit.MILLISECONDS);
    }

    public void E7(T t11, long j11) {
        this.f47803c.j(new d(t11), j11, TimeUnit.MILLISECONDS);
    }

    @Override // qb0.c
    public void onCompleted() {
        C7(0L);
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        D7(th2, 0L);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        E7(t11, 0L);
    }

    @Override // dc0.f
    public boolean w7() {
        return this.f47802b.m().length > 0;
    }

    public void z7() {
        g<T> gVar = this.f47802b;
        if (gVar.f47784b) {
            for (g.c<T> cVar : gVar.p(v.b())) {
                cVar.onCompleted();
            }
        }
    }
}
