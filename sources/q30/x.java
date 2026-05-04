package q30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.Random;
import yz.g2;
import yz.h1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class x extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,731:1\n*E\n"})
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<Iterator<T>> f81639a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.a<? extends Iterator<? extends T>> aVar) {
            this.f81639a = aVar;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            return this.f81639a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,731:1\n31#2:732\n*E\n"})
    public static final class b<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f81640a;

        public b(Iterator it) {
            this.f81640a = it;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            return this.f81640a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0, 0, 0}, l = {383}, m = "invokeSuspend", n = {"$this$sequence", "element", "result", "index"}, nl = {385}, s = {"L$0", "L$2", "L$3", "I$0"}, v = 2)
    public static final class c<R> extends RestrictedSuspendLambda implements x00.p<o<? super R>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81641a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81642b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81643c;

        /* renamed from: d, reason: collision with root package name */
        public int f81644d;

        /* renamed from: e, reason: collision with root package name */
        public int f81645e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f81646f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m<T> f81647g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.p<Integer, T, C> f81648h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x00.l<C, Iterator<R>> f81649i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(m<? extends T> mVar, x00.p<? super Integer, ? super T, ? extends C> pVar, x00.l<? super C, ? extends Iterator<? extends R>> lVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f81647g = mVar;
            this.f81648h = pVar;
            this.f81649i = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f81647g, this.f81648h, this.f81649i, cVar);
            cVar2.f81646f = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11;
            Iterator it;
            o oVar = (o) this.f81646f;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f81645e;
            if (i12 == 0) {
                kotlin.e.n(obj);
                i11 = 0;
                it = this.f81647g.iterator();
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f81644d;
                it = (Iterator) this.f81641a;
                kotlin.e.n(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                x00.p<Integer, T, C> pVar = this.f81648h;
                int i13 = i11 + 1;
                if (i11 < 0) {
                    a00.h0.b0();
                }
                Object invoke = pVar.invoke(l00.a.f(i11), next);
                Iterator<R> invoke2 = this.f81649i.invoke(invoke);
                this.f81646f = oVar;
                this.f81641a = it;
                this.f81642b = l00.k.a(next);
                this.f81643c = l00.k.a(invoke);
                this.f81644d = i13;
                this.f81645e = 1;
                if (oVar.d(invoke2, this) == l11) {
                    return l11;
                }
                i11 = i13;
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(o<? super R> oVar, j00.c<? super g2> cVar) {
            return ((c) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {0, 0, 1, 1}, l = {102, 104}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "$this$sequence", "iterator"}, nl = {104, 106}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
    public static final class d<T> extends RestrictedSuspendLambda implements x00.p<o<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81650a;

        /* renamed from: b, reason: collision with root package name */
        public int f81651b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f81652c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m<T> f81653d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.a<m<T>> f81654e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(m<? extends T> mVar, x00.a<? extends m<? extends T>> aVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f81653d = mVar;
            this.f81654e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f81653d, this.f81654e, cVar);
            dVar.f81652c = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r0.d(r6, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (r0.f(r2, r5) == r1) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f81652c
                q30.o r0 = (q30.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r5.f81651b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r0 = r5.f81650a
                java.util.Iterator r0 = (java.util.Iterator) r0
                kotlin.e.n(r6)
                goto L64
            L23:
                kotlin.e.n(r6)
                q30.m<T> r6 = r5.f81653d
                java.util.Iterator r6 = r6.iterator()
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L47
                java.lang.Object r2 = l00.k.a(r0)
                r5.f81652c = r2
                java.lang.Object r2 = l00.k.a(r6)
                r5.f81650a = r2
                r5.f81651b = r4
                java.lang.Object r6 = r0.d(r6, r5)
                if (r6 != r1) goto L64
                goto L63
            L47:
                x00.a<q30.m<T>> r2 = r5.f81654e
                java.lang.Object r2 = r2.invoke()
                q30.m r2 = (q30.m) r2
                java.lang.Object r4 = l00.k.a(r0)
                r5.f81652c = r4
                java.lang.Object r6 = l00.k.a(r6)
                r5.f81650a = r6
                r5.f81651b = r3
                java.lang.Object r6 = r0.f(r2, r5)
                if (r6 != r1) goto L64
            L63:
                return r1
            L64:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q30.x.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(o<? super T> oVar, j00.c<? super g2> cVar) {
            return ((d) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,731:1\n49#2,11:732\n*E\n"})
    public static final class e<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f81655a;

        public e(Object obj) {
            this.f81655a = obj;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            return new f(this.f81655a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T> implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f81656a = true;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f81657b;

        public f(T t11) {
            this.f81657b = t11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81656a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f81656a) {
                throw new NoSuchElementException();
            }
            this.f81656a = false;
            return this.f81657b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0, 0, 0, 0}, l = {178}, m = "invokeSuspend", n = {"$this$sequence", "buffer", "last", "value", "j"}, nl = {180}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
    public static final class g<T> extends RestrictedSuspendLambda implements x00.p<o<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81658a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81659b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81660c;

        /* renamed from: d, reason: collision with root package name */
        public int f81661d;

        /* renamed from: e, reason: collision with root package name */
        public int f81662e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f81663f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m<T> f81664g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Random f81665h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(m<? extends T> mVar, Random random, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f81664g = mVar;
            this.f81665h = random;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = new g(this.f81664g, this.f81665h, cVar);
            gVar.f81663f = obj;
            return gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List J3;
            o oVar = (o) this.f81663f;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f81662e;
            if (i11 == 0) {
                kotlin.e.n(obj);
                J3 = k0.J3(this.f81664g);
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J3 = (List) this.f81658a;
                kotlin.e.n(obj);
            }
            while (!J3.isEmpty()) {
                int nextInt = this.f81665h.nextInt(J3.size());
                Object Q0 = a00.m0.Q0(J3);
                Object obj2 = nextInt < J3.size() ? J3.set(nextInt, Q0) : Q0;
                this.f81663f = oVar;
                this.f81658a = J3;
                this.f81659b = l00.k.a(Q0);
                this.f81660c = l00.k.a(obj2);
                this.f81661d = nextInt;
                this.f81662e = 1;
                if (oVar.b(obj2, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(o<? super T> oVar, j00.c<? super g2> cVar) {
            return ((g) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @y0(version = "2.2")
    @o00.f
    public static final <T> m<T> A() {
        return l();
    }

    @y0(version = "2.2")
    @m80.k
    public static <T> m<T> B(T t11) {
        return new e(t11);
    }

    @m80.k
    public static <T> m<T> C(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return a00.a0.T5(elements);
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T> m<T> D(@m80.k m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return E(mVar, Random.Default);
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T> m<T> E(@m80.k m<? extends T> mVar, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        return q.b(new g(mVar, random, null));
    }

    @m80.k
    public static final <T, R> Pair<List<T>, List<R>> F(@m80.k m<? extends Pair<? extends T, ? extends R>> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : mVar) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return h1.a(arrayList, arrayList2);
    }

    @o00.f
    public static final <T> m<T> i(x00.a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        return new a(iterator);
    }

    @m80.k
    public static <T> m<T> j(@m80.k Iterator<? extends T> it) {
        kotlin.jvm.internal.g0.p(it, "<this>");
        return k(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static <T> m<T> k(@m80.k m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return mVar instanceof q30.a ? mVar : new q30.a(mVar);
    }

    @m80.k
    public static <T> m<T> l() {
        return q30.g.f81505a;
    }

    @m80.k
    public static final <T, C, R> m<R> m(@m80.k m<? extends T> source, @m80.k x00.p<? super Integer, ? super T, ? extends C> transform, @m80.k x00.l<? super C, ? extends Iterator<? extends R>> iterator) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(transform, "transform");
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        return q.b(new c(source, transform, iterator, null));
    }

    @m80.k
    public static final <T> m<T> n(@m80.k m<? extends m<? extends T>> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return o(mVar, new x00.l() { // from class: q30.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                Iterator p11;
                p11 = x.p((m) obj);
                return p11;
            }
        });
    }

    public static final <T, R> m<R> o(m<? extends T> mVar, x00.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return mVar instanceof t0 ? ((t0) mVar).e(lVar) : new i(mVar, new x00.l() { // from class: q30.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object r11;
                r11 = x.r(obj);
                return r11;
            }
        }, lVar);
    }

    public static final Iterator p(m it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.iterator();
    }

    public static final Iterator q(Iterable it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.iterator();
    }

    @w00.j(name = "flattenSequenceOfIterable")
    @m80.k
    public static final <T> m<T> s(@m80.k m<? extends Iterable<? extends T>> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return o(mVar, new x00.l() { // from class: q30.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                Iterator q11;
                q11 = x.q((Iterable) obj);
                return q11;
            }
        });
    }

    @o00.i
    @m80.k
    public static <T> m<T> t(@m80.l final T t11, @m80.k x00.l<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.g0.p(nextFunction, "nextFunction");
        return t11 == null ? q30.g.f81505a : new j(new x00.a() { // from class: q30.s
            @Override // x00.a
            public final Object invoke() {
                Object x11;
                x11 = x.x(t11);
                return x11;
            }
        }, nextFunction);
    }

    @m80.k
    public static <T> m<T> u(@m80.k final x00.a<? extends T> nextFunction) {
        kotlin.jvm.internal.g0.p(nextFunction, "nextFunction");
        return k(new j(nextFunction, new x00.l() { // from class: q30.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object w11;
                w11 = x.w(x00.a.this, obj);
                return w11;
            }
        }));
    }

    @m80.k
    public static <T> m<T> v(@m80.k x00.a<? extends T> seedFunction, @m80.k x00.l<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.g0.p(seedFunction, "seedFunction");
        kotlin.jvm.internal.g0.p(nextFunction, "nextFunction");
        return new j(seedFunction, nextFunction);
    }

    public static final Object w(x00.a aVar, Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return aVar.invoke();
    }

    @y0(version = "1.3")
    @m80.k
    public static final <T> m<T> y(@m80.k m<? extends T> mVar, @m80.k x00.a<? extends m<? extends T>> defaultValue) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return q.b(new d(mVar, defaultValue, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @o00.f
    public static final <T> m<T> z(m<? extends T> mVar) {
        return mVar == 0 ? l() : mVar;
    }

    public static final Object r(Object obj) {
        return obj;
    }

    public static final Object x(Object obj) {
        return obj;
    }
}
