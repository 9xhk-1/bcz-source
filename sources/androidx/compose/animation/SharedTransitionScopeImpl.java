package androidx.compose.animation;

import a00.l0;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c40.r0;
import com.baicizhan.client.business.dataset.provider.a;
import e00.g;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalSharedTransitionApi
@u0({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1221:1\n85#2:1222\n113#2,2:1223\n1247#3,6:1225\n1247#3,6:1308\n385#4:1231\n357#4,4:1232\n329#4,6:1236\n339#4,3:1243\n342#4,9:1247\n361#4:1256\n386#4:1257\n357#4,4:1258\n329#4,6:1262\n339#4,3:1269\n342#4,9:1273\n361#4:1282\n357#4,4:1283\n329#4,6:1287\n339#4,3:1294\n342#4,9:1298\n361#4:1307\n1399#5:1242\n1270#5:1246\n1399#5:1268\n1270#5:1272\n1399#5:1293\n1270#5:1297\n1#6:1314\n1002#7,2:1315\n350#7,7:1323\n34#8,6:1317\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n673#1:1222\n673#1:1223,2\n875#1:1225,6\n992#1:1308,6\n887#1:1231\n887#1:1232,4\n887#1:1236,6\n887#1:1243,3\n887#1:1247,9\n887#1:1256\n887#1:1257\n891#1:1258,4\n891#1:1262,6\n891#1:1269,3\n891#1:1273,9\n891#1:1282\n894#1:1283,4\n894#1:1287,6\n894#1:1294,3\n894#1:1298,9\n894#1:1307\n887#1:1242\n887#1:1246\n891#1:1268\n891#1:1272\n894#1:1293\n894#1:1297\n1040#1:1315,2\n1070#1:1323,7\n1045#1:1317,6\n*E\n"})
@Stable
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final c0<SnapshotStateObserver> SharedTransitionObserver$delegate = e0.b(LazyThreadSafetyMode.NONE, new x00.a<SnapshotStateObserver>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l<x00.a<? extends g2>, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.1
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(x00.a<? extends g2> aVar) {
                    invoke2((x00.a<g2>) aVar);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(x00.a<g2> aVar) {
                    aVar.invoke();
                }
            });
            snapshotStateObserver.start();
            return snapshotStateObserver;
        }
    });
    private final /* synthetic */ LookaheadScope $$delegate_0;

    @k
    private final r0 coroutineScope;
    private boolean disposed;

    @m80.l
    private LayoutCoordinates nullableLookaheadRoot;
    public LayoutCoordinates root;

    @k
    private final MutableState isTransitionActive$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @k
    private final x00.a<g2> observeAnimatingBlock = new x00.a<g2>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableScatterMap mutableScatterMap;
            mutableScatterMap = SharedTransitionScopeImpl.this.sharedElements;
            Object[] objArr = mutableScatterMap.keys;
            Object[] objArr2 = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            if (((SharedElement) objArr2[i14]).isAnimating()) {
                                return;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }
    };

    @k
    private final l<SharedTransitionScope, g2> updateTransitionActiveness = new l<SharedTransitionScope, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$updateTransitionActiveness$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(SharedTransitionScope sharedTransitionScope) {
            invoke2(sharedTransitionScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SharedTransitionScope sharedTransitionScope) {
            SharedTransitionScopeImpl.this.updateTransitionActiveness();
        }
    };

    @k
    private final SnapshotStateList<LayerRenderer> renderers = SnapshotStateKt.mutableStateListOf();

    @k
    private final MutableScatterMap<Object, SharedElement> sharedElements = new MutableScatterMap<>(0, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SnapshotStateObserver getSharedTransitionObserver() {
            return (SnapshotStateObserver) SharedTransitionScopeImpl.SharedTransitionObserver$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {

        @k
        private final Shape clipShape;

        @k
        private final Path path = AndroidPath_androidKt.Path();

        public ShapeBasedClip(@k Shape shape) {
            this.clipShape = shape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        @k
        public Path getClipPath(@k SharedTransitionScope.SharedContentState sharedContentState, @k Rect rect, @k LayoutDirection layoutDirection, @k Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo291createOutlinePq9zytI(rect.m2301getSizeNHjbRc(), layoutDirection, density));
            this.path.mo2404translatek4lQ0M(rect.m2303getTopLeftF1C5BW0());
            return this.path;
        }

        @k
        public final Shape getClipShape() {
            return this.clipShape;
        }
    }

    public SharedTransitionScopeImpl(@k LookaheadScope lookaheadScope, @k r0 r0Var) {
        this.coroutineScope = r0Var;
        this.$$delegate_0 = lookaheadScope;
    }

    private final void observeIsAnimating() {
        if (this.disposed) {
            return;
        }
        Companion.getSharedTransitionObserver().observeReads(this, this.updateTransitionActiveness, this.observeAnimatingBlock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final SharedElementInternalState rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z11, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f11, boolean z12, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2066772852, i11, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, z11, overlayClip, z12, sharedContentState, f11);
            composer.updateRememberedValue(rememberedValue);
        }
        SharedElementInternalState sharedElementInternalState = (SharedElementInternalState) rememberedValue;
        sharedContentState.setInternalState$animation(sharedElementInternalState);
        sharedElementInternalState.setSharedElement(sharedElement);
        sharedElementInternalState.setRenderOnlyWhenVisible(z11);
        sharedElementInternalState.setBoundsAnimation(boundsAnimation);
        sharedElementInternalState.setPlaceHolderSize(placeHolderSize);
        sharedElementInternalState.setOverlayClip(overlayClip);
        sharedElementInternalState.setZIndex(f11);
        sharedElementInternalState.setRenderInOverlayDuringTransition(z12);
        sharedElementInternalState.setUserState(sharedContentState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sharedElementInternalState;
    }

    private void setTransitionActive(boolean z11) {
        this.isTransitionActive$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Modifier sharedBoundsImpl(Modifier modifier, final SharedTransitionScope.SharedContentState sharedContentState, final Transition<T> transition, final l<? super T, Boolean> lVar, final BoundsTransform boundsTransform, final SharedTransitionScope.PlaceHolderSize placeHolderSize, final boolean z11, final boolean z12, final float f11, final SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsImpl$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                Transition rememberTransition;
                SharedElementInternalState rememberSharedElementState;
                Composer composer2 = composer;
                composer.startReplaceGroup(-1843478929);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843478929, i11, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:915)");
                }
                Object key = SharedTransitionScope.SharedContentState.this.getKey();
                composer.startMovableGroup(-359689844, key);
                SharedTransitionScopeImpl sharedTransitionScopeImpl = this;
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = sharedTransitionScopeImpl.sharedElementsFor(key);
                    composer.updateRememberedValue(rememberedValue);
                }
                SharedElement sharedElement = (SharedElement) rememberedValue;
                composer.startMovableGroup(-359686031, transition);
                boolean z13 = false;
                if (transition != null) {
                    composer.startReplaceGroup(1734686048);
                    Transition<T> transition2 = transition;
                    String obj = key.toString();
                    l<T, Boolean> lVar2 = lVar;
                    boolean changed = composer.changed(transition2);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = transition2.getCurrentState();
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    if (transition2.isSeeking()) {
                        rememberedValue2 = transition2.getCurrentState();
                    }
                    composer.startReplaceGroup(1329676753);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                    }
                    Boolean invoke = lVar2.invoke(rememberedValue2);
                    invoke.booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    Object targetState = transition2.getTargetState();
                    composer.startReplaceGroup(1329676753);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1329676753, 0, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)");
                    }
                    Boolean invoke2 = lVar2.invoke(targetState);
                    invoke2.booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    rememberTransition = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition2, invoke, invoke2, obj, composer2, 0);
                    composer2 = composer2;
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1734936683);
                    w wVar = lVar;
                    g0.n(wVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
                    Boolean bool = (Boolean) ((l) x0.q(wVar, 1)).invoke(g2.f100423a);
                    boolean booleanValue = bool.booleanValue();
                    Object rememberedValue3 = composer.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                        if (sharedElement.getCurrentBounds() == null) {
                            z13 = booleanValue;
                        } else if (!booleanValue) {
                            z13 = true;
                        }
                        rememberedValue3 = new MutableTransitionState(Boolean.valueOf(z13));
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue3;
                    mutableTransitionState.setTargetState$animation_core_release(bool);
                    rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, null, composer, MutableTransitionState.$stable, 2);
                    composer.endReplaceGroup();
                }
                composer.startMovableGroup(-359623378, Boolean.valueOf(this.isTransitionActive()));
                Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(rememberTransition, VectorConvertersKt.getVectorConverter(Rect.Companion), null, composer2, 0, 2);
                composer.endMovableGroup();
                boolean changed2 = composer.changed(rememberTransition);
                SharedTransitionScopeImpl sharedTransitionScopeImpl2 = this;
                BoundsTransform boundsTransform2 = boundsTransform;
                Object rememberedValue4 = composer.rememberedValue();
                if (changed2 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new BoundsAnimation(sharedTransitionScopeImpl2, rememberTransition, createDeferredAnimation, boundsTransform2);
                    composer.updateRememberedValue(rememberedValue4);
                }
                BoundsAnimation boundsAnimation = (BoundsAnimation) rememberedValue4;
                boundsAnimation.updateAnimation(createDeferredAnimation, boundsTransform);
                composer.endMovableGroup();
                rememberSharedElementState = this.rememberSharedElementState(sharedElement, boundsAnimation, placeHolderSize, z11, SharedTransitionScope.SharedContentState.this, overlayClip, f11, z12, composer, 0);
                composer.endMovableGroup();
                Modifier then = modifier2.then(new SharedBoundsNodeElement(rememberSharedElementState));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier sharedBoundsWithCallerManagedVisibility$animation$default(SharedTransitionScopeImpl sharedTransitionScopeImpl, Modifier modifier, SharedTransitionScope.SharedContentState sharedContentState, boolean z11, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z12, float f11, SharedTransitionScope.OverlayClip overlayClip, int i11, Object obj) {
        SharedTransitionScope.OverlayClip overlayClip2;
        SharedTransitionScope.OverlayClip overlayClip3;
        if ((i11 & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i11 & 8) != 0) {
            placeHolderSize = SharedTransitionScope.PlaceHolderSize.Companion.getContentSize();
        }
        SharedTransitionScope.PlaceHolderSize placeHolderSize2 = placeHolderSize;
        boolean z13 = (i11 & 16) != 0 ? true : z12;
        float f12 = (i11 & 32) != 0 ? 0.0f : f11;
        if ((i11 & 64) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScopeImpl.sharedBoundsWithCallerManagedVisibility$animation(modifier, sharedContentState, z11, boundsTransform2, placeHolderSize2, z13, f12, overlayClip2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement sharedElementsFor(Object obj) {
        SharedElement sharedElement = this.sharedElements.get(obj);
        if (sharedElement != null) {
            return sharedElement;
        }
        SharedElement sharedElement2 = new SharedElement(obj, this);
        this.sharedElements.set(obj, sharedElement2);
        return sharedElement2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateTransitionActiveness() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeImpl.updateTransitionActiveness():void");
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @k
    public SharedTransitionScope.OverlayClip OverlayClip(@k Shape shape) {
        return new ShapeBasedClip(shape);
    }

    public final void clearObservation$animation(@k Object obj) {
        Companion.getSharedTransitionObserver().clear(obj);
    }

    public final void drawInOverlay$animation(@k ContentDrawScope contentDrawScope) {
        SnapshotStateList<LayerRenderer> snapshotStateList = this.renderers;
        if (snapshotStateList.size() > 1) {
            l0.r0(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    LayerRenderer layerRenderer = (LayerRenderer) t11;
                    LayerRenderer layerRenderer2 = (LayerRenderer) t12;
                    return g.l(Float.valueOf((layerRenderer.getZIndex() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.getZIndex()), Float.valueOf((layerRenderer2.getZIndex() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.getZIndex()));
                }
            });
        }
        SnapshotStateList<LayerRenderer> snapshotStateList2 = this.renderers;
        int size = snapshotStateList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList2.get(i11).drawInOverlay(contentDrawScope);
        }
    }

    @k
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final boolean getDisposed$animation() {
        return this.disposed;
    }

    @k
    public final LayoutCoordinates getLookaheadRoot$animation() {
        LayoutCoordinates layoutCoordinates = this.nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @k
    public LayoutCoordinates getLookaheadScopeCoordinates(@k Placeable.PlacementScope placementScope) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(placementScope);
    }

    @m80.l
    public final LayoutCoordinates getNullableLookaheadRoot$animation() {
        return this.nullableLookaheadRoot;
    }

    @k
    public final SnapshotStateObserver getObserverForTest$animation() {
        return Companion.getSharedTransitionObserver();
    }

    @k
    public final LayoutCoordinates getRoot$animation() {
        LayoutCoordinates layoutCoordinates = this.root;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        g0.S(a.r.C0259a.f16300m);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        return ((Boolean) this.isTransitionActive$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public long mo109localLookaheadPositionOfauaQtc(@k LayoutCoordinates layoutCoordinates, @k LayoutCoordinates layoutCoordinates2, long j11, boolean z11) {
        return this.$$delegate_0.mo109localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j11, z11);
    }

    public final void observeReads$animation(@k SharedElement sharedElement, @k l<? super SharedElement, g2> lVar, @k x00.a<g2> aVar) {
        if (this.disposed) {
            return;
        }
        Companion.getSharedTransitionObserver().observeReads(sharedElement, lVar, aVar);
    }

    public final void onDispose$animation() {
        Companion.getSharedTransitionObserver().clear(this);
        this.disposed = true;
    }

    public final void onLayerRendererCreated$animation(@k LayerRenderer layerRenderer) {
        this.renderers.add(layerRenderer);
    }

    public final void onLayerRendererRemoved$animation(@k LayerRenderer layerRenderer) {
        this.renderers.remove(layerRenderer);
    }

    public final void onStateAdded$animation(@k SharedElementInternalState sharedElementInternalState) {
        SharedElement sharedElement = sharedElementInternalState.getSharedElement();
        sharedElement.addState(sharedElementInternalState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        Iterator<LayerRenderer> it = this.renderers.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            LayerRenderer next = it.next();
            SharedElementInternalState sharedElementInternalState2 = next instanceof SharedElementInternalState ? (SharedElementInternalState) next : null;
            if (g0.g(sharedElementInternalState2 != null ? sharedElementInternalState2.getSharedElement() : null, sharedElementInternalState.getSharedElement())) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == this.renderers.size() - 1 || i11 == -1) {
            this.renderers.add(sharedElementInternalState);
        } else {
            this.renderers.add(i11 + 1, sharedElementInternalState);
        }
    }

    public final void onStateRemoved$animation(@k SharedElementInternalState sharedElementInternalState) {
        SharedElement sharedElement = sharedElementInternalState.getSharedElement();
        sharedElement.removeState(sharedElementInternalState);
        this.updateTransitionActiveness.invoke(this);
        sharedElement.getScope().observeIsAnimating();
        this.renderers.remove(sharedElementInternalState);
        if (sharedElement.getStates().isEmpty()) {
            c40.k.f(sharedElement.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1(sharedElement, null), 3, null);
        }
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @Composable
    @k
    public SharedTransitionScope.SharedContentState rememberSharedContentState(@k Object obj, @m80.l Composer composer, int i11) {
        composer.startReplaceGroup(799702514);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(799702514, i11, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:874)");
        }
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SharedTransitionScope.SharedContentState(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        SharedTransitionScope.SharedContentState sharedContentState = (SharedTransitionScope.SharedContentState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sharedContentState;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @k
    public Modifier renderInSharedTransitionScopeOverlay(@k Modifier modifier, @k x00.a<Boolean> aVar, float f11, @k p<? super LayoutDirection, ? super Density, ? extends Path> pVar) {
        return modifier.then(new RenderInTransitionOverlayNodeElement(this, aVar, f11, pVar));
    }

    public final void setNullableLookaheadRoot$animation(@m80.l LayoutCoordinates layoutCoordinates) {
        this.nullableLookaheadRoot = layoutCoordinates;
    }

    public final void setRoot$animation(@k LayoutCoordinates layoutCoordinates) {
        this.root = layoutCoordinates;
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @k
    public Modifier sharedBounds(@k Modifier modifier, @k final SharedTransitionScope.SharedContentState sharedContentState, @k final AnimatedVisibilityScope animatedVisibilityScope, @k final EnterTransition enterTransition, @k final ExitTransition exitTransition, @k BoundsTransform boundsTransform, @k final SharedTransitionScope.ResizeMode resizeMode, @k SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z11, float f11, @k SharedTransitionScope.OverlayClip overlayClip) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new l<EnterExitState, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$1
            @Override // x00.l
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, false, z11, f11, overlayClip), null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                Modifier modifier3;
                composer.startReplaceGroup(-419341573);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-419341573, i11, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:736)");
                }
                Transition<EnterExitState> transition = AnimatedVisibilityScope.this.getTransition();
                EnterTransition enterTransition2 = enterTransition;
                ExitTransition exitTransition2 = exitTransition;
                boolean changedInstance = composer.changedInstance(sharedContentState);
                final SharedTransitionScope.SharedContentState sharedContentState2 = sharedContentState;
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // x00.a
                        public final Boolean invoke() {
                            return Boolean.valueOf(SharedTransitionScope.SharedContentState.this.isMatchFound());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Modifier createModifier = EnterExitTransitionKt.createModifier(transition, enterTransition2, exitTransition2, (x00.a) rememberedValue, "enter/exit for " + sharedContentState.getKey(), composer, 0, 0);
                if (resizeMode instanceof ScaleToBoundsImpl) {
                    composer.startReplaceGroup(-805568624);
                    Modifier.Companion companion = Modifier.Companion;
                    ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) resizeMode;
                    boolean changedInstance2 = composer.changedInstance(sharedContentState);
                    final SharedTransitionScope.SharedContentState sharedContentState3 = sharedContentState;
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new x00.a<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$2$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // x00.a
                            public final Boolean invoke() {
                                return Boolean.valueOf(SharedTransitionScope.SharedContentState.this.isMatchFound());
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    modifier3 = SkipToLookaheadNodeKt.createContentScaleModifier(companion, scaleToBoundsImpl, (x00.a) rememberedValue2);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-804951414);
                    composer.endReplaceGroup();
                    modifier3 = Modifier.Companion;
                }
                Modifier then = createModifier.then(modifier3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        }, 1, null);
    }

    @k
    public final Modifier sharedBoundsWithCallerManagedVisibility$animation(@k Modifier modifier, @k SharedTransitionScope.SharedContentState sharedContentState, final boolean z11, @k BoundsTransform boundsTransform, @k SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z12, float f11, @k SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new l<g2, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(g2 g2Var) {
                return Boolean.valueOf(z11);
            }
        }, boundsTransform, placeHolderSize, false, z12, f11, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @k
    public Modifier sharedElement(@k Modifier modifier, @k SharedTransitionScope.SharedContentState sharedContentState, @k AnimatedVisibilityScope animatedVisibilityScope, @k BoundsTransform boundsTransform, @k SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z11, float f11, @k SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, animatedVisibilityScope.getTransition(), new l<EnterExitState, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedElement$1
            @Override // x00.l
            public final Boolean invoke(EnterExitState enterExitState) {
                return Boolean.valueOf(enterExitState == EnterExitState.Visible);
            }
        }, boundsTransform, placeHolderSize, true, z11, f11, overlayClip);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    @k
    public Modifier sharedElementWithCallerManagedVisibility(@k Modifier modifier, @k SharedTransitionScope.SharedContentState sharedContentState, final boolean z11, @k BoundsTransform boundsTransform, @k SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z12, float f11, @k SharedTransitionScope.OverlayClip overlayClip) {
        return sharedBoundsImpl(modifier, sharedContentState, null, new l<g2, Boolean>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(g2 g2Var) {
                return Boolean.valueOf(z11);
            }
        }, boundsTransform, placeHolderSize, true, z12, f11, overlayClip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    @k
    public Modifier skipToLookaheadSize(@k Modifier modifier) {
        return modifier.then(new SkipToLookaheadElement(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @k
    public LayoutCoordinates toLookaheadCoordinates(@k LayoutCoordinates layoutCoordinates) {
        return this.$$delegate_0.toLookaheadCoordinates(layoutCoordinates);
    }
}
