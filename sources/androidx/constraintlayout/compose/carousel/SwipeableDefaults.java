package androidx.constraintlayout.compose.carousel;

import a00.r0;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,850:1\n149#2:851\n*S KotlinDebug\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/SwipeableDefaults\n*L\n775#1:851\n*E\n"})
/* loaded from: classes2.dex */
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
    public final float m5595getVelocityThresholdD9Ej5fM() {
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
