package com.baicizhan.app.biz.game.uc.ipavatar;

import h5.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$invoke$$inlined$flatMapLatest$1", f = "ObserveIpAvatarUC.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {191, 189}, m = "invokeSuspend", n = {"$this$transformLatest", "it", "$completion", "hasIp", "$i$a$-flatMapLatest-ObserveIpAvatarUC$invoke$3", "$this$transformLatest", "it"}, s = {"L$0", "L$1", "L$3", "Z$0", "I$0", "L$0", "L$1"}, v = 1)
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 ObserveIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ObserveIpAvatarUC\n*L\n1#1,189:1\n50#2,6:190\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveIpAvatarUC$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements q<kotlinx.coroutines.flow.j<? super s>, Boolean, j00.c<? super g2>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ ObserveIpAvatarUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveIpAvatarUC$invoke$$inlined$flatMapLatest$1(j00.c cVar, ObserveIpAvatarUC observeIpAvatarUC) {
        super(3, cVar);
        this.this$0 = observeIpAvatarUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r1, (kotlinx.coroutines.flow.i) r8, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r3 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
            kotlin.e.n(r8)
            goto L8e
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.L$3
            j00.c r1 = (j00.c) r1
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r3 = r7.L$1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.e.n(r8)
            goto L72
        L31:
            kotlin.e.n(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            java.lang.Object r8 = r7.L$1
            r4 = r8
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L68
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC r5 = r7.this$0
            java.lang.Object r6 = l00.k.a(r1)
            r7.L$0 = r6
            java.lang.Object r6 = l00.k.a(r8)
            r7.L$1 = r6
            r7.L$2 = r1
            java.lang.Object r6 = l00.k.a(r7)
            r7.L$3 = r6
            r7.Z$0 = r4
            r4 = 0
            r7.I$0 = r4
            r7.label = r3
            java.lang.Object r3 = r5.p(r7)
            if (r3 != r0) goto L6e
            goto L8d
        L68:
            com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC r3 = r7.this$0
            kotlinx.coroutines.flow.i r3 = r3.q()
        L6e:
            r4 = r3
            r3 = r8
            r8 = r4
            r4 = r1
        L72:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            java.lang.Object r4 = l00.k.a(r4)
            r7.L$0 = r4
            java.lang.Object r3 = l00.k.a(r3)
            r7.L$1 = r3
            r3 = 0
            r7.L$2 = r3
            r7.L$3 = r3
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.k.o0(r1, r8, r7)
            if (r8 != r0) goto L8e
        L8d:
            return r0
        L8e:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.q
    public final Object invoke(kotlinx.coroutines.flow.j<? super s> jVar, Boolean bool, j00.c<? super g2> cVar) {
        ObserveIpAvatarUC$invoke$$inlined$flatMapLatest$1 observeIpAvatarUC$invoke$$inlined$flatMapLatest$1 = new ObserveIpAvatarUC$invoke$$inlined$flatMapLatest$1(cVar, this.this$0);
        observeIpAvatarUC$invoke$$inlined$flatMapLatest$1.L$0 = jVar;
        observeIpAvatarUC$invoke$$inlined$flatMapLatest$1.L$1 = bool;
        return observeIpAvatarUC$invoke$$inlined$flatMapLatest$1.invokeSuspend(g2.f100423a);
    }
}
