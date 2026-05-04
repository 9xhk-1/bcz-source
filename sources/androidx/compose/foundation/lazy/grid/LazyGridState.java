package androidx.compose.foundation.lazy.grid;

import a00.h0;
import androidx.annotation.IntRange;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import c10.d;
import j00.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,613:1\n85#2:614\n85#2:615\n113#2,2:616\n85#2:618\n113#2,2:619\n50#3,5:621\n1#4:626\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n300#1:614\n386#1:615\n386#1:616,2\n389#1:618\n389#1:619,2\n407#1:621,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(new p<SaverScope, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // x00.p
        public final List<Integer> invoke(SaverScope saverScope, LazyGridState lazyGridState) {
            return h0.Q(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
        }
    }, new l<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ LazyGridState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyGridState invoke2(List<Integer> list) {
            return new LazyGridState(list.get(0).intValue(), list.get(1).intValue());
        }
    });

    @k
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    @m80.l
    private LazyGridMeasureResult approachLayoutInfo;

    @k
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @k
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @k
    private final MutableState canScrollBackward$delegate;

    @k
    private final MutableState canScrollForward$delegate;
    private boolean hasLookaheadOccurred;

    @k
    private final MutableInteractionSource internalInteractionSource;

    @k
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> itemAnimator;

    @k
    private final MutableState<LazyGridMeasureResult> layoutInfoState;

    @k
    private final MutableState<g2> measurementScopeInvalidator;
    private int numMeasurePasses;

    @k
    private final LazyLayoutPinnedItemList pinnedItems;

    @k
    private final MutableState<g2> placementScopeInvalidator;

    @k
    private final LazyGridPrefetchScope prefetchScope;

    @k
    private final LazyLayoutPrefetchState prefetchState;

    @k
    private final LazyGridPrefetchStrategy prefetchStrategy;
    private boolean prefetchingEnabled;

    @m80.l
    private Remeasurement remeasurement;

    @k
    private final RemeasurementModifier remeasurementModifier;

    @k
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @k
    private final ScrollableState scrollableState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }

        @ExperimentalFoundationApi
        @k
        public final Saver<LazyGridState, ?> saver$foundation_release(@k final LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
            return ListSaverKt.listSaver(new p<SaverScope, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$saver$3
                @Override // x00.p
                public final List<Integer> invoke(SaverScope saverScope, LazyGridState lazyGridState) {
                    return h0.Q(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
                }
            }, new l<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$saver$4
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ LazyGridState invoke(List<? extends Integer> list) {
                    return invoke2((List<Integer>) list);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final LazyGridState invoke2(List<Integer> list) {
                    return new LazyGridState(list.get(0).intValue(), list.get(1).intValue(), LazyGridPrefetchStrategy.this);
                }
            });
        }

        private Companion() {
        }
    }

    @ExperimentalFoundationApi
    public LazyGridState() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i11, int i12, c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyGridState.animateScrollToItem(i11, i12, cVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyGridState lazyGridState, LazyGridMeasureResult lazyGridMeasureResult, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResult, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNumOfItemsToTeleport() {
        return getSlotsPerLine$foundation_release() * 100;
    }

    private final void notifyPrefetchOnScroll(float f11, LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.onScroll(this.prefetchScope, f11, lazyGridLayoutInfo);
        }
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyGridState lazyGridState, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        lazyGridState.requestScrollToItem(i11, i12);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i11, int i12, c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyGridState.scrollToItem(i11, i12, cVar);
    }

    private void setCanScrollBackward(boolean z11) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z11));
    }

    private void setCanScrollForward(boolean z11) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z11));
    }

    @m80.l
    public final Object animateScrollToItem(@IntRange(from = 0) int i11, int i12, @k c<? super g2> cVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$animateScrollToItem$2(this, i11, i12, null), cVar, 1, null);
        return scroll$default == b.l() ? scroll$default : g2.f100423a;
    }

    public final void applyMeasureResult$foundation_release(@k LazyGridMeasureResult lazyGridMeasureResult, boolean z11, boolean z12) {
        if (!z11 && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyGridMeasureResult;
            return;
        }
        if (z11) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= lazyGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyGridMeasureResult);
        setCanScrollBackward(lazyGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyGridMeasureResult.getCanScrollForward());
        if (z12) {
            this.scrollPosition.updateScrollOffset(lazyGridMeasureResult.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyGridMeasureResult);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.onVisibleItemsUpdated(this.prefetchScope, lazyGridMeasureResult);
            }
        }
        if (z11) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation_release(lazyGridMeasureResult.getScrollBackAmount(), lazyGridMeasureResult.getDensity(), lazyGridMeasureResult.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f11) {
        return this.scrollableState.dispatchRawDelta(f11);
    }

    @m80.l
    public final LazyGridMeasureResult getApproachLayoutInfo$foundation_release() {
        return this.approachLayoutInfo;
    }

    @k
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    @k
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @k
    public final Density getDensity$foundation_release() {
        return this.layoutInfoState.getValue().getDensity();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final boolean getHasLookaheadOccurred$foundation_release() {
        return this.hasLookaheadOccurred;
    }

    @k
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @k
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @k
    public final LazyLayoutItemAnimator<LazyGridMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    @k
    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    @k
    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<g2> m875getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    @k
    public final g10.l getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    @k
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    @k
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<g2> m876getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    @k
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    @m80.l
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    @k
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._lazyLayoutScrollDeltaBetweenPasses.getScrollDeltaBetweenPasses$foundation_release();
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.layoutInfoState.getValue().getSlotsPerLine();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f11) {
        LazyGridMeasureResult lazyGridMeasureResult;
        if ((f11 < 0.0f && !getCanScrollForward()) || (f11 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        float f12 = this.scrollToBeConsumed + f11;
        this.scrollToBeConsumed = f12;
        if (Math.abs(f12) > 0.5f) {
            float f13 = this.scrollToBeConsumed;
            int L0 = d.L0(f13);
            LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(L0, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyGridMeasureResult != null ? lazyGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(L0, true) : null;
                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                } else {
                    copyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (copyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation_release(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m912invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetchOnScroll(f13 - this.scrollToBeConsumed, copyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetchOnScroll(f13 - this.scrollToBeConsumed, getLayoutInfo());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f11;
        }
        float f14 = f11 - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f14;
    }

    public final void requestScrollToItem(@IntRange(from = 0) int i11, int i12) {
        if (isScrollInProgress()) {
            c40.k.f(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new LazyGridState$requestScrollToItem$1(this, null), 3, null);
        }
        snapToItemIndexInternal$foundation_release(i11, i12, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r8.scroll(r6, r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scroll(@m80.k androidx.compose.foundation.MutatePriority r6, @m80.k x00.p<? super androidx.compose.foundation.gestures.ScrollScope, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            x00.p r7 = (x00.p) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            kotlin.e.n(r8)
            goto L5a
        L45:
            kotlin.e.n(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, x00.p, j00.c):java.lang.Object");
    }

    @m80.l
    public final Object scrollToItem(@IntRange(from = 0) int i11, int i12, @k c<? super g2> cVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$scrollToItem$2(this, i11, i12, null), cVar, 1, null);
        return scroll$default == b.l() ? scroll$default : g2.f100423a;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z11) {
        this.prefetchingEnabled = z11;
    }

    public final void snapToItemIndexInternal$foundation_release(int i11, int i12, boolean z11) {
        if (this.scrollPosition.getIndex() != i11 || this.scrollPosition.getScrollOffset() != i12) {
            this.itemAnimator.reset();
        }
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i11, i12);
        if (!z11) {
            ObservableScopeInvalidator.m912invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@k LazyGridItemProvider lazyGridItemProvider, int i11) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyGridItemProvider, i11);
    }

    @ExperimentalFoundationApi
    public LazyGridState(final int i11, int i12, @k LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        LazyGridMeasureResult lazyGridMeasureResult;
        this.prefetchStrategy = lazyGridPrefetchStrategy;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i11, i12);
        this.scrollPosition = lazyGridScrollPosition;
        lazyGridMeasureResult = LazyGridStateKt.EmptyLazyGridLayoutInfo;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(lazyGridMeasureResult, SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.scrollableState = ScrollableStateKt.ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                return Float.valueOf(-LazyGridState.this.onScroll$foundation_release(-f11));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyGridState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyGridPrefetchStrategy.getPrefetchScheduler(), new l<NestedPrefetchScope, g2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(NestedPrefetchScope nestedPrefetchScope) {
                invoke2(nestedPrefetchScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NestedPrefetchScope nestedPrefetchScope) {
                LazyGridPrefetchStrategy lazyGridPrefetchStrategy2;
                lazyGridPrefetchStrategy2 = LazyGridState.this.prefetchStrategy;
                int i13 = i11;
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                companion.restoreNonObservable(currentThreadSnapshot, companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
                lazyGridPrefetchStrategy2.onNestedPrefetch(nestedPrefetchScope, i13);
            }
        });
        this.prefetchScope = new LazyGridPrefetchScope() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1
            @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
            public List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i13) {
                MutableState mutableState;
                LazyGridMeasureResult lazyGridMeasureResult2;
                ArrayList arrayList = new ArrayList();
                Snapshot.Companion companion = Snapshot.Companion;
                LazyGridState lazyGridState = LazyGridState.this;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    if (lazyGridState.getHasLookaheadOccurred$foundation_release()) {
                        lazyGridMeasureResult2 = lazyGridState.getApproachLayoutInfo$foundation_release();
                    } else {
                        mutableState = lazyGridState.layoutInfoState;
                        lazyGridMeasureResult2 = (LazyGridMeasureResult) mutableState.getValue();
                    }
                    if (lazyGridMeasureResult2 != null) {
                        List<Pair<Integer, Constraints>> invoke = lazyGridMeasureResult2.getPrefetchInfoRetriever().invoke(Integer.valueOf(i13));
                        int size = invoke.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            Pair<Integer, Constraints> pair = invoke.get(i14);
                            arrayList.add(lazyGridState.getPrefetchState$foundation_release().m903schedulePrefetch0kLqBqw(pair.getFirst().intValue(), pair.getSecond().m5074unboximpl()));
                        }
                        g2 g2Var = g2.f100423a;
                    }
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    return arrayList;
                } catch (Throwable th2) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th2;
                }
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public /* synthetic */ LazyGridState(int i11, int i12, LazyGridPrefetchStrategy lazyGridPrefetchStrategy, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null) : lazyGridPrefetchStrategy);
    }

    public /* synthetic */ LazyGridState(int i11, int i12, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }

    public LazyGridState(int i11, int i12) {
        this(i11, i12, LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null));
    }
}
