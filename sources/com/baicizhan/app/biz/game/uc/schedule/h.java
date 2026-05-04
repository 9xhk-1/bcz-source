package com.baicizhan.app.biz.game.uc.schedule;

import c4.o;
import c40.r0;
import c40.x2;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import r6.u;
import x00.l;
import y7.d;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nResetScheduleUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ResetScheduleUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,69:1\n6#2:70\n64#3,2:71\n66#3:74\n67#3,2:80\n6#4:73\n124#5,4:75\n142#6:79\n*S KotlinDebug\n*F\n+ 1 ResetScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ResetScheduleUC\n*L\n32#1:70\n32#1:71,2\n32#1:74\n32#1:80,2\n32#1:73\n32#1:75,4\n32#1:79\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f15088a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.g f15089b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f15090c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f15091d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final u f15092e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final z5.e f15093f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final l5.c f15094g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final o5.a f15095h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.ResetScheduleUC$invoke$2", f = "ResetScheduleUC.kt", i = {5, 5, 5, 5, 5, 5, 6, 7, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 11, 11, 11, 11, 11}, l = {37, 38, 39, 40, 41, 43, 45, 46, 49, 54, 56, 61}, m = "invokeSuspend", n = {"rounds", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-ResetScheduleUC$invoke$2$1", "rounds", "rounds", "rounds", "$this$invokeSuspend_u24lambda_u241", "$i$a$-apply-ResetScheduleUC$invoke$2$2", "rounds", "$this$invokeSuspend_u24lambda_u241", "it", "$i$a$-apply-ResetScheduleUC$invoke$2$2", "$i$a$-also-ResetScheduleUC$invoke$2$2$1", "rounds", "$this$invokeSuspend_u24lambda_u241", "$i$a$-apply-ResetScheduleUC$invoke$2$2", "rounds", "$this$invokeSuspend_u24lambda_u241", "it", "$i$a$-apply-ResetScheduleUC$invoke$2$2", "$i$a$-also-ResetScheduleUC$invoke$2$2$2"}, s = {"L$0", "L$1", "L$4", "L$5", "I$0", "I$1", "L$0", "L$0", "L$0", "L$2", "I$0", "L$0", "L$2", "L$4", "I$0", "I$1", "L$0", "L$2", "I$0", "L$0", "L$2", "L$4", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nResetScheduleUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ResetScheduleUC$invoke$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1869#2,2:70\n*S KotlinDebug\n*F\n+ 1 ResetScheduleUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ResetScheduleUC$invoke$2\n*L\n42#1:70,2\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15096a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15097b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15098c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15099d;

        /* renamed from: e, reason: collision with root package name */
        public Object f15100e;

        /* renamed from: f, reason: collision with root package name */
        public Object f15101f;

        /* renamed from: g, reason: collision with root package name */
        public int f15102g;

        /* renamed from: h, reason: collision with root package name */
        public int f15103h;

        /* renamed from: i, reason: collision with root package name */
        public long f15104i;

        /* renamed from: j, reason: collision with root package name */
        public int f15105j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f15106k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f15107l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, h hVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f15106k = j11;
            this.f15107l = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f15106k, this.f15107l, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0338, code lost:
        
            if (r8.b(r1, r3, r12, r22) == r7) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x02c3, code lost:
        
            if (r10 != r7) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x01ca, code lost:
        
            if (r1.b(r2, -1, r22) == r7) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0142, code lost:
        
            if (r0 == r7) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
        
            if (r0.b(r1, r22) == r7) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
        
            if (r0.c(r1, 0, r4, r22) == r7) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
        
            if (r0.b(0, r22) == r7) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
        
            if (r0.F5(r1, r22) == r7) goto L61;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0192 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 872
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f15108a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f15109b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f15110c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f15111a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f15112b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f15113c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f15111a = eVar;
                this.f15112b = cVar;
                this.f15113c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f15111a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f15111a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f15112b.b(this.f15113c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f15108a = dVar;
            this.f15109b = eVar;
            this.f15110c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f15109b, this.f15110c, this.f15108a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f15108a);
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

    public h(@m80.k p thriftService, @m80.k z5.g studyRecordRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameScheduleRepo, @m80.k com.baicizhan.app.biz.game.repo.gameround.e roundRepo, @m80.k u fetchVersionInfoUC, @m80.k z5.e dailyReviewRepo, @m80.k l5.c cakeStudyRepo, @m80.k o5.a versionProvider) {
        g0.p(thriftService, "thriftService");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(gameScheduleRepo, "gameScheduleRepo");
        g0.p(roundRepo, "roundRepo");
        g0.p(fetchVersionInfoUC, "fetchVersionInfoUC");
        g0.p(dailyReviewRepo, "dailyReviewRepo");
        g0.p(cakeStudyRepo, "cakeStudyRepo");
        g0.p(versionProvider, "versionProvider");
        this.f15088a = thriftService;
        this.f15089b = studyRecordRepo;
        this.f15090c = gameScheduleRepo;
        this.f15091d = roundRepo;
        this.f15092e = fetchVersionInfoUC;
        this.f15093f = dailyReviewRepo;
        this.f15094g = cakeStudyRepo;
        this.f15095h = versionProvider;
    }

    public final b2 i() {
        return (b2) w7.f.b(new b(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @m80.l
    public final Object j(long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b().plus(x2.f8011a), new a(j11, this, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
