package a7;

import java.util.Comparator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {a7.c.class})
@u0({"SMAP\nILookUpHistoryRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ILookUpHistoryRepo.kt\ncom/baicizhan/app/biz/lookup/LookUpHistoryRepo\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,93:1\n58#2,6:94\n147#3:100\n147#3:106\n1056#4:101\n1563#4:102\n1634#4,3:103\n774#4:107\n865#4,2:108\n1021#4,2:110\n113#5:112\n*S KotlinDebug\n*F\n+ 1 ILookUpHistoryRepo.kt\ncom/baicizhan/app/biz/lookup/LookUpHistoryRepo\n*L\n27#1:94,6\n36#1:100\n49#1:106\n36#1:101\n39#1:102\n39#1:103,3\n52#1:107\n52#1:108,2\n62#1:110,2\n64#1:112\n*E\n"})
/* loaded from: classes3.dex */
public final class g implements a7.c, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k50.a f2042b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f2043c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ILookUpHistoryRepo.kt\ncom/baicizhan/app/biz/lookup/LookUpHistoryRepo\n*L\n1#1,328:1\n62#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((a7.e) t12).h()), Integer.valueOf(((a7.e) t11).h()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.lookup.LookUpHistoryRepo", f = "ILookUpHistoryRepo.kt", i = {0, 1, 1, 1, 1}, l = {45, 64}, m = "addLookUpHistory", n = {"word", "word", "history", "newHistory", "newHistoryStore"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f2044a;

        /* renamed from: b, reason: collision with root package name */
        public Object f2045b;

        /* renamed from: c, reason: collision with root package name */
        public Object f2046c;

        /* renamed from: d, reason: collision with root package name */
        public Object f2047d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f2048e;

        /* renamed from: g, reason: collision with root package name */
        public int f2050g;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f2048e = obj;
            this.f2050g |= Integer.MIN_VALUE;
            return g.this.y(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.lookup.LookUpHistoryRepo", f = "ILookUpHistoryRepo.kt", i = {}, l = {32}, m = "getLookUpHistory", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f2051a;

        /* renamed from: c, reason: collision with root package name */
        public int f2053c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f2051a = obj;
            this.f2053c |= Integer.MIN_VALUE;
            return g.this.z(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ILookUpHistoryRepo.kt\ncom/baicizhan/app/biz/lookup/LookUpHistoryRepo\n*L\n1#1,328:1\n37#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((a7.e) t11).h()), Integer.valueOf(((a7.e) t12).h()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class e implements x00.a<com.baicizhan.app.preferences.g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f2054a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f2055b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f2056c;

        public e(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f2054a = aVar;
            this.f2055b = aVar2;
            this.f2056c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.baicizhan.app.preferences.g, java.lang.Object] */
        @Override // x00.a
        public final com.baicizhan.app.preferences.g invoke() {
            pa0.a aVar = this.f2054a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), this.f2055b, this.f2056c);
        }
    }

    public g(@m80.k k50.a json) {
        g0.p(json, "json");
        this.f2042b = json;
        this.f2043c = e0.b(jb0.c.f64013a.b(), new e(this, null, new x00.a() { // from class: a7.f
            @Override // x00.a
            public final Object invoke() {
                ya0.a c11;
                c11 = g.c();
                return c11;
            }
        }));
    }

    private final com.baicizhan.app.preferences.g b() {
        return (com.baicizhan.app.preferences.g) this.f2043c.getValue();
    }

    public static final ya0.a c() {
        return ya0.b.d(a7.d.f2033a);
    }

    @Override // a7.c
    @m80.l
    public Object l(@m80.k j00.c<? super g2> cVar) {
        Object a11 = b().a(cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013d, code lost:
    
        if (r9.k(a7.d.f2034b, r10, r2) != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r1 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // a7.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(@m80.k k3.q1 r19, @m80.k j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.g.y(k3.q1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // a7.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(@m80.k j00.c<? super java.util.List<k3.q1>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a7.g.c
            if (r0 == 0) goto L13
            r0 = r5
            a7.g$c r0 = (a7.g.c) r0
            int r1 = r0.f2053c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2053c = r1
            goto L18
        L13:
            a7.g$c r0 = new a7.g$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2051a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f2053c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            com.baicizhan.app.preferences.g r5 = r4.b()
            r0.f2053c = r3
            java.lang.String r2 = "look_up_history_key"
            java.lang.String r3 = ""
            java.lang.Object r5 = r5.j(r2, r3, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.length()
            if (r0 != 0) goto L52
            java.util.List r5 = a00.h0.J()
            return r5
        L52:
            k50.a r0 = r4.f2042b
            r0.getSerializersModule()
            a7.p$b r1 = a7.p.Companion
            f50.i r1 = r1.serializer()
            f50.e r1 = (f50.e) r1
            java.lang.Object r5 = r0.c(r1, r5)
            a7.p r5 = (a7.p) r5
            java.util.List r5 = r5.g()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            a7.g$d r0 = new a7.g$d
            r0.<init>()
            java.util.List r5 = a00.r0.z5(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = a00.i0.d0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L85:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r5.next()
            a7.e r1 = (a7.e) r1
            k3.q1 r1 = a7.d.a(r1)
            r0.add(r1)
            goto L85
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.g.z(j00.c):java.lang.Object");
    }
}
