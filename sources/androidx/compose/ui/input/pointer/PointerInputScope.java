package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PointerInputScope extends Density {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m3769getExtendedTouchPaddingNHjbRc(@k PointerInputScope pointerInputScope) {
            return PointerInputScope.super.mo367getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(@k PointerInputScope pointerInputScope) {
            return PointerInputScope.super.getInterceptOutOfBoundsChildEvents();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3770roundToPxR2X_6o(@k PointerInputScope pointerInputScope, long j11) {
            return PointerInputScope.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3771roundToPx0680j_4(@k PointerInputScope pointerInputScope, float f11) {
            return PointerInputScope.super.mo371roundToPx0680j_4(f11);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(@k PointerInputScope pointerInputScope, boolean z11) {
            PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3772toDpGaN1DYA(@k PointerInputScope pointerInputScope, long j11) {
            return PointerInputScope.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3773toDpu2uoSUM(@k PointerInputScope pointerInputScope, float f11) {
            return PointerInputScope.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3775toDpSizekrfVVM(@k PointerInputScope pointerInputScope, long j11) {
            return PointerInputScope.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3776toPxR2X_6o(@k PointerInputScope pointerInputScope, long j11) {
            return PointerInputScope.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3777toPx0680j_4(@k PointerInputScope pointerInputScope, float f11) {
            return PointerInputScope.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @k
        public static Rect toRect(@k PointerInputScope pointerInputScope, @k DpRect dpRect) {
            return PointerInputScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3778toSizeXkaWNTQ(@k PointerInputScope pointerInputScope, long j11) {
            return PointerInputScope.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3779toSp0xMU5do(@k PointerInputScope pointerInputScope, float f11) {
            return PointerInputScope.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3780toSpkPz2Gy4(@k PointerInputScope pointerInputScope, float f11) {
            return PointerInputScope.super.mo380toSpkPz2Gy4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3774toDpu2uoSUM(@k PointerInputScope pointerInputScope, int i11) {
            return PointerInputScope.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3781toSpkPz2Gy4(@k PointerInputScope pointerInputScope, int i11) {
            return PointerInputScope.super.mo381toSpkPz2Gy4(i11);
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }
    }

    @l
    <R> Object awaitPointerEventScope(@k p<? super AwaitPointerEventScope, ? super j00.c<? super R>, ? extends Object> pVar, @k j00.c<? super R> cVar);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo367getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m2346getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g */
    long mo368getSizeYbymL2g();

    @k
    ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z11) {
    }
}
