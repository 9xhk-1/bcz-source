package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.unit.IntRect;
import c40.r0;
import java.util.function.Consumer;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Rect $captureArea;
    final /* synthetic */ Consumer<Rect> $onComplete;
    final /* synthetic */ ScrollCaptureSession $session;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, j00.c<? super ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1> cVar) {
        super(2, cVar);
        this.this$0 = composeScrollCaptureCallback;
        this.$session = scrollCaptureSession;
        this.$captureArea = rect;
        this.$onComplete = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.this$0, this.$session, this.$captureArea, this.$onComplete, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.this$0;
            ScrollCaptureSession scrollCaptureSession = this.$session;
            IntRect composeIntRect = RectHelper_androidKt.toComposeIntRect(this.$captureArea);
            this.label = 1;
            obj = composeScrollCaptureCallback.onScrollCaptureImageRequest(scrollCaptureSession, composeIntRect, this);
            if (obj == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        this.$onComplete.accept(RectHelper_androidKt.toAndroidRect((IntRect) obj));
        return g2.f100423a;
    }
}
