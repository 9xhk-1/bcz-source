package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBulletSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/BulletSpan_androidKt\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,206:1\n61#2:207\n61#2:222\n56#2:223\n61#2:224\n36#3,5:208\n36#3,5:214\n1#4:213\n48#5:219\n60#6:220\n22#7:221\n*S KotlinDebug\n*F\n+ 1 BulletSpan.android.kt\nandroidx/compose/ui/text/platform/style/BulletSpan_androidKt\n*L\n135#1:207\n163#1:222\n164#1:223\n165#1:224\n136#1:208,5\n144#1:214,5\n148#1:219\n148#1:220\n148#1:221\n*E\n"})
/* loaded from: classes2.dex */
public final class BulletSpan_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw(Outline outline, Canvas canvas, Paint paint, float f11, float f12, int i11) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Rect bounds = outline.getBounds();
            canvas.translate(f11, f12 - ((bounds.getBottom() - bounds.getTop()) / 2.0f));
            Path path = ((Outline.Generic) outline).getPath();
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Rectangle) {
                Outline.Rectangle rectangle = (Outline.Rectangle) outline;
                Rect rect = rectangle.getRect();
                float bottom = f12 - ((rect.getBottom() - rect.getTop()) / 2.0f);
                Rect rect2 = rectangle.getRect();
                float right = f11 + (i11 * (rect2.getRight() - rect2.getLeft()));
                Rect rect3 = rectangle.getRect();
                canvas.drawRect(f11, bottom, right, f12 + ((rect3.getBottom() - rect3.getTop()) / 2.0f), paint);
                return;
            }
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            float intBitsToFloat = Float.intBitsToFloat((int) (rounded.getRoundRect().m2318getTopLeftCornerRadiuskKHJgLs() >> 32));
            canvas.drawRoundRect(f11, f12 - (rounded.getRoundRect().getHeight() / 2.0f), (i11 * rounded.getRoundRect().getWidth()) + f11, (rounded.getRoundRect().getHeight() / 2.0f) + f12, intBitsToFloat, intBitsToFloat, paint);
            return;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, rounded.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f11, f12 - (rounded.getRoundRect().getHeight() / 2.0f));
        if (!(Path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) Path).getInternalPath(), paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final void m4844setBrushAndDrawyzxVdVo(Paint paint, Brush brush, float f11, long j11, a<g2> aVar) {
        Integer num = null;
        if (brush == null) {
            if (!Float.isNaN(f11)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f11 * 255.0f));
            }
            aVar.invoke();
            if (num != null) {
                paint.setAlpha(num.intValue());
                return;
            }
            return;
        }
        if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f11)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f11 * 255.0f));
            }
            paint.setColor(ColorKt.m2563toArgb8_81llA(((SolidColor) brush).m2844getValue0d7_KjU()));
            aVar.invoke();
            paint.setColor(color);
            if (num != null) {
                paint.setAlpha(num.intValue());
                return;
            }
            return;
        }
        if (brush instanceof ShaderBrush) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f11)) {
                num = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f11 * 255.0f));
            }
            paint.setShader(((ShaderBrush) brush).mo2478createShaderuvyYCjk(j11));
            aVar.invoke();
            paint.setShader(shader);
            if (num != null) {
                paint.setAlpha(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDrawStyle(Paint paint, DrawStyle drawStyle) {
        if (g0.g(drawStyle, Fill.INSTANCE)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawStyle;
            paint.setStrokeWidth(stroke.getWidth());
            paint.setStrokeMiter(stroke.getMiter());
            paint.setStrokeCap(DrawStyleSpan_androidKt.m4845toAndroidCapBeK7IIE(stroke.m3129getCapKaPHkGw()));
            paint.setStrokeJoin(DrawStyleSpan_androidKt.m4846toAndroidJoinWw9F2mQ(stroke.m3130getJoinLxFBmk8()));
            PathEffect pathEffect = stroke.getPathEffect();
            paint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
        }
    }
}
