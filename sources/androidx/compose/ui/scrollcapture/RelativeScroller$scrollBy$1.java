package androidx.compose.ui.scrollcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {296}, m = "scrollBy", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class RelativeScroller$scrollBy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RelativeScroller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeScroller$scrollBy$1(RelativeScroller relativeScroller, j00.c<? super RelativeScroller$scrollBy$1> cVar) {
        super(cVar);
        this.this$0 = relativeScroller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object scrollBy;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        scrollBy = this.this$0.scrollBy(0.0f, this);
        return scrollBy;
    }
}
