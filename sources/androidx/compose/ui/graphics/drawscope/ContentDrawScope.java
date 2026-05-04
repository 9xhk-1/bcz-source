package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m3006drawImageAZ2fEMs(@k ContentDrawScope contentDrawScope, @k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11, int i12) {
            ContentDrawScope.super.mo2962drawImageAZ2fEMs(imageBitmap, j11, j12, j13, j14, f11, drawStyle, colorFilter, i11, i12);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3007getCenterF1C5BW0(@k ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo3059getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3008getSizeNHjbRc(@k ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo3060getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m3009recordJVtK1S4(@k ContentDrawScope contentDrawScope, @k GraphicsLayer graphicsLayer, long j11, @k x00.l<? super DrawScope, g2> lVar) {
            ContentDrawScope.super.mo3061recordJVtK1S4(graphicsLayer, j11, lVar);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3010roundToPxR2X_6o(@k ContentDrawScope contentDrawScope, long j11) {
            return ContentDrawScope.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3011roundToPx0680j_4(@k ContentDrawScope contentDrawScope, float f11) {
            return ContentDrawScope.super.mo371roundToPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3012toDpGaN1DYA(@k ContentDrawScope contentDrawScope, long j11) {
            return ContentDrawScope.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3013toDpu2uoSUM(@k ContentDrawScope contentDrawScope, float f11) {
            return ContentDrawScope.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3015toDpSizekrfVVM(@k ContentDrawScope contentDrawScope, long j11) {
            return ContentDrawScope.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3016toPxR2X_6o(@k ContentDrawScope contentDrawScope, long j11) {
            return ContentDrawScope.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3017toPx0680j_4(@k ContentDrawScope contentDrawScope, float f11) {
            return ContentDrawScope.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @k
        public static Rect toRect(@k ContentDrawScope contentDrawScope, @k DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3018toSizeXkaWNTQ(@k ContentDrawScope contentDrawScope, long j11) {
            return ContentDrawScope.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3019toSp0xMU5do(@k ContentDrawScope contentDrawScope, float f11) {
            return ContentDrawScope.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3020toSpkPz2Gy4(@k ContentDrawScope contentDrawScope, float f11) {
            return ContentDrawScope.super.mo380toSpkPz2Gy4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3014toDpu2uoSUM(@k ContentDrawScope contentDrawScope, int i11) {
            return ContentDrawScope.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3021toSpkPz2Gy4(@k ContentDrawScope contentDrawScope, int i11) {
            return ContentDrawScope.super.mo381toSpkPz2Gy4(i11);
        }
    }

    void drawContent();
}
