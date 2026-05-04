package q30;

import a00.a1;
import a00.v1;
import a00.w0;
import a00.z1;
import e00.g;
import ix.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import org.junit.jupiter.api.j2;
import q30.k0;
import yz.g2;
import yz.h1;
import yz.s1;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3218:1\n183#1,2:3219\n320#1,7:3221\n1332#1,3:3229\n747#1,4:3232\n712#1,4:3236\n730#1,4:3240\n783#1,4:3244\n1025#1,3:3248\n1028#1,3:3258\n1045#1,3:3261\n1048#1,3:3271\n1332#1,3:3288\n1321#1,2:3291\n1#2:3228\n382#3,7:3251\n382#3,7:3264\n382#3,7:3274\n382#3,7:3281\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n91#1:3219,2\n103#1:3221,7\n462#1:3229,3\n666#1:3232,4\n682#1:3236,4\n697#1:3240,4\n768#1:3244,4\n996#1:3248,3\n996#1:3258,3\n1011#1:3261,3\n1011#1:3271,3\n1114#1:3288,3\n1152#1:3291,2\n996#1:3251,7\n1011#1:3264,7\n1027#1:3274,7\n1047#1:3281,7\n*E\n"})
/* loaded from: classes8.dex */
public class k0 extends z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n3027#2:71\n*E\n"})
    public static final class a<T> implements Iterable<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m f81534a;

        public a(q30.m mVar) {
            this.f81534a = mVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f81534a.iterator();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3218:1\n*E\n"})
    public static final class b implements x00.l<Object, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f81535a = new b();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            kotlin.jvm.internal.g0.y(3, "R");
            return Boolean.valueOf(Objects.nonNull(obj));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c<R> extends FunctionReferenceImpl implements x00.l<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f81536a = new c();

        public c() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Iterable<? extends R> p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return p02.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d<R> extends FunctionReferenceImpl implements x00.l<q30.m<? extends R>, Iterator<? extends R>> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f81537a = new d();

        public d() {
            super(1, q30.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(q30.m<? extends R> p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return p02.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class e<R> extends FunctionReferenceImpl implements x00.l<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f81538a = new e();

        public e() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Iterable<? extends R> p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return p02.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f<R> extends FunctionReferenceImpl implements x00.l<q30.m<? extends R>, Iterator<? extends R>> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f81539a = new f();

        public f() {
            super(1, q30.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(q30.m<? extends R> p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return p02.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3218:1\n*E\n"})
    public static final class g<K, T> implements w0<T, K> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81540a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f81541b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(q30.m<? extends T> mVar, x00.l<? super T, ? extends K> lVar) {
            this.f81540a = mVar;
            this.f81541b = lVar;
        }

        @Override // a00.w0
        public K a(T t11) {
            return this.f81541b.invoke(t11);
        }

        @Override // a00.w0
        public Iterator<T> b() {
            return this.f81540a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81542a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f81543b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(q30.m<? extends T> mVar, T t11) {
            this.f81542a = mVar;
            this.f81543b = t11;
        }

        public static final boolean d(Ref.BooleanRef booleanRef, Object obj, Object obj2) {
            if (booleanRef.element || !kotlin.jvm.internal.g0.g(obj2, obj)) {
                return true;
            }
            booleanRef.element = true;
            return false;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            q30.m<T> mVar = this.f81542a;
            final T t11 = this.f81543b;
            return k0.P0(mVar, new x00.l() { // from class: q30.l0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean d11;
                    d11 = k0.h.d(Ref.BooleanRef.this, t11, obj);
                    return Boolean.valueOf(d11);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81544a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T[] f81545b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(q30.m<? extends T> mVar, T[] tArr) {
            this.f81544a = mVar;
            this.f81545b = tArr;
        }

        public static final boolean d(Object[] objArr, Object obj) {
            return a00.a0.B8(objArr, obj);
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            q30.m<T> mVar = this.f81544a;
            final T[] tArr = this.f81545b;
            return k0.W0(mVar, new x00.l() { // from class: q30.m0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean d11;
                    d11 = k0.i.d(tArr, obj);
                    return Boolean.valueOf(d11);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f81546a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81547b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Iterable<? extends T> iterable, q30.m<? extends T> mVar) {
            this.f81546a = iterable;
            this.f81547b = mVar;
        }

        public static final boolean d(Collection collection, Object obj) {
            return collection.contains(obj);
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            final Collection v02 = a00.m0.v0(this.f81546a);
            return v02.isEmpty() ? this.f81547b.iterator() : k0.W0(this.f81547b, new x00.l() { // from class: q30.n0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean d11;
                    d11 = k0.j.d(v02, obj);
                    return Boolean.valueOf(d11);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81548a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81549b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(q30.m<? extends T> mVar, q30.m<? extends T> mVar2) {
            this.f81548a = mVar;
            this.f81549b = mVar2;
        }

        public static final boolean d(List list, Object obj) {
            return list.contains(obj);
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            final List I3 = k0.I3(this.f81548a);
            return I3.isEmpty() ? this.f81549b.iterator() : k0.W0(this.f81549b, new x00.l() { // from class: q30.o0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean d11;
                    d11 = k0.k.d(I3, obj);
                    return Boolean.valueOf(d11);
                }
            }).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2423, 2427}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element"}, nl = {2424, 2429}, s = {"L$0", "L$0", "L$1", "L$3"}, v = 2)
    public static final class l<R> extends RestrictedSuspendLambda implements x00.p<q30.o<? super R>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81550a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81551b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81552c;

        /* renamed from: d, reason: collision with root package name */
        public int f81553d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f81554e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ R f81555f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81556g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.p<R, T, R> f81557h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(R r11, q30.m<? extends T> mVar, x00.p<? super R, ? super T, ? extends R> pVar, j00.c<? super l> cVar) {
            super(2, cVar);
            this.f81555f = r11;
            this.f81556g = mVar;
            this.f81557h = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            l lVar = new l(this.f81555f, this.f81556g, this.f81557h, cVar);
            lVar.f81554e = obj;
            return lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        
            if (r0.b(r7, r6) == r1) goto L18;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f81554e
                q30.o r0 = (q30.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r6.f81553d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L29
                if (r2 == r4) goto L25
                if (r2 != r3) goto L1d
                java.lang.Object r2 = r6.f81551b
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r6.f81550a
                kotlin.e.n(r7)
                r7 = r4
                goto L41
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                kotlin.e.n(r7)
                goto L39
            L29:
                kotlin.e.n(r7)
                R r7 = r6.f81555f
                r6.f81554e = r0
                r6.f81553d = r4
                java.lang.Object r7 = r0.b(r7, r6)
                if (r7 != r1) goto L39
                goto L65
            L39:
                R r7 = r6.f81555f
                q30.m<T> r2 = r6.f81556g
                java.util.Iterator r2 = r2.iterator()
            L41:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L66
                java.lang.Object r4 = r2.next()
                x00.p<R, T, R> r5 = r6.f81557h
                java.lang.Object r7 = r5.invoke(r7, r4)
                r6.f81554e = r0
                r6.f81550a = r7
                r6.f81551b = r2
                java.lang.Object r4 = l00.k.a(r4)
                r6.f81552c = r4
                r6.f81553d = r3
                java.lang.Object r4 = r0.b(r7, r6)
                if (r4 != r1) goto L41
            L65:
                return r1
            L66:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: q30.k0.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super R> oVar, j00.c<? super g2> cVar) {
            return ((l) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1, 1}, l = {2451, 2456}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element", "index"}, nl = {2452, 2458}, s = {"L$0", "L$0", "L$1", "L$3", "I$0"}, v = 2)
    public static final class m<R> extends RestrictedSuspendLambda implements x00.p<q30.o<? super R>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81558a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81559b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81560c;

        /* renamed from: d, reason: collision with root package name */
        public int f81561d;

        /* renamed from: e, reason: collision with root package name */
        public int f81562e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f81563f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ R f81564g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81565h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x00.q<Integer, R, T, R> f81566i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(R r11, q30.m<? extends T> mVar, x00.q<? super Integer, ? super R, ? super T, ? extends R> qVar, j00.c<? super m> cVar) {
            super(2, cVar);
            this.f81564g = r11;
            this.f81565h = mVar;
            this.f81566i = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            m mVar = new m(this.f81564g, this.f81565h, this.f81566i, cVar);
            mVar.f81563f = obj;
            return mVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
        
            if (r0.b(r10, r9) == r1) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f81563f
                q30.o r0 = (q30.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r9.f81562e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                int r2 = r9.f81561d
                java.lang.Object r4 = r9.f81559b
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r9.f81558a
                kotlin.e.n(r10)
                r10 = r5
                goto L47
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                kotlin.e.n(r10)
                goto L3b
            L2b:
                kotlin.e.n(r10)
                R r10 = r9.f81564g
                r9.f81563f = r0
                r9.f81562e = r4
                java.lang.Object r10 = r0.b(r10, r9)
                if (r10 != r1) goto L3b
                goto L78
            L3b:
                R r10 = r9.f81564g
                q30.m<T> r2 = r9.f81565h
                java.util.Iterator r2 = r2.iterator()
                r4 = 0
                r8 = r4
                r4 = r2
                r2 = r8
            L47:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L7b
                java.lang.Object r5 = r4.next()
                x00.q<java.lang.Integer, R, T, R> r6 = r9.f81566i
                int r7 = r2 + 1
                if (r2 >= 0) goto L5a
                a00.h0.b0()
            L5a:
                java.lang.Integer r2 = l00.a.f(r2)
                java.lang.Object r10 = r6.invoke(r2, r10, r5)
                r9.f81563f = r0
                r9.f81558a = r10
                r9.f81559b = r4
                java.lang.Object r2 = l00.k.a(r5)
                r9.f81560c = r2
                r9.f81561d = r7
                r9.f81562e = r3
                java.lang.Object r2 = r0.b(r10, r9)
                if (r2 != r1) goto L79
            L78:
                return r1
            L79:
                r2 = r7
                goto L47
            L7b:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q30.k0.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super R> oVar, j00.c<? super g2> cVar) {
            return ((m) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2480, 2483}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, nl = {2481, 2486}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
    public static final class n<S> extends RestrictedSuspendLambda implements x00.p<q30.o<? super S>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81567a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81568b;

        /* renamed from: c, reason: collision with root package name */
        public int f81569c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f81570d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81571e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.p<S, T, S> f81572f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(q30.m<? extends T> mVar, x00.p<? super S, ? super T, ? extends S> pVar, j00.c<? super n> cVar) {
            super(2, cVar);
            this.f81571e = mVar;
            this.f81572f = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            n nVar = new n(this.f81571e, this.f81572f, cVar);
            nVar.f81570d = obj;
            return nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            Iterator it;
            q30.o oVar = (q30.o) this.f81570d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f81569c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Iterator it2 = this.f81571e.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f81570d = oVar;
                    this.f81567a = it2;
                    this.f81568b = next;
                    this.f81569c = 1;
                    if (oVar.b(next, this) != l11) {
                        it = it2;
                    }
                    return l11;
                }
                return g2.f100423a;
            }
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f81568b;
            it = (Iterator) this.f81567a;
            kotlin.e.n(obj);
            while (it.hasNext()) {
                next = this.f81572f.invoke(next, it.next());
                this.f81570d = oVar;
                this.f81567a = it;
                this.f81568b = next;
                this.f81569c = 2;
                if (oVar.b(next, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super S> oVar, j00.c<? super g2> cVar) {
            return ((n) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2509, 2513}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, nl = {2510, 2516}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"}, v = 2)
    public static final class o<S> extends RestrictedSuspendLambda implements x00.p<q30.o<? super S>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81573a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81574b;

        /* renamed from: c, reason: collision with root package name */
        public int f81575c;

        /* renamed from: d, reason: collision with root package name */
        public int f81576d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f81577e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81578f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.q<Integer, S, T, S> f81579g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(q30.m<? extends T> mVar, x00.q<? super Integer, ? super S, ? super T, ? extends S> qVar, j00.c<? super o> cVar) {
            super(2, cVar);
            this.f81578f = mVar;
            this.f81579g = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            o oVar = new o(this.f81578f, this.f81579g, cVar);
            oVar.f81577e = obj;
            return oVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        
            if (r0.b(r2, r9) == r1) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f81577e
                q30.o r0 = (q30.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r9.f81576d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L33
                if (r2 == r4) goto L29
                if (r2 != r3) goto L21
                int r2 = r9.f81575c
                java.lang.Object r4 = r9.f81574b
                java.lang.Object r5 = r9.f81573a
                java.util.Iterator r5 = (java.util.Iterator) r5
                kotlin.e.n(r10)
                r8 = r4
                r4 = r2
                r2 = r8
                goto L55
            L21:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L29:
                java.lang.Object r2 = r9.f81574b
                java.lang.Object r5 = r9.f81573a
                java.util.Iterator r5 = (java.util.Iterator) r5
                kotlin.e.n(r10)
                goto L55
            L33:
                kotlin.e.n(r10)
                q30.m<T> r10 = r9.f81578f
                java.util.Iterator r5 = r10.iterator()
                boolean r10 = r5.hasNext()
                if (r10 == 0) goto L84
                java.lang.Object r2 = r5.next()
                r9.f81577e = r0
                r9.f81573a = r5
                r9.f81574b = r2
                r9.f81576d = r4
                java.lang.Object r10 = r0.b(r2, r9)
                if (r10 != r1) goto L55
                goto L80
            L55:
                boolean r10 = r5.hasNext()
                if (r10 == 0) goto L84
                x00.q<java.lang.Integer, S, T, S> r10 = r9.f81579g
                int r6 = r4 + 1
                if (r4 >= 0) goto L64
                a00.h0.b0()
            L64:
                java.lang.Integer r4 = l00.a.f(r4)
                java.lang.Object r7 = r5.next()
                java.lang.Object r4 = r10.invoke(r4, r2, r7)
                r9.f81577e = r0
                r9.f81573a = r5
                r9.f81574b = r4
                r9.f81575c = r6
                r9.f81576d = r3
                java.lang.Object r10 = r0.b(r4, r9)
                if (r10 != r1) goto L81
            L80:
                return r1
            L81:
                r2 = r4
                r4 = r6
                goto L55
            L84:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q30.k0.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super S> oVar, j00.c<? super g2> cVar) {
            return ((o) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81580a;

        /* JADX WARN: Multi-variable type inference failed */
        public p(q30.m<? extends T> mVar) {
            this.f81580a = mVar;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            List J3 = k0.J3(this.f81580a);
            a00.l0.o0(J3);
            return J3.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q<T> implements q30.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81581a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super T> f81582b;

        /* JADX WARN: Multi-variable type inference failed */
        public q(q30.m<? extends T> mVar, Comparator<? super T> comparator) {
            this.f81581a = mVar;
            this.f81582b = comparator;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            List J3 = k0.J3(this.f81581a);
            a00.l0.r0(J3, this.f81582b);
            return J3.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0, 0}, l = {2979}, m = "invokeSuspend", n = {"$this$result", "iterator", "current", l1.b.f62938h}, nl = {2980}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
    public static final class r<R> extends RestrictedSuspendLambda implements x00.p<q30.o<? super R>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f81583a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81584b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81585c;

        /* renamed from: d, reason: collision with root package name */
        public int f81586d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f81587e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q30.m<T> f81588f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.p<T, T, R> f81589g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(q30.m<? extends T> mVar, x00.p<? super T, ? super T, ? extends R> pVar, j00.c<? super r> cVar) {
            super(2, cVar);
            this.f81588f = mVar;
            this.f81589g = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            r rVar = new r(this.f81588f, this.f81589g, cVar);
            rVar.f81587e = obj;
            return rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            Iterator it;
            q30.o oVar = (q30.o) this.f81587e;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f81586d;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Iterator it2 = this.f81588f.iterator();
                if (!it2.hasNext()) {
                    return g2.f100423a;
                }
                next = it2.next();
                it = it2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                next = this.f81585c;
                it = (Iterator) this.f81583a;
                kotlin.e.n(obj);
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                R invoke = this.f81589g.invoke(next, next2);
                this.f81587e = oVar;
                this.f81583a = it;
                this.f81584b = l00.k.a(next);
                this.f81585c = next2;
                this.f81586d = 1;
                if (oVar.b(invoke, this) == l11) {
                    return l11;
                }
                next = next2;
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super R> oVar, j00.c<? super g2> cVar) {
            return ((r) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @w00.j(name = "averageOfShort")
    public static final double A0(@m80.k q30.m<Short> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().shortValue();
            i11++;
            if (i11 < 0) {
                a00.h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @y0(version = "1.1")
    @m80.k
    public static final <T, K> w0<T, K> A1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        return new g(mVar, keySelector);
    }

    @w00.j(name = "minOrThrow")
    @y0(version = "1.7")
    public static final double A2(@m80.k q30.m<Double> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    @w00.j(name = "sumOfLong")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> long A3(q30.m<? extends T> mVar, x00.l<? super T, Long> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += selector.invoke(it.next()).longValue();
        }
        return j11;
    }

    @y0(version = "1.2")
    @m80.k
    public static final <T> q30.m<List<T>> B0(@m80.k q30.m<? extends T> mVar, int i11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return M3(mVar, i11, i11, true);
    }

    public static final <T> int B1(@m80.k q30.m<? extends T> mVar, T t11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        int i11 = 0;
        for (T t12 : mVar) {
            if (i11 < 0) {
                a00.h0.b0();
            }
            if (kotlin.jvm.internal.g0.g(t11, t12)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @w00.j(name = "minOrThrow")
    @y0(version = "1.7")
    public static final float B2(@m80.k q30.m<Float> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return floatValue;
    }

    @w00.j(name = "sumOfShort")
    public static final int B3(@m80.k q30.m<Short> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().shortValue();
        }
        return i11;
    }

    @y0(version = "1.2")
    @m80.k
    public static final <T, R> q30.m<R> C0(@m80.k q30.m<? extends T> mVar, int i11, @m80.k x00.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return N3(mVar, i11, i11, true, transform);
    }

    public static final <T> int C1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (T t11 : mVar) {
            if (i11 < 0) {
                a00.h0.b0();
            }
            if (predicate.invoke(t11).booleanValue()) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @w00.j(name = "minOrThrow")
    @y0(version = "1.7")
    @m80.k
    public static final <T extends Comparable<? super T>> T C2(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @w00.j(name = "sumOfUInt")
    @y0(version = "1.5")
    @o00.f
    public static final <T> int C3(q30.m<? extends T> mVar, x00.l<? super T, s1> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        int i11 = s1.i(0);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            i11 = s1.i(i11 + selector.invoke(it.next()).m0());
        }
        return i11;
    }

    public static <T> boolean D0(@m80.k q30.m<? extends T> mVar, T t11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return B1(mVar, t11) >= 0;
    }

    public static final <T> int D1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = -1;
        int i12 = 0;
        for (T t11 : mVar) {
            if (i12 < 0) {
                a00.h0.b0();
            }
            if (predicate.invoke(t11).booleanValue()) {
                i11 = i12;
            }
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    @y0(version = "1.4")
    public static final <T> T D2(@m80.k q30.m<? extends T> mVar, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    @w00.j(name = "sumOfULong")
    @y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final <T> long D3(q30.m<? extends T> mVar, x00.l<? super T, w1> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        long i11 = w1.i(0L);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            i11 = w1.i(i11 + selector.invoke(it.next()).m0());
        }
        return i11;
    }

    public static <T> int E0(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            it.next();
            i11++;
            if (i11 < 0) {
                a00.h0.a0();
            }
        }
        return i11;
    }

    @m80.k
    public static final <T, A extends Appendable> A E1(@m80.k q30.m<? extends T> mVar, @m80.k A buffer, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : mVar) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            u30.u.b(buffer, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.j(name = "minWithOrThrow")
    @y0(version = "1.7")
    public static final <T> T E2(@m80.k q30.m<? extends T> mVar, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    @m80.k
    public static <T> q30.m<T> E3(@m80.k q30.m<? extends T> mVar, int i11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        if (i11 >= 0) {
            return i11 == 0 ? x.l() : mVar instanceof q30.e ? ((q30.e) mVar).b(i11) : new q0(mVar, i11);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    public static final <T> int F0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i11 = i11 + 1) < 0) {
                a00.h0.a0();
            }
        }
        return i11;
    }

    @m80.k
    public static final <T> q30.m<T> F2(@m80.k q30.m<? extends T> mVar, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return new j(elements, mVar);
    }

    @m80.k
    public static <T> q30.m<T> F3(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return new r0(mVar, predicate);
    }

    @m80.k
    public static final <T> q30.m<T> G0(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return I0(mVar, new x00.l() { // from class: q30.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object H0;
                H0 = k0.H0(obj);
                return H0;
            }
        });
    }

    @m80.k
    public static final <T> String G1(@m80.k q30.m<? extends T> mVar, @m80.k CharSequence separator, @m80.k CharSequence prefix, @m80.k CharSequence postfix, int i11, @m80.k CharSequence truncated, @m80.l x00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(postfix, "postfix");
        kotlin.jvm.internal.g0.p(truncated, "truncated");
        return ((StringBuilder) E1(mVar, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    @m80.k
    public static final <T> q30.m<T> G2(@m80.k q30.m<? extends T> mVar, T t11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return new h(mVar, t11);
    }

    @m80.k
    public static <T, C extends Collection<? super T>> C G3(@m80.k q30.m<? extends T> mVar, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static /* synthetic */ String H1(q30.m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        x00.l lVar2 = lVar;
        return G1(mVar, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    @m80.k
    public static final <T> q30.m<T> H2(@m80.k q30.m<? extends T> mVar, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return new k(elements, mVar);
    }

    @m80.k
    public static final <T> HashSet<T> H3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return (HashSet) G3(mVar, new HashSet());
    }

    @m80.k
    public static <T, K> q30.m<T> I0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return new q30.c(mVar, selector);
    }

    public static <T> T I1(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> q30.m<T> I2(@m80.k q30.m<? extends T> mVar, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return elements.length == 0 ? mVar : new i(mVar, elements);
    }

    @m80.k
    public static <T> List<T> I3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return a00.h0.J();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return a00.g0.l(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static <T> q30.m<T> J0(@m80.k q30.m<? extends T> mVar, int i11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        if (i11 >= 0) {
            return i11 == 0 ? mVar : mVar instanceof q30.e ? ((q30.e) mVar).a(i11) : new q30.d(mVar, i11);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T J1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        boolean z11 = false;
        for (T t12 : mVar) {
            if (predicate.invoke(t12).booleanValue()) {
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @o00.f
    public static final <T> q30.m<T> J2(q30.m<? extends T> mVar, T t11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return G2(mVar, t11);
    }

    @m80.k
    public static <T> List<T> J3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return (List) G3(mVar, new ArrayList());
    }

    @m80.k
    public static final <T> q30.m<T> K0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return new q30.f(mVar, predicate);
    }

    public static final <T> int K1(@m80.k q30.m<? extends T> mVar, T t11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        int i11 = -1;
        int i12 = 0;
        for (T t12 : mVar) {
            if (i12 < 0) {
                a00.h0.b0();
            }
            if (kotlin.jvm.internal.g0.g(t11, t12)) {
                i11 = i12;
            }
            i12++;
        }
        return i11;
    }

    public static final <T> boolean K2(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    @m80.k
    public static final <T> Set<T> K3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T> T L0(@m80.k q30.m<? extends T> mVar, final int i11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return (T) N0(mVar, i11, new x00.l() { // from class: q30.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object M0;
                M0 = k0.M0(i11, ((Integer) obj).intValue());
                return M0;
            }
        });
    }

    @m80.l
    public static final <T> T L1(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> boolean L2(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static <T> Set<T> L3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return a00.w1.k();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return v1.f(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final Object M0(int i11, int i12) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i11 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @m80.l
    public static final <T> T M1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        for (T t12 : mVar) {
            if (predicate.invoke(t12).booleanValue()) {
                t11 = t12;
            }
        }
        return t11;
    }

    @y0(version = "1.1")
    @m80.k
    public static final <T> q30.m<T> M2(@m80.k q30.m<? extends T> mVar, @m80.k final x00.l<? super T, g2> action) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        return N1(mVar, new x00.l() { // from class: q30.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object N2;
                N2 = k0.N2(x00.l.this, obj);
                return N2;
            }
        });
    }

    @y0(version = "1.2")
    @m80.k
    public static final <T> q30.m<List<T>> M3(@m80.k q30.m<? extends T> mVar, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return z1.c(mVar, i11, i12, z11, false);
    }

    public static final <T> T N0(@m80.k q30.m<? extends T> mVar, int i11, @m80.k x00.l<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        if (i11 < 0) {
            return defaultValue.invoke(Integer.valueOf(i11));
        }
        int i12 = 0;
        for (T t11 : mVar) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return t11;
            }
            i12 = i13;
        }
        return defaultValue.invoke(Integer.valueOf(i11));
    }

    @m80.k
    public static <T, R> q30.m<R> N1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return new t0(mVar, transform);
    }

    public static final Object N2(x00.l lVar, Object obj) {
        lVar.invoke(obj);
        return obj;
    }

    @y0(version = "1.2")
    @m80.k
    public static final <T, R> q30.m<R> N3(@m80.k q30.m<? extends T> mVar, int i11, int i12, boolean z11, @m80.k x00.l<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return N1(z1.c(mVar, i11, i12, z11, true), transform);
    }

    @m80.l
    public static final <T> T O0(@m80.k q30.m<? extends T> mVar, int i11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        if (i11 < 0) {
            return null;
        }
        int i12 = 0;
        for (T t11 : mVar) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return t11;
            }
            i12 = i13;
        }
        return null;
    }

    @m80.k
    public static final <T, R> q30.m<R> O1(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return new s0(mVar, transform);
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T> q30.m<T> O2(@m80.k q30.m<? extends T> mVar, @m80.k final x00.p<? super Integer, ? super T, g2> action) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        return O1(mVar, new x00.p() { // from class: q30.i0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Object P2;
                P2 = k0.P2(x00.p.this, ((Integer) obj).intValue(), obj2);
                return P2;
            }
        });
    }

    public static /* synthetic */ q30.m O3(q30.m mVar, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return M3(mVar, i11, i12, z11);
    }

    @m80.k
    public static <T> q30.m<T> P0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return new q30.h(mVar, true, predicate);
    }

    @m80.k
    public static final <T, R> q30.m<R> P1(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return X0(new s0(mVar, transform));
    }

    public static final Object P2(x00.p pVar, int i11, Object obj) {
        pVar.invoke(Integer.valueOf(i11), obj);
        return obj;
    }

    public static /* synthetic */ q30.m P3(q30.m mVar, int i11, int i12, boolean z11, x00.l lVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 1;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return N3(mVar, i11, i12, z11, lVar);
    }

    @m80.k
    public static final <T> q30.m<T> Q0(@m80.k q30.m<? extends T> mVar, @m80.k final x00.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return new t0(new q30.h(new q30.k(mVar), true, new x00.l() { // from class: q30.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean R0;
                R0 = k0.R0(x00.p.this, (a1) obj);
                return Boolean.valueOf(R0);
            }
        }), new x00.l() { // from class: q30.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object S0;
                S0 = k0.S0((a1) obj);
                return S0;
            }
        });
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C Q1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : mVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            R invoke = transform.invoke(Integer.valueOf(i11), t11);
            if (invoke != null) {
                destination.add(invoke);
            }
            i11 = i12;
        }
        return destination;
    }

    @m80.k
    public static final <T> Pair<List<T>, List<T>> Q2(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            } else {
                arrayList2.add(t11);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @m80.k
    public static final <T> q30.m<a1<T>> Q3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return new q30.k(mVar);
    }

    public static final boolean R0(x00.p pVar, a1 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return ((Boolean) pVar.invoke(Integer.valueOf(it.e()), it.f())).booleanValue();
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C R1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : mVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            destination.add(transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return destination;
    }

    @m80.k
    public static <T> q30.m<T> R2(@m80.k q30.m<? extends T> mVar, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return x.n(x.C(mVar, a00.r0.E1(elements)));
    }

    @m80.k
    public static final <T, R> q30.m<Pair<T, R>> R3(@m80.k q30.m<? extends T> mVar, @m80.k q30.m<? extends R> other) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return new q30.l(mVar, other, new x00.p() { // from class: q30.a0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Pair T3;
                T3 = k0.T3(obj, obj2);
                return T3;
            }
        });
    }

    public static final Object S0(a1 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.f();
    }

    @m80.k
    public static <T, R> q30.m<R> S1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return X0(new t0(mVar, transform));
    }

    @m80.k
    public static <T> q30.m<T> S2(@m80.k q30.m<? extends T> mVar, T t11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return x.n(x.C(mVar, x.B(t11)));
    }

    @m80.k
    public static final <T, R, V> q30.m<V> S3(@m80.k q30.m<? extends T> mVar, @m80.k q30.m<? extends R> other, @m80.k x00.p<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return new q30.l(mVar, other, transform);
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C T0(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int i11 = 0;
        for (T t11 : mVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            if (predicate.invoke(Integer.valueOf(i11), t11).booleanValue()) {
                destination.add(t11);
            }
            i11 = i12;
        }
        return destination;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C T1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    @m80.k
    public static <T> q30.m<T> T2(@m80.k q30.m<? extends T> mVar, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return x.n(x.C(mVar, elements));
    }

    public static final Pair T3(Object obj, Object obj2) {
        return h1.a(obj, obj2);
    }

    public static final /* synthetic */ <R> q30.m<R> U0(q30.m<?> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.w();
        q30.m<R> P0 = P0(mVar, b.f81535a);
        kotlin.jvm.internal.g0.n(P0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return P0;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C U1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @m80.k
    public static final <T> q30.m<T> U2(@m80.k q30.m<? extends T> mVar, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return R2(mVar, a00.q.t(elements));
    }

    @y0(version = "1.2")
    @m80.k
    public static final <T> q30.m<Pair<T, T>> U3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return V3(mVar, new x00.p() { // from class: q30.e0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Pair W3;
                W3 = k0.W3(obj, obj2);
                return W3;
            }
        });
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C V0(q30.m<?> mVar, C destination) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (Object obj : mVar) {
            kotlin.jvm.internal.g0.y(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @m80.l
    @y0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T V1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @o00.f
    public static final <T> q30.m<T> V2(q30.m<? extends T> mVar, T t11) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return S2(mVar, t11);
    }

    @y0(version = "1.2")
    @m80.k
    public static final <T, R> q30.m<R> V3(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super T, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return q30.q.b(new r(mVar, transform, null));
    }

    @m80.k
    public static <T> q30.m<T> W0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return new q30.h(mVar, false, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @w00.j(name = "maxByOrThrow")
    @y0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T W1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    public static final <S, T extends S> S W2(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final Pair W3(Object obj, Object obj2) {
        return h1.a(obj, obj2);
    }

    @m80.k
    public static <T> q30.m<T> X0(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        q30.m<T> W0 = W0(mVar, new x00.l() { // from class: q30.g0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean Y0;
                Y0 = k0.Y0(obj);
                return Boolean.valueOf(Y0);
            }
        });
        kotlin.jvm.internal.g0.n(W0, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return W0;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> double X1(q30.m<? extends T> mVar, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return doubleValue;
    }

    public static final <S, T extends S> S X2(@m80.k q30.m<? extends T> mVar, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        int i11 = 1;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            next = operation.invoke(Integer.valueOf(i11), next, it.next());
            i11 = i12;
        }
        return next;
    }

    public static final boolean Y0(Object obj) {
        return obj == null;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> float Y1(q30.m<? extends T> mVar, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(it.next()).floatValue());
        }
        return floatValue;
    }

    @m80.l
    @y0(version = "1.4")
    public static final <S, T extends S> S Y2(@m80.k q30.m<? extends T> mVar, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i11 = 1;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            next = operation.invoke(Integer.valueOf(i11), next, it.next());
            i11 = i12;
        }
        return next;
    }

    @m80.k
    public static final <C extends Collection<? super T>, T> C Z0(@m80.k q30.m<? extends T> mVar, @m80.k C destination) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        for (T t11 : mVar) {
            if (t11 != null) {
                destination.add(t11);
            }
        }
        return destination;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R Z1(q30.m<? extends T> mVar, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @m80.l
    @y0(version = "1.4")
    public static final <S, T extends S> S Z2(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C a1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : mVar) {
            if (!predicate.invoke(t11).booleanValue()) {
                destination.add(t11);
            }
        }
        return destination;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R a2(q30.m<? extends T> mVar, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @m80.k
    public static final <T> q30.m<T> a3(@m80.k final q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return N1(mVar, new x00.l() { // from class: q30.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object b32;
                b32 = k0.b3(m.this, obj);
                return b32;
            }
        });
    }

    @m80.k
    public static final <T, C extends Collection<? super T>> C b1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                destination.add(t11);
            }
        }
        return destination;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Double b2(q30.m<? extends T> mVar, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public static final Object b3(q30.m mVar, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("null element found in " + mVar + '.');
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @o00.f
    public static final <T> T c1(q30.m<? extends T> mVar, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Float c2(q30.m<? extends T> mVar, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T, R> q30.m<R> c3(@m80.k q30.m<? extends T> mVar, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        return q30.q.b(new l(r11, mVar, operation, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @o00.f
    public static final <T> T d1(q30.m<? extends T> mVar, x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        for (T t12 : mVar) {
            if (predicate.invoke(t12).booleanValue()) {
                t11 = t12;
            }
        }
        return t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R d2(q30.m<? extends T> mVar, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T, R> q30.m<R> d3(@m80.k q30.m<? extends T> mVar, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        return q30.q.b(new m(r11, mVar, operation, null));
    }

    public static final <T> T e1(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R e2(q30.m<? extends T> mVar, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @y0(version = "1.4")
    @m80.k
    public static final <S, T extends S> q30.m<S> e3(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        return q30.q.b(new n(mVar, operation, null));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T f1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @m80.l
    @y0(version = "1.4")
    public static final <T extends Comparable<? super T>> T f2(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @y0(version = "1.4")
    @m80.k
    public static final <S, T extends S> q30.m<S> f3(@m80.k q30.m<? extends T> mVar, @m80.k x00.q<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        return q30.q.b(new o(mVar, operation, null));
    }

    @y0(version = "1.5")
    @o00.f
    public static final <T, R> R g1(q30.m<? extends T> mVar, x00.l<? super T, ? extends R> transform) {
        R r11;
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                r11 = null;
                break;
            }
            r11 = transform.invoke(it.next());
            if (r11 != null) {
                break;
            }
        }
        if (r11 != null) {
            return r11;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @m80.l
    @y0(version = "1.4")
    public static final Double g2(@m80.k q30.m<Double> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T, R> q30.m<R> g3(@m80.k q30.m<? extends T> mVar, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        return c3(mVar, r11, operation);
    }

    @y0(version = "1.5")
    @o00.f
    public static final <T, R> R h1(q30.m<? extends T> mVar, x00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Float h2(@m80.k q30.m<Float> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T, R> q30.m<R> h3(@m80.k q30.m<? extends T> mVar, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        return d3(mVar, r11, operation);
    }

    public static final <T> boolean i0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @m80.l
    public static <T> T i1(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @w00.j(name = "maxOrThrow")
    @y0(version = "1.7")
    public static final double i2(@m80.k q30.m<Double> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    public static final <T> T i3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    public static final <T> boolean j0(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @m80.l
    public static final <T> T j1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (T t11 : mVar) {
            if (predicate.invoke(t11).booleanValue()) {
                return t11;
            }
        }
        return null;
    }

    @w00.j(name = "maxOrThrow")
    @y0(version = "1.7")
    public static final float j2(@m80.k q30.m<Float> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T j3(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        T t11 = null;
        boolean z11 = false;
        for (T t12 : mVar) {
            if (predicate.invoke(t12).booleanValue()) {
                if (z11) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> boolean k0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @m80.k
    public static <T, R> q30.m<R> k1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return new q30.i(mVar, transform, d.f81537a);
    }

    @w00.j(name = "maxOrThrow")
    @y0(version = "1.7")
    @m80.k
    public static final <T extends Comparable<? super T>> T k2(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @m80.l
    public static final <T> T k3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @m80.k
    public static <T> Iterable<T> l0(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return new a(mVar);
    }

    @w00.j(name = "flatMapIndexedIterable")
    @y0(version = "1.4")
    @m80.k
    @yz.p0
    public static final <T, R> q30.m<R> l1(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return x.m(mVar, transform, e.f81538a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    @y0(version = "1.4")
    public static final <T> T l2(@m80.k q30.m<? extends T> mVar, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    @m80.l
    public static final <T> T l3(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        boolean z11 = false;
        T t11 = null;
        for (T t12 : mVar) {
            if (predicate.invoke(t12).booleanValue()) {
                if (z11) {
                    return null;
                }
                z11 = true;
                t11 = t12;
            }
        }
        if (z11) {
            return t11;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <T> q30.m<T> m0(q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return mVar;
    }

    @w00.j(name = "flatMapIndexedIterableTo")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R, C extends Collection<? super R>> C m1(q30.m<? extends T> mVar, C destination, x00.p<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : mVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            a00.m0.s0(destination, transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.j(name = "maxWithOrThrow")
    @y0(version = "1.7")
    public static final <T> T m2(@m80.k q30.m<? extends T> mVar, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    @m80.k
    public static final <T extends Comparable<? super T>> q30.m<T> m3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return new p(mVar);
    }

    @m80.k
    public static final <T, K, V> Map<K, V> n0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    @w00.j(name = "flatMapIndexedSequence")
    @y0(version = "1.4")
    @m80.k
    @yz.p0
    public static final <T, R> q30.m<R> n1(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super Integer, ? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return x.m(mVar, transform, f.f81539a);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @m80.l
    @y0(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T n2(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @m80.k
    public static final <T, R extends Comparable<? super R>> q30.m<T> n3(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return q3(mVar, new g.a(selector));
    }

    @m80.k
    public static final <T, K> Map<K, T> o0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t11 : mVar) {
            linkedHashMap.put(keySelector.invoke(t11), t11);
        }
        return linkedHashMap;
    }

    @w00.j(name = "flatMapIndexedSequenceTo")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T, R, C extends Collection<? super R>> C o1(q30.m<? extends T> mVar, C destination, x00.p<? super Integer, ? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        int i11 = 0;
        for (T t11 : mVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            a00.m0.t0(destination, transform.invoke(Integer.valueOf(i11), t11));
            i11 = i12;
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @w00.j(name = "minByOrThrow")
    @y0(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T o2(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @m80.k
    public static final <T, R extends Comparable<? super R>> q30.m<T> o3(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return q3(mVar, new g.c(selector));
    }

    @m80.k
    public static final <T, K, V> Map<K, V> p0(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t11 : mVar) {
            linkedHashMap.put(keySelector.invoke(t11), valueTransform.invoke(t11));
        }
        return linkedHashMap;
    }

    @w00.j(name = "flatMapIterable")
    @y0(version = "1.4")
    @m80.k
    @yz.p0
    public static <T, R> q30.m<R> p1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return new q30.i(mVar, transform, c.f81536a);
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> double p2(q30.m<? extends T> mVar, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return doubleValue;
    }

    @m80.k
    public static final <T extends Comparable<? super T>> q30.m<T> p3(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return q3(mVar, e00.g.x());
    }

    @m80.k
    public static final <T, K, M extends Map<? super K, ? super T>> M q0(@m80.k q30.m<? extends T> mVar, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (T t11 : mVar) {
            destination.put(keySelector.invoke(t11), t11);
        }
        return destination;
    }

    @w00.j(name = "flatMapIterableTo")
    @y0(version = "1.4")
    @m80.k
    @yz.p0
    public static final <T, R, C extends Collection<? super R>> C q1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            a00.m0.s0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> float q2(q30.m<? extends T> mVar, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(it.next()).floatValue());
        }
        return floatValue;
    }

    @m80.k
    public static <T> q30.m<T> q3(@m80.k q30.m<? extends T> mVar, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return new q(mVar, comparator);
    }

    @m80.k
    public static final <T, K, V, M extends Map<? super K, ? super V>> M r0(@m80.k q30.m<? extends T> mVar, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (T t11 : mVar) {
            destination.put(keySelector.invoke(t11), valueTransform.invoke(t11));
        }
        return destination;
    }

    @m80.k
    public static final <T, R, C extends Collection<? super R>> C r1(@m80.k q30.m<? extends T> mVar, @m80.k C destination, @m80.k x00.l<? super T, ? extends q30.m<? extends R>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            a00.m0.t0(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R r2(q30.m<? extends T> mVar, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final <T> int r3(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Integer> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += selector.invoke(it.next()).intValue();
        }
        return i11;
    }

    @m80.k
    public static final <T, K, V, M extends Map<? super K, ? super V>> M s0(@m80.k q30.m<? extends T> mVar, @m80.k M destination, @m80.k x00.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <T, R> R s1(@m80.k q30.m<? extends T> mVar, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            r11 = operation.invoke(r11, it.next());
        }
        return r11;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R extends Comparable<? super R>> R s2(q30.m<? extends T> mVar, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = selector.invoke(it.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @yz.n(message = "Use sumOf instead.", replaceWith = @yz.w0(expression = "this.sumOf(selector)", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final <T> double s3(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            d11 += selector.invoke(it.next()).doubleValue();
        }
        return d11;
    }

    @y0(version = "1.3")
    @m80.k
    public static final <K, V> Map<K, V> t0(@m80.k q30.m<? extends K> mVar, @m80.k x00.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k11 : mVar) {
            linkedHashMap.put(k11, valueSelector.invoke(k11));
        }
        return linkedHashMap;
    }

    public static final <T, R> R t1(@m80.k q30.m<? extends T> mVar, R r11, @m80.k x00.q<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        int i11 = 0;
        for (T t11 : mVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            r11 = operation.invoke(Integer.valueOf(i11), r11, t11);
            i11 = i12;
        }
        return r11;
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Double t2(q30.m<? extends T> mVar, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "sumOfByte")
    public static final int t3(@m80.k q30.m<Byte> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().byteValue();
        }
        return i11;
    }

    @y0(version = "1.3")
    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M u0(@m80.k q30.m<? extends K> mVar, @m80.k M destination, @m80.k x00.l<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(valueSelector, "valueSelector");
        for (K k11 : mVar) {
            destination.put(k11, valueSelector.invoke(k11));
        }
        return destination;
    }

    public static final <T> void u1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, g2> action) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T> Float u2(q30.m<? extends T> mVar, x00.l<? super T, Float> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "sumOfDouble")
    public static final double u3(@m80.k q30.m<Double> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            d11 += it.next().doubleValue();
        }
        return d11;
    }

    @w00.j(name = "averageOfByte")
    public static final double v0(@m80.k q30.m<Byte> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().byteValue();
            i11++;
            if (i11 < 0) {
                a00.h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    public static final <T> void v1(@m80.k q30.m<? extends T> mVar, @m80.k x00.p<? super Integer, ? super T, g2> action) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(action, "action");
        int i11 = 0;
        for (T t11 : mVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            action.invoke(Integer.valueOf(i11), t11);
            i11 = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R v2(q30.m<? extends T> mVar, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "sumOfDouble")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> double v3(q30.m<? extends T> mVar, x00.l<? super T, Double> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            d11 += selector.invoke(it.next()).doubleValue();
        }
        return d11;
    }

    @w00.j(name = "averageOfDouble")
    public static final double w0(@m80.k q30.m<Double> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().doubleValue();
            i11++;
            if (i11 < 0) {
                a00.h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @m80.k
    public static final <T, K> Map<K, List<T>> w1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t11 : mVar) {
            K invoke = keySelector.invoke(t11);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(t11);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.4")
    @o00.f
    @yz.p0
    public static final <T, R> R w2(q30.m<? extends T> mVar, Comparator<? super R> comparator, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @w00.j(name = "sumOfFloat")
    public static final float w3(@m80.k q30.m<Float> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        float f11 = 0.0f;
        while (it.hasNext()) {
            f11 += it.next().floatValue();
        }
        return f11;
    }

    @w00.j(name = "averageOfFloat")
    public static final double x0(@m80.k q30.m<Float> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().floatValue();
            i11++;
            if (i11 < 0) {
                a00.h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @m80.k
    public static final <T, K, V> Map<K, List<V>> x1(@m80.k q30.m<? extends T> mVar, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t11 : mVar) {
            K invoke = keySelector.invoke(t11);
            List<V> list = linkedHashMap.get(invoke);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(invoke, list);
            }
            list.add(valueTransform.invoke(t11));
        }
        return linkedHashMap;
    }

    @m80.l
    @y0(version = "1.4")
    public static final <T extends Comparable<? super T>> T x2(@m80.k q30.m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @w00.j(name = "sumOfInt")
    public static final int x3(@m80.k q30.m<Integer> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().intValue();
        }
        return i11;
    }

    @w00.j(name = "averageOfInt")
    public static final double y0(@m80.k q30.m<Integer> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().intValue();
            i11++;
            if (i11 < 0) {
                a00.h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    @m80.k
    public static final <T, K, M extends Map<? super K, List<T>>> M y1(@m80.k q30.m<? extends T> mVar, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        for (T t11 : mVar) {
            K invoke = keySelector.invoke(t11);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(t11);
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Double y2(@m80.k q30.m<Double> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @w00.j(name = "sumOfInt")
    @y0(version = "1.4")
    @o00.f
    public static final <T> int y3(q30.m<? extends T> mVar, x00.l<? super T, Integer> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += selector.invoke(it.next()).intValue();
        }
        return i11;
    }

    @w00.j(name = "averageOfLong")
    public static final double z0(@m80.k q30.m<Long> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += it.next().longValue();
            i11++;
            if (i11 < 0) {
                a00.h0.a0();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T, K, V, M extends Map<? super K, List<V>>> M z1(@m80.k q30.m<? extends T> mVar, @m80.k M destination, @m80.k x00.l<? super T, ? extends K> keySelector, @m80.k x00.l<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        kotlin.jvm.internal.g0.p(valueTransform, "valueTransform");
        for (T t11 : mVar) {
            K invoke = keySelector.invoke(t11);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(t11));
        }
        return destination;
    }

    @m80.l
    @y0(version = "1.4")
    public static final Float z2(@m80.k q30.m<Float> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @w00.j(name = "sumOfLong")
    public static final long z3(@m80.k q30.m<Long> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += it.next().longValue();
        }
        return j11;
    }

    public static final Object H0(Object obj) {
        return obj;
    }
}
