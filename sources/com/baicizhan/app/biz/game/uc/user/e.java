package com.baicizhan.app.biz.game.uc.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c6.b f15445a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.user.GetLegalCurrentSkuIdUC", f = "GetLegalCurrentSkuIdUC.kt", i = {}, l = {12}, m = "invoke", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15446a;

        /* renamed from: c, reason: collision with root package name */
        public int f15448c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f15446a = obj;
            this.f15448c |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    public e(@k c6.b userGameInfo) {
        g0.p(userGameInfo, "userGameInfo");
        this.f15445a = userGameInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super java.lang.Integer> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.baicizhan.app.biz.game.uc.user.e.a
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.app.biz.game.uc.user.e$a r0 = (com.baicizhan.app.biz.game.uc.user.e.a) r0
            int r1 = r0.f15448c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15448c = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.user.e$a r0 = new com.baicizhan.app.biz.game.uc.user.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15446a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15448c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.e.n(r7)
            c6.b r7 = r6.f15445a
            r0.f15448c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0 = -1
            if (r7 == r0) goto L4d
            java.lang.Integer r7 = l00.a.f(r7)
            return r7
        L4d:
            com.baicizhan.app.biz.base.BizInternalException r0 = new com.baicizhan.app.biz.base.BizInternalException
            r4 = 2
            r5 = 0
            java.lang.String r1 = "sku not available"
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.user.e.a(j00.c):java.lang.Object");
    }
}
