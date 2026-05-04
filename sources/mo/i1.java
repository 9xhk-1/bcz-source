package mo;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.graph.ElementOrder;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public class i1<N, E> extends t<N, E> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73520b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73521c;

    /* renamed from: d, reason: collision with root package name */
    public final ElementOrder<N> f73522d;

    /* renamed from: e, reason: collision with root package name */
    public final ElementOrder<E> f73523e;

    /* renamed from: f, reason: collision with root package name */
    public final v0<N, d1<N, E>> f73524f;

    /* renamed from: g, reason: collision with root package name */
    public final v0<E, N> f73525g;

    public i1(c1<? super N, ? super E> builder) {
        this(builder, builder.f73535c.c(builder.f73537e.or((Optional<Integer>) 10).intValue()), builder.f73497g.c(builder.f73498h.or((Optional<Integer>) 20).intValue()));
    }

    @Override // mo.b1
    public Set<E> B(N n11) {
        return (Set<E>) X(a0(n11).g(), n11);
    }

    @Override // mo.b1
    public boolean E() {
        return this.f73520b;
    }

    @Override // mo.b1
    public f0<N> J(E edge) {
        N b02 = b0(edge);
        d1<N, E> f11 = this.f73524f.f(b02);
        Objects.requireNonNull(f11);
        return f0.j(this, b02, f11.d(edge));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.b1, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Iterable a(Object node) {
        return a((i1<N, E>) node);
    }

    public final d1<N, E> a0(N node) {
        d1<N, E> f11 = this.f73524f.f(node);
        if (f11 != null) {
            return f11;
        }
        Preconditions.checkNotNull(node);
        throw new IllegalArgumentException(String.format(com.google.common.graph.c.f34209f, node));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.b1, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Iterable b(Object node) {
        return b((i1<N, E>) node);
    }

    public final N b0(E edge) {
        N f11 = this.f73525g.f(edge);
        if (f11 != null) {
            return f11;
        }
        Preconditions.checkNotNull(edge);
        throw new IllegalArgumentException(String.format(com.google.common.graph.c.f34210g, edge));
    }

    @Override // mo.b1
    public boolean c() {
        return this.f73519a;
    }

    public final boolean c0(E edge) {
        return this.f73525g.e(edge);
    }

    @Override // mo.b1
    public Set<N> d(N n11) {
        return (Set<N>) X(a0(n11).a(), n11);
    }

    public final boolean d0(N node) {
        return this.f73524f.e(node);
    }

    @Override // mo.b1
    public Set<N> e() {
        return this.f73524f.k();
    }

    @Override // mo.b1
    public Set<E> g() {
        return this.f73525g.k();
    }

    @Override // mo.b1
    public ElementOrder<N> k() {
        return this.f73522d;
    }

    @Override // mo.b1
    public boolean m() {
        return this.f73521c;
    }

    @Override // mo.b1
    public Set<E> n(N n11) {
        return (Set<E>) X(a0(n11).k(), n11);
    }

    @Override // mo.t, mo.b1
    public Set<E> u(N n11, N n12) {
        d1<N, E> a02 = a0(n11);
        if (!this.f73521c && n11 == n12) {
            return ImmutableSet.of();
        }
        Preconditions.checkArgument(d0(n12), com.google.common.graph.c.f34209f, n12);
        return (Set<E>) Y(a02.l(n12), n11, n12);
    }

    @Override // mo.b1
    public ElementOrder<E> y() {
        return this.f73523e;
    }

    @Override // mo.b1
    public Set<E> z(N n11) {
        return (Set<E>) X(a0(n11).e(), n11);
    }

    @Override // mo.b1, mo.k1, mo.k0
    public Set<N> a(N n11) {
        return (Set<N>) X(a0(n11).b(), n11);
    }

    @Override // mo.b1, mo.f1, mo.k0
    public Set<N> b(N n11) {
        return (Set<N>) X(a0(n11).c(), n11);
    }

    public i1(c1<? super N, ? super E> c1Var, Map<N, d1<N, E>> map, Map<E, N> map2) {
        v0<N, d1<N, E>> v0Var;
        this.f73519a = c1Var.f73533a;
        this.f73520b = c1Var.f73496f;
        this.f73521c = c1Var.f73534b;
        this.f73522d = (ElementOrder<N>) c1Var.f73535c.a();
        this.f73523e = (ElementOrder<E>) c1Var.f73497g.a();
        if (map instanceof TreeMap) {
            v0Var = new w0<>(map);
        } else {
            v0Var = new v0<>(map);
        }
        this.f73524f = v0Var;
        this.f73525g = new v0<>(map2);
    }
}
