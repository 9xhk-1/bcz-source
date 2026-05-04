package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c40.n;
import c40.p;
import j00.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import l00.f;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 11 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,471:1\n50#2,5:472\n50#2,5:489\n314#3,11:477\n1#4:488\n61#5:494\n57#5:497\n61#5:519\n57#5:526\n57#5:537\n61#5:540\n70#6:495\n60#6:498\n60#6:514\n70#6:517\n70#6:520\n53#6,3:523\n60#6:527\n53#6,3:530\n85#6:534\n90#6:536\n60#6:538\n70#6:541\n22#7:496\n22#7:499\n22#7:515\n22#7:518\n22#7:521\n22#7:528\n22#7:539\n22#7:542\n107#8,2:500\n109#8:511\n447#9,9:502\n150#10:512\n65#10:513\n69#10:516\n30#11:522\n30#11:529\n54#12:533\n59#12:535\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n119#1:472,5\n203#1:489,5\n135#1:477,11\n345#1:494\n351#1:497\n410#1:519\n420#1:526\n435#1:537\n436#1:540\n345#1:495\n351#1:498\n395#1:514\n396#1:517\n410#1:520\n403#1:523,3\n420#1:527\n414#1:530,3\n429#1:534\n430#1:536\n435#1:538\n436#1:541\n345#1:496\n351#1:499\n395#1:515\n396#1:518\n410#1:521\n420#1:528\n435#1:539\n436#1:542\n359#1:500,2\n359#1:511\n359#1:502,9\n385#1:512\n395#1:513\n396#1:516\n403#1:522\n414#1:529\n429#1:533\n430#1:535\n*E\n"})
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @l
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;

    @l
    private LayoutCoordinates focusedChild;
    private boolean isAnimationRunning;

    @k
    private Orientation orientation;
    private boolean reverseDirection;

    @k
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;

    @k
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.Companion.m5291getZeroYbymL2g();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"})
    public static final class Request {
        public static final int $stable = 8;

        @k
        private final n<g2> continuation;

        @k
        private final a<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(@k a<Rect> aVar, @k n<? super g2> nVar) {
            this.currentBounds = aVar;
            this.continuation = nVar;
        }

        @k
        public final n<g2> getContinuation() {
            return this.continuation;
        }

        @k
        public final a<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
        
            if (r0 == null) goto L10;
         */
        @m80.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                c40.n<yz.g2> r0 = r4.continuation
                kotlin.coroutines.d r0 = r0.getContext()
                c40.q0$a r1 = c40.q0.f7924b
                kotlin.coroutines.d$b r0 = r0.get(r1)
                c40.q0 r0 = (c40.q0) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.H()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                x00.a<androidx.compose.ui.geometry.Rect> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                c40.n<yz.g2> r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.Request.toString():java.lang.String");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(@k Orientation orientation, @k ScrollingLogic scrollingLogic, boolean z11, @l BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = z11;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.m5284equalsimpl0(this.viewportSize, IntSize.Companion.m5291getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            findBringIntoViewRequest = this.trackingFocusedChild ? getFocusedChildBounds() : null;
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(this.viewportSize);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i11 == 1) {
            return bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getTop(), findBringIntoViewRequest.getBottom() - findBringIntoViewRequest.getTop(), Float.intBitsToFloat((int) (m5298toSizeozmzZPI & 4294967295L)));
        }
        if (i11 == 2) {
            return bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getLeft(), findBringIntoViewRequest.getRight() - findBringIntoViewRequest.getLeft(), Float.intBitsToFloat((int) (m5298toSizeozmzZPI >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m404compareToTemP2vQ(long j11, long j12) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i11 == 1) {
            return g0.t((int) (j11 & 4294967295L), (int) (j12 & 4294967295L));
        }
        if (i11 == 2) {
            return g0.t((int) (j11 >> 32), (int) (j12 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m405compareToiLBOSCw(long j11, long j12) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i11 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
        }
        if (i11 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 >> 32)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m406computeDestinationO0kMr_c(Rect rect, long j11) {
        return rect.m2305translatek4lQ0M(Offset.m2260constructorimpl(m409relocationOffsetBMxPBkI(rect, j11) ^ (-9223372034707292160L)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        Rect rect = null;
        if (size < objArr.length) {
            while (size >= 0) {
                Rect invoke = ((Request) objArr[size]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m405compareToiLBOSCw(invoke.m2301getSizeNHjbRc(), IntSizeKt.m5298toSizeozmzZPI(this.viewportSize)) > 0) {
                        return rect == null ? invoke : rect;
                    }
                    rect = invoke;
                }
                size--;
            }
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        if (!isAttached()) {
            return null;
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates layoutCoordinates = this.focusedChild;
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return requireLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, false);
            }
        }
        return null;
    }

    /* renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m407isMaxVisibleO0kMr_c(Rect rect, long j11) {
        long m409relocationOffsetBMxPBkI = m409relocationOffsetBMxPBkI(rect, j11);
        return Math.abs(Float.intBitsToFloat((int) (m409relocationOffsetBMxPBkI >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (m409relocationOffsetBMxPBkI & 4294967295L))) <= 0.5f;
    }

    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m408isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m407isMaxVisibleO0kMr_c(rect, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        BringIntoViewSpec requireBringIntoViewSpec = requireBringIntoViewSpec();
        if (this.isAnimationRunning) {
            InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
        }
        c40.k.f(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new UpdatableAnimationState(BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec$foundation_release()), requireBringIntoViewSpec, null), 1, null);
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m409relocationOffsetBMxPBkI(Rect rect, long j11) {
        long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(j11);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Offset.m2260constructorimpl((Float.floatToRawIntBits(requireBringIntoViewSpec().calculateScrollDistance(rect.getLeft(), rect.getRight() - rect.getLeft(), Float.intBitsToFloat((int) (m5298toSizeozmzZPI >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        float calculateScrollDistance = requireBringIntoViewSpec().calculateScrollDistance(rect.getTop(), rect.getBottom() - rect.getTop(), Float.intBitsToFloat((int) (m5298toSizeozmzZPI & 4294967295L)));
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(calculateScrollDistance) & 4294967295L));
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec bringIntoViewSpec = this.bringIntoViewSpec;
        return bringIntoViewSpec == null ? (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec()) : bringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @l
    public Object bringChildIntoView(@k a<Rect> aVar, @k c<? super g2> cVar) {
        Rect invoke = aVar.invoke();
        if (invoke == null || m408isMaxVisibleO0kMr_c$default(this, invoke, 0L, 1, null)) {
            return g2.f100423a;
        }
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        if (this.bringIntoViewRequests.enqueue(new Request(aVar, pVar)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object F = pVar.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        return F == b.l() ? F : g2.f100423a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @k
    public Rect calculateRectForParent(@k Rect rect) {
        if (IntSize.m5284equalsimpl0(this.viewportSize, IntSize.Companion.m5291getZeroYbymL2g())) {
            InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return m406computeDestinationO0kMr_c(rect, this.viewportSize);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m410getViewportSizeYbymL2g$foundation_release() {
        return this.viewportSize;
    }

    public final void onFocusBoundsChanged(@l LayoutCoordinates layoutCoordinates) {
        Rect focusedChildBounds;
        this.focusedChild = layoutCoordinates;
        if (this.childWasMaxVisibleBeforeViewportShrunk && (focusedChildBounds = getFocusedChildBounds()) != null && !m407isMaxVisibleO0kMr_c(focusedChildBounds, this.viewportSize)) {
            this.trackingFocusedChild = true;
            launchAnimation();
        }
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo365onRemeasuredozmzZPI(long j11) {
        Rect focusedChildBounds;
        long j12 = this.viewportSize;
        this.viewportSize = j11;
        if (m404compareToTemP2vQ(j11, j12) >= 0 || this.isAnimationRunning || this.trackingFocusedChild || (focusedChildBounds = getFocusedChildBounds()) == null || !m407isMaxVisibleO0kMr_c(focusedChildBounds, j12)) {
            return;
        }
        this.childWasMaxVisibleBeforeViewportShrunk = true;
    }

    public final void update(@k Orientation orientation, boolean z11, @l BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = z11;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
