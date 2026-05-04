package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;

    @m80.k
    private final android.view.ViewConfiguration viewConfiguration;

    public AndroidViewConfiguration(@m80.k android.view.ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingGestureLineMargin() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingGestureLineMargin(this.viewConfiguration) : super.getHandwritingGestureLineMargin();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getHandwritingSlop() {
        return Build.VERSION.SDK_INT >= 34 ? AndroidViewConfigurationApi34.INSTANCE.getScaledHandwritingSlop(this.viewConfiguration) : super.getHandwritingSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getMaximumFlingVelocity() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return this.viewConfiguration.getScaledTouchSlop();
    }
}
