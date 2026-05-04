package com.baicizhan.app.biz.game.uc.sentence;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ObserverSentenceJourneyUC f15258a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceJourneyWithoutRewardUC", f = "ObserverSentenceJourneyWithoutRewardUC.kt", i = {0}, l = {14}, m = "invoke", n = {"skuId"}, s = {"I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15259a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15260b;

        /* renamed from: d, reason: collision with root package name */
        public int f15262d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15260b = obj;
            this.f15262d |= Integer.MIN_VALUE;
            return i.this.a(0, this);
        }
    }

    public i(@m80.k ObserverSentenceJourneyUC observerSentenceJourneyUC) {
        g0.p(observerSentenceJourneyUC, "observerSentenceJourneyUC");
        this.f15258a = observerSentenceJourneyUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, @m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.j0>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.game.uc.sentence.i.a
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.game.uc.sentence.i$a r0 = (com.baicizhan.app.biz.game.uc.sentence.i.a) r0
            int r1 = r0.f15262d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15262d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.sentence.i$a r0 = new com.baicizhan.app.biz.game.uc.sentence.i$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15260b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15262d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceJourneyUC r6 = r4.f15258a
            r0.f15259a = r5
            r0.f15262d = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.i r6 = (kotlinx.coroutines.flow.i) r6
            kotlinx.coroutines.flow.i r5 = kotlinx.coroutines.flow.k.i0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.i.a(int, j00.c):java.lang.Object");
    }
}
