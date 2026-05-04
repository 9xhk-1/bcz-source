package androidx.core.view;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int i11, int i12, @Nullable int[] iArr, @Nullable int[] iArr2, int i13);

    boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, @Nullable int[] iArr, int i15);

    boolean hasNestedScrollingParent(int i11);

    boolean startNestedScroll(int i11, int i12);

    void stopNestedScroll(int i11);
}
