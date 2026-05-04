package androidx.compose.ui.contentcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", i = {0, 1}, l = {177, 186}, m = "boundsUpdatesEventLoop$ui_release", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidContentCaptureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, j00.c<? super AndroidContentCaptureManager$boundsUpdatesEventLoop$1> cVar) {
        super(cVar);
        this.this$0 = androidContentCaptureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.boundsUpdatesEventLoop$ui_release(this);
    }
}
