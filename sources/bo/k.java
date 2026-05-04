package bo;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k extends PathMotion {
    public static PointF a(float f11, float f12, float f13, float f14) {
        return f12 > f14 ? new PointF(f13, f12) : new PointF(f11, f14);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(f11, f12);
        PointF a11 = a(f11, f12, f13, f14);
        path.quadTo(a11.x, a11.y, f13, f14);
        return path;
    }
}
