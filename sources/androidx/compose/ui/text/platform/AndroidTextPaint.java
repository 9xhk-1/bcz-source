package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,203:1\n1#2:204\n65#3:205\n69#3:208\n60#4:206\n70#4:209\n22#5:207\n22#5:210\n635#6:211\n148#7:212\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n101#1:205\n102#1:208\n101#1:206\n102#1:209\n101#1:207\n102#1:210\n110#1:211\n137#1:212\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;

    @l
    private Paint backingComposePaint;

    @l
    private Brush brush;

    @l
    private Size brushSize;

    @l
    private DrawStyle drawStyle;

    @l
    private Color lastColor;

    @l
    private State<? extends Shader> shaderState;

    @k
    private Shadow shadow;

    @k
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i11, float f11) {
        super(i11);
        ((TextPaint) this).density = f11;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.backingBlendMode = DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.Companion.getNone();
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint asComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = asComposePaint;
        return asComposePaint;
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m4821setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j11, float f11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f11 = Float.NaN;
        }
        androidTextPaint.m4825setBrush12SF9DM(brush, j11, f11);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4822getBlendMode0nO6VwU() {
        return this.backingBlendMode;
    }

    @l
    public final Brush getBrush$ui_text_release() {
        return this.brush;
    }

    @l
    /* renamed from: getBrushSize-VsRJwc0$ui_text_release, reason: not valid java name */
    public final Size m4823getBrushSizeVsRJwc0$ui_text_release() {
        return this.brushSize;
    }

    @l
    public final State<Shader> getShaderState$ui_text_release() {
        return this.shaderState;
    }

    @k
    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m4824setBlendModes9anfk8(int i11) {
        if (BlendMode.m2420equalsimpl0(i11, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo2387setBlendModes9anfk8(i11);
        this.backingBlendMode = i11;
    }

    public final void setBrush$ui_text_release(@l Brush brush) {
        this.brush = brush;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if ((r0 == null ? false : androidx.compose.ui.geometry.Size.m2333equalsimpl0(r0.m2342unboximpl(), r6)) == false) goto L18;
     */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4825setBrush12SF9DM(@m80.l final androidx.compose.ui.graphics.Brush r5, final long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.clearShader()
            return
        L6:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.SolidColor
            if (r0 == 0) goto L18
            androidx.compose.ui.graphics.SolidColor r5 = (androidx.compose.ui.graphics.SolidColor) r5
            long r5 = r5.m2844getValue0d7_KjU()
            long r5 = androidx.compose.ui.text.style.TextDrawStyleKt.m4997modulateDxMtmZc(r5, r8)
            r4.m4827setColor8_81llA(r5)
            return
        L18:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.ShaderBrush
            if (r0 == 0) goto L6d
            androidx.compose.ui.graphics.Brush r0 = r4.brush
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            androidx.compose.ui.geometry.Size r0 = r4.brushSize
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.m2342unboximpl()
            boolean r0 = androidx.compose.ui.geometry.Size.m2333equalsimpl0(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.brush = r5
            androidx.compose.ui.geometry.Size r0 = androidx.compose.ui.geometry.Size.m2325boximpl(r6)
            r4.brushSize = r0
            androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1 r0 = new androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
            r0.<init>()
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r0)
            r4.shaderState = r5
        L54:
            androidx.compose.ui.graphics.Paint r5 = r4.getComposePaint()
            androidx.compose.runtime.State<? extends android.graphics.Shader> r6 = r4.shaderState
            r7 = 0
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L65
        L64:
            r6 = r7
        L65:
            r5.setShader(r6)
            r4.lastColor = r7
            androidx.compose.ui.text.platform.AndroidTextPaint_androidKt.setAlpha(r4, r8)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidTextPaint.m4825setBrush12SF9DM(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    /* renamed from: setBrushSize-iaC8Vc4$ui_text_release, reason: not valid java name */
    public final void m4826setBrushSizeiaC8Vc4$ui_text_release(@l Size size) {
        this.brushSize = size;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m4827setColor8_81llA(long j11) {
        Color color = this.lastColor;
        if (color == null ? false : Color.m2510equalsimpl0(color.m2519unboximpl(), j11)) {
            return;
        }
        if (j11 != 16) {
            this.lastColor = Color.m2499boximpl(j11);
            setColor(ColorKt.m2563toArgb8_81llA(j11));
            clearShader();
        }
    }

    public final void setDrawStyle(@l DrawStyle drawStyle) {
        if (drawStyle == null || g0.g(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (g0.g(drawStyle, Fill.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            getComposePaint().mo2392setStylek9PVt8s(PaintingStyle.Companion.m2777getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            getComposePaint().setStrokeWidth(stroke.getWidth());
            getComposePaint().setStrokeMiterLimit(stroke.getMiter());
            getComposePaint().mo2391setStrokeJoinWw9F2mQ(stroke.m3130getJoinLxFBmk8());
            getComposePaint().mo2390setStrokeCapBeK7IIE(stroke.m3129getCapKaPHkGw());
            getComposePaint().setPathEffect(stroke.getPathEffect());
        }
    }

    public final void setShaderState$ui_text_release(@l State<? extends Shader> state) {
        this.shaderState = state;
    }

    public final void setShadow(@l Shadow shadow) {
        if (shadow == null || g0.g(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (g0.g(shadow, Shadow.Companion.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.m2835getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (this.shadow.m2835getOffsetF1C5BW0() & 4294967295L)), ColorKt.m2563toArgb8_81llA(this.shadow.m2834getColor0d7_KjU()));
        }
    }

    public final void setShadow$ui_text_release(@k Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(@l TextDecoration textDecoration) {
        if (textDecoration == null || g0.g(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.Companion;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }

    @VisibleForTesting
    public static /* synthetic */ void getBrush$ui_text_release$annotations() {
    }

    @VisibleForTesting
    /* renamed from: getBrushSize-VsRJwc0$ui_text_release$annotations, reason: not valid java name */
    public static /* synthetic */ void m4820getBrushSizeVsRJwc0$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }
}
