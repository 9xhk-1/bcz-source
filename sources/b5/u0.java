package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class u0 implements d5.f<v0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i6.a f6058a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6059b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<v0> f6060c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.LookupCommand", f = "LookupCommand.kt", i = {0}, l = {29}, m = "execute-r5gxxns", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-LookupReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6061a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6062b;

        /* renamed from: d, reason: collision with root package name */
        public int f6064d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6062b = obj;
            this.f6064d |= Integer.MIN_VALUE;
            return u0.this.d(null, this);
        }
    }

    public u0(@m80.k i6.a lookupWordUC) {
        kotlin.jvm.internal.g0.p(lookupWordUC, "lookupWordUC");
        this.f6058a = lookupWordUC;
        this.f6059b = "biz.wordsgame.lookup";
        this.f6060c = v0.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(v0 v0Var, j00.c<? super c1> cVar) {
        return d(v0Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<v0> b() {
        return this.f6060c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6059b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.d0 r7, @m80.k j00.c<? super b5.c1> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b5.u0.a
            if (r0 == 0) goto L13
            r0 = r8
            b5.u0$a r0 = (b5.u0.a) r0
            int r1 = r0.f6064d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6064d = r1
            goto L18
        L13:
            b5.u0$a r0 = new b5.u0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6062b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6064d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f6061a
            m3.d0 r7 = (m3.d0) r7
            kotlin.e.n(r8)
            goto L4d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
            i6.a r8 = r6.f6058a
            java.lang.String r2 = r7.d()
            java.lang.Object r7 = l00.k.a(r7)
            r0.f6061a = r7
            r0.f6064d = r3
            java.lang.Object r8 = r8.e(r2, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            i6.b r8 = (i6.b) r8
            if (r8 == 0) goto L73
            m3.e0 r0 = new m3.e0
            int r1 = r8.q()
            java.lang.String r2 = r8.r()
            java.lang.String r3 = r8.n()
            java.lang.String r4 = r8.p()
            java.lang.String r5 = r8.l()
            r0.<init>(r1, r2, r3, r4, r5)
            m3.e0 r7 = b5.w0.b(r0)
            b5.w0 r7 = b5.w0.a(r7)
            return r7
        L73:
            com.baicizhan.app.biz.base.BizInternalException r0 = new com.baicizhan.app.biz.base.BizInternalException
            r4 = 6
            r5 = 0
            java.lang.String r1 = "word not found"
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.u0.d(m3.d0, j00.c):java.lang.Object");
    }
}
