package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class MeteringPointFactory {

    @Nullable
    private Rational mSurfaceAspectRatio;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory() {
        this(null);
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract PointF convertPoint(float f11, float f12);

    @NonNull
    public final MeteringPoint createPoint(float f11, float f12) {
        return createPoint(f11, f12, getDefaultPointSize());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSurfaceAspectRatio(@NonNull Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MeteringPointFactory(@Nullable Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    @NonNull
    public final MeteringPoint createPoint(float f11, float f12, float f13) {
        PointF convertPoint = convertPoint(f11, f12);
        return new MeteringPoint(convertPoint.x, convertPoint.y, f13, this.mSurfaceAspectRatio);
    }
}
