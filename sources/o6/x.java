package o6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e6.c f76260a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f76261b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.ProcessLearningBehaviorUC", f = "ProcessLearningBehaviorUC.kt", i = {0, 0, 1, 1, 1}, l = {19, 20}, m = "invoke", n = {"gameId", "behavior", "gameId", "behavior", "gameInfo"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f76262a;

        /* renamed from: b, reason: collision with root package name */
        public Object f76263b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76264c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f76265d;

        /* renamed from: f, reason: collision with root package name */
        public int f76267f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76265d = obj;
            this.f76267f |= Integer.MIN_VALUE;
            return x.this.a(null, null, this);
        }
    }

    public x(@m80.k e6.c applyStudyToAbilityUC, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo) {
        g0.p(applyStudyToAbilityUC, "applyStudyToAbilityUC");
        g0.p(gameRoundRepo, "gameRoundRepo");
        this.f76260a = applyStudyToAbilityUC;
        this.f76261b = gameRoundRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r2.w(r4, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k java.lang.String r7, @m80.k m3.b0 r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof o6.x.a
            if (r0 == 0) goto L13
            r0 = r9
            o6.x$a r0 = (o6.x.a) r0
            int r1 = r0.f76267f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f76267f = r1
            goto L18
        L13:
            o6.x$a r0 = new o6.x$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f76265d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f76267f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f76264c
            h5.m r7 = (h5.m) r7
            java.lang.Object r7 = r0.f76263b
            m3.b0 r7 = (m3.b0) r7
            java.lang.Object r7 = r0.f76262a
            java.lang.String r7 = (java.lang.String) r7
            kotlin.e.n(r9)
            goto L86
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f76263b
            r8 = r7
            m3.b0 r8 = (m3.b0) r8
            java.lang.Object r7 = r0.f76262a
            java.lang.String r7 = (java.lang.String) r7
            kotlin.e.n(r9)
            goto L5f
        L4d:
            kotlin.e.n(r9)
            com.baicizhan.app.biz.game.repo.gameround.e r9 = r6.f76261b
            r0.f76262a = r7
            r0.f76263b = r8
            r0.f76267f = r4
            java.lang.Object r9 = r9.e(r7, r0)
            if (r9 != r1) goto L5f
            goto L85
        L5f:
            h5.m r9 = (h5.m) r9
            e6.c r2 = r6.f76260a
            long r4 = r9.n()
            e6.i r4 = o6.y.a(r8, r7, r4)
            java.lang.Object r7 = l00.k.a(r7)
            r0.f76262a = r7
            java.lang.Object r7 = l00.k.a(r8)
            r0.f76263b = r7
            java.lang.Object r7 = l00.k.a(r9)
            r0.f76264c = r7
            r0.f76267f = r3
            java.lang.Object r7 = r2.w(r4, r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.x.a(java.lang.String, m3.b0, j00.c):java.lang.Object");
    }
}
