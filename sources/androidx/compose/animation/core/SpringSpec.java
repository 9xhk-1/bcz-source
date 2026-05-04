package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final float stiffness;

    @l
    private final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@l Object obj) {
        if (obj instanceof SpringSpec) {
            SpringSpec springSpec = (SpringSpec) obj;
            if (springSpec.dampingRatio == this.dampingRatio && springSpec.stiffness == this.stiffness && g0.g(springSpec.visibilityThreshold, this.visibilityThreshold)) {
                return true;
            }
        }
        return false;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @l
    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t11 = this.visibilityThreshold;
        return ((((t11 != null ? t11.hashCode() : 0) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    public SpringSpec(float f11, float f12, @l T t11) {
        this.dampingRatio = f11;
        this.stiffness = f12;
        this.visibilityThreshold = t11;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        AnimationVector convert;
        float f11 = this.dampingRatio;
        float f12 = this.stiffness;
        convert = AnimationSpecKt.convert(twoWayConverter, this.visibilityThreshold);
        return new VectorizedSpringSpec<>(f11, f12, convert);
    }

    public /* synthetic */ SpringSpec(float f11, float f12, Object obj, int i11, v vVar) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 1500.0f : f12, (i11 & 4) != 0 ? null : obj);
    }
}
