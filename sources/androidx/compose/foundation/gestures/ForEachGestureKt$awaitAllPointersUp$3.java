package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0}, l = {84}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp", "pass"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitAllPointersUp$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ForEachGestureKt$awaitAllPointersUp$3(c<? super ForEachGestureKt$awaitAllPointersUp$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGestureKt.awaitAllPointersUp(null, null, this);
    }
}
