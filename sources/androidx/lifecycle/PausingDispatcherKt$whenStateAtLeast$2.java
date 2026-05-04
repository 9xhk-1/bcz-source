package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.l2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", i = {0}, l = {205}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class PausingDispatcherKt$whenStateAtLeast$2<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {
    final /* synthetic */ p<r0, j00.c<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, j00.c<? super PausingDispatcherKt$whenStateAtLeast$2> cVar) {
        super(2, cVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super T> cVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        LifecycleController lifecycleController;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            l2 l2Var = (l2) ((r0) this.L$0).getCoroutineContext().get(l2.f7886e0);
            if (l2Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, l2Var);
            try {
                p<r0, j00.c<? super T>, Object> pVar = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = c40.i.h(pausingDispatcher, pVar, this);
                if (obj == l11) {
                    return l11;
                }
                lifecycleController = lifecycleController2;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleController = (LifecycleController) this.L$0;
            try {
                kotlin.e.n(obj);
            } catch (Throwable th3) {
                th = th3;
                lifecycleController.finish();
                throw th;
            }
        }
        lifecycleController.finish();
        return obj;
    }
}
