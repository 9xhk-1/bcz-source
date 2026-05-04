package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,198:1\n57#2:199\n61#2:202\n57#2:208\n61#2:211\n57#2:213\n61#2:216\n60#3:200\n70#3:203\n60#3:209\n70#3:212\n60#3:214\n70#3:217\n53#3,3:219\n22#4:201\n22#4:204\n22#4:210\n22#4:215\n68#5,3:205\n233#5:222\n72#5,3:230\n33#6:218\n95#7,7:223\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n181#1:199\n182#1:202\n184#1:208\n184#1:211\n186#1:213\n186#1:216\n181#1:200\n182#1:203\n184#1:209\n184#1:212\n186#1:214\n186#1:217\n186#1:219,3\n181#1:201\n182#1:204\n184#1:210\n186#1:215\n178#1:205,3\n188#1:222\n178#1:230,3\n186#1:218\n189#1:223,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class Painter {

    @l
    private ColorFilter colorFilter;

    @l
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;

    @k
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @k
    private final x00.l<DrawScope, g2> drawLambda = new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Painter.this.onDraw(drawScope);
        }
    };

    private final void configureAlpha(float f11) {
        if (this.alpha == f11) {
            return;
        }
        if (!applyAlpha(f11)) {
            if (f11 == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setAlpha(f11);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(f11);
                this.useLayer = true;
            }
        }
        this.alpha = f11;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (g0.g(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setColorFilter(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m3185drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j11, float f11, ColorFilter colorFilter, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i11 & 2) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i11 & 4) != 0) {
            colorFilter = null;
        }
        painter.m3186drawx_KDEd0(drawScope, j11, f12, colorFilter);
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    public boolean applyAlpha(float f11) {
        return false;
    }

    public boolean applyColorFilter(@l ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(@k LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m3186drawx_KDEd0(@k DrawScope drawScope, long j11, float f11, @l ColorFilter colorFilter) {
        configureAlpha(f11);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        int i11 = (int) (j11 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32)) - Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat(i12);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f11 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i11) > 0.0f && Float.intBitsToFloat(i12) > 0.0f) {
                    if (this.useLayer) {
                        long m2284getZeroF1C5BW0 = Offset.Companion.m2284getZeroF1C5BW0();
                        float intBitsToFloat3 = Float.intBitsToFloat(i11);
                        float intBitsToFloat4 = Float.intBitsToFloat(i12);
                        Rect m2308Recttz77jQw = RectKt.m2308Recttz77jQw(m2284getZeroF1C5BW0, Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)));
                        Canvas canvas = drawScope.getDrawContext().getCanvas();
                        try {
                            canvas.saveLayer(m2308Recttz77jQw, obtainPaint());
                            onDraw(drawScope);
                            canvas.restore();
                        } catch (Throwable th2) {
                            canvas.restore();
                            throw th2;
                        }
                    } else {
                        onDraw(drawScope);
                    }
                }
            } catch (Throwable th3) {
                drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th3;
            }
        }
        drawScope.getDrawContext().getTransform().inset(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo3180getIntrinsicSizeNHjbRc();

    public abstract void onDraw(@k DrawScope drawScope);
}
