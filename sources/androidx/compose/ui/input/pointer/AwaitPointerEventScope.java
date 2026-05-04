package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import j00.f;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f
/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m3642getExtendedTouchPaddingNHjbRc(@k AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo3640getExtendedTouchPaddingNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3643roundToPxR2X_6o(@k AwaitPointerEventScope awaitPointerEventScope, long j11) {
            return AwaitPointerEventScope.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3644roundToPx0680j_4(@k AwaitPointerEventScope awaitPointerEventScope, float f11) {
            return AwaitPointerEventScope.super.mo371roundToPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3645toDpGaN1DYA(@k AwaitPointerEventScope awaitPointerEventScope, long j11) {
            return AwaitPointerEventScope.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3646toDpu2uoSUM(@k AwaitPointerEventScope awaitPointerEventScope, float f11) {
            return AwaitPointerEventScope.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3648toDpSizekrfVVM(@k AwaitPointerEventScope awaitPointerEventScope, long j11) {
            return AwaitPointerEventScope.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3649toPxR2X_6o(@k AwaitPointerEventScope awaitPointerEventScope, long j11) {
            return AwaitPointerEventScope.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3650toPx0680j_4(@k AwaitPointerEventScope awaitPointerEventScope, float f11) {
            return AwaitPointerEventScope.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @k
        public static Rect toRect(@k AwaitPointerEventScope awaitPointerEventScope, @k DpRect dpRect) {
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3651toSizeXkaWNTQ(@k AwaitPointerEventScope awaitPointerEventScope, long j11) {
            return AwaitPointerEventScope.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3652toSp0xMU5do(@k AwaitPointerEventScope awaitPointerEventScope, float f11) {
            return AwaitPointerEventScope.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3653toSpkPz2Gy4(@k AwaitPointerEventScope awaitPointerEventScope, float f11) {
            return AwaitPointerEventScope.super.mo380toSpkPz2Gy4(f11);
        }

        @l
        @Deprecated
        public static <T> Object withTimeout(@k AwaitPointerEventScope awaitPointerEventScope, long j11, @k p<? super AwaitPointerEventScope, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
            return AwaitPointerEventScope.super.withTimeout(j11, pVar, cVar);
        }

        @l
        @Deprecated
        public static <T> Object withTimeoutOrNull(@k AwaitPointerEventScope awaitPointerEventScope, long j11, @k p<? super AwaitPointerEventScope, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j11, pVar, cVar);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3647toDpu2uoSUM(@k AwaitPointerEventScope awaitPointerEventScope, int i11) {
            return AwaitPointerEventScope.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3654toSpkPz2Gy4(@k AwaitPointerEventScope awaitPointerEventScope, int i11) {
            return AwaitPointerEventScope.super.mo381toSpkPz2Gy4(i11);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i11 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, cVar);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j11, p<? super AwaitPointerEventScope, ? super j00.c<? super T>, ? extends Object> pVar, j00.c<? super T> cVar) {
        return pVar.invoke(awaitPointerEventScope, cVar);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j11, p<? super AwaitPointerEventScope, ? super j00.c<? super T>, ? extends Object> pVar, j00.c<? super T> cVar) {
        return pVar.invoke(awaitPointerEventScope, cVar);
    }

    @l
    Object awaitPointerEvent(@k PointerEventPass pointerEventPass, @k j00.c<? super PointerEvent> cVar);

    @k
    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo3640getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m2346getZeroNHjbRc();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo3641getSizeYbymL2g();

    @k
    ViewConfiguration getViewConfiguration();

    @l
    default <T> Object withTimeout(long j11, @k p<? super AwaitPointerEventScope, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return withTimeout$suspendImpl(this, j11, pVar, cVar);
    }

    @l
    default <T> Object withTimeoutOrNull(long j11, @k p<? super AwaitPointerEventScope, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        return withTimeoutOrNull$suspendImpl(this, j11, pVar, cVar);
    }
}
