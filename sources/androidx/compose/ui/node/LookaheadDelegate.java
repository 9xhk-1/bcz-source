package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n30#2:522\n30#2:525\n80#3:523\n80#3:526\n1#4:524\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n407#1:522\n418#1:525\n407#1:523\n418#1:526\n*E\n"})
/* loaded from: classes2.dex */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public static final int $stable = 0;

    @l
    private MeasureResult _measureResult;

    @k
    private final NodeCoordinator coordinator;

    @l
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m5254getZeronOccac();

    @k
    private final LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new LookaheadLayoutCoordinates(this);

    @k
    private final MutableObjectIntMap<AlignmentLine> cachedAlignmentLinesMap = ObjectIntMapKt.mutableObjectIntMapOf();

    public LookaheadDelegate(@k NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    /* renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m4054placeSelfgyyYBs(long j11) {
        if (!IntOffset.m5242equalsimpl0(mo4052getPositionnOccac(), j11)) {
            m4060setPositiongyyYBs(j11);
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        g2 g2Var;
        Map<AlignmentLine, Integer> map;
        if (measureResult != null) {
            m3919setMeasuredSizeozmzZPI(IntSize.m5281constructorimpl((measureResult.getHeight() & 4294967295L) | (measureResult.getWidth() << 32)));
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            m3919setMeasuredSizeozmzZPI(IntSize.Companion.m5291getZeroYbymL2g());
        }
        if (!g0.g(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !g0.g(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map map2 = this.oldAlignmentLines;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.oldAlignmentLines = map2;
            }
            map2.clear();
            map2.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @k
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        g0.m(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(@k AlignmentLine alignmentLine) {
        return this.cachedAlignmentLinesMap.getOrDefault(alignmentLine, Integer.MIN_VALUE);
    }

    @k
    public final MutableObjectIntMap<AlignmentLine> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    /* renamed from: getConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m4055getConstraintsmsEJaDk$ui_release() {
        return m3917getMeasurementConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @k
    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @k
    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @k
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @k
    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @k
    public final LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @k
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @l
    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.coordinator.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @l
    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo4052getPositionnOccac() {
        return this.position;
    }

    /* renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m4056getSizeYbymL2g$ui_release() {
        return IntSize.m5281constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public int maxIntrinsicHeight(int i11) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        g0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i11);
    }

    public int maxIntrinsicWidth(int i11) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        g0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i11);
    }

    public int minIntrinsicHeight(int i11) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        g0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i11);
    }

    public int minIntrinsicWidth(int i11) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        g0.m(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i11);
    }

    @k
    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m4057performingMeasureK40F9xA(long j11, @k x00.a<? extends MeasureResult> aVar) {
        m3920setMeasurementConstraintsBRTryo0(j11);
        set_measureResult(aVar.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
        m4054placeSelfgyyYBs(j11);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        placeChildren();
    }

    public void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m4058placeSelfApparentToRealOffsetgyyYBs$ui_release(long j11) {
        m4054placeSelfgyyYBs(IntOffset.m5247plusqkQi6aY(j11, m3915getApparentToRealOffsetnOccac()));
    }

    /* renamed from: positionIn-iSbpLlY$ui_release, reason: not valid java name */
    public final long m4059positionIniSbpLlY$ui_release(@k LookaheadDelegate lookaheadDelegate, boolean z11) {
        long m5254getZeronOccac = IntOffset.Companion.m5254getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!g0.g(lookaheadDelegate2, lookaheadDelegate)) {
            if (!lookaheadDelegate2.isPlacedUnderMotionFrameOfReference() || !z11) {
                m5254getZeronOccac = IntOffset.m5247plusqkQi6aY(m5254getZeronOccac, lookaheadDelegate2.mo4052getPositionnOccac());
            }
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            g0.m(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate();
            g0.m(lookaheadDelegate2);
        }
        return m5254getZeronOccac;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo3858placeAtf8xVGno(mo4052getPositionnOccac(), 0.0f, (x00.l<? super GraphicsLayerScope, g2>) null);
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m4060setPositiongyyYBs(long j11) {
        this.position = j11;
    }
}
