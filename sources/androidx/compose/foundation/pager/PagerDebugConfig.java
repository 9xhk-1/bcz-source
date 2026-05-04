package androidx.compose.foundation.pager;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PagerDebugConfig {
    public static final int $stable = 0;

    @k
    public static final PagerDebugConfig INSTANCE = new PagerDebugConfig();
    public static final boolean MainPagerComposable = false;
    public static final boolean MeasureLogic = false;
    public static final boolean PagerSnapDistance = false;
    public static final boolean PagerSnapLayoutInfoProvider = false;
    public static final boolean PagerState = false;
    public static final boolean ScrollPosition = false;

    private PagerDebugConfig() {
    }
}
