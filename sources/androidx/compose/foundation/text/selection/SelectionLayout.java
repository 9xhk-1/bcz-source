package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SelectionLayout {
    @k
    LongObjectMap<Selection> createSubSelections(@k Selection selection);

    void forEachMiddleInfo(@k l<? super SelectableInfo, g2> lVar);

    @k
    CrossStatus getCrossStatus();

    @k
    SelectableInfo getCurrentInfo();

    @k
    SelectableInfo getEndInfo();

    int getEndSlot();

    @k
    SelectableInfo getFirstInfo();

    @k
    SelectableInfo getLastInfo();

    @m80.l
    Selection getPreviousSelection();

    int getSize();

    @k
    SelectableInfo getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(@m80.l SelectionLayout selectionLayout);
}
