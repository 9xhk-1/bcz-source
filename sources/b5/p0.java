package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class p0 implements d5.f<q0, r0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l6.u f5992a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5993b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<q0> f5994c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetWordRootResourceCommand", f = "GetWordRootResourceCommand.kt", i = {0}, l = {30}, m = "execute-5YFqaCs", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetWordRootResourceReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5995a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5996b;

        /* renamed from: d, reason: collision with root package name */
        public int f5998d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5996b = obj;
            this.f5998d |= Integer.MIN_VALUE;
            return p0.this.d(null, this);
        }
    }

    public p0(@m80.k l6.u getWordRootUC) {
        kotlin.jvm.internal.g0.p(getWordRootUC, "getWordRootUC");
        this.f5992a = getWordRootUC;
        this.f5993b = "biz.wordsgame.getwordroots";
        this.f5994c = q0.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(q0 q0Var, j00.c<? super r0> cVar) {
        return d(q0Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<q0> b() {
        return this.f5994c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5993b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.y r5, @m80.k j00.c<? super b5.r0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.p0.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.p0$a r0 = (b5.p0.a) r0
            int r1 = r0.f5998d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5998d = r1
            goto L18
        L13:
            b5.p0$a r0 = new b5.p0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5996b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5998d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5995a
            m3.y r5 = (m3.y) r5
            kotlin.e.n(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            l6.u r6 = r4.f5992a
            int r2 = r5.d()
            java.lang.Object r5 = l00.k.a(r5)
            r0.f5995a = r5
            r0.f5998d = r3
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            t8.x r6 = (t8.x) r6
            m3.j2 r5 = e5.a.u(r6)
            m3.j2 r5 = b5.r0.b(r5)
            b5.r0 r5 = b5.r0.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.p0.d(m3.y, j00.c):java.lang.Object");
    }
}
