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
public final class b0<N, E> extends i<N, E> {

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Reference<j7<N>> f73490d;

    /* renamed from: e, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Reference<j7<N>> f73491e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends x0<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f73492c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b0 f73493d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final b0 this$0, Map outEdgeToNode, Object targetNode, final Object val$node) {
            super(outEdgeToNode, targetNode);
            this.f73492c = val$node;
            this.f73493d = this$0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f73493d.s().count(this.f73492c);
        }
    }

    public b0(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        super(inEdges, outEdges, selfLoopCount);
    }

    @CheckForNull
    public static <T> T o(@CheckForNull Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static <N, E> b0<N, E> p() {
        return new b0<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    public static <N, E> b0<N, E> q(Map<E, N> inEdges, Map<E, N> outEdges, int selfLoopCount) {
        return new b0<>(ImmutableMap.copyOf((Map) inEdges), ImmutableMap.copyOf((Map) outEdges), selfLoopCount);
    }

    @Override // mo.d1
    public Set<N> b() {
        return Collections.unmodifiableSet(s().elementSet());
    }

    @Override // mo.d1
    public Set<N> c() {
        return Collections.unmodifiableSet(r().elementSet());
    }

    @Override // mo.i, mo.d1
    public N f(E e11) {
        N n11 = (N) super.f(e11);
        j7 j7Var = (j7) o(this.f73491e);
        if (j7Var != null) {
            Preconditions.checkState(j7Var.remove(n11));
        }
        return n11;
    }

    @Override // mo.i, mo.d1
    public N h(E e11, boolean z11) {
        N n11 = (N) super.h(e11, z11);
        j7 j7Var = (j7) o(this.f73490d);
        if (j7Var != null) {
            Preconditions.checkState(j7Var.remove(n11));
        }
        return n11;
    }

    @Override // mo.i, mo.d1
    public void i(E edge, N node) {
        super.i(edge, node);
        j7 j7Var = (j7) o(this.f73491e);
        if (j7Var != null) {
            Preconditions.checkState(j7Var.add(node));
        }
    }

    @Override // mo.i, mo.d1
    public void j(E edge, N node, boolean isSelfLoop) {
        super.j(edge, node, isSelfLoop);
        j7 j7Var = (j7) o(this.f73490d);
        if (j7Var != null) {
            Preconditions.checkState(j7Var.add(node));
        }
    }

    @Override // mo.d1
    public Set<E> l(N node) {
        return new a(this, this.f73516b, node, node);
    }

    public final j7<N> r() {
        j7<N> j7Var = (j7) o(this.f73490d);
        if (j7Var != null) {
            return j7Var;
        }
        HashMultiset create = HashMultiset.create(this.f73515a.values());
        this.f73490d = new SoftReference(create);
        return create;
    }

    public final j7<N> s() {
        j7<N> j7Var = (j7) o(this.f73491e);
        if (j7Var != null) {
            return j7Var;
        }
        HashMultiset create = HashMultiset.create(this.f73516b.values());
        this.f73491e = new SoftReference(create);
        return create;
    }
}
