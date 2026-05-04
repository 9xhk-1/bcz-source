package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class EdgeEffectCompat {
    public static final int $stable = 0;

    @m80.k
    public static final EdgeEffectCompat INSTANCE = new EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    public final float absorbToRelaxIfNeeded(@m80.k EdgeEffect edgeEffect, float f11, float f12, @m80.k Density density) {
        float flingDistance;
        flingDistance = EdgeEffectCompat_androidKt.flingDistance(density, f11);
        if (flingDistance > getDistanceCompat(edgeEffect) * f12) {
            return 0.0f;
        }
        onAbsorbCompat(edgeEffect, c10.d.L0(f11));
        return f11;
    }

    @m80.k
    public final EdgeEffect create(@m80.k Context context) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.INSTANCE.create(context, null) : new GlowEdgeEffectCompat(context);
    }

    public final float getDistanceCompat(@m80.k EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(@m80.k EdgeEffect edgeEffect, int i11) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i11);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i11);
        }
    }

    public final float onPullDistanceCompat(@m80.k EdgeEffect edgeEffect, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.onPullDistance(edgeEffect, f11, f12);
        }
        edgeEffect.onPull(f11, f12);
        return f11;
    }

    public final void onReleaseWithOppositeDelta(@m80.k EdgeEffect edgeEffect, float f11) {
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).releaseWithOppositeDelta(f11);
        } else {
            edgeEffect.onRelease();
        }
    }
}
