package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RippleKt {

    @k
    private static final RippleAlpha DarkThemeRippleAlpha;

    @k
    private static final RippleNodeFactory DefaultBoundedRipple;

    @k
    private static final RippleNodeFactory DefaultUnboundedRipple;

    @k
    private static final RippleAlpha LightThemeHighContrastRippleAlpha;

    @k
    private static final RippleAlpha LightThemeLowContrastRippleAlpha;

    @k
    private static final ProvidableCompositionLocal<RippleConfiguration> LocalRippleConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new a<RippleConfiguration>() { // from class: androidx.compose.material.RippleKt$LocalRippleConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }, 1, null);

    static {
        Dp.Companion companion = Dp.Companion;
        float m5135getUnspecifiedD9Ej5fM = companion.m5135getUnspecifiedD9Ej5fM();
        Color.Companion companion2 = Color.Companion;
        DefaultBoundedRipple = new RippleNodeFactory(true, m5135getUnspecifiedD9Ej5fM, companion2.m2545getUnspecified0d7_KjU(), (v) null);
        DefaultUnboundedRipple = new RippleNodeFactory(false, companion.m5135getUnspecifiedD9Ej5fM(), companion2.m2545getUnspecified0d7_KjU(), (v) null);
        LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    @k
    public static final ProvidableCompositionLocal<RippleConfiguration> getLocalRippleConfiguration() {
        return LocalRippleConfiguration;
    }

    @Stable
    @k
    /* renamed from: ripple-H2RKhps, reason: not valid java name */
    public static final IndicationNodeFactory m1747rippleH2RKhps(boolean z11, float f11, long j11) {
        return (Dp.m5120equalsimpl0(f11, Dp.Companion.m5135getUnspecifiedD9Ej5fM()) && Color.m2510equalsimpl0(j11, Color.Companion.m2545getUnspecified0d7_KjU())) ? z11 ? DefaultBoundedRipple : DefaultUnboundedRipple : new RippleNodeFactory(z11, f11, j11, (v) null);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m1748rippleH2RKhps$default(boolean z11, float f11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            j11 = Color.Companion.m2545getUnspecified0d7_KjU();
        }
        return m1747rippleH2RKhps(z11, f11, j11);
    }

    @Stable
    @k
    /* renamed from: ripple-wH6b6FI, reason: not valid java name */
    public static final IndicationNodeFactory m1749ripplewH6b6FI(@k ColorProducer colorProducer, boolean z11, float f11) {
        return new RippleNodeFactory(z11, f11, colorProducer, (v) null);
    }

    /* renamed from: ripple-wH6b6FI$default, reason: not valid java name */
    public static /* synthetic */ IndicationNodeFactory m1750ripplewH6b6FI$default(ColorProducer colorProducer, boolean z11, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            f11 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        return m1749ripplewH6b6FI(colorProducer, z11, f11);
    }
}
