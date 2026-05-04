package androidx.datastore.core;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n+ 2 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator\n*L\n1#1,205:1\n106#2:206\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1 extends SuspendLambda implements p<r0, c<? super Integer>, Object> {
    int label;
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(MultiProcessCoordinator multiProcessCoordinator, c cVar) {
        super(2, cVar);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        return new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this.this$0, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l c<? super Integer> cVar) {
        return ((MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        SharedCounter sharedCounter;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        sharedCounter = this.this$0.getSharedCounter();
        return l00.a.f(sharedCounter.incrementAndGetValue());
    }
}
