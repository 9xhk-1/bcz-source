package mo;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public class j1<N, V> extends w<N, V> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73526a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73527b;

    /* renamed from: c, reason: collision with root package name */
    public final ElementOrder<N> f73528c;

    /* renamed from: d, reason: collision with root package name */
    public final v0<N, l0<N, V>> f73529d;

    /* renamed from: e, reason: collision with root package name */
    public long f73530e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends t0<N> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0 f73531c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j1 f73532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final j1 this$0, x graph, Object node, final l0 val$connections) {
            super(graph, node);
            this.f73531c = val$connections;
            this.f73532d = this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<f0<N>> iterator() {
            return this.f73531c.h(this.f73588a);
        }
    }

    public j1(k<? super N> builder) {
        this(builder, builder.f73535c.c(builder.f73537e.or((Optional<Integer>) 10).intValue()), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public V F(N n11, N n12, @CheckForNull V v11) {
        return (V) a0(Preconditions.checkNotNull(n11), Preconditions.checkNotNull(n12), v11);
    }

    @Override // mo.e
    public long R() {
        return this.f73530e;
    }

    public final l0<N, V> Y(N node) {
        l0<N, V> f11 = this.f73529d.f(node);
        if (f11 != null) {
            return f11;
        }
        Preconditions.checkNotNull(node);
        throw new IllegalArgumentException("Node " + node + " is not an element of this graph.");
    }

    public final boolean Z(@CheckForNull N node) {
        return this.f73529d.e(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Iterable a(Object node) {
        return a((j1<N, V>) node);
    }

    @CheckForNull
    public final V a0(N nodeU, N nodeV, @CheckForNull V defaultValue) {
        l0<N, V> f11 = this.f73529d.f(nodeU);
        V e11 = f11 == null ? null : f11.e(nodeV);
        return e11 == null ? defaultValue : e11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.x, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Iterable b(Object node) {
        return b((j1<N, V>) node);
    }

    public final boolean b0(N nodeU, N nodeV) {
        l0<N, V> f11 = this.f73529d.f(nodeU);
        return f11 != null && f11.b().contains(nodeV);
    }

    @Override // mo.x, mo.k0
    public boolean c() {
        return this.f73526a;
    }

    @Override // mo.x, mo.k0
    public Set<N> d(N n11) {
        return (Set<N>) T(Y(n11).a(), n11);
    }

    @Override // mo.x, mo.k0
    public Set<N> e() {
        return this.f73529d.k();
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public boolean h(f0<N> endpoints) {
        Preconditions.checkNotNull(endpoints);
        return S(endpoints) && b0(endpoints.f(), endpoints.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.w, mo.e, mo.x, mo.k0
    public boolean i(N nodeU, N nodeV) {
        return b0(Preconditions.checkNotNull(nodeU), Preconditions.checkNotNull(nodeV));
    }

    @Override // mo.x, mo.k0
    public ElementOrder<N> k() {
        return this.f73528c;
    }

    @Override // mo.x, mo.k0
    public boolean m() {
        return this.f73527b;
    }

    @Override // mo.w, mo.e, mo.x, mo.k0
    public Set<f0<N>> n(N n11) {
        return (Set<f0<N>>) T(new a(this, this, n11, Y(n11)), n11);
    }

    @CheckForNull
    public V w(f0<N> endpoints, @CheckForNull V defaultValue) {
        V(endpoints);
        return a0(endpoints.f(), endpoints.g(), defaultValue);
    }

    @Override // mo.x, mo.k1, mo.k0
    public Set<N> a(N n11) {
        return (Set<N>) T(Y(n11).b(), n11);
    }

    @Override // mo.x, mo.f1, mo.k0
    public Set<N> b(N n11) {
        return (Set<N>) T(Y(n11).c(), n11);
    }

    public j1(k<? super N> kVar, Map<N, l0<N, V>> map, long j11) {
        v0<N, l0<N, V>> v0Var;
        this.f73526a = kVar.f73533a;
        this.f73527b = kVar.f73534b;
        this.f73528c = (ElementOrder<N>) kVar.f73535c.a();
        if (map instanceof TreeMap) {
            v0Var = new w0<>(map);
        } else {
            v0Var = new v0<>(map);
        }
        this.f73529d = v0Var;
        this.f73530e = com.google.common.graph.d.e(j11);
    }
}
