package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import j00.c;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ScrollableState {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(@k ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollBackward();
        }

        @Deprecated
        public static boolean getCanScrollForward(@k ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollForward();
        }

        @Deprecated
        public static boolean getLastScrolledBackward(@k ScrollableState scrollableState) {
            return ScrollableState.super.getLastScrolledBackward();
        }

        @Deprecated
        public static boolean getLastScrolledForward(@k ScrollableState scrollableState) {
            return ScrollableState.super.getLastScrolledForward();
        }
    }

    static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, p pVar, c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, pVar, cVar);
    }

    float dispatchRawDelta(float f11);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    default boolean getLastScrolledBackward() {
        return false;
    }

    default boolean getLastScrolledForward() {
        return false;
    }

    boolean isScrollInProgress();

    @l
    Object scroll(@k MutatePriority mutatePriority, @k p<? super ScrollScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar);
}
