package com.baicizhan.app.biz.game.uc.ipavatar;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1", f = "ObserveIpAvatarUC.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, s = {"L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC\n*L\n1#1,189:1\n85#2:190\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements q<kotlinx.coroutines.flow.j<? super h8.d>, h8.d, j00.c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ObserveIpAvatarUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1(j00.c cVar, ObserveIpAvatarUC observeIpAvatarUC) {
        super(3, cVar);
        this.this$0 = observeIpAvatarUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.i k11;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
            Object obj2 = this.L$1;
            k11 = this.this$0.k((h8.d) obj2);
            this.L$0 = l00.k.a(jVar);
            this.L$1 = l00.k.a(obj2);
            this.label = 1;
            if (kotlinx.coroutines.flow.k.o0(jVar, k11, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }

    @Override // x00.q
    public final Object invoke(kotlinx.coroutines.flow.j<? super h8.d> jVar, h8.d dVar, j00.c<? super g2> cVar) {
        ObserveIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1 observeIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1 = new ObserveIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1(cVar, this.this$0);
        observeIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1.L$0 = jVar;
        observeIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1.L$1 = dVar;
        return observeIpAvatarUC$ownedFlow$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
