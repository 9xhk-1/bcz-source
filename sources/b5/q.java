package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class q implements d5.f<r1, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n6.a f6006a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6007b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<r1> f6008c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.CommitSettingsCommand", f = "CommitSettingsCommand.kt", i = {0}, l = {23}, m = "execute-_oMYYlw", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-SetSettingReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6009a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6010b;

        /* renamed from: d, reason: collision with root package name */
        public int f6012d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6010b = obj;
            this.f6012d |= Integer.MIN_VALUE;
            return q.this.d(null, this);
        }
    }

    public q(@m80.k n6.a commitSettingsUC) {
        kotlin.jvm.internal.g0.p(commitSettingsUC, "commitSettingsUC");
        this.f6006a = commitSettingsUC;
        this.f6007b = "biz.settings.commitsettings";
        this.f6008c = r1.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(r1 r1Var, j00.c<? super c1> cVar) {
        return d(r1Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<r1> b() {
        return this.f6008c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6007b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.b1 r5, @m80.k j00.c<? super b5.c1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.q.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.q$a r0 = (b5.q.a) r0
            int r1 = r0.f6012d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6012d = r1
            goto L18
        L13:
            b5.q$a r0 = new b5.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6010b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6012d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f6009a
            m3.b1 r5 = (m3.b1) r5
            kotlin.e.n(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            n6.a r6 = r4.f6006a
            java.util.Map r2 = r5.g()
            java.lang.Object r5 = l00.k.a(r5)
            r0.f6009a = r5
            r0.f6012d = r3
            java.lang.Object r5 = r6.a(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            b5.e1 r5 = b5.e1.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.q.d(m3.b1, j00.c):java.lang.Object");
    }
}
