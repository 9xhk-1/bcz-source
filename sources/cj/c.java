package cj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.studyv2.data.b0;
import gi.m0;
import gs.rf;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class c extends cj.a<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8688d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<b0> f8689c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final rf f8690a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f8691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k c cVar, rf binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f8691b = cVar;
            this.f8690a = binding;
        }

        @m80.k
        public final rf a() {
            return this.f8690a;
        }
    }

    public c(@m80.k List<b0> dataList) {
        g0.p(dataList, "dataList");
        this.f8689c = dataList;
    }

    @m80.k
    public final List<b0> c() {
        return this.f8689c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k a holder, int i11) {
        String str;
        g0.p(holder, "holder");
        rf a11 = holder.a();
        b0 b0Var = this.f8689c.get(i11);
        if (b0Var.h().length() == 0) {
            str = b0Var.g();
        } else {
            str = b0Var.h() + " " + b0Var.g();
        }
        Pair<Integer, Integer> f11 = b0Var.f();
        if (f11 != null) {
            int length = b0Var.h().length() + 1;
            m0.n(a11.f56647a, str, new Pair(Integer.valueOf(f11.getFirst().intValue() + length), Integer.valueOf(f11.getSecond().intValue() + length)));
        } else {
            m0.s(a11.f56647a, str);
        }
        b(holder);
        qb.c.i("new_wiki_time", "WikiExtEnMeanAdapter end", new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        rf e11 = rf.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8689c.size();
    }
}
