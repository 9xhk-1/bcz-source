package androidx.constraintlayout.compose;

import a00.h0;
import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@u0({"SMAP\nMotionMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,581:1\n33#2,6:582\n33#2,6:588\n33#2,6:594\n33#2,6:600\n33#2,4:606\n38#2:617\n128#3,7:610\n1#4:618\n169#5:619\n*S KotlinDebug\n*F\n+ 1 MotionMeasurer.kt\nandroidx/constraintlayout/compose/MotionMeasurer\n*L\n63#1:582,6\n69#1:588,6\n224#1:594,6\n289#1:600,6\n330#1:606,4\n330#1:617\n337#1:610,7\n48#1:619\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionMeasurer extends Measurer2 {
    public static final int $stable = 8;
    private final boolean DEBUG;
    private float lastProgressInInterpolation;

    @l
    private Constraints oldConstraints;

    @k
    private final androidx.constraintlayout.core.state.Transition transition;

    public MotionMeasurer(@k final Density density) {
        super(density);
        this.transition = new androidx.constraintlayout.core.state.Transition(new CorePixelDp() { // from class: androidx.constraintlayout.compose.b
            @Override // androidx.constraintlayout.core.state.CorePixelDp
            public final float toPixels(float f11) {
                float transition$lambda$1;
                transition$lambda$1 = MotionMeasurer.transition$lambda$1(Density.this, f11);
                return transition$lambda$1;
            }
        });
    }

    public static /* synthetic */ void drawDebug$default(MotionMeasurer motionMeasurer, DrawScope drawScope, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        motionMeasurer.drawDebug(drawScope, z11, z12, z13);
    }

    /* renamed from: drawFrame-g2O1Hgs, reason: not valid java name */
    private final void m5551drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j11) {
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.m3054drawRectnJ9OG0$default(drawScope, j11, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        matrix.preScale(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX, Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY, widgetFrame.centerX(), widgetFrame.centerY());
        int i11 = widgetFrame.left;
        int i12 = widgetFrame.top;
        int i13 = widgetFrame.right;
        int i14 = widgetFrame.bottom;
        float[] fArr = {i11, i12, i13, i12, i13, i14, i11, i14};
        matrix.mapPoints(fArr);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, j11, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, j11, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, j11, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, j11, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, 464, null);
    }

    /* renamed from: drawFrameDebug-PE3pjmc, reason: not valid java name */
    private final void m5552drawFrameDebugPE3pjmc(DrawScope drawScope, float f11, float f12, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, PathEffect pathEffect, long j11) {
        m5551drawFrameg2O1Hgs(drawScope, widgetFrame, pathEffect, j11);
        m5551drawFrameg2O1Hgs(drawScope, widgetFrame2, pathEffect, j11);
        int numberKeyPositions = this.transition.getNumberKeyPositions(widgetFrame);
        new MotionRenderDebug(23.0f).draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, 1, (int) f11, (int) f12);
        if (numberKeyPositions == 0) {
            return;
        }
        float[] fArr = new float[numberKeyPositions];
        float[] fArr2 = new float[numberKeyPositions];
        float[] fArr3 = new float[numberKeyPositions];
        this.transition.fillKeyPositions(widgetFrame, fArr, fArr2, fArr3);
        int i11 = 1;
        int i12 = numberKeyPositions - 1;
        if (i12 < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            float f13 = fArr3[i13] / 100.0f;
            float f14 = i11 - f13;
            float width = (widgetFrame.width() * f14) + (widgetFrame2.width() * f13);
            float height = (f14 * widgetFrame.height()) + (f13 * widgetFrame2.height());
            float f15 = (fArr[i13] * f11) + (width / 2.0f);
            float f16 = (fArr2[i13] * f12) + (height / 2.0f);
            Path Path = AndroidPath_androidKt.Path();
            Path.moveTo(f15 - 20.0f, f16);
            Path.lineTo(f15, f16 + 20.0f);
            Path.lineTo(f15 + 20.0f, f16);
            Path.lineTo(f15, f16 - 20.0f);
            Path.close();
            int i14 = i13;
            DrawScope.m3050drawPathLG529CI$default(drawScope, Path, j11, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
            if (i14 == i12) {
                return;
            }
            i13 = i14 + 1;
            i11 = 1;
        }
    }

    private final void drawPaths(DrawScope drawScope, float f11, float f12, WidgetFrame widgetFrame, boolean z11, boolean z12) {
        new MotionRenderDebug(23.0f).basicDraw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, (int) f11, (int) f12, z11, z12);
    }

    private final void encodeKeyFrames(StringBuilder sb2, float[] fArr, int[] iArr, int[] iArr2, int i11) {
        if (i11 == 0) {
            return;
        }
        sb2.append("keyTypes : [");
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(i13);
            sb3.append(',');
            sb2.append(sb3.toString());
        }
        sb2.append("],\n");
        sb2.append("keyPos : [");
        int i14 = i11 * 2;
        for (int i15 = 0; i15 < i14; i15++) {
            float f11 = fArr[i15];
            StringBuilder sb4 = new StringBuilder();
            sb4.append(' ');
            sb4.append(f11);
            sb4.append(',');
            sb2.append(sb4.toString());
        }
        sb2.append("],\n ");
        sb2.append("keyFrames : [");
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = iArr2[i16];
            StringBuilder sb5 = new StringBuilder();
            sb5.append(' ');
            sb5.append(i17);
            sb5.append(',');
            sb2.append(sb5.toString());
        }
        sb2.append("],\n ");
    }

    /* renamed from: measureConstraintSet--hBUhpc, reason: not valid java name */
    private final void m5553measureConstraintSethBUhpc(int i11, ConstraintSet constraintSet, List<? extends Measurable> list, long j11) {
        String str;
        Object layoutId;
        getState().reset();
        constraintSet.applyTo(getState(), list);
        ConstraintLayoutKt.buildMapping(getState(), list);
        getState().apply(getRoot());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        for (int i12 = 0; i12 < size; i12++) {
            children.get(i12).setAnimated(true);
        }
        m5515applyRootSizeBRTryo0(j11);
        getRoot().updateHierarchy();
        if (this.DEBUG) {
            getRoot().setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children2 = getRoot().getChildren();
            int size2 = children2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ConstraintWidget constraintWidget = children2.get(i13);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (str = layoutId.toString()) == null) {
                    str = "NOTAG";
                }
                constraintWidget.setDebugName(str);
            }
        }
        getRoot().setOptimizationLevel(i11);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* renamed from: needsRemeasure-NN6Ew-U, reason: not valid java name */
    private final boolean m5554needsRemeasureNN6EwU(long j11, CompositionSource compositionSource, ShouldInvalidateCallback shouldInvalidateCallback) {
        if (this.transition.isEmpty() || getFrameCache().isEmpty()) {
            return true;
        }
        Constraints constraints = this.oldConstraints;
        if (constraints != null && shouldInvalidateCallback != null) {
            g0.m(constraints);
            if (shouldInvalidateCallback.mo5494invokeN9IONVI(constraints.m5074unboximpl(), j11)) {
                return true;
            }
        } else if ((Constraints.m5065getHasFixedHeightimpl(j11) && !getState().sameFixedHeight(Constraints.m5067getMaxHeightimpl(j11))) || (Constraints.m5066getHasFixedWidthimpl(j11) && !getState().sameFixedWidth(Constraints.m5068getMaxWidthimpl(j11)))) {
            return true;
        }
        return compositionSource == CompositionSource.Content;
    }

    /* renamed from: recalculateInterpolation-36Wf7g4, reason: not valid java name */
    private final void m5555recalculateInterpolation36Wf7g4(long j11, LayoutDirection layoutDirection, ConstraintSet constraintSet, ConstraintSet constraintSet2, TransitionImpl transitionImpl, List<? extends Measurable> list, int i11, float f11, boolean z11) {
        WidgetFrame interpolated;
        this.lastProgressInInterpolation = f11;
        int i12 = 0;
        if (z11) {
            this.transition.clear();
            resetMeasureState$constraintlayout_compose_release();
            getState().width(Constraints.m5066getHasFixedWidthimpl(j11) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m5068getMaxWidthimpl(j11)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m5070getMinWidthimpl(j11)));
            getState().height(Constraints.m5065getHasFixedHeightimpl(j11) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m5067getMaxHeightimpl(j11)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m5069getMinHeightimpl(j11)));
            getState().m5584setRootIncomingConstraintsBRTryo0(j11);
            getState().setRtl(layoutDirection == LayoutDirection.Rtl);
            m5553measureConstraintSethBUhpc(i11, constraintSet, list, j11);
            this.transition.updateFrom(getRoot(), 0);
            m5553measureConstraintSethBUhpc(i11, constraintSet2, list, j11);
            this.transition.updateFrom(getRoot(), 1);
            if (transitionImpl != null) {
                transitionImpl.applyKeyFramesTo(this.transition);
            }
        } else {
            ConstraintLayoutKt.buildMapping(getState(), list);
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), f11);
        getRoot().setWidth(this.transition.getInterpolatedWidth());
        getRoot().setHeight(this.transition.getInterpolatedHeight());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        while (true) {
            if (i12 >= size) {
                break;
            }
            ConstraintWidget constraintWidget = children.get(i12);
            Object companionWidget = constraintWidget.getCompanionWidget();
            Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
            if (measurable != null && (interpolated = this.transition.getInterpolated(constraintWidget)) != null) {
                getPlaceables().put(measurable, measurable.mo3857measureBRTryo0(Constraints.Companion.m5078fixedJhjzzOo(interpolated.width(), interpolated.height())));
                getFrameCache().put(MeasurerKt.getAnyOrNullId(measurable), interpolated);
            }
            i12++;
        }
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transition$lambda$1(Density density, float f11) {
        return density.mo377toPx0680j_4(Dp.m5115constructorimpl(f11));
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    @Override // androidx.constraintlayout.compose.Measurer2
    public void computeLayoutResult() {
        MotionMeasurer motionMeasurer = this;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        motionMeasurer.encodeRoot(sb2);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        ArrayList<ConstraintWidget> children = motionMeasurer.getRoot().getChildren();
        int size = children.size();
        int i11 = 0;
        while (i11 < size) {
            ConstraintWidget constraintWidget = children.get(i11);
            WidgetFrame start = motionMeasurer.transition.getStart(constraintWidget.stringId);
            WidgetFrame end = motionMeasurer.transition.getEnd(constraintWidget.stringId);
            WidgetFrame interpolated = motionMeasurer.transition.getInterpolated(constraintWidget.stringId);
            float[] path = motionMeasurer.transition.getPath(constraintWidget.stringId);
            int keyFrames = motionMeasurer.transition.getKeyFrames(constraintWidget.stringId, fArr, iArr, iArr2);
            sb2.append(' ' + constraintWidget.stringId + ": {");
            sb2.append(" interpolated : ");
            interpolated.serialize(sb2, true);
            sb2.append(", start : ");
            start.serialize(sb2);
            sb2.append(", end : ");
            end.serialize(sb2);
            motionMeasurer.encodeKeyFrames(sb2, fArr, iArr, iArr2, keyFrames);
            sb2.append(" path : [");
            for (float f11 : path) {
                sb2.append(' ' + f11 + " ,");
            }
            sb2.append(" ] ");
            sb2.append("}, ");
            i11++;
            motionMeasurer = this;
        }
        sb2.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb2.toString());
        }
    }

    public final void drawDebug(@k DrawScope drawScope, boolean z11, boolean z12, boolean z13) {
        WidgetFrame widgetFrame;
        PathEffect pathEffect;
        PathEffect dashPathEffect = PathEffect.Companion.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        int size = children.size();
        int i11 = 0;
        while (i11 < size) {
            ConstraintWidget constraintWidget = children.get(i11);
            WidgetFrame start = this.transition.getStart(constraintWidget);
            WidgetFrame end = this.transition.getEnd(constraintWidget);
            if (z11) {
                Color.Companion companion = Color.Companion;
                m5551drawFrameg2O1Hgs(drawScope, start, dashPathEffect, companion.m2536getBlue0d7_KjU());
                m5551drawFrameg2O1Hgs(drawScope, end, dashPathEffect, companion.m2536getBlue0d7_KjU());
                drawScope.getDrawContext().getTransform().translate(2.0f, 2.0f);
                try {
                    m5551drawFrameg2O1Hgs(drawScope, start, dashPathEffect, companion.m2546getWhite0d7_KjU());
                    widgetFrame = start;
                    m5551drawFrameg2O1Hgs(drawScope, end, dashPathEffect, companion.m2546getWhite0d7_KjU());
                    pathEffect = dashPathEffect;
                } finally {
                    drawScope.getDrawContext().getTransform().translate(-2.0f, -2.0f);
                }
            } else {
                widgetFrame = start;
                pathEffect = dashPathEffect;
            }
            drawPaths(drawScope, Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc()), Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc()), widgetFrame, z12, z13);
            i11++;
            dashPathEffect = pathEffect;
        }
    }

    public final void encodeRoot(@k StringBuilder sb2) {
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + getRoot().getWidth() + " ,");
        sb2.append("  bottom:  " + getRoot().getHeight() + " ,");
        sb2.append(" } }");
    }

    /* renamed from: getCustomColor-XeAY9LY, reason: not valid java name */
    public final long m5556getCustomColorXeAY9LY(@k String str, @k String str2, float f11) {
        if (!this.transition.contains(str)) {
            return Color.Companion.m2545getUnspecified0d7_KjU();
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), f11);
        WidgetFrame interpolated = this.transition.getInterpolated(str);
        return !interpolated.containsCustom(str2) ? Color.Companion.m2545getUnspecified0d7_KjU() : ColorKt.Color(interpolated.getCustomColor(str2));
    }

    public final float getCustomFloat(@k String str, @k String str2, float f11) {
        if (!this.transition.contains(str)) {
            return Float.NaN;
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), f11);
        return this.transition.getInterpolated(str).getCustomFloat(str2);
    }

    @k
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    public final void initWith(@k ConstraintSet constraintSet, @k ConstraintSet constraintSet2, @k LayoutDirection layoutDirection, @k TransitionImpl transitionImpl, float f11) {
        clearConstraintSets();
        getState().setRtl(layoutDirection == LayoutDirection.Rtl);
        constraintSet.applyTo(getState(), h0.J());
        constraintSet.applyTo(this.transition, 0);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 0);
        constraintSet.applyTo(getState(), h0.J());
        constraintSet2.applyTo(this.transition, 1);
        getState().apply(getRoot());
        this.transition.updateFrom(getRoot(), 1);
        this.transition.interpolate(0, 0, f11);
        transitionImpl.applyAllTo(this.transition);
    }

    /* renamed from: performInterpolationMeasure-LzAeyeM, reason: not valid java name */
    public final long m5557performInterpolationMeasureLzAeyeM(long j11, @k LayoutDirection layoutDirection, @k ConstraintSet constraintSet, @k ConstraintSet constraintSet2, @k TransitionImpl transitionImpl, @k List<? extends Measurable> list, @k Map<Measurable, Placeable> map, int i11, float f11, @k CompositionSource compositionSource, @l ShouldInvalidateCallback shouldInvalidateCallback) {
        long j12;
        MotionMeasurer motionMeasurer;
        LayoutInformationReceiver layoutInformationReceiver;
        LayoutInformationReceiver layoutInformationReceiver2;
        setPlaceables(map);
        boolean m5554needsRemeasureNN6EwU = m5554needsRemeasureNN6EwU(j11, compositionSource, shouldInvalidateCallback);
        if (this.lastProgressInInterpolation != f11 || ((((layoutInformationReceiver = getLayoutInformationReceiver()) == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE) && ((layoutInformationReceiver2 = getLayoutInformationReceiver()) == null || layoutInformationReceiver2.getForcedHeight() != Integer.MIN_VALUE)) || m5554needsRemeasureNN6EwU)) {
            j12 = j11;
            motionMeasurer = this;
            motionMeasurer.m5555recalculateInterpolation36Wf7g4(j12, layoutDirection, constraintSet, constraintSet2, transitionImpl, list, i11, f11, m5554needsRemeasureNN6EwU);
        } else {
            j12 = j11;
            motionMeasurer = this;
        }
        motionMeasurer.oldConstraints = Constraints.m5055boximpl(j12);
        return IntSizeKt.IntSize(getRoot().getWidth(), getRoot().getHeight());
    }
}
