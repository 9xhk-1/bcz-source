package com.baicizhan.app.biz.game.uc.user;

import h5.w0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1", f = "ObserveUserGameInfoUC.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2}, l = {193, 194, 189}, m = "invokeSuspend", n = {"$this$transformLatest", "it", "$completion", "energyModel", "$i$a$-flatMapLatest-ObserveUserGameInfoUC$invoke$3", "$this$transformLatest", "it", "$completion", "energyModel", "currentSnapshot", "$i$a$-flatMapLatest-ObserveUserGameInfoUC$invoke$3", "$this$transformLatest", "it"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 ObserveUserGameInfoUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserGameInfoUC\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,189:1\n53#2,11:190\n67#2:206\n77#2:212\n49#3:201\n51#3:205\n49#3:207\n51#3:211\n46#4:202\n51#4:204\n46#4:208\n51#4:210\n105#5:203\n105#5:209\n*S KotlinDebug\n*F\n+ 1 ObserveUserGameInfoUC.kt\ncom/baicizhan/app/biz/game/uc/user/ObserveUserGameInfoUC\n*L\n63#1:201\n63#1:205\n67#1:207\n67#1:211\n63#1:202\n63#1:204\n67#1:208\n67#1:210\n63#1:203\n67#1:209\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements q<j<? super w0>, h5.g, j00.c<? super g2>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ObserveUserGameInfoUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1(j00.c cVar, ObserveUserGameInfoUC observeUserGameInfoUC) {
        super(3, cVar);
        this.this$0 = observeUserGameInfoUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010a, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r6, r15, r14) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.q
    public final Object invoke(j<? super w0> jVar, h5.g gVar, j00.c<? super g2> cVar) {
        ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1 observeUserGameInfoUC$invoke$$inlined$flatMapLatest$1 = new ObserveUserGameInfoUC$invoke$$inlined$flatMapLatest$1(cVar, this.this$0);
        observeUserGameInfoUC$invoke$$inlined$flatMapLatest$1.L$0 = jVar;
        observeUserGameInfoUC$invoke$$inlined$flatMapLatest$1.L$1 = gVar;
        return observeUserGameInfoUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
