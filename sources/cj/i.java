package cj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import gi.m0;
import gs.tf;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class i extends cj.a<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8714d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> f8715c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final tf f8716a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f8717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k i iVar, tf binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f8717b = iVar;
            this.f8716a = binding;
        }

        @m80.k
        public final tf a() {
            return this.f8716a;
        }
    }

    public i(@m80.k List<Pair<Pair<String, String>, Boolean>> dataList) {
        g0.p(dataList, "dataList");
        this.f8715c = dataList;
    }

    @m80.k
    public final List<Pair<Pair<String, String>, Boolean>> c() {
        return this.f8715c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k a holder, int i11) {
        g0.p(holder, "holder");
        tf a11 = holder.a();
        Pair<Pair<String, String>, Boolean> pair = this.f8715c.get(i11);
        m0.s(a11.f56884b, pair.getFirst().getFirst());
        TextView phraseEn = a11.f56884b;
        g0.o(phraseEn, "phraseEn");
        KotlinExtKt.setIsBold(phraseEn, pair.getSecond().booleanValue());
        a11.f56883a.setText(pair.getFirst().getSecond());
        TextView phraseCh = a11.f56883a;
        g0.o(phraseCh, "phraseCh");
        KotlinExtKt.setIsBold(phraseCh, pair.getSecond().booleanValue());
        b(holder);
        qb.c.i("new_wiki_time", "WikiExtPhraseAdapter end", new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        tf e11 = tf.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8715c.size();
    }
}
