package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Set;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LayoutCoordinates {
    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z11);
    }

    /* renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
    static /* synthetic */ long m3864localPositionOfS_NoaFU$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if ((i11 & 2) != 0) {
            j11 = Offset.Companion.m2284getZeroF1C5BW0();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return layoutCoordinates.mo3867localPositionOfS_NoaFU(layoutCoordinates2, j11, z11);
    }

    int get(@k AlignmentLine alignmentLine);

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    @l
    LayoutCoordinates getParentCoordinates();

    @l
    LayoutCoordinates getParentLayoutCoordinates();

    @k
    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo3865getSizeYbymL2g();

    boolean isAttached();

    @k
    Rect localBoundingBoxOf(@k LayoutCoordinates layoutCoordinates, boolean z11);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo3866localPositionOfR5De75A(@k LayoutCoordinates layoutCoordinates, long j11);

    /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    default long mo3867localPositionOfS_NoaFU(@k LayoutCoordinates layoutCoordinates, long j11, boolean z11) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo3868localToRootMKHz9U(long j11);

    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    default long mo3869localToScreenMKHz9U(long j11) {
        return Offset.Companion.m2283getUnspecifiedF1C5BW0();
    }

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo3870localToWindowMKHz9U(long j11);

    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    default long mo3871screenToLocalMKHz9U(long j11) {
        return Offset.Companion.m2283getUnspecifiedF1C5BW0();
    }

    /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    default void mo3872transformFromEL8BTi8(@k LayoutCoordinates layoutCoordinates, @k float[] fArr) {
        InlineClassHelperKt.throwUnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    default void mo3873transformToScreen58bKbWc(@k float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo3874windowToLocalMKHz9U(long j11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(@k LayoutCoordinates layoutCoordinates) {
            return LayoutCoordinates.super.getIntroducesMotionFrameOfReference();
        }

        @Deprecated
        /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m3875localPositionOfS_NoaFU(@k LayoutCoordinates layoutCoordinates, @k LayoutCoordinates layoutCoordinates2, long j11, boolean z11) {
            return LayoutCoordinates.super.mo3867localPositionOfS_NoaFU(layoutCoordinates2, j11, z11);
        }

        @Deprecated
        /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m3877localToScreenMKHz9U(@k LayoutCoordinates layoutCoordinates, long j11) {
            return LayoutCoordinates.super.mo3869localToScreenMKHz9U(j11);
        }

        @Deprecated
        /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m3878screenToLocalMKHz9U(@k LayoutCoordinates layoutCoordinates, long j11) {
            return LayoutCoordinates.super.mo3871screenToLocalMKHz9U(j11);
        }

        @Deprecated
        /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m3879transformFromEL8BTi8(@k LayoutCoordinates layoutCoordinates, @k LayoutCoordinates layoutCoordinates2, @k float[] fArr) {
            LayoutCoordinates.super.mo3872transformFromEL8BTi8(layoutCoordinates2, fArr);
        }

        @Deprecated
        /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
        public static void m3880transformToScreen58bKbWc(@k LayoutCoordinates layoutCoordinates, @k float[] fArr) {
            LayoutCoordinates.super.mo3873transformToScreen58bKbWc(fArr);
        }

        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }
    }
}
