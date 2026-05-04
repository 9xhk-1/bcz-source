package androidx.lifecycle;

import c40.a1;
import c40.l2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class BlockRunner$cancel$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ BlockRunner<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(BlockRunner<T> blockRunner, j00.c<? super BlockRunner$cancel$1> cVar) {
        super(2, cVar);
        this.this$0 = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        return new BlockRunner$cancel$1(this.this$0, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
        return ((BlockRunner$cancel$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        long j11;
        CoroutineLiveData coroutineLiveData;
        l2 l2Var;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            j11 = ((BlockRunner) this.this$0).timeoutInMs;
            this.label = 1;
            if (a1.b(j11, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        coroutineLiveData = ((BlockRunner) this.this$0).liveData;
        if (!coroutineLiveData.hasActiveObservers()) {
            l2Var = ((BlockRunner) this.this$0).runningJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            ((BlockRunner) this.this$0).runningJob = null;
        }
        return g2.f100423a;
    }
}
