package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    public static final int $stable = 0;

    public abstract int next(int i11);

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i11) {
        return next(i11);
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i11) {
        int next = next(i11);
        if (next == -1 || next(next) == -1) {
            return -1;
        }
        return next;
    }

    public abstract int previous(int i11);

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i11) {
        int previous = previous(i11);
        if (previous == -1 || previous(previous) == -1) {
            return -1;
        }
        return previous;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i11) {
        return previous(i11);
    }
}
