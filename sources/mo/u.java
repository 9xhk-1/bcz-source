package mo;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class u<N, E> implements d1<N, E> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<E, N> f73590a;

    public u(Map<E, N> incidentEdgeMap) {
        this.f73590a = (Map) Preconditions.checkNotNull(incidentEdgeMap);
    }

    @Override // mo.d1
    public Set<N> b() {
        return a();
    }

    @Override // mo.d1
    public Set<N> c() {
        return a();
    }

    @Override // mo.d1
    public N d(E edge) {
        N n11 = this.f73590a.get(edge);
        Objects.requireNonNull(n11);
        return n11;
    }

    @Override // mo.d1
    public Set<E> e() {
        return k();
    }

    @Override // mo.d1
    public N f(E edge) {
        N remove = this.f73590a.remove(edge);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // mo.d1
    public Set<E> g() {
        return k();
    }

    @Override // mo.d1
    @CheckForNull
    public N h(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return f(edge);
    }

    @Override // mo.d1
    public void i(E edge, N node) {
        Preconditions.checkState(this.f73590a.put(edge, node) == null);
    }

    @Override // mo.d1
    public void j(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        i(edge, node);
    }

    @Override // mo.d1
    public Set<E> k() {
        return Collections.unmodifiableSet(this.f73590a.keySet());
    }
}
