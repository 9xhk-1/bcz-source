package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import c10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;

    @l
    private Boolean bounded;

    @l
    private Long lastRippleStateChangeTimeMillis;

    @l
    private x00.a<g2> onInvalidateRipple;

    @l
    private Runnable resetRippleRunnable;

    @l
    private UnprojectedRipple ripple;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final int[] PressedState = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    @k
    private static final int[] RestingState = new int[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public RippleHostView(@k Context context) {
        super(context);
    }

    private final void createRipple(boolean z11) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z11);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    private final void setRippleState(boolean z11) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l11 = this.lastRippleStateChangeTimeMillis;
        long longValue = currentAnimationTimeMillis - (l11 != null ? l11.longValue() : 0L);
        if (z11 || longValue >= 5) {
            int[] iArr = z11 ? PressedState : RestingState;
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.a
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(RippleHostView.this);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m1872addRippleKOepWvA(@k PressInteraction.Press press, boolean z11, long j11, int i11, long j12, float f11, @k x00.a<g2> aVar) {
        if (this.ripple == null || !g0.g(Boolean.valueOf(z11), this.bounded)) {
            createRipple(z11);
            this.bounded = Boolean.valueOf(z11);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        g0.m(unprojectedRipple);
        this.onInvalidateRipple = aVar;
        m1873setRipplePropertiesbiQXAtU(j11, i11, j12, f11);
        if (z11) {
            unprojectedRipple.setHotspot(Offset.m2268getXimpl(press.m548getPressPositionF1C5BW0()), Offset.m2269getYimpl(press.m548getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            g0.m(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View
    public void draw(@k Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            disposeRipple();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@k Drawable drawable) {
        x00.a<g2> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m1873setRipplePropertiesbiQXAtU(long j11, int i11, long j12, float f11) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.trySetRadius(i11);
        unprojectedRipple.m1884setColorDxMtmZc(j12, f11);
        Rect rect = new Rect(0, 0, d.L0(Size.m2337getWidthimpl(j11)), d.L0(Size.m2334getHeightimpl(j11)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
