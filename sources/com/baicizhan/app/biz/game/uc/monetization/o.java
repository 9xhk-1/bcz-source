package com.baicizhan.app.biz.game.uc.monetization;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a6.a f14988a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final s5.a f14989b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.TrackPromotionPopupTriggerUC", f = "TrackPromotionPopupTriggerUC.kt", i = {0, 1, 1}, l = {16, 18}, m = "invoke", n = {"today", "today", "count"}, s = {"J$0", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14990a;

        /* renamed from: b, reason: collision with root package name */
        public int f14991b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14992c;

        /* renamed from: e, reason: collision with root package name */
        public int f14994e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14992c = obj;
            this.f14994e |= Integer.MIN_VALUE;
            return o.this.a(this);
        }
    }

    public o(@m80.k a6.a studyRoundStatsRepo, @m80.k s5.a promotionPopupRepo) {
        g0.p(studyRoundStatsRepo, "studyRoundStatsRepo");
        g0.p(promotionPopupRepo, "promotionPopupRepo");
        this.f14988a = studyRoundStatsRepo;
        this.f14989b = promotionPopupRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r5.f(r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.monetization.o.a
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.monetization.o$a r0 = (com.baicizhan.app.biz.game.uc.monetization.o.a) r0
            int r1 = r0.f14994e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14994e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.monetization.o$a r0 = new com.baicizhan.app.biz.game.uc.monetization.o$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14992c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14994e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            long r2 = r0.f14990a
            kotlin.e.n(r8)
            goto L4f
        L3a:
            kotlin.e.n(r8)
            long r5 = w3.g.l()
            a6.a r8 = r7.f14988a
            r0.f14990a = r5
            r0.f14994e = r3
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L4e
            goto L6b
        L4e:
            r2 = r5
        L4f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 == 0) goto L5d
            if (r8 < r4) goto L5a
            goto L5d
        L5a:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        L5d:
            s5.a r5 = r7.f14989b
            r0.f14990a = r2
            r0.f14991b = r8
            r0.f14994e = r4
            java.lang.Object r8 = r5.f(r2, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.o.a(j00.c):java.lang.Object");
    }
}
