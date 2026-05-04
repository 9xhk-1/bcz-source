package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class z1 implements d5.f<a2, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.j f6102a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6103b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f50.e<a2> f6104c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.SubmitSentenceGameCommand", f = "SubmitSentenceGameCommand.kt", i = {0}, l = {27}, m = "execute-ZsH9T48", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-SubmitSentenceGameReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6105a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6106b;

        /* renamed from: d, reason: collision with root package name */
        public int f6108d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6106b = obj;
            this.f6108d |= Integer.MIN_VALUE;
            return z1.this.d(null, this);
        }
    }

    public z1(@m80.k com.baicizhan.app.biz.game.uc.sentence.j submitSentenceGameUC) {
        kotlin.jvm.internal.g0.p(submitSentenceGameUC, "submitSentenceGameUC");
        this.f6102a = submitSentenceGameUC;
        this.f6103b = "biz.sentencegame.submitgame";
        this.f6104c = a2.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(a2 a2Var, j00.c<? super c1> cVar) {
        return d(a2Var.h(), cVar);
    }

    @Override // d5.f
    @m80.k
    public f50.e<a2> b() {
        return this.f6104c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6103b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.r1 r7, @m80.k j00.c<? super b5.c1> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b5.z1.a
            if (r0 == 0) goto L13
            r0 = r8
            b5.z1$a r0 = (b5.z1.a) r0
            int r1 = r0.f6108d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6108d = r1
            goto L18
        L13:
            b5.z1$a r0 = new b5.z1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6106b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6108d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f6105a
            m3.r1 r7 = (m3.r1) r7
            kotlin.e.n(r8)
            goto L55
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
            com.baicizhan.app.biz.game.uc.sentence.j r8 = r6.f6102a
            int r2 = r7.q()
            boolean r4 = r7.s()
            java.util.List r5 = r7.o()
            java.lang.Object r7 = l00.k.a(r7)
            r0.f6105a = r7
            r0.f6108d = r3
            java.lang.Object r7 = r8.k(r2, r4, r5, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            b5.e1 r7 = b5.e1.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.z1.d(m3.r1, j00.c):java.lang.Object");
    }
}
