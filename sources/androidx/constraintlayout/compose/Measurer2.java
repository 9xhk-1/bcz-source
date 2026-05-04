package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Measurer.kt\nandroidx/constraintlayout/compose/Measurer2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,527:1\n1#2:528\n361#3,7:529\n33#4,6:536\n33#4,6:542\n*S KotlinDebug\n*F\n+ 1 Measurer.kt\nandroidx/constraintlayout/compose/Measurer2\n*L\n215#1:529,7\n458#1:536,6\n465#1:542,6\n*E\n"})
@v0
/* loaded from: classes2.dex */
public class Measurer2 implements BasicMeasure.Measurer, DesignInfoProvider {
    public static final int $stable = 8;

    @k
    private String computedLayoutResult = "";
    private float forcedScaleFactor;

    @k
    private final Map<String, WidgetFrame> frameCache;

    @k
    private final int[] heightConstraintsHolder;

    @k
    private final Map<String, Integer[]> lastMeasures;

    @l
    private LayoutInformationReceiver layoutInformationReceiver;

    @k
    private Map<Measurable, Placeable> placeables;

    @k
    private final ConstraintWidgetContainer root;

    @k
    private final State state;

    @k
    private final int[] widthConstraintsHolder;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer2(@k Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    private final long m5514measureWidgetyQShABA(ConstraintWidget constraintWidget, long j11) {
        Object companionWidget = constraintWidget.getCompanionWidget();
        String str = constraintWidget.stringId;
        int i11 = 0;
        if (constraintWidget instanceof VirtualLayout) {
            int i12 = Constraints.m5066getHasFixedWidthimpl(j11) ? 1073741824 : Constraints.m5064getHasBoundedWidthimpl(j11) ? Integer.MIN_VALUE : 0;
            if (Constraints.m5065getHasFixedHeightimpl(j11)) {
                i11 = 1073741824;
            } else if (Constraints.m5063getHasBoundedHeightimpl(j11)) {
                i11 = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.measure(i12, Constraints.m5068getMaxWidthimpl(j11), i11, Constraints.m5067getMaxHeightimpl(j11));
            return IntIntPair.m17constructorimpl(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
        if (companionWidget instanceof Measurable) {
            Placeable mo3857measureBRTryo0 = ((Measurable) companionWidget).mo3857measureBRTryo0(j11);
            this.placeables.put(companionWidget, mo3857measureBRTryo0);
            return IntIntPair.m17constructorimpl(mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.m17constructorimpl(0, 0);
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int[] iArr) {
        int i15 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i15 == 1) {
            iArr[0] = i11;
            iArr[1] = i11;
            return false;
        }
        if (i15 == 2) {
            iArr[0] = 0;
            iArr[1] = i14;
            return true;
        }
        if (i15 == 3) {
            boolean z13 = z12 || ((i13 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i13 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (i13 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || i12 != 1 || z11));
            iArr[0] = z13 ? i11 : 0;
            if (!z13) {
                i11 = i14;
            }
            iArr[1] = i11;
            return !z13;
        }
        if (i15 == 4) {
            iArr[0] = i14;
            iArr[1] = i14;
            return false;
        }
        throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
    }

    public final void addLayoutInformationReceiver(@l LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(this.computedLayoutResult);
        }
    }

    /* renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    public final void m5515applyRootSizeBRTryo0(long j11) {
        this.root.setWidth(Constraints.m5068getMaxWidthimpl(j11));
        this.root.setHeight(Constraints.m5067getMaxHeightimpl(j11));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null && (layoutInformationReceiver == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE)) {
            LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
            g0.m(layoutInformationReceiver2);
            int forcedWidth = layoutInformationReceiver2.getForcedWidth();
            if (forcedWidth > this.root.getWidth()) {
                this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
            } else {
                this.forcedScaleFactor = 1.0f;
            }
            this.root.setWidth(forcedWidth);
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            if (layoutInformationReceiver3 == null || layoutInformationReceiver3.getForcedHeight() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                g0.m(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.root.getWidth() + " ,");
        sb2.append("  bottom:  " + this.root.getHeight() + " ,");
        sb2.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    next.stringId = layoutId != null ? layoutId.toString() : null;
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(MeasurerKt.getAnyOrNullId((Measurable) companionWidget));
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb2.append(' ' + next.stringId + ": {");
                    sb2.append(" interpolated : ");
                    widgetFrame.serialize(sb2, true);
                    sb2.append("}, ");
                }
            } else if (next instanceof Guideline) {
                sb2.append(' ' + next.stringId + ": {");
                Guideline guideline = (Guideline) next;
                if (guideline.getOrientation() == 0) {
                    sb2.append(" type: 'hGuideline', ");
                } else {
                    sb2.append(" type: 'vGuideline', ");
                }
                sb2.append(" interpolated: ");
                sb2.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb2.append("}, ");
            }
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        this.computedLayoutResult = sb3;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb3);
        }
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    @k
    public String getDesignInfo(int i11, int i12, @k String str) {
        return ToolingUtilsKt.parseConstraintsToJson(this.root, this.state, i11, i12, str);
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    @k
    public final Map<String, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    public final int getLayoutCurrentHeight() {
        return this.root.getHeight();
    }

    public final int getLayoutCurrentWidth() {
        return this.root.getWidth();
    }

    @l
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    @k
    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    @k
    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    @k
    public final State getState() {
        return this.state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r18.mMatchConstraintDefaultHeight == 0) goto L54;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(@m80.k androidx.constraintlayout.core.widgets.ConstraintWidget r18, @m80.k androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer2.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public final void performLayout(@k Placeable.PlacementScope placementScope, @k List<? extends Measurable> list, @k Map<Measurable, Placeable> map) {
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        this.placeables = map;
        int i11 = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget = children.get(i12);
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(MeasurerKt.getAnyOrNullId((Measurable) companionWidget), new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int size2 = list.size();
        while (i11 < size2) {
            Measurable measurable = list.get(i11);
            WidgetFrame widgetFrame = this.frameCache.get(MeasurerKt.getAnyOrNullId(measurable));
            if (widgetFrame == null || (placeable = this.placeables.get(measurable)) == null) {
                placementScope2 = placementScope;
            } else {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m5457placeWithFrameTransformKtjjmr4$default(placementScope2, placeable, widgetFrame, 0L, 4, null);
            }
            i11++;
            placementScope = placementScope2;
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m5516performMeasureDjhGOtQ(long j11, @k LayoutDirection layoutDirection, @k ConstraintSet constraintSet, @k List<? extends Measurable> list, @k Map<Measurable, Placeable> map, int i11) {
        this.placeables = map;
        if (list.isEmpty()) {
            return IntSizeKt.IntSize(Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11));
        }
        this.state.width(Constraints.m5066getHasFixedWidthimpl(j11) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m5068getMaxWidthimpl(j11)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m5070getMinWidthimpl(j11)));
        this.state.height(Constraints.m5065getHasFixedHeightimpl(j11) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m5067getMaxHeightimpl(j11)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m5069getMinHeightimpl(j11)));
        this.state.mParent.getWidth().apply(this.state, this.root, 0);
        this.state.mParent.getHeight().apply(this.state, this.root, 1);
        this.state.m5584setRootIncomingConstraintsBRTryo0(j11);
        this.state.setRtl(layoutDirection == LayoutDirection.Rtl);
        resetMeasureState$constraintlayout_compose_release();
        if (constraintSet.isDirty(list)) {
            this.state.reset();
            constraintSet.applyTo(this.state, list);
            ConstraintLayoutKt.buildMapping(this.state, list);
            this.state.apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(this.state, list);
        }
        m5515applyRootSizeBRTryo0(j11);
        this.root.updateHierarchy();
        this.root.setOptimizationLevel(i11);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$constraintlayout_compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    public final void setForcedScaleFactor(float f11) {
        this.forcedScaleFactor = f11;
    }

    public final void setLayoutInformationReceiver(@l LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    public final void setPlaceables(@k Map<Measurable, Placeable> map) {
        this.placeables = map;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }
}
