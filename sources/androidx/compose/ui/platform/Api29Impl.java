package androidx.compose.ui.platform;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class Api29Impl {
    public static final int $stable = 0;

    @m80.k
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    public final int getRecommendedTimeoutMillis(@m80.k android.view.accessibility.AccessibilityManager accessibilityManager, int i11, int i12) {
        return accessibilityManager.getRecommendedTimeoutMillis(i11, i12);
    }
}
