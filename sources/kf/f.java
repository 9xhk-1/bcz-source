package kf;

import android.content.Context;
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
public class f extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f66462d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f66463e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f66464f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f66465g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f66466h = 4;

    /* renamed from: a, reason: collision with root package name */
    public p f66467a;

    /* renamed from: b, reason: collision with root package name */
    public List f66468b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public String f66469c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public n8 f66470a;

        public a(n8 binding) {
            super(binding.getRoot());
            this.f66470a = binding;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public p8 f66471a;

        public b(p8 binding) {
            super(binding.getRoot());
            this.f66471a = binding;
        }
    }

    public f(p viewModel) {
        this.f66467a = viewModel;
    }

    public final void g(a holder, final String item) {
        holder.f66470a.n(item);
        holder.f66470a.l(new View.OnClickListener() { // from class: kf.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.k(item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f66468b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == this.f66468b.size()) {
            return 2;
        }
        if (this.f66468b.get(position) instanceof Integer) {
            return 3;
        }
        if (this.f66468b.get(position) instanceof String) {
            return 4;
        }
        return this.f66468b.get(position) instanceof gf.d ? 1 : 0;
    }

    public final void h(a holder, final Integer level) {
        holder.f66470a.l(new View.OnClickListener() { // from class: kf.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.l(level, view);
            }
        });
        holder.f66470a.n(jf.a.a(this.f66467a.getApplication(), level.intValue()));
    }

    public final void i(b holder) {
        String str;
        String string;
        if (TextUtils.isEmpty(this.f66469c)) {
            string = null;
        } else {
            Context context = holder.itemView.getContext();
            if (this.f66469c.length() > 5) {
                str = this.f66469c.substring(0, 5) + "...";
            } else {
                str = this.f66469c;
            }
            string = context.getString(R.string.userinfo_edit_school_no_result, str);
        }
        holder.f66471a.l(string);
        holder.f66471a.k(new View.OnClickListener() { // from class: kf.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.m(view);
            }
        });
        holder.f66471a.executePendingBindings();
        holder.f66471a.getRoot().setVisibility(TextUtils.isEmpty(this.f66469c) ? 8 : 0);
    }

    public final void j(a holder, final gf.d item) {
        holder.f66470a.n(item.f53662a);
        holder.f66470a.l(new View.OnClickListener() { // from class: kf.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.n(item, view);
            }
        });
    }

    public final /* synthetic */ void k(String str, View view) {
        this.f66467a.j(str);
    }

    public final /* synthetic */ void l(Integer num, View view) {
        this.f66467a.l(num.intValue());
    }

    public final /* synthetic */ void m(View view) {
        this.f66467a.o(this.f66469c);
    }

    public final /* synthetic */ void n(gf.d dVar, View view) {
        this.f66467a.m(dVar);
    }

    public void o(List data) {
        this.f66468b.clear();
        if (data != null) {
            this.f66468b.addAll(data);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        Object obj = this.f66468b.size() > position ? this.f66468b.get(position) : null;
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            j((a) holder, (gf.d) obj);
        } else if (itemViewType == 2) {
            i((b) holder);
        } else if (itemViewType == 3) {
            h((a) holder, (Integer) obj);
        } else if (itemViewType == 4) {
            g((a) holder, (String) obj);
        }
        if (holder instanceof a) {
            ((a) holder).f66470a.m(Boolean.valueOf(position != this.f66468b.size() - 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        return viewType != 2 ? new a(n8.i(from, parent, false)) : new b(p8.h(from, parent, false));
    }

    public void p(String searchWord) {
        this.f66469c = searchWord == null ? null : searchWord.trim();
        notifyItemChanged(this.f66468b.size());
    }
}
