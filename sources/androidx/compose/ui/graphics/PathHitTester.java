package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,163:1\n67#2:164\n80#2:166\n22#3:165\n71#4:167\n65#4:168\n73#4:171\n69#4:172\n60#5:169\n70#5:173\n22#6:170\n22#6:174\n151#7,17:175\n*S KotlinDebug\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n*L\n100#1:164\n100#1:166\n100#1:165\n122#1:167\n122#1:168\n125#1:171\n125#1:172\n122#1:169\n125#1:173\n122#1:170\n125#1:174\n131#1:175,17\n*E\n"})
/* loaded from: classes.dex */
public final class PathHitTester {

    @m80.k
    private Rect bounds;

    @m80.k
    private final float[] curves;

    @m80.k
    private final IntervalTree<PathSegment> intervals;

    @m80.k
    private Path path;

    @m80.k
    private final float[] roots;
    private float tolerance;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PathHitTester() {
        Path path;
        path = PathHitTesterKt.EmptyPath;
        this.path = path;
        this.tolerance = 0.5f;
        this.bounds = Rect.Companion.getZero();
        this.intervals = new IntervalTree<>();
        this.curves = new float[20];
        this.roots = new float[2];
    }

    public static /* synthetic */ void updatePath$default(PathHitTester pathHitTester, Path path, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.5f;
        }
        pathHitTester.updatePath(path, f11);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2793containsk4lQ0M(long j11) {
        int i11;
        int lineWinding;
        if (!this.path.isEmpty() && this.bounds.m2294containsk4lQ0M(j11)) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
            float[] fArr = this.curves;
            float[] fArr2 = this.roots;
            IntervalTree<PathSegment> intervalTree = this.intervals;
            IntervalTree<PathSegment>.Node node = intervalTree.root;
            if (node != intervalTree.terminator) {
                ArrayList<IntervalTree<PathSegment>.Node> arrayList = intervalTree.stack;
                arrayList.add(node);
                i11 = 0;
                while (arrayList.size() > 0) {
                    IntervalTree<PathSegment>.Node remove = arrayList.remove(arrayList.size() - 1);
                    if (remove.overlaps(intBitsToFloat2, intBitsToFloat2)) {
                        PathSegment data = remove.getData();
                        kotlin.jvm.internal.g0.m(data);
                        PathSegment pathSegment = data;
                        float[] points = pathSegment.getPoints();
                        int i12 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
                        if (i12 == 1) {
                            lineWinding = BezierKt.lineWinding(points, intBitsToFloat, intBitsToFloat2);
                        } else if (i12 == 2) {
                            lineWinding = BezierKt.quadraticWinding(points, intBitsToFloat, intBitsToFloat2, fArr, fArr2);
                        } else if (i12 == 3) {
                            lineWinding = BezierKt.cubicWinding(points, intBitsToFloat, intBitsToFloat2, fArr, fArr2);
                        }
                        i11 += lineWinding;
                    }
                    if (remove.getLeft() != intervalTree.terminator && remove.getLeft().getMax() >= intBitsToFloat2) {
                        arrayList.add(remove.getLeft());
                    }
                    if (remove.getRight() != intervalTree.terminator && remove.getRight().getMin() <= intBitsToFloat2) {
                        arrayList.add(remove.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i11 = 0;
            }
            if (PathFillType.m2787equalsimpl0(this.path.mo2400getFillTypeRgk1Os(), PathFillType.Companion.m2791getEvenOddRgk1Os())) {
                i11 &= 1;
            }
            if (i11 != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(@m80.k Path path, @FloatRange(from = 0.0d) float f11) {
        this.path = path;
        this.tolerance = f11;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, f11);
        while (it.hasNext()) {
            PathSegment next = it.next();
            int i11 = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                long computeVerticalBounds$default = BezierKt.computeVerticalBounds$default(next, this.curves, 0, 4, null);
                this.intervals.addInterval(Float.intBitsToFloat((int) (computeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (computeVerticalBounds$default & 4294967295L)), next);
            } else if (i11 == 4) {
                return;
            }
        }
    }
}
