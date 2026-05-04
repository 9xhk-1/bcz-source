package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Selectable {
    void appendSelectableInfoToBuilder(@k SelectionLayoutBuilder selectionLayoutBuilder);

    @k
    Rect getBoundingBox(int i11);

    float getCenterYForOffset(int i11);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo1435getHandlePositiondBAh8RU(@k Selection selection, boolean z11);

    int getLastVisibleOffset();

    @l
    LayoutCoordinates getLayoutCoordinates();

    float getLineHeight(int i11);

    float getLineLeft(int i11);

    float getLineRight(int i11);

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo1436getRangeOfLineContainingjx7JFs(int i11);

    @l
    Selection getSelectAllSelection();

    long getSelectableId();

    @k
    AnnotatedString getText();

    @l
    TextLayoutResult textLayoutResult();
}
