package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,257:1\n48#2:258\n53#2:261\n48#2:264\n53#2:267\n48#2:270\n53#2:273\n48#2:276\n53#2:279\n60#3:259\n70#3:262\n60#3:265\n70#3:268\n60#3:271\n70#3:274\n60#3:277\n70#3:280\n60#3:288\n70#3:291\n60#3:293\n70#3:296\n22#4:260\n22#4:263\n22#4:266\n22#4:269\n22#4:272\n22#4:275\n22#4:278\n22#4:281\n22#4:289\n22#4:294\n36#5,5:282\n36#5,5:297\n65#6:287\n69#6:290\n65#6:292\n69#6:295\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n160#1:258\n161#1:261\n163#1:264\n164#1:267\n166#1:270\n167#1:273\n169#1:276\n170#1:279\n160#1:259\n161#1:262\n163#1:265\n164#1:268\n166#1:271\n167#1:274\n169#1:277\n170#1:280\n187#1:288\n187#1:291\n204#1:293\n204#1:296\n160#1:260\n161#1:263\n163#1:266\n164#1:269\n166#1:272\n167#1:275\n169#1:278\n170#1:281\n187#1:289\n204#1:294\n187#1:282,5\n231#1:297,5\n187#1:287\n187#1:290\n204#1:292\n204#1:295\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPath implements Path {

    @m80.k
    private final android.graphics.Path internalPath;

    @m80.l
    private android.graphics.Matrix mMatrix;

    @m80.l
    private float[] radii;

    @m80.l
    private RectF rectF;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void validateRectangle(Rect rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(@m80.k Rect rect, float f11, float f12) {
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.g0.m(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.g0.m(rectF2);
        path.addArc(rectF2, f11, f12);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(@m80.k Rect rect, float f11, float f12) {
        addArc(rect, DegreesKt.degrees(f11), DegreesKt.degrees(f12));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(@m80.k Rect rect) {
        addOval(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo2399addPathUv8p0NA(@m80.k Path path, long j11) {
        android.graphics.Path path2 = this.internalPath;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((AndroidPath) path).getInternalPath(), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(@m80.k Rect rect) {
        addRect(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(@m80.k RoundRect roundRect) {
        addRoundRect(roundRect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(@m80.k Rect rect, float f11, float f12, boolean z11) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.g0.m(rectF);
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.g0.m(rectF2);
        path.arcTo(rectF2, f11, f12, z11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.internalPath.cubicTo(f11, f12, f13, f14, f15, f16);
    }

    @Override // androidx.compose.ui.graphics.Path
    @m80.k
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.g0.m(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo2400getFillTypeRgk1Os() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? PathFillType.Companion.m2791getEvenOddRgk1Os() : PathFillType.Companion.m2792getNonZeroRgk1Os();
    }

    @m80.k
    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float f11, float f12) {
        this.internalPath.lineTo(f11, f12);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float f11, float f12) {
        this.internalPath.moveTo(f11, f12);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo2401opN5in7k0(@m80.k Path path, @m80.k Path path2, int i11) {
        PathOperation.Companion companion = PathOperation.Companion;
        Path.Op op2 = PathOperation.m2797equalsimpl0(i11, companion.m2801getDifferenceb3I0S0c()) ? Path.Op.DIFFERENCE : PathOperation.m2797equalsimpl0(i11, companion.m2802getIntersectb3I0S0c()) ? Path.Op.INTERSECT : PathOperation.m2797equalsimpl0(i11, companion.m2803getReverseDifferenceb3I0S0c()) ? Path.Op.REVERSE_DIFFERENCE : PathOperation.m2797equalsimpl0(i11, companion.m2804getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        android.graphics.Path path3 = this.internalPath;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
        if (path2 instanceof AndroidPath) {
            return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f11, float f12, float f13, float f14) {
        this.internalPath.quadTo(f11, f12, f13, f14);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticTo(float f11, float f12, float f13, float f14) {
        this.internalPath.quadTo(f11, f12, f13, f14);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.internalPath.rCubicTo(f11, f12, f13, f14, f15, f16);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f11, float f12) {
        this.internalPath.rLineTo(f11, f12);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f11, float f12) {
        this.internalPath.rMoveTo(f11, f12);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f11, float f12, float f13, float f14) {
        this.internalPath.rQuadTo(f11, f12, f13, f14);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticTo(float f11, float f12, float f13, float f14) {
        this.internalPath.rQuadTo(f11, f12, f13, f14);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo2402setFillTypeoQ8Xj4U(int i11) {
        this.internalPath.setFillType(PathFillType.m2787equalsimpl0(i11, PathFillType.Companion.m2791getEvenOddRgk1Os()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo2403transform58bKbWc(@m80.k float[] fArr) {
        if (this.mMatrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix = this.mMatrix;
        kotlin.jvm.internal.g0.m(matrix);
        AndroidMatrixConversions_androidKt.m2379setFromEL8BTi8(matrix, fArr);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.g0.m(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo2404translatek4lQ0M(long j11) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            kotlin.jvm.internal.g0.m(matrix);
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.g0.m(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        kotlin.jvm.internal.g0.m(matrix3);
        path.transform(matrix3);
    }

    public AndroidPath(@m80.k android.graphics.Path path) {
        this.internalPath = path;
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(@m80.k Rect rect, @m80.k Path.Direction direction) {
        Path.Direction platformPathDirection;
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.g0.m(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.g0.m(rectF2);
        platformPathDirection = AndroidPath_androidKt.toPlatformPathDirection(direction);
        path.addOval(rectF2, platformPathDirection);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(@m80.k Rect rect, @m80.k Path.Direction direction) {
        Path.Direction platformPathDirection;
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.g0.m(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.g0.m(rectF2);
        platformPathDirection = AndroidPath_androidKt.toPlatformPathDirection(direction);
        path.addRect(rectF2, platformPathDirection);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(@m80.k RoundRect roundRect, @m80.k Path.Direction direction) {
        Path.Direction platformPathDirection;
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.g0.m(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        kotlin.jvm.internal.g0.m(fArr);
        fArr[0] = Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() & 4294967295L));
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.g0.m(rectF2);
        float[] fArr2 = this.radii;
        kotlin.jvm.internal.g0.m(fArr2);
        platformPathDirection = AndroidPath_androidKt.toPlatformPathDirection(direction);
        path.addRoundRect(rectF2, fArr2, platformPathDirection);
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new android.graphics.Path() : path);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }
}
