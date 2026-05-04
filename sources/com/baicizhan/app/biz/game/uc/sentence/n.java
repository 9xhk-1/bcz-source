package com.baicizhan.app.biz.game.uc.sentence;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x5.d f15342a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d f15343b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SwitchSentenceUnitUC", f = "SwitchSentenceUnitUC.kt", i = {0, 0, 0}, l = {21}, m = "invoke", n = {"skuId", "unitId", "curUnitId"}, s = {"I$0", "I$1", "I$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15344a;

        /* renamed from: b, reason: collision with root package name */
        public int f15345b;

        /* renamed from: c, reason: collision with root package name */
        public int f15346c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15347d;

        /* renamed from: f, reason: collision with root package name */
        public int f15349f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15347d = obj;
            this.f15349f |= Integer.MIN_VALUE;
            return n.this.a(0, 0, this);
        }
    }

    public n(@m80.k x5.d sentenceUnit, @m80.k d extractUnitInfoUC) {
        g0.p(sentenceUnit, "sentenceUnit");
        g0.p(extractUnitInfoUC, "extractUnitInfoUC");
        this.f15342a = sentenceUnit;
        this.f15343b = extractUnitInfoUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r13, int r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.baicizhan.app.biz.game.uc.sentence.n.a
            if (r0 == 0) goto L13
            r0 = r15
            com.baicizhan.app.biz.game.uc.sentence.n$a r0 = (com.baicizhan.app.biz.game.uc.sentence.n.a) r0
            int r1 = r0.f15349f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15349f = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.sentence.n$a r0 = new com.baicizhan.app.biz.game.uc.sentence.n$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f15347d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15349f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r14 = r0.f15345b
            int r13 = r0.f15344a
            kotlin.e.n(r15)
            goto L85
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.e.n(r15)
            x5.d r15 = r12.f15342a
            int r15 = r15.b(r13)
            z6.b r4 = z6.b.f101032b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Switching sentence unit Sku "
            r2.append(r5)
            r2.append(r13)
            java.lang.String r5 = " from "
            r2.append(r5)
            r2.append(r15)
            java.lang.String r5 = " to "
            r2.append(r5)
            r2.append(r14)
            java.lang.String r6 = r2.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "SwitchSentenceUnitUC"
            r7 = 0
            z6.b.j(r4, r5, r6, r7, r8, r9)
            if (r15 != r14) goto L74
            x5.d r14 = r12.f15342a
            r15 = -1
            r14.a(r13, r15)
            yz.g2 r13 = yz.g2.f100423a
            return r13
        L74:
            com.baicizhan.app.biz.game.uc.sentence.d r2 = r12.f15343b
            r0.f15344a = r13
            r0.f15345b = r14
            r0.f15346c = r15
            r0.f15349f = r3
            java.lang.Object r15 = r2.a(r13, r14, r0)
            if (r15 != r1) goto L85
            return r1
        L85:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L95
            x5.d r15 = r12.f15342a
            r15.a(r13, r14)
            yz.g2 r13 = yz.g2.f100423a
            return r13
        L95:
            z6.b r0 = z6.b.f101032b
            r4 = 4
            r5 = 0
            java.lang.String r1 = "SwitchSentenceUnitUC"
            java.lang.String r2 = "Switching sentence unit failed"
            r3 = 0
            z6.b.j(r0, r1, r2, r3, r4, r5)
            com.baicizhan.app.biz.base.BizInternalException r6 = new com.baicizhan.app.biz.base.BizInternalException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "unitId Illegal "
            r13.append(r15)
            r13.append(r14)
            java.lang.String r7 = r13.toString()
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.n.a(int, int, j00.c):java.lang.Object");
    }
}
