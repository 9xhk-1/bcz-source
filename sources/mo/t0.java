package mo;

import java.util.AbstractSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class t0<N> extends AbstractSet<f0<N>> {

    /* renamed from: a, reason: collision with root package name */
    public final N f73588a;

    /* renamed from: b, reason: collision with root package name */
    public final x<N> f73589b;

    public t0(x<N> graph, N node) {
        this.f73589b = graph;
        this.f73588a = node;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f73589b.c()) {
            if (!f0Var.b()) {
                return false;
            }
            Object l11 = f0Var.l();
            Object m11 = f0Var.m();
            return (this.f73588a.equals(l11) && this.f73589b.a((x<N>) this.f73588a).contains(m11)) || (this.f73588a.equals(m11) && this.f73589b.b((x<N>) this.f73588a).contains(l11));
        }
        if (f0Var.b()) {
            return false;
        }
        Set<N> d11 = this.f73589b.d(this.f73588a);
        Object f11 = f0Var.f();
        Object g11 = f0Var.g();
        return (this.f73588a.equals(g11) && d11.contains(f11)) || (this.f73588a.equals(f11) && d11.contains(g11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object o11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f73589b.c() ? (this.f73589b.f(this.f73588a) + this.f73589b.l(this.f73588a)) - (this.f73589b.a((x<N>) this.f73588a).contains(this.f73588a) ? 1 : 0) : this.f73589b.d(this.f73588a).size();
    }
}
