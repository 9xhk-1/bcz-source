package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {

    @NonNull
    private final RecyclerView.Adapter mAdapter;

    public AdapterListUpdateCallback(@NonNull RecyclerView.Adapter adapter) {
        this.mAdapter = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i11, int i12, Object obj) {
        this.mAdapter.notifyItemRangeChanged(i11, i12, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i11, int i12) {
        this.mAdapter.notifyItemRangeInserted(i11, i12);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i11, int i12) {
        this.mAdapter.notifyItemMoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i11, int i12) {
        this.mAdapter.notifyItemRangeRemoved(i11, i12);
    }
}
