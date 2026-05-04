package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {281, 322}, m = "touchSelectionSubsequentPress", n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public SelectionGesturesKt$touchSelectionSubsequentPress$1(j00.c<? super SelectionGesturesKt$touchSelectionSubsequentPress$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = SelectionGesturesKt.touchSelectionSubsequentPress(null, null, null, this);
        return obj2;
    }
}
