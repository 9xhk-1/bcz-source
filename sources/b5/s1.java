package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class s1 implements d5.f<t1, u1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.f0 f6037a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f6038b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f6039c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final f50.e<t1> f6040d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.StartGameCommand", f = "StartGameCommand.kt", i = {0, 0, 1, 1, 1}, l = {35, 39}, m = "execute-Nk1kAbA", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-StartGameReq$-payload$0", "roundType", "$v$c$com-baicizhan-app-biz-game-impl-unity-command-StartGameReq$-payload$0", "roundType", "cost"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6041a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6042b;

        /* renamed from: c, reason: collision with root package name */
        public int f6043c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f6044d;

        /* renamed from: f, reason: collision with root package name */
        public int f6046f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6044d = obj;
            this.f6046f |= Integer.MIN_VALUE;
            return s1.this.d(null, this);
        }
    }

    public s1(@m80.k o6.f0 doStartGameUC, @m80.k c6.b userGameInfoRepo) {
        kotlin.jvm.internal.g0.p(doStartGameUC, "doStartGameUC");
        kotlin.jvm.internal.g0.p(userGameInfoRepo, "userGameInfoRepo");
        this.f6037a = doStartGameUC;
        this.f6038b = userGameInfoRepo;
        this.f6039c = "biz.wordsgame.startgame";
        this.f6040d = t1.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(t1 t1Var, j00.c<? super u1> cVar) {
        return d(t1Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<t1> b() {
        return this.f6040d;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6039c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r13 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.d1 r12, @m80.k j00.c<? super b5.u1> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof b5.s1.a
            if (r0 == 0) goto L14
            r0 = r13
            b5.s1$a r0 = (b5.s1.a) r0
            int r1 = r0.f6046f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6046f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            b5.s1$a r0 = new b5.s1$a
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f6044d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f6046f
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L4f
            if (r1 == r2) goto L41
            if (r1 != r9) goto L39
            int r12 = r6.f6043c
            java.lang.Object r0 = r6.f6042b
            com.baicizhan.app.biz.game.model.RoundType r0 = (com.baicizhan.app.biz.game.model.RoundType) r0
            java.lang.Object r0 = r6.f6041a
            m3.d1 r0 = (m3.d1) r0
            kotlin.e.n(r13)
            goto La8
        L39:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L41:
            java.lang.Object r12 = r6.f6042b
            com.baicizhan.app.biz.game.model.RoundType r12 = (com.baicizhan.app.biz.game.model.RoundType) r12
            java.lang.Object r1 = r6.f6041a
            m3.d1 r1 = (m3.d1) r1
            kotlin.e.n(r13)
            r4 = r12
            r12 = r1
            goto L86
        L4f:
            kotlin.e.n(r13)
            com.baicizhan.app.biz.game.model.RoundType$a r13 = com.baicizhan.app.biz.game.model.RoundType.Companion
            int r1 = r12.g()
            long r3 = (long) r1
            com.baicizhan.app.biz.game.model.RoundType r4 = r13.a(r3)
            o6.f0 r1 = r11.f6037a
            com.baicizhan.app.biz.game.model.RoundType r13 = com.baicizhan.app.biz.game.model.RoundType.SPELLING
            if (r4 != r13) goto L69
            int r13 = r12.e()
            long r7 = (long) r13
            goto L6d
        L69:
            long r7 = w3.g.l()
        L6d:
            java.lang.Object r13 = l00.k.a(r12)
            r6.f6041a = r13
            java.lang.Object r13 = l00.k.a(r4)
            r6.f6042b = r13
            r6.f6046f = r2
            r5 = 0
            r2 = r7
            r7 = 4
            r8 = 0
            java.lang.Object r13 = o6.f0.b(r1, r2, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L86
            goto La4
        L86:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            c6.b r1 = r11.f6038b
            java.lang.Object r12 = l00.k.a(r12)
            r6.f6041a = r12
            java.lang.Object r12 = l00.k.a(r4)
            r6.f6042b = r12
            r6.f6043c = r13
            r6.f6046f = r9
            java.lang.Object r12 = r1.r(r6)
            if (r12 != r0) goto La5
        La4:
            return r0
        La5:
            r10 = r13
            r13 = r12
            r12 = r10
        La8:
            h5.y r13 = (h5.y) r13
            m3.c1 r0 = new m3.c1
            boolean r13 = com.baicizhan.app.biz.game.model.a.d(r13)
            r0.<init>(r12, r13)
            m3.c1 r12 = b5.u1.b(r0)
            b5.u1 r12 = b5.u1.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.s1.d(m3.d1, j00.c):java.lang.Object");
    }
}
