package androidx.compose.foundation.lazy.staggeredgrid;

import a00.h0;
import a00.q;
import a00.r0;
import androidx.annotation.IntRange;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import c10.d;
import j00.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,639:1\n85#2:640\n113#2,2:641\n85#2:643\n113#2,2:644\n85#2:646\n50#3,5:647\n96#3,5:654\n1855#4,2:652\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n157#1:640\n157#1:641,2\n160#1:643\n160#1:644,2\n235#1:646\n267#1:647,5\n598#1:654,5\n535#1:652,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new p<SaverScope, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // x00.p
        public final List<int[]> invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
            return h0.Q(lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices(), lazyStaggeredGridState.getScrollPosition$foundation_release().getScrollOffsets());
        }
    }, new l<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.l
        public /* bridge */ /* synthetic */ LazyStaggeredGridState invoke(List<? extends int[]> list) {
            return invoke2((List<int[]>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyStaggeredGridState invoke2(List<int[]> list) {
            return new LazyStaggeredGridState(list.get(0), list.get(1), null);
        }
    });

    @k
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    @m80.l
    private LazyStaggeredGridMeasureResult approachLayoutInfo;

    @k
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @k
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @k
    private final MutableState canScrollBackward$delegate;

    @k
    private final MutableState canScrollForward$delegate;

    @k
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private boolean hasLookaheadOccurred;

    @k
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator;

    @k
    private final LazyStaggeredGridLaneInfo laneInfo;

    @k
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;

    @k
    private final MutableState<g2> measurementScopeInvalidator;

    @k
    private final MutableInteractionSource mutableInteractionSource;

    @k
    private final LazyLayoutPinnedItemList pinnedItems;

    @k
    private final MutableState<g2> placementScopeInvalidator;
    private int prefetchBaseIndex;

    @k
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    @m80.l
    private Remeasurement remeasurement;

    @k
    private final RemeasurementModifier remeasurementModifier;

    @k
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @k
    private final ScrollableState scrollableState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        private Companion() {
        }
    }

    public LazyStaggeredGridState(@k int[] iArr, @k int[] iArr2, @m80.l PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyStaggeredGridState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new l<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                float onScroll;
                onScroll = LazyStaggeredGridState.this.onScroll(-f11);
                return Float.valueOf(-onScroll);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return invoke(f11.floatValue());
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i11, int i12, c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i11, i12, cVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult, z11, z12);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex == -1 || visibleItemsInfo.isEmpty()) {
            return;
        }
        int index = ((LazyStaggeredGridItemInfo) r0.G2(visibleItemsInfo)).getIndex();
        int index2 = ((LazyStaggeredGridItemInfo) r0.u3(visibleItemsInfo)).getIndex();
        int i11 = this.prefetchBaseIndex;
        if (index > i11 || i11 > index2) {
            this.prefetchBaseIndex = -1;
            Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i11, int i12) {
        int[] iArr = new int[i12];
        if (this.layoutInfoState.getValue().getSpanProvider().isFullSpan(i11)) {
            q.T1(iArr, i11, 0, 0, 6, null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i11 + i12);
        int lane = this.laneInfo.getLane(i11);
        if (lane != -2 && lane != -1) {
            if ((lane >= 0 ? 1 : 0) == 0) {
                InlineClassHelperKt.throwIllegalArgumentException("Expected positive lane number, got " + lane + " instead.");
            }
            r3 = Math.min(lane, i12);
        }
        int i13 = r3;
        int i14 = i13 - 1;
        int i15 = i11;
        while (true) {
            if (-1 >= i14) {
                break;
            }
            i15 = this.laneInfo.findPreviousItemIndex(i15, i14);
            iArr[i14] = i15;
            if (i15 == -1) {
                q.T1(iArr, -1, 0, i14, 2, null);
                break;
            }
            i14--;
        }
        iArr[i13] = i11;
        for (int i16 = i13 + 1; i16 < i12; i16++) {
            i11 = this.laneInfo.findNextItemIndex(i11, i16);
            iArr[i16] = i11;
        }
        return iArr;
    }

    private final void notifyPrefetch(float f11, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        int i11;
        if (!this.prefetchingEnabled || lazyStaggeredGridMeasureResult.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z11 = f11 < 0.0f;
        int index = z11 ? ((LazyStaggeredGridMeasuredItem) r0.u3(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridMeasuredItem) r0.G2(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LazyStaggeredGridSlots slots = lazyStaggeredGridMeasureResult.getSlots();
        int length = slots.getSizes().length;
        for (int i12 = 0; i12 < length; i12++) {
            index = z11 ? this.laneInfo.findNextItemIndex(index, i12) : this.laneInfo.findPreviousItemIndex(index, i12);
            if (index < 0 || index >= lazyStaggeredGridMeasureResult.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                boolean isFullSpan = lazyStaggeredGridMeasureResult.getSpanProvider().isFullSpan(index);
                int i13 = isFullSpan ? 0 : i12;
                int i14 = isFullSpan ? length : 1;
                if (i14 == 1) {
                    i11 = slots.getSizes()[i13];
                } else {
                    int i15 = slots.getPositions()[i13];
                    int i16 = (i13 + i14) - 1;
                    i11 = (slots.getPositions()[i16] + slots.getSizes()[i16]) - i15;
                }
                this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m903schedulePrefetch0kLqBqw(index, lazyStaggeredGridMeasureResult.getOrientation() == Orientation.Vertical ? Constraints.Companion.m5080fixedWidthOenEA2s(i11) : Constraints.Companion.m5079fixedHeightOenEA2s(i11)));
            }
        }
        clearLeftoverPrefetchHandles(linkedHashSet);
    }

    public static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState lazyStaggeredGridState, float f11, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lazyStaggeredGridMeasureResult = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f11, lazyStaggeredGridMeasureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float f11) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
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
            LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(L0, !this.hasLookaheadOccurred);
            if (copyWithScrollDeltaWithoutRemeasure != null && (lazyStaggeredGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure2 = lazyStaggeredGridMeasureResult != null ? lazyStaggeredGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(L0, true) : null;
                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                } else {
                    copyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (copyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation_release(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m912invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetch(f13 - this.scrollToBeConsumed, copyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetch$default(this, f13 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f11;
        }
        float f14 = f11 - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f14;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        lazyStaggeredGridState.requestScrollToItem(i11, i12);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i11, int i12, c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i11, i12, cVar);
    }

    private void setCanScrollBackward(boolean z11) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z11));
    }

    private void setCanScrollForward(boolean z11) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z11));
    }

    @m80.l
    public final Object animateScrollToItem(int i11, int i12, @k c<? super g2> cVar) {
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyStaggeredGridState$animateScrollToItem$2(this, i11, i12, value.getSlots().getSizes().length * 100, value, null), cVar, 1, null);
        return scroll$default == b.l() ? scroll$default : g2.f100423a;
    }

    public final void applyMeasureResult$foundation_release(@k LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z11, boolean z12) {
        if (!z11 && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyStaggeredGridMeasureResult;
            return;
        }
        if (z11) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= lazyStaggeredGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyStaggeredGridMeasureResult);
        if (z12) {
            this.scrollPosition.updateScrollOffset(lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyStaggeredGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyStaggeredGridMeasureResult);
        }
        setCanScrollBackward(lazyStaggeredGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyStaggeredGridMeasureResult.getCanScrollForward());
        if (z11) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation_release(lazyStaggeredGridMeasureResult.getScrollBackAmount(), lazyStaggeredGridMeasureResult.getDensity(), lazyStaggeredGridMeasureResult.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f11) {
        return this.scrollableState.dispatchRawDelta(f11);
    }

    @m80.l
    public final LazyStaggeredGridMeasureResult getApproachLayoutInfo$foundation_release() {
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
        return this.mutableInteractionSource;
    }

    @k
    public final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    public final int getLaneCount$foundation_release() {
        return this.layoutInfoState.getValue().getSlots().getSizes().length;
    }

    @k
    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.laneInfo;
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
    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.measurePassCount;
    }

    @k
    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<g2> m951getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    @k
    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.mutableInteractionSource;
    }

    @k
    public final g10.l getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    @k
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    @k
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<g2> m952getPlacementScopeInvalidatorzYiylxw$foundation_release() {
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

    @k
    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final void requestScrollToItem(@IntRange(from = 0) int i11, int i12) {
        if (isScrollInProgress()) {
            c40.k.f(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new LazyStaggeredGridState$requestScrollToItem$1(this, null), 3, null);
        }
        snapToItemInternal$foundation_release(i11, i12, false);
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, x00.p, j00.c):java.lang.Object");
    }

    public final float scrollToBeConsumed$foundation_release(boolean z11) {
        return (z11 || !this.hasLookaheadOccurred) ? this.scrollToBeConsumed : getScrollDeltaBetweenPasses$foundation_release();
    }

    @m80.l
    public final Object scrollToItem(int i11, int i12, @k c<? super g2> cVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i11, i12, null), cVar, 1, null);
        return scroll$default == b.l() ? scroll$default : g2.f100423a;
    }

    public final void setMeasurePassCount$foundation_release(int i11) {
        this.measurePassCount = i11;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z11) {
        this.prefetchingEnabled = z11;
    }

    public final void snapToItemInternal$foundation_release(int i11, int i12, boolean z11) {
        boolean z12 = (this.scrollPosition.getIndex() == i11 && this.scrollPosition.getScrollOffset() == i12) ? false : true;
        if (z12) {
            this.itemAnimator.reset();
        }
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(value, i11);
        if (findVisibleItem == null || !z12) {
            this.scrollPosition.requestPositionAndForgetLastKnownKey(i11, i12);
        } else {
            int m5244getYimpl = (value.getOrientation() == Orientation.Vertical ? IntOffset.m5244getYimpl(findVisibleItem.mo932getOffsetnOccac()) : IntOffset.m5243getXimpl(findVisibleItem.mo932getOffsetnOccac())) + i12;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = value.getFirstVisibleItemScrollOffsets()[i13] + m5244getYimpl;
            }
            this.scrollPosition.updateScrollOffset(iArr);
        }
        if (!z11) {
            ObservableScopeInvalidator.m912invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    @k
    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@k LazyLayoutItemProvider lazyLayoutItemProvider, @k int[] iArr) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider, iArr);
    }

    public /* synthetic */ LazyStaggeredGridState(int i11, int i12, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }

    public LazyStaggeredGridState(int i11, int i12) {
        this(new int[]{i11}, new int[]{i12}, null);
    }
}
