package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.Motion;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MotionRenderDebug {
    private static final int DEBUG_PATH_TICKS_PER_MS = 16;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static final int MAX_KEY_FRAMES = 50;

    @k
    private DashPathEffect mDashPathEffect;

    @k
    private Paint mFillPaint;
    private int mKeyFrameCount;

    @k
    private float[] mKeyFramePoints;

    @k
    private Paint mPaint;

    @k
    private Paint mPaintGraph;

    @k
    private Paint mPaintKeyframes;

    @l
    private Path mPath;

    @k
    private int[] mPathMode;

    @l
    private float[] mPoints;
    private boolean mPresentationMode;

    @k
    private final float[] mRectangle;
    private int mShadowTranslate;

    @k
    private Paint mTextPaint;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int mRedColor = -21965;
    private final int mKeyframeColor = -2067046;
    private final int mGraphColor = -13391360;
    private final int mShadowColor = 1996488704;
    private final int mDiamondSize = 10;

    @k
    private Rect mBounds = new Rect();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public MotionRenderDebug(float f11) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        Paint paint2 = this.mPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.mPaintKeyframes = paint3;
        paint3.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(style);
        Paint paint4 = new Paint();
        this.mPaintGraph = paint4;
        paint4.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(style);
        Paint paint5 = new Paint();
        this.mTextPaint = paint5;
        paint5.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(f11);
        this.mRectangle = new float[8];
        Paint paint6 = new Paint();
        this.mFillPaint = paint6;
        paint6.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    private final void drawBasicPath(Canvas canvas) {
        float[] fArr = this.mPoints;
        g0.m(fArr);
        canvas.drawLines(fArr, this.mPaint);
    }

    private final void drawPathAsConfigured(Canvas canvas) {
        int i11 = this.mKeyFrameCount;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.mPathMode[i12];
            if (i13 == 1) {
                z11 = true;
            }
            if (i13 == 0) {
                z12 = true;
            }
        }
        if (z11) {
            drawPathRelative(canvas);
        }
        if (z12) {
            drawPathCartesian(canvas);
        }
    }

    private final void drawPathCartesian(Canvas canvas) {
        float[] fArr = this.mPoints;
        g0.m(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.mPoints;
        g0.m(fArr2);
        float f12 = fArr2[1];
        float[] fArr3 = this.mPoints;
        g0.m(fArr3);
        g0.m(this.mPoints);
        float f13 = fArr3[r5.length - 2];
        float[] fArr4 = this.mPoints;
        g0.m(fArr4);
        float[] fArr5 = this.mPoints;
        g0.m(fArr5);
        float f14 = fArr4[fArr5.length - 1];
        canvas.drawLine(Math.min(f11, f13), Math.max(f12, f14), Math.max(f11, f13), Math.max(f12, f14), this.mPaintGraph);
        canvas.drawLine(Math.min(f11, f13), Math.min(f12, f14), Math.min(f11, f13), Math.max(f12, f14), this.mPaintGraph);
    }

    private final void drawPathCartesianTicks(Canvas canvas, float f11, float f12) {
        float[] fArr = this.mPoints;
        g0.m(fArr);
        float f13 = fArr[0];
        float[] fArr2 = this.mPoints;
        g0.m(fArr2);
        float f14 = fArr2[1];
        float[] fArr3 = this.mPoints;
        g0.m(fArr3);
        float[] fArr4 = this.mPoints;
        g0.m(fArr4);
        float f15 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        g0.m(fArr5);
        float[] fArr6 = this.mPoints;
        g0.m(fArr6);
        float f16 = fArr5[fArr6.length - 1];
        float min = Math.min(f13, f15);
        float max = Math.max(f14, f16);
        float min2 = f11 - Math.min(f13, f15);
        float max2 = Math.max(f14, f16) - f12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        float f17 = 100;
        sb2.append(((int) (((f17 * min2) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
        String sb3 = sb2.toString();
        getTextBounds(sb3, this.mTextPaint);
        float f18 = 2;
        canvas.drawText(sb3, ((min2 / f18) - (this.mBounds.width() / 2)) + min, f12 - 20, this.mTextPaint);
        canvas.drawLine(f11, f12, Math.min(f13, f15), f12, this.mPaintGraph);
        String str = "" + (((int) (((f17 * max2) / Math.abs(f16 - f14)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, f11 + 5, max - ((max2 / f18) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(f11, f12, f11, Math.max(f14, f16), this.mPaintGraph);
    }

    private final void drawPathRelative(Canvas canvas) {
        float[] fArr = this.mPoints;
        g0.m(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.mPoints;
        g0.m(fArr2);
        float f12 = fArr2[1];
        float[] fArr3 = this.mPoints;
        g0.m(fArr3);
        g0.m(this.mPoints);
        float f13 = fArr3[r2.length - 2];
        float[] fArr4 = this.mPoints;
        g0.m(fArr4);
        float[] fArr5 = this.mPoints;
        g0.m(fArr5);
        canvas.drawLine(f11, f12, f13, fArr4[fArr5.length - 1], this.mPaintGraph);
    }

    private final void drawPathRelativeTicks(Canvas canvas, float f11, float f12) {
        float[] fArr = this.mPoints;
        g0.m(fArr);
        float f13 = fArr[0];
        float[] fArr2 = this.mPoints;
        g0.m(fArr2);
        float f14 = fArr2[1];
        float[] fArr3 = this.mPoints;
        g0.m(fArr3);
        float[] fArr4 = this.mPoints;
        g0.m(fArr4);
        float f15 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.mPoints;
        g0.m(fArr5);
        float[] fArr6 = this.mPoints;
        g0.m(fArr6);
        float f16 = fArr5[fArr6.length - 1];
        float hypot = (float) Math.hypot(f13 - f15, f14 - f16);
        float f17 = f15 - f13;
        float f18 = f16 - f14;
        float f19 = (((f11 - f13) * f17) + ((f12 - f14) * f18)) / (hypot * hypot);
        float f21 = f13 + (f17 * f19);
        float f22 = f14 + (f19 * f18);
        Path path = new Path();
        path.moveTo(f11, f12);
        path.lineTo(f21, f22);
        float hypot2 = (float) Math.hypot(f21 - f11, f22 - f12);
        String str = "" + (((int) ((100 * hypot2) / hypot)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (hypot2 / 2) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(f11, f12, f21, f22, this.mPaintGraph);
    }

    private final void drawPathScreenTicks(Canvas canvas, float f11, float f12, int i11, int i12, int i13, int i14) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        float f13 = 100;
        sb2.append(((int) ((((f11 - (i11 / 2)) * f13) / (i13 - i11)) + 0.5d)) / 100.0f);
        String sb3 = sb2.toString();
        getTextBounds(sb3, this.mTextPaint);
        float f14 = 2;
        canvas.drawText(sb3, ((f11 / f14) - (this.mBounds.width() / 2)) + 0.0f, f12 - 20, this.mTextPaint);
        canvas.drawLine(f11, f12, Math.min(0.0f, 1.0f), f12, this.mPaintGraph);
        String str = "" + (((int) (((f13 * (f12 - (i12 / 2))) / (i14 - i12)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, f11 + 5, 0.0f - ((f12 / f14) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(f11, f12, f11, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }

    private final void drawRectangle(Canvas canvas, Motion motion) {
        Path path = this.mPath;
        g0.m(path);
        path.reset();
        int i11 = 0;
        while (true) {
            motion.buildRect(i11 / 50, this.mRectangle, 0);
            Path path2 = this.mPath;
            g0.m(path2);
            float[] fArr = this.mRectangle;
            path2.moveTo(fArr[0], fArr[1]);
            Path path3 = this.mPath;
            g0.m(path3);
            float[] fArr2 = this.mRectangle;
            path3.lineTo(fArr2[2], fArr2[3]);
            Path path4 = this.mPath;
            g0.m(path4);
            float[] fArr3 = this.mRectangle;
            path4.lineTo(fArr3[4], fArr3[5]);
            Path path5 = this.mPath;
            g0.m(path5);
            float[] fArr4 = this.mRectangle;
            path5.lineTo(fArr4[6], fArr4[7]);
            Path path6 = this.mPath;
            g0.m(path6);
            path6.close();
            if (i11 == 50) {
                this.mPaint.setColor(1140850688);
                canvas.translate(2.0f, 2.0f);
                Path path7 = this.mPath;
                g0.m(path7);
                canvas.drawPath(path7, this.mPaint);
                canvas.translate(-2.0f, -2.0f);
                this.mPaint.setColor(-65536);
                Path path8 = this.mPath;
                g0.m(path8);
                canvas.drawPath(path8, this.mPaint);
                return;
            }
            i11++;
        }
    }

    private final void drawTicks(Canvas canvas, int i11, int i12, Motion motion, int i13, int i14) {
        int i15;
        int i16;
        if (motion.getView() != null) {
            i15 = motion.getView().getWidth();
            i16 = motion.getView().getHeight();
        } else {
            i15 = 0;
            i16 = 0;
        }
        int i17 = i12 - 1;
        for (int i18 = 1; i18 < i17; i18++) {
            if (i11 != 4 || this.mPathMode[i18 - 1] != 0) {
                float[] fArr = this.mKeyFramePoints;
                int i19 = i18 * 2;
                float f11 = fArr[i19];
                float f12 = fArr[i19 + 1];
                Path path = this.mPath;
                g0.m(path);
                path.reset();
                Path path2 = this.mPath;
                g0.m(path2);
                path2.moveTo(f11, this.mDiamondSize + f12);
                Path path3 = this.mPath;
                g0.m(path3);
                path3.lineTo(this.mDiamondSize + f11, f12);
                Path path4 = this.mPath;
                g0.m(path4);
                path4.lineTo(f11, f12 - this.mDiamondSize);
                Path path5 = this.mPath;
                g0.m(path5);
                path5.lineTo(f11 - this.mDiamondSize, f12);
                Path path6 = this.mPath;
                g0.m(path6);
                path6.close();
                if (i11 == 4) {
                    int i21 = this.mPathMode[i18 - 1];
                    if (i21 == 1) {
                        drawPathRelativeTicks(canvas, f11 - 0.0f, f12 - 0.0f);
                    } else if (i21 == 0) {
                        drawPathCartesianTicks(canvas, f11 - 0.0f, f12 - 0.0f);
                    } else if (i21 == 2) {
                        drawPathScreenTicks(canvas, f11 - 0.0f, f12 - 0.0f, i15, i16, i13, i14);
                    }
                    Path path7 = this.mPath;
                    g0.m(path7);
                    canvas.drawPath(path7, this.mFillPaint);
                }
                if (i11 == 2) {
                    drawPathRelativeTicks(canvas, f11 - 0.0f, f12 - 0.0f);
                }
                if (i11 == 3) {
                    drawPathCartesianTicks(canvas, f11 - 0.0f, f12 - 0.0f);
                }
                if (i11 == 6) {
                    drawPathScreenTicks(canvas, f11 - 0.0f, f12 - 0.0f, i15, i16, i13, i14);
                }
                Path path8 = this.mPath;
                g0.m(path8);
                canvas.drawPath(path8, this.mFillPaint);
            }
        }
        float[] fArr2 = this.mPoints;
        g0.m(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.mPoints;
            g0.m(fArr3);
            float f13 = fArr3[0];
            float[] fArr4 = this.mPoints;
            g0.m(fArr4);
            canvas.drawCircle(f13, fArr4[1], 8.0f, this.mPaintKeyframes);
            float[] fArr5 = this.mPoints;
            g0.m(fArr5);
            float[] fArr6 = this.mPoints;
            g0.m(fArr6);
            float f14 = fArr5[fArr6.length - 2];
            float[] fArr7 = this.mPoints;
            g0.m(fArr7);
            float[] fArr8 = this.mPoints;
            g0.m(fArr8);
            canvas.drawCircle(f14, fArr7[fArr8.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    private final void drawTranslation(Canvas canvas, float f11, float f12, float f13, float f14) {
        canvas.drawRect(f11, f12, f13, f14, this.mPaintGraph);
        canvas.drawLine(f11, f12, f13, f14, this.mPaintGraph);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.length != (r11 * 2)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void basicDraw(@m80.k android.graphics.Canvas r9, @m80.k androidx.constraintlayout.core.motion.Motion r10, int r11, int r12, int r13, boolean r14, boolean r15) {
        /*
            r8 = this;
            float[] r0 = r8.mKeyFramePoints
            int[] r1 = r8.mPathMode
            r2 = 0
            int r0 = r10.buildKeyFrames(r0, r1, r2)
            r8.mKeyFrameCount = r0
            int r11 = r11 / 16
            float[] r0 = r8.mPoints
            if (r0 == 0) goto L19
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.length
            int r1 = r11 * 2
            if (r0 == r1) goto L26
        L19:
            int r0 = r11 * 2
            float[] r0 = new float[r0]
            r8.mPoints = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r8.mPath = r0
        L26:
            int r0 = r8.mShadowTranslate
            float r1 = (float) r0
            float r0 = (float) r0
            r9.translate(r1, r0)
            android.graphics.Paint r0 = r8.mPaint
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.mFillPaint
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.mPaintKeyframes
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.mPaintGraph
            int r1 = r8.mShadowColor
            r0.setColor(r1)
            float[] r0 = r8.mPoints
            r10.buildPath(r0, r11)
            if (r14 == 0) goto L53
            r8.drawBasicPath(r9)
        L53:
            r3 = 1
            if (r15 == 0) goto L61
            int r4 = r8.mKeyFrameCount
            r1 = r8
            r2 = r9
            r5 = r10
            r6 = r12
            r7 = r13
            r1.drawTicks(r2, r3, r4, r5, r6, r7)
            goto L66
        L61:
            r1 = r8
            r2 = r9
            r5 = r10
            r6 = r12
            r7 = r13
        L66:
            android.graphics.Paint r9 = r1.mPaint
            int r10 = r1.mRedColor
            r9.setColor(r10)
            android.graphics.Paint r9 = r1.mPaintKeyframes
            int r10 = r1.mKeyframeColor
            r9.setColor(r10)
            android.graphics.Paint r9 = r1.mFillPaint
            int r10 = r1.mKeyframeColor
            r9.setColor(r10)
            android.graphics.Paint r9 = r1.mPaintGraph
            int r10 = r1.mGraphColor
            r9.setColor(r10)
            int r9 = r1.mShadowTranslate
            float r10 = (float) r9
            float r10 = -r10
            float r9 = (float) r9
            float r9 = -r9
            r2.translate(r10, r9)
            if (r14 == 0) goto L90
            r8.drawBasicPath(r2)
        L90:
            if (r15 == 0) goto L97
            int r4 = r1.mKeyFrameCount
            r1.drawTicks(r2, r3, r4, r5, r6, r7)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionRenderDebug.basicDraw(android.graphics.Canvas, androidx.constraintlayout.core.motion.Motion, int, int, int, boolean, boolean):void");
    }

    public final void draw(@k Canvas canvas, @l HashMap<String, Motion> hashMap, int i11, int i12, int i13, int i14) {
        if (hashMap == null || hashMap.size() == 0) {
            return;
        }
        canvas.save();
        Iterator<Motion> it = hashMap.values().iterator();
        while (it.hasNext()) {
            draw(canvas, it.next(), i11, i12, i13, i14);
        }
        canvas.restore();
    }

    public final void drawAll(@k Canvas canvas, int i11, int i12, @k Motion motion, int i13, int i14) {
        if (i11 == 4) {
            drawPathAsConfigured(canvas);
        }
        if (i11 == 2) {
            drawPathRelative(canvas);
        }
        if (i11 == 3) {
            drawPathCartesian(canvas);
        }
        drawBasicPath(canvas);
        drawTicks(canvas, i11, i12, motion, i13, i14);
    }

    @k
    public final Rect getMBounds() {
        return this.mBounds;
    }

    @k
    public final DashPathEffect getMDashPathEffect() {
        return this.mDashPathEffect;
    }

    public final int getMDiamondSize() {
        return this.mDiamondSize;
    }

    @k
    public final Paint getMFillPaint() {
        return this.mFillPaint;
    }

    public final int getMGraphColor() {
        return this.mGraphColor;
    }

    public final int getMKeyFrameCount() {
        return this.mKeyFrameCount;
    }

    @k
    public final float[] getMKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public final int getMKeyframeColor() {
        return this.mKeyframeColor;
    }

    @k
    public final Paint getMPaint() {
        return this.mPaint;
    }

    @k
    public final Paint getMPaintGraph() {
        return this.mPaintGraph;
    }

    @k
    public final Paint getMPaintKeyframes() {
        return this.mPaintKeyframes;
    }

    @l
    public final Path getMPath() {
        return this.mPath;
    }

    @k
    public final int[] getMPathMode() {
        return this.mPathMode;
    }

    @l
    public final float[] getMPoints() {
        return this.mPoints;
    }

    public final boolean getMPresentationMode() {
        return this.mPresentationMode;
    }

    public final int getMRedColor() {
        return this.mRedColor;
    }

    public final int getMShadowColor() {
        return this.mShadowColor;
    }

    public final int getMShadowTranslate() {
        return this.mShadowTranslate;
    }

    @k
    public final Paint getMTextPaint() {
        return this.mTextPaint;
    }

    public final void getTextBounds(@k String str, @k Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.mBounds);
    }

    public final void setMBounds(@k Rect rect) {
        this.mBounds = rect;
    }

    public final void setMDashPathEffect(@k DashPathEffect dashPathEffect) {
        this.mDashPathEffect = dashPathEffect;
    }

    public final void setMFillPaint(@k Paint paint) {
        this.mFillPaint = paint;
    }

    public final void setMKeyFrameCount(int i11) {
        this.mKeyFrameCount = i11;
    }

    public final void setMKeyFramePoints(@k float[] fArr) {
        this.mKeyFramePoints = fArr;
    }

    public final void setMPaint(@k Paint paint) {
        this.mPaint = paint;
    }

    public final void setMPaintGraph(@k Paint paint) {
        this.mPaintGraph = paint;
    }

    public final void setMPaintKeyframes(@k Paint paint) {
        this.mPaintKeyframes = paint;
    }

    public final void setMPath(@l Path path) {
        this.mPath = path;
    }

    public final void setMPathMode(@k int[] iArr) {
        this.mPathMode = iArr;
    }

    public final void setMPoints(@l float[] fArr) {
        this.mPoints = fArr;
    }

    public final void setMPresentationMode(boolean z11) {
        this.mPresentationMode = z11;
    }

    public final void setMShadowTranslate(int i11) {
        this.mShadowTranslate = i11;
    }

    public final void setMTextPaint(@k Paint paint) {
        this.mTextPaint = paint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r13.length != (r12 * 2)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(@m80.k android.graphics.Canvas r10, @m80.k androidx.constraintlayout.core.motion.Motion r11, int r12, int r13, int r14, int r15) {
        /*
            r9 = this;
            int r0 = r11.getDrawPath()
            r1 = 1
            if (r13 <= 0) goto Lb
            if (r0 != 0) goto Lb
            r4 = r1
            goto Lc
        Lb:
            r4 = r0
        Lc:
            if (r4 != 0) goto L10
            goto L9a
        L10:
            float[] r13 = r9.mKeyFramePoints
            int[] r0 = r9.mPathMode
            r2 = 0
            int r13 = r11.buildKeyFrames(r13, r0, r2)
            r9.mKeyFrameCount = r13
            if (r4 < r1) goto L9a
            int r12 = r12 / 16
            float[] r13 = r9.mPoints
            if (r13 == 0) goto L2b
            kotlin.jvm.internal.g0.m(r13)
            int r13 = r13.length
            int r0 = r12 * 2
            if (r13 == r0) goto L38
        L2b:
            int r13 = r12 * 2
            float[] r13 = new float[r13]
            r9.mPoints = r13
            android.graphics.Path r13 = new android.graphics.Path
            r13.<init>()
            r9.mPath = r13
        L38:
            int r13 = r9.mShadowTranslate
            float r0 = (float) r13
            float r13 = (float) r13
            r10.translate(r0, r13)
            android.graphics.Paint r13 = r9.mPaint
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            android.graphics.Paint r13 = r9.mFillPaint
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            android.graphics.Paint r13 = r9.mPaintKeyframes
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            android.graphics.Paint r13 = r9.mPaintGraph
            int r0 = r9.mShadowColor
            r13.setColor(r0)
            float[] r13 = r9.mPoints
            r11.buildPath(r13, r12)
            int r5 = r9.mKeyFrameCount
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r14
            r8 = r15
            r2.drawAll(r3, r4, r5, r6, r7, r8)
            android.graphics.Paint r10 = r2.mPaint
            int r11 = r2.mRedColor
            r10.setColor(r11)
            android.graphics.Paint r10 = r2.mPaintKeyframes
            int r11 = r2.mKeyframeColor
            r10.setColor(r11)
            android.graphics.Paint r10 = r2.mFillPaint
            int r11 = r2.mKeyframeColor
            r10.setColor(r11)
            android.graphics.Paint r10 = r2.mPaintGraph
            int r11 = r2.mGraphColor
            r10.setColor(r11)
            int r10 = r2.mShadowTranslate
            float r11 = (float) r10
            float r11 = -r11
            float r10 = (float) r10
            float r10 = -r10
            r3.translate(r11, r10)
            int r5 = r2.mKeyFrameCount
            r2.drawAll(r3, r4, r5, r6, r7, r8)
            r10 = 5
            if (r4 != r10) goto L9a
            r9.drawRectangle(r3, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionRenderDebug.draw(android.graphics.Canvas, androidx.constraintlayout.core.motion.Motion, int, int, int, int):void");
    }
}
