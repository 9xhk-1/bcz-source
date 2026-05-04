package androidx.compose.foundation.lazy.layout;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyLayoutMeasuredItem {
    /* renamed from: getConstraints-msEJaDk */
    long mo839getConstraintsmsEJaDk();

    int getIndex();

    @k
    Object getKey();

    int getLane();

    int getMainAxisSizeWithSpacings();

    boolean getNonScrollableItem();

    /* renamed from: getOffset-Bjo55l4 */
    long mo840getOffsetBjo55l4(int i11);

    @l
    Object getParentData(int i11);

    int getPlaceablesCount();

    int getSpan();

    boolean isVertical();

    void position(int i11, int i12, int i13, int i14);

    void setNonScrollableItem(boolean z11);
}
