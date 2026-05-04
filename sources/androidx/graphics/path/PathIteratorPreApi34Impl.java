package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import dalvik.annotation.optimization.FastNative;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {
    private final long internalPathIterator;

    public /* synthetic */ PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f11, int i11, v vVar) {
        this(path, (i11 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i11 & 4) != 0 ? 0.25f : f11);
    }

    private final native long createInternalPathIterator(Path path, int i11, float f11);

    private final native void destroyInternalPathIterator(long j11);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j11);

    @FastNative
    private final native int internalPathIteratorNext(long j11, float[] fArr, int i11);

    @FastNative
    private final native int internalPathIteratorPeek(long j11);

    @FastNative
    private final native int internalPathIteratorRawSize(long j11);

    @FastNative
    private final native int internalPathIteratorSize(long j11);

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean z11) {
        return (!z11 || getConicEvaluation() == PathIterator.ConicEvaluation.AsConic) ? internalPathIteratorRawSize(this.internalPathIterator) : internalPathIteratorSize(this.internalPathIterator);
    }

    public final void finalize() {
        destroyInternalPathIterator(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return internalPathIteratorHasNext(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    @k
    public PathSegment.Type next(@k float[] points, int i11) {
        PathSegment.Type[] typeArr;
        g0.p(points, "points");
        typeArr = PathIteratorImplKt.PathSegmentTypes;
        return typeArr[internalPathIteratorNext(this.internalPathIterator, points, i11)];
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    @k
    public PathSegment.Type peek() {
        PathSegment.Type[] typeArr;
        typeArr = PathIteratorImplKt.PathSegmentTypes;
        return typeArr[internalPathIteratorPeek(this.internalPathIterator)];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(@k Path path, @k PathIterator.ConicEvaluation conicEvaluation, float f11) {
        super(path, conicEvaluation, f11);
        g0.p(path, "path");
        g0.p(conicEvaluation, "conicEvaluation");
        this.internalPathIterator = createInternalPathIterator(path, conicEvaluation.ordinal(), f11);
    }
}
