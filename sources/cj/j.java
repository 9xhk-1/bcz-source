package cj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import gi.m0;
import gs.vf;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class j extends cj.a<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8718d = 8;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<String, Boolean>> f8719c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final vf f8720a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f8721b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k j jVar, vf mBinding) {
            super(mBinding.getRoot());
            g0.p(mBinding, "mBinding");
            this.f8721b = jVar;
            this.f8720a = mBinding;
        }

        @m80.k
        public final vf a() {
            return this.f8720a;
        }
    }

    public j(@m80.k List<Pair<String, Boolean>> mData) {
        g0.p(mData, "mData");
        this.f8719c = mData;
    }

    @m80.k
    public final List<Pair<String, Boolean>> c() {
        return this.f8719c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k a holder, int i11) {
        g0.p(holder, "holder");
        TextView textView = holder.a().f57176a;
        m0.s(textView, this.f8719c.get(i11).getFirst());
        g0.m(textView);
        KotlinExtKt.setIsBold(textView, this.f8719c.get(i11).getSecond().booleanValue());
        b(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        vf e11 = vf.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8719c.size();
    }
}
