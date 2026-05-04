package androidx.compose.foundation.contextmenu;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", i = {0}, l = {71}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ContextMenuGestures_androidKt$awaitFirstRightClickDown$1(c<? super ContextMenuGestures_androidKt$awaitFirstRightClickDown$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object awaitFirstRightClickDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitFirstRightClickDown = ContextMenuGestures_androidKt.awaitFirstRightClickDown(null, this);
        return awaitFirstRightClickDown;
    }
}
