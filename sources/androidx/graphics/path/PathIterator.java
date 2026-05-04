package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import androidx.graphics.path.PathSegment;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PathIterator implements Iterator<PathSegment>, a {

    @k
    private final ConicEvaluation conicEvaluation;

    @k
    private final PathIteratorImpl implementation;

    @k
    private final Path path;
    private final float tolerance;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    public PathIterator(@k Path path, @k ConicEvaluation conicEvaluation, float f11) {
        g0.p(path, "path");
        g0.p(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f11;
        this.implementation = Build.VERSION.SDK_INT >= 34 ? new PathIteratorApi34Impl(path, conicEvaluation, f11) : new PathIteratorPreApi34Impl(path, conicEvaluation, f11);
    }

    public static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return pathIterator.calculateSize(z11);
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return pathIterator.next(fArr, i11);
    }

    public final int calculateSize(boolean z11) {
        return this.implementation.calculateSize(z11);
    }

    @k
    public final ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @k
    public final Path getPath() {
        return this.path;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    @w00.k
    @k
    public final PathSegment.Type next(@k float[] points) {
        g0.p(points, "points");
        return next$default(this, points, 0, 2, null);
    }

    @k
    public final PathSegment.Type peek() {
        return this.implementation.peek();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @w00.k
    @k
    public final PathSegment.Type next(@k float[] points, int i11) {
        g0.p(points, "points");
        return this.implementation.next(points, i11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @k
    public PathSegment next() {
        return this.implementation.next();
    }

    public /* synthetic */ PathIterator(Path path, ConicEvaluation conicEvaluation, float f11, int i11, v vVar) {
        this(path, (i11 & 2) != 0 ? ConicEvaluation.AsQuadratics : conicEvaluation, (i11 & 4) != 0 ? 0.25f : f11);
    }
}
