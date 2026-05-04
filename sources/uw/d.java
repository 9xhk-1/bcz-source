package uw;

import ix.t2;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/CachingCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,196:1\n168#2,3:197\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/CachingCacheStorage\n*L\n47#1:197,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements uw.b {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final uw.b f92438b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final zy.d<t2, Set<uw.c>> f92439c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0}, l = {43}, m = "find", n = {"this", "url", "varyKeys"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92440a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92441b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92442c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92443d;

        /* renamed from: e, reason: collision with root package name */
        public Object f92444e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f92445f;

        /* renamed from: h, reason: collision with root package name */
        public int f92447h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92445f = obj;
            this.f92447h |= Integer.MIN_VALUE;
            return d.this.c(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {53}, m = "findAll", n = {"this", "url"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92448a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92449b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92450c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92451d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f92452e;

        /* renamed from: g, reason: collision with root package name */
        public int f92454g;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92452e = obj;
            this.f92454g |= Integer.MIN_VALUE;
            return d.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {37, 38}, m = "store", n = {"this", "url"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92455a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92456b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f92457c;

        /* renamed from: e, reason: collision with root package name */
        public int f92459e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92457c = obj;
            this.f92459e |= Integer.MIN_VALUE;
            return d.this.b(null, null, this);
        }
    }

    public d(@m80.k uw.b delegate) {
        g0.p(delegate, "delegate");
        this.f92438b = delegate;
        this.f92439c = new zy.d<>(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // uw.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k ix.t2 r5, @m80.k j00.c<? super java.util.Set<uw.c>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof uw.d.b
            if (r0 == 0) goto L13
            r0 = r6
            uw.d$b r0 = (uw.d.b) r0
            int r1 = r0.f92454g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92454g = r1
            goto L18
        L13:
            uw.d$b r0 = new uw.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f92452e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92454g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f92451d
            ix.t2 r5 = (ix.t2) r5
            java.lang.Object r1 = r0.f92450c
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r0.f92449b
            ix.t2 r2 = (ix.t2) r2
            java.lang.Object r0 = r0.f92448a
            uw.d r0 = (uw.d) r0
            kotlin.e.n(r6)
            goto L65
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.e.n(r6)
            zy.d<ix.t2, java.util.Set<uw.c>> r6 = r4.f92439c
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L6a
            zy.d<ix.t2, java.util.Set<uw.c>> r6 = r4.f92439c
            uw.b r2 = r4.f92438b
            r0.f92448a = r4
            r0.f92449b = r5
            r0.f92450c = r6
            r0.f92451d = r5
            r0.f92454g = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L61
            return r1
        L61:
            r2 = r5
            r1 = r6
            r6 = r0
            r0 = r4
        L65:
            r1.put(r5, r6)
            r5 = r2
            goto L6b
        L6a:
            r0 = r4
        L6b:
            zy.d<ix.t2, java.util.Set<uw.c>> r6 = r0.f92439c
            java.lang.Object r5 = a00.l1.K(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.d.a(ix.t2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // uw.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k ix.t2 r7, @m80.k uw.c r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof uw.d.c
            if (r0 == 0) goto L13
            r0 = r9
            uw.d$c r0 = (uw.d.c) r0
            int r1 = r0.f92459e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92459e = r1
            goto L18
        L13:
            uw.d$c r0 = new uw.d$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f92457c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92459e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f92456b
            ix.t2 r7 = (ix.t2) r7
            java.lang.Object r8 = r0.f92455a
            java.util.Map r8 = (java.util.Map) r8
            kotlin.e.n(r9)
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f92456b
            ix.t2 r7 = (ix.t2) r7
            java.lang.Object r8 = r0.f92455a
            uw.d r8 = (uw.d) r8
            kotlin.e.n(r9)
            goto L5b
        L48:
            kotlin.e.n(r9)
            uw.b r9 = r6.f92438b
            r0.f92455a = r6
            r0.f92456b = r7
            r0.f92459e = r4
            java.lang.Object r8 = r9.b(r7, r8, r0)
            if (r8 != r1) goto L5a
            goto L6b
        L5a:
            r8 = r6
        L5b:
            zy.d<ix.t2, java.util.Set<uw.c>> r9 = r8.f92439c
            uw.b r8 = r8.f92438b
            r0.f92455a = r9
            r0.f92456b = r7
            r0.f92459e = r3
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r5 = r9
            r9 = r8
            r8 = r5
        L6f:
            r8.put(r7, r9)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.d.b(ix.t2, uw.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // uw.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k ix.t2 r6, @m80.k java.util.Map<java.lang.String, java.lang.String> r7, @m80.k j00.c<? super uw.c> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof uw.d.a
            if (r0 == 0) goto L13
            r0 = r8
            uw.d$a r0 = (uw.d.a) r0
            int r1 = r0.f92447h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92447h = r1
            goto L18
        L13:
            uw.d$a r0 = new uw.d$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f92445f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92447h
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.f92444e
            ix.t2 r6 = (ix.t2) r6
            java.lang.Object r7 = r0.f92443d
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r1 = r0.f92442c
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r0.f92441b
            ix.t2 r2 = (ix.t2) r2
            java.lang.Object r0 = r0.f92440a
            uw.d r0 = (uw.d) r0
            kotlin.e.n(r8)
            goto L6c
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            kotlin.e.n(r8)
            zy.d<ix.t2, java.util.Set<uw.c>> r8 = r5.f92439c
            boolean r8 = r8.containsKey(r6)
            if (r8 != 0) goto L72
            zy.d<ix.t2, java.util.Set<uw.c>> r8 = r5.f92439c
            uw.b r2 = r5.f92438b
            r0.f92440a = r5
            r0.f92441b = r6
            r0.f92442c = r7
            r0.f92443d = r8
            r0.f92444e = r6
            r0.f92447h = r3
            java.lang.Object r0 = r2.a(r6, r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            r2 = r6
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r5
        L6c:
            r7.put(r6, r8)
            r7 = r1
            r6 = r2
            goto L73
        L72:
            r0 = r5
        L73:
            zy.d<ix.t2, java.util.Set<uw.c>> r8 = r0.f92439c
            java.lang.Object r6 = a00.l1.K(r8, r6)
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L81:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lc5
            java.lang.Object r8 = r6.next()
            r0 = r8
            uw.c r0 = (uw.c) r0
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L95
            return r8
        L95:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L9d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r4 = r0.i()
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = kotlin.jvm.internal.g0.g(r3, r2)
            if (r2 != 0) goto L9d
            goto L81
        Lc4:
            return r8
        Lc5:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.d.c(ix.t2, java.util.Map, j00.c):java.lang.Object");
    }
}
