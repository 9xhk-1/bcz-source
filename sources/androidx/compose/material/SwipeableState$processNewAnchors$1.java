package androidx.compose.material;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {154, 179, 182}, m = "processNewAnchors$material_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* loaded from: classes.dex */
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, c<? super SwipeableState$processNewAnchors$1> cVar) {
        super(cVar);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$material_release(null, null, this);
    }
}
