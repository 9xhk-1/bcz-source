package com.baicizhan.app.biz.game.uc.incentive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.f f14576a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CompleteWinningStreakUC", f = "CompleteWinningStreakUC.kt", i = {0, 1, 1}, l = {14, 17}, m = "invoke", n = {"dataNumber", "dataNumber", "isLocalWinning"}, s = {"J$0", "J$0", "Z$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14577a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f14578b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14579c;

        /* renamed from: e, reason: collision with root package name */
        public int f14581e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14579c = obj;
            this.f14581e |= Integer.MIN_VALUE;
            return g.this.a(0L, this);
        }
    }

    public g(@m80.k p5.f winningStreakRepo) {
        g0.p(winningStreakRepo, "winningStreakRepo");
        this.f14576a = winningStreakRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r2.a(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r13 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.baicizhan.app.biz.game.uc.incentive.g.a
            if (r0 == 0) goto L13
            r0 = r13
            com.baicizhan.app.biz.game.uc.incentive.g$a r0 = (com.baicizhan.app.biz.game.uc.incentive.g.a) r0
            int r1 = r0.f14581e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14581e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.g$a r0 = new com.baicizhan.app.biz.game.uc.incentive.g$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f14579c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14581e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r13)
            goto L7c
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            long r11 = r0.f14577a
            kotlin.e.n(r13)
            goto L4a
        L3a:
            kotlin.e.n(r13)
            p5.f r13 = r10.f14576a
            r0.f14577a = r11
            r0.f14581e = r4
            java.lang.Object r13 = r13.j(r11, r0)
            if (r13 != r1) goto L4a
            goto L7b
        L4a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L7f
            z6.b r4 = z6.b.f101032b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "local winning !! "
            r2.append(r5)
            r2.append(r11)
            java.lang.String r6 = r2.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "CompleteWinningStreakUC"
            r7 = 0
            z6.b.j(r4, r5, r6, r7, r8, r9)
            p5.f r2 = r10.f14576a
            r0.f14577a = r11
            r0.f14578b = r13
            r0.f14581e = r3
            java.lang.Object r11 = r2.a(r0)
            if (r11 != r1) goto L7c
        L7b:
            return r1
        L7c:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        L7f:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.g.a(long, j00.c):java.lang.Object");
    }
}
