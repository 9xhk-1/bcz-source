package mo;

import com.google.common.collect.u6;
import com.google.common.graph.ElementOrder;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public abstract class w<N, V> extends e<N> implements p1<N, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j<N> {
        public a() {
        }

        @Override // mo.x, mo.k1, mo.k0
        public /* bridge */ /* synthetic */ Iterable a(Object node) {
            return a((a) node);
        }

        @Override // mo.x, mo.f1, mo.k0
        public /* bridge */ /* synthetic */ Iterable b(Object node) {
            return b((a) node);
        }

        @Override // mo.x, mo.k0
        public boolean c() {
            return w.this.c();
        }

        @Override // mo.x, mo.k0
        public Set<N> d(N node) {
            return w.this.d(node);
        }

        @Override // mo.x, mo.k0
        public Set<N> e() {
            return w.this.e();
        }

        @Override // mo.j, mo.e, mo.x, mo.k0
        public int f(N node) {
            return w.this.f(node);
        }

        @Override // mo.j, mo.e, mo.x
        public Set<f0<N>> g() {
            return w.this.g();
        }

        @Override // mo.j, mo.e, mo.x, mo.k0
        public int j(N node) {
            return w.this.j(node);
        }

        @Override // mo.x, mo.k0
        public ElementOrder<N> k() {
            return w.this.k();
        }

        @Override // mo.j, mo.e, mo.x, mo.k0
        public int l(N node) {
            return w.this.l(node);
        }

        @Override // mo.x, mo.k0
        public boolean m() {
            return w.this.m();
        }

        @Override // mo.j, mo.e, mo.x, mo.k0
        public ElementOrder<N> q() {
            return w.this.q();
        }

        @Override // mo.x, mo.k1, mo.k0
        public Set<N> a(N node) {
            return w.this.a((w) node);
        }

        @Override // mo.x, mo.f1, mo.k0
        public Set<N> b(N node) {
            return w.this.b((w) node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object W(p1 p1Var, f0 f0Var) {
        Object F = p1Var.F(f0Var.f(), f0Var.g(), null);
        Objects.requireNonNull(F);
        return F;
    }

    public static <N, V> Map<f0<N>, V> X(final p1<N, V> graph) {
        return u6.j(graph.g(), new ho.r() { // from class: mo.v
            @Override // ho.r
            public final Object apply(Object obj) {
                return w.W(p1.this, (f0) obj);
            }
        });
    }

    @Override // mo.p1
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return c() == p1Var.c() && e().equals(p1Var.e()) && X(this).equals(X(p1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ int f(Object node) {
        return super.f(node);
    }

    @Override // mo.e, mo.x
    public /* bridge */ /* synthetic */ Set g() {
        return super.g();
    }

    @Override // mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean h(f0 endpoints) {
        return super.h(endpoints);
    }

    @Override // mo.p1
    public final int hashCode() {
        return X(this).hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ boolean i(Object nodeU, Object nodeV) {
        return super.i(nodeU, nodeV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ int j(Object node) {
        return super.j(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ int l(Object node) {
        return super.l(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ Set n(Object node) {
        return super.n(node);
    }

    @Override // mo.e, mo.x, mo.k0
    public /* bridge */ /* synthetic */ ElementOrder q() {
        return super.q();
    }

    public k0<N> s() {
        return new a();
    }

    public String toString() {
        return "isDirected: " + c() + ", allowsSelfLoops: " + m() + ", nodes: " + e() + ", edges: " + X(this);
    }
}
