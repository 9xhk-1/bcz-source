package cj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import gs.xf;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class k extends cj.a<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8722d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> f8723c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final xf f8724a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f8725b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k k kVar, xf binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f8725b = kVar;
            this.f8724a = binding;
        }

        @m80.k
        public final xf a() {
            return this.f8724a;
        }
    }

    public k(@m80.k List<Pair<Pair<String, String>, Boolean>> dataList) {
        g0.p(dataList, "dataList");
        this.f8723c = dataList;
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> c() {
        return this.f8723c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k a holder, int i11) {
        g0.p(holder, "holder");
        xf a11 = holder.a();
        Pair<Pair<String, String>, Boolean> pair = this.f8723c.get(i11);
        a11.f57461a.setText(pair.getFirst().getFirst());
        TextView variantCh = a11.f57461a;
        g0.o(variantCh, "variantCh");
        KotlinExtKt.setIsBold(variantCh, pair.getSecond().booleanValue());
        a11.f57462b.setText(pair.getFirst().getSecond());
        TextView variantEn = a11.f57462b;
        g0.o(variantEn, "variantEn");
        KotlinExtKt.setIsBold(variantEn, pair.getSecond().booleanValue());
        b(holder);
        qb.c.i("new_wiki_time", "WikiExtVariantAdapter end", new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        xf e11 = xf.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8723c.size();
    }
}
