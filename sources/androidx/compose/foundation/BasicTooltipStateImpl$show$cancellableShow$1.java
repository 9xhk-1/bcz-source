package androidx.compose.foundation;

import c40.p;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,390:1\n314#2,11:391\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipStateImpl$show$cancellableShow$1\n*L\n299#1:391,11\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements l<j00.c<? super g2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, j00.c<? super BasicTooltipStateImpl$show$cancellableShow$1> cVar) {
        super(1, cVar);
        this.this$0 = basicTooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.this$0, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            BasicTooltipStateImpl basicTooltipStateImpl = this.this$0;
            this.L$0 = basicTooltipStateImpl;
            this.label = 1;
            p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(this), 1);
            pVar.y();
            basicTooltipStateImpl.setVisible(true);
            basicTooltipStateImpl.job = pVar;
            Object F = pVar.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(this);
            }
            if (F == l11) {
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
