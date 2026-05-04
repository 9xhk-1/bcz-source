package com.baicizhan.client.business.util;

import c40.s0;
import c40.t1;
import e40.g0;
import e40.i0;
import e40.l0;
import e40.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "com.baicizhan.client.business.util.RxFlowUtilsKt$asFlow$1", f = "RxFlowUtils.kt", i = {0, 0}, l = {39}, m = "invokeSuspend", n = {"$this$callbackFlow", "sub"}, s = {"L$0", "L$1"}, v = 1)
@u0({"SMAP\nRxFlowUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxFlowUtils.kt\ncom/baicizhan/client/business/util/RxFlowUtilsKt$asFlow$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,60:1\n1009#2,2:61\n1047#2,2:63\n1026#2,2:65\n*S KotlinDebug\n*F\n+ 1 RxFlowUtils.kt\ncom/baicizhan/client/business/util/RxFlowUtilsKt$asFlow$1\n*L\n23#1:61,2\n24#1:63,2\n27#1:65,2\n*E\n"})
/* loaded from: classes4.dex */
public final class RxFlowUtilsKt$asFlow$1<T> extends SuspendLambda implements x00.p<i0<? super T>, j00.c<? super g2>, Object> {
    final /* synthetic */ rx.c<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxFlowUtilsKt$asFlow$1(rx.c<T> cVar, j00.c<? super RxFlowUtilsKt$asFlow$1> cVar2) {
        super(2, cVar2);
        this.$this_asFlow = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 invokeSuspend$lambda$0(i0 i0Var, Object obj) {
        Object m02 = e40.u.m0(i0Var, obj);
        boolean z11 = m02 instanceof s.c;
        if (!z11) {
        }
        if (m02 instanceof s.a) {
            qb.c.h(KotlinExtKt.TAG, "", e40.s.f(m02));
        }
        if (z11) {
            qb.c.c(KotlinExtKt.TAG, "", e40.s.f(m02));
        }
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(i0 i0Var, Throwable th2) {
        s0.d(i0Var, t1.a("ERROR", th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(i0 i0Var) {
        l0.a.a(i0Var.getChannel(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 invokeSuspend$lambda$4(qb0.h hVar) {
        hVar.unsubscribe();
        return g2.f100423a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        RxFlowUtilsKt$asFlow$1 rxFlowUtilsKt$asFlow$1 = new RxFlowUtilsKt$asFlow$1(this.$this_asFlow, cVar);
        rxFlowUtilsKt$asFlow$1.L$0 = obj;
        return rxFlowUtilsKt$asFlow$1;
    }

    @Override // x00.p
    public final Object invoke(i0<? super T> i0Var, j00.c<? super g2> cVar) {
        return ((RxFlowUtilsKt$asFlow$1) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final i0 i0Var = (i0) this.L$0;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            rx.c<T> cVar = this.$this_asFlow;
            final x00.l lVar = new x00.l() { // from class: com.baicizhan.client.business.util.r
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = RxFlowUtilsKt$asFlow$1.invokeSuspend$lambda$0(i0.this, obj2);
                    return invokeSuspend$lambda$0;
                }
            };
            final qb0.h v52 = cVar.v5(new wb0.b() { // from class: com.baicizhan.client.business.util.s
                @Override // wb0.b
                public final void call(Object obj2) {
                    x00.l.this.invoke(obj2);
                }
            }, new wb0.b() { // from class: com.baicizhan.client.business.util.t
                @Override // wb0.b
                public final void call(Object obj2) {
                    RxFlowUtilsKt$asFlow$1.invokeSuspend$lambda$2(i0.this, (Throwable) obj2);
                }
            }, new wb0.a() { // from class: com.baicizhan.client.business.util.u
                @Override // wb0.a
                public final void call() {
                    RxFlowUtilsKt$asFlow$1.invokeSuspend$lambda$3(i0.this);
                }
            });
            x00.a aVar = new x00.a() { // from class: com.baicizhan.client.business.util.v
                @Override // x00.a
                public final Object invoke() {
                    g2 invokeSuspend$lambda$4;
                    invokeSuspend$lambda$4 = RxFlowUtilsKt$asFlow$1.invokeSuspend$lambda$4(qb0.h.this);
                    return invokeSuspend$lambda$4;
                }
            };
            this.L$0 = l00.k.a(i0Var);
            this.L$1 = l00.k.a(v52);
            this.label = 1;
            if (g0.b(i0Var, aVar, this) == l11) {
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
}
