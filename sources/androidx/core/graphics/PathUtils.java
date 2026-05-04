package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PathUtils {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static float[] approximate(Path path, float f11) {
            return path.approximate(f11);
        }
    }

    private PathUtils() {
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path) {
        return flatten(path, 0.5f);
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path, @FloatRange(from = 0.0d) float f11) {
        float[] approximate = Api26Impl.approximate(path, f11);
        int length = approximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 1; i11 < length; i11++) {
            int i12 = i11 * 3;
            int i13 = (i11 - 1) * 3;
            float f12 = approximate[i12];
            float f13 = approximate[i12 + 1];
            float f14 = approximate[i12 + 2];
            float f15 = approximate[i13];
            float f16 = approximate[i13 + 1];
            float f17 = approximate[i13 + 2];
            if (f12 != f15 && (f13 != f16 || f14 != f17)) {
                arrayList.add(new PathSegment(new PointF(f16, f17), f15, new PointF(f13, f14), f12));
            }
        }
        return arrayList;
    }
}
