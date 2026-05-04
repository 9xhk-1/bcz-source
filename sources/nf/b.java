package nf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import gs.n8;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a, reason: collision with root package name */
    public k f75067a;

    /* renamed from: b, reason: collision with root package name */
    public List<gf.c> f75068b = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public n8 f75069a;

        public a(n8 binding) {
            super(binding.getRoot());
            this.f75069a = binding;
        }
    }

    public b(k viewModel) {
        this.f75067a = viewModel;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i11, View view) {
        this.f75067a.h(this.f75068b.get(i11));
    }

    public void d(List<gf.c> data) {
        this.f75068b.clear();
        if (data != null) {
            this.f75068b.addAll(data);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75068b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.f75068b.get(position).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof a) {
            a aVar = (a) holder;
            aVar.f75069a.n(this.f75068b.get(position).f53660a);
            aVar.f75069a.l(new View.OnClickListener() { // from class: nf.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.c(position, view);
                }
            });
            aVar.f75069a.m(Boolean.valueOf(this.f75068b.size() - 1 != position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new a(n8.i(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
