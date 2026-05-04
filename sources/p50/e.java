package p50;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class e<T, VH extends RecyclerView.ViewHolder> {

    /* renamed from: a, reason: collision with root package name */
    public h f79140a;

    @NonNull
    public final h d() {
        h hVar = this.f79140a;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("ItemViewBinder " + this + " not attached to MultiTypeAdapter. You should not call the method before registering the binder.");
    }

    public long e(@NonNull T t11) {
        return -1L;
    }

    public final int f(@NonNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition();
    }

    public abstract void g(@NonNull VH vh2, @NonNull T t11);

    public void h(@NonNull VH vh2, @NonNull T t11, @NonNull List<Object> list) {
        g(vh2, t11);
    }

    @NonNull
    public abstract VH i(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    public boolean j(@NonNull VH vh2) {
        return false;
    }

    public void k(@NonNull VH vh2) {
    }

    public void l(@NonNull VH vh2) {
    }

    public void m(@NonNull VH vh2) {
    }
}
