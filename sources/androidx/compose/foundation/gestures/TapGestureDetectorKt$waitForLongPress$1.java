package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {384}, m = "waitForLongPress", n = {"result"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$waitForLongPress$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TapGestureDetectorKt$waitForLongPress$1(c<? super TapGestureDetectorKt$waitForLongPress$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.waitForLongPress(null, null, this);
    }
}
