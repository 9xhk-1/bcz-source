package androidx.compose.foundation.lazy;

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
import androidx.compose.ui.unit.Density;
import j00.c;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n85#2:604\n85#2:605\n113#2,2:606\n85#2:608\n113#2,2:609\n50#3,5:611\n26#4:616\n1#5:617\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n285#1:604\n374#1:605\n374#1:606,2\n377#1:608\n377#1:609,2\n397#1:611,5\n407#1:616\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(new p<SaverScope, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        @Override // x00.p
        public final List<Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
            return h0.Q(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
        }
    }, new l<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ LazyListState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyListState invoke2(List<Integer> list) {
            return new LazyListState(list.get(0).intValue(), list.get(1).intValue());
        }
    });

    @k
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    @m80.l
    private LazyListMeasureResult approachLayoutInfo;

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
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> itemAnimator;

    @k
    private final MutableState<LazyListMeasureResult> layoutInfoState;

    @k
    private final MutableState<g2> measurementScopeInvalidator;
    private int numMeasurePasses;

    @k
    private final LazyLayoutPinnedItemList pinnedItems;

    @k
    private final MutableState<g2> placementScopeInvalidator;

    @k
    private final LazyListPrefetchScope prefetchScope;

    @k
    private final LazyLayoutPrefetchState prefetchState;

    @k
    private final LazyListPrefetchStrategy prefetchStrategy;
    private boolean prefetchingEnabled;

    @m80.l
    private Remeasurement remeasurement;

    @k
    private final RemeasurementModifier remeasurementModifier;

    @k
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @k
    private final ScrollableState scrollableState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }

        @k
        public final Saver<LazyListState, ?> saver$foundation_release(@k final LazyListPrefetchStrategy lazyListPrefetchStrategy) {
            return ListSaverKt.listSaver(new p<SaverScope, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$saver$3
                @Override // x00.p
                public final List<Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
                    return h0.Q(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
                }
            }, new l<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$saver$4
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ LazyListState invoke(List<? extends Integer> list) {
                    return invoke2((List<Integer>) list);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final LazyListState invoke2(List<Integer> list) {
                    return new LazyListState(list.get(0).intValue(), list.get(1).intValue(), LazyListPrefetchStrategy.this);
                }
            });
        }

        private Companion() {
        }
    }

    @ExperimentalFoundationApi
    public LazyListState() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i11, int i12, c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyListState.animateScrollToItem(i11, i12, cVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyListState lazyListState, LazyListMeasureResult lazyListMeasureResult, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResult, z11, z12);
    }

    private final void notifyPrefetchOnScroll(float f11, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.onScroll(this.prefetchScope, f11, lazyListLayoutInfo);
        }
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyListState lazyListState, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        lazyListState.requestScrollToItem(i11, i12);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i11, int i12, c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyListState.scrollToItem(i11, i12, cVar);
    }

    private void setCanScrollBackward(boolean z11) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z11));
    }

    private void setCanScrollForward(boolean z11) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z11));
    }

    @m80.l
    public final Object animateScrollToItem(@IntRange(from = 0) int i11, int i12, @k c<? super g2> cVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyListState$animateScrollToItem$2(this, i11, i12, null), cVar, 1, null);
        return scroll$default == b.l() ? scroll$default : g2.f100423a;
    }

    public final void applyMeasureResult$foundation_release(@k LazyListMeasureResult lazyListMeasureResult, boolean z11, boolean z12) {
        if (!z11 && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyListMeasureResult;
            return;
        }
        if (z11) {
            this.hasLookaheadOccurred = true;
        }
        setCanScrollBackward(lazyListMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyListMeasureResult.getCanScrollForward());
        this.scrollToBeConsumed -= lazyListMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyListMeasureResult);
        if (z12) {
            this.scrollPosition.updateScrollOffset(lazyListMeasureResult.getFirstVisibleItemScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyListMeasureResult);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.onVisibleItemsUpdated(this.prefetchScope, lazyListMeasureResult);
            }
        }
        if (z11) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation_release(lazyListMeasureResult.getScrollBackAmount(), lazyListMeasureResult.getDensity(), lazyListMeasureResult.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f11) {
        return this.scrollableState.dispatchRawDelta(f11);
    }

    @m80.l
    public final LazyListMeasureResult getApproachLayoutInfo$foundation_release() {
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
    public final LazyLayoutItemAnimator<LazyListMeasuredItem> getItemAnimator$foundation_release() {
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
    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    @k
    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<g2> m845getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
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
    public final MutableState<g2> m846getPlacementScopeInvalidatorzYiylxw$foundation_release() {
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

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f11) {
        LazyListMeasureResult lazyListMeasureResult;
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
            int round = Math.round(f13);
            LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(round, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyListMeasureResult = this.approachLayoutInfo) != null) {
                LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyListMeasureResult != null ? lazyListMeasureResult.copyWithScrollDeltaWithoutRemeasure(round, true) : null;
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
            c40.k.f(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new LazyListState$requestScrollToItem$1(this, null), 3, null);
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
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
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(androidx.compose.foundation.MutatePriority, x00.p, j00.c):java.lang.Object");
    }

    @m80.l
    public final Object scrollToItem(@IntRange(from = 0) int i11, int i12, @k c<? super g2> cVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyListState$scrollToItem$2(this, i11, i12, null), cVar, 1, null);
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

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@k LazyListItemProvider lazyListItemProvider, int i11) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyListItemProvider, i11);
    }

    @ExperimentalFoundationApi
    public LazyListState(final int i11, int i12, @k LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        LazyListMeasureResult lazyListMeasureResult;
        this.prefetchStrategy = lazyListPrefetchStrategy;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i11, i12);
        this.scrollPosition = lazyListScrollPosition;
        lazyListMeasureResult = LazyListStateKt.EmptyLazyListMeasureResult;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(lazyListMeasureResult, SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.scrollableState = ScrollableStateKt.ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                return Float.valueOf(-LazyListState.this.onScroll$foundation_release(-f11));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyListState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyListPrefetchStrategy.getPrefetchScheduler(), new l<NestedPrefetchScope, g2>() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchState$1
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
                LazyListPrefetchStrategy lazyListPrefetchStrategy2;
                lazyListPrefetchStrategy2 = LazyListState.this.prefetchStrategy;
                int i13 = i11;
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                companion.restoreNonObservable(currentThreadSnapshot, companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
                lazyListPrefetchStrategy2.onNestedPrefetch(nestedPrefetchScope, i13);
            }
        });
        this.prefetchScope = new LazyListPrefetchScope() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchScope$1
            @Override // androidx.compose.foundation.lazy.LazyListPrefetchScope
            public LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int i13) {
                MutableState mutableState;
                Snapshot.Companion companion = Snapshot.Companion;
                LazyListState lazyListState = LazyListState.this;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    mutableState = lazyListState.layoutInfoState;
                    long m836getChildConstraintsmsEJaDk = ((LazyListMeasureResult) mutableState.getValue()).m836getChildConstraintsmsEJaDk();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    return LazyListState.this.getPrefetchState$foundation_release().m903schedulePrefetch0kLqBqw(i13, m836getChildConstraintsmsEJaDk);
                } catch (Throwable th2) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th2;
                }
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.placementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public /* synthetic */ LazyListState(int i11, int i12, LazyListPrefetchStrategy lazyListPrefetchStrategy, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null) : lazyListPrefetchStrategy);
    }

    public /* synthetic */ LazyListState(int i11, int i12, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }

    public LazyListState(int i11, int i12) {
        this(i11, i12, LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null));
    }
}
