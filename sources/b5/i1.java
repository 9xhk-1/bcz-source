package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class i1 implements d5.f<j1, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.n f5895a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5896b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f50.e<j1> f5897c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.RechargeStarCommand", f = "RechargeStarCommand.kt", i = {0}, l = {28}, m = "execute-yl17WaU", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-RechargeStarReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5898a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5899b;

        /* renamed from: d, reason: collision with root package name */
        public int f5901d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5899b = obj;
            this.f5901d |= Integer.MIN_VALUE;
            return i1.this.d(null, this);
        }
    }

    public i1(@m80.k com.baicizhan.app.biz.game.uc.monetization.n rechargeLifeUC) {
        kotlin.jvm.internal.g0.p(rechargeLifeUC, "rechargeLifeUC");
        this.f5895a = rechargeLifeUC;
        this.f5896b = "biz.wordsgame.rechargestar";
        this.f5897c = j1.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(j1 j1Var, j00.c<? super c1> cVar) {
        return d(j1Var.h(), cVar);
    }

    @Override // d5.f
    @m80.k
    public f50.e<j1> b() {
        return this.f5897c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5896b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.p0 r6, @m80.k j00.c<? super b5.c1> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b5.i1.a
            if (r0 == 0) goto L13
            r0 = r7
            b5.i1$a r0 = (b5.i1.a) r0
            int r1 = r0.f5901d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5901d = r1
            goto L18
        L13:
            b5.i1$a r0 = new b5.i1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5899b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5901d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f5898a
            m3.p0 r6 = (m3.p0) r6
            kotlin.e.n(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r7)
            com.baicizhan.app.biz.game.uc.monetization.n r7 = r5.f5895a
            java.lang.String r2 = r6.e()
            int r4 = r6.g()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f5898a = r6
            r0.f5901d = r3
            java.lang.Object r6 = r7.b(r2, r4, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            b5.e1 r6 = b5.e1.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.i1.d(m3.p0, j00.c):java.lang.Object");
    }
}
