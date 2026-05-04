package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nComposeDragShadowBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,59:1\n57#2:60\n61#2:63\n60#3:61\n70#3:64\n22#4:62\n22#4:65\n536#5,17:66\n*S KotlinDebug\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n*L\n42#1:60\n43#1:63\n42#1:61\n43#1:64\n42#1:62\n43#1:65\n50#1:66,17\n*E\n"})
/* loaded from: classes.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 0;
    private final long decorationSize;

    @k
    private final Density density;

    @k
    private final l<DrawScope, g2> drawDragDecoration;

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j11, l lVar, v vVar) {
        this(density, j11, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(@k Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        Density density = this.density;
        long j11 = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        l<DrawScope, g2> lVar = this.drawDragDecoration;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        androidx.compose.ui.graphics.Canvas component3 = drawParams.component3();
        long m2977component4NHjbRc = drawParams.m2977component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m2980setSizeuvyYCjk(j11);
        Canvas.save();
        lVar.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m2980setSizeuvyYCjk(m2977component4NHjbRc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(@k Point point, @k Point point2) {
        Density density = this.density;
        point.set(density.mo371roundToPx0680j_4(density.mo373toDpu2uoSUM(Float.intBitsToFloat((int) (this.decorationSize >> 32)))), density.mo371roundToPx0680j_4(density.mo373toDpu2uoSUM(Float.intBitsToFloat((int) (this.decorationSize & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeDragShadowBuilder(Density density, long j11, l<? super DrawScope, g2> lVar) {
        this.density = density;
        this.decorationSize = j11;
        this.drawDragDecoration = lVar;
    }
}
