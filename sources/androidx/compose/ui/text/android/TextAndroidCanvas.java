package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas nativeCanvas;

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutPath(@m80.k Path path) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutPath(canvas, path);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@m80.k RectF rectF) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public boolean clipPath(@m80.k Path path, @m80.k Region.Op op2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op2);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public boolean clipRect(@m80.k RectF rectF, @m80.k Region.Op op2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op2);
    }

    @Override // android.graphics.Canvas
    public void concat(@m80.l Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void disableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.disableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i11, int i12, int i13, int i14) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public void drawArc(@m80.k RectF rectF, float f11, float f12, boolean z11, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f11, f12, z11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@m80.k Bitmap bitmap, float f11, float f12, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(@m80.k Bitmap bitmap, int i11, int i12, @m80.k float[] fArr, int i13, @m80.l int[] iArr, int i14, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i11, i12, fArr, i13, iArr, i14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f11, float f12, float f13, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i11);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@m80.k RectF rectF, float f11, float f12, @m80.k RectF rectF2, float f13, float f14, @m80.k Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, rectF, f11, f12, rectF2, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawGlyphs(@m80.k int[] iArr, int i11, @m80.k float[] fArr, int i12, int i13, @m80.k Font font, @m80.k Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawGlyphs(canvas, iArr, i11, fArr, i12, i13, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f11, float f12, float f13, float f14, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@m80.k float[] fArr, int i11, int i12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i11, i12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(@m80.k RectF rectF, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(@m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@m80.k NinePatch ninePatch, @m80.k Rect rect, @m80.l Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(@m80.k Path path, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@m80.k Picture picture) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@m80.l float[] fArr, int i11, int i12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i11, i12, paint);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public void drawPosText(@m80.k char[] cArr, int i11, int i12, @m80.k float[] fArr, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i11, i12, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i11, int i12, int i13) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@m80.k RectF rectF, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawRenderNode(@m80.k RenderNode renderNode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawRenderNode(canvas, renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(@m80.k RectF rectF, float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@m80.k char[] cArr, int i11, int i12, float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i11, i12, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@m80.k char[] cArr, int i11, int i12, @m80.k Path path, float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i11, i12, path, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@m80.k char[] cArr, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, @m80.k Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, cArr, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(@m80.k Canvas.VertexMode vertexMode, int i11, @m80.k float[] fArr, int i12, @m80.l float[] fArr2, int i13, @m80.l int[] iArr, int i14, @m80.l short[] sArr, int i15, int i16, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i11, fArr, i12, fArr2, i13, iArr, i14, sArr, i15, i16, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void enableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.enableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(@m80.k Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    @m80.l
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public void getMatrix(@m80.k Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public boolean quickReject(@m80.k RectF rectF, @m80.k Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i11);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f11);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public int saveLayer(@m80.l RectF rectF, @m80.l Paint paint, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i11);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public int saveLayerAlpha(@m80.l RectF rectF, int i11, int i12) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void scale(float f11, float f12) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f11, f12);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(@m80.l Bitmap bitmap) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public final void setCanvas(@m80.k Canvas canvas) {
        this.nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i11);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(@m80.l DrawFilter drawFilter) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(@m80.l Matrix matrix) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f11, float f12) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f11, f12);
    }

    @Override // android.graphics.Canvas
    public void translate(float f11, float f12) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f11, f12);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(@m80.k Rect rect) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(@m80.k Path path) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public boolean clipRect(@m80.k Rect rect, @m80.k Region.Op op2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f11, f12, f13, f14, f15, f16, z11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@m80.k Bitmap bitmap, @m80.l Rect rect, @m80.k RectF rectF, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j11) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, j11);
    }

    @Override // android.graphics.Canvas
    public void drawLines(@m80.k float[] fArr, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f11, float f12, float f13, float f14, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(31)
    public void drawPatch(@m80.k NinePatch ninePatch, @m80.k RectF rectF, @m80.l Paint paint) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@m80.k Picture picture, @m80.k RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(@m80.k float[] fArr, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public void drawPosText(@m80.k String str, @m80.k float[] fArr, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(@m80.k Rect rect, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f11, float f12, float f13, float f14, float f15, float f16, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f11, f12, f13, f14, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@m80.k String str, float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(@m80.k String str, @m80.k Path path, float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@m80.k RectF rectF) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(@m80.l RectF rectF, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(@m80.l RectF rectF, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i11);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(float f11, float f12, float f13, float f14) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, f11, f12, f13, f14);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@m80.k RectF rectF) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@m80.k Bitmap bitmap, @m80.l Rect rect, @m80.k Rect rect2, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i11, @m80.k PorterDuff.Mode mode) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i11, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(@m80.k Picture picture, @m80.k Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f11, float f12, float f13, float f14, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@m80.k String str, int i11, int i12, float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i11, i12, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public boolean quickReject(@m80.k Path path, @m80.k Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public int saveLayer(float f11, float f12, float f13, float f14, @m80.l Paint paint, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f11, f12, f13, f14, paint, i11);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public int saveLayerAlpha(float f11, float f12, float f13, float f14, int i11, int i12) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f11, f12, f13, f14, i11, i12);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(26)
    public boolean clipOutRect(int i11, int i12, int i13, int i14) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(@m80.k Rect rect) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public void drawBitmap(@m80.k int[] iArr, int i11, int i12, float f11, float f12, int i13, int i14, boolean z11, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i11, i12, f11, f12, i13, i14, z11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(int i11, @m80.k BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, i11, blendMode);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawDoubleRoundRect(@m80.k RectF rectF, @m80.k float[] fArr, @m80.k RectF rectF2, @m80.k float[] fArr2, @m80.k Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(@m80.k CharSequence charSequence, int i11, int i12, float f11, float f12, @m80.k Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i11, i12, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(23)
    public void drawTextRun(@m80.k CharSequence charSequence, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, @m80.k Paint paint) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, charSequence, i11, i12, i13, i14, f11, f12, z11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(@m80.k Path path) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f11, float f12, float f13, float f14, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f11, float f12, float f13, float f14, int i11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f11, f12, f13, f14, i11);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public boolean clipRect(float f11, float f12, float f13, float f14, @m80.k Region.Op op2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f11, f12, f13, f14, op2);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public void drawBitmap(@m80.k int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i11, i12, i13, i14, i15, i16, z11, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawColor(long j11, @m80.k BlendMode blendMode) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, j11, blendMode);
    }

    @Override // android.graphics.Canvas
    @yz.n(message = "Deprecated in Java")
    public boolean quickReject(float f11, float f12, float f13, float f14, @m80.k Canvas.EdgeType edgeType) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f11, f12, f13, f14, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f11, float f12, float f13, float f14) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f11, f12, f13, f14);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(@m80.k Bitmap bitmap, @m80.k Matrix matrix, @m80.l Paint paint) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(30)
    public boolean quickReject(float f11, float f12, float f13, float f14) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, f11, f12, f13, f14);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i11, int i12, int i13, int i14) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i11, i12, i13, i14);
    }

    @Override // android.graphics.Canvas
    @RequiresApi(29)
    public void drawTextRun(@m80.k MeasuredText measuredText, int i11, int i12, int i13, int i14, float f11, float f12, boolean z11, @m80.k Paint paint) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            kotlin.jvm.internal.g0.S("nativeCanvas");
            canvas = null;
        }
        canvasCompatQ.drawTextRun(canvas, measuredText, i11, i12, i13, i14, f11, f12, z11, paint);
    }
}
