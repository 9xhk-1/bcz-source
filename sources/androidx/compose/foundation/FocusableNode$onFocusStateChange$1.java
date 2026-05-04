package androidx.compose.foundation;

import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", f = "Focusable.kt", i = {}, l = {com.jiongji.andriod.card.R.styleable.Theme_drawable_review_sound}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class FocusableNode$onFocusStateChange$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ FocusableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$onFocusStateChange$1(FocusableNode focusableNode, j00.c<? super FocusableNode$onFocusStateChange$1> cVar) {
        super(2, cVar);
        this.this$0 = focusableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new FocusableNode$onFocusStateChange$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((FocusableNode$onFocusStateChange$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            FocusableNode focusableNode = this.this$0;
            this.label = 1;
            if (BringIntoViewModifierNodeKt.bringIntoView$default(focusableNode, null, this, 1, null) == l11) {
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
