package mo;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.ElementOrder;
import mo.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public final class c1<N, E> extends k<N> {

    /* renamed from: f, reason: collision with root package name */
    public boolean f73496f;

    /* renamed from: g, reason: collision with root package name */
    public ElementOrder<? super E> f73497g;

    /* renamed from: h, reason: collision with root package name */
    public Optional<Integer> f73498h;

    public c1(boolean directed) {
        super(directed);
        this.f73496f = false;
        this.f73497g = ElementOrder.d();
        this.f73498h = Optional.absent();
    }

    public static c1<Object, Object> e() {
        return new c1<>(true);
    }

    public static <N, E> c1<N, E> i(b1<N, E> network) {
        return new c1(network.c()).a(network.E()).b(network.m()).k(network.k()).f(network.y());
    }

    public static c1<Object, Object> l() {
        return new c1<>(false);
    }

    @uo.a
    public c1<N, E> a(boolean allowsParallelEdges) {
        this.f73496f = allowsParallelEdges;
        return this;
    }

    @uo.a
    public c1<N, E> b(boolean allowsSelfLoops) {
        this.f73534b = allowsSelfLoops;
        return this;
    }

    public <N1 extends N, E1 extends E> z0<N1, E1> c() {
        return new g1(this);
    }

    public <E1 extends E> c1<N, E1> f(ElementOrder<E1> elementOrder) {
        c1<N, E1> c1Var = (c1<N, E1>) d();
        c1Var.f73497g = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return c1Var;
    }

    @uo.a
    public c1<N, E> g(int expectedEdgeCount) {
        this.f73498h = Optional.of(Integer.valueOf(com.google.common.graph.d.d(expectedEdgeCount)));
        return this;
    }

    @uo.a
    public c1<N, E> h(int expectedNodeCount) {
        this.f73537e = Optional.of(Integer.valueOf(com.google.common.graph.d.d(expectedNodeCount)));
        return this;
    }

    public <N1 extends N, E1 extends E> r0.a<N1, E1> j() {
        return new r0.a<>(d());
    }

    public <N1 extends N> c1<N1, E> k(ElementOrder<N1> elementOrder) {
        c1<N1, E> c1Var = (c1<N1, E>) d();
        c1Var.f73535c = (ElementOrder) Preconditions.checkNotNull(elementOrder);
        return c1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N1 extends N, E1 extends E> c1<N1, E1> d() {
        return this;
    }
}
