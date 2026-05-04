package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class f implements d5.f<g, h> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.d f5836a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5837b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<g> f5838c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.CheckNextLevelCommand", f = "CheckNextLevelCommand.kt", i = {0}, l = {32}, m = "execute-IXJ_7BI", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-CheckNextLevelReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5839a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5840b;

        /* renamed from: d, reason: collision with root package name */
        public int f5842d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5840b = obj;
            this.f5842d |= Integer.MIN_VALUE;
            return f.this.d(null, this);
        }
    }

    public f(@m80.k o6.d doCheckNextLevelUC) {
        kotlin.jvm.internal.g0.p(doCheckNextLevelUC, "doCheckNextLevelUC");
        this.f5836a = doCheckNextLevelUC;
        this.f5837b = "biz.wordsgame.checknextlevel";
        this.f5838c = g.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(g gVar, j00.c<? super h> cVar) {
        return d(gVar.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<g> b() {
        return this.f5838c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5837b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.d r7, @m80.k j00.c<? super b5.h> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b5.f.a
            if (r0 == 0) goto L13
            r0 = r8
            b5.f$a r0 = (b5.f.a) r0
            int r1 = r0.f5842d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5842d = r1
            goto L18
        L13:
            b5.f$a r0 = new b5.f$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5840b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5842d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f5839a
            m3.d r7 = (m3.d) r7
            kotlin.e.n(r8)
            goto L4e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
            o6.d r8 = r6.f5836a
            int r2 = r7.d()
            long r4 = (long) r2
            java.lang.Object r7 = l00.k.a(r7)
            r0.f5839a = r7
            r0.f5842d = r3
            java.lang.Object r8 = r8.a(r4, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            java.util.Map r8 = (java.util.Map) r8
            m3.f r7 = new m3.f
            r7.<init>(r8)
            m3.f r7 = b5.h.b(r7)
            b5.h r7 = b5.h.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.f.d(m3.d, j00.c):java.lang.Object");
    }
}
