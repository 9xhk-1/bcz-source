package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@go.a
@e0
/* loaded from: classes7.dex */
public abstract class l1<N> {

    /* renamed from: a, reason: collision with root package name */
    public final k1<N> f73540a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends l1<N> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k1 f73541b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k1 successorFunction, final k1 val$graph) {
            super(successorFunction, null);
            this.f73541b = val$graph;
        }

        @Override // mo.l1
        public g<N> i() {
            return g.b(this.f73541b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends l1<N> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k1 f73542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k1 successorFunction, final k1 val$tree) {
            super(successorFunction, null);
            this.f73542b = val$tree;
        }

        @Override // mo.l1
        public g<N> i() {
            return g.c(this.f73542b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Iterable<N> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImmutableSet f73543a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l1 f73544b;

        public c(final l1 this$0, final ImmutableSet val$validated) {
            this.f73543a = val$validated;
            this.f73544b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return this.f73544b.i().a(this.f73543a.iterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Iterable<N> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImmutableSet f73545a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l1 f73546b;

        public d(final l1 this$0, final ImmutableSet val$validated) {
            this.f73545a = val$validated;
            this.f73546b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return this.f73546b.i().e(this.f73545a.iterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Iterable<N> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImmutableSet f73547a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l1 f73548b;

        public e(final l1 this$0, final ImmutableSet val$validated) {
            this.f73547a = val$validated;
            this.f73548b = this$0;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return this.f73548b.i().d(this.f73547a.iterator());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f73549a = new a("FRONT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final f f73550b = new b("BACK", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ f[] f73551c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends f {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // mo.l1.f
            public <T> void b(Deque<T> deque, T value) {
                deque.addFirst(value);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends f {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // mo.l1.f
            public <T> void b(Deque<T> deque, T value) {
                deque.addLast(value);
            }
        }

        public f(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ f[] a() {
            return new f[]{f73549a, f73550b};
        }

        public static f valueOf(String name) {
            return (f) Enum.valueOf(f.class, name);
        }

        public static f[] values() {
            return (f[]) f73551c.clone();
        }

        public abstract <T> void b(Deque<T> deque, T value);

        public /* synthetic */ f(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g<N> {

        /* renamed from: a, reason: collision with root package name */
        public final k1<N> f73552a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends g<N> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Set f73553b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k1 successorFunction, final Set val$visited) {
                super(successorFunction);
                this.f73553b = val$visited;
            }

            @Override // mo.l1.g
            @CheckForNull
            public N g(Deque<Iterator<? extends N>> horizon) {
                Iterator<? extends N> first = horizon.getFirst();
                while (first.hasNext()) {
                    N next = first.next();
                    Objects.requireNonNull(next);
                    if (this.f73553b.add(next)) {
                        return next;
                    }
                }
                horizon.removeFirst();
                return null;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends g<N> {
            public b(k1 successorFunction) {
                super(successorFunction);
            }

            @Override // mo.l1.g
            @CheckForNull
            public N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                if (first.hasNext()) {
                    return (N) Preconditions.checkNotNull(first.next());
                }
                deque.removeFirst();
                return null;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c extends com.google.common.collect.c<N> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Deque f73554c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f73555d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f73556e;

            public c(final g this$0, final Deque val$horizon, final f val$order) {
                this.f73554c = val$horizon;
                this.f73555d = val$order;
                this.f73556e = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public N a() {
                do {
                    N n11 = (N) this.f73556e.g(this.f73554c);
                    if (n11 != null) {
                        Iterator<? extends N> it = this.f73556e.f73552a.a(n11).iterator();
                        if (it.hasNext()) {
                            this.f73555d.b(this.f73554c, it);
                        }
                        return n11;
                    }
                } while (!this.f73554c.isEmpty());
                return b();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends com.google.common.collect.c<N> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Deque f73557c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Deque f73558d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f73559e;

            public d(final g this$0, final Deque val$horizon, final Deque val$ancestorStack) {
                this.f73557c = val$horizon;
                this.f73558d = val$ancestorStack;
                this.f73559e = this$0;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public N a() {
                while (true) {
                    N n11 = (N) this.f73559e.g(this.f73557c);
                    if (n11 == null) {
                        return !this.f73558d.isEmpty() ? (N) this.f73558d.pop() : b();
                    }
                    Iterator<? extends N> it = this.f73559e.f73552a.a(n11).iterator();
                    if (!it.hasNext()) {
                        return n11;
                    }
                    this.f73557c.addFirst(it);
                    this.f73558d.push(n11);
                }
            }
        }

        public g(k1<N> successorFunction) {
            this.f73552a = successorFunction;
        }

        public static <N> g<N> b(k1<N> graph) {
            return new a(graph, new HashSet());
        }

        public static <N> g<N> c(k1<N> tree) {
            return new b(tree);
        }

        public final Iterator<N> a(Iterator<? extends N> startNodes) {
            return f(startNodes, f.f73550b);
        }

        public final Iterator<N> d(Iterator<? extends N> startNodes) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(startNodes);
            return new d(this, arrayDeque2, arrayDeque);
        }

        public final Iterator<N> e(Iterator<? extends N> startNodes) {
            return f(startNodes, f.f73549a);
        }

        public final Iterator<N> f(Iterator<? extends N> startNodes, f order) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(startNodes);
            return new c(this, arrayDeque, order);
        }

        @CheckForNull
        public abstract N g(Deque<Iterator<? extends N>> horizon);
    }

    public /* synthetic */ l1(k1 k1Var, a aVar) {
        this(k1Var);
    }

    public static <N> l1<N> g(k1<N> graph) {
        return new a(graph, graph);
    }

    public static <N> l1<N> h(k1<N> tree) {
        if (tree instanceof x) {
            Preconditions.checkArgument(((x) tree).c(), "Undirected graphs can never be trees.");
        }
        if (tree instanceof b1) {
            Preconditions.checkArgument(((b1) tree).c(), "Undirected networks can never be trees.");
        }
        return new b(tree, tree);
    }

    public final Iterable<N> a(Iterable<? extends N> startNodes) {
        return new c(this, j(startNodes));
    }

    public final Iterable<N> b(N startNode) {
        return a(ImmutableSet.of(startNode));
    }

    public final Iterable<N> c(Iterable<? extends N> startNodes) {
        return new e(this, j(startNodes));
    }

    public final Iterable<N> d(N startNode) {
        return c(ImmutableSet.of(startNode));
    }

    public final Iterable<N> e(Iterable<? extends N> startNodes) {
        return new d(this, j(startNodes));
    }

    public final Iterable<N> f(N startNode) {
        return e(ImmutableSet.of(startNode));
    }

    public abstract g<N> i();

    public final ImmutableSet<N> j(Iterable<? extends N> startNodes) {
        ImmutableSet<N> copyOf = ImmutableSet.copyOf(startNodes);
        aa<N> it = copyOf.iterator();
        while (it.hasNext()) {
            this.f73540a.a(it.next());
        }
        return copyOf;
    }

    public l1(k1<N> successorFunction) {
        this.f73540a = (k1) Preconditions.checkNotNull(successorFunction);
    }
}
