package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TopBottomBoundsComparator implements Comparator<Pair<? extends Rect, ? extends List<SemanticsNode>>> {

    @m80.k
    public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Pair<? extends Rect, ? extends List<SemanticsNode>> pair, Pair<? extends Rect, ? extends List<SemanticsNode>> pair2) {
        return compare2((Pair<Rect, ? extends List<SemanticsNode>>) pair, (Pair<Rect, ? extends List<SemanticsNode>>) pair2);
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(@m80.k Pair<Rect, ? extends List<SemanticsNode>> pair, @m80.k Pair<Rect, ? extends List<SemanticsNode>> pair2) {
        int compare = Float.compare(pair.getFirst().getTop(), pair2.getFirst().getTop());
        return compare != 0 ? compare : Float.compare(pair.getFirst().getBottom(), pair2.getFirst().getBottom());
    }
}
