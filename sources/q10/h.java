package q10;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import q10.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<c> f81418a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@m80.k List<? extends c> annotations) {
        g0.p(annotations, "annotations");
        this.f81418a = annotations;
    }

    @Override // q10.g
    public boolean a0(@m80.k n20.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // q10.g
    @m80.l
    public c i(@m80.k n20.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // q10.g
    public boolean isEmpty() {
        return this.f81418a.isEmpty();
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<c> iterator() {
        return this.f81418a.iterator();
    }

    @m80.k
    public String toString() {
        return this.f81418a.toString();
    }
}
