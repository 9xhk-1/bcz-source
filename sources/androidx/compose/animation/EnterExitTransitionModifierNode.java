package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1274:1\n30#2:1275\n30#2:1281\n80#3:1276\n85#3:1278\n90#3:1280\n80#3:1282\n85#3:1284\n90#3:1286\n54#4:1277\n59#4:1279\n54#4:1283\n59#4:1285\n1#5:1287\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n*L\n1161#1:1275\n1172#1:1281\n1161#1:1276\n1164#1:1278\n1164#1:1280\n1172#1:1282\n1189#1:1284\n1189#1:1286\n1164#1:1277\n1164#1:1279\n1189#1:1283\n1189#1:1285\n*E\n"})
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    @l
    private Alignment currentAlignment;

    @k
    private EnterTransition enter;

    @k
    private ExitTransition exit;

    @k
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;

    @k
    private x00.a<Boolean> isEnabled;
    private boolean lookaheadConstraintsAvailable;

    @l
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @l
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @l
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;

    @k
    private Transition<EnterExitState> transition;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @k
    private final x00.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec = new x00.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        @Override // x00.l
        public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<EnterExitState> segment) {
            SpringSpec springSpec;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            FiniteAnimationSpec<IntSize> finiteAnimationSpec = null;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                ChangeSize changeSize = EnterExitTransitionModifierNode.this.getEnter().getData$animation().getChangeSize();
                if (changeSize != null) {
                    finiteAnimationSpec = changeSize.getAnimationSpec();
                }
            } else if (segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                ChangeSize changeSize2 = EnterExitTransitionModifierNode.this.getExit().getData$animation().getChangeSize();
                if (changeSize2 != null) {
                    finiteAnimationSpec = changeSize2.getAnimationSpec();
                }
            } else {
                finiteAnimationSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            }
            if (finiteAnimationSpec != null) {
                return finiteAnimationSpec;
            }
            springSpec = EnterExitTransitionKt.DefaultSizeAnimationSpec;
            return springSpec;
        }
    };

    @k
    private final x00.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec = new x00.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        {
            super(1);
        }

        @Override // x00.l
        public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
            SpringSpec springSpec;
            SpringSpec springSpec2;
            FiniteAnimationSpec<IntOffset> animationSpec;
            SpringSpec springSpec3;
            FiniteAnimationSpec<IntOffset> animationSpec2;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                Slide slide = EnterExitTransitionModifierNode.this.getEnter().getData$animation().getSlide();
                if (slide != null && (animationSpec2 = slide.getAnimationSpec()) != null) {
                    return animationSpec2;
                }
                springSpec3 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec3;
            }
            if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec;
            }
            Slide slide2 = EnterExitTransitionModifierNode.this.getExit().getData$animation().getSlide();
            if (slide2 != null && (animationSpec = slide2.getAnimationSpec()) != null) {
                return animationSpec;
            }
            springSpec2 = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
            return springSpec2;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnterExitTransitionModifierNode(@k Transition<EnterExitState> transition, @l Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @k EnterTransition enterTransition, @k ExitTransition exitTransition, @k x00.a<Boolean> aVar, @k GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = aVar;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m93setLookaheadConstraintsBRTryo0(long j11) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j11;
    }

    @l
    public final Alignment getAlignment() {
        Alignment alignment;
        Alignment alignment2;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData$animation().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData$animation().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData$animation().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData$animation().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    @l
    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    @k
    public final EnterTransition getEnter() {
        return this.enter;
    }

    @k
    public final ExitTransition getExit() {
        return this.exit;
    }

    @k
    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    @k
    public final x00.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @l
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    @k
    public final x00.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getSlideSpec() {
        return this.slideSpec;
    }

    @k
    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    @k
    public final x00.a<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        State<IntOffset> animate;
        State<IntOffset> animate2;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
            long m5281constructorimpl = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
            this.lookaheadSize = m5281constructorimpl;
            m93setLookaheadConstraintsBRTryo0(j11);
            return MeasureScope.layout$default(measureScope, (int) (m5281constructorimpl >> 32), (int) (m5281constructorimpl & 4294967295L), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
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
                    Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        if (!this.isEnabled.invoke().booleanValue()) {
            final Placeable mo3857measureBRTryo02 = measurable.mo3857measureBRTryo0(j11);
            return MeasureScope.layout$default(measureScope, mo3857measureBRTryo02.getWidth(), mo3857measureBRTryo02.getHeight(), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
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
                    Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final x00.l<GraphicsLayerScope, g2> init = this.graphicsLayerBlock.init();
        final Placeable mo3857measureBRTryo03 = measurable.mo3857measureBRTryo0(j11);
        long m5281constructorimpl2 = IntSize.m5281constructorimpl((mo3857measureBRTryo03.getWidth() << 32) | (mo3857measureBRTryo03.getHeight() & 4294967295L));
        final long j12 = AnimationModifierKt.m65isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : m5281constructorimpl2;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        State<IntSize> animate3 = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new x00.l<EnterExitState, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
                return IntSize.m5278boximpl(m97invokeYEO4UFw(enterExitState));
            }

            /* renamed from: invoke-YEO4UFw, reason: not valid java name */
            public final long m97invokeYEO4UFw(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.m94sizeByStateUzc_VyU(enterExitState, j12);
            }
        }) : null;
        if (animate3 != null) {
            m5281constructorimpl2 = animate3.getValue().m5290unboximpl();
        }
        long m5082constrain4WqzIAM = ConstraintsKt.m5082constrain4WqzIAM(j11, m5281constructorimpl2);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        long m5254getZeronOccac = (deferredAnimation2 == null || (animate2 = deferredAnimation2.animate(new x00.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            @Override // x00.l
            public final FiniteAnimationSpec<IntOffset> invoke(Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                springSpec = EnterExitTransitionKt.DefaultOffsetAnimationSpec;
                return springSpec;
            }
        }, new x00.l<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m5234boximpl(m98invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m98invokeBjo55l4(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.m96targetOffsetByStateoFUgxo0(enterExitState, j12);
            }
        })) == null) ? IntOffset.Companion.m5254getZeronOccac() : animate2.getValue().m5252unboximpl();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        long m5254getZeronOccac2 = (deferredAnimation3 == null || (animate = deferredAnimation3.animate(this.slideSpec, new x00.l<EnterExitState, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
                return IntOffset.m5234boximpl(m99invokeBjo55l4(enterExitState));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m99invokeBjo55l4(EnterExitState enterExitState) {
                return EnterExitTransitionModifierNode.this.m95slideTargetValueByStateoFUgxo0(enterExitState, j12);
            }
        })) == null) ? IntOffset.Companion.m5254getZeronOccac() : animate.getValue().m5252unboximpl();
        Alignment alignment2 = this.currentAlignment;
        final long m5247plusqkQi6aY = IntOffset.m5247plusqkQi6aY(alignment2 != null ? alignment2.mo2085alignKFBX0sM(j12, m5082constrain4WqzIAM, LayoutDirection.Ltr) : IntOffset.Companion.m5254getZeronOccac(), m5254getZeronOccac2);
        final long j13 = m5254getZeronOccac;
        return MeasureScope.layout$default(measureScope, (int) (m5082constrain4WqzIAM >> 32), (int) (m5082constrain4WqzIAM & 4294967295L), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                placementScope.placeWithLayer(Placeable.this, IntOffset.m5243getXimpl(j13) + IntOffset.m5243getXimpl(m5247plusqkQi6aY), IntOffset.m5244getYimpl(j13) + IntOffset.m5244getYimpl(m5247plusqkQi6aY), 0.0f, init);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    public final void setCurrentAlignment(@l Alignment alignment) {
        this.currentAlignment = alignment;
    }

    public final void setEnabled(@k x00.a<Boolean> aVar) {
        this.isEnabled = aVar;
    }

    public final void setEnter(@k EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(@k ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(@k GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setOffsetAnimation(@l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(@l Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(@l Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final void setTransition(@k Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m94sizeByStateUzc_VyU(@k EnterExitState enterExitState, long j11) {
        x00.l<IntSize, IntSize> size;
        x00.l<IntSize, IntSize> size2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                ChangeSize changeSize = this.enter.getData$animation().getChangeSize();
                if (changeSize != null && (size = changeSize.getSize()) != null) {
                    return size.invoke(IntSize.m5278boximpl(j11)).m5290unboximpl();
                }
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ChangeSize changeSize2 = this.exit.getData$animation().getChangeSize();
                if (changeSize2 != null && (size2 = changeSize2.getSize()) != null) {
                    return size2.invoke(IntSize.m5278boximpl(j11)).m5290unboximpl();
                }
            }
        }
        return j11;
    }

    /* renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m95slideTargetValueByStateoFUgxo0(@k EnterExitState enterExitState, long j11) {
        x00.l<IntSize, IntOffset> slideOffset;
        x00.l<IntSize, IntOffset> slideOffset2;
        Slide slide = this.enter.getData$animation().getSlide();
        long m5254getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.Companion.m5254getZeronOccac() : slideOffset2.invoke(IntSize.m5278boximpl(j11)).m5252unboximpl();
        Slide slide2 = this.exit.getData$animation().getSlide();
        long m5254getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.Companion.m5254getZeronOccac() : slideOffset.invoke(IntSize.m5278boximpl(j11)).m5252unboximpl();
        int i11 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i11 == 1) {
            return IntOffset.Companion.m5254getZeronOccac();
        }
        if (i11 == 2) {
            return m5254getZeronOccac;
        }
        if (i11 == 3) {
            return m5254getZeronOccac2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m96targetOffsetByStateoFUgxo0(@k EnterExitState enterExitState, long j11) {
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m5254getZeronOccac();
        }
        if (getAlignment() == null) {
            return IntOffset.Companion.m5254getZeronOccac();
        }
        if (g0.g(this.currentAlignment, getAlignment())) {
            return IntOffset.Companion.m5254getZeronOccac();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i11 == 1) {
            return IntOffset.Companion.m5254getZeronOccac();
        }
        if (i11 == 2) {
            return IntOffset.Companion.m5254getZeronOccac();
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChangeSize changeSize = this.exit.getData$animation().getChangeSize();
        if (changeSize == null) {
            return IntOffset.Companion.m5254getZeronOccac();
        }
        long m5290unboximpl = changeSize.getSize().invoke(IntSize.m5278boximpl(j11)).m5290unboximpl();
        Alignment alignment = getAlignment();
        g0.m(alignment);
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        long mo2085alignKFBX0sM = alignment.mo2085alignKFBX0sM(j11, m5290unboximpl, layoutDirection);
        Alignment alignment2 = this.currentAlignment;
        g0.m(alignment2);
        return IntOffset.m5246minusqkQi6aY(mo2085alignKFBX0sM, alignment2.mo2085alignKFBX0sM(j11, m5290unboximpl, layoutDirection));
    }
}
