package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "PathUtilities")
/* loaded from: classes2.dex */
public final class PathUtilities {
    @k
    public static final PathIterator iterator(@k Path path) {
        g0.p(path, "<this>");
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.25f;
        }
        return iterator(path, conicEvaluation, f11);
    }

    @k
    public static final PathIterator iterator(@k Path path, @k PathIterator.ConicEvaluation conicEvaluation, float f11) {
        g0.p(path, "<this>");
        g0.p(conicEvaluation, "conicEvaluation");
        return new PathIterator(path, conicEvaluation, f11);
    }
}
