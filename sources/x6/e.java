package x6;

import c4.j;
import com.baicizhan.app.biz.auth.n;
import com.baicizhan.app.biz.auth.p;
import com.baicizhan.app.biz.base.cache.CacheStrategy;
import com.microsoft.thrifty.service.a;
import k3.c4;
import k3.d4;
import k3.g1;
import k3.h2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import kotlinx.datetime.q;
import l7.i0;
import m80.k;
import oa0.r;
import r40.t2;
import t3.a0;
import t3.e;
import t3.g;
import t3.n;
import t3.z;
import w30.b;
import ws.i;
import x00.l;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;
import z8.b2;
import z8.i2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {g1.class})
@u0({"SMAP\nIncentiveService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncentiveService.kt\ncom/baicizhan/app/biz/incentive/IncentiveServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n6#2:141\n64#3,2:142\n66#3:145\n67#3,2:151\n6#4:144\n124#5,4:146\n142#6:150\n12#7,3:153\n15#7,10:169\n12#8,2:156\n14#8,10:159\n1#9:158\n*S KotlinDebug\n*F\n+ 1 IncentiveService.kt\ncom/baicizhan/app/biz/incentive/IncentiveServiceImpl\n*L\n45#1:141\n45#1:142,2\n45#1:145\n45#1:151,2\n45#1:144\n45#1:146,4\n45#1:150\n-1#1:153,3\n-1#1:169,10\n-1#1:156,2\n-1#1:159,10\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements g1, j, p {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l7.p f97573b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y<h2> f97574c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m0<h2> f97575d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f97576e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.incentive.IncentiveServiceImpl$cache$2$1$1", f = "IncentiveService.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements l<j00.c<? super i2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f97577a;

        public a(j00.c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return e.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super i2> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f97577a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b2 k11 = e.this.k();
            int c11 = f.c(b.C1273b.f94770b.a().toEpochMilliseconds());
            this.f97577a = 1;
            Object g32 = k11.g3(c11, this);
            return g32 == l11 ? l11 : g32;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.incentive.IncentiveServiceImpl", f = "IncentiveService.kt", i = {}, l = {105, 106}, m = "onLogout", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f97579a;

        /* renamed from: c, reason: collision with root package name */
        public int f97581c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f97579a = obj;
            this.f97581c |= Integer.MIN_VALUE;
            return e.this.A2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.incentive.IncentiveServiceImpl", f = "IncentiveService.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {66, 67}, m = "refreshWinningTasksRank", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-IncentiveServiceImpl$refreshWinningTasksRank$2", "$i$f$bizCatch", "$i$a$-bizCatch-IncentiveServiceImpl$refreshWinningTasksRank$2$1", "tag$iv", "winning", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-IncentiveServiceImpl$refreshWinningTasksRank$2", "$i$f$bizCatch", "$i$a$-bizCatch-IncentiveServiceImpl$refreshWinningTasksRank$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f97582a;

        /* renamed from: b, reason: collision with root package name */
        public Object f97583b;

        /* renamed from: c, reason: collision with root package name */
        public int f97584c;

        /* renamed from: d, reason: collision with root package name */
        public int f97585d;

        /* renamed from: e, reason: collision with root package name */
        public int f97586e;

        /* renamed from: f, reason: collision with root package name */
        public int f97587f;

        /* renamed from: g, reason: collision with root package name */
        public long f97588g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f97589h;

        /* renamed from: j, reason: collision with root package name */
        public int f97591j;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f97589h = obj;
            this.f97591j |= Integer.MIN_VALUE;
            return e.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class d implements l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f97592a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f97593b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f97594c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f97595a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f97596b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f97597c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f97595a = eVar;
                this.f97596b = cVar;
                this.f97597c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f97595a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f97595a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f97596b.b(this.f97597c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f97592a = dVar;
            this.f97593b = eVar;
            this.f97594c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f97593b, this.f97594c, this.f97592a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f97592a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public e(@k l7.p thriftService, @k final com.baicizhan.app.preferences.a factory, @k n logoutHub) {
        h2 h2Var;
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        g0.p(logoutHub, "logoutHub");
        this.f97573b = thriftService;
        h2Var = f.f97598a;
        y<h2> a11 = o0.a(h2Var);
        this.f97574c = a11;
        this.f97575d = a11;
        logoutHub.b(this);
        this.f97576e = e0.c(new x00.a() { // from class: x6.c
            @Override // x00.a
            public final Object invoke() {
                g f11;
                f11 = e.f(com.baicizhan.app.preferences.a.this, this);
                return f11;
            }
        });
    }

    public static final g f(final com.baicizhan.app.preferences.a aVar, final e eVar) {
        return a0.a(new l() { // from class: x6.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = e.g(com.baicizhan.app.preferences.a.this, eVar, (t3.b) obj);
                return g11;
            }
        });
    }

    public static final g2 g(com.baicizhan.app.preferences.a aVar, e eVar, t3.b cache) {
        g0.p(cache, "$this$cache");
        cache.f(f.f97599b);
        cache.g(CacheStrategy.NETWORK_FIRST);
        cache.i(n.c.f89276a);
        cache.h(new e.c(aVar, new z.b(i2.f101628g)));
        cache.j(eVar.new a(null));
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b2 k() {
        return (b2) w7.f.b(new d(kotlin.jvm.internal.o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r6.c(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.biz.auth.p
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A2(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof x6.e.b
            if (r0 == 0) goto L13
            r0 = r6
            x6.e$b r0 = (x6.e.b) r0
            int r1 = r0.f97581c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97581c = r1
            goto L18
        L13:
            x6.e$b r0 = new x6.e$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f97579a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f97581c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L48
        L38:
            kotlin.e.n(r6)
            t3.g r6 = r5.j()
            r0.f97581c = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            kotlinx.coroutines.flow.y<k3.h2> r6 = r5.f97574c
            k3.h2 r2 = x6.f.a()
            r0.f97581c = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.e.A2(j00.c):java.lang.Object");
    }

    @Override // k3.g1
    @k
    public m0<h2> a() {
        return this.f97575d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016d A[Catch: all -> 0x0185, TryCatch #1 {all -> 0x0185, blocks: (B:22:0x0166, B:24:0x016d, B:26:0x0171, B:28:0x0175, B:30:0x0179, B:32:0x017d, B:43:0x01e3, B:34:0x0187, B:36:0x0192, B:38:0x01a6, B:40:0x01ba, B:42:0x01cf), top: B:21:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cf A[Catch: all -> 0x0185, TryCatch #1 {all -> 0x0185, blocks: (B:22:0x0166, B:24:0x016d, B:26:0x0171, B:28:0x0175, B:30:0x0179, B:32:0x017d, B:43:0x01e3, B:34:0x0187, B:36:0x0192, B:38:0x01a6, B:40:0x01ba, B:42:0x01cf), top: B:21:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f A[Catch: all -> 0x00bc, TryCatch #2 {all -> 0x00bc, blocks: (B:58:0x0093, B:60:0x009f, B:64:0x00a9, B:66:0x00b1, B:67:0x00c9, B:68:0x00da, B:70:0x00de, B:74:0x00e8, B:75:0x0103, B:82:0x00f9, B:83:0x00bf, B:85:0x00d0), top: B:57:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de A[Catch: all -> 0x00bc, TryCatch #2 {all -> 0x00bc, blocks: (B:58:0x0093, B:60:0x009f, B:64:0x00a9, B:66:0x00b1, B:67:0x00c9, B:68:0x00da, B:70:0x00de, B:74:0x00e8, B:75:0x0103, B:82:0x00f9, B:83:0x00bf, B:85:0x00d0), top: B:57:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0064  */
    @Override // k3.g1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.e.b(j00.c):java.lang.Object");
    }

    public final c4 i(i2 i2Var) {
        if (i2Var.f101629a != 1) {
            return new c4.a(0, 1, null);
        }
        int i11 = i2Var.f101630b;
        Integer num = i2Var.f101631c;
        int intValue = num != null ? num.intValue() : 0;
        b.C1273b c1273b = b.C1273b.f94770b;
        return new c4.b(i11, intValue >= f.c(c1273b.a().toEpochMilliseconds()) ? new d4.b(0, 1, null) : (intValue >= f.c(c1273b.a().toEpochMilliseconds()) || t2.i(c1273b.a(), q.Companion.a()).getHour() < 22) ? new d4.a(0, 1, null) : new d4.c(0, 1, null), x6.a.f97565a);
    }

    public final g<i2> j() {
        return (g) this.f97576e.getValue();
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
