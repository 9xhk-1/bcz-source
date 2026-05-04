package com.baicizhan.app.biz.game.uc.incentive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.b f14595a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.MarkRankPopupShownUC", f = "MarkRankPopupShownUC.kt", i = {0, 1}, l = {14, 15}, m = "invoke", n = {"model", "model"}, s = {"L$0", "L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14596a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14597b;

        /* renamed from: d, reason: collision with root package name */
        public int f14599d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14597b = obj;
            this.f14599d |= Integer.MIN_VALUE;
            return k.this.a(null, this);
        }
    }

    public k(@m80.k p5.b rankPopupRepo) {
        g0.p(rankPopupRepo, "rankPopupRepo");
        this.f14595a = rankPopupRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r9.d(r2, r4, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r9.a(r5, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k h5.a0 r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.baicizhan.app.biz.game.uc.incentive.k.a
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.app.biz.game.uc.incentive.k$a r0 = (com.baicizhan.app.biz.game.uc.incentive.k.a) r0
            int r1 = r0.f14599d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14599d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.k$a r0 = new com.baicizhan.app.biz.game.uc.incentive.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14597b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14599d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f14596a
            h5.a0 r8 = (h5.a0) r8
            kotlin.e.n(r9)
            goto L6d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f14596a
            h5.a0 r8 = (h5.a0) r8
            kotlin.e.n(r9)
            goto L54
        L40:
            kotlin.e.n(r9)
            p5.b r9 = r7.f14595a
            long r5 = w3.g.l()
            r0.f14596a = r8
            r0.f14599d = r4
            java.lang.Object r9 = r9.a(r5, r0)
            if (r9 != r1) goto L54
            goto L6c
        L54:
            p5.b r9 = r7.f14595a
            z8.s r2 = r8.l()
            long r4 = r8.i()
            java.lang.Object r8 = l00.k.a(r8)
            r0.f14596a = r8
            r0.f14599d = r3
            java.lang.Object r8 = r9.d(r2, r4, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.k.a(h5.a0, j00.c):java.lang.Object");
    }

    @m80.l
    public final Object b(@m80.k j00.c<? super g2> cVar) {
        Object a11 = this.f14595a.a(w3.g.l(), cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }
}
