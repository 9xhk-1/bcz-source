package com.baicizhan.app.biz.game.uc.sentence;

import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import p8.s0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1", f = "ObserverSentenceEntranceUC.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {190, 189}, m = "invokeSuspend", n = {"$this$transformLatest", "it", "$completion", "$this$invoke_u24lambda_u242_u240_u240", "it", "$i$a$-flatMapLatest-ObserverSentenceEntranceUC$invoke$4$1", "$i$a$-runCatching-ObserverSentenceEntranceUC$invoke$4$1$sku$1", "$this$transformLatest", "it"}, s = {"L$0", "L$1", "L$3", "L$4", "Z$0", "I$0", "I$1", "L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 ObserverSentenceEntranceUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ObserverSentenceEntranceUC\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n44#2:190\n45#2,9:192\n1#3:191\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1 extends SuspendLambda implements q<kotlinx.coroutines.flow.j<? super Pair<? extends Integer, ? extends s0>>, Boolean, j00.c<? super g2>, Object> {
    final /* synthetic */ int $skuId$inlined;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ ObserverSentenceEntranceUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1(j00.c cVar, ObserverSentenceEntranceUC observerSentenceEntranceUC, int i11) {
        super(3, cVar);
        this.this$0 = observerSentenceEntranceUC;
        this.$skuId$inlined = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r1, r13, r12) != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L38
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
            kotlin.e.n(r13)
            goto Ldb
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.L$4
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC r1 = (com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC) r1
            java.lang.Object r1 = r12.L$3
            j00.c r1 = (j00.c) r1
            java.lang.Object r1 = r12.L$2
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r5 = r12.L$1
            java.lang.Object r6 = r12.L$0
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L36
            goto L7d
        L36:
            r13 = move-exception
            goto L86
        L38:
            kotlin.e.n(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r5 = r12.L$1
            r13 = r5
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC r6 = r12.this$0
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L84
            x5.c r7 = com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC.c(r6)     // Catch: java.lang.Throwable -> L84
            int r8 = r12.$skuId$inlined     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = l00.k.a(r1)     // Catch: java.lang.Throwable -> L84
            r12.L$0 = r9     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = l00.k.a(r5)     // Catch: java.lang.Throwable -> L84
            r12.L$1 = r9     // Catch: java.lang.Throwable -> L84
            r12.L$2 = r1     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = l00.k.a(r12)     // Catch: java.lang.Throwable -> L84
            r12.L$3 = r9     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = l00.k.a(r6)     // Catch: java.lang.Throwable -> L84
            r12.L$4 = r6     // Catch: java.lang.Throwable -> L84
            r12.Z$0 = r13     // Catch: java.lang.Throwable -> L84
            r12.I$0 = r2     // Catch: java.lang.Throwable -> L84
            r12.I$1 = r2     // Catch: java.lang.Throwable -> L84
            r12.label = r4     // Catch: java.lang.Throwable -> L84
            java.lang.Object r13 = r7.b(r8, r12)     // Catch: java.lang.Throwable -> L84
            if (r13 != r0) goto L7c
            goto Lda
        L7c:
            r6 = r1
        L7d:
            p8.s0 r13 = (p8.s0) r13     // Catch: java.lang.Throwable -> L36
            java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)     // Catch: java.lang.Throwable -> L36
            goto L90
        L84:
            r13 = move-exception
            r6 = r1
        L86:
            kotlin.Result$a r7 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.e.a(r13)
            java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)
        L90:
            boolean r7 = kotlin.Result.m6314isFailureimpl(r13)
            r8 = 0
            if (r7 == 0) goto L98
            r13 = r8
        L98:
            p8.s0 r13 = (p8.s0) r13
            kotlin.Pair r7 = new kotlin.Pair
            int r9 = r12.$skuId$inlined
            java.lang.Integer r9 = l00.a.f(r9)
            r7.<init>(r9, r13)
            kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.k.N0(r7)
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$a r9 = new com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$a
            int r10 = r12.$skuId$inlined
            com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC r11 = r12.this$0
            r9.<init>(r13, r10, r11, r8)
            kotlinx.coroutines.flow.i r13 = kotlinx.coroutines.flow.k.K0(r9)
            kotlinx.coroutines.flow.i[] r9 = new kotlinx.coroutines.flow.i[r3]
            r9[r2] = r7
            r9[r4] = r13
            kotlinx.coroutines.flow.i r13 = kotlinx.coroutines.flow.k.c1(r9)
            java.lang.Object r2 = l00.k.a(r6)
            r12.L$0 = r2
            java.lang.Object r2 = l00.k.a(r5)
            r12.L$1 = r2
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r3
            java.lang.Object r13 = kotlinx.coroutines.flow.k.o0(r1, r13, r12)
            if (r13 != r0) goto Ldb
        Lda:
            return r0
        Ldb:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.q
    public final Object invoke(kotlinx.coroutines.flow.j<? super Pair<? extends Integer, ? extends s0>> jVar, Boolean bool, j00.c<? super g2> cVar) {
        ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1 observerSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1 = new ObserverSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1(cVar, this.this$0, this.$skuId$inlined);
        observerSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1.L$0 = jVar;
        observerSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1.L$1 = bool;
        return observerSentenceEntranceUC$invoke$lambda$2$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
