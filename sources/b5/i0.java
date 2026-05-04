package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class i0 implements d5.f<h0, k0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l6.p f5888a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5889b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<h0> f5890c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetTopicResourceCommand", f = "GetTopicResourceCommand.kt", i = {0}, l = {30}, m = "execute-BsbJHV0", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetTopicResource$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5891a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5892b;

        /* renamed from: d, reason: collision with root package name */
        public int f5894d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5892b = obj;
            this.f5894d |= Integer.MIN_VALUE;
            return i0.this.d(null, this);
        }
    }

    public i0(@m80.k l6.p getTopicResourceUC) {
        kotlin.jvm.internal.g0.p(getTopicResourceUC, "getTopicResourceUC");
        this.f5888a = getTopicResourceUC;
        this.f5889b = "biz.wordsgame.gettopicresource";
        this.f5890c = h0.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(h0 h0Var, j00.c<? super k0> cVar) {
        return d(h0Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<h0> b() {
        return this.f5890c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5889b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.t r10, @m80.k j00.c<? super b5.k0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof b5.i0.a
            if (r0 == 0) goto L14
            r0 = r11
            b5.i0$a r0 = (b5.i0.a) r0
            int r1 = r0.f5894d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f5894d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            b5.i0$a r0 = new b5.i0$a
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f5892b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f5894d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r10 = r6.f5891a
            m3.t r10 = (m3.t) r10
            kotlin.e.n(r11)
            goto L59
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.e.n(r11)
            l6.p r1 = r9.f5888a
            int r11 = r10.h()
            long r3 = (long) r11
            r11 = r2
            r2 = r3
            java.util.List r4 = r10.j()
            java.lang.Object r10 = l00.k.a(r10)
            r6.f5891a = r10
            r6.f5894d = r11
            r5 = 0
            r7 = 4
            r8 = 0
            java.lang.Object r11 = l6.p.b(r1, r2, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L59
            return r0
        L59:
            java.util.List r11 = (java.util.List) r11
            java.util.List r10 = b5.k0.e(r11)
            b5.k0 r10 = b5.k0.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.i0.d(m3.t, j00.c):java.lang.Object");
    }
}
