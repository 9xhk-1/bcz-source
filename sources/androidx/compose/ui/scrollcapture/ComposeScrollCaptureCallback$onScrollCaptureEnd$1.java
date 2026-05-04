package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Runnable $onReady;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Runnable runnable, j00.c<? super ComposeScrollCaptureCallback$onScrollCaptureEnd$1> cVar) {
        super(2, cVar);
        this.this$0 = composeScrollCaptureCallback;
        this.$onReady = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.this$0, this.$onReady, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RelativeScroller relativeScroller;
        ComposeScrollCaptureCallback.ScrollCaptureSessionListener scrollCaptureSessionListener;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            relativeScroller = this.this$0.scrollTracker;
            this.label = 1;
            if (relativeScroller.scrollTo(0.0f, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        scrollCaptureSessionListener = this.this$0.listener;
        scrollCaptureSessionListener.onSessionEnded();
        this.$onReady.run();
        return g2.f100423a;
    }
}
