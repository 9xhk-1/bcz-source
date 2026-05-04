package androidx.compose.material;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.a;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SwitchKt$Switch$2$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ boolean $checked;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$1(boolean z11, AnchoredDraggableState<Boolean> anchoredDraggableState, c<? super SwitchKt$Switch$2$1> cVar) {
        super(2, cVar);
        this.$checked = z11;
        this.$anchoredDraggableState = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new SwitchKt$Switch$2$1(this.$checked, this.$anchoredDraggableState, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((SwitchKt$Switch$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            if (this.$checked != this.$anchoredDraggableState.getCurrentValue().booleanValue()) {
                AnchoredDraggableState<Boolean> anchoredDraggableState = this.$anchoredDraggableState;
                Boolean a11 = a.a(this.$checked);
                this.label = 1;
                if (AnchoredDraggableKt.animateTo$default(anchoredDraggableState, a11, 0.0f, this, 2, null) == l11) {
                    return l11;
                }
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
