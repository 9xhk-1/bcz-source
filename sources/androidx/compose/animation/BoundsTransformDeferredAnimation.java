package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c40.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,444:1\n148#2:445\n153#2:446\n148#2:450\n148#2:456\n273#3:447\n278#3:448\n273#3:449\n273#3:455\n85#4:451\n113#4,2:452\n150#5:454\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsTransformDeferredAnimation\n*L\n295#1:445\n301#1:446\n329#1:450\n414#1:456\n311#1:447\n316#1:448\n329#1:449\n414#1:455\n344#1:451\n344#1:452,2\n405#1:454\n*E\n"})
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation {
    public static final int $stable = 8;
    private long additionalOffset;

    @l
    private Animatable<Rect, AnimationVector4D> animatable;

    @k
    private final MutableState animatedValue$delegate;
    private long currentPosition;
    private long currentSize;

    @l
    private List<LayoutCoordinates> directManipulationParents;
    private boolean isPending;
    private long targetOffset;
    private long targetSize;

    public BoundsTransformDeferredAnimation() {
        Size.Companion companion = Size.Companion;
        this.targetSize = companion.m2345getUnspecifiedNHjbRc();
        Offset.Companion companion2 = Offset.Companion;
        this.targetOffset = companion2.m2283getUnspecifiedF1C5BW0();
        this.currentPosition = companion2.m2283getUnspecifiedF1C5BW0();
        this.currentSize = companion.m2345getUnspecifiedNHjbRc();
        this.animatedValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.additionalOffset = companion2.m2284getZeroF1C5BW0();
    }

    private final Rect animate(r0 r0Var, BoundsTransform boundsTransform) {
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation;
        Rect value;
        long j11 = this.targetOffset;
        if ((9223372034707292159L & j11) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            long j12 = this.targetSize;
            if (j12 != InlineClassHelperKt.UnspecifiedPackedFloats) {
                Rect m2308Recttz77jQw = RectKt.m2308Recttz77jQw(j11, j12);
                Animatable<Rect, AnimationVector4D> animatable = this.animatable;
                if (animatable == null) {
                    animatable = new Animatable<>(m2308Recttz77jQw, VectorConvertersKt.getVectorConverter(Rect.Companion), null, null, 12, null);
                }
                this.animatable = animatable;
                if (this.isPending) {
                    this.isPending = false;
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    BoundsTransformDeferredAnimation$animate$1 boundsTransformDeferredAnimation$animate$1 = new BoundsTransformDeferredAnimation$animate$1(animatable, m2308Recttz77jQw, boundsTransform, this, null);
                    boundsTransformDeferredAnimation = this;
                    c40.k.f(r0Var, null, coroutineStart, boundsTransformDeferredAnimation$animate$1, 1, null);
                    Animatable<Rect, AnimationVector4D> animatable2 = boundsTransformDeferredAnimation.animatable;
                    return (animatable2 != null || (value = animatable2.getValue()) == null) ? Rect.Companion.getZero() : value;
                }
            }
        }
        boundsTransformDeferredAnimation = this;
        Animatable<Rect, AnimationVector4D> animatable22 = boundsTransformDeferredAnimation.animatable;
        if (animatable22 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect getAnimatedValue() {
        return (Rect) this.animatedValue$delegate.getValue();
    }

    private final void setAnimatedValue(Rect rect) {
        this.animatedValue$delegate.setValue(rect);
    }

    /* renamed from: updateTargetOffset-k-4lQ0M, reason: not valid java name */
    private final void m68updateTargetOffsetk4lQ0M(long j11) {
        if ((this.targetOffset & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats && !IntOffset.m5242equalsimpl0(IntOffsetKt.m5260roundk4lQ0M(j11), IntOffsetKt.m5260roundk4lQ0M(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = j11;
        if ((this.currentPosition & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentPosition = j11;
        }
    }

    @l
    public final Rect getCurrentBounds() {
        long j11 = this.currentSize;
        long j12 = this.currentPosition;
        if ((9223372034707292159L & j12) == InlineClassHelperKt.UnspecifiedPackedFloats || j11 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return null;
        }
        return RectKt.m2308Recttz77jQw(j12, j11);
    }

    /* renamed from: getCurrentSize-NH-jbRc, reason: not valid java name */
    public final long m69getCurrentSizeNHjbRc() {
        return this.currentSize;
    }

    @l
    public final Rect getValue() {
        if (isIdle()) {
            return null;
        }
        return getAnimatedValue();
    }

    public final boolean isIdle() {
        if (this.isPending) {
            return false;
        }
        Animatable<Rect, AnimationVector4D> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    /* renamed from: setCurrentSize-uvyYCjk, reason: not valid java name */
    public final void m70setCurrentSizeuvyYCjk(long j11) {
        this.currentSize = j11;
    }

    /* renamed from: updateCurrentBounds-tz77jQw, reason: not valid java name */
    public final void m71updateCurrentBoundstz77jQw(long j11, long j12) {
        this.currentPosition = j11;
        this.currentSize = j12;
    }

    public final void updateTargetOffsetAndAnimate(@k LookaheadScope lookaheadScope, @k Placeable.PlacementScope placementScope, @k r0 r0Var, boolean z11, boolean z12, @k BoundsTransform boundsTransform) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            LayoutCoordinates lookaheadScopeCoordinates = lookaheadScope.getLookaheadScopeCoordinates(placementScope);
            long m2284getZeroF1C5BW0 = Offset.Companion.m2284getZeroF1C5BW0();
            if (!z12 && z11) {
                List<LayoutCoordinates> list = this.directManipulationParents;
                if (list == null) {
                    list = new ArrayList<>();
                }
                int i11 = 0;
                LayoutCoordinates layoutCoordinates = coordinates;
                while (!g0.g(lookaheadScope.toLookaheadCoordinates(layoutCoordinates), lookaheadScopeCoordinates)) {
                    if (layoutCoordinates.getIntroducesMotionFrameOfReference()) {
                        if (list.size() == i11) {
                            list.add(layoutCoordinates);
                            m2284getZeroF1C5BW0 = Offset.m2273plusMKHz9U(m2284getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(layoutCoordinates));
                        } else if (!g0.g(list.get(i11), layoutCoordinates)) {
                            long m2272minusMKHz9U = Offset.m2272minusMKHz9U(m2284getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(list.get(i11)));
                            list.set(i11, layoutCoordinates);
                            m2284getZeroF1C5BW0 = Offset.m2273plusMKHz9U(m2272minusMKHz9U, LayoutCoordinatesKt.positionInParent(layoutCoordinates));
                        }
                        i11++;
                    }
                    layoutCoordinates = layoutCoordinates.getParentCoordinates();
                    if (layoutCoordinates == null) {
                        break;
                    }
                }
                int size = list.size() - 1;
                if (i11 <= size) {
                    while (true) {
                        m2284getZeroF1C5BW0 = Offset.m2272minusMKHz9U(m2284getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(list.get(size)));
                        list.remove(list.size() - 1);
                        if (size == i11) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = list;
            }
            this.additionalOffset = Offset.m2273plusMKHz9U(this.additionalOffset, m2284getZeroF1C5BW0);
            m68updateTargetOffsetk4lQ0M(Offset.m2273plusMKHz9U(LookaheadScope.m3885localLookaheadPositionOfauaQtc$default(lookaheadScope, lookaheadScopeCoordinates, coordinates, 0L, z12, 2, null), this.additionalOffset));
            setAnimatedValue(animate(r0Var, boundsTransform).m2305translatek4lQ0M(Offset.m2260constructorimpl(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }

    /* renamed from: updateTargetSize-uvyYCjk, reason: not valid java name */
    public final void m72updateTargetSizeuvyYCjk(long j11) {
        if (this.targetSize != InlineClassHelperKt.UnspecifiedPackedFloats && !IntSize.m5284equalsimpl0(IntSizeKt.m5294roundToIntSizeuvyYCjk(j11), IntSizeKt.m5294roundToIntSizeuvyYCjk(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = j11;
        if (this.currentSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentSize = j11;
        }
    }
}
