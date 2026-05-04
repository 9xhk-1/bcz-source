package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,247:1\n79#2:248\n112#2,2:249\n85#3:251\n113#3,2:252\n85#3:254\n113#3,2:255\n85#3:257\n113#3,2:258\n85#3:260\n113#3,2:261\n85#3:263\n113#3,2:264\n85#3:266\n113#3,2:267\n85#3:269\n113#3,2:270\n85#3:312\n113#3,2:313\n1#4:272\n71#5:273\n65#5:274\n73#5:277\n69#5:278\n60#6:275\n70#6:279\n22#7:276\n221#8,5:280\n249#8,9:285\n120#8,7:294\n259#8,4:301\n120#8,7:305\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n*L\n174#1:248\n174#1:249,2\n176#1:251\n176#1:252,2\n177#1:254\n177#1:255,2\n178#1:257\n178#1:258,2\n179#1:260\n179#1:261,2\n180#1:263\n180#1:264,2\n181#1:266\n181#1:267,2\n182#1:269\n182#1:270,2\n223#1:312\n223#1:313,2\n194#1:273\n194#1:274\n194#1:277\n194#1:278\n194#1:275\n194#1:279\n194#1:276\n195#1:280,5\n195#1:285,9\n195#1:294,7\n195#1:301,4\n196#1:305,7\n*E\n"})
/* loaded from: classes.dex */
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {
    public static final int $stable = 8;

    @k
    private final MutableState boundsAnimation$delegate;

    @l
    private Path clipPathInOverlay;
    private boolean firstFrameDrawn;

    @k
    private final MutableState overlayClip$delegate;

    @l
    private SharedElementInternalState parentState;

    @k
    private final MutableState placeHolderSize$delegate;

    @k
    private final MutableState renderInOverlayDuringTransition$delegate;

    @k
    private final MutableState renderOnlyWhenVisible$delegate;

    @k
    private final MutableState sharedElement$delegate;

    @k
    private final MutableState userState$delegate;

    @k
    private final MutableFloatState zIndex$delegate;

    @k
    private x00.a<? extends LayoutCoordinates> lookaheadCoords = new x00.a() { // from class: androidx.compose.animation.SharedElementInternalState$lookaheadCoords$1
        @Override // x00.a
        public final Void invoke() {
            return null;
        }
    };

    @k
    private final MutableState layer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public SharedElementInternalState(@k SharedElement sharedElement, @k BoundsAnimation boundsAnimation, @k SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z11, @k SharedTransitionScope.OverlayClip overlayClip, boolean z12, @k SharedTransitionScope.SharedContentState sharedContentState, float f11) {
        this.zIndex$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
        this.renderInOverlayDuringTransition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z12), null, 2, null);
        this.sharedElement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedElement, null, 2, null);
        this.boundsAnimation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsAnimation, null, 2, null);
        this.placeHolderSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(placeHolderSize, null, 2, null);
        this.renderOnlyWhenVisible$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z11), null, 2, null);
        this.overlayClip$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(overlayClip, null, 2, null);
        this.userState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentState, null, 2, null);
    }

    private final boolean getShouldRenderBasedOnTarget() {
        return g0.g(getSharedElement().getTargetBoundsProvider$animation(), this) || !getRenderOnlyWhenVisible();
    }

    /* renamed from: calculateLookaheadOffset-F1C5BW0, reason: not valid java name */
    public final long m106calculateLookaheadOffsetF1C5BW0() {
        LayoutCoordinates invoke = this.lookaheadCoords.invoke();
        if (invoke == null) {
            throw new IllegalArgumentException("Error: lookahead coordinates is null.");
        }
        return getSharedElement().getScope().getLookaheadRoot$animation().mo3866localPositionOfR5De75A(invoke, Offset.Companion.m2284getZeroF1C5BW0());
    }

    @Override // androidx.compose.animation.LayerRenderer
    public void drawInOverlay(@k DrawScope drawScope) {
        GraphicsLayer layer = getLayer();
        if (layer != null && this.firstFrameDrawn && getShouldRenderInOverlay$animation()) {
            if (getSharedElement().getCurrentBounds() == null) {
                throw new IllegalArgumentException("Error: current bounds not set yet.");
            }
            Rect currentBounds = getSharedElement().getCurrentBounds();
            g2 g2Var = null;
            Offset m2257boximpl = currentBounds != null ? Offset.m2257boximpl(currentBounds.m2303getTopLeftF1C5BW0()) : null;
            g0.m(m2257boximpl);
            long m2278unboximpl = m2257boximpl.m2278unboximpl();
            float intBitsToFloat = Float.intBitsToFloat((int) (m2278unboximpl >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (m2278unboximpl & 4294967295L));
            Path path = this.clipPathInOverlay;
            if (path != null) {
                int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo2983clipPathmtrdDE(path, m2498getIntersectrtfAjoo);
                    drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                    try {
                        GraphicsLayerKt.drawLayer(drawScope, layer);
                        drawContext.getCanvas().restore();
                        drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                        g2Var = g2.f100423a;
                    } finally {
                    }
                } catch (Throwable th2) {
                    drawContext.getCanvas().restore();
                    drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                    throw th2;
                }
            }
            if (g2Var == null) {
                drawScope.getDrawContext().getTransform().translate(intBitsToFloat, intBitsToFloat2);
                try {
                    GraphicsLayerKt.drawLayer(drawScope, layer);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final BoundsAnimation getBoundsAnimation() {
        return (BoundsAnimation) this.boundsAnimation$delegate.getValue();
    }

    @l
    public final Path getClipPathInOverlay$animation() {
        return this.clipPathInOverlay;
    }

    public final boolean getFirstFrameDrawn$animation() {
        return this.firstFrameDrawn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final GraphicsLayer getLayer() {
        return (GraphicsLayer) this.layer$delegate.getValue();
    }

    @k
    public final x00.a<LayoutCoordinates> getLookaheadCoords() {
        return this.lookaheadCoords;
    }

    /* renamed from: getNonNullLookaheadSize-NH-jbRc, reason: not valid java name */
    public final long m107getNonNullLookaheadSizeNHjbRc() {
        LayoutCoordinates invoke = this.lookaheadCoords.invoke();
        if (invoke != null) {
            return IntSizeKt.m5298toSizeozmzZPI(invoke.mo3865getSizeYbymL2g());
        }
        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + getSharedElement().getKey() + '.').toString());
    }

    @k
    public final SharedTransitionScope.OverlayClip getOverlayClip() {
        return (SharedTransitionScope.OverlayClip) this.overlayClip$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    @l
    public SharedElementInternalState getParentState() {
        return this.parentState;
    }

    @k
    public final SharedTransitionScope.PlaceHolderSize getPlaceHolderSize() {
        return (SharedTransitionScope.PlaceHolderSize) this.placeHolderSize$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderInOverlayDuringTransition() {
        return ((Boolean) this.renderInOverlayDuringTransition$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRenderOnlyWhenVisible() {
        return ((Boolean) this.renderOnlyWhenVisible$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final SharedElement getSharedElement() {
        return (SharedElement) this.sharedElement$delegate.getValue();
    }

    public final boolean getShouldRenderInOverlay$animation() {
        return getShouldRenderBasedOnTarget() && getSharedElement().getFoundMatch() && getRenderInOverlayDuringTransition();
    }

    public final boolean getShouldRenderInPlace() {
        if (getSharedElement().getFoundMatch()) {
            return !getShouldRenderInOverlay$animation() && getShouldRenderBasedOnTarget();
        }
        return true;
    }

    public final boolean getTarget() {
        return getBoundsAnimation().getTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final SharedTransitionScope.SharedContentState getUserState() {
        return (SharedTransitionScope.SharedContentState) this.userState$delegate.getValue();
    }

    @Override // androidx.compose.animation.LayerRenderer
    public float getZIndex() {
        return this.zIndex$delegate.getFloatValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        getSharedElement().getScope().onStateRemoved$animation(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        getSharedElement().getScope().onStateAdded$animation(this);
        getSharedElement().updateTargetBoundsProvider();
    }

    public final void setBoundsAnimation(@k BoundsAnimation boundsAnimation) {
        this.boundsAnimation$delegate.setValue(boundsAnimation);
    }

    public final void setClipPathInOverlay$animation(@l Path path) {
        this.clipPathInOverlay = path;
    }

    public final void setFirstFrameDrawn$animation(boolean z11) {
        this.firstFrameDrawn = z11;
    }

    public final void setLayer(@l GraphicsLayer graphicsLayer) {
        this.layer$delegate.setValue(graphicsLayer);
    }

    public final void setLookaheadCoords(@k x00.a<? extends LayoutCoordinates> aVar) {
        this.lookaheadCoords = aVar;
    }

    public final void setOverlayClip(@k SharedTransitionScope.OverlayClip overlayClip) {
        this.overlayClip$delegate.setValue(overlayClip);
    }

    public void setParentState(@l SharedElementInternalState sharedElementInternalState) {
        this.parentState = sharedElementInternalState;
    }

    public final void setPlaceHolderSize(@k SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.placeHolderSize$delegate.setValue(placeHolderSize);
    }

    public final void setRenderInOverlayDuringTransition(boolean z11) {
        this.renderInOverlayDuringTransition$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setRenderOnlyWhenVisible(boolean z11) {
        this.renderOnlyWhenVisible$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setSharedElement(@k SharedElement sharedElement) {
        this.sharedElement$delegate.setValue(sharedElement);
    }

    public final void setUserState(@k SharedTransitionScope.SharedContentState sharedContentState) {
        this.userState$delegate.setValue(sharedContentState);
    }

    public void setZIndex(float f11) {
        this.zIndex$delegate.setFloatValue(f11);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
