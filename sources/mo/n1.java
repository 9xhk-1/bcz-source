package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.j7;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class n1<N, E> extends u<N, E> {

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Reference<j7<N>> f73566b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends x0<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f73567c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f73568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final n1 this$0, Map outEdgeToNode, Object targetNode, final Object val$node) {
            super(outEdgeToNode, targetNode);
            this.f73567c = val$node;
            this.f73568d = this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f73568d.n().count(this.f73567c);
        }
    }

    public n1(Map<E, N> incidentEdges) {
        super(incidentEdges);
    }

    @CheckForNull
    private static <T> T o(@CheckForNull Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static <N, E> n1<N, E> p() {
        return new n1<>(new HashMap(2, 1.0f));
    }

    public static <N, E> n1<N, E> q(Map<E, N> incidentEdges) {
        return new n1<>(ImmutableMap.copyOf((Map) incidentEdges));
    }

    @Override // mo.d1
    public Set<N> a() {
        return Collections.unmodifiableSet(n().elementSet());
    }

    @Override // mo.u, mo.d1
    public N f(E e11) {
        N n11 = (N) super.f(e11);
        j7 j7Var = (j7) o(this.f73566b);
        if (j7Var != null) {
            Preconditions.checkState(j7Var.remove(n11));
        }
        return n11;
    }

    @Override // mo.u, mo.d1
    @CheckForNull
    public N h(E edge, boolean isSelfLoop) {
        if (isSelfLoop) {
            return null;
        }
        return f(edge);
    }

    @Override // mo.u, mo.d1
    public void i(E edge, N node) {
        super.i(edge, node);
        j7 j7Var = (j7) o(this.f73566b);
        if (j7Var != null) {
            Preconditions.checkState(j7Var.add(node));
        }
    }

    @Override // mo.u, mo.d1
    public void j(E edge, N node, boolean isSelfLoop) {
        if (isSelfLoop) {
            return;
        }
        i(edge, node);
    }

    @Override // mo.d1
    public Set<E> l(N node) {
        return new a(this, this.f73590a, node, node);
    }

    public final j7<N> n() {
        j7<N> j7Var = (j7) o(this.f73566b);
        if (j7Var != null) {
            return j7Var;
        }
        HashMultiset create = HashMultiset.create(this.f73590a.values());
        this.f73566b = new SoftReference(create);
        return create;
    }
}
