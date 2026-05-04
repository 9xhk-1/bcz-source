package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVector> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVector> boolean isFinishedFromNanos(@k Animation<T, V> animation, long j11) {
            return Animation.super.isFinishedFromNanos(j11);
        }
    }

    long getDurationNanos();

    T getTargetValue();

    @k
    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j11);

    @k
    V getVelocityVectorFromNanos(long j11);

    default boolean isFinishedFromNanos(long j11) {
        return j11 >= getDurationNanos();
    }

    boolean isInfinite();
}
