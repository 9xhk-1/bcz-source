package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements i<R> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f67831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x00.q f67832b;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(i iVar, x00.q qVar) {
        this.f67831a = iVar;
        this.f67832b = qVar;
    }

    @Override // kotlinx.coroutines.flow.i
    public Object collect(j<? super R> jVar, j00.c<? super g2> cVar) {
        Object collect = this.f67831a.collect(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f67832b, jVar), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    public Object g(j jVar, j00.c cVar) {
        kotlin.jvm.internal.d0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        kotlin.jvm.internal.d0.e(5);
        i iVar = this.f67831a;
        FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1 = new FlowKt__EmittersKt$unsafeTransform$1$1(this.f67832b, jVar);
        kotlin.jvm.internal.d0.e(0);
        iVar.collect(flowKt__EmittersKt$unsafeTransform$1$1, cVar);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }
}
