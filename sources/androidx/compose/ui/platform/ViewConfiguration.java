package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nViewConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,69:1\n113#2:70\n*S KotlinDebug\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n*L\n54#1:70\n*E\n"})
/* loaded from: classes2.dex */
public interface ViewConfiguration {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static float getHandwritingGestureLineMargin(@m80.k ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingGestureLineMargin();
        }

        @Deprecated
        public static float getHandwritingSlop(@m80.k ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingSlop();
        }

        @Deprecated
        public static float getMaximumFlingVelocity(@m80.k ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getMaximumFlingVelocity();
        }

        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m4303getMinimumTouchTargetSizeMYxV2XQ(@m80.k ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.mo4041getMinimumTouchTargetSizeMYxV2XQ();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo4041getMinimumTouchTargetSizeMYxV2XQ() {
        float f11 = 48;
        return DpKt.m5137DpSizeYgX7TsA(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
    }

    float getTouchSlop();
}
