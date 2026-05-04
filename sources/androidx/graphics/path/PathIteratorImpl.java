package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPathIteratorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,304:1\n26#2:305\n*S KotlinDebug\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n*L\n104#1:305\n*E\n"})
/* loaded from: classes2.dex */
public abstract class PathIteratorImpl {

    @k
    private static final Companion Companion = new Companion(null);

    @k
    private final PathIterator.ConicEvaluation conicEvaluation;

    @k
    private final Path path;

    @k
    private final float[] pointsData;
    private final float tolerance;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public PathIteratorImpl(@k Path path, @k PathIterator.ConicEvaluation conicEvaluation, float f11) {
        g0.p(path, "path");
        g0.p(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f11;
        this.pointsData = new float[8];
    }

    private final PointF[] floatsToPoints(float[] fArr, PathSegment.Type type) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i11 != 1 ? i11 != 2 ? (i11 == 3 || i11 == 4) ? new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])} : i11 != 5 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])} : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])} : new PointF[]{new PointF(fArr[0], fArr[1])};
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIteratorImpl pathIteratorImpl, float[] fArr, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return pathIteratorImpl.next(fArr, i11);
    }

    public abstract int calculateSize(boolean z11);

    @k
    public final PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @k
    public final Path getPath() {
        return this.path;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    public abstract boolean hasNext();

    @k
    public abstract PathSegment.Type next(@k float[] fArr, int i11);

    @k
    public final PathSegment next() {
        PathSegment.Type next = next(this.pointsData, 0);
        if (next == PathSegment.Type.Done) {
            return PathSegmentUtilities.getDoneSegment();
        }
        if (next == PathSegment.Type.Close) {
            return PathSegmentUtilities.getCloseSegment();
        }
        return new PathSegment(next, floatsToPoints(this.pointsData, next), next == PathSegment.Type.Conic ? this.pointsData[6] : 0.0f);
    }

    @k
    public abstract PathSegment.Type peek();

    public /* synthetic */ PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f11, int i11, v vVar) {
        this(path, (i11 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i11 & 4) != 0 ? 0.25f : f11);
    }
}
