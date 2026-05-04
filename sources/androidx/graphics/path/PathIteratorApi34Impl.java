package androidx.graphics.path;

import android.graphics.Path;
import androidx.annotation.RequiresApi;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(34)
/* loaded from: classes2.dex */
public final class PathIteratorApi34Impl extends PathIteratorImpl {

    @k
    private final ConicConverter conicConverter;

    @k
    private final android.graphics.PathIterator platformIterator;

    public /* synthetic */ PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f11, int i11, v vVar) {
        this(path, (i11 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i11 & 4) != 0 ? 0.25f : f11);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean z11) {
        boolean z12 = z11 && getConicEvaluation() == PathIterator.ConicEvaluation.AsQuadratics;
        android.graphics.PathIterator pathIterator = getPath().getPathIterator();
        g0.o(pathIterator, "path.pathIterator");
        float[] fArr = new float[8];
        int i11 = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z12) {
                ConicConverter conicConverter = this.conicConverter;
                ConicConverter.convert$default(conicConverter, fArr, fArr[6], getTolerance(), 0, 8, null);
                i11 += conicConverter.getQuadraticCount();
            } else {
                i11++;
            }
        }
        return i11;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return this.platformIterator.hasNext();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    @k
    public PathSegment.Type next(@k float[] points, int i11) {
        PathSegment.Type platformToAndroidXSegmentType;
        g0.p(points, "points");
        if (this.conicConverter.getCurrentQuadratic() < this.conicConverter.getQuadraticCount()) {
            this.conicConverter.nextQuadratic(points, i11);
            return PathSegment.Type.Quadratic;
        }
        platformToAndroidXSegmentType = PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.next(points, i11));
        if (platformToAndroidXSegmentType != PathSegment.Type.Conic || getConicEvaluation() != PathIterator.ConicEvaluation.AsQuadratics) {
            return platformToAndroidXSegmentType;
        }
        ConicConverter conicConverter = this.conicConverter;
        conicConverter.convert(points, points[i11 + 6], getTolerance(), i11);
        if (conicConverter.getQuadraticCount() > 0) {
            conicConverter.nextQuadratic(points, i11);
        }
        return PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    @k
    public PathSegment.Type peek() {
        PathSegment.Type platformToAndroidXSegmentType;
        platformToAndroidXSegmentType = PathIteratorImplKt.platformToAndroidXSegmentType(this.platformIterator.peek());
        return platformToAndroidXSegmentType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorApi34Impl(@k Path path, @k PathIterator.ConicEvaluation conicEvaluation, float f11) {
        super(path, conicEvaluation, f11);
        g0.p(path, "path");
        g0.p(conicEvaluation, "conicEvaluation");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        g0.o(pathIterator, "path.pathIterator");
        this.platformIterator = pathIterator;
        this.conicConverter = new ConicConverter();
    }
}
