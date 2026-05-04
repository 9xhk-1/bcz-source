package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", i = {}, l = {739}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements p<ProduceStateScope<Boolean>, j00.c<? super g2>, Object> {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ State<p<EnterExitState, EnterExitState, Boolean>> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition<EnterExitState> transition, State<? extends p<? super EnterExitState, ? super EnterExitState, Boolean>> state, j00.c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> cVar) {
        super(2, cVar);
        this.$childTransition = transition;
        this.$shouldDisposeBlockUpdated$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, cVar);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // x00.p
    public final Object invoke(ProduceStateScope<Boolean> produceStateScope, j00.c<? super g2> cVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create(produceStateScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            final Transition<EnterExitState> transition = this.$childTransition;
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    boolean exitFinished;
                    exitFinished = AnimatedVisibilityKt.getExitFinished(transition);
                    return Boolean.valueOf(exitFinished);
                }
            });
            final Transition<EnterExitState> transition2 = this.$childTransition;
            final State<p<EnterExitState, EnterExitState, Boolean>> state = this.$shouldDisposeBlockUpdated$delegate;
            j jVar = new j() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, j00.c cVar) {
                    return emit(((Boolean) obj2).booleanValue(), (j00.c<? super g2>) cVar);
                }

                public final Object emit(boolean z11, j00.c<? super g2> cVar) {
                    boolean z12;
                    p AnimatedEnterExitImpl$lambda$2;
                    ProduceStateScope<Boolean> produceStateScope2 = produceStateScope;
                    if (z11) {
                        AnimatedEnterExitImpl$lambda$2 = AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$2(state);
                        z12 = ((Boolean) AnimatedEnterExitImpl$lambda$2.invoke(transition2.getCurrentState(), transition2.getTargetState())).booleanValue();
                    } else {
                        z12 = false;
                    }
                    produceStateScope2.setValue(l00.a.a(z12));
                    return g2.f100423a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(jVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
