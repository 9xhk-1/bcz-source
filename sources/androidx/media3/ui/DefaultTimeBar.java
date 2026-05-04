package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.ui.TimeBar;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements TimeBar {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;

    @Nullable
    private long[] adGroupTimesMs;
    private final Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barGravity;
    private final int barHeight;
    private final Rect bufferedBar;
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private Rect lastExclusionRectangle;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> listeners;

    @Nullable
    private boolean[] playedAdGroups;
    private final Paint playedAdMarkerPaint;
    private final Paint playedPaint;
    private long position;
    private final Rect progressBar;
    private long scrubPosition;
    private final Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;

    @Nullable
    private final Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private boolean scrubberPaddingDisabled;
    private final Paint scrubberPaint;
    private float scrubberScale;
    private ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final Rect seekBounds;
    private final Runnable stopScrubbingRunnable;
    private final Point touchPosition;
    private final int touchTargetHeight;
    private final Paint unplayedPaint;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.scrubberScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.seekBounds);
    }

    private static int dpToPx(float f11, int i11) {
        return (int) ((i11 * f11) + 0.5f);
    }

    private void drawPlayhead(Canvas canvas) {
        if (this.duration <= 0) {
            return;
        }
        Rect rect = this.scrubberBar;
        int constrainValue = Util.constrainValue(rect.right, rect.left, this.progressBar.right);
        int centerY = this.scrubberBar.centerY();
        if (this.scrubberDrawable == null) {
            canvas.drawCircle(constrainValue, centerY, (int) ((((this.scrubbing || isFocused()) ? this.scrubberDraggedSize : isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize) * this.scrubberScale) / 2.0f), this.scrubberPaint);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.scrubberScale)) / 2;
        int intrinsicHeight = ((int) (this.scrubberDrawable.getIntrinsicHeight() * this.scrubberScale)) / 2;
        this.scrubberDrawable.setBounds(constrainValue - intrinsicWidth, centerY - intrinsicHeight, constrainValue + intrinsicWidth, centerY + intrinsicHeight);
        this.scrubberDrawable.draw(canvas);
    }

    private void drawTimeBar(Canvas canvas) {
        int height = this.progressBar.height();
        int centerY = this.progressBar.centerY() - (height / 2);
        int i11 = height + centerY;
        if (this.duration <= 0) {
            Rect rect = this.progressBar;
            canvas.drawRect(rect.left, centerY, rect.right, i11, this.unplayedPaint);
            return;
        }
        Rect rect2 = this.bufferedBar;
        int i12 = rect2.left;
        int i13 = rect2.right;
        int max = Math.max(Math.max(this.progressBar.left, i13), this.scrubberBar.right);
        int i14 = this.progressBar.right;
        if (max < i14) {
            canvas.drawRect(max, centerY, i14, i11, this.unplayedPaint);
        }
        int max2 = Math.max(i12, this.scrubberBar.right);
        if (i13 > max2) {
            canvas.drawRect(max2, centerY, i13, i11, this.bufferedPaint);
        }
        if (this.scrubberBar.width() > 0) {
            Rect rect3 = this.scrubberBar;
            canvas.drawRect(rect3.left, centerY, rect3.right, i11, this.playedPaint);
        }
        if (this.adGroupCount == 0) {
            return;
        }
        long[] jArr = (long[]) Assertions.checkNotNull(this.adGroupTimesMs);
        boolean[] zArr = (boolean[]) Assertions.checkNotNull(this.playedAdGroups);
        int i15 = this.adMarkerWidth / 2;
        for (int i16 = 0; i16 < this.adGroupCount; i16++) {
            int width = ((int) ((this.progressBar.width() * Util.constrainValue(jArr[i16], 0L, this.duration)) / this.duration)) - i15;
            Rect rect4 = this.progressBar;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.adMarkerWidth, Math.max(0, width)), centerY, r10 + this.adMarkerWidth, i11, zArr[i16] ? this.playedAdMarkerPaint : this.adMarkerPaint);
        }
    }

    private long getPositionIncrement() {
        long j11 = this.keyTimeIncrement;
        if (j11 != C.TIME_UNSET) {
            return j11;
        }
        long j12 = this.duration;
        if (j12 == C.TIME_UNSET) {
            return 0L;
        }
        return j12 / this.keyCountIncrement;
    }

    private String getProgressText() {
        return Util.getStringForTime(this.formatBuilder, this.formatter, this.position);
    }

    private long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == C.TIME_UNSET) {
            return 0L;
        }
        return (this.scrubberBar.width() * this.duration) / this.progressBar.width();
    }

    private boolean isInSeekBar(float f11, float f12) {
        return this.seekBounds.contains((int) f11, (int) f12);
    }

    private void positionScrubber(float f11) {
        Rect rect = this.scrubberBar;
        Rect rect2 = this.progressBar;
        rect.right = Util.constrainValue((int) f11, rect2.left, rect2.right);
    }

    private static int pxToDp(float f11, int i11) {
        return (int) (i11 / f11);
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
        this.touchPosition.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.touchPosition;
    }

    private boolean scrubIncrementally(long j11) {
        long j12 = this.duration;
        if (j12 <= 0) {
            return false;
        }
        long j13 = this.scrubbing ? this.scrubPosition : this.position;
        long constrainValue = Util.constrainValue(j13 + j11, 0L, j12);
        if (constrainValue == j13) {
            return false;
        }
        if (this.scrubbing) {
            updateScrubbing(constrainValue);
        } else {
            startScrubbing(constrainValue);
        }
        update();
        return true;
    }

    private boolean setDrawableLayoutDirection(Drawable drawable) {
        return Util.SDK_INT >= 23 && setDrawableLayoutDirection(drawable, getLayoutDirection());
    }

    @RequiresApi(29)
    private void setSystemGestureExclusionRectsV29(int i11, int i12) {
        Rect rect = this.lastExclusionRectangle;
        if (rect != null && rect.width() == i11 && this.lastExclusionRectangle.height() == i12) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i11, i12);
        this.lastExclusionRectangle = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void startScrubbing(long j11) {
        this.scrubPosition = j11;
        this.scrubbing = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopScrubbing(boolean z11) {
        removeCallbacks(this.stopScrubbingRunnable);
        this.scrubbing = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.scrubPosition, z11);
        }
    }

    private void update() {
        this.bufferedBar.set(this.progressBar);
        this.scrubberBar.set(this.progressBar);
        long j11 = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            int width = (int) ((this.progressBar.width() * this.bufferedPosition) / this.duration);
            Rect rect = this.bufferedBar;
            Rect rect2 = this.progressBar;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.progressBar.width() * j11) / this.duration);
            Rect rect3 = this.scrubberBar;
            Rect rect4 = this.progressBar;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.bufferedBar;
            int i11 = this.progressBar.left;
            rect5.right = i11;
            this.scrubberBar.right = i11;
        }
        invalidate(this.seekBounds);
    }

    private void updateDrawableState() {
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && this.scrubberDrawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void updateScrubbing(long j11) {
        if (this.scrubPosition == j11) {
            return;
        }
        this.scrubPosition = j11;
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, j11);
        }
    }

    @Override // androidx.media3.ui.TimeBar
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
        Assertions.checkNotNull(onScrubListener);
        this.listeners.add(onScrubListener);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // androidx.media3.ui.TimeBar
    public long getPreferredUpdateDelay() {
        int pxToDp = pxToDp(this.density, this.progressBar.width());
        if (pxToDp == 0) {
            return Long.MAX_VALUE;
        }
        long j11 = this.duration;
        if (j11 == 0 || j11 == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j11 / pxToDp;
    }

    public void hideScrubber(boolean z11) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = z11;
        this.scrubberScale = 0.0f;
        invalidate(this.seekBounds);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z11, int i11, @Nullable Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!this.scrubbing || z11) {
            return;
        }
        stopScrubbing(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.duration <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.scrubIncrementally(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.stopScrubbingRunnable
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.stopScrubbingRunnable
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.scrubbing
            if (r0 == 0) goto L30
            r5 = 0
            r4.stopScrubbing(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        int i19 = this.scrubberPaddingDisabled ? 0 : this.scrubberPadding;
        if (this.barGravity == 1) {
            i15 = (i18 - getPaddingBottom()) - this.touchTargetHeight;
            int paddingBottom = i18 - getPaddingBottom();
            int i21 = this.barHeight;
            i16 = (paddingBottom - i21) - Math.max(i19 - (i21 / 2), 0);
        } else {
            i15 = (i18 - this.touchTargetHeight) / 2;
            i16 = (i18 - this.barHeight) / 2;
        }
        this.seekBounds.set(paddingLeft, i15, paddingRight, this.touchTargetHeight + i15);
        Rect rect = this.progressBar;
        Rect rect2 = this.seekBounds;
        rect.set(rect2.left + i19, i16, rect2.right - i19, this.barHeight + i16);
        if (Util.SDK_INT >= 29) {
            setSystemGestureExclusionRectsV29(i17, i18);
        }
        update();
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == 0) {
            size = this.touchTargetHeight;
        } else if (mode != 1073741824) {
            size = Math.min(this.touchTargetHeight, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), size);
        updateDrawableState();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !setDrawableLayoutDirection(drawable, i11)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.duration
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.resolveRelativeTouchPosition(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.scrubbing
            if (r8 == 0) goto L76
            int r8 = r7.fineScrubYThreshold
            if (r0 >= r8) goto L3a
            int r8 = r7.lastCoarseScrubXPosition
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.positionScrubber(r8)
            goto L40
        L3a:
            r7.lastCoarseScrubXPosition = r2
            float r8 = (float) r2
            r7.positionScrubber(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.updateScrubbing(r0)
            r7.update()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.scrubbing
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.stopScrubbing(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.isInSeekBar(r8, r0)
            if (r0 == 0) goto L76
            r7.positionScrubber(r8)
            long r0 = r7.getScrubberPosition()
            r7.startScrubbing(r0)
            r7.update()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i11, @Nullable Bundle bundle) {
        if (super.performAccessibilityAction(i11, bundle)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (i11 == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else {
            if (i11 != 4096) {
                return false;
            }
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // androidx.media3.ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
        this.listeners.remove(onScrubListener);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i11) {
        Assertions.checkArgument(i11 == 0 || !(jArr == null || zArr == null));
        this.adGroupCount = i11;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        update();
    }

    public void setAdMarkerColor(@ColorInt int i11) {
        this.adMarkerPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public void setBufferedColor(@ColorInt int i11) {
        this.bufferedPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setBufferedPosition(long j11) {
        if (this.bufferedPosition == j11) {
            return;
        }
        this.bufferedPosition = j11;
        update();
    }

    @Override // androidx.media3.ui.TimeBar
    public void setDuration(long j11) {
        if (this.duration == j11) {
            return;
        }
        this.duration = j11;
        if (this.scrubbing && j11 == C.TIME_UNSET) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // android.view.View, androidx.media3.ui.TimeBar
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!this.scrubbing || z11) {
            return;
        }
        stopScrubbing(true);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setKeyCountIncrement(int i11) {
        Assertions.checkArgument(i11 > 0);
        this.keyCountIncrement = i11;
        this.keyTimeIncrement = C.TIME_UNSET;
    }

    @Override // androidx.media3.ui.TimeBar
    public void setKeyTimeIncrement(long j11) {
        Assertions.checkArgument(j11 > 0);
        this.keyCountIncrement = -1;
        this.keyTimeIncrement = j11;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i11) {
        this.playedAdMarkerPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public void setPlayedColor(@ColorInt int i11) {
        this.playedPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    @Override // androidx.media3.ui.TimeBar
    public void setPosition(long j11) {
        if (this.position == j11) {
            return;
        }
        this.position = j11;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(@ColorInt int i11) {
        this.scrubberPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public void setUnplayedColor(@ColorInt int i11) {
        this.unplayedPaint.setColor(i11);
        invalidate(this.seekBounds);
    }

    public void showScrubber() {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScale = 1.0f;
        invalidate(this.seekBounds);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean setDrawableLayoutDirection(Drawable drawable, int i11) {
        return Util.SDK_INT >= 23 && drawable.setLayoutDirection(i11);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i11, @Nullable AttributeSet attributeSet2) {
        this(context, attributeSet, i11, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, @Nullable AttributeSet attributeSet, int i11, @Nullable AttributeSet attributeSet2, int i12) {
        super(context, attributeSet, i11);
        this.seekBounds = new Rect();
        this.progressBar = new Rect();
        this.bufferedBar = new Rect();
        this.scrubberBar = new Rect();
        Paint paint = new Paint();
        this.playedPaint = paint;
        Paint paint2 = new Paint();
        this.bufferedPaint = paint2;
        Paint paint3 = new Paint();
        this.unplayedPaint = paint3;
        Paint paint4 = new Paint();
        this.adMarkerPaint = paint4;
        Paint paint5 = new Paint();
        this.playedAdMarkerPaint = paint5;
        Paint paint6 = new Paint();
        this.scrubberPaint = paint6;
        paint6.setAntiAlias(true);
        this.listeners = new CopyOnWriteArraySet<>();
        this.touchPosition = new Point();
        float f11 = context.getResources().getDisplayMetrics().density;
        this.density = f11;
        this.fineScrubYThreshold = dpToPx(f11, FINE_SCRUB_Y_THRESHOLD_DP);
        int dpToPx = dpToPx(f11, 4);
        int dpToPx2 = dpToPx(f11, 26);
        int dpToPx3 = dpToPx(f11, 4);
        int dpToPx4 = dpToPx(f11, 12);
        int dpToPx5 = dpToPx(f11, 0);
        int dpToPx6 = dpToPx(f11, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.DefaultTimeBar, i11, i12);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.DefaultTimeBar_scrubber_drawable);
                this.scrubberDrawable = drawable;
                if (drawable != null) {
                    setDrawableLayoutDirection(drawable);
                    dpToPx2 = Math.max(drawable.getMinimumHeight(), dpToPx2);
                }
                this.barHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_bar_height, dpToPx);
                this.touchTargetHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_touch_target_height, dpToPx2);
                this.barGravity = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.adMarkerWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_ad_marker_width, dpToPx3);
                this.scrubberEnabledSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_enabled_size, dpToPx4);
                this.scrubberDisabledSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_disabled_size, dpToPx5);
                this.scrubberDraggedSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_dragged_size, dpToPx6);
                int i13 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_color, -1);
                int i14 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i15 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_buffered_color, DEFAULT_BUFFERED_COLOR);
                int i16 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_unplayed_color, DEFAULT_UNPLAYED_COLOR);
                int i17 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_ad_marker_color, DEFAULT_AD_MARKER_COLOR);
                int i18 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_ad_marker_color, DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.barHeight = dpToPx;
            this.touchTargetHeight = dpToPx2;
            this.barGravity = 0;
            this.adMarkerWidth = dpToPx3;
            this.scrubberEnabledSize = dpToPx4;
            this.scrubberDisabledSize = dpToPx5;
            this.scrubberDraggedSize = dpToPx6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(DEFAULT_BUFFERED_COLOR);
            paint3.setColor(DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.scrubberDrawable = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.formatBuilder = sb2;
        this.formatter = new Formatter(sb2, Locale.getDefault());
        this.stopScrubbingRunnable = new Runnable() { // from class: androidx.media3.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.stopScrubbing(false);
            }
        };
        Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            this.scrubberPadding = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.scrubberPadding = (Math.max(this.scrubberDisabledSize, Math.max(this.scrubberEnabledSize, this.scrubberDraggedSize)) + 1) / 2;
        }
        this.scrubberScale = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.scrubberScalingAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.a(DefaultTimeBar.this, valueAnimator2);
            }
        });
        this.duration = C.TIME_UNSET;
        this.keyTimeIncrement = C.TIME_UNSET;
        this.keyCountIncrement = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public void hideScrubber(long j11) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 0.0f);
        this.scrubberScalingAnimator.setDuration(j11);
        this.scrubberScalingAnimator.start();
    }

    public void showScrubber(long j11) {
        if (this.scrubberScalingAnimator.isStarted()) {
            this.scrubberScalingAnimator.cancel();
        }
        this.scrubberPaddingDisabled = false;
        this.scrubberScalingAnimator.setFloatValues(this.scrubberScale, 1.0f);
        this.scrubberScalingAnimator.setDuration(j11);
        this.scrubberScalingAnimator.start();
    }
}
