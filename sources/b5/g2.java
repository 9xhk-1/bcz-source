package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class g2 implements d5.f<h2, i2> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.t f5866a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5867b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<h2> f5868c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.WinningStreakCommand", f = "WinningStreakCommand.kt", i = {0}, l = {32}, m = "execute-VUtM2z8", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-WinningStreakReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5869a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5870b;

        /* renamed from: d, reason: collision with root package name */
        public int f5872d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5870b = obj;
            this.f5872d |= Integer.MIN_VALUE;
            return g2.this.d(null, this);
        }
    }

    public g2(@m80.k com.baicizhan.app.biz.game.uc.incentive.t winWordsGameUC) {
        kotlin.jvm.internal.g0.p(winWordsGameUC, "winWordsGameUC");
        this.f5866a = winWordsGameUC;
        this.f5867b = "biz.wordsgame.winningstreak";
        this.f5868c = h2.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(h2 h2Var, j00.c<? super i2> cVar) {
        return d(h2Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<h2> b() {
        return this.f5868c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5867b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.c2 r6, @m80.k j00.c<? super b5.i2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b5.g2.a
            if (r0 == 0) goto L13
            r0 = r7
            b5.g2$a r0 = (b5.g2.a) r0
            int r1 = r0.f5872d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5872d = r1
            goto L18
        L13:
            b5.g2$a r0 = new b5.g2$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5870b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5872d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f5869a
            m3.c2 r6 = (m3.c2) r6
            kotlin.e.n(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r7)
            com.baicizhan.app.biz.game.uc.incentive.t r7 = r5.f5866a
            int r2 = r6.g()
            int r4 = r6.e()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f5869a = r6
            r0.f5872d = r3
            java.lang.Object r7 = r7.c(r2, r4, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            boolean r6 = b5.i2.b(r6)
            b5.i2 r6 = b5.i2.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.g2.d(m3.c2, j00.c):java.lang.Object");
    }
}
