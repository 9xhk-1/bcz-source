package com.baicizhan.app.biz.game.uc.sentence;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x5.d f15238a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f15239b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.a f15240c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d f15241d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.user.e f15242e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.MarkSentenceChangedUC", f = "MarkSentenceChangedUC.kt", i = {1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5}, l = {20, 21, 23, 24, 25, 43}, m = "invoke", n = {"curSkuId", "curSkuId", "remoteSkuId", "curSkuId", "remoteSkuId", "curSkuId", "remoteSkuId", "curSkuId", "remoteSkuId", "targetSkuId", "targetUnit"}, s = {"I$0", "I$0", "I$1", "I$0", "I$1", "I$0", "I$1", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15243a;

        /* renamed from: b, reason: collision with root package name */
        public int f15244b;

        /* renamed from: c, reason: collision with root package name */
        public int f15245c;

        /* renamed from: d, reason: collision with root package name */
        public int f15246d;

        /* renamed from: e, reason: collision with root package name */
        public int f15247e;

        /* renamed from: f, reason: collision with root package name */
        public Object f15248f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f15249g;

        /* renamed from: i, reason: collision with root package name */
        public int f15251i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15249g = obj;
            this.f15251i |= Integer.MIN_VALUE;
            return f.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.MarkSentenceChangedUC", f = "MarkSentenceChangedUC.kt", i = {0}, l = {51}, m = "resetUnit", n = {"skuId"}, s = {"I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15252a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15253b;

        /* renamed from: d, reason: collision with root package name */
        public int f15255d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15253b = obj;
            this.f15255d |= Integer.MIN_VALUE;
            return f.this.c(0, this);
        }
    }

    public f(@m80.k x5.d sentenceUnitRepo, @m80.k c6.b userGameRepo, @m80.k com.baicizhan.app.biz.game.uc.sentence.a checkSentenceUC, @m80.k d extractUnitInfoUC, @m80.k com.baicizhan.app.biz.game.uc.user.e getCurSkuId) {
        g0.p(sentenceUnitRepo, "sentenceUnitRepo");
        g0.p(userGameRepo, "userGameRepo");
        g0.p(checkSentenceUC, "checkSentenceUC");
        g0.p(extractUnitInfoUC, "extractUnitInfoUC");
        g0.p(getCurSkuId, "getCurSkuId");
        this.f15238a = sentenceUnitRepo;
        this.f15239b = userGameRepo;
        this.f15240c = checkSentenceUC;
        this.f15241d = extractUnitInfoUC;
        this.f15242e = getCurSkuId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (c(r4, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r13.o(r2, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r13 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r13 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.f.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r5, j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.game.uc.sentence.f.b
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.game.uc.sentence.f$b r0 = (com.baicizhan.app.biz.game.uc.sentence.f.b) r0
            int r1 = r0.f15255d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15255d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.sentence.f$b r0 = new com.baicizhan.app.biz.game.uc.sentence.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15253b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15255d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f15252a
            kotlin.e.n(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e.n(r6)
            com.baicizhan.app.biz.game.uc.sentence.d r6 = r4.f15241d
            r0.f15252a = r5
            r0.f15255d = r3
            java.lang.Object r6 = r6.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            h5.l0 r6 = (h5.l0) r6
            x5.d r0 = r4.f15238a
            int r6 = r6.l()
            r0.h(r5, r6)
            x5.d r6 = r4.f15238a
            r0 = -1
            r6.a(r5, r0)
            x5.d r6 = r4.f15238a
            r0 = 0
            r6.c(r5, r0)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.f.c(int, j00.c):java.lang.Object");
    }
}
