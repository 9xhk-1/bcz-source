package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.q8;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class g0<N> extends com.google.common.collect.c<f0<N>> {

    /* renamed from: c, reason: collision with root package name */
    public final x<N> f73508c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator<N> f73509d;

    /* renamed from: e, reason: collision with root package name */
    @CheckForNull
    public N f73510e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator<N> f73511f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<N> extends g0<N> {
        @Override // com.google.common.collect.c
        @CheckForNull
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public f0<N> a() {
            while (!this.f73511f.hasNext()) {
                if (!d()) {
                    return b();
                }
            }
            N n11 = this.f73510e;
            Objects.requireNonNull(n11);
            return f0.k(n11, this.f73511f.next());
        }

        public b(x<N> graph) {
            super(graph);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<N> extends g0<N> {

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public Set<N> f73512g;

        @Override // com.google.common.collect.c
        @CheckForNull
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public f0<N> a() {
            do {
                Objects.requireNonNull(this.f73512g);
                while (this.f73511f.hasNext()) {
                    N next = this.f73511f.next();
                    if (!this.f73512g.contains(next)) {
                        N n11 = this.f73510e;
                        Objects.requireNonNull(n11);
                        return f0.n(n11, next);
                    }
                }
                this.f73512g.add(this.f73510e);
            } while (d());
            this.f73512g = null;
            return b();
        }

        public c(x<N> graph) {
            super(graph);
            this.f73512g = q8.y(graph.e().size() + 1);
        }
    }

    public static <N> g0<N> e(x<N> graph) {
        return graph.c() ? new b(graph) : new c(graph);
    }

    public final boolean d() {
        Preconditions.checkState(!this.f73511f.hasNext());
        if (!this.f73509d.hasNext()) {
            return false;
        }
        N next = this.f73509d.next();
        this.f73510e = next;
        this.f73511f = this.f73508c.a((x<N>) next).iterator();
        return true;
    }

    public g0(x<N> graph) {
        this.f73510e = null;
        this.f73511f = ImmutableSet.of().iterator();
        this.f73508c = graph;
        this.f73509d = graph.e().iterator();
    }
}
