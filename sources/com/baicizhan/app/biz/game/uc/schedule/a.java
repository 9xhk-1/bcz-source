package com.baicizhan.app.biz.game.uc.schedule;

import c4.o;
import c40.r0;
import c40.s0;
import c40.x2;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.l;
import oa0.r;
import p8.s;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nChangeScheduleUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ChangeScheduleUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,68:1\n6#2:69\n64#3,2:70\n66#3:73\n67#3,2:79\n6#4:72\n124#5,4:74\n142#6:78\n*S KotlinDebug\n*F\n+ 1 ChangeScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ChangeScheduleUC\n*L\n33#1:69\n33#1:70,2\n33#1:73\n33#1:79,2\n33#1:72\n33#1:74,4\n33#1:78\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f15012a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f15013b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f15014c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final o5.a f15015d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final s6.e f15016e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.user.a f15017f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final h6.b f15018g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.ChangeScheduleUC", f = "ChangeScheduleUC.kt", i = {0, 0, 1, 1, 2, 2}, l = {57, 58, 59}, m = "changeScheduleGroup", n = {"userPlanInfo", "newBookId", "userPlanInfo", "newBookId", "userPlanInfo", "newBookId"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"}, v = 1)
    /* renamed from: com.baicizhan.app.biz.game.uc.schedule.a$a, reason: collision with other inner class name */
    public static final class C0219a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15019a;

        /* renamed from: b, reason: collision with root package name */
        public long f15020b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15021c;

        /* renamed from: e, reason: collision with root package name */
        public int f15023e;

        public C0219a(j00.c<? super C0219a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15021c = obj;
            this.f15023e |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.ChangeScheduleUC$invoke$2", f = "ChangeScheduleUC.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15024a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f15026c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f15027d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.ChangeScheduleUC$invoke$2$1", f = "ChangeScheduleUC.kt", i = {1, 2, 2, 3, 3, 4, 4, 5, 5}, l = {40, 41, 44, 45, 46, 48}, m = "invokeSuspend", n = {"userPlanInfo", "userPlanInfo", "curBookId", "userPlanInfo", "curBookId", "userPlanInfo", "curBookId", "userPlanInfo", "curBookId"}, s = {"L$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0"}, v = 1)
        /* renamed from: com.baicizhan.app.biz.game.uc.schedule.a$b$a, reason: collision with other inner class name */
        public static final class C0220a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f15028a;

            /* renamed from: b, reason: collision with root package name */
            public long f15029b;

            /* renamed from: c, reason: collision with root package name */
            public int f15030c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f15031d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f15032e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f15033f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0220a(a aVar, long j11, int i11, j00.c<? super C0220a> cVar) {
                super(2, cVar);
                this.f15031d = aVar;
                this.f15032e = j11;
                this.f15033f = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0220a(this.f15031d, this.f15032e, this.f15033f, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0220a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x00ee, code lost:
            
                if (r14.a(r4, r13) == r0) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
            
                if (r14.f(r3, r13) != r0) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0103, code lost:
            
                if (r14.f(r1, r13) == r0) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
            
                if (r14 == r0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
            
                if (r14 == r0) goto L13;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.a.b.C0220a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, int i11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f15026c = j11;
            this.f15027d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new b(this.f15026c, this.f15027d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15024a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlin.coroutines.d plus = o.b().plus(x2.f8011a);
                C0220a c0220a = new C0220a(a.this, this.f15026c, this.f15027d, null);
                this.f15024a = 1;
                if (c40.i.h(plus, c0220a, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f15034a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f15035b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f15036c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: com.baicizhan.app.biz.game.uc.schedule.a$c$a, reason: collision with other inner class name */
        public static final class C0221a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f15037a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f15038b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f15039c;

            public C0221a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f15037a = eVar;
                this.f15038b = cVar;
                this.f15039c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f15037a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f15037a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f15038b.b(this.f15039c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f15034a = dVar;
            this.f15035b = eVar;
            this.f15036c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0221a(this.f15035b, this.f15036c, this.f15034a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f15034a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public a(@m80.k p thriftService, @m80.k c6.b userGameInfoRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameScheduleRepo, @m80.k o5.a versionProvider, @m80.k s6.e reconcileCurBookUC, @m80.k com.baicizhan.app.biz.game.uc.user.a changeLocalBookIdUC, @m80.k h6.b updateGameRoundUC) {
        g0.p(thriftService, "thriftService");
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        g0.p(gameScheduleRepo, "gameScheduleRepo");
        g0.p(versionProvider, "versionProvider");
        g0.p(reconcileCurBookUC, "reconcileCurBookUC");
        g0.p(changeLocalBookIdUC, "changeLocalBookIdUC");
        g0.p(updateGameRoundUC, "updateGameRoundUC");
        this.f15012a = thriftService;
        this.f15013b = userGameInfoRepo;
        this.f15014c = gameScheduleRepo;
        this.f15015d = versionProvider;
        this.f15016e = reconcileCurBookUC;
        this.f15017f = changeLocalBookIdUC;
        this.f15018g = updateGameRoundUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(p8.e1 r9, j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.baicizhan.app.biz.game.uc.schedule.a.C0219a
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.app.biz.game.uc.schedule.a$a r0 = (com.baicizhan.app.biz.game.uc.schedule.a.C0219a) r0
            int r1 = r0.f15023e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f15023e = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.baicizhan.app.biz.game.uc.schedule.a$a r0 = new com.baicizhan.app.biz.game.uc.schedule.a$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.f15021c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.f15023e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L53
            if (r1 == r4) goto L49
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L37
            long r0 = r7.f15020b
            java.lang.Object r9 = r7.f15019a
            p8.e1 r9 = (p8.e1) r9
            kotlin.e.n(r10)
            goto L95
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            long r3 = r7.f15020b
            java.lang.Object r9 = r7.f15019a
            p8.e1 r9 = (p8.e1) r9
            kotlin.e.n(r10)
            goto L7f
        L49:
            long r4 = r7.f15020b
            java.lang.Object r9 = r7.f15019a
            p8.e1 r9 = (p8.e1) r9
            kotlin.e.n(r10)
            goto L6b
        L53:
            kotlin.e.n(r10)
            p8.c1 r10 = r9.f79780a
            int r10 = r10.f79718a
            long r5 = (long) r10
            com.baicizhan.app.biz.game.repo.book.b r10 = r8.f15014c
            r7.f15019a = r9
            r7.f15020b = r5
            r7.f15023e = r4
            java.lang.Object r10 = r10.d(r9, r7)
            if (r10 != r0) goto L6a
            goto L93
        L6a:
            r4 = r5
        L6b:
            h6.b r10 = r8.f15018g
            p8.b0 r1 = r9.f79781b
            java.util.List<p8.h0> r1 = r1.f79681d
            r7.f15019a = r9
            r7.f15020b = r4
            r7.f15023e = r3
            java.lang.Object r10 = r10.a(r4, r1, r7)
            if (r10 != r0) goto L7e
            goto L93
        L7e:
            r3 = r4
        L7f:
            o5.a r1 = r8.f15015d
            r10 = r2
            r2 = r3
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r4 = com.baicizhan.app.biz.game.repo.gameversion.ResourceId.BookSchedule
            long r5 = r9.f79782c
            r7.f15019a = r9
            r7.f15020b = r2
            r7.f15023e = r10
            java.lang.Object r10 = r1.b(r2, r4, r5, r7)
            if (r10 != r0) goto L94
        L93:
            return r0
        L94:
            r0 = r2
        L95:
            z6.b r2 = z6.b.f101032b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "changeScheduleGroup success newBookId:"
            r10.append(r3)
            r10.append(r0)
            java.lang.String r0 = " , "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            r6 = 4
            r7 = 0
            java.lang.String r3 = "ChangeScheduleUC"
            r5 = 0
            z6.b.j(r2, r3, r4, r5, r6, r7)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.a.f(p8.e1, j00.c):java.lang.Object");
    }

    public final s g() {
        return (s) w7.f.b(new c(o0.d(s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @l
    public final Object h(long j11, int i11, @m80.k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, com.baicizhan.app.biz.game.uc.schedule.b.f15040a, "change schedule bookId:" + j11 + ", group:" + i11, null, 4, null);
        Object g11 = s0.g(new b(j11, i11, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
