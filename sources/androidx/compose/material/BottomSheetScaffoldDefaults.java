package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,601:1\n149#2:602\n149#2:603\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n*L\n448#1:602\n451#1:603\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldDefaults {

    @k
    public static final BottomSheetScaffoldDefaults INSTANCE = new BottomSheetScaffoldDefaults();
    private static final float SheetElevation = Dp.m5115constructorimpl(8);
    private static final float SheetPeekHeight = Dp.m5115constructorimpl(56);

    @k
    private static final AnimationSpec<Float> AnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    public static final int $stable = 8;

    private BottomSheetScaffoldDefaults() {
    }

    @k
    public final AnimationSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getSheetElevation-D9Ej5fM, reason: not valid java name */
    public final float m1558getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1559getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }
}
