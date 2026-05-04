package androidx.compose.material;

import a00.r0;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@n(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@u0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,881:1\n149#2:882\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n*L\n801#1:882\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeableDefaults {
    public static final int $stable = 0;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;

    @k
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();

    @k
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = Dp.m5115constructorimpl(125);

    private SwipeableDefaults() {
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults, Set set, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 10.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f11, f12);
    }

    @k
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1793getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    @l
    public final ResistanceConfig resistanceConfig(@k Set<Float> set, float f11, float f12) {
        if (set.size() <= 1) {
            return null;
        }
        Set<Float> set2 = set;
        Float W3 = r0.W3(set2);
        g0.m(W3);
        float floatValue = W3.floatValue();
        Float o42 = r0.o4(set2);
        g0.m(o42);
        return new ResistanceConfig(floatValue - o42.floatValue(), f11, f12);
    }
}
