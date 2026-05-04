package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {209}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TapGestureDetectorKt$consumeUntilUp$1(c<? super TapGestureDetectorKt$consumeUntilUp$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object consumeUntilUp;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(null, this);
        return consumeUntilUp;
    }
}
