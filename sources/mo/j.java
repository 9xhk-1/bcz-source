package mo;

import com.google.common.graph.ElementOrder;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.a
@e0
/* loaded from: classes7.dex */
public abstract class j<N> extends e<N> implements k0<N> {
    @Override // mo.k0
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return c() == k0Var.c() && e().equals(k0Var.e()) && g().equals(k0Var.g());
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

    @Override // mo.k0
    public final int hashCode() {
        return g().hashCode();
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

    public String toString() {
        return "isDirected: " + c() + ", allowsSelfLoops: " + m() + ", nodes: " + e() + ", edges: " + g();
    }
}
