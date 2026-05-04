package androidx.camera.view.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Px;
import androidx.annotation.UiThread;
import c10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ZoomGestureDetector {
    private static final int ANCHORED_ZOOM_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_ZOOM_MODE_NONE = 0;
    private static final int ANCHORED_ZOOM_MODE_STYLUS = 2;

    @k
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MIN_SPAN = 0;
    private static final float SCALE_FACTOR = 0.5f;
    private int anchoredZoomMode;
    private float anchoredZoomStartX;
    private float anchoredZoomStartY;

    @k
    private final Context context;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private boolean eventBeforeOrAboveStartingGestureEvent;
    private long eventTime;

    @Px
    private int focusX;

    @Px
    private int focusY;

    @k
    private GestureDetector gestureDetector;
    private float initialSpan;
    private boolean isInProgress;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;

    @k
    private final OnZoomGestureListener listener;
    private final int minSpan;
    private long prevTime;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private final int spanSlop;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnZoomGestureListener {
        @UiThread
        boolean onZoomEvent(@k ZoomEvent zoomEvent);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Begin extends ZoomEvent {
            public Begin(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12) {
                super(j11, i11, i12, null);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class End extends ZoomEvent {
            private final float incrementalScaleFactor;

            public End(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
                super(j11, i11, i12, null);
                this.incrementalScaleFactor = f11;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Move extends ZoomEvent {
            private final float incrementalScaleFactor;

            public Move(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
                super(j11, i11, i12, null);
                this.incrementalScaleFactor = f11;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public /* synthetic */ ZoomEvent(long j11, int i11, int i12, v vVar) {
            this(j11, i11, i12);
        }

        public final long getEventTime() {
            return this.eventTime;
        }

        public final int getFocusX() {
            return this.focusX;
        }

        public final int getFocusY() {
            return this.focusY;
        }

        private ZoomEvent(@IntRange(from = 0) long j11, @IntRange(from = 0) @Px int i11, @IntRange(from = 0) @Px int i12) {
            this.eventTime = j11;
            this.focusX = i11;
            this.focusY = i12;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(@k Context context, @Px int i11, @k OnZoomGestureListener listener) {
        this(context, i11, 0, listener, 4, null);
        g0.p(context, "context");
        g0.p(listener, "listener");
    }

    private final float getIncrementalScaleFactor() {
        if (!inAnchoredZoomMode()) {
            float f11 = this.previousSpan;
            if (f11 > 0.0f) {
                return this.currentSpan / f11;
            }
            return 1.0f;
        }
        boolean z11 = this.eventBeforeOrAboveStartingGestureEvent;
        boolean z12 = (z11 && this.currentSpan < this.previousSpan) || (!z11 && this.currentSpan > this.previousSpan);
        float abs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= this.spanSlop) {
            return 1.0f;
        }
        return z12 ? abs + 1.0f : 1.0f - abs;
    }

    private final boolean inAnchoredZoomMode() {
        return this.anchoredZoomMode != 0;
    }

    public final long getTimeDelta() {
        return this.eventTime - this.prevTime;
    }

    public final boolean isQuickZoomEnabled() {
        return this.isQuickZoomEnabled;
    }

    public final boolean isStylusZoomEnabled() {
        return this.isStylusZoomEnabled;
    }

    @UiThread
    public final boolean onTouchEvent(@k MotionEvent event) {
        boolean z11;
        float f11;
        float f12;
        g0.p(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z12 = (event.getButtonState() & 32) != 0;
        boolean z13 = this.anchoredZoomMode == 2 && !z12;
        boolean z14 = actionMasked == 1 || actionMasked == 3 || z13;
        float f13 = 0.0f;
        if (actionMasked == 0 || z14) {
            if (this.isInProgress) {
                z11 = true;
                this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else {
                z11 = true;
                if (inAnchoredZoomMode() && z14) {
                    this.isInProgress = false;
                    this.initialSpan = 0.0f;
                    this.anchoredZoomMode = 0;
                }
            }
            if (z14) {
                return z11;
            }
        } else {
            z11 = true;
        }
        if (!this.isInProgress && this.isStylusZoomEnabled && !inAnchoredZoomMode() && !z14 && z12) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z15 = (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z13) ? z11 : false;
        boolean z16 = actionMasked == 6 ? z11 : false;
        int actionIndex = z16 ? event.getActionIndex() : -1;
        int i11 = z16 ? pointerCount - 1 : pointerCount;
        if (inAnchoredZoomMode()) {
            f12 = this.anchoredZoomStartX;
            f11 = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f11 ? z11 : false;
        } else {
            float f14 = 0.0f;
            float f15 = 0.0f;
            for (int i12 = 0; i12 < pointerCount; i12++) {
                if (actionIndex != i12) {
                    f14 += event.getX(i12);
                    f15 += event.getY(i12);
                }
            }
            float f16 = i11;
            float f17 = f14 / f16;
            f11 = f15 / f16;
            f12 = f17;
        }
        float f18 = 0.0f;
        for (int i13 = 0; i13 < pointerCount; i13++) {
            if (actionIndex != i13) {
                f13 += Math.abs(event.getX(i13) - f12);
                f18 += Math.abs(event.getY(i13) - f11);
            }
        }
        float f19 = i11;
        float f21 = f13 / f19;
        float f22 = f18 / f19;
        float f23 = 2;
        float f24 = f21 * f23;
        float f25 = f22 * f23;
        float hypot = inAnchoredZoomMode() ? f25 : (float) Math.hypot(f24, f25);
        boolean z17 = this.isInProgress;
        this.focusX = d.L0(f12);
        this.focusY = d.L0(f11);
        if (!inAnchoredZoomMode() && this.isInProgress && (hypot < this.minSpan || z15)) {
            this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
            this.isInProgress = false;
            this.initialSpan = hypot;
        }
        if (z15) {
            this.currentSpanX = f24;
            this.previousSpanX = f24;
            this.currentSpanY = f25;
            this.previousSpanY = f25;
            this.currentSpan = hypot;
            this.previousSpan = hypot;
            this.initialSpan = hypot;
        }
        int i14 = inAnchoredZoomMode() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && hypot >= i14 && (z17 || Math.abs(hypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f24;
            this.previousSpanX = f24;
            this.currentSpanY = f25;
            this.previousSpanY = f25;
            this.currentSpan = hypot;
            this.previousSpan = hypot;
            long j11 = this.eventTime;
            this.prevTime = j11;
            this.isInProgress = this.listener.onZoomEvent(new ZoomEvent.Begin(j11, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f24;
            this.currentSpanY = f25;
            this.currentSpan = hypot;
            if (this.isInProgress ? this.listener.onZoomEvent(new ZoomEvent.Move(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor())) : z11) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return z11;
    }

    public final void setQuickZoomEnabled(boolean z11) {
        this.isQuickZoomEnabled = z11;
    }

    public final void setStylusZoomEnabled(boolean z11) {
        this.isStylusZoomEnabled = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(@k Context context, @k OnZoomGestureListener listener) {
        this(context, 0, 0, listener, 6, null);
        g0.p(context, "context");
        g0.p(listener, "listener");
    }

    @w00.k
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(@k Context context, @Px int i11, @Px int i12, @k OnZoomGestureListener listener) {
        g0.p(context, "context");
        g0.p(listener, "listener");
        this.context = context;
        this.spanSlop = i11;
        this.minSpan = i12;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.view.impl.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(@k MotionEvent e11) {
                g0.p(e11, "e");
                ZoomGestureDetector.this.anchoredZoomStartX = e11.getX();
                ZoomGestureDetector.this.anchoredZoomStartY = e11.getY();
                ZoomGestureDetector.this.anchoredZoomMode = 1;
                return true;
            }
        });
    }

    public /* synthetic */ ZoomGestureDetector(Context context, int i11, int i12, OnZoomGestureListener onZoomGestureListener, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i11, (i13 & 4) != 0 ? 0 : i12, onZoomGestureListener);
    }
}
