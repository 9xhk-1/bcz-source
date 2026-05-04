package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ElevationOverlayKt {

    @k
    private static final ProvidableCompositionLocal<ElevationOverlay> LocalElevationOverlay = CompositionLocalKt.staticCompositionLocalOf(new a<ElevationOverlay>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalElevationOverlay$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ElevationOverlay invoke() {
            return DefaultElevationOverlay.INSTANCE;
        }
    });

    @k
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteElevation = CompositionLocalKt.compositionLocalOf$default(null, new a<Dp>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalAbsoluteElevation$1
        @Override // x00.a
        public /* bridge */ /* synthetic */ Dp invoke() {
            return Dp.m5113boximpl(m1668invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m1668invokeD9Ej5fM() {
            return Dp.m5115constructorimpl(0);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ReadOnlyComposable
    /* renamed from: calculateForegroundColor-CLU3JFs, reason: not valid java name */
    public static final long m1667calculateForegroundColorCLU3JFs(long j11, float f11, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613340891, i11, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(ColorsKt.m1618contentColorForek8zF_U(j11, composer, i11 & 14), ((((float) Math.log(f11 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2508copywmQWz5c$default;
    }

    @k
    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteElevation() {
        return LocalAbsoluteElevation;
    }

    @k
    public static final ProvidableCompositionLocal<ElevationOverlay> getLocalElevationOverlay() {
        return LocalElevationOverlay;
    }
}
