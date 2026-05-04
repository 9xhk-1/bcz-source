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

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nMultiProcessCoordinator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiProcessCoordinator.android.kt\nandroidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2\n*L\n1#1,205:1\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiProcessCoordinator$withLazyCounter$2<T> extends SuspendLambda implements p<r0, c<? super T>, Object> {
    final /* synthetic */ p<SharedCounter, c<? super T>, Object> $block;
    int label;
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiProcessCoordinator$withLazyCounter$2(p<? super SharedCounter, ? super c<? super T>, ? extends Object> pVar, MultiProcessCoordinator multiProcessCoordinator, c<? super MultiProcessCoordinator$withLazyCounter$2> cVar) {
        super(2, cVar);
        this.$block = pVar;
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        return new MultiProcessCoordinator$withLazyCounter$2(this.$block, this.this$0, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l c<? super T> cVar) {
        return ((MultiProcessCoordinator$withLazyCounter$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        SharedCounter sharedCounter;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return obj;
        }
        e.n(obj);
        p<SharedCounter, c<? super T>, Object> pVar = this.$block;
        sharedCounter = this.this$0.getSharedCounter();
        this.label = 1;
        Object invoke = pVar.invoke(sharedCounter, this);
        return invoke == l11 ? l11 : invoke;
    }

    @l
    public final Object invokeSuspend$$forInline(@k Object obj) {
        SharedCounter sharedCounter;
        p<SharedCounter, c<? super T>, Object> pVar = this.$block;
        sharedCounter = this.this$0.getSharedCounter();
        return pVar.invoke(sharedCounter, this);
    }
}
