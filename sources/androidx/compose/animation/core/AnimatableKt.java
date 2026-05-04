package androidx.compose.animation.core;

import kotlin.jvm.internal.z;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnimatableKt {

    @k
    private static final AnimationVector1D positiveInfinityBounds1D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY);

    @k
    private static final AnimationVector2D positiveInfinityBounds2D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    @k
    private static final AnimationVector3D positiveInfinityBounds3D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    @k
    private static final AnimationVector4D positiveInfinityBounds4D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    @k
    private static final AnimationVector1D negativeInfinityBounds1D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY);

    @k
    private static final AnimationVector2D negativeInfinityBounds2D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @k
    private static final AnimationVector3D negativeInfinityBounds3D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @k
    private static final AnimationVector4D negativeInfinityBounds4D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @k
    public static final Animatable<Float, AnimationVector1D> Animatable(float f11, float f12) {
        return new Animatable<>(Float.valueOf(f11), VectorConvertersKt.getVectorConverter(z.f67060a), Float.valueOf(f12), null, 8, null);
    }

    public static /* synthetic */ Animatable Animatable$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.01f;
        }
        return Animatable(f11, f12);
    }
}
