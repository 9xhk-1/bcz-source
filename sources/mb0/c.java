package mb0;

import lb0.y;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c<T> implements c.a<y<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.b<T> f73075a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements lb0.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f73076a;

        public a(b bVar) {
            this.f73076a = bVar;
        }

        @Override // lb0.d
        public void a(lb0.b<T> bVar, y<T> yVar) {
            this.f73076a.c(yVar);
        }

        @Override // lb0.d
        public void b(lb0.b<T> bVar, Throwable th2) {
            vb0.a.e(th2);
            this.f73076a.b(th2);
        }
    }

    public c(lb0.b<T> bVar) {
        this.f73075a = bVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super y<T>> gVar) {
        lb0.b<T> clone = this.f73075a.clone();
        b bVar = new b(clone, gVar);
        gVar.add(bVar);
        gVar.setProducer(bVar);
        clone.K0(new a(bVar));
    }
}
