package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,958:1\n1#2:959\n85#3:960\n113#3,2:961\n85#3:975\n113#3,2:976\n1247#4,6:963\n1247#4,6:969\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n546#1:960\n546#1:961,2\n558#1:975\n558#1:976,2\n558#1:963,6\n571#1:969,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;

    @l
    private State<IntSize> animatedSize;

    @k
    private Alignment contentAlignment;

    @k
    private LayoutDirection layoutDirection;

    @k
    private final MutableState measuredSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.Companion.m5291getZeroYbymL2g()), null, 2, null);

    @k
    private final MutableScatterMap<S, State<IntSize>> targetSizeMap = ScatterMapKt.mutableScatterMapOf();

    @k
    private final Transition<S> transition;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {

        @k
        private final AnimatedContentTransitionScopeImpl<S> scope;

        @l
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

        @k
        private final State<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(@l Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @k State<? extends SizeTransform> state, @k AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@l Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return g0.g(sizeModifierElement.sizeAnimation, this.sizeAnimation) && g0.g(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        @k
        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        @l
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        @k
        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            int hashCode = this.scope.hashCode() * 31;
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            return ((hashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@k InspectorInfo inspectorInfo) {
            inspectorInfo.setName("sizeTransform");
            inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
            inspectorInfo.getProperties().set("sizeTransform", this.sizeTransform);
            inspectorInfo.getProperties().set("scope", this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        @k
        public SizeModifierNode<S> create() {
            return new SizeModifierNode<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(@k SizeModifierNode<S> sizeModifierNode) {
            sizeModifierNode.setSizeAnimation(this.sizeAnimation);
            sizeModifierNode.setSizeTransform(this.sizeTransform);
            sizeModifierNode.setScope(this.scope);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,958:1\n30#2:959\n30#2:961\n30#2:963\n30#2:965\n80#3:960\n80#3:962\n80#3:964\n80#3:966\n85#3:968\n90#3:970\n54#4:967\n59#4:969\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n*L\n657#1:959\n660#1:961\n661#1:963\n663#1:965\n657#1:960\n660#1:962\n661#1:964\n663#1:966\n689#1:968\n689#1:970\n689#1:967\n689#1:969\n*E\n"})
    public static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        private long lastSize;

        @k
        private AnimatedContentTransitionScopeImpl<S> scope;

        @l
        private Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

        @k
        private State<? extends SizeTransform> sizeTransform;

        public SizeModifierNode(@l Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @k State<? extends SizeTransform> state, @k AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            long j11;
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
            j11 = AnimatedContentKt.UnspecifiedSize;
            this.lastSize = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        public final long m60lastContinuousSizeOrDefaultmzRDjE0(long j11) {
            long j12;
            long j13 = this.lastSize;
            j12 = AnimatedContentKt.UnspecifiedSize;
            return IntSize.m5284equalsimpl0(j13, j12) ? j11 : this.lastSize;
        }

        @k
        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        @l
        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        @k
        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        @k
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
            final long m5290unboximpl;
            final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
            if (measureScope.isLookingAhead()) {
                m5290unboximpl = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
            } else if (this.sizeAnimation == null) {
                m5290unboximpl = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
                this.lastSize = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
            } else {
                final long m5281constructorimpl = IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L));
                Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
                g0.m(deferredAnimation);
                State<IntSize> animate = deferredAnimation.animate(new x00.l<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // x00.l
                    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
                        long m5290unboximpl2;
                        FiniteAnimationSpec<IntSize> mo122createAnimationSpecTemP2vQ;
                        if (g0.g(segment.getInitialState(), this.this$0.getScope().getInitialState())) {
                            m5290unboximpl2 = this.this$0.m60lastContinuousSizeOrDefaultmzRDjE0(m5281constructorimpl);
                        } else {
                            State<IntSize> state = this.this$0.getScope().getTargetSizeMap$animation().get(segment.getInitialState());
                            m5290unboximpl2 = state != null ? state.getValue().m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g();
                        }
                        State<IntSize> state2 = this.this$0.getScope().getTargetSizeMap$animation().get(segment.getTargetState());
                        long m5290unboximpl3 = state2 != null ? state2.getValue().m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g();
                        SizeTransform value = this.this$0.getSizeTransform().getValue();
                        return (value == null || (mo122createAnimationSpecTemP2vQ = value.mo122createAnimationSpecTemP2vQ(m5290unboximpl2, m5290unboximpl3)) == null) ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : mo122createAnimationSpecTemP2vQ;
                    }
                }, new x00.l<S, IntSize>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // x00.l
                    public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
                        return IntSize.m5278boximpl(m62invokeYEO4UFw(obj));
                    }

                    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
                    public final long m62invokeYEO4UFw(S s11) {
                        long m60lastContinuousSizeOrDefaultmzRDjE0;
                        if (g0.g(s11, this.this$0.getScope().getInitialState())) {
                            m60lastContinuousSizeOrDefaultmzRDjE0 = this.this$0.m60lastContinuousSizeOrDefaultmzRDjE0(m5281constructorimpl);
                            return m60lastContinuousSizeOrDefaultmzRDjE0;
                        }
                        State<IntSize> state = this.this$0.getScope().getTargetSizeMap$animation().get(s11);
                        return state != null ? state.getValue().m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g();
                    }
                });
                this.scope.setAnimatedSize$animation(animate);
                m5290unboximpl = animate.getValue().m5290unboximpl();
                this.lastSize = animate.getValue().m5290unboximpl();
            }
            return MeasureScope.layout$default(measureScope, (int) (m5290unboximpl >> 32), (int) (m5290unboximpl & 4294967295L), null, new x00.l<Placeable.PlacementScope, g2>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.m3921place70tqf50$default(placementScope, mo3857measureBRTryo0, this.this$0.getScope().getContentAlignment().mo2085alignKFBX0sM(IntSize.m5281constructorimpl((mo3857measureBRTryo0.getWidth() << 32) | (mo3857measureBRTryo0.getHeight() & 4294967295L)), m5290unboximpl, LayoutDirection.Ltr), 0.0f, 2, null);
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onReset() {
            long j11;
            super.onReset();
            j11 = AnimatedContentKt.UnspecifiedSize;
            this.lastSize = j11;
        }

        public final void setScope(@k AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void setSizeAnimation(@l Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
            this.sizeAnimation = deferredAnimation;
        }

        public final void setSizeTransform(@k State<? extends SizeTransform> state) {
            this.sizeTransform = state;
        }
    }

    public AnimatedContentTransitionScopeImpl(@k Transition<S> transition, @k Alignment alignment, @k LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m53calculateOffsetemnUabE(long j11, long j12) {
        return getContentAlignment().mo2085alignKFBX0sM(j11, j12, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m54getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m5290unboximpl() : m57getMeasuredSizeYbymL2g$animation();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m55isLeftgWo6LJ4(int i11) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m47getLeftDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m49getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m46getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m56isRightgWo6LJ4(int i11) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m48getRightDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m49getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m46getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    @Composable
    @k
    public final Modifier createSizeAnimationModifier$animation(@k ContentTransform contentTransform, @l Composer composer, int i11) {
        Modifier modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i11, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
        }
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        Transition.DeferredAnimation deferredAnimation = null;
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (g0.g(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            composer.startReplaceGroup(249676467);
            deferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 0, 2);
            boolean changed2 = composer.changed(deferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                rememberedValue2 = (sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.Companion) : Modifier.Companion;
                composer.updateRememberedValue(rememberedValue2);
            }
            modifier = (Modifier) rememberedValue2;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(249942509);
            composer.endReplaceGroup();
            this.animatedSize = null;
            modifier = Modifier.Companion;
        }
        Modifier then = modifier.then(new SizeModifierElement(deferredAnimation, rememberUpdatedState, this));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return then;
    }

    @l
    public final State<IntSize> getAnimatedSize$animation() {
        return this.animatedSize;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @k
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @k
    public final LayoutDirection getLayoutDirection$animation() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation, reason: not valid java name */
    public final long m57getMeasuredSizeYbymL2g$animation() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m5290unboximpl();
    }

    @k
    public final MutableScatterMap<S, State<IntSize>> getTargetSizeMap$animation() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @k
    public final Transition<S> getTransition$animation() {
        return this.transition;
    }

    public final void setAnimatedSize$animation(@l State<IntSize> state) {
        this.animatedSize = state;
    }

    public void setContentAlignment(@k Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation(@k LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation, reason: not valid java name */
    public final void m58setMeasuredSizeozmzZPI$animation(long j11) {
        this.measuredSize$delegate.setValue(IntSize.m5278boximpl(j11));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @k
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo36slideIntoContainermOhB8PU(int i11, @k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k final x00.l<? super Integer, Integer> lVar) {
        if (m55isLeftgWo6LJ4(i11)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new x00.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i12) {
                    long m54getCurrentSizeYbymL2g;
                    long m54getCurrentSizeYbymL2g2;
                    long m53calculateOffsetemnUabE;
                    x00.l<Integer, Integer> lVar2 = lVar;
                    m54getCurrentSizeYbymL2g = this.m54getCurrentSizeYbymL2g();
                    AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                    long j11 = i12;
                    long m5281constructorimpl = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
                    m54getCurrentSizeYbymL2g2 = this.m54getCurrentSizeYbymL2g();
                    m53calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m53calculateOffsetemnUabE(m5281constructorimpl, m54getCurrentSizeYbymL2g2);
                    return lVar2.invoke(Integer.valueOf(((int) (m54getCurrentSizeYbymL2g >> 32)) - IntOffset.m5243getXimpl(m53calculateOffsetemnUabE)));
                }
            });
        }
        if (m56isRightgWo6LJ4(i11)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new x00.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i12) {
                    long m54getCurrentSizeYbymL2g;
                    long m53calculateOffsetemnUabE;
                    x00.l<Integer, Integer> lVar2 = lVar;
                    AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                    long j11 = i12;
                    long m5281constructorimpl = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
                    m54getCurrentSizeYbymL2g = this.m54getCurrentSizeYbymL2g();
                    m53calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m53calculateOffsetemnUabE(m5281constructorimpl, m54getCurrentSizeYbymL2g);
                    return lVar2.invoke(Integer.valueOf((-IntOffset.m5243getXimpl(m53calculateOffsetemnUabE)) - i12));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        return AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m50getUpDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new x00.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i12) {
                long m54getCurrentSizeYbymL2g;
                long m54getCurrentSizeYbymL2g2;
                long m53calculateOffsetemnUabE;
                x00.l<Integer, Integer> lVar2 = lVar;
                m54getCurrentSizeYbymL2g = this.m54getCurrentSizeYbymL2g();
                AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                long j11 = i12;
                long m5281constructorimpl = IntSize.m5281constructorimpl((4294967295L & j11) | (j11 << 32));
                m54getCurrentSizeYbymL2g2 = this.m54getCurrentSizeYbymL2g();
                m53calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m53calculateOffsetemnUabE(m5281constructorimpl, m54getCurrentSizeYbymL2g2);
                return lVar2.invoke(Integer.valueOf(((int) (m54getCurrentSizeYbymL2g & 4294967295L)) - IntOffset.m5244getYimpl(m53calculateOffsetemnUabE)));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m45getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new x00.l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i12) {
                long m54getCurrentSizeYbymL2g;
                long m53calculateOffsetemnUabE;
                x00.l<Integer, Integer> lVar2 = lVar;
                AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this;
                long j11 = i12;
                long m5281constructorimpl = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
                m54getCurrentSizeYbymL2g = this.m54getCurrentSizeYbymL2g();
                m53calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m53calculateOffsetemnUabE(m5281constructorimpl, m54getCurrentSizeYbymL2g);
                return lVar2.invoke(Integer.valueOf((-IntOffset.m5244getYimpl(m53calculateOffsetemnUabE)) - i12));
            }
        }) : EnterTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @k
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo37slideOutOfContainermOhB8PU(int i11, @k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k final x00.l<? super Integer, Integer> lVar) {
        if (m55isLeftgWo6LJ4(i11)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new x00.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i12) {
                    long m53calculateOffsetemnUabE;
                    State state = (State) this.this$0.getTargetSizeMap$animation().get(this.this$0.getTransition$animation().getTargetState());
                    long m5290unboximpl = state != null ? ((IntSize) state.getValue()).m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g();
                    x00.l<Integer, Integer> lVar2 = lVar;
                    long j11 = i12;
                    m53calculateOffsetemnUabE = this.this$0.m53calculateOffsetemnUabE(IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32)), m5290unboximpl);
                    return lVar2.invoke(Integer.valueOf((-IntOffset.m5243getXimpl(m53calculateOffsetemnUabE)) - i12));
                }
            });
        }
        if (m56isRightgWo6LJ4(i11)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new x00.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Integer invoke(int i12) {
                    long m53calculateOffsetemnUabE;
                    State state = (State) this.this$0.getTargetSizeMap$animation().get(this.this$0.getTransition$animation().getTargetState());
                    long m5290unboximpl = state != null ? ((IntSize) state.getValue()).m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g();
                    x00.l<Integer, Integer> lVar2 = lVar;
                    long j11 = i12;
                    m53calculateOffsetemnUabE = this.this$0.m53calculateOffsetemnUabE(IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32)), m5290unboximpl);
                    return lVar2.invoke(Integer.valueOf((-IntOffset.m5243getXimpl(m53calculateOffsetemnUabE)) + ((int) (m5290unboximpl >> 32))));
                }
            });
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        return AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m50getUpDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new x00.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i12) {
                long m53calculateOffsetemnUabE;
                State state = (State) this.this$0.getTargetSizeMap$animation().get(this.this$0.getTransition$animation().getTargetState());
                long m5290unboximpl = state != null ? ((IntSize) state.getValue()).m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g();
                x00.l<Integer, Integer> lVar2 = lVar;
                long j11 = i12;
                m53calculateOffsetemnUabE = this.this$0.m53calculateOffsetemnUabE(IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32)), m5290unboximpl);
                return lVar2.invoke(Integer.valueOf((-IntOffset.m5244getYimpl(m53calculateOffsetemnUabE)) - i12));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m41equalsimpl0(i11, companion.m45getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new x00.l<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i12) {
                long m53calculateOffsetemnUabE;
                State state = (State) this.this$0.getTargetSizeMap$animation().get(this.this$0.getTransition$animation().getTargetState());
                long m5290unboximpl = state != null ? ((IntSize) state.getValue()).m5290unboximpl() : IntSize.Companion.m5291getZeroYbymL2g();
                x00.l<Integer, Integer> lVar2 = lVar;
                long j11 = i12;
                m53calculateOffsetemnUabE = this.this$0.m53calculateOffsetemnUabE(IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32)), m5290unboximpl);
                return lVar2.invoke(Integer.valueOf((-IntOffset.m5244getYimpl(m53calculateOffsetemnUabE)) + ((int) (m5290unboximpl & 4294967295L))));
            }
        }) : ExitTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    @k
    public ContentTransform using(@k ContentTransform contentTransform, @l SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation(sizeTransform);
        return contentTransform;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,958:1\n85#2:959\n113#2,2:960\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n*L\n592#1:959\n592#1:960,2\n*E\n"})
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;

        @k
        private final MutableState isTarget$delegate;

        public ChildData(boolean z11) {
            this.isTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isTarget() {
            return ((Boolean) this.isTarget$delegate.getValue()).booleanValue();
        }

        public final void setTarget(boolean z11) {
            this.isTarget$delegate.setValue(Boolean.valueOf(z11));
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        @k
        public Object modifyParentData(@k Density density, @l Object obj) {
            return this;
        }
    }
}
