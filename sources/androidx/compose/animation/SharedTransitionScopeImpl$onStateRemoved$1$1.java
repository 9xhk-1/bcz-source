package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.animation.SharedTransitionScopeImpl$onStateRemoved$1$1", f = "SharedTransitionScope.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$onStateRemoved$1$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ SharedElement $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$onStateRemoved$1$1(SharedElement sharedElement, j00.c<? super SharedTransitionScopeImpl$onStateRemoved$1$1> cVar) {
        super(2, cVar);
        this.$this_with = sharedElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new SharedTransitionScopeImpl$onStateRemoved$1$1(this.$this_with, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((SharedTransitionScopeImpl$onStateRemoved$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableScatterMap mutableScatterMap;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        if (this.$this_with.getStates().isEmpty()) {
            mutableScatterMap = this.$this_with.getScope().sharedElements;
            mutableScatterMap.remove(this.$this_with.getKey());
        }
        return g2.f100423a;
    }
}
