package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class x implements d5.f<y, z> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.p f6085a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6086b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<y> f6087c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetCurrentGameCommand", f = "GetCurrentGameCommand.kt", i = {0}, l = {33}, m = "execute-M515DYo", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetCurrentGameReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6088a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6089b;

        /* renamed from: d, reason: collision with root package name */
        public int f6091d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6089b = obj;
            this.f6091d |= Integer.MIN_VALUE;
            return x.this.d(null, this);
        }
    }

    public x(@m80.k o6.p getCurrentWordsGameUc) {
        kotlin.jvm.internal.g0.p(getCurrentWordsGameUc, "getCurrentWordsGameUc");
        this.f6085a = getCurrentWordsGameUc;
        this.f6086b = "biz.wordsgame.getcurrentgame";
        this.f6087c = y.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(y yVar, j00.c<? super z> cVar) {
        return d(yVar.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<y> b() {
        return this.f6087c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6086b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.r r7, @m80.k j00.c<? super b5.z> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b5.x.a
            if (r0 == 0) goto L13
            r0 = r8
            b5.x$a r0 = (b5.x.a) r0
            int r1 = r0.f6091d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6091d = r1
            goto L18
        L13:
            b5.x$a r0 = new b5.x$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6089b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6091d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f6088a
            m3.r r7 = (m3.r) r7
            kotlin.e.n(r8)
            goto L54
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
            o6.p r8 = r6.f6085a
            com.baicizhan.app.biz.game.model.RoundType$a r2 = com.baicizhan.app.biz.game.model.RoundType.Companion
            int r4 = r7.d()
            long r4 = (long) r4
            com.baicizhan.app.biz.game.model.RoundType r2 = r2.a(r4)
            java.lang.Object r7 = l00.k.a(r7)
            r0.f6088a = r7
            r0.f6091d = r3
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            m3.o2 r8 = (m3.o2) r8
            m3.o2 r7 = b5.z.b(r8)
            b5.z r7 = b5.z.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.x.d(m3.r, j00.c):java.lang.Object");
    }
}
