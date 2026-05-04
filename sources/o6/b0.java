package o6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t6.c f76024a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f0 f76025b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.StartNewUserGameUC", f = "StartNewUserGameUC.kt", i = {0, 1}, l = {25, 27}, m = "invoke", n = {"today", "today"}, s = {"J$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f76026a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f76027b;

        /* renamed from: d, reason: collision with root package name */
        public int f76029d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76027b = obj;
            this.f76029d |= Integer.MIN_VALUE;
            return b0.this.a(this);
        }
    }

    public b0(@m80.k t6.c fullSyncUC, @m80.k f0 doStartGameUC) {
        g0.p(fullSyncUC, "fullSyncUC");
        g0.p(doStartGameUC, "doStartGameUC");
        this.f76024a = fullSyncUC;
        this.f76025b = doStartGameUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r14 != r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super java.lang.Integer> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof o6.b0.a
            if (r0 == 0) goto L14
            r0 = r14
            o6.b0$a r0 = (o6.b0.a) r0
            int r1 = r0.f76029d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f76029d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            o6.b0$a r0 = new o6.b0$a
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f76027b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f76029d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.e.n(r14)
            goto L7c
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L36:
            long r3 = r6.f76026a
            kotlin.e.n(r14)
            goto L5d
        L3c:
            kotlin.e.n(r14)
            z6.b r7 = z6.b.f101032b
            r11 = 4
            r12 = 0
            java.lang.String r8 = "StartNewUserGameUC"
            java.lang.String r9 = ""
            r10 = 0
            z6.b.j(r7, r8, r9, r10, r11, r12)
            long r4 = w3.g.l()
            t6.c r14 = r13.f76024a
            r6.f76026a = r4
            r6.f76029d = r3
            java.lang.Object r14 = r14.h(r6)
            if (r14 != r0) goto L5c
            goto L7b
        L5c:
            r3 = r4
        L5d:
            z6.b r7 = z6.b.f101032b
            r11 = 4
            r12 = 0
            java.lang.String r8 = "StartNewUserGameUC"
            java.lang.String r9 = "fetch success"
            r10 = 0
            z6.b.j(r7, r8, r9, r10, r11, r12)
            o6.f0 r1 = r13.f76025b
            r14 = r2
            r2 = r3
            com.baicizhan.app.biz.game.model.RoundType r4 = com.baicizhan.app.biz.game.model.RoundType.LEARNING
            com.baicizhan.app.biz.game.model.RoundCate r5 = com.baicizhan.app.biz.game.model.RoundCate.NewUserGame
            r6.f76026a = r2
            r6.f76029d = r14
            java.lang.Object r14 = r1.a(r2, r4, r5, r6)
            if (r14 != r0) goto L7c
        L7b:
            return r0
        L7c:
            r0 = r14
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            z6.b r1 = z6.b.f101032b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "doStartGameUC success "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            r5 = 4
            r6 = 0
            java.lang.String r2 = "StartNewUserGameUC"
            r4 = 0
            z6.b.j(r1, r2, r3, r4, r5, r6)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.b0.a(j00.c):java.lang.Object");
    }
}
