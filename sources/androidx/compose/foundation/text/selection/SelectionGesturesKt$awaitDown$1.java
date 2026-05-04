package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {430}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt$awaitDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SelectionGesturesKt$awaitDown$1(j00.c<? super SelectionGesturesKt$awaitDown$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object awaitDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitDown = SelectionGesturesKt.awaitDown(null, this);
        return awaitDown;
    }
}
