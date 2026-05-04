package k5;

import c4.j;
import com.microsoft.thrifty.service.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import l7.i0;
import l7.p;
import m80.k;
import n40.g;
import oa0.r;
import ws.i;
import x00.l;
import y7.d;
import y7.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {k5.a.class})
@u0({"SMAP\nTopAdvertisementRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAdvertisementRepo.kt\ncom/baicizhan/app/biz/game/repo/advertisement/TopAdvertisementRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,108:1\n6#2:109\n64#3,2:110\n66#3:113\n67#3,2:119\n6#4:112\n124#5,4:114\n142#6:118\n116#7,11:121\n*S KotlinDebug\n*F\n+ 1 TopAdvertisementRepo.kt\ncom/baicizhan/app/biz/game/repo/advertisement/TopAdvertisementRepoImpl\n*L\n40#1:109\n40#1:110,2\n40#1:113\n40#1:119,2\n40#1:112\n40#1:114,4\n40#1:118\n82#1:121,11\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements k5.a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f65868g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f65869h = "top_ad_scope";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f65870i = "TopAd_ClosedDate";

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final String f65871j = "TopAd_MemberPopupShowDate";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f65872a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f65873b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f65874c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n40.a f65875d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<Long, g8.r> f65876e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final x<Boolean> f65877f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    /* renamed from: k5.b$b, reason: collision with other inner class name */
    public static final class C0757b implements l<w7.d<g8.c>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f65878a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f65879b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f65880c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: k5.b$b$a */
        public static final class a implements l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f65881a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f65882b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f65883c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f65881a = eVar;
                this.f65882b = cVar;
                this.f65883c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f65881a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f65881a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f65882b.b(this.f65883c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public C0757b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f65878a = dVar;
            this.f65879b = eVar;
            this.f65880c = cVar;
        }

        public final void a(w7.d<g8.c> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            f.a(thriftBuilder, new a(this.f65879b, this.f65880c, this.f65878a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f65878a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<g8.c> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.advertisement.TopAdvertisementRepoImpl", f = "TopAdvertisementRepo.kt", i = {0, 1, 1, 1, 1, 2, 2}, l = {81, 114, 85}, m = "sync", n = {"userId", "ad", "$this$withLock_u24default$iv", "userId", "$i$f$withLock", "ad", "userId"}, s = {"J$0", "L$0", "L$1", "J$0", "I$0", "L$0", "J$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f65884a;

        /* renamed from: b, reason: collision with root package name */
        public Object f65885b;

        /* renamed from: c, reason: collision with root package name */
        public Object f65886c;

        /* renamed from: d, reason: collision with root package name */
        public int f65887d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f65888e;

        /* renamed from: g, reason: collision with root package name */
        public int f65890g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f65888e = obj;
            this.f65890g |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.advertisement.TopAdvertisementRepoImpl", f = "TopAdvertisementRepo.kt", i = {0, 1, 1, 2, 2}, l = {71, 75, 76}, m = "updateClosedDate", n = {"date", "date", "last", "date", "last"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f65891a;

        /* renamed from: b, reason: collision with root package name */
        public long f65892b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f65893c;

        /* renamed from: e, reason: collision with root package name */
        public int f65895e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f65893c = obj;
            this.f65895e |= Integer.MIN_VALUE;
            return b.this.f(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.advertisement.TopAdvertisementRepoImpl", f = "TopAdvertisementRepo.kt", i = {0, 1, 1, 2, 2}, l = {94, 98, 99}, m = "updateMemberSaleShowDate", n = {"date", "date", "last", "date", "last"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f65896a;

        /* renamed from: b, reason: collision with root package name */
        public long f65897b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f65898c;

        /* renamed from: e, reason: collision with root package name */
        public int f65900e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f65898c = obj;
            this.f65900e |= Integer.MIN_VALUE;
            return b.this.b(0L, this);
        }
    }

    public b(@k p thrift, @k com.baicizhan.app.biz.auth.r tokenProvider, @k com.baicizhan.app.preferences.a factory) {
        g0.p(thrift, "thrift");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(factory, "factory");
        this.f65872a = thrift;
        this.f65873b = tokenProvider;
        this.f65874c = factory;
        this.f65875d = g.b(false, 1, null);
        this.f65876e = new LinkedHashMap();
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.FALSE);
        this.f65877f = a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r11.emit(r2, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof k5.b.c
            if (r0 == 0) goto L13
            r0 = r11
            k5.b$c r0 = (k5.b.c) r0
            int r1 = r0.f65890g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65890g = r1
            goto L18
        L13:
            k5.b$c r0 = new k5.b$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f65888e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f65890g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f65885b
            g8.r r0 = (g8.r) r0
            kotlin.e.n(r11)
            goto Lad
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            long r7 = r0.f65884a
            java.lang.Object r2 = r0.f65886c
            n40.a r2 = (n40.a) r2
            java.lang.Object r4 = r0.f65885b
            g8.r r4 = (g8.r) r4
            kotlin.e.n(r11)
            goto L86
        L4b:
            long r7 = r0.f65884a
            kotlin.e.n(r11)
            goto L6f
        L51:
            kotlin.e.n(r11)
            com.baicizhan.app.biz.auth.r r11 = r10.f65873b
            java.lang.Long r11 = r11.b()
            if (r11 == 0) goto Lb5
            long r7 = r11.longValue()
            g8.c r11 = r10.i()
            r0.f65884a = r7
            r0.f65890g = r5
            java.lang.Object r11 = r11.r(r0)
            if (r11 != r1) goto L6f
            goto Lac
        L6f:
            g8.r r11 = (g8.r) r11
            n40.a r2 = r10.f65875d
            r0.f65885b = r11
            r0.f65886c = r2
            r0.f65884a = r7
            r9 = 0
            r0.f65887d = r9
            r0.f65890g = r4
            java.lang.Object r4 = r2.lock(r6, r0)
            if (r4 != r1) goto L85
            goto Lac
        L85:
            r4 = r11
        L86:
            java.util.Map<java.lang.Long, g8.r> r11 = r10.f65876e     // Catch: java.lang.Throwable -> Lb0
            java.lang.Long r9 = l00.a.g(r7)     // Catch: java.lang.Throwable -> Lb0
            r11.put(r9, r4)     // Catch: java.lang.Throwable -> Lb0
            yz.g2 r11 = yz.g2.f100423a     // Catch: java.lang.Throwable -> Lb0
            r2.unlock(r6)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r11 = r10.f65877f
            java.lang.Boolean r2 = l00.a.a(r5)
            java.lang.Object r4 = l00.k.a(r4)
            r0.f65885b = r4
            r0.f65886c = r6
            r0.f65884a = r7
            r0.f65890g = r3
            java.lang.Object r11 = r11.emit(r2, r0)
            if (r11 != r1) goto Lad
        Lac:
            return r1
        Lad:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        Lb0:
            r11 = move-exception
            r2.unlock(r6)
            throw r11
        Lb5:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r13.emit(r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r11, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof k5.b.e
            if (r0 == 0) goto L13
            r0 = r13
            k5.b$e r0 = (k5.b.e) r0
            int r1 = r0.f65900e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65900e = r1
            goto L18
        L13:
            k5.b$e r0 = new k5.b$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f65898c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f65900e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r13)
            goto L89
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r11 = r0.f65897b
            long r6 = r0.f65896a
            kotlin.e.n(r13)
            goto L76
        L3f:
            long r11 = r0.f65896a
            kotlin.e.n(r13)
            goto L53
        L45:
            kotlin.e.n(r13)
            r0.f65896a = r11
            r0.f65900e = r5
            java.lang.Object r13 = r10.c(r0)
            if (r13 != r1) goto L53
            goto L88
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r6 = r13.longValue()
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 != 0) goto L60
            yz.g2 r11 = yz.g2.f100423a
            return r11
        L60:
            com.baicizhan.app.preferences.g r13 = r10.h()
            r0.f65896a = r11
            r0.f65897b = r6
            r0.f65900e = r4
            java.lang.String r2 = "TopAd_MemberPopupShowDate"
            java.lang.Object r13 = r13.i(r2, r11, r0)
            if (r13 != r1) goto L73
            goto L88
        L73:
            r8 = r6
            r6 = r11
            r11 = r8
        L76:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r13 = r10.f65877f
            java.lang.Boolean r2 = l00.a.a(r5)
            r0.f65896a = r6
            r0.f65897b = r11
            r0.f65900e = r3
            java.lang.Object r11 = r13.emit(r2, r0)
            if (r11 != r1) goto L89
        L88:
            return r1
        L89:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.b(long, j00.c):java.lang.Object");
    }

    @Override // k5.a
    @m80.l
    public Object c(@k j00.c<? super Long> cVar) {
        return h().h(f65871j, 0L, cVar);
    }

    @Override // k5.a
    @k
    public kotlinx.coroutines.flow.i<Boolean> d() {
        return this.f65877f;
    }

    @Override // k5.a
    @m80.l
    public Object e(@k j00.c<? super Long> cVar) {
        return h().h(f65870i, 0L, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r13.emit(r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(long r11, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof k5.b.d
            if (r0 == 0) goto L13
            r0 = r13
            k5.b$d r0 = (k5.b.d) r0
            int r1 = r0.f65895e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65895e = r1
            goto L18
        L13:
            k5.b$d r0 = new k5.b$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f65893c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f65895e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r13)
            goto L89
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r11 = r0.f65892b
            long r6 = r0.f65891a
            kotlin.e.n(r13)
            goto L76
        L3f:
            long r11 = r0.f65891a
            kotlin.e.n(r13)
            goto L53
        L45:
            kotlin.e.n(r13)
            r0.f65891a = r11
            r0.f65895e = r5
            java.lang.Object r13 = r10.e(r0)
            if (r13 != r1) goto L53
            goto L88
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r6 = r13.longValue()
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 != 0) goto L60
            yz.g2 r11 = yz.g2.f100423a
            return r11
        L60:
            com.baicizhan.app.preferences.g r13 = r10.h()
            r0.f65891a = r11
            r0.f65892b = r6
            r0.f65895e = r4
            java.lang.String r2 = "TopAd_ClosedDate"
            java.lang.Object r13 = r13.i(r2, r11, r0)
            if (r13 != r1) goto L73
            goto L88
        L73:
            r8 = r6
            r6 = r11
            r11 = r8
        L76:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r13 = r10.f65877f
            java.lang.Boolean r2 = l00.a.a(r5)
            r0.f65891a = r6
            r0.f65892b = r11
            r0.f65895e = r3
            java.lang.Object r11 = r13.emit(r2, r0)
            if (r11 != r1) goto L89
        L88:
            return r1
        L89:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.f(long, j00.c):java.lang.Object");
    }

    @Override // k5.a
    @m80.l
    public Object g(@k j00.c<? super g8.r> cVar) {
        Long b11 = this.f65873b.b();
        if (b11 == null) {
            return null;
        }
        return this.f65876e.get(l00.a.g(b11.longValue()));
    }

    public final com.baicizhan.app.preferences.g h() {
        Long b11 = this.f65873b.b();
        return this.f65874c.a("top_ad_scope-" + b11);
    }

    public final g8.c i() {
        return (g8.c) w7.f.b(new C0757b(o0.d(g8.c.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
