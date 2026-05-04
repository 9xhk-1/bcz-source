package androidx.core.view;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f11, float f12, boolean z11);

    boolean dispatchNestedPreFling(float f11, float f12);

    boolean dispatchNestedPreScroll(int i11, int i12, @Nullable int[] iArr, @Nullable int[] iArr2);

    boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, @Nullable int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z11);

    boolean startNestedScroll(int i11);

    void stopNestedScroll();
}
