package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,182:1\n149#2:183\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n177#1:183\n*E\n"})
/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m5115constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1870getRippleEndRadiuscSwnlzA(@k Density density, boolean z11, long j11) {
        float m2266getDistanceimpl = Offset.m2266getDistanceimpl(OffsetKt.Offset(Size.m2337getWidthimpl(j11), Size.m2334getHeightimpl(j11))) / 2.0f;
        return z11 ? m2266getDistanceimpl + density.mo377toPx0680j_4(BoundedRippleExtraRadius) : m2266getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1871getRippleStartRadiusuvyYCjk(long j11) {
        return Math.max(Size.m2337getWidthimpl(j11), Size.m2334getHeightimpl(j11)) * 0.3f;
    }
}
