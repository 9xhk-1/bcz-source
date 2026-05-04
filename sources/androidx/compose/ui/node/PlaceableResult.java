package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class PlaceableResult implements OwnerScope {

    @k
    private final LookaheadCapablePlaceable placeable;

    @k
    private final MeasureResult result;

    public PlaceableResult(@k MeasureResult measureResult, @k LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.result = measureResult;
        this.placeable = lookaheadCapablePlaceable;
    }

    public static /* synthetic */ PlaceableResult copy$default(PlaceableResult placeableResult, MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            measureResult = placeableResult.result;
        }
        if ((i11 & 2) != 0) {
            lookaheadCapablePlaceable = placeableResult.placeable;
        }
        return placeableResult.copy(measureResult, lookaheadCapablePlaceable);
    }

    @k
    public final MeasureResult component1() {
        return this.result;
    }

    @k
    public final LookaheadCapablePlaceable component2() {
        return this.placeable;
    }

    @k
    public final PlaceableResult copy(@k MeasureResult measureResult, @k LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new PlaceableResult(measureResult, lookaheadCapablePlaceable);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) obj;
        return g0.g(this.result, placeableResult.result) && g0.g(this.placeable, placeableResult.placeable);
    }

    @k
    public final LookaheadCapablePlaceable getPlaceable() {
        return this.placeable;
    }

    @k
    public final MeasureResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.placeable.hashCode();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.placeable.getCoordinates().isAttached();
    }

    @k
    public String toString() {
        return "PlaceableResult(result=" + this.result + ", placeable=" + this.placeable + ')';
    }
}
