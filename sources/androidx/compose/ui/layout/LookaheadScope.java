package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LookaheadScope {
    /* renamed from: localLookaheadPositionOf-au-aQtc$default, reason: not valid java name */
    static /* synthetic */ long m3885localLookaheadPositionOfauaQtc$default(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i11 & 2) != 0) {
            j11 = Offset.Companion.m2284getZeroF1C5BW0();
        }
        long j12 = j11;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return lookaheadScope.mo109localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j12, z11);
    }

    @k
    LayoutCoordinates getLookaheadScopeCoordinates(@k Placeable.PlacementScope placementScope);

    /* renamed from: localLookaheadPositionOf-au-aQtc */
    default long mo109localLookaheadPositionOfauaQtc(@k LayoutCoordinates layoutCoordinates, @k LayoutCoordinates layoutCoordinates2, long j11, boolean z11) {
        return LookaheadScopeKt.m3886localLookaheadPositionOfFgt4K4Q(this, layoutCoordinates, layoutCoordinates2, j11, z11);
    }

    @k
    LayoutCoordinates toLookaheadCoordinates(@k LayoutCoordinates layoutCoordinates);
}
