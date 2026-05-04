package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEdgeEffectCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,208:1\n1#2:209\n113#3:210\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.android.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n121#1:210\n*E\n"})
/* loaded from: classes.dex */
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    public GlowEdgeEffectCompat(@m80.k Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo377toPx0680j_4(Dp.m5115constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i11) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i11);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f11, float f12) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f11, f12);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f11) {
        float f12 = this.oppositeReleaseDelta + f11;
        this.oppositeReleaseDelta = f12;
        if (Math.abs(f12) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f11) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f11);
    }
}
