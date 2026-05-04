package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import c40.r0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.z;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyLayoutItemAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,281:1\n85#2:282\n113#2,2:283\n85#2:285\n113#2,2:286\n85#2:288\n113#2,2:289\n85#2:291\n113#2,2:292\n85#2:294\n113#2,2:295\n1#3:297\n32#4:298\n80#5:299\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation\n*L\n57#1:282\n57#1:283,2\n61#1:285\n61#1:286,2\n65#1:288\n65#1:289,2\n69#1:291\n69#1:292,2\n99#1:294\n99#1:295,2\n239#1:298\n239#1:299\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation {
    private static final long NotInitialized;

    @k
    private final r0 coroutineScope;

    @l
    private FiniteAnimationSpec<Float> fadeInSpec;

    @l
    private FiniteAnimationSpec<Float> fadeOutSpec;
    private long finalOffset;

    @l
    private final GraphicsContext graphicsContext;

    @k
    private final MutableState isAppearanceAnimationInProgress$delegate;

    @k
    private final MutableState isDisappearanceAnimationFinished$delegate;

    @k
    private final MutableState isDisappearanceAnimationInProgress$delegate;

    @k
    private final MutableState isPlacementAnimationInProgress$delegate;
    private boolean isRunningMovingAwayAnimation;

    @l
    private GraphicsLayer layer;
    private long lookaheadOffset;

    @k
    private final x00.a<g2> onLayerPropertyChanged;

    @k
    private final MutableState placementDelta$delegate;

    @k
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;

    @l
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;

    @k
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m893getNotInitializednOccac() {
            return LazyLayoutItemAnimation.NotInitialized;
        }

        private Companion() {
        }
    }

    static {
        long j11 = Integer.MAX_VALUE;
        NotInitialized = IntOffset.m5237constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    public LazyLayoutItemAnimation(@k r0 r0Var, @l GraphicsContext graphicsContext, @k x00.a<g2> aVar) {
        this.coroutineScope = r0Var;
        this.graphicsContext = graphicsContext;
        this.onLayerPropertyChanged = aVar;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        long j11 = NotInitialized;
        this.rawOffset = j11;
        IntOffset.Companion companion = IntOffset.Companion;
        this.finalOffset = companion.m5254getZeronOccac();
        this.layer = graphicsContext != null ? graphicsContext.createGraphicsLayer() : null;
        String str = null;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m5234boximpl(companion.m5254getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, str, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(z.f67060a), str, null, 12, null);
        this.placementDelta$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m5234boximpl(companion.m5254getZeronOccac()), null, 2, null);
        this.lookaheadOffset = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearanceAnimationInProgress(boolean z11) {
        this.isAppearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationFinished(boolean z11) {
        this.isDisappearanceAnimationFinished$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationInProgress(boolean z11) {
        this.isDisappearanceAnimationInProgress$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlacementAnimationInProgress(boolean z11) {
        this.isPlacementAnimationInProgress$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m884setPlacementDeltagyyYBs(long j11) {
        this.placementDelta$delegate.setValue(IntOffset.m5234boximpl(j11));
    }

    public final void animateAppearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null || graphicsLayer == null) {
            if (isDisappearanceAnimationInProgress()) {
                if (graphicsLayer != null) {
                    graphicsLayer.setAlpha(1.0f);
                }
                c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3, null);
                return;
            }
            return;
        }
        setAppearanceAnimationInProgress(true);
        boolean isDisappearanceAnimationInProgress = isDisappearanceAnimationInProgress();
        boolean z11 = !isDisappearanceAnimationInProgress;
        if (!isDisappearanceAnimationInProgress) {
            graphicsLayer.setAlpha(0.0f);
        }
        c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z11, this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    public final void animateDisappearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeOutSpec;
        if (graphicsLayer == null || isDisappearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setDisappearanceAnimationInProgress(true);
        c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animateDisappearance$1(this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    /* renamed from: animatePlacementDelta-ar5cAso, reason: not valid java name */
    public final void m885animatePlacementDeltaar5cAso(long j11, boolean z11) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long m5246minusqkQi6aY = IntOffset.m5246minusqkQi6aY(m888getPlacementDeltanOccac(), j11);
        m884setPlacementDeltagyyYBs(m5246minusqkQi6aY);
        setPlacementAnimationInProgress(true);
        this.isRunningMovingAwayAnimation = z11;
        c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, m5246minusqkQi6aY, null), 3, null);
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }

    @l
    public final FiniteAnimationSpec<Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    @l
    public final FiniteAnimationSpec<Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    /* renamed from: getFinalOffset-nOcc-ac, reason: not valid java name */
    public final long m886getFinalOffsetnOccac() {
        return this.finalOffset;
    }

    @l
    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: not valid java name */
    public final long m887getLookaheadOffsetnOccac() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m888getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta$delegate.getValue()).m5252unboximpl();
    }

    @l
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name */
    public final long m889getRawOffsetnOccac() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationFinished() {
        return ((Boolean) this.isDisappearanceAnimationFinished$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationInProgress() {
        return ((Boolean) this.isDisappearanceAnimationInProgress$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress$delegate.getValue()).booleanValue();
    }

    public final boolean isRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void release() {
        GraphicsContext graphicsContext;
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3, null);
        }
        if (isDisappearanceAnimationInProgress()) {
            setDisappearanceAnimationInProgress(false);
            c40.k.f(this.coroutineScope, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        m884setPlacementDeltagyyYBs(IntOffset.Companion.m5254getZeronOccac());
        this.rawOffset = NotInitialized;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (graphicsContext = this.graphicsContext) != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }

    public final void setFadeInSpec(@l FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final void setFadeOutSpec(@l FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    /* renamed from: setFinalOffset--gyyYBs, reason: not valid java name */
    public final void m890setFinalOffsetgyyYBs(long j11) {
        this.finalOffset = j11;
    }

    /* renamed from: setLookaheadOffset--gyyYBs, reason: not valid java name */
    public final void m891setLookaheadOffsetgyyYBs(long j11) {
        this.lookaheadOffset = j11;
    }

    public final void setPlacementSpec(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m892setRawOffsetgyyYBs(long j11) {
        this.rawOffset = j11;
    }

    public /* synthetic */ LazyLayoutItemAnimation(r0 r0Var, GraphicsContext graphicsContext, x00.a aVar, int i11, v vVar) {
        this(r0Var, (i11 & 2) != 0 ? null : graphicsContext, (i11 & 4) != 0 ? new x00.a<g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        } : aVar);
    }
}
