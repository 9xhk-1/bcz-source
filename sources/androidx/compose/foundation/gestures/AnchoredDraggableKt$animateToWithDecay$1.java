package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1380}, m = "animateToWithDecay", n = {"remainingVelocity", "velocity"}, s = {"L$0", "F$0"})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateToWithDecay$1<T> extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$animateToWithDecay$1(c<? super AnchoredDraggableKt$animateToWithDecay$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
    }
}
