package uj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wordlistv2.repo.OrderType;
import gs.qh;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class c extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f92239d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<OrderType> f92240a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final OrderType f92241b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x00.l<OrderType, g2> f92242c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final qh f92243a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f92244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k c cVar, qh mBinding) {
            super(mBinding.getRoot());
            g0.p(mBinding, "mBinding");
            this.f92244b = cVar;
            this.f92243a = mBinding;
        }

        @k
        public final qh a() {
            return this.f92243a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends OrderType> data, @l OrderType orderType, @k x00.l<? super OrderType, g2> onSelected) {
        g0.p(data, "data");
        g0.p(onSelected, "onSelected");
        this.f92240a = data;
        this.f92241b = orderType;
        this.f92242c = onSelected;
    }

    public static final void h(c cVar, int i11, View view) {
        cVar.f92242c.invoke(cVar.f92240a.get(i11));
    }

    @k
    public final List<OrderType> c() {
        return this.f92240a;
    }

    @l
    public final OrderType d() {
        return this.f92241b;
    }

    @k
    public final x00.l<OrderType, g2> f() {
        return this.f92242c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k a holder, final int i11) {
        g0.p(holder, "holder");
        qh a11 = holder.a();
        a11.f56511b.setText(this.f92240a.get(i11).getOrderName());
        ImageView ivSelected = a11.f56510a;
        g0.o(ivSelected, "ivSelected");
        q.z(ivSelected, this.f92240a.get(i11) == this.f92241b);
        a11.getRoot().setOnClickListener(new View.OnClickListener() { // from class: uj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.h(c.this, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92240a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        qh e11 = qh.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new a(this, e11);
    }
}
