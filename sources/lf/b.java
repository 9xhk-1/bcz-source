package lf;

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
    public k f71186a;

    /* renamed from: b, reason: collision with root package name */
    public List<gf.b> f71187b = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public n8 f71188a;

        public a(n8 binding) {
            super(binding.getRoot());
            this.f71188a = binding;
        }
    }

    public b(k viewModel) {
        this.f71186a = viewModel;
        setHasStableIds(true);
    }

    public final /* synthetic */ void c(int i11, View view) {
        this.f71186a.j(this.f71187b.get(i11));
    }

    public void d(List<gf.b> data) {
        this.f71187b.clear();
        if (data != null) {
            this.f71187b.addAll(data);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f71187b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.f71187b.get(position).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof a) {
            a aVar = (a) holder;
            aVar.f71188a.n(this.f71187b.get(position).f53657a);
            aVar.f71188a.l(new View.OnClickListener() { // from class: lf.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.c(position, view);
                }
            });
            aVar.f71188a.m(Boolean.valueOf(this.f71187b.size() - 1 != position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new a(n8.i(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
