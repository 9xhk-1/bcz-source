package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes2.dex */
public final class ScrollerCompat {
    OverScroller mScroller;

    public ScrollerCompat(Context context, Interpolator interpolator) {
        this.mScroller = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    @Deprecated
    public void abortAnimation() {
        this.mScroller.abortAnimation();
    }

    @Deprecated
    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }

    @Deprecated
    public void fling(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.mScroller.fling(i11, i12, i13, i14, i15, i16, i17, i18);
    }

    @Deprecated
    public float getCurrVelocity() {
        return this.mScroller.getCurrVelocity();
    }

    @Deprecated
    public int getCurrX() {
        return this.mScroller.getCurrX();
    }

    @Deprecated
    public int getCurrY() {
        return this.mScroller.getCurrY();
    }

    @Deprecated
    public int getFinalX() {
        return this.mScroller.getFinalX();
    }

    @Deprecated
    public int getFinalY() {
        return this.mScroller.getFinalY();
    }

    @Deprecated
    public boolean isFinished() {
        return this.mScroller.isFinished();
    }

    @Deprecated
    public boolean isOverScrolled() {
        return this.mScroller.isOverScrolled();
    }

    @Deprecated
    public void notifyHorizontalEdgeReached(int i11, int i12, int i13) {
        this.mScroller.notifyHorizontalEdgeReached(i11, i12, i13);
    }

    @Deprecated
    public void notifyVerticalEdgeReached(int i11, int i12, int i13) {
        this.mScroller.notifyVerticalEdgeReached(i11, i12, i13);
    }

    @Deprecated
    public boolean springBack(int i11, int i12, int i13, int i14, int i15, int i16) {
        return this.mScroller.springBack(i11, i12, i13, i14, i15, i16);
    }

    @Deprecated
    public void startScroll(int i11, int i12, int i13, int i14) {
        this.mScroller.startScroll(i11, i12, i13, i14);
    }

    @Deprecated
    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    @Deprecated
    public void fling(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        this.mScroller.fling(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21);
    }

    @Deprecated
    public void startScroll(int i11, int i12, int i13, int i14, int i15) {
        this.mScroller.startScroll(i11, i12, i13, i14, i15);
    }
}
