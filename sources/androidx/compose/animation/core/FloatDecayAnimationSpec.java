package androidx.compose.animation.core;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FloatDecayAnimationSpec {
    float getAbsVelocityThreshold();

    long getDurationNanos(float f11, float f12);

    float getTargetValue(float f11, float f12);

    float getValueFromNanos(long j11, float f11, float f12);

    float getVelocityFromNanos(long j11, float f11, float f12);
}
