package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignEndEdges(int i11, int i12, boolean z11) {
        return alignStartEdges(i11, i12, !z11);
    }

    @VisibleForTesting
    public static final int alignPopupAxis(int i11, int i12, int i13, boolean z11) {
        return i12 >= i13 ? alignStartEdges(i12, i13, z11) : popupFitsBetweenPositionAndEndEdge(i11, i12, i13, z11) ? alignPopupStartEdgeToPosition(i11, i12, z11) : popupFitsBetweenPositionAndStartEdge(i11, i12, i13, z11) ? alignPopupEndEdgeToPosition(i11, i12, z11) : alignEndEdges(i12, i13, z11);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            z11 = true;
        }
        return alignPopupAxis(i11, i12, i13, z11);
    }

    private static final int alignPopupEndEdgeToPosition(int i11, int i12, boolean z11) {
        return alignPopupStartEdgeToPosition(i11, i12, !z11);
    }

    private static final int alignPopupStartEdgeToPosition(int i11, int i12, boolean z11) {
        return z11 ? i11 : i11 - i12;
    }

    private static final int alignStartEdges(int i11, int i12, boolean z11) {
        if (z11) {
            return 0;
        }
        return i12 - i11;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i11, int i12, int i13, boolean z11) {
        return popupFitsBetweenPositionAndStartEdge(i11, i12, i13, !z11);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i11, int i12, int i13, boolean z11) {
        return z11 ? i12 <= i11 : i13 - i12 > i11;
    }
}
