package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.view.TransformExperimental;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TransformExperimental
/* loaded from: classes.dex */
public final class OutputTransform {

    @NonNull
    final Matrix mMatrix;

    @NonNull
    final Size mViewPortSize;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OutputTransform(@NonNull Matrix matrix, @NonNull Size size) {
        this.mMatrix = matrix;
        this.mViewPortSize = size;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Matrix getMatrix() {
        return this.mMatrix;
    }

    @NonNull
    public Size getViewPortSize() {
        return this.mViewPortSize;
    }
}
