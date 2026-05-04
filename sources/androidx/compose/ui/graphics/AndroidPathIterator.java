package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import androidx.graphics.path.PathIterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidPathIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,88:1\n36#2,5:89\n*S KotlinDebug\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n*L\n38#1:89,5\n*E\n"})
/* loaded from: classes.dex */
final class AndroidPathIterator implements PathIterator {

    @m80.k
    private final PathIterator.ConicEvaluation conicEvaluation;

    @m80.k
    private final androidx.graphics.path.PathIterator implementation;

    @m80.k
    private final Path path;

    @m80.k
    private final float[] segmentPoints = new float[8];
    private final float tolerance;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidPathIterator(@m80.k Path path, @m80.k PathIterator.ConicEvaluation conicEvaluation, float f11) {
        PathIterator.ConicEvaluation conicEvaluation2;
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f11;
        Path path2 = getPath();
        if (!(path2 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path2).getInternalPath();
        int i11 = WhenMappings.$EnumSwitchMapping$0[getConicEvaluation().ordinal()];
        if (i11 == 1) {
            conicEvaluation2 = PathIterator.ConicEvaluation.AsConic;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            conicEvaluation2 = PathIterator.ConicEvaluation.AsQuadratics;
        }
        this.implementation = new androidx.graphics.path.PathIterator(internalPath, conicEvaluation2, getTolerance());
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public int calculateSize(boolean z11) {
        return this.implementation.calculateSize(z11);
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    @m80.k
    public PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    @m80.k
    public Path getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public float getTolerance() {
        return this.tolerance;
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    @m80.k
    public PathSegment.Type next(@m80.k float[] fArr, int i11) {
        PathSegment.Type pathSegmentType;
        pathSegmentType = AndroidPathIterator_androidKt.toPathSegmentType(this.implementation.next(fArr, i11));
        return pathSegmentType;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        r1 = androidx.compose.ui.graphics.AndroidPathIterator_androidKt.toPathSegmentType(r11.implementation.next(r0, 0));
     */
    @Override // java.util.Iterator
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.graphics.PathSegment next() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidPathIterator.next():androidx.compose.ui.graphics.PathSegment");
    }
}
