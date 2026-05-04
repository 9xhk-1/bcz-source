package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,629:1\n149#2:630\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n*L\n511#1:630\n*E\n"})
/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    public static final float IndicatorBackgroundOpacity = 0.24f;

    @k
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float StrokeWidth = Dp.m5115constructorimpl(4);

    @k
    private static final SpringSpec<Float> ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));

    private ProgressIndicatorDefaults() {
    }

    @k
    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m1722getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }
}
