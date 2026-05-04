package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", i = {}, l = {1202}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AbstractClickableNode$onKeyEvent$2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ PressInteraction.Press $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$2(AbstractClickableNode abstractClickableNode, PressInteraction.Press press, j00.c<? super AbstractClickableNode$onKeyEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = abstractClickableNode;
        this.$press = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new AbstractClickableNode$onKeyEvent$2(this.this$0, this.$press, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((AbstractClickableNode$onKeyEvent$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableInteractionSource mutableInteractionSource;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            mutableInteractionSource = this.this$0.interactionSource;
            if (mutableInteractionSource != null) {
                PressInteraction.Release release = new PressInteraction.Release(this.$press);
                this.label = 1;
                if (mutableInteractionSource.emit(release, this) == l11) {
                    return l11;
                }
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
