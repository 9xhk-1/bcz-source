package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;

    /* renamed from: v1, reason: collision with root package name */
    private float f4085v1;

    /* renamed from: v2, reason: collision with root package name */
    private float f4086v2;

    /* renamed from: v3, reason: collision with root package name */
    private float f4087v3;

    /* renamed from: v4, reason: collision with root package name */
    private float f4088v4;

    public AnimationVector4D(float f11, float f12, float f13, float f14) {
        super(null);
        this.f4085v1 = f11;
        this.f4086v2 = f12;
        this.f4087v3 = f13;
        this.f4088v4 = f14;
        this.size = 4;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof AnimationVector4D)) {
            return false;
        }
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        return animationVector4D.f4085v1 == this.f4085v1 && animationVector4D.f4086v2 == this.f4086v2 && animationVector4D.f4087v3 == this.f4087v3 && animationVector4D.f4088v4 == this.f4088v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i11) {
        if (i11 == 0) {
            return this.f4085v1;
        }
        if (i11 == 1) {
            return this.f4086v2;
        }
        if (i11 == 2) {
            return this.f4087v3;
        }
        if (i11 != 3) {
            return 0.0f;
        }
        return this.f4088v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public final float getV1() {
        return this.f4085v1;
    }

    public final float getV2() {
        return this.f4086v2;
    }

    public final float getV3() {
        return this.f4087v3;
    }

    public final float getV4() {
        return this.f4088v4;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f4085v1) * 31) + Float.hashCode(this.f4086v2)) * 31) + Float.hashCode(this.f4087v3)) * 31) + Float.hashCode(this.f4088v4);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f4085v1 = 0.0f;
        this.f4086v2 = 0.0f;
        this.f4087v3 = 0.0f;
        this.f4088v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i11, float f11) {
        if (i11 == 0) {
            this.f4085v1 = f11;
            return;
        }
        if (i11 == 1) {
            this.f4086v2 = f11;
        } else if (i11 == 2) {
            this.f4087v3 = f11;
        } else {
            if (i11 != 3) {
                return;
            }
            this.f4088v4 = f11;
        }
    }

    public final void setV1$animation_core_release(float f11) {
        this.f4085v1 = f11;
    }

    public final void setV2$animation_core_release(float f11) {
        this.f4086v2 = f11;
    }

    public final void setV3$animation_core_release(float f11) {
        this.f4087v3 = f11;
    }

    public final void setV4$animation_core_release(float f11) {
        this.f4088v4 = f11;
    }

    @k
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f4085v1 + ", v2 = " + this.f4086v2 + ", v3 = " + this.f4087v3 + ", v4 = " + this.f4088v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @k
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
