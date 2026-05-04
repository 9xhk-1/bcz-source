package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1753:1\n1#2:1754\n30#3:1755\n53#4,3:1756\n70#4:1760\n60#4:1763\n69#5:1759\n65#5:1762\n22#6:1761\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n*L\n517#1:1755\n517#1:1756,3\n530#1:1760\n530#1:1763\n530#1:1759\n530#1:1762\n530#1:1761\n*E\n"})
/* loaded from: classes.dex */
final class AnchoredDraggableNode<T> extends DragGestureNode {

    @l
    private Density density;

    @l
    private FlingBehavior flingBehavior;

    @k
    private Orientation orientation;

    @l
    private OverscrollEffect overscrollEffect;
    public FlingBehavior resolvedFlingBehavior;

    @l
    private Boolean reverseDirection;

    @l
    private Boolean startDragImmediately;

    @k
    private AnchoredDraggableState<T> state;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnchoredDraggableNode(@m80.k androidx.compose.foundation.gestures.AnchoredDraggableState<T> r2, @m80.k androidx.compose.foundation.gestures.Orientation r3, boolean r4, @m80.l java.lang.Boolean r5, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r6, @m80.l androidx.compose.foundation.OverscrollEffect r7, @m80.l java.lang.Boolean r8, @m80.l androidx.compose.foundation.gestures.FlingBehavior r9) {
        /*
            r1 = this;
            x00.l r0 = androidx.compose.foundation.gestures.AnchoredDraggableKt.access$getAlwaysDrag$p()
            r1.<init>(r0, r4, r6, r3)
            r1.state = r2
            r1.orientation = r3
            r1.reverseDirection = r5
            r1.overscrollEffect = r7
            r1.startDragImmediately = r8
            r1.flingBehavior = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.<init>(androidx.compose.foundation.gestures.AnchoredDraggableState, androidx.compose.foundation.gestures.Orientation, boolean, java.lang.Boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.OverscrollEffect, java.lang.Boolean, androidx.compose.foundation.gestures.FlingBehavior):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fling(float r8, j00.c<? super java.lang.Float> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            if (r0 == 0) goto L14
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1) r0
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
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r4.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.e.n(r9)
            goto L73
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.e.n(r9)
            return r9
        L3e:
            kotlin.e.n(r9)
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9 = r7.state
            boolean r9 = r9.getUsePreModifierChangeBehavior$foundation_release()
            if (r9 == 0) goto L55
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r9 = r7.state
            r4.label = r3
            java.lang.Object r8 = r9.settle(r8, r4)
            if (r8 != r0) goto L54
            goto L71
        L54:
            return r8
        L55:
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r9.element = r8
            androidx.compose.foundation.gestures.AnchoredDraggableState<T> r1 = r7.state
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 r3 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2
            r5 = 0
            r3.<init>(r7, r9, r8, r5)
            r4.L$0 = r9
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L72
        L71:
            return r0
        L72:
            r8 = r9
        L73:
            float r8 = r8.element
            java.lang.Float r8 = l00.a.e(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.fling(float, j00.c):java.lang.Object");
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        g0.m(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m389reverseIfNeededAH228Gc(long j11) {
        return Velocity.m5359timesadjELrA(j11, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m390reverseIfNeededMKHz9U(long j11) {
        return Offset.m2275timestuRUvjQ(j11, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m391toFloatTH1AsA0(long j11) {
        return this.orientation == Orientation.Vertical ? Velocity.m5354getYimpl(j11) : Velocity.m5353getXimpl(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m392toFloatk4lQ0M(long j11) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Vertical ? j11 & 4294967295L : j11 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m393toOffsettuRUvjQ(float f11) {
        Orientation orientation = this.orientation;
        float f12 = orientation == Orientation.Horizontal ? f11 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f11 = 0.0f;
        }
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m394toVelocityadjELrA(float f11) {
        Orientation orientation = this.orientation;
        float f12 = orientation == Orientation.Horizontal ? f11 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f11 = 0.0f;
        }
        return VelocityKt.Velocity(f12, f11);
    }

    private final void updateDensity() {
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        Density density = this.density;
        if (density == null || !g0.g(density, requireDensity)) {
            this.density = requireDensity;
            updateFlingBehavior(this.flingBehavior);
        }
    }

    private final void updateFlingBehavior(FlingBehavior flingBehavior) {
        if (flingBehavior == null) {
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnimationSpec<Float> snapAnimationSpec = anchoredDraggableDefaults.getSnapAnimationSpec();
            x00.l<Float, Float> positionalThreshold = anchoredDraggableDefaults.getPositionalThreshold();
            Density requireDensity = DelegatableNodeKt.requireDensity(this);
            this.density = requireDensity;
            flingBehavior = AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.state, requireDensity, positionalThreshold, snapAnimationSpec);
        }
        setResolvedFlingBehavior(flingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    @l
    public Object drag(@k p<? super x00.l<? super DragEvent.DragDelta, g2>, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.state, null, new AnchoredDraggableNode$drag$2(pVar, this, null), cVar, 1, null);
        return anchoredDrag$default == b.l() ? anchoredDrag$default : g2.f100423a;
    }

    @k
    public final FlingBehavior getResolvedFlingBehavior() {
        FlingBehavior flingBehavior = this.resolvedFlingBehavior;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        g0.S("resolvedFlingBehavior");
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStopped-TH1AsA0, reason: not valid java name */
    public void mo396onDragStoppedTH1AsA0(long j11) {
        if (isAttached()) {
            c40.k.f(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, j11, null), 3, null);
        }
    }

    public final void setResolvedFlingBehavior(@k FlingBehavior flingBehavior) {
        this.resolvedFlingBehavior = flingBehavior;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.isAnimationRunning();
    }

    public final void update(@k AnchoredDraggableState<T> anchoredDraggableState, @k Orientation orientation, boolean z11, @l Boolean bool, @l MutableInteractionSource mutableInteractionSource, @l OverscrollEffect overscrollEffect, @l Boolean bool2, @l FlingBehavior flingBehavior) {
        boolean z12;
        boolean z13;
        this.flingBehavior = flingBehavior;
        if (g0.g(this.state, anchoredDraggableState)) {
            z12 = false;
        } else {
            this.state = anchoredDraggableState;
            updateFlingBehavior(flingBehavior);
            z12 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z12 = true;
        }
        if (g0.g(this.reverseDirection, bool)) {
            z13 = z12;
        } else {
            this.reverseDirection = bool;
            z13 = true;
        }
        this.startDragImmediately = bool2;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, z11, mutableInteractionSource, orientation, z13, 1, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo395onDragStartedk4lQ0M(long j11) {
    }
}
