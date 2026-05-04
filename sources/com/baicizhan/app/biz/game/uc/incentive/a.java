package com.baicizhan.app.biz.game.uc.incentive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.a f14485a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckFetchLavaQuestUC", f = "CheckFetchLavaQuestUC.kt", i = {2, 3}, l = {14, 15, 16, 17}, m = "invoke", n = {"quest", "quest"}, s = {"L$0", "L$0"}, v = 1)
    /* renamed from: com.baicizhan.app.biz.game.uc.incentive.a$a, reason: collision with other inner class name */
    public static final class C0208a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14486a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14487b;

        /* renamed from: d, reason: collision with root package name */
        public int f14489d;

        public C0208a(j00.c<? super C0208a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14487b = obj;
            this.f14489d |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    public a(@m80.k p5.a lavaQuestRepo) {
        g0.p(lavaQuestRepo, "lavaQuestRepo");
        this.f14485a = lavaQuestRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r8.c(false, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if (r8.b(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.incentive.a.C0208a
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.incentive.a$a r0 = (com.baicizhan.app.biz.game.uc.incentive.a.C0208a) r0
            int r1 = r0.f14489d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14489d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.a$a r0 = new com.baicizhan.app.biz.game.uc.incentive.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14487b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14489d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r0 = r0.f14486a
            com.baicizhan.online.playground_api.LavaquestGameInfo r0 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r0
            kotlin.e.n(r8)
            goto La6
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f14486a
            com.baicizhan.online.playground_api.LavaquestGameInfo r2 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r2
            kotlin.e.n(r8)
            goto L8c
        L47:
            kotlin.e.n(r8)
            goto L68
        L4b:
            kotlin.e.n(r8)
            goto L5d
        L4f:
            kotlin.e.n(r8)
            p5.a r8 = r7.f14485a
            r0.f14489d = r6
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L5d
            goto La5
        L5d:
            p5.a r8 = r7.f14485a
            r0.f14489d = r5
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L68
            goto La5
        L68:
            r2 = r8
            com.baicizhan.online.playground_api.LavaquestGameInfo r2 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r2
            if (r2 == 0) goto L76
            long r5 = w3.g.n()
            com.baicizhan.app.biz.game.model.LavaQuestState r8 = h5.r.a(r2, r5)
            goto L77
        L76:
            r8 = 0
        L77:
            com.baicizhan.app.biz.game.model.LavaQuestState r5 = com.baicizhan.app.biz.game.model.LavaQuestState.Ready
            if (r8 == r5) goto La9
            p5.a r8 = r7.f14485a
            java.lang.Object r5 = l00.k.a(r2)
            r0.f14486a = r5
            r0.f14489d = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L8c
            goto La5
        L8c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La9
            p5.a r8 = r7.f14485a
            java.lang.Object r2 = l00.k.a(r2)
            r0.f14486a = r2
            r0.f14489d = r3
            r2 = 0
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto La6
        La5:
            return r1
        La6:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        La9:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.a.a(j00.c):java.lang.Object");
    }
}
