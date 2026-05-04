package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,291:1\n226#1,12:292\n240#1,2:311\n226#1,12:313\n240#1,2:332\n48#2:304\n48#2:325\n48#2:356\n53#2:359\n48#2:362\n48#2:365\n48#2:368\n53#2:371\n53#2:374\n53#2:377\n60#3:305\n53#3,3:308\n60#3:326\n53#3,3:329\n53#3,3:335\n53#3,3:345\n53#3,3:349\n53#3,3:353\n60#3:357\n70#3:360\n60#3:363\n60#3:366\n60#3:369\n70#3:372\n70#3:375\n70#3:378\n22#4:306\n22#4:327\n22#4:358\n22#4:361\n22#4:364\n22#4:367\n22#4:370\n22#4:373\n22#4:376\n22#4:379\n33#5:307\n33#5:328\n30#6:334\n30#6:348\n56#7,6:338\n33#8:344\n33#8:352\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n143#1:292,12\n143#1:311,2\n183#1:313,12\n183#1:332,2\n149#1:304\n189#1:325\n266#1:356\n267#1:359\n282#1:362\n283#1:365\n284#1:368\n286#1:371\n287#1:374\n288#1:377\n149#1:305\n154#1:308,3\n189#1:326\n194#1:329,3\n205#1:335,3\n208#1:345,3\n211#1:349,3\n214#1:353,3\n266#1:357\n267#1:360\n282#1:363\n283#1:366\n284#1:369\n286#1:372\n287#1:375\n288#1:378\n149#1:306\n189#1:327\n266#1:358\n267#1:361\n282#1:364\n283#1:367\n284#1:370\n286#1:373\n287#1:376\n288#1:379\n154#1:307\n194#1:328\n205#1:334\n211#1:348\n208#1:338,6\n208#1:344\n214#1:352\n*E\n"})
/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(@m80.k Path path, @m80.k Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Path.addRect$default(path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
        } else if (outline instanceof Outline.Rounded) {
            Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            Path.m2779addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(@m80.k Canvas canvas, @m80.k Outline outline, @m80.k Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                canvas.drawPath(roundRectPath$ui_graphics_release, paint);
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), Float.intBitsToFloat((int) (rounded.getRoundRect().m2316getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m2316getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)), paint);
            }
        }
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m2765drawOutlinehn5TExg(@m80.k DrawScope drawScope, @m80.k Outline outline, @m80.k Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f11, @m80.k DrawStyle drawStyle, @m80.l ColorFilter colorFilter, int i11) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo2972drawRectAsUm42w(brush, topLeft(rect), size(rect), f11, drawStyle, colorFilter, i11);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.mo2968drawPathGBMwjPU(((Outline.Generic) outline).getPath(), brush, f11, drawStyle, colorFilter, i11);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
        if (roundRectPath$ui_graphics_release != null) {
            drawScope.mo2968drawPathGBMwjPU(roundRectPath$ui_graphics_release, brush, f11, drawStyle, colorFilter, i11);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo2974drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), f11, drawStyle, colorFilter, i11);
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m2766drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i12 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i12 & 32) != 0) {
            i11 = DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU();
        }
        m2765drawOutlinehn5TExg(drawScope, outline, brush, f12, drawStyle2, colorFilter2, i11);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m2767drawOutlinewDX37Ww(@m80.k DrawScope drawScope, @m80.k Outline outline, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @m80.k DrawStyle drawStyle, @m80.l ColorFilter colorFilter, int i11) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo2973drawRectnJ9OG0(j11, topLeft(rect), size(rect), f11, drawStyle, colorFilter, i11);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.mo2969drawPathLG529CI(((Outline.Generic) outline).getPath(), j11, f11, drawStyle, colorFilter, i11);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
        if (roundRectPath$ui_graphics_release != null) {
            drawScope.mo2969drawPathLG529CI(roundRectPath$ui_graphics_release, j11, f11, drawStyle, colorFilter, i11);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo2975drawRoundRectuAw5IA(j11, topLeft(roundRect), size(roundRect), CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), drawStyle, f11, colorFilter, i11);
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m2768drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j11, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i12 & 16) != 0) {
            colorFilter = null;
        }
        m2767drawOutlinewDX37Ww(drawScope, outline, j11, f12, drawStyle2, colorFilter, (i12 & 32) != 0 ? DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, x00.p<? super DrawScope, ? super Rect, yz.g2> pVar, x00.p<? super DrawScope, ? super RoundRect, yz.g2> pVar2, x00.p<? super DrawScope, ? super Path, yz.g2> pVar3) {
        if (outline instanceof Outline.Rectangle) {
            pVar.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            pVar3.invoke(drawScope, ((Outline.Generic) outline).getPath());
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                pVar3.invoke(drawScope, roundRectPath$ui_graphics_release);
            } else {
                pVar2.invoke(drawScope, rounded.getRoundRect());
            }
        }
    }

    private static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0) && ((Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0);
    }

    private static final long size(RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return Size.m2328constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
    }

    private static final long topLeft(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
    }

    private static final long size(Rect rect) {
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        return Size.m2328constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    private static final long topLeft(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
    }
}
