package androidx.compose.foundation.pager;

import a00.r0;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import c10.d;
import g10.u;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,994:1\n96#2,5:995\n96#2,5:1027\n96#2,5:1070\n85#3:1000\n113#3,2:1001\n85#3:1021\n85#3:1022\n85#3:1023\n113#3,2:1024\n85#3:1026\n85#3:1032\n113#3,2:1033\n85#3:1035\n113#3,2:1036\n897#4,4:1003\n897#4,4:1007\n897#4,4:1011\n897#4,4:1038\n897#4,4:1042\n897#4,4:1047\n78#5:1015\n107#5,2:1016\n78#5:1018\n107#5,2:1019\n1#6:1046\n602#7,8:1051\n602#7,8:1075\n69#8:1059\n65#8:1062\n65#8:1065\n69#8:1068\n70#9:1060\n60#9:1063\n60#9:1066\n70#9:1069\n22#10:1061\n22#10:1064\n22#10:1067\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n178#1:995,5\n611#1:1027,5\n829#1:1070,5\n185#1:1000\n185#1:1001,2\n398#1:1021\n416#1:1022\n471#1:1023\n471#1:1024,2\n488#1:1026\n652#1:1032\n652#1:1033,2\n655#1:1035\n655#1:1036,2\n219#1:1003,4\n276#1:1007,4\n286#1:1011,4\n676#1:1038,4\n680#1:1042,4\n698#1:1047,4\n384#1:1015\n384#1:1016,2\n386#1:1018\n386#1:1019,2\n705#1:1051,8\n842#1:1075,8\n725#1:1059\n727#1:1062\n731#1:1065\n731#1:1068\n725#1:1060\n727#1:1063\n731#1:1066\n731#1:1069\n725#1:1061\n727#1:1064\n731#1:1067\n*E\n"})
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;

    @l
    private PagerMeasureResult approachLayoutInfo;

    @k
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @k
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @k
    private final MutableState canScrollBackward$delegate;

    @k
    private final MutableState canScrollForward$delegate;

    @l
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    @k
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private boolean hasLookaheadOccurred;
    private int indexToPrefetch;

    @k
    private final MutableInteractionSource internalInteractionSource;

    @k
    private final MutableState<Boolean> isLastScrollBackwardState;

    @k
    private final MutableState<Boolean> isLastScrollForwardState;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;

    @k
    private final MutableState<g2> measurementScopeInvalidator;
    private long minScrollOffset;

    @k
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;

    @k
    private final LazyLayoutPinnedItemList pinnedPages;

    @k
    private final MutableState<g2> placementScopeInvalidator;

    @k
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;

    @k
    private final MutableIntState programmaticScrollTargetPage$delegate;

    @k
    private final MutableState remeasurement$delegate;

    @k
    private final RemeasurementModifier remeasurementModifier;

    @k
    private final PagerScrollPosition scrollPosition;

    @k
    private final ScrollableState scrollableState;

    @k
    private final State settledPage$delegate;

    @k
    private final MutableIntState settledPageState$delegate;

    @k
    private final State targetPage$delegate;

    @k
    private final MutableState upDownDifference$delegate;
    private boolean wasPrefetchingForward;

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i11, float f11, AnimationSpec animationSpec, c cVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i12 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i11, f11, animationSpec, cVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(c<? super g2> cVar) {
        Object waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(cVar);
        return waitForFirstLayout == b.l() ? waitForFirstLayout : g2.f100423a;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        if (this.indexToPrefetch == -1 || pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasPrefetchingForward ? ((PageInfo) r0.u3(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + pagerLayoutInfo.getBeyondViewportPageCount() + 1 : (((PageInfo) r0.G2(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i11) {
        if (getPageCount() > 0) {
            return u.I(i11, 0, getPageCount() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final boolean isGestureActionMatchesScroll(float f11) {
        if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
            if (Math.signum(f11) == Math.signum(-Float.intBitsToFloat((int) (m983getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(f11) == Math.signum(-Float.intBitsToFloat((int) (m983getUpDownDifferenceF1C5BW0$foundation_release() >> 32)))) {
            return true;
        }
        return isNotGestureAction$foundation_release();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i12 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.scrollPosition.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                i11 = currentPage;
            } catch (Throwable th2) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th2;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i11);
    }

    private final void notifyPrefetch(float f11, PagerLayoutInfo pagerLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            boolean z11 = f11 > 0.0f;
            int index = z11 ? ((PageInfo) r0.u3(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + pagerLayoutInfo.getBeyondViewportPageCount() + 1 : (((PageInfo) r0.G2(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1;
            if (index < 0 || index >= getPageCount()) {
                return;
            }
            if (index != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z11 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                    prefetchHandle3.cancel();
                }
                this.wasPrefetchingForward = z11;
                this.indexToPrefetch = index;
                this.currentPrefetchHandle = this.prefetchState.m903schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
            }
            if (z11) {
                if ((((PageInfo) r0.u3(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() + (pagerLayoutInfo.getPageSize() + pagerLayoutInfo.getPageSpacing())) - pagerLayoutInfo.getViewportEndOffset() >= f11 || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.markAsUrgent();
                return;
            }
            if (pagerLayoutInfo.getViewportStartOffset() - ((PageInfo) r0.G2(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() >= (-f11) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f11) {
        PagerMeasureResult pagerMeasureResult;
        long currentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f12 = this.accumulator + f11;
        long N0 = d.N0(f12);
        this.accumulator = f12 - N0;
        if (Math.abs(f11) < 1.0E-4f) {
            return f11;
        }
        long j11 = currentAbsoluteScrollOffset + N0;
        long K = u.K(j11, this.minScrollOffset, this.maxScrollOffset);
        boolean z11 = j11 != K;
        long j12 = K - currentAbsoluteScrollOffset;
        float f13 = j12;
        this.previousPassDelta = f13;
        if (Math.abs(j12) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f13 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f13 < 0.0f));
        }
        int i11 = (int) j12;
        int i12 = -i11;
        PagerMeasureResult copyWithScrollDeltaWithoutRemeasure = this.pagerLayoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(i12);
        if (copyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            PagerMeasureResult copyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult != null ? pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i12) : null;
            if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
            } else {
                copyWithScrollDeltaWithoutRemeasure = null;
            }
        }
        if (copyWithScrollDeltaWithoutRemeasure != null) {
            applyMeasureResult$foundation_release(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
            ObservableScopeInvalidator.m912invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i11);
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z11 ? Long.valueOf(j12) : Float.valueOf(f11)).floatValue();
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i11, float f11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        pagerState.requestScrollToPage(i11, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r8.scroll(r6, r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r5.awaitScrollDependencies(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, x00.p<? super androidx.compose.foundation.gestures.ScrollScope, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r7, j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.e.n(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            x00.p r7 = (x00.p) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.e.n(r8)
            goto L5c
        L4a:
            kotlin.e.n(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 != r1) goto L5c
            goto L7a
        L5c:
            boolean r8 = r5.isScrollInProgress()
            if (r8 != 0) goto L69
            int r8 = r5.getCurrentPage()
            r5.setSettledPageState(r8)
        L69:
            androidx.compose.foundation.gestures.ScrollableState r8 = r5.scrollableState
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r6 = -1
            r5.setProgrammaticScrollTargetPage(r6)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, x00.p, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i11, float f11, c cVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        return pagerState.scrollToPage(i11, f11, cVar);
    }

    private final void setCanScrollBackward(boolean z11) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void setCanScrollForward(boolean z11) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void setProgrammaticScrollTargetPage(int i11) {
        this.programmaticScrollTargetPage$delegate.setIntValue(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    private final void setSettledPageState(int i11) {
        this.settledPageState$delegate.setIntValue(i11);
    }

    private final void tryRunPrefetch(PagerMeasureResult pagerMeasureResult) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                notifyPrefetch(this.previousPassDelta, pagerMeasureResult);
            }
            g2 g2Var = g2.f100423a;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i11, float f11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i11, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, null, r3, r4, 1, null) != r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r12, @androidx.annotation.FloatRange(from = -0.5d, to = 0.5d) float r13, @m80.k androidx.compose.animation.core.AnimationSpec<java.lang.Float> r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r11, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.e.n(r15)
            goto Lc5
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            float r13 = r4.F$0
            int r12 = r4.I$0
            java.lang.Object r14 = r4.L$1
            androidx.compose.animation.core.AnimationSpec r14 = (androidx.compose.animation.core.AnimationSpec) r14
            java.lang.Object r1 = r4.L$0
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            kotlin.e.n(r15)
        L46:
            r9 = r14
            goto L76
        L48:
            kotlin.e.n(r15)
            int r15 = r11.getCurrentPage()
            if (r12 != r15) goto L5a
            float r15 = r11.getCurrentPageOffsetFraction()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L5a
            goto L60
        L5a:
            int r15 = r11.getPageCount()
            if (r15 != 0) goto L63
        L60:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        L63:
            r4.L$0 = r11
            r4.L$1 = r14
            r4.I$0 = r12
            r4.F$0 = r13
            r4.label = r3
            java.lang.Object r15 = r11.awaitScrollDependencies(r4)
            if (r15 != r0) goto L74
            goto Lc4
        L74:
            r1 = r11
            goto L46
        L76:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r6 = 0
            if (r5 > 0) goto L85
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 > 0) goto L85
            goto L86
        L85:
            r3 = r6
        L86:
            if (r3 != 0) goto La1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "pageOffsetFraction "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(r14)
        La1:
            int r7 = r1.coerceInPageRange(r12)
            int r12 = r1.getPageSizeWithSpacing$foundation_release()
            float r12 = (float) r12
            float r8 = r13 * r12
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r10 = 0
            r6 = r1
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 0
            r4.L$0 = r12
            r4.L$1 = r12
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto Lc5
        Lc4:
            return r0
        Lc5:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, j00.c):java.lang.Object");
    }

    public final void applyMeasureResult$foundation_release(@k PagerMeasureResult pagerMeasureResult, boolean z11, boolean z12) {
        long calculateNewMinScrollOffset;
        if (!z11 && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = pagerMeasureResult;
            return;
        }
        if (z11) {
            this.hasLookaheadOccurred = true;
        }
        if (z12) {
            this.scrollPosition.updateCurrentPageOffsetFraction(pagerMeasureResult.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(pagerMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(pagerMeasureResult);
        }
        this.pagerLayoutInfoState.setValue(pagerMeasureResult);
        setCanScrollForward(pagerMeasureResult.getCanScrollForward());
        setCanScrollBackward(pagerMeasureResult.getCanScrollBackward());
        MeasuredPage firstVisiblePage = pagerMeasureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = pagerMeasureResult.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(pagerMeasureResult);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
        calculateNewMinScrollOffset = PagerStateKt.calculateNewMinScrollOffset(pagerMeasureResult, getPageCount());
        this.minScrollOffset = calculateNewMinScrollOffset;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f11) {
        return this.scrollableState.dispatchRawDelta(f11);
    }

    @l
    public final PagerMeasureResult getApproachLayoutInfo$foundation_release() {
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
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    @k
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.firstVisiblePageOffset;
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

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    @k
    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getLayoutWithMeasurement$foundation_release() {
        return this.layoutWithMeasurement;
    }

    public final long getMaxScrollOffset$foundation_release() {
        return this.maxScrollOffset;
    }

    @k
    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<g2> m980getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public final long getMinScrollOffset$foundation_release() {
        return this.minScrollOffset;
    }

    @k
    public final g10.l getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    public final float getOffsetDistanceInPages(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= getPageCount()) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("page " + i11 + " is not within the range 0 to " + getPageCount());
        }
        return (i11 - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    @k
    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.pinnedPages;
    }

    @k
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<g2> m981getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.density.mo377toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    @k
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m982getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    @l
    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    @k
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m983getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m2278unboximpl();
    }

    public final boolean isNotGestureAction$foundation_release() {
        return ((int) Float.intBitsToFloat((int) (m983getUpDownDifferenceF1C5BW0$foundation_release() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m983getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L))) == 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation_release(@k PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i11) {
        return this.scrollPosition.matchPageWithKey(pagerLazyLayoutItemProvider, i11);
    }

    public final void requestScrollToPage(@IntRange(from = 0) int i11, @FloatRange(from = -0.5d, to = 0.5d) float f11) {
        if (isScrollInProgress()) {
            c40.k.f(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new PagerState$requestScrollToPage$1(this, null), 3, null);
        }
        snapToItem$foundation_release(i11, f11, false);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @l
    public Object scroll(@k MutatePriority mutatePriority, @k p<? super ScrollScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        return scroll$suspendImpl(this, mutatePriority, pVar, cVar);
    }

    @l
    public final Object scrollToPage(int i11, @FloatRange(from = -0.5d, to = 0.5d) float f11, @k c<? super g2> cVar) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new PagerState$scrollToPage$2(this, f11, i11, null), cVar, 1, null);
        return scroll$default == b.l() ? scroll$default : g2.f100423a;
    }

    public final void setDensity$foundation_release(@k Density density) {
        this.density = density;
    }

    public final void setMaxScrollOffset$foundation_release(long j11) {
        this.maxScrollOffset = j11;
    }

    public final void setMinScrollOffset$foundation_release(long j11) {
        this.minScrollOffset = j11;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z11) {
        this.prefetchingEnabled = z11;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m984setPremeasureConstraintsBRTryo0$foundation_release(long j11) {
        this.premeasureConstraints = j11;
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m985setUpDownDifferencek4lQ0M$foundation_release(long j11) {
        this.upDownDifference$delegate.setValue(Offset.m2257boximpl(j11));
    }

    public final void snapToItem$foundation_release(int i11, float f11, boolean z11) {
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i11, f11);
        if (!z11) {
            ObservableScopeInvalidator.m912invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    public final void updateCurrentPage(@k ScrollScope scrollScope, int i11, @FloatRange(from = -0.5d, to = 0.5d) float f11) {
        snapToItem$foundation_release(i11, f11, true);
    }

    public final void updateTargetPage(@k ScrollScope scrollScope, int i11) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i11));
    }

    public PagerState(int i11, @FloatRange(from = -0.5d, to = 0.5d) float f11, @l PrefetchScheduler prefetchScheduler) {
        PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1;
        double d11 = f11;
        boolean z11 = false;
        if (-0.5d <= d11 && d11 <= 0.5d) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2257boximpl(Offset.Companion.m2284getZeroF1C5BW0()), null, 2, null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i11, f11, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i11;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.ScrollableState(new x00.l<Float, Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f12) {
                float performScroll;
                performScroll = PagerState.this.performScroll(f12);
                return Float.valueOf(performScroll);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f12) {
                return invoke(f12.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        pagerStateKt$UnitDensity$1 = PagerStateKt.UnitDensity;
        this.density = pagerStateKt$UnitDensity$1;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i11);
        this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Integer invoke() {
                return Integer.valueOf(PagerState.this.isScrollInProgress() ? PagerState.this.getSettledPageState() : PagerState.this.getCurrentPage());
            }
        });
        this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Integer invoke() {
                int programmaticScrollTargetPage;
                int programmaticScrollTargetPage2;
                int coerceInPageRange;
                if (PagerState.this.isScrollInProgress()) {
                    programmaticScrollTargetPage = PagerState.this.getProgrammaticScrollTargetPage();
                    programmaticScrollTargetPage2 = programmaticScrollTargetPage != -1 ? PagerState.this.getProgrammaticScrollTargetPage() : Math.abs(PagerState.this.getCurrentPageOffsetFraction()) >= Math.abs(PagerState.this.getPositionThresholdFraction$foundation_release()) ? PagerState.this.getLastScrolledForward() ? PagerState.this.getFirstVisiblePage$foundation_release() + 1 : PagerState.this.getFirstVisiblePage$foundation_release() : PagerState.this.getCurrentPage();
                } else {
                    programmaticScrollTargetPage2 = PagerState.this.getCurrentPage();
                }
                coerceInPageRange = PagerState.this.coerceInPageRange(programmaticScrollTargetPage2);
                return Integer.valueOf(coerceInPageRange);
            }
        });
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new x00.l<NestedPrefetchScope, g2>() { // from class: androidx.compose.foundation.pager.PagerState$prefetchState$1
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
                Snapshot.Companion companion = Snapshot.Companion;
                PagerState pagerState = PagerState.this;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    nestedPrefetchScope.schedulePrefetch(pagerState.getFirstVisiblePage$foundation_release());
                    g2 g2Var = g2.f100423a;
                } finally {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                }
            }
        });
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                PagerState.this.setRemeasurement(remeasurement);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m908constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public /* synthetic */ PagerState(int i11, float f11, PrefetchScheduler prefetchScheduler, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0.0f : f11, (i12 & 4) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i11, float f11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0.0f : f11);
    }

    public PagerState(int i11, @FloatRange(from = -0.5d, to = 0.5d) float f11) {
        this(i11, f11, null);
    }
}
