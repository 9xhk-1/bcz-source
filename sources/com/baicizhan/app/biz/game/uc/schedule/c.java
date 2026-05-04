package com.baicizhan.app.biz.game.uc.schedule;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.l;
import oa0.r;
import y7.d;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nDeleteScheduleUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/DeleteScheduleUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,25:1\n6#2:26\n64#3,2:27\n66#3:30\n67#3,2:36\n6#4:29\n124#5,4:31\n142#6:35\n*S KotlinDebug\n*F\n+ 1 DeleteScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/DeleteScheduleUC\n*L\n17#1:26\n17#1:27,2\n17#1:30\n17#1:36,2\n17#1:29\n17#1:31,4\n17#1:35\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f15041a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.e f15042b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l5.c f15043c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.DeleteScheduleUC", f = "DeleteScheduleUC.kt", i = {0, 1, 2, 3}, l = {20, 21, 22, 23}, m = "invoke", n = {"bookId", "bookId", "bookId", "bookId"}, s = {"J$0", "J$0", "J$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f15044a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15045b;

        /* renamed from: d, reason: collision with root package name */
        public int f15047d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15045b = obj;
            this.f15047d |= Integer.MIN_VALUE;
            return c.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f15048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f15049b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f15050c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f15051a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f15052b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f15053c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f15051a = eVar;
                this.f15052b = cVar;
                this.f15053c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f15051a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f15051a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f15052b.b(this.f15053c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f15048a = dVar;
            this.f15049b = eVar;
            this.f15050c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f15049b, this.f15050c, this.f15048a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f15048a);
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

    public c(@m80.k p thriftService, @m80.k z5.e dailyReviewRepo, @m80.k l5.c cakeStudyRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(dailyReviewRepo, "dailyReviewRepo");
        g0.p(cakeStudyRepo, "cakeStudyRepo");
        this.f15041a = thriftService;
        this.f15042b = dailyReviewRepo;
        this.f15043c = cakeStudyRepo;
    }

    public final b2 a() {
        return (b2) w7.f.b(new b(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (c40.a1.b(500, r6) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r12.b(r10, -1, r6) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (a().P1((int) r10, r6) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, @m80.k j00.c<? super yz.g2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.baicizhan.app.biz.game.uc.schedule.c.a
            if (r0 == 0) goto L14
            r0 = r12
            com.baicizhan.app.biz.game.uc.schedule.c$a r0 = (com.baicizhan.app.biz.game.uc.schedule.c.a) r0
            int r1 = r0.f15047d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f15047d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.baicizhan.app.biz.game.uc.schedule.c$a r0 = new com.baicizhan.app.biz.game.uc.schedule.c$a
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f15045b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f15047d
            r7 = 4
            r8 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L48
            if (r1 == r2) goto L42
            if (r1 == r8) goto L3c
            if (r1 != r7) goto L34
            kotlin.e.n(r12)
            goto L8f
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            long r10 = r6.f15044a
            kotlin.e.n(r12)
            goto L82
        L42:
            long r10 = r6.f15044a
            kotlin.e.n(r12)
            goto L74
        L48:
            long r10 = r6.f15044a
            kotlin.e.n(r12)
            goto L61
        L4e:
            kotlin.e.n(r12)
            z8.b2 r12 = r9.a()
            int r1 = (int) r10
            r6.f15044a = r10
            r6.f15047d = r3
            java.lang.Object r12 = r12.P1(r1, r6)
            if (r12 != r0) goto L61
            goto L8e
        L61:
            z5.e r1 = r9.f15042b
            long r4 = w3.g.l()
            r6.f15044a = r10
            r6.f15047d = r2
            r2 = r10
            java.lang.Object r10 = r1.b(r2, r4, r6)
            if (r10 != r0) goto L73
            goto L8e
        L73:
            r10 = r2
        L74:
            l5.c r12 = r9.f15043c
            r6.f15044a = r10
            r6.f15047d = r8
            r1 = -1
            java.lang.Object r12 = r12.b(r10, r1, r6)
            if (r12 != r0) goto L82
            goto L8e
        L82:
            r6.f15044a = r10
            r6.f15047d = r7
            r10 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = c40.a1.b(r10, r6)
            if (r10 != r0) goto L8f
        L8e:
            return r0
        L8f:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.c.b(long, j00.c):java.lang.Object");
    }
}
