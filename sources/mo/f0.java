package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.aa;
import com.google.common.collect.l6;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
@uo.j(containerOf = {"N"})
/* loaded from: classes7.dex */
public abstract class f0<N> implements Iterable<N> {

    /* renamed from: a, reason: collision with root package name */
    public final N f73505a;

    /* renamed from: b, reason: collision with root package name */
    public final N f73506b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<N> extends f0<N> {
        @Override // mo.f0
        public boolean b() {
            return true;
        }

        @Override // mo.f0
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f0)) {
                return false;
            }
            f0 f0Var = (f0) obj;
            return b() == f0Var.b() && l().equals(f0Var.l()) && m().equals(f0Var.m());
        }

        @Override // mo.f0
        public int hashCode() {
            return ho.d0.b(l(), m());
        }

        @Override // mo.f0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // mo.f0
        public N l() {
            return f();
        }

        @Override // mo.f0
        public N m() {
            return g();
        }

        public String toString() {
            return "<" + l() + " -> " + m() + ">";
        }

        public b(N source, N target) {
            super(source, target);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<N> extends f0<N> {
        @Override // mo.f0
        public boolean b() {
            return false;
        }

        @Override // mo.f0
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f0)) {
                return false;
            }
            f0 f0Var = (f0) obj;
            if (b() != f0Var.b()) {
                return false;
            }
            return f().equals(f0Var.f()) ? g().equals(f0Var.g()) : f().equals(f0Var.g()) && g().equals(f0Var.f());
        }

        @Override // mo.f0
        public int hashCode() {
            return f().hashCode() + g().hashCode();
        }

        @Override // mo.f0, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // mo.f0
        public N l() {
            throw new UnsupportedOperationException(com.google.common.graph.c.f34218o);
        }

        @Override // mo.f0
        public N m() {
            throw new UnsupportedOperationException(com.google.common.graph.c.f34218o);
        }

        public String toString() {
            return "[" + f() + j2.O + g() + "]";
        }

        public c(N nodeU, N nodeV) {
            super(nodeU, nodeV);
        }
    }

    public static <N> f0<N> h(k0<?> graph, N nodeU, N nodeV) {
        return graph.c() ? k(nodeU, nodeV) : n(nodeU, nodeV);
    }

    public static <N> f0<N> j(b1<?, ?> network, N nodeU, N nodeV) {
        return network.c() ? k(nodeU, nodeV) : n(nodeU, nodeV);
    }

    public static <N> f0<N> k(N source, N target) {
        return new b(source, target);
    }

    public static <N> f0<N> n(N nodeU, N nodeV) {
        return new c(nodeV, nodeU);
    }

    public final N a(N node) {
        if (node.equals(this.f73505a)) {
            return this.f73506b;
        }
        if (node.equals(this.f73506b)) {
            return this.f73505a;
        }
        throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + node);
    }

    public abstract boolean b();

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aa<N> iterator() {
        return l6.A(this.f73505a, this.f73506b);
    }

    public abstract boolean equals(@CheckForNull Object obj);

    public final N f() {
        return this.f73505a;
    }

    public final N g() {
        return this.f73506b;
    }

    public abstract int hashCode();

    public abstract N l();

    public abstract N m();

    public f0(N n11, N n12) {
        this.f73505a = (N) Preconditions.checkNotNull(n11);
        this.f73506b = (N) Preconditions.checkNotNull(n12);
    }
}
