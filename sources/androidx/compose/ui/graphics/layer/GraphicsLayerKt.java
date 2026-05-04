package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGraphicsLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,411:1\n233#2:412\n30#3:413\n30#3:427\n53#4,3:414\n53#4,3:424\n53#4,3:428\n53#4,3:432\n60#4:436\n56#5,6:417\n33#6:423\n33#6:431\n48#7:435\n22#8:437\n*S KotlinDebug\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n*L\n51#1:412\n389#1:413\n403#1:427\n389#1:414,3\n390#1:424,3\n403#1:428,3\n404#1:432,3\n405#1:436\n390#1:417,6\n390#1:423\n404#1:431\n405#1:435\n405#1:437\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void drawLayer(@m80.k DrawScope drawScope, @m80.k GraphicsLayer graphicsLayer) {
        graphicsLayer.draw$ui_graphics_release(drawScope.getDrawContext().getCanvas(), drawScope.getDrawContext().getGraphicsLayer());
    }

    public static final void setOutline(@m80.k GraphicsLayer graphicsLayer, @m80.k Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            float left = rectangle.getRect().getLeft();
            float top = rectangle.getRect().getTop();
            long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
            Rect rect = rectangle.getRect();
            float right = rect.getRight() - rect.getLeft();
            Rect rect2 = rectangle.getRect();
            float bottom = rect2.getBottom() - rect2.getTop();
            graphicsLayer.m3159setRectOutlinetz77jQw(m2260constructorimpl, Size.m2328constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32)));
            return;
        }
        if (outline instanceof Outline.Generic) {
            graphicsLayer.setPathOutline(((Outline.Generic) outline).getPath());
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            if (rounded.getRoundRectPath$ui_graphics_release() != null) {
                graphicsLayer.setPathOutline(rounded.getRoundRectPath$ui_graphics_release());
                return;
            }
            RoundRect roundRect = rounded.getRoundRect();
            float left2 = roundRect.getLeft();
            float top2 = roundRect.getTop();
            long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(left2) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
            float width = roundRect.getWidth();
            float height = roundRect.getHeight();
            graphicsLayer.m3160setRoundRectOutlineTNW_H78(m2260constructorimpl2, Size.m2328constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32)));
        }
    }
}
