package d70;

import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class j<T> implements a0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final u60.a<T> f47389a;

    /* renamed from: b, reason: collision with root package name */
    public final Queue<w70.t<?>> f47390b;

    public j(u60.a<T> aVar, Queue<w70.t<?>> queue) {
        this.f47389a = aVar;
        this.f47390b = queue;
    }

    @Override // d70.a0
    public void a(w70.t<T> tVar) {
        this.f47389a.cancel(true);
        this.f47390b.remove(tVar);
    }

    @Override // d70.a0
    public void b(Exception exc, w70.t<T> tVar) {
        this.f47389a.c(exc);
        this.f47390b.remove(tVar);
    }

    @Override // d70.a0
    public void c(T t11, w70.t<T> tVar) {
        this.f47389a.a(t11);
        this.f47390b.remove(tVar);
    }

    @Override // d70.a0
    public boolean isDone() {
        return this.f47389a.isDone();
    }
}
