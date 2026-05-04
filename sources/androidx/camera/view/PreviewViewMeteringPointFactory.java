package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.impl.utils.Threads;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
class PreviewViewMeteringPointFactory extends MeteringPointFactory {
    static final PointF INVALID_POINT = new PointF(2.0f, 2.0f);

    @Nullable
    @GuardedBy("this")
    private Matrix mMatrix;

    @NonNull
    private final PreviewTransformation mPreviewTransformation;

    @Nullable
    @GuardedBy("this")
    private Rect mSensorRect = null;

    public PreviewViewMeteringPointFactory(@NonNull PreviewTransformation previewTransformation) {
        this.mPreviewTransformation = previewTransformation;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @NonNull
    @AnyThread
    public PointF convertPoint(float f11, float f12) {
        float[] fArr = {f11, f12};
        synchronized (this) {
            try {
                Matrix matrix = this.mMatrix;
                if (matrix == null) {
                    return INVALID_POINT;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @UiThread
    public void recalculate(@NonNull Size size, int i11) {
        Rect rect;
        Threads.checkMainThread();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.mSensorRect) != null) {
                    this.mMatrix = this.mPreviewTransformation.getPreviewViewToNormalizedSensorMatrix(size, i11, rect);
                    return;
                }
                this.mMatrix = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setSensorRect(Rect rect) {
        setSurfaceAspectRatio(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.mSensorRect = rect;
        }
    }
}
