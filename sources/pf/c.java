package pf;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;
import gs.n8;
import gs.p8;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f80408d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f80409e = 2;

    /* renamed from: a, reason: collision with root package name */
    public i f80410a;

    /* renamed from: b, reason: collision with root package name */
    public List<gf.d> f80411b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public String f80412c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public p8 f80413a;

        public a(p8 binding) {
            super(binding.getRoot());
            this.f80413a = binding;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public n8 f80414a;

        public b(n8 binding) {
            super(binding.getRoot());
            this.f80414a = binding;
        }
    }

    public c(i viewModel) {
        this.f80410a = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i11, View view) {
        this.f80410a.f(this.f80411b.get(i11));
    }

    public final /* synthetic */ void f(View view) {
        this.f80410a.g();
    }

    public void g(List<gf.d> data) {
        this.f80411b.clear();
        if (data != null) {
            this.f80411b.addAll(data);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f80411b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == this.f80411b.size() ? 2 : 1;
    }

    public void h(String searchWord) {
        this.f80412c = searchWord == null ? null : searchWord.trim();
        notifyItemChanged(this.f80411b.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof b) {
            b bVar = (b) holder;
            bVar.f80414a.n(this.f80411b.get(position).f53662a);
            bVar.f80414a.l(new View.OnClickListener() { // from class: pf.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.this.d(position, view);
                }
            });
            bVar.f80414a.executePendingBindings();
            return;
        }
        if (holder instanceof a) {
            String string = TextUtils.isEmpty(this.f80412c) ? null : holder.itemView.getContext().getString(R.string.userinfo_edit_school_no_result, this.f80412c);
            a aVar = (a) holder;
            aVar.f80413a.l(string);
            aVar.f80413a.k(new View.OnClickListener() { // from class: pf.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.this.f(view);
                }
            });
            aVar.f80413a.executePendingBindings();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (viewType == 1) {
            return new b(n8.i(from, parent, false));
        }
        if (viewType == 2) {
            return new a(p8.h(from, parent, false));
        }
        return null;
    }
}
