package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.aa;
import com.google.common.collect.k6;
import com.google.common.collect.l6;
import com.google.common.collect.q8;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class i<N, E> implements d1<N, E> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<E, N> f73515a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<E, N> f73516b;

    /* renamed from: c, reason: collision with root package name */
    public int f73517c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AbstractSet<E> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa<E> iterator() {
            return l6.e0((i.this.f73517c == 0 ? k6.f(i.this.f73515a.keySet(), i.this.f73516b.keySet()) : q8.O(i.this.f73515a.keySet(), i.this.f73516b.keySet())).iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return i.this.f73515a.containsKey(obj) || i.this.f73516b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.t(i.this.f73515a.size(), i.this.f73516b.size() - i.this.f73517c);
        }
    }

    public i(Map<E, N> inEdgeMap, Map<E, N> outEdgeMap, int selfLoopCount) {
        this.f73515a = (Map) Preconditions.checkNotNull(inEdgeMap);
        this.f73516b = (Map) Preconditions.checkNotNull(outEdgeMap);
        this.f73517c = com.google.common.graph.d.d(selfLoopCount);
        Preconditions.checkState(selfLoopCount <= inEdgeMap.size() && selfLoopCount <= outEdgeMap.size());
    }

    @Override // mo.d1
    public Set<N> a() {
        return q8.O(c(), b());
    }

    @Override // mo.d1
    public N d(E edge) {
        N n11 = this.f73516b.get(edge);
        Objects.requireNonNull(n11);
        return n11;
    }

    @Override // mo.d1
    public Set<E> e() {
        return Collections.unmodifiableSet(this.f73515a.keySet());
    }

    @Override // mo.d1
    public N f(E edge) {
        N remove = this.f73516b.remove(edge);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // mo.d1
    public Set<E> g() {
        return Collections.unmodifiableSet(this.f73516b.keySet());
    }

    @Override // mo.d1
    public N h(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            int i11 = this.f73517c - 1;
            this.f73517c = i11;
            com.google.common.graph.d.d(i11);
        }
        N remove = this.f73515a.remove(edge);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // mo.d1
    public void i(E edge, N node) {
        Preconditions.checkNotNull(edge);
        Preconditions.checkNotNull(node);
        Preconditions.checkState(this.f73516b.put(edge, node) == null);
    }

    @Override // mo.d1
    public void j(E edge, N node, boolean isSelfLoop) {
        Preconditions.checkNotNull(edge);
        Preconditions.checkNotNull(node);
        if (isSelfLoop) {
            int i11 = this.f73517c + 1;
            this.f73517c = i11;
            com.google.common.graph.d.f(i11);
        }
        Preconditions.checkState(this.f73515a.put(edge, node) == null);
    }

    @Override // mo.d1
    public Set<E> k() {
        return new a();
    }
}
