package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface RowColumnMeasurePolicy {
    /* renamed from: createConstraints-xF2OJ5Q$default, reason: not valid java name */
    static /* synthetic */ long m753createConstraintsxF2OJ5Q$default(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i11, int i12, int i13, int i14, boolean z11, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i15 & 16) != 0) {
            z11 = false;
        }
        return rowColumnMeasurePolicy.mo639createConstraintsxF2OJ5Q(i11, i12, i13, i14, z11);
    }

    /* renamed from: createConstraints-xF2OJ5Q */
    long mo639createConstraintsxF2OJ5Q(int i11, int i12, int i13, int i14, boolean z11);

    int crossAxisSize(@m80.k Placeable placeable);

    int mainAxisSize(@m80.k Placeable placeable);

    @m80.k
    MeasureResult placeHelper(@m80.k Placeable[] placeableArr, @m80.k MeasureScope measureScope, int i11, @m80.k int[] iArr, int i12, int i13, @l int[] iArr2, int i14, int i15, int i16);

    void populateMainAxisPositions(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, @m80.k MeasureScope measureScope);
}
