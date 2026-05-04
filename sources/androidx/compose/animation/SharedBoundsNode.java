package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,276:1\n1#2:277\n33#3:278\n33#3:300\n53#4,3:279\n80#4:283\n85#4:286\n90#4:289\n85#4:292\n90#4:295\n85#4:297\n90#4:299\n53#4,3:301\n30#5:282\n61#6:284\n54#6:285\n63#6:287\n59#6:288\n61#6:290\n54#6:291\n63#6:293\n59#6:294\n54#6:296\n59#6:298\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n*L\n146#1:278\n241#1:300\n146#1:279,3\n175#1:283\n173#1:286\n172#1:289\n224#1:292\n224#1:295\n241#1:297\n241#1:299\n241#1:301,3\n175#1:282\n173#1:284\n173#1:285\n172#1:287\n172#1:288\n224#1:290\n224#1:291\n224#1:293\n224#1:294\n241#1:296\n241#1:298\n*E\n"})
/* loaded from: classes.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 8;

    @l
    private GraphicsLayer layer;

    @k
    private final ModifierLocalMap providedValues;

    @k
    private SharedElementInternalState state;

    public SharedBoundsNode(@k SharedElementInternalState sharedElementInternalState) {
        this.state = sharedElementInternalState;
        this.layer = sharedElementInternalState.getLayer();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(h1.a(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState));
    }

    private final MeasureResult approachPlace(MeasureScope measureScope, final Placeable placeable) {
        if (!getSharedElement().getFoundMatch()) {
            return MeasureScope.layout$default(measureScope, placeable.getWidth(), placeable.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.SharedBoundsNode$approachPlace$1
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
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        long mo108calculateSizeJyjRU_E = this.state.getPlaceHolderSize().mo108calculateSizeJyjRU_E(requireLookaheadLayoutCoordinates().mo3865getSizeYbymL2g(), IntSize.m5281constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L)));
        return MeasureScope.layout$default(measureScope, (int) (mo108calculateSizeJyjRU_E >> 32), (int) (mo108calculateSizeJyjRU_E & 4294967295L), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.SharedBoundsNode$approachPlace$2
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
                SharedElement sharedElement;
                BoundsAnimation boundsAnimation;
                Offset offset;
                BoundsAnimation boundsAnimation2;
                SharedElement sharedElement2;
                long m2303getTopLeftF1C5BW0;
                LayoutCoordinates coordinates;
                BoundsAnimation boundsAnimation3;
                SharedElement sharedElement3;
                LayoutCoordinates rootCoords;
                BoundsAnimation boundsAnimation4;
                SharedElement sharedElement4;
                SharedElement sharedElement5;
                sharedElement = SharedBoundsNode.this.getSharedElement();
                if (sharedElement.getTargetBounds() != null) {
                    boundsAnimation4 = SharedBoundsNode.this.getBoundsAnimation();
                    sharedElement4 = SharedBoundsNode.this.getSharedElement();
                    Rect currentBounds = sharedElement4.getCurrentBounds();
                    g0.m(currentBounds);
                    sharedElement5 = SharedBoundsNode.this.getSharedElement();
                    Rect targetBounds = sharedElement5.getTargetBounds();
                    g0.m(targetBounds);
                    boundsAnimation4.animate(currentBounds, targetBounds);
                }
                boundsAnimation = SharedBoundsNode.this.getBoundsAnimation();
                Rect value = boundsAnimation.getValue();
                LayoutCoordinates coordinates2 = placementScope.getCoordinates();
                if (coordinates2 != null) {
                    rootCoords = SharedBoundsNode.this.getRootCoords();
                    offset = Offset.m2257boximpl(rootCoords.mo3866localPositionOfR5De75A(coordinates2, Offset.Companion.m2284getZeroF1C5BW0()));
                } else {
                    offset = null;
                }
                if (value != null) {
                    boundsAnimation3 = SharedBoundsNode.this.getBoundsAnimation();
                    if (boundsAnimation3.getTarget()) {
                        sharedElement3 = SharedBoundsNode.this.getSharedElement();
                        sharedElement3.setCurrentBounds(value);
                    }
                    m2303getTopLeftF1C5BW0 = value.m2303getTopLeftF1C5BW0();
                } else {
                    boundsAnimation2 = SharedBoundsNode.this.getBoundsAnimation();
                    if (boundsAnimation2.getTarget() && (coordinates = placementScope.getCoordinates()) != null) {
                        SharedBoundsNode.this.updateCurrentBounds(coordinates);
                    }
                    sharedElement2 = SharedBoundsNode.this.getSharedElement();
                    Rect currentBounds2 = sharedElement2.getCurrentBounds();
                    g0.m(currentBounds2);
                    m2303getTopLeftF1C5BW0 = currentBounds2.m2303getTopLeftF1C5BW0();
                }
                long m2272minusMKHz9U = offset != null ? Offset.m2272minusMKHz9U(m2303getTopLeftF1C5BW0, offset.m2278unboximpl()) : Offset.Companion.m2284getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, placeable, Math.round(Float.intBitsToFloat((int) (m2272minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (m2272minusMKHz9U & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoundsAnimation getBoundsAnimation() {
        return this.state.getBoundsAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootCoords() {
        return getSharedElement().getScope().getRoot$animation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getRootLookaheadCoords() {
        return getSharedElement().getScope().getLookaheadRoot$animation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement getSharedElement() {
        return this.state.getSharedElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates requireLookaheadLayoutCoordinates() {
        return this.state.getSharedElement().getScope().toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates(this));
    }

    private final void setLayer(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.layer;
            if (graphicsLayer2 != null) {
                DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer2);
            }
        } else {
            this.state.setLayer(graphicsLayer);
        }
        this.layer = graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentBounds(LayoutCoordinates layoutCoordinates) {
        SharedElement sharedElement = getSharedElement();
        long mo3866localPositionOfR5De75A = getRootCoords().mo3866localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2284getZeroF1C5BW0());
        float mo3865getSizeYbymL2g = (int) (layoutCoordinates.mo3865getSizeYbymL2g() >> 32);
        float mo3865getSizeYbymL2g2 = (int) (layoutCoordinates.mo3865getSizeYbymL2g() & 4294967295L);
        sharedElement.setCurrentBounds(RectKt.m2308Recttz77jQw(mo3866localPositionOfR5De75A, Size.m2328constructorimpl((Float.floatToRawIntBits(mo3865getSizeYbymL2g) << 32) | (Float.floatToRawIntBits(mo3865getSizeYbymL2g2) & 4294967295L))));
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    @k
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo66approachMeasure3p2s80s(@k ApproachMeasureScope approachMeasureScope, @k Measurable measurable, long j11) {
        if (getSharedElement().getFoundMatch()) {
            Rect value = getBoundsAnimation().getValue();
            if (value == null) {
                value = getSharedElement().getCurrentBounds();
            }
            if (value != null) {
                long m5294roundToIntSizeuvyYCjk = IntSizeKt.m5294roundToIntSizeuvyYCjk(value.m2301getSizeNHjbRc());
                int i11 = (int) (m5294roundToIntSizeuvyYCjk >> 32);
                int i12 = (int) (m5294roundToIntSizeuvyYCjk & 4294967295L);
                if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getCurrentBounds()).toString());
                }
                j11 = Constraints.Companion.m5078fixedJhjzzOo(u.u(i11, 0), u.u(i12, 0));
            }
        }
        return approachPlace(approachMeasureScope, measurable.mo3857measureBRTryo0(j11));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k final ContentDrawScope contentDrawScope) {
        this.state.setFirstFrameDrawn$animation(true);
        SharedElementInternalState sharedElementInternalState = this.state;
        SharedTransitionScope.OverlayClip overlayClip = sharedElementInternalState.getOverlayClip();
        SharedTransitionScope.SharedContentState userState = this.state.getUserState();
        Rect currentBounds = getSharedElement().getCurrentBounds();
        g0.m(currentBounds);
        sharedElementInternalState.setClipPathInOverlay$animation(overlayClip.getClipPath(userState, currentBounds, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.requireDensity(this)));
        GraphicsLayer layer = this.state.getLayer();
        if (layer != null) {
            DrawScope.m3058recordJVtK1S4$default(contentDrawScope, layer, 0L, new x00.l<DrawScope, g2>() { // from class: androidx.compose.animation.SharedBoundsNode$draw$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    ContentDrawScope.this.drawContent();
                }
            }, 1, null);
            if (this.state.getShouldRenderInPlace()) {
                GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + getSharedElement().getKey() + ",target: " + this.state.getBoundsAnimation().getTarget() + ", is attached: " + isAttached()).toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @k
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @k
    public final SharedElementInternalState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo67isMeasurementApproachInProgressozmzZPI(long j11) {
        return getSharedElement().getFoundMatch() && this.state.getSharedElement().getScope().isTransitionActive();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        float width = mo3857measureBRTryo0.getWidth();
        float height = mo3857measureBRTryo0.getHeight();
        final long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
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
                Offset offset;
                SharedElement sharedElement;
                LayoutCoordinates rootLookaheadCoords;
                SharedElement sharedElement2;
                SharedElement sharedElement3;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    SharedBoundsNode sharedBoundsNode = this;
                    long j12 = m2328constructorimpl;
                    rootLookaheadCoords = sharedBoundsNode.getRootLookaheadCoords();
                    long mo3866localPositionOfR5De75A = rootLookaheadCoords.mo3866localPositionOfR5De75A(coordinates, Offset.Companion.m2284getZeroF1C5BW0());
                    sharedElement2 = sharedBoundsNode.getSharedElement();
                    if (sharedElement2.getCurrentBounds() == null) {
                        sharedElement3 = sharedBoundsNode.getSharedElement();
                        sharedElement3.setCurrentBounds(RectKt.m2308Recttz77jQw(mo3866localPositionOfR5De75A, j12));
                    }
                    offset = Offset.m2257boximpl(mo3866localPositionOfR5De75A);
                } else {
                    offset = null;
                }
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                if (offset != null) {
                    SharedBoundsNode sharedBoundsNode2 = this;
                    long j13 = m2328constructorimpl;
                    long m2278unboximpl = offset.m2278unboximpl();
                    sharedElement = sharedBoundsNode2.getSharedElement();
                    sharedElement.m105onLookaheadResultv_w8tDc(sharedBoundsNode2.getState(), j13, m2278unboximpl);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.state);
        this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
        this.state.setLookaheadCoords(new x00.a<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode$onAttach$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final LayoutCoordinates invoke() {
                LayoutCoordinates requireLookaheadLayoutCoordinates;
                requireLookaheadLayoutCoordinates = SharedBoundsNode.this.requireLookaheadLayoutCoordinates();
                return requireLookaheadLayoutCoordinates;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        setLayer(null);
        this.state.setParentState(null);
        this.state.setLookaheadCoords(new x00.a() { // from class: androidx.compose.animation.SharedBoundsNode$onDetach$1
            @Override // x00.a
            public final Void invoke() {
                return null;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
        }
        setLayer(DelegatableNodeKt.requireGraphicsContext(this).createGraphicsLayer());
    }

    public final void setState$animation(@k SharedElementInternalState sharedElementInternalState) {
        if (g0.g(sharedElementInternalState, this.state)) {
            return;
        }
        this.state = sharedElementInternalState;
        if (isAttached()) {
            provide(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), sharedElementInternalState);
            this.state.setParentState((SharedElementInternalState) getCurrent(SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
            this.state.setLayer(this.layer);
            this.state.setLookaheadCoords(new x00.a<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode$state$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LayoutCoordinates invoke() {
                    LayoutCoordinates requireLookaheadLayoutCoordinates;
                    requireLookaheadLayoutCoordinates = SharedBoundsNode.this.requireLookaheadLayoutCoordinates();
                    return requireLookaheadLayoutCoordinates;
                }
            });
        }
    }
}
