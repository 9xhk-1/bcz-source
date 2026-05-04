package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMaterialApi
@u0({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,241:1\n149#2:242\n149#2:243\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshDefaults\n*L\n228#1:242\n231#1:243\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshDefaults {
    public static final int $stable = 0;

    @k
    public static final PullRefreshDefaults INSTANCE = new PullRefreshDefaults();
    private static final float RefreshThreshold = Dp.m5115constructorimpl(80);
    private static final float RefreshingOffset = Dp.m5115constructorimpl(56);

    private PullRefreshDefaults() {
    }

    /* renamed from: getRefreshThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1857getRefreshThresholdD9Ej5fM() {
        return RefreshThreshold;
    }

    /* renamed from: getRefreshingOffset-D9Ej5fM, reason: not valid java name */
    public final float m1858getRefreshingOffsetD9Ej5fM() {
        return RefreshingOffset;
    }
}
