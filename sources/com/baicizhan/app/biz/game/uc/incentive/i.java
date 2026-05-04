package com.baicizhan.app.biz.game.uc.incentive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nGetStreakTasksMileStoneUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetStreakTasksMileStoneUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/GetStreakTasksMileStoneUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n360#2,7:34\n1#3:41\n*S KotlinDebug\n*F\n+ 1 GetStreakTasksMileStoneUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/GetStreakTasksMileStoneUC\n*L\n18#1:34,7\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.f f14583a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p5.e f14584b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.GetStreakTasksMileStoneUC", f = "GetStreakTasksMileStoneUC.kt", i = {0}, l = {17}, m = "invoke", n = {"millStone"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14585a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14586b;

        /* renamed from: d, reason: collision with root package name */
        public int f14588d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14586b = obj;
            this.f14588d |= Integer.MIN_VALUE;
            return i.this.a(this);
        }
    }

    public i(@m80.k p5.f winningStreakRepo, @m80.k p5.e winningMileRepo) {
        g0.p(winningStreakRepo, "winningStreakRepo");
        g0.p(winningMileRepo, "winningMileRepo");
        this.f14583a = winningStreakRepo;
        this.f14584b = winningMileRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super h5.z0> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.baicizhan.app.biz.game.uc.incentive.i.a
            if (r0 == 0) goto L13
            r0 = r13
            com.baicizhan.app.biz.game.uc.incentive.i$a r0 = (com.baicizhan.app.biz.game.uc.incentive.i.a) r0
            int r1 = r0.f14588d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14588d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.i$a r0 = new com.baicizhan.app.biz.game.uc.incentive.i$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f14586b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14588d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f14585a
            java.util.List r0 = (java.util.List) r0
            kotlin.e.n(r13)
            goto L4e
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            kotlin.e.n(r13)
            p5.e r13 = r12.f14584b
            java.util.List r13 = r13.b()
            p5.f r2 = r12.f14583a
            r0.f14585a = r13
            r0.f14588d = r3
            java.lang.Object r0 = r2.c(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r11 = r0
            r0 = r13
            r13 = r11
        L4e:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L59:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L70
            java.lang.Object r4 = r1.next()
            h5.y0 r4 = (h5.y0) r4
            int r4 = r4.n()
            if (r13 > r4) goto L6d
            goto L71
        L6d:
            int r2 = r2 + 1
            goto L59
        L70:
            r2 = r5
        L71:
            if (r2 == r5) goto L93
            java.lang.Object r1 = r0.get(r2)
            h5.y0 r1 = (h5.y0) r1
            int r2 = r2 + r3
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L83
            r3 = r12
            goto L84
        L83:
            r3 = r4
        L84:
            if (r3 == 0) goto L8d
            java.lang.Object r0 = r0.get(r2)
            r4 = r0
            h5.y0 r4 = (h5.y0) r4
        L8d:
            h5.z0 r0 = new h5.z0
            r0.<init>(r13, r1, r4)
            return r0
        L93:
            com.baicizhan.app.biz.base.BizInternalException r5 = new com.baicizhan.app.biz.base.BizInternalException
            r9 = 6
            r10 = 0
            java.lang.String r6 = "no matching milestone"
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.i.a(j00.c):java.lang.Object");
    }
}
