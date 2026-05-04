package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aa;
import com.google.common.collect.l6;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.a;
import ho.r;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;
import mo.e0;
import mo.f0;
import mo.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class a<N, V> implements l0<N, V> {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f34179e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Map<N, Object> f34180a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    public final List<f<N>> f34181b;

    /* renamed from: c, reason: collision with root package name */
    public int f34182c;

    /* renamed from: d, reason: collision with root package name */
    public int f34183d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.graph.a$a, reason: collision with other inner class name */
    public class C0414a extends AbstractSet<N> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.graph.a$a$a, reason: collision with other inner class name */
        public class C0415a extends com.google.common.collect.c<N> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f34185c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Set f34186d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0414a f34187e;

            public C0415a(final C0414a this$1, final Iterator val$nodeConnections, final Set val$seenNodes) {
                this.f34185c = val$nodeConnections;
                this.f34186d = val$seenNodes;
                this.f34187e = this$1;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public N a() {
                while (this.f34185c.hasNext()) {
                    f fVar = (f) this.f34185c.next();
                    if (this.f34186d.add(fVar.f34202a)) {
                        return fVar.f34202a;
                    }
                }
                return b();
            }
        }

        public C0414a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa<N> iterator() {
            return new C0415a(this, a.this.f34181b.iterator(), new HashSet());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return a.this.f34180a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.f34180a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AbstractSet<N> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.graph.a$b$a, reason: collision with other inner class name */
        public class C0416a extends com.google.common.collect.c<N> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f34189c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f34190d;

            public C0416a(final b this$1, final Iterator val$entries) {
                this.f34189c = val$entries;
                this.f34190d = this$1;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public N a() {
                while (this.f34189c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f34189c.next();
                    if (a.s(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return b();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.graph.a$b$b, reason: collision with other inner class name */
        public class C0417b extends com.google.common.collect.c<N> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f34191c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f34192d;

            public C0417b(final b this$1, final Iterator val$nodeConnections) {
                this.f34191c = val$nodeConnections;
                this.f34192d = this$1;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public N a() {
                while (this.f34191c.hasNext()) {
                    f fVar = (f) this.f34191c.next();
                    if (fVar instanceof f.C0419a) {
                        return fVar.f34202a;
                    }
                }
                return b();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa<N> iterator() {
            return a.this.f34181b == null ? new C0416a(this, a.this.f34180a.entrySet().iterator()) : new C0417b(this, a.this.f34181b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return a.s(a.this.f34180a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.f34182c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AbstractSet<N> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.graph.a$c$a, reason: collision with other inner class name */
        public class C0418a extends com.google.common.collect.c<N> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f34194c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f34195d;

            public C0418a(final c this$1, final Iterator val$entries) {
                this.f34194c = val$entries;
                this.f34195d = this$1;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public N a() {
                while (this.f34194c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f34194c.next();
                    if (a.t(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return b();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.c<N> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f34196c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f34197d;

            public b(final c this$1, final Iterator val$nodeConnections) {
                this.f34196c = val$nodeConnections;
                this.f34197d = this$1;
            }

            @Override // com.google.common.collect.c
            @CheckForNull
            public N a() {
                while (this.f34196c.hasNext()) {
                    f fVar = (f) this.f34196c.next();
                    if (fVar instanceof f.b) {
                        return fVar.f34202a;
                    }
                }
                return b();
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa<N> iterator() {
            return a.this.f34181b == null ? new C0418a(this, a.this.f34180a.entrySet().iterator()) : new b(this, a.this.f34181b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return a.t(a.this.f34180a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.f34183d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends com.google.common.collect.c<f0<N>> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f34198c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f34199d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a f34200e;

        public d(final a this$0, final Iterator val$resultWithDoubleSelfLoop, final AtomicBoolean val$alreadySeenSelfLoop) {
            this.f34198c = val$resultWithDoubleSelfLoop;
            this.f34199d = val$alreadySeenSelfLoop;
            this.f34200e = this$0;
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f0<N> a() {
            while (this.f34198c.hasNext()) {
                f0<N> f0Var = (f0) this.f34198c.next();
                if (!f0Var.f().equals(f0Var.g()) || !this.f34199d.getAndSet(true)) {
                    return f0Var;
                }
            }
            return b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34201a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f34201a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34201a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<N> {

        /* renamed from: a, reason: collision with root package name */
        public final N f34202a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.graph.a$f$a, reason: collision with other inner class name */
        public static final class C0419a<N> extends f<N> {
            public C0419a(N node) {
                super(node);
            }

            public boolean equals(@CheckForNull Object that) {
                if (that instanceof C0419a) {
                    return this.f34202a.equals(((C0419a) that).f34202a);
                }
                return false;
            }

            public int hashCode() {
                return C0419a.class.hashCode() + this.f34202a.hashCode();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<N> extends f<N> {
            public b(N node) {
                super(node);
            }

            public boolean equals(@CheckForNull Object that) {
                if (that instanceof b) {
                    return this.f34202a.equals(((b) that).f34202a);
                }
                return false;
            }

            public int hashCode() {
                return b.class.hashCode() + this.f34202a.hashCode();
            }
        }

        public f(N n11) {
            this.f34202a = (N) Preconditions.checkNotNull(n11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final Object f34203a;

        public g(Object successorValue) {
            this.f34203a = successorValue;
        }
    }

    public a(Map<N, Object> adjacentNodeValues, @CheckForNull List<f<N>> orderedNodeConnections, int predecessorCount, int successorCount) {
        this.f34180a = (Map) Preconditions.checkNotNull(adjacentNodeValues);
        this.f34181b = orderedNodeConnections;
        this.f34182c = com.google.common.graph.d.d(predecessorCount);
        this.f34183d = com.google.common.graph.d.d(successorCount);
        Preconditions.checkState(predecessorCount <= adjacentNodeValues.size() && successorCount <= adjacentNodeValues.size());
    }

    public static /* synthetic */ f0 k(Object obj, f fVar) {
        return fVar instanceof f.b ? f0.k(obj, fVar.f34202a) : f0.k(fVar.f34202a, obj);
    }

    public static boolean s(@CheckForNull Object value) {
        return value == f34179e || (value instanceof g);
    }

    public static boolean t(@CheckForNull Object value) {
        return (value == f34179e || value == null) ? false : true;
    }

    public static <N, V> a<N, V> u(ElementOrder<N> incidentEdgeOrder) {
        ArrayList arrayList;
        int i11 = e.f34201a[incidentEdgeOrder.h().ordinal()];
        if (i11 == 1) {
            arrayList = null;
        } else {
            if (i11 != 2) {
                throw new AssertionError(incidentEdgeOrder.h());
            }
            arrayList = new ArrayList();
        }
        return new a<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> a<N, V> v(N thisNode, Iterable<f0<N>> incidentEdges, r<N, V> successorNodeToValueFn) {
        Preconditions.checkNotNull(thisNode);
        Preconditions.checkNotNull(successorNodeToValueFn);
        HashMap hashMap = new HashMap();
        ImmutableList.a builder = ImmutableList.builder();
        int i11 = 0;
        int i12 = 0;
        for (f0<N> f0Var : incidentEdges) {
            if (f0Var.f().equals(thisNode) && f0Var.g().equals(thisNode)) {
                hashMap.put(thisNode, new g(successorNodeToValueFn.apply(thisNode)));
                builder.g(new f.C0419a(thisNode));
                builder.g(new f.b(thisNode));
                i11++;
            } else if (f0Var.g().equals(thisNode)) {
                N f11 = f0Var.f();
                Object put = hashMap.put(f11, f34179e);
                if (put != null) {
                    hashMap.put(f11, new g(put));
                }
                builder.g(new f.C0419a(f11));
                i11++;
            } else {
                Preconditions.checkArgument(f0Var.f().equals(thisNode));
                N g11 = f0Var.g();
                V apply = successorNodeToValueFn.apply(g11);
                Object put2 = hashMap.put(g11, apply);
                if (put2 != null) {
                    Preconditions.checkArgument(put2 == f34179e);
                    hashMap.put(g11, new g(apply));
                }
                builder.g(new f.b(g11));
            }
            i12++;
        }
        return new a<>(hashMap, builder.e(), i11, i12);
    }

    @Override // mo.l0
    public Set<N> a() {
        return this.f34181b == null ? Collections.unmodifiableSet(this.f34180a.keySet()) : new C0414a();
    }

    @Override // mo.l0
    public Set<N> b() {
        return new c();
    }

    @Override // mo.l0
    public Set<N> c() {
        return new b();
    }

    @Override // mo.l0
    public void d(N node, V unused) {
        Map<N, Object> map = this.f34180a;
        Object obj = f34179e;
        Object put = map.put(node, obj);
        if (put != null) {
            if (put instanceof g) {
                this.f34180a.put(node, put);
                return;
            } else if (put == obj) {
                return;
            } else {
                this.f34180a.put(node, new g(put));
            }
        }
        int i11 = this.f34182c + 1;
        this.f34182c = i11;
        com.google.common.graph.d.f(i11);
        List<f<N>> list = this.f34181b;
        if (list != null) {
            list.add(new f.C0419a(node));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mo.l0
    @CheckForNull
    public V e(N n11) {
        Preconditions.checkNotNull(n11);
        V v11 = (V) this.f34180a.get(n11);
        if (v11 == f34179e) {
            return null;
        }
        return v11 instanceof g ? (V) ((g) v11).f34203a : v11;
    }

    @Override // mo.l0
    @CheckForNull
    public V f(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = (V) this.f34180a.get(obj);
        if (obj3 == null || obj3 == (obj2 = f34179e)) {
            obj3 = (V) null;
        } else if (obj3 instanceof g) {
            this.f34180a.put(obj, obj2);
            obj3 = (V) ((g) obj3).f34203a;
        } else {
            this.f34180a.remove(obj);
        }
        if (obj3 != null) {
            int i11 = this.f34183d - 1;
            this.f34183d = i11;
            com.google.common.graph.d.d(i11);
            List<f<N>> list = this.f34181b;
            if (list != null) {
                list.remove(new f.b(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // mo.l0
    public void g(N node) {
        Preconditions.checkNotNull(node);
        Object obj = this.f34180a.get(node);
        if (obj == f34179e) {
            this.f34180a.remove(node);
        } else if (!(obj instanceof g)) {
            return;
        } else {
            this.f34180a.put(node, ((g) obj).f34203a);
        }
        int i11 = this.f34182c - 1;
        this.f34182c = i11;
        com.google.common.graph.d.d(i11);
        List<f<N>> list = this.f34181b;
        if (list != null) {
            list.remove(new f.C0419a(node));
        }
    }

    @Override // mo.l0
    public Iterator<f0<N>> h(final N thisNode) {
        Preconditions.checkNotNull(thisNode);
        List<f<N>> list = this.f34181b;
        return new d(this, list == null ? l6.i(l6.b0(c().iterator(), new r() { // from class: mo.y
            @Override // ho.r
            public final Object apply(Object obj) {
                f0 k11;
                k11 = f0.k(obj, thisNode);
                return k11;
            }
        }), l6.b0(b().iterator(), new r() { // from class: mo.z
            @Override // ho.r
            public final Object apply(Object obj) {
                f0 k11;
                k11 = f0.k(thisNode, obj);
                return k11;
            }
        })) : l6.b0(list.iterator(), new r() { // from class: mo.a0
            @Override // ho.r
            public final Object apply(Object obj) {
                return com.google.common.graph.a.k(thisNode, (a.f) obj);
            }
        }), new AtomicBoolean(false));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[RETURN] */
    @Override // mo.l0
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V i(N r5, V r6) {
        /*
            r4 = this;
            java.util.Map<N, java.lang.Object> r0 = r4.f34180a
            java.lang.Object r0 = r0.put(r5, r6)
            r1 = 0
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
            goto L2f
        Lb:
            boolean r2 = r0 instanceof com.google.common.graph.a.g
            if (r2 == 0) goto L20
            java.util.Map<N, java.lang.Object> r2 = r4.f34180a
            com.google.common.graph.a$g r3 = new com.google.common.graph.a$g
            r3.<init>(r6)
            r2.put(r5, r3)
            com.google.common.graph.a$g r0 = (com.google.common.graph.a.g) r0
            java.lang.Object r0 = com.google.common.graph.a.g.a(r0)
            goto L2f
        L20:
            java.lang.Object r2 = com.google.common.graph.a.f34179e
            if (r0 != r2) goto L2f
            java.util.Map<N, java.lang.Object> r0 = r4.f34180a
            com.google.common.graph.a$g r2 = new com.google.common.graph.a$g
            r2.<init>(r6)
            r0.put(r5, r2)
            goto L9
        L2f:
            if (r0 != 0) goto L46
            int r6 = r4.f34183d
            int r6 = r6 + 1
            r4.f34183d = r6
            com.google.common.graph.d.f(r6)
            java.util.List<com.google.common.graph.a$f<N>> r6 = r4.f34181b
            if (r6 == 0) goto L46
            com.google.common.graph.a$f$b r2 = new com.google.common.graph.a$f$b
            r2.<init>(r5)
            r6.add(r2)
        L46:
            if (r0 != 0) goto L49
            return r1
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.a.i(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
