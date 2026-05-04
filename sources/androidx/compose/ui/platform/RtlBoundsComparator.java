package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class RtlBoundsComparator implements Comparator<SemanticsNode> {

    @m80.k
    public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

    private RtlBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(@m80.k SemanticsNode semanticsNode, @m80.k SemanticsNode semanticsNode2) {
        Rect boundsInWindow = semanticsNode.getBoundsInWindow();
        Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
        int compare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
        return compare3 != 0 ? compare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
    }
}
