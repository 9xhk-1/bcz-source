package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n36#2,5:373\n36#2,5:388\n65#3:378\n69#3:381\n65#3:383\n69#3:386\n65#3:393\n69#3:396\n65#3:411\n69#3:414\n65#3:417\n69#3:420\n60#4:379\n70#4:382\n60#4:384\n70#4:387\n60#4:394\n70#4:397\n85#4:400\n90#4:402\n85#4:404\n90#4:406\n60#4:412\n70#4:415\n60#4:418\n70#4:421\n22#5:380\n22#5:385\n22#5:395\n22#5:398\n22#5:413\n22#5:419\n54#6:399\n59#6:401\n54#6:403\n59#6:405\n34#7,4:407\n39#7:416\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n128#1:373,5\n199#1:388,5\n139#1:378\n139#1:381\n172#1:383\n172#1:386\n206#1:393\n207#1:396\n271#1:411\n271#1:414\n293#1:417\n293#1:420\n139#1:379\n139#1:382\n172#1:384\n172#1:387\n206#1:394\n207#1:397\n233#1:400\n234#1:402\n239#1:404\n240#1:406\n271#1:412\n271#1:415\n293#1:418\n293#1:421\n139#1:380\n172#1:385\n206#1:395\n207#1:398\n271#1:413\n293#1:419\n233#1:399\n234#1:401\n239#1:403\n240#1:405\n270#1:407,4\n270#1:416\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {

    @m80.l
    private Rect dstRect;

    @m80.k
    private android.graphics.Canvas internalCanvas;

    @m80.l
    private Rect srcRect;

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
    }

    private final void drawLines(List<Offset> list, Paint paint, int i11) {
        if (list.size() >= 2) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i12 = 0;
            while (i12 < list.size() - 1) {
                long m2278unboximpl = list.get(i12).m2278unboximpl();
                long m2278unboximpl2 = list.get(i12 + 1).m2278unboximpl();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (m2278unboximpl >> 32)), Float.intBitsToFloat((int) (m2278unboximpl & 4294967295L)), Float.intBitsToFloat((int) (m2278unboximpl2 >> 32)), Float.intBitsToFloat((int) (m2278unboximpl2 & 4294967295L)), asFrameworkPaint);
                i12 += i11;
            }
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            long m2278unboximpl = list.get(i11).m2278unboximpl();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (m2278unboximpl >> 32)), Float.intBitsToFloat((int) (m2278unboximpl & 4294967295L)), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i11) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
        int i12 = 0;
        while (i12 < fArr.length - 3) {
            this.internalCanvas.drawLine(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], asFrameworkPaint);
            i12 += i11 * 2;
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i11) {
        if (fArr.length % 2 == 0) {
            android.graphics.Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i12 = 0;
            while (i12 < fArr.length - 1) {
                this.internalCanvas.drawPoint(fArr[i12], fArr[i12 + 1], asFrameworkPaint);
                i12 += i11;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo2362clipPathmtrdDE(@m80.k Path path, int i11) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m2372toRegionOp7u2Bmg(i11));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo2363clipRectN_I0leg(float f11, float f12, float f13, float f14, int i11) {
        this.internalCanvas.clipRect(f11, f12, f13, f14, m2372toRegionOp7u2Bmg(i11));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo2364concat58bKbWc(@m80.k float[] fArr) {
        if (MatrixKt.m2764isIdentity58bKbWc(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m2379setFromEL8BTi8(matrix, fArr);
        this.internalCanvas.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, @m80.k Paint paint) {
        this.internalCanvas.drawArc(f11, f12, f13, f14, f15, f16, z11, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo2365drawCircle9KIMszo(long j11, float f11, @m80.k Paint paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f11, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo2366drawImaged4ec7I(@m80.k ImageBitmap imageBitmap, long j11, @m80.k Paint paint) {
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo2367drawImageRectHPBpro0(@m80.k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @m80.k Paint paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap);
        Rect rect = this.srcRect;
        kotlin.jvm.internal.g0.m(rect);
        rect.left = IntOffset.m5243getXimpl(j11);
        rect.top = IntOffset.m5244getYimpl(j11);
        rect.right = IntOffset.m5243getXimpl(j11) + ((int) (j12 >> 32));
        rect.bottom = IntOffset.m5244getYimpl(j11) + ((int) (j12 & 4294967295L));
        yz.g2 g2Var = yz.g2.f100423a;
        Rect rect2 = this.dstRect;
        kotlin.jvm.internal.g0.m(rect2);
        rect2.left = IntOffset.m5243getXimpl(j13);
        rect2.top = IntOffset.m5244getYimpl(j13);
        rect2.right = IntOffset.m5243getXimpl(j13) + ((int) (j14 >> 32));
        rect2.bottom = IntOffset.m5244getYimpl(j13) + ((int) (j14 & 4294967295L));
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo2368drawLineWko1d7g(long j11, long j12, @m80.k Paint paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f11, float f12, float f13, float f14, @m80.k Paint paint) {
        this.internalCanvas.drawOval(f11, f12, f13, f14, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@m80.k Path path, @m80.k Paint paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo2369drawPointsO7TthRY(int i11, @m80.k List<Offset> list, @m80.k Paint paint) {
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m2810equalsimpl0(i11, companion.m2814getLinesr_lszbg())) {
            drawLines(list, paint, 2);
        } else if (PointMode.m2810equalsimpl0(i11, companion.m2816getPolygonr_lszbg())) {
            drawLines(list, paint, 1);
        } else if (PointMode.m2810equalsimpl0(i11, companion.m2815getPointsr_lszbg())) {
            drawPoints(list, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo2370drawRawPointsO7TthRY(int i11, @m80.k float[] fArr, @m80.k Paint paint) {
        if (fArr.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m2810equalsimpl0(i11, companion.m2814getLinesr_lszbg())) {
            drawRawLines(fArr, paint, 2);
        } else if (PointMode.m2810equalsimpl0(i11, companion.m2816getPolygonr_lszbg())) {
            drawRawLines(fArr, paint, 1);
        } else if (PointMode.m2810equalsimpl0(i11, companion.m2815getPointsr_lszbg())) {
            drawRawPoints(fArr, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f11, float f12, float f13, float f14, @m80.k Paint paint) {
        this.internalCanvas.drawRect(f11, f12, f13, f14, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f11, float f12, float f13, float f14, float f15, float f16, @m80.k Paint paint) {
        this.internalCanvas.drawRoundRect(f11, f12, f13, f14, f15, f16, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo2371drawVerticesTPEHhCM(@m80.k Vertices vertices, int i11, @m80.k Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m2415toAndroidVertexModeJOOmi9M(vertices.m2911getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @m80.k
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f11) {
        this.internalCanvas.rotate(f11);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@m80.k androidx.compose.ui.geometry.Rect rect, @m80.k Paint paint) {
        this.internalCanvas.saveLayer(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f11, float f12) {
        this.internalCanvas.scale(f11, f12);
    }

    public final void setInternalCanvas(@m80.k android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f11, float f12) {
        this.internalCanvas.skew(f11, f12);
    }

    @m80.k
    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m2372toRegionOp7u2Bmg(int i11) {
        return ClipOp.m2493equalsimpl0(i11, ClipOp.Companion.m2497getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f11, float f12) {
        this.internalCanvas.translate(f11, f12);
    }

    @yz.v0
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }
}
