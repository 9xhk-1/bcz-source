package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import c40.r0;
import c40.s0;
import c40.x2;
import java.util.function.Consumer;
import kotlin.random.Random;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RequiresApi(31)
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public static final int $stable = 8;

    @k
    private final View composeView;

    @k
    private final r0 coroutineScope;

    @k
    private final ScrollCaptureSessionListener listener;

    @k
    private final SemanticsNode node;
    private int requestCount;

    @k
    private final RelativeScroller scrollTracker;

    @k
    private final IntRect viewportBoundsInWindow;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    public ComposeScrollCaptureCallback(@k SemanticsNode semanticsNode, @k IntRect intRect, @k r0 r0Var, @k ScrollCaptureSessionListener scrollCaptureSessionListener, @k View view) {
        this.node = semanticsNode;
        this.viewportBoundsInWindow = intRect;
        this.listener = scrollCaptureSessionListener;
        this.composeView = view;
        this.coroutineScope = s0.m(r0Var, DisableAnimationMotionDurationScale.INSTANCE);
        this.scrollTracker = new RelativeScroller(intRect.getHeight(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    private final void drawDebugBackground(Canvas canvas) {
        canvas.drawColor(ColorKt.m2563toArgb8_81llA(Color.Companion.m2533hslJlNiLsg$default(Color.Companion, Random.Default.nextFloat() * 360.0f, 0.75f, 0.5f, 1.0f, null, 16, null)));
    }

    private final void drawDebugOverlay(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.requestCount), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.requestCount++;
    }

    public void onScrollCaptureEnd(@k Runnable runnable) {
        c40.k.f(this.coroutineScope, x2.f8011a, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2, null);
    }

    public void onScrollCaptureImageRequest(@k ScrollCaptureSession scrollCaptureSession, @k CancellationSignal cancellationSignal, @k Rect rect, @k Consumer<Rect> consumer) {
        ComposeScrollCaptureCallback_androidKt.launchWithCancellationSignal(this.coroutineScope, cancellationSignal, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null));
    }

    public void onScrollCaptureSearch(@k CancellationSignal cancellationSignal, @k Consumer<Rect> consumer) {
        consumer.accept(RectHelper_androidKt.toAndroidRect(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(@k ScrollCaptureSession scrollCaptureSession, @k CancellationSignal cancellationSignal, @k Runnable runnable) {
        this.scrollTracker.reset();
        this.requestCount = 0;
        this.listener.onSessionStarted();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onScrollCaptureImageRequest(android.view.ScrollCaptureSession r9, androidx.compose.ui.unit.IntRect r10, j00.c<? super androidx.compose.ui.unit.IntRect> r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.onScrollCaptureImageRequest(android.view.ScrollCaptureSession, androidx.compose.ui.unit.IntRect, j00.c):java.lang.Object");
    }
}
