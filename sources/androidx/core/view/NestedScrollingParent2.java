package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface NestedScrollingParent2 extends NestedScrollingParent {
    void onNestedPreScroll(@NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13);

    void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i11, int i12);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i11, int i12);

    void onStopNestedScroll(@NonNull View view, int i11);
}
