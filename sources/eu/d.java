package eu;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface d<VH extends RecyclerView.ViewHolder> {
    VH a(ViewGroup parent);

    void b(VH holder, int position);

    long c(int position);

    int getItemCount();
}
