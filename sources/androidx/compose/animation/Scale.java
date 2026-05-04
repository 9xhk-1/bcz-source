package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class Scale {
    public static final int $stable = 0;

    @k
    private final FiniteAnimationSpec<Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    public /* synthetic */ Scale(float f11, long j11, FiniteAnimationSpec finiteAnimationSpec, v vVar) {
        this(f11, j11, finiteAnimationSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ Scale m101copybnNdC4k$default(Scale scale, float f11, long j11, FiniteAnimationSpec finiteAnimationSpec, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = scale.scale;
        }
        if ((i11 & 2) != 0) {
            j11 = scale.transformOrigin;
        }
        if ((i11 & 4) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m103copybnNdC4k(f11, j11, finiteAnimationSpec);
    }

    public final float component1() {
        return this.scale;
    }

    /* renamed from: component2-SzJe1aQ, reason: not valid java name */
    public final long m102component2SzJe1aQ() {
        return this.transformOrigin;
    }

    @k
    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    @k
    /* renamed from: copy-bnNdC4k, reason: not valid java name */
    public final Scale m103copybnNdC4k(float f11, long j11, @k FiniteAnimationSpec<Float> finiteAnimationSpec) {
        return new Scale(f11, j11, finiteAnimationSpec, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m2894equalsimpl0(this.transformOrigin, scale.transformOrigin) && g0.g(this.animationSpec, scale.animationSpec);
    }

    @k
    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m104getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + TransformOrigin.m2897hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    @k
    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m2898toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Scale(float f11, long j11, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scale = f11;
        this.transformOrigin = j11;
        this.animationSpec = finiteAnimationSpec;
    }
}
