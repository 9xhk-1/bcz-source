package com.baicizhan.app.biz.game.uc.incentive;

import com.baicizhan.online.playground_api.LavaquestGameInfo;
import h5.w;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1", f = "ObserveLavaQuestUC.kt", i = {0, 0, 0, 0, 0, 0, 1, 1}, l = {190, 189}, m = "invokeSuspend", n = {"$this$transformLatest", "it", "$completion", "lava", "$i$a$-flatMapLatest-ObserveLavaQuestUC$invoke$4", "noLifeEnable", "$this$transformLatest", "it"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "Z$0", "L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 ObserveLavaQuestUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/ObserveLavaQuestUC\n*L\n1#1,189:1\n41#2:190\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super w>, Pair<? extends LavaquestGameInfo, ? extends Boolean>, j00.c<? super g2>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ ObserveLavaQuestUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1(j00.c cVar, ObserveLavaQuestUC observeLavaQuestUC) {
        super(3, cVar);
        this.this$0 = observeLavaQuestUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r1, (kotlinx.coroutines.flow.i) r9, r8) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r8.L$0
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
            kotlin.e.n(r9)
            goto L9e
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.L$4
            com.baicizhan.online.playground_api.LavaquestGameInfo r1 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r1
            java.lang.Object r1 = r8.L$3
            j00.c r1 = (j00.c) r1
            java.lang.Object r1 = r8.L$2
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r3 = r8.L$1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.e.n(r9)
            goto L80
        L35:
            kotlin.e.n(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r9 = r8.L$1
            r4 = r9
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            com.baicizhan.online.playground_api.LavaquestGameInfo r5 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r5
            java.lang.Object r4 = r4.component2()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC r6 = r8.this$0
            java.lang.Object r7 = l00.k.a(r1)
            r8.L$0 = r7
            java.lang.Object r7 = l00.k.a(r9)
            r8.L$1 = r7
            r8.L$2 = r1
            java.lang.Object r7 = l00.k.a(r8)
            r8.L$3 = r7
            java.lang.Object r7 = l00.k.a(r5)
            r8.L$4 = r7
            r7 = 0
            r8.I$0 = r7
            r8.Z$0 = r4
            r8.label = r3
            java.lang.Object r3 = com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.a(r6, r5, r4, r8)
            if (r3 != r0) goto L7c
            goto L9d
        L7c:
            r4 = r3
            r3 = r9
            r9 = r4
            r4 = r1
        L80:
            kotlinx.coroutines.flow.i r9 = (kotlinx.coroutines.flow.i) r9
            java.lang.Object r4 = l00.k.a(r4)
            r8.L$0 = r4
            java.lang.Object r3 = l00.k.a(r3)
            r8.L$1 = r3
            r3 = 0
            r8.L$2 = r3
            r8.L$3 = r3
            r8.L$4 = r3
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.k.o0(r1, r9, r8)
            if (r9 != r0) goto L9e
        L9d:
            return r0
        L9e:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.q
    public final Object invoke(kotlinx.coroutines.flow.j<? super w> jVar, Pair<? extends LavaquestGameInfo, ? extends Boolean> pair, j00.c<? super g2> cVar) {
        ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1 observeLavaQuestUC$invoke$$inlined$flatMapLatest$1 = new ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1(cVar, this.this$0);
        observeLavaQuestUC$invoke$$inlined$flatMapLatest$1.L$0 = jVar;
        observeLavaQuestUC$invoke$$inlined$flatMapLatest$1.L$1 = pair;
        return observeLavaQuestUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
