package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes2.dex */
public final class GestureDetectorCompat {
    private final GestureDetector mDetector;

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean isLongpressEnabled() {
        return this.mDetector.isLongpressEnabled();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return this.mDetector.onTouchEvent(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setIsLongpressEnabled(boolean z11) {
        this.mDetector.setIsLongpressEnabled(z11);
    }

    public void setOnDoubleTapListener(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mDetector.setOnDoubleTapListener(onDoubleTapListener);
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.mDetector = new GestureDetector(context, onGestureListener, handler);
    }
}
