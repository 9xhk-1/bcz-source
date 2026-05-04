package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f4080v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f4081v2;

    public AnimationVector2D(float f11, float f12) {
        super(null);
        this.f4080v1 = f11;
        this.f4081v2 = f12;
        this.size = 2;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof AnimationVector2D)) {
            return false;
        }
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return animationVector2D.f4080v1 == this.f4080v1 && animationVector2D.f4081v2 == this.f4081v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i11) {
        if (i11 == 0) {
            return this.f4080v1;
        }
        if (i11 != 1) {
            return 0.0f;
        }
        return this.f4081v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f4080v1;
    }

    public final float getV2() {
        return this.f4081v2;
    }

    public int hashCode() {
        return (Float.hashCode(this.f4080v1) * 31) + Float.hashCode(this.f4081v2);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f4080v1 = 0.0f;
        this.f4081v2 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i11, float f11) {
        if (i11 == 0) {
            this.f4080v1 = f11;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f4081v2 = f11;
        }
    }

    public final void setV1$animation_core_release(float f11) {
        this.f4080v1 = f11;
    }

    public final void setV2$animation_core_release(float f11) {
        this.f4081v2 = f11;
    }

    @k
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f4080v1 + ", v2 = " + this.f4081v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @k
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }
}
