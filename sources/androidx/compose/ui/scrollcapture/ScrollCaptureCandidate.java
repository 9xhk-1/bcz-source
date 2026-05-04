package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ScrollCaptureCandidate {

    @k
    private final LayoutCoordinates coordinates;
    private final int depth;

    @k
    private final SemanticsNode node;

    @k
    private final IntRect viewportBoundsInWindow;

    public ScrollCaptureCandidate(@k SemanticsNode semanticsNode, int i11, @k IntRect intRect, @k LayoutCoordinates layoutCoordinates) {
        this.node = semanticsNode;
        this.depth = i11;
        this.viewportBoundsInWindow = intRect;
        this.coordinates = layoutCoordinates;
    }

    @k
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    public final int getDepth() {
        return this.depth;
    }

    @k
    public final SemanticsNode getNode() {
        return this.node;
    }

    @k
    public final IntRect getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    @k
    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }
}
