package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import j00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m483roundToPxR2X_6o(@k PressGestureScope pressGestureScope, long j11) {
            return PressGestureScope.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m484roundToPx0680j_4(@k PressGestureScope pressGestureScope, float f11) {
            return PressGestureScope.super.mo371roundToPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m485toDpGaN1DYA(@k PressGestureScope pressGestureScope, long j11) {
            return PressGestureScope.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m486toDpu2uoSUM(@k PressGestureScope pressGestureScope, float f11) {
            return PressGestureScope.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m488toDpSizekrfVVM(@k PressGestureScope pressGestureScope, long j11) {
            return PressGestureScope.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m489toPxR2X_6o(@k PressGestureScope pressGestureScope, long j11) {
            return PressGestureScope.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m490toPx0680j_4(@k PressGestureScope pressGestureScope, float f11) {
            return PressGestureScope.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @k
        public static Rect toRect(@k PressGestureScope pressGestureScope, @k DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m491toSizeXkaWNTQ(@k PressGestureScope pressGestureScope, long j11) {
            return PressGestureScope.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m492toSp0xMU5do(@k PressGestureScope pressGestureScope, float f11) {
            return PressGestureScope.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m493toSpkPz2Gy4(@k PressGestureScope pressGestureScope, float f11) {
            return PressGestureScope.super.mo380toSpkPz2Gy4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m487toDpu2uoSUM(@k PressGestureScope pressGestureScope, int i11) {
            return PressGestureScope.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m494toSpkPz2Gy4(@k PressGestureScope pressGestureScope, int i11) {
            return PressGestureScope.super.mo381toSpkPz2Gy4(i11);
        }
    }

    @l
    Object awaitRelease(@k c<? super g2> cVar);

    @l
    Object tryAwaitRelease(@k c<? super Boolean> cVar);
}
