package com.baicizhan.app.biz.game.uc.sentence;

import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import p8.s0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$flatMapLatest$1", f = "ObserverSentenceEntranceUC.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {190, 189}, m = "invokeSuspend", n = {"$this$transformLatest", "it", "$completion", "skuId", "$i$a$-flatMapLatest-ObserverSentenceEntranceUC$invoke$4", "$this$transformLatest", "it"}, s = {"L$0", "L$1", "L$3", "I$0", "I$1", "L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,189:1\n43#2:190\n54#2:192\n189#3:191\n*S KotlinDebug\n*F\n+ 1 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n*L\n43#1:191\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserverSentenceEntranceUC$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements q<kotlinx.coroutines.flow.j<? super Pair<? extends Integer, ? extends s0>>, Integer, j00.c<? super g2>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ObserverSentenceEntranceUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserverSentenceEntranceUC$invoke$$inlined$flatMapLatest$1(j00.c cVar, ObserverSentenceEntranceUC observerSentenceEntranceUC) {
        super(3, cVar);
        this.this$0 = observerSentenceEntranceUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r3, r10, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
            kotlin.e.n(r10)
            goto L95
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            int r1 = r9.I$0
            java.lang.Object r3 = r9.L$3
            j00.c r3 = (j00.c) r3
            java.lang.Object r3 = r9.L$2
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
            java.lang.Object r4 = r9.L$1
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
            kotlin.e.n(r10)
            goto L6e
        L33:
            kotlin.e.n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
            java.lang.Object r4 = r9.L$1
            r1 = r4
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC r5 = r9.this$0
            x5.c r5 = com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC.c(r5)
            java.lang.Object r6 = l00.k.a(r10)
            r9.L$0 = r6
            java.lang.Object r6 = l00.k.a(r4)
            r9.L$1 = r6
            r9.L$2 = r10
            java.lang.Object r6 = l00.k.a(r9)
            r9.L$3 = r6
            r9.I$0 = r1
            r6 = 0
            r9.I$1 = r6
            r9.label = r3
            java.lang.Object r3 = r5.d(r9)
            if (r3 != r0) goto L6b
            goto L94
        L6b:
            r5 = r10
            r10 = r3
            r3 = r5
        L6e:
            kotlinx.coroutines.flow.i r10 = (kotlinx.coroutines.flow.i) r10
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1 r6 = new com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC r7 = r9.this$0
            r8 = 0
            r6.<init>(r8, r7, r1)
            kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.k.f2(r10, r6)
            java.lang.Object r1 = l00.k.a(r5)
            r9.L$0 = r1
            java.lang.Object r1 = l00.k.a(r4)
            r9.L$1 = r1
            r9.L$2 = r8
            r9.L$3 = r8
            r9.label = r2
            java.lang.Object r10 = kotlinx.coroutines.flow.k.o0(r3, r10, r9)
            if (r10 != r0) goto L95
        L94:
            return r0
        L95:
            yz.g2 r10 = yz.g2.f100423a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.q
    public final Object invoke(kotlinx.coroutines.flow.j<? super Pair<? extends Integer, ? extends s0>> jVar, Integer num, j00.c<? super g2> cVar) {
        ObserverSentenceEntranceUC$invoke$$inlined$flatMapLatest$1 observerSentenceEntranceUC$invoke$$inlined$flatMapLatest$1 = new ObserverSentenceEntranceUC$invoke$$inlined$flatMapLatest$1(cVar, this.this$0);
        observerSentenceEntranceUC$invoke$$inlined$flatMapLatest$1.L$0 = jVar;
        observerSentenceEntranceUC$invoke$$inlined$flatMapLatest$1.L$1 = num;
        return observerSentenceEntranceUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
