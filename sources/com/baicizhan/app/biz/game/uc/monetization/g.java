package com.baicizhan.app.biz.game.uc.monetization;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import o6.q;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q f14929a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f14930b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final s5.b f14931c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.GetCurrentBookSaleInfoUC", f = "GetCurrentBookSaleInfoUC.kt", i = {1, 2, 2}, l = {19, 20, 24}, m = "invoke", n = {"bookId", "book", "bookId"}, s = {"J$0", "L$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14932a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14933b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14934c;

        /* renamed from: e, reason: collision with root package name */
        public int f14936e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14934c = obj;
            this.f14936e |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    public g(@m80.k q getLegalCurrentBookIdUC, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo, @m80.k s5.b purchasedBookRepo) {
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(gameBookRepo, "gameBookRepo");
        g0.p(purchasedBookRepo, "purchasedBookRepo");
        this.f14929a = getLegalCurrentBookIdUC;
        this.f14930b = gameBookRepo;
        this.f14931c = purchasedBookRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super kotlin.Pair<h5.j, java.lang.Boolean>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.monetization.g.a
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.monetization.g$a r0 = (com.baicizhan.app.biz.game.uc.monetization.g.a) r0
            int r1 = r0.f14936e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14936e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.monetization.g$a r0 = new com.baicizhan.app.biz.game.uc.monetization.g$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14934c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14936e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            long r1 = r0.f14932a
            java.lang.Object r0 = r0.f14933b
            h5.j r0 = (h5.j) r0
            kotlin.e.n(r8)
            goto L8f
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            long r4 = r0.f14932a
            kotlin.e.n(r8)
            goto L69
        L43:
            kotlin.e.n(r8)
            goto L55
        L47:
            kotlin.e.n(r8)
            o6.q r8 = r7.f14929a
            r0.f14936e = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L55
            goto L8a
        L55:
            java.lang.Number r8 = (java.lang.Number) r8
            long r5 = r8.longValue()
            com.baicizhan.app.biz.game.repo.book.b r8 = r7.f14930b
            r0.f14932a = r5
            r0.f14936e = r4
            java.lang.Object r8 = r8.e(r5, r0)
            if (r8 != r1) goto L68
            goto L8a
        L68:
            r4 = r5
        L69:
            h5.j r8 = (h5.j) r8
            boolean r2 = h5.k.a(r8)
            if (r2 != 0) goto L7c
            kotlin.Pair r0 = new kotlin.Pair
            r1 = 0
            java.lang.Boolean r1 = l00.a.a(r1)
            r0.<init>(r8, r1)
            goto La4
        L7c:
            s5.b r2 = r7.f14931c
            r0.f14933b = r8
            r0.f14932a = r4
            r0.f14936e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r1 = r0
            r0 = r8
            r8 = r1
            r1 = r4
        L8f:
            java.util.List r8 = (java.util.List) r8
            kotlin.Pair r3 = new kotlin.Pair
            int r1 = (int) r1
            java.lang.Integer r1 = l00.a.f(r1)
            boolean r8 = r8.contains(r1)
            java.lang.Boolean r8 = l00.a.a(r8)
            r3.<init>(r0, r8)
            r0 = r3
        La4:
            z6.b r1 = z6.b.f101032b
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "GetCurrentBookSaleInfoUC"
            r4 = 0
            z6.b.j(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.g.a(j00.c):java.lang.Object");
    }
}
