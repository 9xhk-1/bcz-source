package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,535:1\n1#2:536\n*E\n"})
/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    @m80.k
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m238MarqueeSpacing0680j_4(final float f11) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.a
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i11, int i12) {
                int MarqueeSpacing_0680j_4$lambda$1;
                MarqueeSpacing_0680j_4$lambda$1 = BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(f11, density, i11, i12);
                return MarqueeSpacing_0680j_4$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MarqueeSpacing_0680j_4$lambda$1(float f11, Density density, int i11, int i12) {
        return density.mo371roundToPx0680j_4(f11);
    }

    @Stable
    @m80.k
    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m240basicMarquee1Mj1MLw(@m80.k Modifier modifier, int i11, int i12, int i13, int i14, @m80.k MarqueeSpacing marqueeSpacing, float f11) {
        return modifier.then(new MarqueeModifierElement(i11, i12, i13, i14, marqueeSpacing, f11, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m241basicMarquee1Mj1MLw$default(Modifier modifier, int i11, int i12, int i13, int i14, MarqueeSpacing marqueeSpacing, float f11, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i15 & 2) != 0) {
            i12 = MarqueeAnimationMode.Companion.m314getImmediatelyZbEOnfQ();
        }
        if ((i15 & 4) != 0) {
            i13 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i15 & 8) != 0) {
            i14 = MarqueeAnimationMode.m310equalsimpl0(i12, MarqueeAnimationMode.Companion.m314getImmediatelyZbEOnfQ()) ? i13 : 0;
        }
        if ((i15 & 16) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i15 & 32) != 0) {
            f11 = MarqueeDefaults.INSTANCE.m316getVelocityD9Ej5fM();
        }
        return m240basicMarquee1Mj1MLw(modifier, i11, i12, i13, i14, marqueeSpacing, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m242createMarqueeAnimationSpecZ4HSEVQ(int i11, float f11, int i12, int i13, float f12, Density density) {
        TweenSpec<Float> velocityBasedTween = velocityBasedTween(Math.abs(density.mo377toPx0680j_4(f12)), f11, i13);
        long m168constructorimpl$default = StartOffset.m168constructorimpl$default((-i13) + i12, 0, 2, null);
        return i11 == Integer.MAX_VALUE ? AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(velocityBasedTween, null, m168constructorimpl$default, 2, null) : AnimationSpecKt.m138repeatable91I0pcU$default(i11, velocityBasedTween, null, m168constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f11, float f12, int i11) {
        return AnimationSpecKt.tween((int) Math.ceil(f12 / (f11 / 1000.0f)), i11, EasingKt.getLinearEasing());
    }
}
