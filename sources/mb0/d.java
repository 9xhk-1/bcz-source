package mb0;

import lb0.y;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d<T> implements c.a<y<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.b<T> f73078a;

    public d(lb0.b<T> bVar) {
        this.f73078a = bVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super y<T>> gVar) {
        lb0.b<T> clone = this.f73078a.clone();
        b bVar = new b(clone, gVar);
        gVar.add(bVar);
        gVar.setProducer(bVar);
        try {
            bVar.c(clone.execute());
        } catch (Throwable th2) {
            vb0.a.e(th2);
            bVar.b(th2);
        }
    }
}
