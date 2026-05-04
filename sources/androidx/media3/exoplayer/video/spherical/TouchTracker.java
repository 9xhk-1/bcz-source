package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import androidx.media3.exoplayer.video.spherical.OrientationListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    static final float MAX_PITCH_DEGREES = 45.0f;
    private final GestureDetector gestureDetector;
    private final Listener listener;
    private final float pxPerDegrees;
    private final PointF previousTouchPointPx = new PointF();
    private final PointF accumulatedTouchOffsetDegrees = new PointF();
    private volatile float roll = 3.1415927f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onScrollChange(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public TouchTracker(Context context, Listener listener, float f11) {
        this.listener = listener;
        this.pxPerDegrees = f11;
        this.gestureDetector = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
    @BinderThread
    public void onOrientationChange(float[] fArr, float f11) {
        this.roll = -f11;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        float x11 = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y11 = motionEvent2.getY();
        PointF pointF = this.previousTouchPointPx;
        float f13 = (y11 - pointF.y) / this.pxPerDegrees;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d11 = this.roll;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        PointF pointF2 = this.accumulatedTouchOffsetDegrees;
        pointF2.x -= (cos * x11) - (sin * f13);
        float f14 = pointF2.y + (sin * x11) + (cos * f13);
        pointF2.y = f14;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f14));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.listener.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }
}
