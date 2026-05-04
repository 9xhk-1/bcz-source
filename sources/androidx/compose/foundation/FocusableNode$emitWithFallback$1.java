package androidx.compose.foundation;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import c40.k1;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class FocusableNode$emitWithFallback$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ k1 $handler;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$1(MutableInteractionSource mutableInteractionSource, Interaction interaction, k1 k1Var, j00.c<? super FocusableNode$emitWithFallback$1> cVar) {
        super(2, cVar);
        this.$this_emitWithFallback = mutableInteractionSource;
        this.$interaction = interaction;
        this.$handler = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new FocusableNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, this.$handler, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((FocusableNode$emitWithFallback$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            MutableInteractionSource mutableInteractionSource = this.$this_emitWithFallback;
            Interaction interaction = this.$interaction;
            this.label = 1;
            if (mutableInteractionSource.emit(interaction, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        k1 k1Var = this.$handler;
        if (k1Var != null) {
            k1Var.dispose();
        }
        return g2.f100423a;
    }
}
