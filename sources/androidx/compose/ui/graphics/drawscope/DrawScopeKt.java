package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1008:1\n68#1,7:1009\n249#1,14:1016\n249#1,14:1030\n249#1,14:1044\n249#1,14:1058\n249#1,14:1072\n249#1,14:1092\n305#1,26:1106\n57#2:1086\n61#2:1089\n60#3:1087\n70#3:1090\n22#4:1088\n22#4:1091\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n108#1:1009,7\n138#1:1016,14\n153#1:1030,14\n172#1:1044,14\n185#1:1058,14\n209#1:1072,14\n225#1:1092,14\n275#1:1106,26\n205#1:1086\n206#1:1089\n205#1:1087\n206#1:1090\n205#1:1088\n206#1:1091\n*E\n"})
/* loaded from: classes.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m3100clipPathKD09W0M(@k DrawScope drawScope, @k Path path, int i11, @k l<? super DrawScope, g2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2983clipPathmtrdDE(path, i11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m3101clipPathKD09W0M$default(DrawScope drawScope, Path path, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = ClipOp.Companion.m2498getIntersectrtfAjoo();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2983clipPathmtrdDE(path, i11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m3102clipRectrOu3jXo(@k DrawScope drawScope, float f11, float f12, float f13, float f14, int i11, @k l<? super DrawScope, g2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2984clipRectN_I0leg(f11, f12, f13, f14, i11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m3103clipRectrOu3jXo$default(DrawScope drawScope, float f11, float f12, float f13, float f14, int i11, l lVar, int i12, Object obj) {
        float f15 = (i12 & 1) != 0 ? 0.0f : f11;
        float f16 = (i12 & 2) != 0 ? 0.0f : f12;
        if ((i12 & 4) != 0) {
            f13 = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32));
        }
        float f17 = f13;
        if ((i12 & 8) != 0) {
            f14 = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L));
        }
        float f18 = f14;
        if ((i12 & 16) != 0) {
            i11 = ClipOp.Companion.m2498getIntersectrtfAjoo();
        }
        int i13 = i11;
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2984clipRectN_I0leg(f15, f16, f17, f18, i13);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use a new overload accepting nullable GraphicsLayer")
    /* renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m3104drawGRGpd60(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j11, l<? super DrawScope, g2> lVar) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo2981getSizeNHjbRc = drawScope.getDrawContext().mo2981getSizeNHjbRc();
        GraphicsLayer graphicsLayer = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo2982setSizeuvyYCjk(j11);
        drawContext.setGraphicsLayer(null);
        canvas.save();
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            d0.c(1);
        }
    }

    /* renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m3105drawymL40Pk(@k DrawScope drawScope, @k Density density, @k LayoutDirection layoutDirection, @k Canvas canvas, long j11, @m80.l GraphicsLayer graphicsLayer, @k l<? super DrawScope, g2> lVar) {
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo2981getSizeNHjbRc = drawScope.getDrawContext().mo2981getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo2982setSizeuvyYCjk(j11);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            d0.c(1);
        }
    }

    /* renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m3106drawymL40Pk$default(DrawScope drawScope, Density density, LayoutDirection layoutDirection, Canvas canvas, long j11, GraphicsLayer graphicsLayer, l lVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            graphicsLayer = null;
        }
        Density density2 = drawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        long mo2981getSizeNHjbRc = drawScope.getDrawContext().mo2981getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = drawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo2982setSizeuvyYCjk(j11);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            canvas.restore();
            DrawContext drawContext2 = drawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            d0.c(1);
        }
    }

    public static final void drawIntoCanvas(@k DrawScope drawScope, @k l<? super Canvas, g2> lVar) {
        lVar.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(@k DrawScope drawScope, float f11, float f12, float f13, float f14, @k l<? super DrawScope, g2> lVar) {
        drawScope.getDrawContext().getTransform().inset(f11, f12, f13, f14);
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawScope.getDrawContext().getTransform().inset(-f11, -f12, -f13, -f14);
            d0.c(1);
        }
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f11, float f12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().inset(f11, f12, f11, f12);
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            float f13 = -f11;
            float f14 = -f12;
            drawScope.getDrawContext().getTransform().inset(f13, f14, f13, f14);
            d0.c(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m3107rotateRg1IO4c(@k DrawScope drawScope, float f11, long j11, @k l<? super DrawScope, g2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2987rotateUv8p0NA(f11, j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3108rotateRg1IO4c$default(DrawScope drawScope, float f11, long j11, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = drawScope.mo3059getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2987rotateUv8p0NA(f11, j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m3109rotateRadRg1IO4c(@k DrawScope drawScope, float f11, long j11, @k l<? super DrawScope, g2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2987rotateUv8p0NA(DegreesKt.degrees(f11), j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3110rotateRadRg1IO4c$default(DrawScope drawScope, float f11, long j11, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = drawScope.mo3059getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2987rotateUv8p0NA(DegreesKt.degrees(f11), j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m3111scaleFgt4K4Q(@k DrawScope drawScope, float f11, float f12, long j11, @k l<? super DrawScope, g2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2988scale0AR0LA0(f11, f12, j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m3112scaleFgt4K4Q$default(DrawScope drawScope, float f11, float f12, long j11, l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = drawScope.mo3059getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2988scale0AR0LA0(f11, f12, j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m3113scaleRg1IO4c(@k DrawScope drawScope, float f11, long j11, @k l<? super DrawScope, g2> lVar) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2988scale0AR0LA0(f11, f11, j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m3114scaleRg1IO4c$default(DrawScope drawScope, float f11, long j11, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = drawScope.mo3059getCenterF1C5BW0();
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2988scale0AR0LA0(f11, f11, j11);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    public static final void translate(@k DrawScope drawScope, float f11, float f12, @k l<? super DrawScope, g2> lVar) {
        drawScope.getDrawContext().getTransform().translate(f11, f12);
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawScope.getDrawContext().getTransform().translate(-f11, -f12);
            d0.c(1);
        }
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f11, float f12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        drawScope.getDrawContext().getTransform().translate(f11, f12);
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawScope.getDrawContext().getTransform().translate(-f11, -f12);
            d0.c(1);
        }
    }

    public static final void withTransform(@k DrawScope drawScope, @k l<? super DrawTransform, g2> lVar, @k l<? super DrawScope, g2> lVar2) {
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            lVar.invoke(drawContext.getTransform());
            lVar2.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    public static final void inset(@k DrawScope drawScope, float f11, @k l<? super DrawScope, g2> lVar) {
        drawScope.getDrawContext().getTransform().inset(f11, f11, f11, f11);
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            float f12 = -f11;
            drawScope.getDrawContext().getTransform().inset(f12, f12, f12, f12);
            d0.c(1);
        }
    }

    public static final void inset(@k DrawScope drawScope, float f11, float f12, @k l<? super DrawScope, g2> lVar) {
        drawScope.getDrawContext().getTransform().inset(f11, f12, f11, f12);
        try {
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            float f13 = -f11;
            float f14 = -f12;
            drawScope.getDrawContext().getTransform().inset(f13, f14, f13, f14);
            d0.c(1);
        }
    }
}
