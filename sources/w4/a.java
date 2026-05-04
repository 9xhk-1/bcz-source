package w4;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class a implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o f94781b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c6.b f94782c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.ActiveUIEffectCollector", f = "ActiveUIEffectCollector.kt", i = {0, 0, 1, 1, 1}, l = {25, 26}, m = "collectGoProgressingUnitEffect$biz_release", n = {"$this$collectGoProgressingUnitEffect_u24lambda_u240", "$i$a$-runCatching-ActiveUIEffectCollector$collectGoProgressingUnitEffect$2", "$this$collectGoProgressingUnitEffect_u24lambda_u240", "$i$a$-runCatching-ActiveUIEffectCollector$collectGoProgressingUnitEffect$2", "curSkuId"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1"}, v = 1)
    /* renamed from: w4.a$a, reason: collision with other inner class name */
    public static final class C1274a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94783a;

        /* renamed from: b, reason: collision with root package name */
        public int f94784b;

        /* renamed from: c, reason: collision with root package name */
        public int f94785c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94786d;

        /* renamed from: f, reason: collision with root package name */
        public int f94788f;

        public C1274a(j00.c<? super C1274a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94786d = obj;
            this.f94788f |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    public a(@m80.k o sentenceSwitchCollector, @m80.k c6.b userGameRepo) {
        g0.p(sentenceSwitchCollector, "sentenceSwitchCollector");
        g0.p(userGameRepo, "userGameRepo");
        this.f94781b = sentenceSwitchCollector;
        this.f94782c = userGameRepo;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(2:26|27))(3:31|32|(2:34|30)(1:35))|28))|39|6|7|(0)(0)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r13 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        r0 = kotlin.Result.Companion;
        r13 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super x4.a> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof w4.a.C1274a
            if (r0 == 0) goto L13
            r0 = r13
            w4.a$a r0 = (w4.a.C1274a) r0
            int r1 = r0.f94788f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94788f = r1
            goto L18
        L13:
            w4.a$a r0 = new w4.a$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f94786d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94788f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r0 = r0.f94783a
            w4.a r0 = (w4.a) r0
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L31
            goto L83
        L31:
            r0 = move-exception
            r13 = r0
            goto L8a
        L34:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3c:
            int r2 = r0.f94784b
            java.lang.Object r6 = r0.f94783a
            w4.a r6 = (w4.a) r6
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L31
            goto L68
        L46:
            kotlin.e.n(r13)
            z6.b r6 = z6.b.f101032b
            r10 = 4
            r11 = 0
            java.lang.String r7 = "ActiveUIEffectCollector"
            java.lang.String r8 = "collectGoProgressingUnitEffect: starting"
            r9 = 0
            z6.b.d(r6, r7, r8, r9, r10, r11)
            kotlin.Result$a r13 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L31
            c6.b r13 = r12.f94782c     // Catch: java.lang.Throwable -> L31
            r0.f94783a = r12     // Catch: java.lang.Throwable -> L31
            r0.f94784b = r3     // Catch: java.lang.Throwable -> L31
            r0.f94788f = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r13 = r13.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r13 != r1) goto L66
            goto L82
        L66:
            r6 = r12
            r2 = r3
        L68:
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> L31
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L31
            w4.o r7 = r6.f94781b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = l00.k.a(r6)     // Catch: java.lang.Throwable -> L31
            r0.f94783a = r6     // Catch: java.lang.Throwable -> L31
            r0.f94784b = r2     // Catch: java.lang.Throwable -> L31
            r0.f94785c = r13     // Catch: java.lang.Throwable -> L31
            r0.f94788f = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r13 = r7.f(r13, r0)     // Catch: java.lang.Throwable -> L31
            if (r13 != r1) goto L83
        L82:
            return r1
        L83:
            x4.a r13 = (x4.a) r13     // Catch: java.lang.Throwable -> L31
            java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)     // Catch: java.lang.Throwable -> L31
            goto L94
        L8a:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.e.a(r13)
            java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)
        L94:
            java.lang.Throwable r0 = kotlin.Result.m6311exceptionOrNullimpl(r13)
            if (r0 != 0) goto L9b
            goto La5
        L9b:
            z6.b r13 = z6.b.f101032b
            java.lang.String r1 = "ActiveUIEffectCollector"
            java.lang.String r2 = "collectGoProgressingUnitEffect: failed"
            r13.e(r1, r2, r0)
            r13 = 0
        La5:
            r0 = r13
            x4.a r0 = (x4.a) r0
            z6.b r6 = z6.b.f101032b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "collectGoProgressingUnitEffect: result="
            r1.append(r2)
            if (r0 == 0) goto Lb7
            r3 = r5
        Lb7:
            r1.append(r3)
            java.lang.String r8 = r1.toString()
            r10 = 4
            r11 = 0
            java.lang.String r7 = "ActiveUIEffectCollector"
            r9 = 0
            z6.b.d(r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.a.a(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
