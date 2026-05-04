package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class l1 implements d5.f<k1, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final u5.b f5937a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5938b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f50.e<k1> f5939c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.ReportCommand", f = "ReportCommand.kt", i = {0, 0, 0}, l = {25}, m = "execute-ThyIJyk", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-Report$-payload$0", "$this$execute_ThyIJyk_u24lambda_u240", "$i$a$-runCatching-ReportCommand$execute$2"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5940a;

        /* renamed from: b, reason: collision with root package name */
        public Object f5941b;

        /* renamed from: c, reason: collision with root package name */
        public int f5942c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5943d;

        /* renamed from: f, reason: collision with root package name */
        public int f5945f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5943d = obj;
            this.f5945f |= Integer.MIN_VALUE;
            return l1.this.d(null, this);
        }
    }

    public l1(@m80.k u5.b pluginRepo) {
        kotlin.jvm.internal.g0.p(pluginRepo, "pluginRepo");
        this.f5937a = pluginRepo;
        this.f5938b = "biz.report";
        this.f5939c = k1.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(k1 k1Var, j00.c<? super c1> cVar) {
        return d(k1Var.h(), cVar);
    }

    @Override // d5.f
    @m80.k
    public f50.e<k1> b() {
        return this.f5939c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5938b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r6 = kotlin.Result.Companion;
        kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k java.lang.String r5, @m80.k j00.c<? super b5.c1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.l1.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.l1$a r0 = (b5.l1.a) r0
            int r1 = r0.f5945f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5945f = r1
            goto L18
        L13:
            b5.l1$a r0 = new b5.l1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5943d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5945f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f5941b
            b5.l1 r5 = (b5.l1) r5
            java.lang.Object r5 = r0.f5940a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L68
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e.n(r6)
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L31
            u5.b r6 = r4.f5937a     // Catch: java.lang.Throwable -> L31
            u5.a$b r6 = r6.c()     // Catch: java.lang.Throwable -> L31
            java.util.List r2 = a00.g0.l(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = l00.k.a(r5)     // Catch: java.lang.Throwable -> L31
            r0.f5940a = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L31
            r0.f5941b = r5     // Catch: java.lang.Throwable -> L31
            r5 = 0
            r0.f5942c = r5     // Catch: java.lang.Throwable -> L31
            r0.f5945f = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 != r1) goto L62
            return r1
        L62:
            yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L31
            kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L31
            goto L71
        L68:
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            kotlin.Result.m6308constructorimpl(r5)
        L71:
            b5.e1 r5 = b5.e1.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.l1.d(java.lang.String, j00.c):java.lang.Object");
    }
}
