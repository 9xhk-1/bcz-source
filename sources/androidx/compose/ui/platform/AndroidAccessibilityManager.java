package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidAccessibilityManager implements AccessibilityManager {

    @Deprecated
    public static final int FlagContentControls = 4;

    @Deprecated
    public static final int FlagContentIcons = 1;

    @Deprecated
    public static final int FlagContentText = 2;

    @m80.k
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @m80.k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidAccessibilityManager(@m80.k Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.g0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long j11, boolean z11, boolean z12, boolean z13) {
        int i11 = z11;
        if (j11 < SieveCacheKt.NodeLinkMask) {
            if (z12) {
                i11 = (z11 ? 1 : 0) | 2;
            }
            if (z13) {
                i11 = (i11 == true ? 1 : 0) | 4;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j11, i11);
                if (recommendedTimeoutMillis == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return recommendedTimeoutMillis;
            }
            if (z13 && this.accessibilityManager.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j11;
    }
}
