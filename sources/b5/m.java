package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class m implements d5.f<n, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final u6.a f5946a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5947b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<n> f5948c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.CollectWord2BooksCommand", f = "CollectWord2BooksCommand.kt", i = {0}, l = {25}, m = "execute-Gjgm4og", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-CollectWord2BooksReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5949a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5950b;

        /* renamed from: d, reason: collision with root package name */
        public int f5952d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5950b = obj;
            this.f5952d |= Integer.MIN_VALUE;
            return m.this.d(null, this);
        }
    }

    public m(@m80.k u6.a collectWordsToBooksUC) {
        kotlin.jvm.internal.g0.p(collectWordsToBooksUC, "collectWordsToBooksUC");
        this.f5946a = collectWordsToBooksUC;
        this.f5947b = "biz.userbook.collectwordtobooks";
        this.f5948c = n.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(n nVar, j00.c<? super c1> cVar) {
        return d(nVar.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<n> b() {
        return this.f5948c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5947b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.i r7, @m80.k j00.c<? super b5.c1> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b5.m.a
            if (r0 == 0) goto L13
            r0 = r8
            b5.m$a r0 = (b5.m.a) r0
            int r1 = r0.f5952d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5952d = r1
            goto L18
        L13:
            b5.m$a r0 = new b5.m$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5950b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5952d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f5949a
            m3.i r7 = (m3.i) r7
            kotlin.e.n(r8)
            goto L55
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
            u6.a r8 = r6.f5946a
            int r2 = r7.m()
            java.util.List r4 = r7.i()
            int r5 = r7.k()
            java.lang.Object r7 = l00.k.a(r7)
            r0.f5949a = r7
            r0.f5952d = r3
            java.lang.Object r7 = r8.a(r2, r4, r5, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            b5.e1 r7 = b5.e1.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m.d(m3.i, j00.c):java.lang.Object");
    }
}
