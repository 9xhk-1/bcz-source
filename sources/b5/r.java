package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class r implements d5.f<s, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.n f6022a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6023b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<s> f6024c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.EnableSpellCommand", f = "EnableSpellCommand.kt", i = {0}, l = {24}, m = "execute-BkHLXig", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-EnableSpellReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6025a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6026b;

        /* renamed from: d, reason: collision with root package name */
        public int f6028d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6026b = obj;
            this.f6028d |= Integer.MIN_VALUE;
            return r.this.d(null, this);
        }
    }

    public r(@m80.k o6.n enableSpellUc) {
        kotlin.jvm.internal.g0.p(enableSpellUc, "enableSpellUc");
        this.f6022a = enableSpellUc;
        this.f6023b = "biz.wordsgame.enablespell";
        this.f6024c = s.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(s sVar, j00.c<? super c1> cVar) {
        return d(sVar.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<s> b() {
        return this.f6024c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6023b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.n r8, @m80.k j00.c<? super b5.c1> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof b5.r.a
            if (r0 == 0) goto L14
            r0 = r9
            b5.r$a r0 = (b5.r.a) r0
            int r1 = r0.f6028d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6028d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            b5.r$a r0 = new b5.r$a
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f6026b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f6028d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r6.f6025a
            m3.n r8 = (m3.n) r8
            kotlin.e.n(r9)
            goto L59
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.e.n(r9)
            o6.n r1 = r7.f6022a
            r9 = r2
            java.lang.String r2 = r8.j()
            int r3 = r8.f()
            long r3 = (long) r3
            boolean r5 = r8.h()
            java.lang.Object r8 = l00.k.a(r8)
            r6.f6025a = r8
            r6.f6028d = r9
            java.lang.Object r8 = r1.m(r2, r3, r5, r6)
            if (r8 != r0) goto L59
            return r0
        L59:
            b5.e1 r8 = b5.e1.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.r.d(m3.n, j00.c):java.lang.Object");
    }
}
