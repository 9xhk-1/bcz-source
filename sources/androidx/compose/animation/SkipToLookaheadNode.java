package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,179:1\n85#2:180\n113#2,2:181\n85#2:183\n113#2,2:184\n30#3:186\n80#4:187\n85#4:189\n90#4:191\n85#4:193\n85#4:195\n90#4:197\n90#4:199\n54#5:188\n59#5:190\n54#5:192\n54#5:194\n59#5:196\n59#5:198\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n*L\n44#1:180\n44#1:181,2\n45#1:183\n45#1:184,2\n58#1:186\n58#1:187\n60#1:189\n60#1:191\n100#1:193\n113#1:195\n126#1:197\n139#1:199\n60#1:188\n60#1:190\n100#1:192\n113#1:194\n126#1:196\n139#1:198\n*E\n"})
/* loaded from: classes.dex */
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    @k
    private final MutableState isEnabled$delegate;

    @l
    private Constraints lookaheadConstraints;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();

    @k
    private final MutableState scaleToBounds$delegate;

    public SkipToLookaheadNode(@l ScaleToBoundsImpl scaleToBoundsImpl, @k x00.a<Boolean> aVar) {
        this.scaleToBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final ScaleToBoundsImpl getScaleToBounds() {
        return (ScaleToBoundsImpl) this.scaleToBounds$delegate.getValue();
    }

    @k
    public final x00.a<Boolean> isEnabled() {
        return (x00.a) this.isEnabled$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m65isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicHeight(i11) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m65isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicWidth(i11) : (int) (this.lookaheadSize >> 32);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k final MeasureScope measureScope, @k Measurable measurable, long j11) {
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = Constraints.m5055boximpl(j11);
        }
        Constraints constraints = this.lookaheadConstraints;
        g0.m(constraints);
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(constraints.m5074unboximpl());
        long m5281constructorimpl = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
        this.lookaheadSize = m5281constructorimpl;
        final long m5082constrain4WqzIAM = ConstraintsKt.m5082constrain4WqzIAM(j11, m5281constructorimpl);
        return MeasureScope.layout$default(measureScope, (int) (m5082constrain4WqzIAM >> 32), (int) (m5082constrain4WqzIAM & 4294967295L), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1
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
                long j12;
                final long m3940constructorimpl;
                long j13;
                long j14;
                long j15;
                long j16;
                ScaleToBoundsImpl scaleToBounds = SkipToLookaheadNode.this.getScaleToBounds();
                if (!SkipToLookaheadNode.this.isEnabled().invoke().booleanValue() || scaleToBounds == null) {
                    Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, 0, 0, 0.0f, 4, null);
                    return;
                }
                ContentScale contentScale = scaleToBounds.getContentScale();
                j12 = SkipToLookaheadNode.this.lookaheadSize;
                if (((int) (j12 >> 32)) != 0) {
                    j15 = SkipToLookaheadNode.this.lookaheadSize;
                    if (((int) (j15 & 4294967295L)) != 0) {
                        j16 = SkipToLookaheadNode.this.lookaheadSize;
                        m3940constructorimpl = contentScale.mo3850computeScaleFactorH7hwNQA(IntSizeKt.m5298toSizeozmzZPI(j16), IntSizeKt.m5298toSizeozmzZPI(m5082constrain4WqzIAM));
                        Alignment alignment = scaleToBounds.getAlignment();
                        j13 = SkipToLookaheadNode.this.lookaheadSize;
                        int L0 = d.L0(((int) (j13 >> 32)) * Float.intBitsToFloat((int) (m3940constructorimpl >> 32)));
                        j14 = SkipToLookaheadNode.this.lookaheadSize;
                        long mo2085alignKFBX0sM = alignment.mo2085alignKFBX0sM(IntSize.m5281constructorimpl((d.L0(((int) (j14 & 4294967295L)) * Float.intBitsToFloat((int) (m3940constructorimpl & 4294967295L))) & 4294967295L) | (L0 << 32)), m5082constrain4WqzIAM, measureScope.getLayoutDirection());
                        Placeable.PlacementScope.placeWithLayer$default(placementScope, mo3857measureBRTryo0, IntOffset.m5243getXimpl(mo2085alignKFBX0sM), IntOffset.m5244getYimpl(mo2085alignKFBX0sM), 0.0f, new x00.l<GraphicsLayerScope, g2>() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                                invoke2(graphicsLayerScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (m3940constructorimpl >> 32)));
                                graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (m3940constructorimpl & 4294967295L)));
                                graphicsLayerScope.mo2701setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                            }
                        }, 4, (Object) null);
                    }
                }
                m3940constructorimpl = ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                Alignment alignment2 = scaleToBounds.getAlignment();
                j13 = SkipToLookaheadNode.this.lookaheadSize;
                int L02 = d.L0(((int) (j13 >> 32)) * Float.intBitsToFloat((int) (m3940constructorimpl >> 32)));
                j14 = SkipToLookaheadNode.this.lookaheadSize;
                long mo2085alignKFBX0sM2 = alignment2.mo2085alignKFBX0sM(IntSize.m5281constructorimpl((d.L0(((int) (j14 & 4294967295L)) * Float.intBitsToFloat((int) (m3940constructorimpl & 4294967295L))) & 4294967295L) | (L02 << 32)), m5082constrain4WqzIAM, measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeWithLayer$default(placementScope, mo3857measureBRTryo0, IntOffset.m5243getXimpl(mo2085alignKFBX0sM2), IntOffset.m5244getYimpl(mo2085alignKFBX0sM2), 0.0f, new x00.l<GraphicsLayerScope, g2>() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (m3940constructorimpl >> 32)));
                        graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (m3940constructorimpl & 4294967295L)));
                        graphicsLayerScope.mo2701setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                    }
                }, 4, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m65isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicHeight(i11) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m65isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicWidth(i11) : (int) (this.lookaheadSize >> 32);
    }

    public final void setEnabled(@k x00.a<Boolean> aVar) {
        this.isEnabled$delegate.setValue(aVar);
    }

    public final void setScaleToBounds(@l ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds$delegate.setValue(scaleToBoundsImpl);
    }
}
