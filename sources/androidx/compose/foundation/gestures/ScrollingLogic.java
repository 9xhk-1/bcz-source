package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1037:1\n30#2:1038\n30#2:1042\n53#3,3:1039\n53#3,3:1043\n60#3:1047\n70#3:1050\n65#4:1046\n69#4:1049\n22#5:1048\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n*L\n646#1:1038\n647#1:1042\n646#1:1039,3\n647#1:1043,3\n653#1:1047\n653#1:1050\n653#1:1046\n653#1:1049\n653#1:1048\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollingLogic {
    public static final int $stable = 8;

    @k
    private FlingBehavior flingBehavior;
    private boolean isFlinging;

    @k
    private final a<Boolean> isScrollableNodeAttached;
    private int latestScrollSource = NestedScrollSource.Companion.m3625getUserInputWNlRxjI();

    @k
    private NestedScrollDispatcher nestedScrollDispatcher;

    @k
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope;

    @k
    private Orientation orientation;

    @k
    private ScrollScope outerStateScope;

    @l
    private OverscrollEffect overscrollEffect;

    @k
    private final x00.l<Offset, Offset> performScrollForOverscroll;
    private boolean reverseDirection;

    @k
    private ScrollableState scrollableState;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(@k ScrollableState scrollableState, @l OverscrollEffect overscrollEffect, @k FlingBehavior flingBehavior, @k Orientation orientation, boolean z11, @k NestedScrollDispatcher nestedScrollDispatcher, @k a<Boolean> aVar) {
        ScrollScope scrollScope;
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z11;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = aVar;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.outerStateScope = scrollScope;
        this.nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollBy-OzD1aCk */
            public long mo469scrollByOzD1aCk(long j11, int i11) {
                ScrollScope scrollScope2;
                long m506performScroll3eAAhYA;
                scrollScope2 = ScrollingLogic.this.outerStateScope;
                m506performScroll3eAAhYA = ScrollingLogic.this.m506performScroll3eAAhYA(scrollScope2, j11, i11);
                return m506performScroll3eAAhYA;
            }

            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollByWithOverscroll-OzD1aCk */
            public long mo470scrollByWithOverscrollOzD1aCk(long j11, int i11) {
                OverscrollEffect overscrollEffect2;
                ScrollScope scrollScope2;
                long m506performScroll3eAAhYA;
                boolean shouldDispatchOverscroll;
                int i12;
                x00.l<? super Offset, Offset> lVar;
                ScrollingLogic.this.latestScrollSource = i11;
                overscrollEffect2 = ScrollingLogic.this.overscrollEffect;
                if (overscrollEffect2 != null) {
                    shouldDispatchOverscroll = ScrollingLogic.this.getShouldDispatchOverscroll();
                    if (shouldDispatchOverscroll) {
                        i12 = ScrollingLogic.this.latestScrollSource;
                        lVar = ScrollingLogic.this.performScrollForOverscroll;
                        return overscrollEffect2.mo214applyToScrollRhakbz0(j11, i12, lVar);
                    }
                }
                scrollScope2 = ScrollingLogic.this.outerStateScope;
                m506performScroll3eAAhYA = ScrollingLogic.this.m506performScroll3eAAhYA(scrollScope2, j11, i11);
                return m506performScroll3eAAhYA;
            }
        };
        this.performScrollForOverscroll = new x00.l<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                return Offset.m2257boximpl(m519invokeMKHz9U(offset.m2278unboximpl()));
            }

            /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
            public final long m519invokeMKHz9U(long j11) {
                ScrollScope scrollScope2;
                int i11;
                long m506performScroll3eAAhYA;
                scrollScope2 = ScrollingLogic.this.outerStateScope;
                ScrollingLogic scrollingLogic = ScrollingLogic.this;
                i11 = scrollingLogic.latestScrollSource;
                m506performScroll3eAAhYA = scrollingLogic.m506performScroll3eAAhYA(scrollScope2, j11, i11);
                return m506performScroll3eAAhYA;
            }
        };
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m505dispatchRawDeltaMKHz9U(long j11) {
        return m516toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m515toFloatk4lQ0M(j11)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m506performScroll3eAAhYA(ScrollScope scrollScope, long j11, int i11) {
        long m3609dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m3609dispatchPreScrollOzD1aCk(j11, i11);
        long m2272minusMKHz9U = Offset.m2272minusMKHz9U(j11, m3609dispatchPreScrollOzD1aCk);
        long m513reverseIfNeededMKHz9U = m513reverseIfNeededMKHz9U(m516toOffsettuRUvjQ(scrollScope.scrollBy(m515toFloatk4lQ0M(m513reverseIfNeededMKHz9U(m514singleAxisOffsetMKHz9U(m2272minusMKHz9U))))));
        return Offset.m2273plusMKHz9U(Offset.m2273plusMKHz9U(m3609dispatchPreScrollOzD1aCk, m513reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m3607dispatchPostScrollDzOQY0M(m513reverseIfNeededMKHz9U, Offset.m2272minusMKHz9U(m2272minusMKHz9U, m513reverseIfNeededMKHz9U), i11));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, p pVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelFling(float f11) {
        if (f11 <= 0.0f || this.scrollableState.getCanScrollForward()) {
            return (f11 < 0.0f && !this.scrollableState.getCanScrollBackward()) || !this.isScrollableNodeAttached.invoke().booleanValue();
        }
        return true;
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m507singleAxisVelocityAH228Gc(long j11) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5349copyOhffZ5M$default(j11, 0.0f, 0.0f, 1, null) : Velocity.m5349copyOhffZ5M$default(j11, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m508toFloatTH1AsA0(long j11) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5353getXimpl(j11) : Velocity.m5354getYimpl(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m509updateQWom1Mo(long j11, float f11) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5349copyOhffZ5M$default(j11, f11, 0.0f, 2, null) : Velocity.m5349copyOhffZ5M$default(j11, 0.0f, f11, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m510doFlingAnimationQWom1Mo(long r11, @m80.k j00.c<? super androidx.compose.ui.unit.Velocity> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.L$1
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref.LongRef) r11
            java.lang.Object r12 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r12 = (androidx.compose.foundation.gestures.ScrollingLogic) r12
            kotlin.e.n(r13)
            r5 = r10
            goto L5f
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.e.n(r13)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r6.element = r11
            r10.isFlinging = r3
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r11 = r10.scroll(r13, r4, r0)
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r12 = r5
            r11 = r6
        L5f:
            r13 = 0
            r12.isFlinging = r13
            long r11 = r11.element
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m5344boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m510doFlingAnimationQWom1Mo(long, j00.c):java.lang.Object");
    }

    @k
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final boolean isFlinging() {
        return this.isFlinging;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    @l
    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m511onScrollStoppedBMRW4eQ(long j11, boolean z11, @k c<? super g2> cVar) {
        boolean shouldBeTriggeredByMouseWheel;
        if (z11) {
            shouldBeTriggeredByMouseWheel = ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior);
            if (!shouldBeTriggeredByMouseWheel) {
                return g2.f100423a;
            }
        }
        long m507singleAxisVelocityAH228Gc = m507singleAxisVelocityAH228Gc(j11);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
            Object invoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m5344boximpl(m507singleAxisVelocityAH228Gc), cVar);
            return invoke == b.l() ? invoke : g2.f100423a;
        }
        Object mo213applyToFlingBMRW4eQ = overscrollEffect.mo213applyToFlingBMRW4eQ(m507singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, cVar);
        return mo213applyToFlingBMRW4eQ == b.l() ? mo213applyToFlingBMRW4eQ : g2.f100423a;
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m512performRawScrollMKHz9U(long j11) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m2284getZeroF1C5BW0() : m505dispatchRawDeltaMKHz9U(j11);
    }

    public final float reverseIfNeeded(float f11) {
        return this.reverseDirection ? f11 * (-1) : f11;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m513reverseIfNeededMKHz9U(long j11) {
        return this.reverseDirection ? Offset.m2275timestuRUvjQ(j11, -1.0f) : j11;
    }

    @l
    public final Object scroll(@k MutatePriority mutatePriority, @k p<? super NestedScrollScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object scroll = this.scrollableState.scroll(mutatePriority, new ScrollingLogic$scroll$2(this, pVar, null), cVar);
        return scroll == b.l() ? scroll : g2.f100423a;
    }

    public final void setScrollableState(@k ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m514singleAxisOffsetMKHz9U(long j11) {
        return this.orientation == Orientation.Horizontal ? Offset.m2262copydBAh8RU$default(j11, 0.0f, 0.0f, 1, null) : Offset.m2262copydBAh8RU$default(j11, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m515toFloatk4lQ0M(long j11) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j11 >> 32 : j11 & 4294967295L));
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m516toOffsettuRUvjQ(float f11) {
        if (f11 == 0.0f) {
            return Offset.Companion.m2284getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m517toVelocityadjELrA(float f11) {
        return f11 == 0.0f ? Velocity.Companion.m5364getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f11, 0.0f) : VelocityKt.Velocity(0.0f, f11);
    }

    public final boolean update(@k ScrollableState scrollableState, @k Orientation orientation, @l OverscrollEffect overscrollEffect, boolean z11, @k FlingBehavior flingBehavior, @k NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z12;
        boolean z13 = true;
        if (g0.g(this.scrollableState, scrollableState)) {
            z12 = false;
        } else {
            this.scrollableState = scrollableState;
            z12 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z12 = true;
        }
        if (this.reverseDirection != z11) {
            this.reverseDirection = z11;
        } else {
            z13 = z12;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z13;
    }
}
