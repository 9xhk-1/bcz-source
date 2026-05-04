package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.handmark.pulltorefresh.library.internal.RotateLoadingLayout;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,535:1\n113#2:536\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n*L\n102#1:536\n*E\n"})
/* loaded from: classes.dex */
public final class MarqueeDefaults {
    public static final int $stable = 0;

    @m80.k
    public static final MarqueeDefaults INSTANCE = new MarqueeDefaults();
    private static final int Iterations = 3;
    private static final int RepeatDelayMillis = RotateLoadingLayout.f35182s;

    @m80.k
    private static final MarqueeSpacing Spacing = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);
    private static final float Velocity = Dp.m5115constructorimpl(30);

    private MarqueeDefaults() {
    }

    public final int getIterations() {
        return Iterations;
    }

    public final int getRepeatDelayMillis() {
        return RepeatDelayMillis;
    }

    @m80.k
    public final MarqueeSpacing getSpacing() {
        return Spacing;
    }

    /* renamed from: getVelocity-D9Ej5fM, reason: not valid java name */
    public final float m316getVelocityD9Ej5fM() {
        return Velocity;
    }

    public static /* synthetic */ void getIterations$annotations() {
    }

    public static /* synthetic */ void getRepeatDelayMillis$annotations() {
    }
}
