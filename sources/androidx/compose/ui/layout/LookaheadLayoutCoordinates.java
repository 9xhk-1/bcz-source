package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,201:1\n1#2:202\n30#3:203\n80#4:204\n53#4,3:217\n53#4,3:222\n53#4,3:227\n56#5,5:205\n56#5,5:210\n159#6:215\n159#6:220\n159#6:225\n30#7:216\n30#7:221\n30#7:226\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n35#1:203\n35#1:204\n116#1:217,3\n135#1:222,3\n155#1:227,3\n42#1:205,5\n50#1:210,5\n116#1:215\n135#1:220\n155#1:225\n116#1:216\n135#1:221\n155#1:226\n*E\n"})
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;

    @k
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(@k LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m3884getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m2272minusMKHz9U(mo3866localPositionOfR5De75A(coordinates, companion.m2284getZeroF1C5BW0()), getCoordinator().mo3866localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m2284getZeroF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(@k AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    @k
    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.isPlacedUnderMotionFrameOfReference();
    }

    @k
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui_release = getCoordinator().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @l
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @k
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo3865getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m5281constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @k
    public Rect localBoundingBoxOf(@k LayoutCoordinates layoutCoordinates, boolean z11) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z11);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo3866localPositionOfR5De75A(@k LayoutCoordinates layoutCoordinates, long j11) {
        return mo3867localPositionOfS_NoaFU(layoutCoordinates, j11, true);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo3867localPositionOfS_NoaFU(@k LayoutCoordinates layoutCoordinates, long j11, boolean z11) {
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long mo3867localPositionOfS_NoaFU = mo3867localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), j11, z11);
            long mo4052getPositionnOccac = rootLookaheadDelegate.mo4052getPositionnOccac();
            float m5243getXimpl = IntOffset.m5243getXimpl(mo4052getPositionnOccac);
            float m5244getYimpl = IntOffset.m5244getYimpl(mo4052getPositionnOccac);
            long m2272minusMKHz9U = Offset.m2272minusMKHz9U(mo3867localPositionOfS_NoaFU, Offset.m2260constructorimpl((4294967295L & Float.floatToRawIntBits(m5244getYimpl)) | (Float.floatToRawIntBits(m5243getXimpl) << 32)));
            LayoutCoordinates parentCoordinates = rootLookaheadDelegate.getCoordinator().getParentCoordinates();
            if (parentCoordinates == null) {
                parentCoordinates = rootLookaheadDelegate.getCoordinator().getCoordinates();
            }
            return Offset.m2273plusMKHz9U(m2272minusMKHz9U, parentCoordinates.mo3867localPositionOfS_NoaFU(layoutCoordinates, Offset.Companion.m2284getZeroF1C5BW0(), z11));
        }
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long m5246minusqkQi6aY = IntOffset.m5246minusqkQi6aY(IntOffset.m5247plusqkQi6aY(lookaheadDelegate.m4059positionIniSbpLlY$ui_release(lookaheadDelegate2, !z11), IntOffsetKt.m5260roundk4lQ0M(j11)), this.lookaheadDelegate.m4059positionIniSbpLlY$ui_release(lookaheadDelegate2, !z11));
            float m5243getXimpl2 = IntOffset.m5243getXimpl(m5246minusqkQi6aY);
            float m5244getYimpl2 = IntOffset.m5244getYimpl(m5246minusqkQi6aY);
            return Offset.m2260constructorimpl((Float.floatToRawIntBits(m5243getXimpl2) << 32) | (Float.floatToRawIntBits(m5244getYimpl2) & 4294967295L));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long m5247plusqkQi6aY = IntOffset.m5247plusqkQi6aY(IntOffset.m5247plusqkQi6aY(lookaheadDelegate.m4059positionIniSbpLlY$ui_release(rootLookaheadDelegate2, !z11), rootLookaheadDelegate2.mo4052getPositionnOccac()), IntOffsetKt.m5260roundk4lQ0M(j11));
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        long m5246minusqkQi6aY2 = IntOffset.m5246minusqkQi6aY(m5247plusqkQi6aY, IntOffset.m5247plusqkQi6aY(this.lookaheadDelegate.m4059positionIniSbpLlY$ui_release(rootLookaheadDelegate3, !z11), rootLookaheadDelegate3.mo4052getPositionnOccac()));
        float m5243getXimpl3 = IntOffset.m5243getXimpl(m5246minusqkQi6aY2);
        float m5244getYimpl3 = IntOffset.m5244getYimpl(m5246minusqkQi6aY2);
        long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(m5244getYimpl3) & 4294967295L) | (Float.floatToRawIntBits(m5243getXimpl3) << 32));
        NodeCoordinator wrappedBy$ui_release = rootLookaheadDelegate3.getCoordinator().getWrappedBy$ui_release();
        g0.m(wrappedBy$ui_release);
        NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui_release();
        g0.m(wrappedBy$ui_release2);
        return wrappedBy$ui_release.mo3867localPositionOfS_NoaFU(wrappedBy$ui_release2, m2260constructorimpl, z11);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo3868localToRootMKHz9U(long j11) {
        return getCoordinator().mo3868localToRootMKHz9U(Offset.m2273plusMKHz9U(j11, m3884getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo3869localToScreenMKHz9U(long j11) {
        return getCoordinator().mo3869localToScreenMKHz9U(Offset.m2273plusMKHz9U(j11, m3884getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo3870localToWindowMKHz9U(long j11) {
        return getCoordinator().mo3870localToWindowMKHz9U(Offset.m2273plusMKHz9U(j11, m3884getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo3871screenToLocalMKHz9U(long j11) {
        return Offset.m2273plusMKHz9U(getCoordinator().mo3871screenToLocalMKHz9U(j11), m3884getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo3872transformFromEL8BTi8(@k LayoutCoordinates layoutCoordinates, @k float[] fArr) {
        getCoordinator().mo3872transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo3873transformToScreen58bKbWc(@k float[] fArr) {
        getCoordinator().mo3873transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo3874windowToLocalMKHz9U(long j11) {
        return Offset.m2273plusMKHz9U(getCoordinator().mo3874windowToLocalMKHz9U(j11), m3884getLookaheadOffsetF1C5BW0());
    }
}
