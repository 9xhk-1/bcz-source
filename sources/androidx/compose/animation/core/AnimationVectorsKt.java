package androidx.compose.animation.core;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    @k
    public static final AnimationVector1D AnimationVector(float f11) {
        return new AnimationVector1D(f11);
    }

    @k
    public static final <T extends AnimationVector> T copy(@k T t11) {
        T t12 = (T) newInstance(t11);
        int size$animation_core_release = t12.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            t12.set$animation_core_release(i11, t11.get$animation_core_release(i11));
        }
        return t12;
    }

    public static final <T extends AnimationVector> void copyFrom(@k T t11, @k T t12) {
        int size$animation_core_release = t11.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            t11.set$animation_core_release(i11, t12.get$animation_core_release(i11));
        }
    }

    @k
    public static final <T extends AnimationVector> T newInstance(@k T t11) {
        T t12 = (T) t11.newVector$animation_core_release();
        g0.n(t12, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t12;
    }

    @k
    public static final AnimationVector2D AnimationVector(float f11, float f12) {
        return new AnimationVector2D(f11, f12);
    }

    @k
    public static final AnimationVector3D AnimationVector(float f11, float f12, float f13) {
        return new AnimationVector3D(f11, f12, f13);
    }

    @k
    public static final AnimationVector4D AnimationVector(float f11, float f12, float f13, float f14) {
        return new AnimationVector4D(f11, f12, f13, f14);
    }
}
