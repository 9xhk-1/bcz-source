package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,444:1\n153#2:445\n61#3:446\n54#3:447\n63#3:449\n59#3:450\n85#4:448\n90#4:451\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n*L\n238#1:445\n254#1:446\n254#1:447\n254#1:449\n254#1:450\n254#1:448\n254#1:451\n*E\n"})
/* loaded from: classes.dex */
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {
    public static final int $stable = 8;
    private boolean animateMotionFrameOfReference;

    @k
    private BoundsTransform boundsTransform;

    @k
    private LookaheadScope lookaheadScope;

    @k
    private p<? super IntSize, ? super Constraints, Constraints> onChooseMeasureConstraints;
    private boolean directManipulationParentsDirty = true;

    @k
    private final BoundsTransformDeferredAnimation boundsAnimation = new BoundsTransformDeferredAnimation();

    public BoundsAnimationModifierNode(@k LookaheadScope lookaheadScope, @k BoundsTransform boundsTransform, @k p<? super IntSize, ? super Constraints, Constraints> pVar, boolean z11) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.onChooseMeasureConstraints = pVar;
        this.animateMotionFrameOfReference = z11;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    @k
    /* renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public MeasureResult mo66approachMeasure3p2s80s(@k ApproachMeasureScope approachMeasureScope, @k Measurable measurable, long j11) {
        long m5298toSizeozmzZPI = this.boundsAnimation.m69getCurrentSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats ? IntSizeKt.m5298toSizeozmzZPI(approachMeasureScope.mo3834getLookaheadSizeYbymL2g()) : this.boundsAnimation.m69getCurrentSizeNHjbRc();
        Rect value = this.boundsAnimation.getValue();
        if (value != null) {
            m5298toSizeozmzZPI = value.m2301getSizeNHjbRc();
        }
        long m5294roundToIntSizeuvyYCjk = IntSizeKt.m5294roundToIntSizeuvyYCjk(m5298toSizeozmzZPI);
        long m5074unboximpl = this.onChooseMeasureConstraints.invoke(IntSize.m5278boximpl(m5294roundToIntSizeuvyYCjk), Constraints.m5055boximpl(j11)).m5074unboximpl();
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(m5074unboximpl);
        long m5082constrain4WqzIAM = ConstraintsKt.m5082constrain4WqzIAM(m5074unboximpl, m5294roundToIntSizeuvyYCjk);
        return MeasureScope.layout$default(approachMeasureScope, (int) (m5082constrain4WqzIAM >> 32), (int) (m5082constrain4WqzIAM & 4294967295L), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.BoundsAnimationModifierNode$approachMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                BoundsTransformDeferredAnimation boundsTransformDeferredAnimation;
                BoundsTransformDeferredAnimation boundsTransformDeferredAnimation2;
                long m2303getTopLeftF1C5BW0;
                BoundsTransformDeferredAnimation boundsTransformDeferredAnimation3;
                boundsTransformDeferredAnimation = BoundsAnimationModifierNode.this.boundsAnimation;
                Rect value2 = boundsTransformDeferredAnimation.getValue();
                LookaheadScope lookaheadScope = BoundsAnimationModifierNode.this.getLookaheadScope();
                BoundsAnimationModifierNode boundsAnimationModifierNode = BoundsAnimationModifierNode.this;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                Offset m2257boximpl = coordinates != null ? Offset.m2257boximpl(lookaheadScope.getLookaheadScopeCoordinates(placementScope).mo3867localPositionOfS_NoaFU(coordinates, Offset.Companion.m2284getZeroF1C5BW0(), boundsAnimationModifierNode.getAnimateMotionFrameOfReference())) : null;
                if (value2 != null) {
                    boundsTransformDeferredAnimation3 = BoundsAnimationModifierNode.this.boundsAnimation;
                    boundsTransformDeferredAnimation3.m71updateCurrentBoundstz77jQw(value2.m2303getTopLeftF1C5BW0(), value2.m2301getSizeNHjbRc());
                    m2303getTopLeftF1C5BW0 = value2.m2303getTopLeftF1C5BW0();
                } else {
                    boundsTransformDeferredAnimation2 = BoundsAnimationModifierNode.this.boundsAnimation;
                    Rect currentBounds = boundsTransformDeferredAnimation2.getCurrentBounds();
                    m2303getTopLeftF1C5BW0 = currentBounds != null ? currentBounds.m2303getTopLeftF1C5BW0() : Offset.Companion.m2284getZeroF1C5BW0();
                }
                long m2272minusMKHz9U = m2257boximpl != null ? Offset.m2272minusMKHz9U(m2303getTopLeftF1C5BW0, m2257boximpl.m2278unboximpl()) : Offset.Companion.m2284getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, Math.round(Float.intBitsToFloat((int) (m2272minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (m2272minusMKHz9U & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    @k
    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    @k
    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    @k
    public final p<IntSize, Constraints, Constraints> getOnChooseMeasureConstraints() {
        return this.onChooseMeasureConstraints;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public boolean mo67isMeasurementApproachInProgressozmzZPI(long j11) {
        this.boundsAnimation.m72updateTargetSizeuvyYCjk(IntSizeKt.m5298toSizeozmzZPI(j11));
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(@k Placeable.PlacementScope placementScope, @k LayoutCoordinates layoutCoordinates) {
        this.boundsAnimation.updateTargetOffsetAndAnimate(this.lookaheadScope, placementScope, getCoroutineScope(), this.directManipulationParentsDirty, this.animateMotionFrameOfReference, this.boundsTransform);
        this.directManipulationParentsDirty = this.animateMotionFrameOfReference;
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.directManipulationParentsDirty = true;
    }

    public final void setAnimateMotionFrameOfReference(boolean z11) {
        this.animateMotionFrameOfReference = z11;
    }

    public final void setBoundsTransform(@k BoundsTransform boundsTransform) {
        this.boundsTransform = boundsTransform;
    }

    public final void setLookaheadScope(@k LookaheadScope lookaheadScope) {
        this.lookaheadScope = lookaheadScope;
    }

    public final void setOnChooseMeasureConstraints(@k p<? super IntSize, ? super Constraints, Constraints> pVar) {
        this.onChooseMeasureConstraints = pVar;
    }
}
