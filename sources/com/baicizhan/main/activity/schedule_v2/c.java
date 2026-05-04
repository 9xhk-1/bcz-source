package com.baicizhan.main.activity.schedule_v2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oe.k1;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19244d = 8;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final b f19245a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public List<k1> f19246b;

    /* renamed from: c, reason: collision with root package name */
    public int f19247c = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: b, reason: collision with root package name */
        public static final int f19248b = 8;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TextView f19249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k View v11) {
            super(v11);
            g0.p(v11, "v");
            View findViewById = v11.findViewById(R.id.tab);
            g0.o(findViewById, "findViewById(...)");
            this.f19249a = (TextView) findViewById;
        }

        @k
        public final TextView a() {
            return this.f19249a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void e(int i11);
    }

    public c(@l b bVar) {
        this.f19245a = bVar;
    }

    public static final g2 f(c cVar, a aVar, View it) {
        g0.p(it, "it");
        cVar.g(aVar.getAdapterPosition());
        b bVar = cVar.f19245a;
        if (bVar != null) {
            bVar.e(aVar.getAdapterPosition());
        }
        return g2.f100423a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k a holder, int i11) {
        k1 k1Var;
        g0.p(holder, "holder");
        holder.a().setSelected(i11 == this.f19247c);
        TextView a11 = holder.a();
        List<k1> list = this.f19246b;
        a11.setText((list == null || (k1Var = list.get(i11)) == null) ? null : k1Var.f());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_books_tab, parent, false);
        g0.o(inflate, "inflate(...)");
        final a aVar = new a(inflate);
        View itemView = aVar.itemView;
        g0.o(itemView, "itemView");
        q.t(itemView, 0, new x00.l() { // from class: oe.z0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = com.baicizhan.main.activity.schedule_v2.c.f(com.baicizhan.main.activity.schedule_v2.c.this, aVar, (View) obj);
                return f11;
            }
        }, 1, null);
        return aVar;
    }

    public final void g(int i11) {
        int i12 = this.f19247c;
        this.f19247c = i11;
        if (i12 >= 0 && i12 < getItemCount()) {
            notifyItemChanged(i12);
        }
        int itemCount = getItemCount();
        int i13 = this.f19247c;
        if (i13 < 0 || i13 >= itemCount) {
            return;
        }
        notifyItemChanged(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<k1> list = this.f19246b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void h(@k List<k1> data) {
        g0.p(data, "data");
        this.f19246b = data;
        notifyDataSetChanged();
    }
}
