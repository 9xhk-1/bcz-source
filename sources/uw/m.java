package uw;

import cx.w;
import io.ktor.utils.io.b0;
import ix.f1;
import ix.g1;
import ix.q0;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0}, l = {59}, m = "store", n = {"$this$store", "url"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92536a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92537b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f92538c;

        /* renamed from: d, reason: collision with root package name */
        public int f92539d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92538c = obj;
            this.f92539d |= Integer.MIN_VALUE;
            return m.d(null, null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.HttpCacheStorageKt", f = "HttpCacheStorage.kt", i = {0, 0, 0, 0, 0, 1}, l = {119, 131}, m = "store", n = {"$this$store", "response", "varyKeys", "url", "isShared", "data"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92540a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92541b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92542c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92543d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f92544e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f92545f;

        /* renamed from: g, reason: collision with root package name */
        public int f92546g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92545f = obj;
            this.f92546g |= Integer.MIN_VALUE;
            return m.c(null, null, null, false, this);
        }
    }

    @m80.k
    public static final ex.c a(@m80.k uw.c cVar, @m80.k lw.c client, @m80.k w request, @m80.k kotlin.coroutines.d responseContext) {
        g0.p(cVar, "<this>");
        g0.p(client, "client");
        g0.p(request, "request");
        g0.p(responseContext, "responseContext");
        return new mw.d(client, request, new a(cVar, responseContext), cVar.b()).i();
    }

    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Please use method with `response.varyKeys()` and `isShared` arguments", replaceWith = @w0(expression = "store(response, response.varyKeys(), isShared)", imports = {}))
    public static final Object b(@m80.k uw.b bVar, @m80.k ex.c cVar, @m80.k j00.c<? super uw.c> cVar2) {
        return e(bVar, cVar, tw.e.g(cVar), false, cVar2, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k uw.b r18, @m80.k ex.c r19, @m80.k java.util.Map<java.lang.String, java.lang.String> r20, boolean r21, @m80.k j00.c<? super uw.c> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof uw.m.c
            if (r1 == 0) goto L15
            r1 = r0
            uw.m$c r1 = (uw.m.c) r1
            int r2 = r1.f92546g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f92546g = r2
            goto L1a
        L15:
            uw.m$c r1 = new uw.m$c
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f92545f
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f92546g
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L53
            if (r3 == r4) goto L3a
            if (r3 != r5) goto L32
            java.lang.Object r1 = r1.f92540a
            uw.c r1 = (uw.c) r1
            kotlin.e.n(r0)
            return r1
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            boolean r3 = r1.f92544e
            java.lang.Object r4 = r1.f92543d
            ix.t2 r4 = (ix.t2) r4
            java.lang.Object r6 = r1.f92542c
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r1.f92541b
            ex.c r7 = (ex.c) r7
            java.lang.Object r8 = r1.f92540a
            uw.b r8 = (uw.b) r8
            kotlin.e.n(r0)
            r16 = r6
            r6 = r8
            goto L86
        L53:
            kotlin.e.n(r0)
            mw.a r0 = r19.c()
            cx.w r0 = r0.h()
            ix.t2 r0 = r0.getUrl()
            io.ktor.utils.io.g r3 = r19.b()
            r6 = r18
            r1.f92540a = r6
            r7 = r19
            r1.f92541b = r7
            r8 = r20
            r1.f92542c = r8
            r1.f92543d = r0
            r9 = r21
            r1.f92544e = r9
            r1.f92546g = r4
            java.lang.Object r3 = io.ktor.utils.io.j.G(r3, r1)
            if (r3 != r2) goto L81
            goto Lc6
        L81:
            r4 = r0
            r0 = r3
            r16 = r8
            r3 = r9
        L86:
            y40.c0 r0 = (y40.c0) r0
            byte[] r17 = jz.s.d(r0)
            mw.a r0 = r7.c()
            cx.w r0 = r0.h()
            ix.t2 r9 = r0.getUrl()
            ix.g1 r10 = r7.i()
            bz.b r11 = r7.e()
            ix.q0 r15 = r7.a()
            ix.f1 r13 = r7.l()
            bz.b r12 = r7.h()
            r0 = 0
            bz.b r14 = tw.e.d(r7, r3, r0, r5, r0)
            uw.c r8 = new uw.c
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.f92540a = r8
            r1.f92541b = r0
            r1.f92542c = r0
            r1.f92543d = r0
            r1.f92546g = r5
            java.lang.Object r0 = r6.b(r4, r8, r1)
            if (r0 != r2) goto Lc7
        Lc6:
            return r2
        Lc7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.m.c(uw.b, ex.c, java.util.Map, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k uw.l r4, @m80.k ix.t2 r5, @m80.k ex.c r6, boolean r7, @m80.k j00.c<? super tw.c> r8) {
        /*
            boolean r0 = r8 instanceof uw.m.b
            if (r0 == 0) goto L13
            r0 = r8
            uw.m$b r0 = (uw.m.b) r0
            int r1 = r0.f92539d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92539d = r1
            goto L18
        L13:
            uw.m$b r0 = new uw.m$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f92538c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92539d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f92537b
            r5 = r4
            ix.t2 r5 = (ix.t2) r5
            java.lang.Object r4 = r0.f92536a
            uw.l r4 = (uw.l) r4
            kotlin.e.n(r8)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.e.n(r8)
            r0.f92536a = r4
            r0.f92537b = r5
            r0.f92539d = r3
            java.lang.Object r8 = tw.e.b(r7, r6, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            tw.c r8 = (tw.c) r8
            r4.g(r5, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.m.d(uw.l, ix.t2, ex.c, boolean, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(uw.b bVar, ex.c cVar, Map map, boolean z11, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return c(bVar, cVar, map, z11, cVar2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ex.c {

        /* renamed from: a, reason: collision with root package name */
        public final g1 f92530a;

        /* renamed from: b, reason: collision with root package name */
        public final f1 f92531b;

        /* renamed from: c, reason: collision with root package name */
        public final bz.b f92532c;

        /* renamed from: d, reason: collision with root package name */
        public final bz.b f92533d;

        /* renamed from: e, reason: collision with root package name */
        public final q0 f92534e;

        /* renamed from: f, reason: collision with root package name */
        public final kotlin.coroutines.d f92535f;

        public a(uw.c cVar, kotlin.coroutines.d dVar) {
            this.f92530a = cVar.g();
            this.f92531b = cVar.j();
            this.f92532c = cVar.e();
            this.f92533d = cVar.f();
            this.f92534e = cVar.d();
            this.f92535f = dVar;
        }

        @Override // ix.a1
        public q0 a() {
            return this.f92534e;
        }

        @Override // ex.c
        public io.ktor.utils.io.g b() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // ex.c
        public mw.a c() {
            throw new IllegalStateException("This is a fake response");
        }

        @Override // ex.c
        public bz.b e() {
            return this.f92532c;
        }

        @Override // c40.r0
        public kotlin.coroutines.d getCoroutineContext() {
            return this.f92535f;
        }

        @Override // ex.c
        public bz.b h() {
            return this.f92533d;
        }

        @Override // ex.c
        public g1 i() {
            return this.f92530a;
        }

        @Override // ex.c
        public f1 l() {
            return this.f92531b;
        }

        @b0
        public static /* synthetic */ void d() {
        }
    }
}
