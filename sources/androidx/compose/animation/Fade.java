package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class Fade {
    public static final int $stable = 0;
    private final float alpha;

    @k
    private final FiniteAnimationSpec<Float> animationSpec;

    public Fade(float f11, @k FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.alpha = f11;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fade copy$default(Fade fade, float f11, FiniteAnimationSpec finiteAnimationSpec, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = fade.alpha;
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = fade.animationSpec;
        }
        return fade.copy(f11, finiteAnimationSpec);
    }

    public final float component1() {
        return this.alpha;
    }

    @k
    public final FiniteAnimationSpec<Float> component2() {
        return this.animationSpec;
    }

    @k
    public final Fade copy(float f11, @k FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new Fade(f11, finiteAnimationSpec);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return Float.compare(this.alpha, fade.alpha) == 0 && g0.g(this.animationSpec, fade.animationSpec);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @k
    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.hashCode(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    @k
    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }
}
