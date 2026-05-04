package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class a implements d5.f<p, o> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g6.a f5763a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5764b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<p> f5765c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.AddComboCommand", f = "AddComboCommand.kt", i = {0}, l = {30}, m = "execute--fv9fNU", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-ComboReq$-payload$0"}, s = {"L$0"}, v = 1)
    /* renamed from: b5.a$a, reason: collision with other inner class name */
    public static final class C0105a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5766a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5767b;

        /* renamed from: d, reason: collision with root package name */
        public int f5769d;

        public C0105a(j00.c<? super C0105a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5767b = obj;
            this.f5769d |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    public a(@m80.k g6.a addComboUC) {
        kotlin.jvm.internal.g0.p(addComboUC, "addComboUC");
        this.f5763a = addComboUC;
        this.f5764b = "biz.wordsgame.addcombo";
        this.f5765c = p.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(p pVar, j00.c<? super o> cVar) {
        return d(pVar.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<p> b() {
        return this.f5765c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5764b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.m r6, @m80.k j00.c<? super b5.o> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b5.a.C0105a
            if (r0 == 0) goto L13
            r0 = r7
            b5.a$a r0 = (b5.a.C0105a) r0
            int r1 = r0.f5769d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5769d = r1
            goto L18
        L13:
            b5.a$a r0 = new b5.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5767b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5769d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f5766a
            m3.m r6 = (m3.m) r6
            kotlin.e.n(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r7)
            g6.a r7 = r5.f5763a
            java.lang.String r2 = r6.g()
            int r4 = r6.e()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f5766a = r6
            r0.f5769d = r3
            java.lang.Object r7 = r7.b(r2, r4, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            kotlin.Pair r7 = (kotlin.Pair) r7
            m3.l r6 = new m3.l
            java.lang.Object r0 = r7.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r7 = r7.getSecond()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r6.<init>(r0, r7)
            m3.l r6 = b5.o.b(r6)
            b5.o r6 = b5.o.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.a.d(m3.m, j00.c):java.lang.Object");
    }
}
