package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {299}, m = "awaitFirstCtrlMouseScroll", n = {"$this$awaitFirstCtrlMouseScroll", "scrollConfig"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class TransformableKt$awaitFirstCtrlMouseScroll$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public TransformableKt$awaitFirstCtrlMouseScroll$1(c<? super TransformableKt$awaitFirstCtrlMouseScroll$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object awaitFirstCtrlMouseScroll;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitFirstCtrlMouseScroll = TransformableKt.awaitFirstCtrlMouseScroll(null, null, this);
        return awaitFirstCtrlMouseScroll;
    }
}
