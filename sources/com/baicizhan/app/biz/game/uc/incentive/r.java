package com.baicizhan.app.biz.game.uc.incentive;

import com.baicizhan.app.biz.game.model.RankType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.c f14632a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k f14633b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14634a;

        static {
            int[] iArr = new int[RankType.values().length];
            try {
                iArr[RankType.Up.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RankType.Down.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RankType.Hint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14634a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.SetRankReadTimeUC", f = "SetRankReadTimeUC.kt", i = {0}, l = {30}, m = "calculateTimeValueForRankType", n = {"rankType"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14635a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14636b;

        /* renamed from: d, reason: collision with root package name */
        public int f14638d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14636b = obj;
            this.f14638d |= Integer.MIN_VALUE;
            return r.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.SetRankReadTimeUC", f = "SetRankReadTimeUC.kt", i = {0, 1, 1, 2, 2}, l = {17, 18, 19}, m = "invoke", n = {"rankType", "rankType", "timeValue", "rankType", "timeValue"}, s = {"L$0", "L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14639a;

        /* renamed from: b, reason: collision with root package name */
        public long f14640b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14641c;

        /* renamed from: e, reason: collision with root package name */
        public int f14643e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14641c = obj;
            this.f14643e |= Integer.MIN_VALUE;
            return r.this.c(null, this);
        }
    }

    public r(@m80.k p5.c rankRepo, @m80.k k markRankPopupShownUC) {
        g0.p(rankRepo, "rankRepo");
        g0.p(markRankPopupShownUC, "markRankPopupShownUC");
        this.f14632a = rankRepo;
        this.f14633b = markRankPopupShownUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.baicizhan.app.biz.game.model.RankType r5, j00.c<? super java.lang.Long> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.game.uc.incentive.r.b
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.game.uc.incentive.r$b r0 = (com.baicizhan.app.biz.game.uc.incentive.r.b) r0
            int r1 = r0.f14638d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14638d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.r$b r0 = new com.baicizhan.app.biz.game.uc.incentive.r$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14636b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14638d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f14635a
            com.baicizhan.app.biz.game.model.RankType r5 = (com.baicizhan.app.biz.game.model.RankType) r5
            kotlin.e.n(r6)
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            int[] r6 = com.baicizhan.app.biz.game.uc.incentive.r.a.f14634a
            int r2 = r5.ordinal()
            r6 = r6[r2]
            if (r6 == r3) goto L6d
            r2 = 2
            if (r6 == r2) goto L6d
            r2 = 3
            if (r6 == r2) goto L4d
            long r5 = w3.g.l()
            goto L71
        L4d:
            p5.c r6 = r4.f14632a
            java.lang.Object r5 = l00.k.a(r5)
            r0.f14635a = r5
            r0.f14638d = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            z8.t r6 = (z8.t) r6
            java.lang.Integer r5 = r6.f102031c
            if (r5 == 0) goto L6a
            int r5 = r5.intValue()
            long r5 = (long) r5
            goto L71
        L6a:
            r5 = 0
            goto L71
        L6d:
            long r5 = w3.g.l()
        L71:
            java.lang.Long r5 = l00.a.g(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.r.b(com.baicizhan.app.biz.game.model.RankType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k com.baicizhan.app.biz.game.model.RankType r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.baicizhan.app.biz.game.uc.incentive.r.c
            if (r0 == 0) goto L13
            r0 = r11
            com.baicizhan.app.biz.game.uc.incentive.r$c r0 = (com.baicizhan.app.biz.game.uc.incentive.r.c) r0
            int r1 = r0.f14643e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14643e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.r$c r0 = new com.baicizhan.app.biz.game.uc.incentive.r$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f14641c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14643e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            long r1 = r0.f14640b
            java.lang.Object r10 = r0.f14639a
            com.baicizhan.app.biz.game.model.RankType r10 = (com.baicizhan.app.biz.game.model.RankType) r10
            kotlin.e.n(r11)
            goto L83
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            long r4 = r0.f14640b
            java.lang.Object r10 = r0.f14639a
            com.baicizhan.app.biz.game.model.RankType r10 = (com.baicizhan.app.biz.game.model.RankType) r10
            kotlin.e.n(r11)
            goto L73
        L47:
            java.lang.Object r10 = r0.f14639a
            com.baicizhan.app.biz.game.model.RankType r10 = (com.baicizhan.app.biz.game.model.RankType) r10
            kotlin.e.n(r11)
            goto L5d
        L4f:
            kotlin.e.n(r11)
            r0.f14639a = r10
            r0.f14643e = r5
            java.lang.Object r11 = r9.b(r10, r0)
            if (r11 != r1) goto L5d
            goto L81
        L5d:
            java.lang.Number r11 = (java.lang.Number) r11
            long r5 = r11.longValue()
            com.baicizhan.app.biz.game.uc.incentive.k r11 = r9.f14633b
            r0.f14639a = r10
            r0.f14640b = r5
            r0.f14643e = r4
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L72
            goto L81
        L72:
            r4 = r5
        L73:
            p5.c r11 = r9.f14632a
            r0.f14639a = r10
            r0.f14640b = r4
            r0.f14643e = r3
            java.lang.Object r11 = r11.c(r10, r4, r0)
            if (r11 != r1) goto L82
        L81:
            return r1
        L82:
            r1 = r4
        L83:
            z6.b r3 = z6.b.f101032b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "setRankReadTime: rankType="
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = ", timeValue="
            r11.append(r10)
            r11.append(r1)
            java.lang.String r5 = r11.toString()
            r7 = 4
            r8 = 0
            java.lang.String r4 = "SetRankReadTimeUC"
            r6 = 0
            z6.b.j(r3, r4, r5, r6, r7, r8)
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.r.c(com.baicizhan.app.biz.game.model.RankType, j00.c):java.lang.Object");
    }
}
