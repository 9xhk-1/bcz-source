package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nApproachMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,117:1\n113#2,7:118\n113#2,7:128\n56#2,3:136\n60#2:141\n1#3:125\n30#4:126\n80#5:127\n361#6:135\n362#6,2:139\n365#6:142\n*S KotlinDebug\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n*L\n59#1:118,7\n79#1:128,7\n99#1:136,3\n99#1:141\n64#1:126\n64#1:127\n99#1:135\n99#1:139,2\n99#1:142\n*E\n"})
/* loaded from: classes.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;

    @k
    private ApproachLayoutModifierNode approachNode;

    @k
    private final LayoutModifierNodeCoordinator coordinator;

    public ApproachMeasureScopeImpl(@k LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, @k ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    public final boolean getApproachMeasureRequired$ui_release() {
        return this.approachMeasureRequired;
    }

    @k
    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    @k
    public final LayoutModifierNodeCoordinator getCoordinator() {
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

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @k
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo3833getLookaheadConstraintsmsEJaDk() {
        Constraints m4025getLookaheadConstraintsDWUhwKw$ui_release = this.coordinator.m4025getLookaheadConstraintsDWUhwKw$ui_release();
        if (m4025getLookaheadConstraintsDWUhwKw$ui_release != null) {
            return m4025getLookaheadConstraintsDWUhwKw$ui_release.m5074unboximpl();
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @k
    public LayoutCoordinates getLookaheadScopeCoordinates(@k Placeable.PlacementScope placementScope) {
        NodeCoordinator innerCoordinator$ui_release;
        LayoutNode lookaheadRoot$ui_release = this.coordinator.getLayoutNode().getLookaheadRoot$ui_release();
        if (lookaheadRoot$ui_release == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new KotlinNothingValueException();
        }
        if (!lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
            return lookaheadRoot$ui_release.getOuterCoordinator$ui_release();
        }
        LayoutNode parent$ui_release = lookaheadRoot$ui_release.getParent$ui_release();
        return (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null) ? lookaheadRoot$ui_release.getChildren$ui_release().get(0).getOuterCoordinator$ui_release() : innerCoordinator$ui_release;
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo3834getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
        return IntSize.m5281constructorimpl((measureResult$ui_release.getWidth() << 32) | (measureResult$ui_release.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @k
    public MeasureResult layout(int i11, int i12, @k Map<AlignmentLine, Integer> map, @k l<? super Placeable.PlacementScope, g2> lVar) {
        return this.coordinator.layout(i11, i12, map, lVar);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo370roundToPxR2X_6o(long j11) {
        return this.coordinator.mo370roundToPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo371roundToPx0680j_4(float f11) {
        return this.coordinator.mo371roundToPx0680j_4(f11);
    }

    public final void setApproachMeasureRequired$ui_release(boolean z11) {
        this.approachMeasureRequired = z11;
    }

    public final void setApproachNode(@k ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo372toDpGaN1DYA(long j11) {
        return this.coordinator.mo372toDpGaN1DYA(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo373toDpu2uoSUM(float f11) {
        return this.coordinator.mo373toDpu2uoSUM(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo375toDpSizekrfVVM(long j11) {
        return this.coordinator.mo375toDpSizekrfVVM(j11);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @k
    public LayoutCoordinates toLookaheadCoordinates(@k LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates;
        }
        if (layoutCoordinates instanceof NodeCoordinator) {
            LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? layoutCoordinates : lookaheadLayoutCoordinates;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported LayoutCoordinates");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo376toPxR2X_6o(long j11) {
        return this.coordinator.mo376toPxR2X_6o(j11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo377toPx0680j_4(float f11) {
        return this.coordinator.mo377toPx0680j_4(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @k
    public Rect toRect(@k DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo378toSizeXkaWNTQ(long j11) {
        return this.coordinator.mo378toSizeXkaWNTQ(j11);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo379toSp0xMU5do(float f11) {
        return this.coordinator.mo379toSp0xMU5do(f11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo380toSpkPz2Gy4(float f11) {
        return this.coordinator.mo380toSpkPz2Gy4(f11);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @k
    public MeasureResult layout(final int i11, final int i12, @k final Map<AlignmentLine, Integer> map, @m80.l final l<? super RulerScope, g2> lVar, @k final l<? super Placeable.PlacementScope, g2> lVar2) {
        if (!((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i11, i12, map, lVar, lVar2, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl$layout$1
            final /* synthetic */ l<Placeable.PlacementScope, g2> $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final l<RulerScope, g2> rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$placementBlock = lVar2;
                this.this$0 = this;
                this.width = i11;
                this.height = i12;
                this.alignmentLines = map;
                this.rulers = lVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public l<RulerScope, g2> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo374toDpu2uoSUM(int i11) {
        return this.coordinator.mo374toDpu2uoSUM(i11);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo381toSpkPz2Gy4(int i11) {
        return this.coordinator.mo381toSpkPz2Gy4(i11);
    }
}
