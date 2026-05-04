package com.baicizhan.app.biz.game.uc.schedule;

import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetAdjustedDailyProgressUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetAdjustedDailyProgressUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ObserveBookAndAdjustedDailyProgressUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,101:1\n49#2:102\n51#2:106\n49#2:107\n51#2:111\n46#3:103\n51#3:105\n46#3:108\n51#3:110\n105#4:104\n105#4:109\n*S KotlinDebug\n*F\n+ 1 GetAdjustedDailyProgressUC.kt\ncom/baicizhan/app/biz/game/uc/schedule/ObserveBookAndAdjustedDailyProgressUC\n*L\n63#1:102\n63#1:106\n66#1:107\n66#1:111\n63#1:103\n63#1:105\n66#1:108\n66#1:110\n63#1:104\n66#1:109\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveBookAndAdjustedDailyProgressUC {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f14995a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z5.g f14996b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f14997c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC", f = "GetAdjustedDailyProgressUC.kt", i = {0, 1, 2}, l = {61, 63, 66}, m = "invoke", n = {"bookId", "bookId", "bookId"}, s = {"J$0", "J$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f15002a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15003b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15004c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15005d;

        /* renamed from: f, reason: collision with root package name */
        public int f15007f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15005d = obj;
            this.f15007f |= Integer.MIN_VALUE;
            return ObserveBookAndAdjustedDailyProgressUC.this.a(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$invoke$4", f = "GetAdjustedDailyProgressUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.r<Pair<? extends h5.j, ? extends Pair<? extends Integer, ? extends Integer>>, Integer, Integer, j00.c<? super Pair<? extends h5.j, ? extends Pair<? extends Integer, ? extends Integer>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15008a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15009b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ int f15010c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ int f15011d;

        public b(j00.c<? super b> cVar) {
            super(4, cVar);
        }

        public final Object i(Pair<h5.j, Pair<Integer, Integer>> pair, int i11, int i12, j00.c<? super Pair<h5.j, Pair<Integer, Integer>>> cVar) {
            b bVar = new b(cVar);
            bVar.f15009b = pair;
            bVar.f15010c = i11;
            bVar.f15011d = i12;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends h5.j, ? extends Pair<? extends Integer, ? extends Integer>> pair, Integer num, Integer num2, j00.c<? super Pair<? extends h5.j, ? extends Pair<? extends Integer, ? extends Integer>>> cVar) {
            return i(pair, num.intValue(), num2.intValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int b11;
            Pair pair = (Pair) this.f15009b;
            int i11 = this.f15010c;
            int i12 = this.f15011d;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15008a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            h5.j jVar = (h5.j) pair.component1();
            Pair pair2 = (Pair) pair.component2();
            int intValue = ((Number) pair2.component1()).intValue();
            b11 = e.b(intValue, ((Number) pair2.component2()).intValue(), i11, i12, jVar.v());
            return new Pair(jVar, new Pair(l00.a.f(intValue), l00.a.f(b11)));
        }
    }

    public ObserveBookAndAdjustedDailyProgressUC(@m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo, @m80.k z5.g studyRecordRepo, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo) {
        g0.p(gameBookRepo, "gameBookRepo");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(roadMapRepo, "roadMapRepo");
        this.f14995a = gameBookRepo;
        this.f14996b = studyRecordRepo;
        this.f14997c = roadMapRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r2 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, @m80.k j00.c<? super kotlinx.coroutines.flow.i<kotlin.Pair<h5.j, kotlin.Pair<java.lang.Integer, java.lang.Integer>>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC.a
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$a r0 = (com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC.a) r0
            int r1 = r0.f15007f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15007f = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$a r0 = new com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15005d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15007f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L52
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r8 = r0.f15004c
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            java.lang.Object r9 = r0.f15003b
            kotlinx.coroutines.flow.i r9 = (kotlinx.coroutines.flow.i) r9
            kotlin.e.n(r10)
            goto L92
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            long r8 = r0.f15002a
            java.lang.Object r2 = r0.f15003b
            kotlinx.coroutines.flow.i r2 = (kotlinx.coroutines.flow.i) r2
            kotlin.e.n(r10)
            r6 = r2
            r2 = r10
            r10 = r6
            goto L73
        L4c:
            long r8 = r0.f15002a
            kotlin.e.n(r10)
            goto L62
        L52:
            kotlin.e.n(r10)
            com.baicizhan.app.biz.game.repo.book.b r10 = r7.f14995a
            r0.f15002a = r8
            r0.f15007f = r5
            java.lang.Object r10 = r10.a(r8, r0)
            if (r10 != r1) goto L62
            goto L8e
        L62:
            kotlinx.coroutines.flow.i r10 = (kotlinx.coroutines.flow.i) r10
            z5.g r2 = r7.f14996b
            r0.f15003b = r10
            r0.f15002a = r8
            r0.f15007f = r4
            java.lang.Object r2 = r2.c(r8, r0)
            if (r2 != r1) goto L73
            goto L8e
        L73:
            kotlinx.coroutines.flow.i r2 = (kotlinx.coroutines.flow.i) r2
            com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$invoke$$inlined$map$1 r4 = new com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$invoke$$inlined$map$1
            r4.<init>()
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.i0(r4)
            com.baicizhan.app.biz.game.repo.roadmap.a r4 = r7.f14997c
            r0.f15003b = r10
            r0.f15004c = r2
            r0.f15002a = r8
            r0.f15007f = r3
            java.lang.Object r8 = r4.b(r8, r0)
            if (r8 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r9 = r10
            r10 = r8
            r8 = r2
        L92:
            kotlinx.coroutines.flow.i r10 = (kotlinx.coroutines.flow.i) r10
            com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$invoke$$inlined$map$2 r0 = new com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$invoke$$inlined$map$2
            r0.<init>()
            kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.k.i0(r0)
            com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$b r0 = new com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC$b
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.H(r9, r8, r10, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC.a(long, j00.c):java.lang.Object");
    }
}
