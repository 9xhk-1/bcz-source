package mo;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.u6;
import com.google.common.graph.ElementOrder;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
@uo.j(containerOf = {"N", ExifInterface.LONGITUDE_EAST})
/* loaded from: classes7.dex */
public final class r0<N, E> extends i1<N, E> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<N, E> {

        /* renamed from: a, reason: collision with root package name */
        public final z0<N, E> f73579a;

        public a(c1<N, E> c1Var) {
            this.f73579a = (z0<N, E>) c1Var.c();
        }

        @uo.a
        public a<N, E> a(N nodeU, N nodeV, E edge) {
            this.f73579a.M(nodeU, nodeV, edge);
            return this;
        }

        @uo.a
        public a<N, E> b(f0<N> endpoints, E edge) {
            this.f73579a.x(endpoints, edge);
            return this;
        }

        @uo.a
        public a<N, E> c(N node) {
            this.f73579a.p(node);
            return this;
        }

        public r0<N, E> d() {
            return r0.l0(this.f73579a);
        }
    }

    public r0(b1<N, E> network) {
        super(c1.i(network), n0(network), m0(network));
    }

    public static <N, E> ho.r<E, N> h0(final b1<N, E> network, final N node) {
        return new ho.r() { // from class: mo.p0
            @Override // ho.r
            public final Object apply(Object obj) {
                Object a11;
                a11 = b1.this.J(obj).a(node);
                return a11;
            }
        };
    }

    public static <N, E> d1<N, E> j0(b1<N, E> network, N node) {
        if (!network.c()) {
            Map j11 = u6.j(network.n(node), h0(network, node));
            return network.E() ? n1.q(j11) : o1.n(j11);
        }
        Map j12 = u6.j(network.z(node), o0(network));
        Map j13 = u6.j(network.B(node), p0(network));
        int size = network.u(node, node).size();
        return network.E() ? b0.q(j12, j13, size) : c0.o(j12, j13, size);
    }

    @Deprecated
    public static <N, E> r0<N, E> k0(r0<N, E> network) {
        return (r0) Preconditions.checkNotNull(network);
    }

    public static <N, E> r0<N, E> l0(b1<N, E> network) {
        return network instanceof r0 ? (r0) network : new r0<>(network);
    }

    public static <N, E> Map<E, N> m0(b1<N, E> network) {
        ImmutableMap.b builder = ImmutableMap.builder();
        for (E e11 : network.g()) {
            builder.i(e11, network.J(e11).f());
        }
        return builder.d();
    }

    public static <N, E> Map<N, d1<N, E>> n0(b1<N, E> network) {
        ImmutableMap.b builder = ImmutableMap.builder();
        for (N n11 : network.e()) {
            builder.i(n11, j0(network, n11));
        }
        return builder.d();
    }

    public static <N, E> ho.r<E, N> o0(final b1<N, E> network) {
        return new ho.r() { // from class: mo.o0
            @Override // ho.r
            public final Object apply(Object obj) {
                Object l11;
                l11 = b1.this.J(obj).l();
                return l11;
            }
        };
    }

    public static <N, E> ho.r<E, N> p0(final b1<N, E> network) {
        return new ho.r() { // from class: mo.q0
            @Override // ho.r
            public final Object apply(Object obj) {
                Object m11;
                m11 = b1.this.J(obj).m();
                return m11;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ Set B(Object node) {
        return super.B(node);
    }

    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ boolean E() {
        return super.E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ f0 J(Object edge) {
        return super.J(edge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.b1, mo.k1, mo.k0
    public /* bridge */ /* synthetic */ Set a(Object node) {
        return super.a((r0<N, E>) node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.b1, mo.f1, mo.k0
    public /* bridge */ /* synthetic */ Set b(Object node) {
        return super.b((r0<N, E>) node);
    }

    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ Set d(Object node) {
        return super.d(node);
    }

    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ Set g() {
        return super.g();
    }

    @Override // mo.t, mo.b1
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public com.google.common.graph.e<N> s() {
        return new com.google.common.graph.e<>(super.s());
    }

    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ ElementOrder k() {
        return super.k();
    }

    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.t, mo.b1
    public /* bridge */ /* synthetic */ Set u(Object nodeU, Object nodeV) {
        return super.u(nodeU, nodeV);
    }

    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ ElementOrder y() {
        return super.y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.i1, mo.b1
    public /* bridge */ /* synthetic */ Set z(Object node) {
        return super.z(node);
    }
}
