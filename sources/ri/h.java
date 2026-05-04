package ri;

import a00.h0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.jiongji.andriod.card.R;
import java.util.List;
import kotlin.jvm.internal.g0;
import l3.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class h extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f84117d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f84118a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0 f84119b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<i0.h> f84120c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f84121a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f84122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f84123c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k h hVar, View itemView) {
            super(itemView);
            g0.p(itemView, "itemView");
            this.f84123c = hVar;
            View findViewById = itemView.findViewById(R.id.derivation_word);
            g0.o(findViewById, "findViewById(...)");
            this.f84121a = (TextView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.derivation_mean);
            g0.o(findViewById2, "findViewById(...)");
            this.f84122b = (TextView) findViewById2;
        }

        public final void a(@m80.k i0.h derivation) {
            g0.p(derivation, "derivation");
            this.f84121a.setText(derivation.g());
            this.f84122b.setText(derivation.e());
        }
    }

    public h(@m80.k LifecycleOwner lifecycleOwner, @m80.k o0 viewModel) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f84118a = lifecycleOwner;
        this.f84119b = viewModel;
        this.f84120c = h0.J();
    }

    @m80.k
    public final List<i0.h> b() {
        return this.f84120c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k a holder, int i11) {
        g0.p(holder, "holder");
        holder.a(this.f84120c.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lookup_wiki_derivation, parent, false);
        g0.m(inflate);
        return new a(this, inflate);
    }

    public final void f(@m80.k List<i0.h> value) {
        g0.p(value, "value");
        this.f84120c = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84120c.size();
    }
}
