package cj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import gi.m0;
import gs.pf;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class b extends cj.a<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8684d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> f8685c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final pf f8686a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f8687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k b bVar, pf binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f8687b = bVar;
            this.f8686a = binding;
        }

        @m80.k
        public final pf a() {
            return this.f8686a;
        }
    }

    public b(@m80.k List<Pair<Pair<String, String>, Boolean>> dataList) {
        g0.p(dataList, "dataList");
        this.f8685c = dataList;
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> c() {
        return this.f8685c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k a holder, int i11) {
        g0.p(holder, "holder");
        pf a11 = holder.a();
        Pair<Pair<String, String>, Boolean> pair = this.f8685c.get(i11);
        m0.s(a11.f56376b, pair.getFirst().getFirst());
        TextView derivationEn = a11.f56376b;
        g0.o(derivationEn, "derivationEn");
        KotlinExtKt.setIsBold(derivationEn, pair.getSecond().booleanValue());
        a11.f56375a.setText(pair.getFirst().getSecond());
        TextView derivationCh = a11.f56375a;
        g0.o(derivationCh, "derivationCh");
        KotlinExtKt.setIsBold(derivationCh, pair.getSecond().booleanValue());
        b(holder);
        qb.c.i("new_wiki_time", "WikiExtDerivationAdapter end", new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        pf e11 = pf.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8685c.size();
    }
}
