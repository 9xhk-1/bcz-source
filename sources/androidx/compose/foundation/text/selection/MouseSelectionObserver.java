package androidx.compose.foundation.text.selection;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface MouseSelectionObserver {
    /* renamed from: onDrag-3MmeM6k */
    boolean mo1369onDrag3MmeM6k(long j11, @k SelectionAdjustment selectionAdjustment);

    void onDragDone();

    /* renamed from: onExtend-k-4lQ0M */
    boolean mo1370onExtendk4lQ0M(long j11);

    /* renamed from: onExtendDrag-k-4lQ0M */
    boolean mo1371onExtendDragk4lQ0M(long j11);

    /* renamed from: onStart-3MmeM6k */
    boolean mo1372onStart3MmeM6k(long j11, @k SelectionAdjustment selectionAdjustment);
}
