package com.baicizhan.app.biz.game.uc.incentive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b6.a f14589a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p5.a f14590b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.MarkLavaPopupShownUC", f = "MarkLavaPopupShownUC.kt", i = {1, 2}, l = {15, 17, 19}, m = "invoke", n = {vb.a.f93813p, vb.a.f93813p}, s = {"Z$0", "Z$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14591a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14592b;

        /* renamed from: d, reason: collision with root package name */
        public int f14594d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14592b = obj;
            this.f14594d |= Integer.MIN_VALUE;
            return j.this.a(this);
        }
    }

    public j(@m80.k b6.a userRep, @m80.k p5.a lavaQuestRepo) {
        g0.p(userRep, "userRep");
        g0.p(lavaQuestRepo, "lavaQuestRepo");
        this.f14589a = userRep;
        this.f14590b = lavaQuestRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r8.c(true, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r8.a(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.incentive.j.a
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.incentive.j$a r0 = (com.baicizhan.app.biz.game.uc.incentive.j.a) r0
            int r1 = r0.f14594d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14594d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.j$a r0 = new com.baicizhan.app.biz.game.uc.incentive.j$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14592b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14594d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r8)
            goto L75
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            boolean r2 = r0.f14591a
            kotlin.e.n(r8)
            goto L68
        L3d:
            kotlin.e.n(r8)
            goto L51
        L41:
            kotlin.e.n(r8)
            b6.a r8 = r7.f14589a
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r2 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.NewUserLavaQuestLocked
            r0.f14594d = r5
            java.lang.Object r8 = r8.e(r2, r0)
            if (r8 != r1) goto L51
            goto L74
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r2 = r8.booleanValue()
            if (r2 == 0) goto L68
            b6.a r8 = r7.f14589a
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r6 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.NewUserLavaQuestLocked
            r0.f14591a = r2
            r0.f14594d = r4
            java.lang.Object r8 = r8.a(r6, r0)
            if (r8 != r1) goto L68
            goto L74
        L68:
            p5.a r8 = r7.f14590b
            r0.f14591a = r2
            r0.f14594d = r3
            java.lang.Object r8 = r8.c(r5, r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.j.a(j00.c):java.lang.Object");
    }
}
