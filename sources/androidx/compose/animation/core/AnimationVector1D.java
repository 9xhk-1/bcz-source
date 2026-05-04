package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f11) {
        super(null);
        this.value = f11;
        this.size = 1;
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).value == this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i11) {
        if (i11 == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i11, float f11) {
        if (i11 == 0) {
            this.value = f11;
        }
    }

    public final void setValue$animation_core_release(float f11) {
        this.value = f11;
    }

    @k
    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @k
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }
}
